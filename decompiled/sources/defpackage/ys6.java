package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: ys6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ys6 {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                invoke.getClass();
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int a = a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            return 0;
        }
        return a;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        a42 a42 = a42.w;
        sidecarWindowLayoutInfo.getClass();
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return a42;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                invoke.getClass();
                return (List) invoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }
}
