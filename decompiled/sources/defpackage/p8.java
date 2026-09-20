package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: p8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class p8 {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054 A[SYNTHETIC, Splitter:B:26:0x0054] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method method;
        Class cls2;
        Method method2;
        Class cls3;
        Class<Activity> cls4 = Activity.class;
        Method method3 = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            field = cls4.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        b = field;
        try {
            field2 = cls4.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        c = field2;
        Class cls5 = a;
        Class cls6 = Boolean.TYPE;
        Class<IBinder> cls7 = IBinder.class;
        if (cls5 != null) {
            try {
                method = cls5.getDeclaredMethod("performStopActivity", new Class[]{cls7, cls6, String.class});
                method.setAccessible(true);
            } catch (Throwable unused4) {
            }
            d = method;
            cls2 = a;
            if (cls2 != null) {
                try {
                    method2 = cls2.getDeclaredMethod("performStopActivity", new Class[]{cls7, cls6});
                    method2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                e = method2;
                cls3 = a;
                int i = Build.VERSION.SDK_INT;
                if ((i == 26 || i == 27) && cls3 != null) {
                    Class<IBinder> cls8 = IBinder.class;
                    Class<List> cls9 = List.class;
                    Class<List> cls10 = List.class;
                    Class cls11 = Integer.TYPE;
                    Class cls12 = Boolean.TYPE;
                    Method declaredMethod = cls3.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls8, cls9, cls10, cls11, cls12, Configuration.class, Configuration.class, cls12, cls12});
                    declaredMethod.setAccessible(true);
                    method3 = declaredMethod;
                }
                f = method3;
            }
            method2 = null;
            e = method2;
            cls3 = a;
            int i2 = Build.VERSION.SDK_INT;
            Class<IBinder> cls82 = IBinder.class;
            Class<List> cls92 = List.class;
            Class<List> cls102 = List.class;
            Class cls112 = Integer.TYPE;
            Class cls122 = Boolean.TYPE;
            Method declaredMethod2 = cls3.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls82, cls92, cls102, cls112, cls122, Configuration.class, Configuration.class, cls122, cls122});
            declaredMethod2.setAccessible(true);
            method3 = declaredMethod2;
            f = method3;
        }
        method = null;
        d = method;
        cls2 = a;
        if (cls2 != null) {
        }
        method2 = null;
        e = method2;
        cls3 = a;
        int i22 = Build.VERSION.SDK_INT;
        Class<IBinder> cls822 = IBinder.class;
        Class<List> cls922 = List.class;
        Class<List> cls1022 = List.class;
        try {
            Class cls1122 = Integer.TYPE;
            Class cls1222 = Boolean.TYPE;
            Method declaredMethod22 = cls3.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls822, cls922, cls1022, cls1122, cls1222, Configuration.class, Configuration.class, cls1222, cls1222});
            declaredMethod22.setAccessible(true);
            method3 = declaredMethod22;
        } catch (Throwable unused6) {
        }
        f = method3;
    }
}
