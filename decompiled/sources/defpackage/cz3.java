package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: cz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz3 implements q67 {
    public ey3 w = ey3.x;
    public float x;
    public float y;
    public final /* synthetic */ iz3 z;

    public cz3(iz3 iz3) {
        this.z = iz3;
    }

    public final float Y() {
        return this.y;
    }

    public final boolean a0() {
        qy3 qy3 = this.z.w.b0.d;
        if (qy3 == qy3.z || qy3 == qy3.x) {
            return true;
        }
        return false;
    }

    public final float b() {
        return this.x;
    }

    public final ey3 getLayoutDirection() {
        return this.w;
    }

    public final mh4 u(int i, int i2, Map map, vr2 vr2, vr2 vr22) {
        if (!((i & -16777216) == 0 && (-16777216 & i2) == 0)) {
            yb3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new bz3(i, i2, map, vr2, this, this.z, vr22);
    }

    public final List x(gs2 gs2, Object obj) {
        iz3 iz3 = this.z;
        iz3.h();
        uy3 uy3 = iz3.w;
        qy3 qy3 = uy3.b0.d;
        qy3 qy32 = qy3.y;
        qy3 qy33 = qy3.w;
        if (!(qy3 == qy33 || qy3 == qy32 || qy3 == qy3.x || qy3 == qy3.z)) {
            yb3.b("subcompose can only be used inside the measure or layout blocks");
        }
        tp4 tp4 = iz3.C;
        Object g = tp4.g(obj);
        if (g == null) {
            g = (uy3) iz3.F.k(obj);
            if (g != null) {
                az3 az3 = (az3) iz3.B.g(g);
                if (iz3.K <= 0) {
                    yb3.b("Check failed.");
                }
                iz3.K--;
            } else {
                g = iz3.n(obj);
                if (g == null) {
                    int i = iz3.z;
                    uy3 uy32 = new uy3(2);
                    uy3.L = true;
                    uy3.B(i, uy32);
                    uy3.L = false;
                    g = uy32;
                }
            }
            tp4.m(obj, g);
        }
        uy3 uy33 = (uy3) g;
        if (dt0.z0(iz3.z, uy3.o()) != uy33) {
            int i2 = ((eq4) ((jp4) uy3.o()).x).i(uy33);
            if (i2 < iz3.z) {
                yb3.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = iz3.z;
            if (i3 != i2) {
                iz3.j(i2, i3);
            }
        }
        iz3.z++;
        iz3.m(uy33, obj, false, gs2);
        if (qy3 == qy33 || qy3 == qy32) {
            return uy33.m();
        }
        return uy33.l();
    }
}
