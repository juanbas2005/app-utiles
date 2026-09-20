package defpackage;

import android.os.Build;

/* renamed from: jy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy4 extends p50 {
    public static final String c = bc4.p("NetworkMeteredCtrlr");
    public final int b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy4(xy4 xy4) {
        super(xy4);
        xy4.getClass();
    }

    public final boolean c(be8 be8) {
        be8.getClass();
        if (be8.j.a == yy4.A) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(Object obj) {
        vy4 vy4 = (vy4) obj;
        vy4.getClass();
        boolean z = vy4.e;
        boolean z2 = vy4.a;
        if (Build.VERSION.SDK_INT < 26) {
            bc4.k().e(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (!z2 || z) {
                return true;
            }
            return false;
        } else if (!z2 || !vy4.c || z) {
            return true;
        } else {
            return false;
        }
    }
}
