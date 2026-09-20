package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class nq7 extends a35 {
    public static Class f = null;
    public static Constructor g = null;
    public static Method h = null;
    public static Method i = null;
    public static boolean j = false;

    public static boolean r(Object obj, String str, int i2, boolean z) {
        s();
        try {
            return ((Boolean) h.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            rf2.o(e);
            return false;
        }
    }

    public static void s() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!j) {
            j = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            g = constructor;
            f = cls;
            h = method;
            i = method2;
        }
    }

    public Typeface d(Context context, sl2 sl2, Resources resources, int i2) {
        s();
        try {
            Object newInstance = g.newInstance((Object[]) null);
            tl2[] tl2Arr = sl2.a;
            int length = tl2Arr.length;
            int i3 = 0;
            while (i3 < length) {
                tl2 tl2 = tl2Arr[i3];
                File s = b35.s(context);
                if (s == null) {
                    return null;
                }
                try {
                    if (!b35.h(s, resources, tl2.f)) {
                        s.delete();
                        return null;
                    } else if (!r(newInstance, s.getPath(), tl2.b, tl2.c)) {
                        return null;
                    } else {
                        s.delete();
                        i3++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    s.delete();
                }
            }
            s();
            try {
                Object newInstance2 = Array.newInstance(f, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) i.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                rf2.o(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            rf2.o(e2);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0072 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[SYNTHETIC, Splitter:B:17:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c A[SYNTHETIC, Splitter:B:32:0x006c] */
    public Typeface e(Context context, dm2[] dm2Arr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        File file;
        FileInputStream fileInputStream;
        File s;
        Typeface typeface;
        if (dm2Arr.length >= 1) {
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a35.j(dm2Arr, i2).a, "r", (CancellationSignal) null);
                if (openFileDescriptor != null) {
                    try {
                        String readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null) {
                                if (file.canRead()) {
                                    Typeface createFromFile = Typeface.createFromFile(file);
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                            }
                            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            s = b35.s(context);
                            if (s != null) {
                                if (b35.i(s, fileInputStream)) {
                                    typeface = Typeface.createFromFile(s.getPath());
                                    s.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return typeface;
                                }
                                s.delete();
                            }
                            typeface = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return typeface;
                        }
                    } catch (ErrnoException unused) {
                    }
                    file = null;
                    if (file != null) {
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        s = b35.s(context);
                        if (s != null) {
                        }
                    } catch (RuntimeException ) {
                        s.delete();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    typeface = null;
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return typeface;
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return null;
        throw th;
    }
}
