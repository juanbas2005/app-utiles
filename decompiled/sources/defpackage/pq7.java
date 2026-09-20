package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pq7 extends nq7 {
    public final Class k;
    public final Constructor l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final Method q;

    public pq7() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = w(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = x(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.k = cls;
        this.l = constructor;
        this.m = method4;
        this.n = method3;
        this.o = method2;
        this.p = method;
        this.q = method5;
    }

    public static Method w(Class cls) {
        Class<AssetManager> cls2 = AssetManager.class;
        Class<String> cls3 = String.class;
        Class cls4 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{cls2, cls3, cls4, Boolean.TYPE, cls4, cls4, cls4, FontVariationAxis[].class});
    }

    public final Typeface d(Context context, sl2 sl2, Resources resources, int i) {
        Object obj;
        Method method = this.m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, sl2, resources, i);
        }
        try {
            obj = this.l.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            tl2[] tl2Arr = sl2.a;
            int length = tl2Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    tl2 tl2 = tl2Arr[i2];
                    String str = tl2.a;
                    int i3 = tl2.e;
                    int i4 = tl2.b;
                    boolean z = tl2.c;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(tl2.d);
                    pq7 pq7 = this;
                    Context context2 = context;
                    if (!pq7.t(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        try {
                            pq7.p.invoke(obj, (Object[]) null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    } else {
                        i2++;
                        this = pq7;
                        context = context2;
                    }
                } else {
                    pq7 pq72 = this;
                    if (pq72.v(obj)) {
                        return pq72.u(obj);
                    }
                }
            }
        }
        return null;
    }

    public final Typeface e(Context context, dm2[] dm2Arr, int i) {
        Object obj;
        Typeface u;
        boolean z;
        if (dm2Arr.length >= 1) {
            Method method = this.m;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (dm2 dm2 : dm2Arr) {
                    if (dm2.f == 0) {
                        Uri uri = dm2.a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, b35.w(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                try {
                    obj = this.l.newInstance((Object[]) null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    obj = null;
                }
                if (obj != null) {
                    int length = dm2Arr.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        Method method2 = this.p;
                        if (i2 < length) {
                            dm2 dm22 = dm2Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(dm22.a);
                            if (byteBuffer != null) {
                                try {
                                    z = ((Boolean) this.n.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(dm22.b), null, Integer.valueOf(dm22.c), Integer.valueOf(dm22.d ? 1 : 0)})).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    z = false;
                                }
                                if (!z) {
                                    try {
                                        method2.invoke(obj, (Object[]) null);
                                        break;
                                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    }
                                } else {
                                    z2 = true;
                                }
                            }
                            i2++;
                        } else if (!z2) {
                            method2.invoke(obj, (Object[]) null);
                        } else if (v(obj) && (u = u(obj)) != null) {
                            return Typeface.create(u, i);
                        }
                    }
                }
            } else {
                dm2 j = a35.j(dm2Arr, i);
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(j.a, "r", (CancellationSignal) null);
                if (openFileDescriptor != null) {
                    try {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(j.c).setItalic(j.d).build();
                        openFileDescriptor.close();
                        return build;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            }
        }
        return null;
        throw th;
    }

    public final Typeface g(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, resources, i, str, i2);
        }
        try {
            obj = this.l.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!t(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
                try {
                    this.p.invoke(obj, (Object[]) null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (v(obj)) {
                return u(obj);
            }
        }
        return null;
    }

    public final boolean t(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.m.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface u(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.q.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean v(Object obj) {
        try {
            return ((Boolean) this.o.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method x(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
