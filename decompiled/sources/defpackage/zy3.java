package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: zy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zy3 implements q67, oh4 {
    public final /* synthetic */ cz3 w;
    public final /* synthetic */ iz3 x;

    public zy3(iz3 iz3) {
        this.x = iz3;
        this.w = iz3.D;
    }

    public final long A0(long j) {
        return this.w.A0(j);
    }

    public final float C0(long j) {
        return this.w.C0(j);
    }

    public final mh4 E(int i, int i2, pb pbVar, z0 z0Var, Map map, wd wdVar) {
        return this.w.E(i, i2, pbVar, z0Var, map, wdVar);
    }

    public final long L(float f) {
        return this.w.L(f);
    }

    public final float P(int i) {
        return this.w.P(i);
    }

    public final float S(float f) {
        return f / this.w.b();
    }

    public final float Y() {
        return this.w.y;
    }

    public final boolean a0() {
        return this.w.a0();
    }

    public final float b() {
        return this.w.x;
    }

    public final mh4 d0(int i, int i2, Map map, vr2 vr2) {
        return this.w.u(i, i2, map, (vr2) null, vr2);
    }

    public final float e0(float f) {
        return this.w.b() * f;
    }

    public final ey3 getLayoutDirection() {
        return this.w.w;
    }

    public final int l0(long j) {
        return this.w.l0(j);
    }

    public final long o(float f) {
        return this.w.o(f);
    }

    public final long p(long j) {
        return this.w.p(j);
    }

    public final int r0(float f) {
        return this.w.r0(f);
    }

    public final mh4 u(int i, int i2, Map map, vr2 vr2, vr2 vr22) {
        return this.w.u(i, i2, map, vr2, vr22);
    }

    public final List x(gs2 gs2, Object obj) {
        az3 az3;
        iz3 iz3 = this.x;
        uy3 uy3 = iz3.w;
        tp4 tp4 = iz3.C;
        uy3 uy32 = (uy3) tp4.g(obj);
        if (uy32 != null && ((eq4) ((jp4) uy3.o()).x).i(uy32) < iz3.z) {
            return uy32.m();
        }
        tp4 tp42 = iz3.H;
        tp4 tp43 = iz3.F;
        eq4 eq4 = iz3.I;
        if (eq4.y < iz3.A) {
            yb3.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        uy3 uy33 = (uy3) tp4.g(obj);
        int i = eq4.y;
        int i2 = iz3.A;
        if (i == i2) {
            eq4.b(obj);
        } else {
            Object[] objArr = eq4.w;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        iz3.A++;
        boolean b = tp43.b(obj);
        if (b || uy33 != null) {
            if (!b && uy33 != null) {
                iz3.j(((eq4) ((jp4) uy3.o()).x).i(uy33), ((eq4) ((jp4) uy3.o()).x).y);
                iz3.K++;
                tp4.k(obj);
                tp43.m(obj, uy33);
                tp42.m(obj, iz3.f(obj));
                if (uy3.J()) {
                    iz3.h();
                }
            }
            uy3 uy34 = (uy3) tp43.g(obj);
            ze5 ze5 = null;
            if (uy34 != null) {
                az3 = (az3) iz3.B.g(uy34);
            } else {
                az3 = null;
            }
            if (az3 != null && az3.d) {
                iz3.m(uy34, obj, false, gs2);
            }
            if (az3 != null) {
                ze5 = az3.f;
            }
            if (ze5 != null) {
                iz3.d(az3, true);
            }
        } else {
            iz3.k(obj, gs2, false);
            tp42.m(obj, iz3.f(obj));
        }
        uy3 uy35 = (uy3) tp43.g(obj);
        if (uy35 == null) {
            return a42.w;
        }
        List n0 = uy35.b0.p.n0();
        jp4 jp4 = (jp4) n0;
        int i3 = ((eq4) jp4.x).y;
        for (int i4 = 0; i4 < i3; i4++) {
            ((kh4) jp4.get(i4)).B.b = true;
        }
        return n0;
    }

    public final float z(long j) {
        return this.w.z(j);
    }
}
