package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: oq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oq7 extends a35 {
    public static final Class f;
    public static final Constructor g;
    public static final Method h;
    public static final Method i;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            Constructor<?> constructor3 = constructor2;
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        g = constructor;
        f = cls;
        h = method;
        i = method2;
    }

    public static boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) h.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface s(Object obj) {
        try {
            Object newInstance = Array.newInstance(f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) i.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Typeface d(Context context, sl2 sl2, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            obj = g.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (tl2 tl2 : sl2.a) {
                int i3 = tl2.f;
                File s = b35.s(context);
                if (s == null) {
                    Resources resources2 = resources;
                } else {
                    try {
                        if (b35.h(s, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(s);
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                                fileInputStream.close();
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            s.delete();
                            if (mappedByteBuffer != null && r(obj, mappedByteBuffer, tl2.e, tl2.b, tl2.c)) {
                            }
                        }
                    } finally {
                        s.delete();
                    }
                }
                mappedByteBuffer = null;
            }
            return s(obj);
        }
        return null;
        throw th;
    }

    public final Typeface e(Context context, dm2[] dm2Arr, int i2) {
        Object obj;
        try {
            obj = g.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i3 = 0;
            zt6 zt6 = new zt6(0);
            int length = dm2Arr.length;
            while (true) {
                if (i3 < length) {
                    dm2 dm2 = dm2Arr[i3];
                    Uri uri = dm2.a;
                    ByteBuffer byteBuffer = (ByteBuffer) zt6.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = b35.w(context, uri);
                        zt6.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !r(obj, byteBuffer, dm2.b, dm2.c, dm2.d)) {
                        break;
                    }
                    i3++;
                } else {
                    Typeface s = s(obj);
                    if (s != null) {
                        return Typeface.create(s, i2);
                    }
                }
            }
        }
        return null;
    }
}
