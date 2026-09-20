package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: yd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yd8 {
    public static final Method a;
    public static final Method b;
    public static Boolean c = null;

    static {
        Method method;
        Method method2;
        Class<String> cls = String.class;
        Class cls2 = Integer.TYPE;
        Class<WorkSource> cls3 = WorkSource.class;
        Process.myUid();
        try {
            method = cls3.getMethod("add", new Class[]{cls2});
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = cls3.getMethod("add", new Class[]{cls2, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            cls3.getMethod("size", (Class[]) null);
        } catch (Exception unused3) {
        }
        try {
            cls3.getMethod("get", new Class[]{cls2});
        } catch (Exception unused4) {
        }
        try {
            cls3.getMethod("getName", new Class[]{cls2});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls3.getMethod("createWorkChain", (Class[]) null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{cls2, cls});
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls3.getMethod("isEmpty", (Class[]) null).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }
}
