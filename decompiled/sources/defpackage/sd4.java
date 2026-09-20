package defpackage;

import android.os.Build;

/* renamed from: sd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sd4 {
    public static final nk6 a = new nk6("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
