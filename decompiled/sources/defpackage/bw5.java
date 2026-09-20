package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: bw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bw5 {
    public final b01 a;
    public final double b;
    public final double c;
    public final aw5 d = null;
    public final aw5 e = null;

    public bw5(Context context, zv5 zv5) {
        boolean z;
        zv5 zv52 = zv5;
        g22 g22 = new g22(23);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        b01 e2 = b01.e();
        boolean z2 = false;
        if (0.0d > nextDouble || nextDouble >= 1.0d) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
                z2 = true;
            }
            if (z2) {
                this.b = nextDouble;
                this.c = nextDouble2;
                this.a = e2;
                this.d = new aw5(zv52, g22, e2, "Trace");
                this.e = new aw5(zv52, g22, e2, "Network");
                jb5.u(context);
                return;
            }
            h.q("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        h.q("Sampling bucket ID should be in range [0.0, 1.0).");
        throw null;
    }

    public static boolean a(pf3 pf3) {
        if (pf3.size() <= 0 || ((rf5) pf3.get(0)).v() <= 0 || ((rf5) pf3.get(0)).u() != 2) {
            return false;
        }
        return true;
    }
}
