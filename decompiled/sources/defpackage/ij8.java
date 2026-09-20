package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* renamed from: ij8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ij8 extends ej8 {
    public static final n63 b = new n63(15);

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", (Class[]) null);
            hj8.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
