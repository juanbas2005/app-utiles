package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: kp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kp5 {
    public static final String a = bc4.p("ProcessUtils");

    public static final boolean a(Context context, f01 f01) {
        String str;
        T t;
        context.getClass();
        f01.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            str = bn.h();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, nd8.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class[]) null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, (Object[]) null);
                invoke.getClass();
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                bc4.k().g(a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) t).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return sg3.e(str, context.getApplicationInfo().processName);
    }
}
