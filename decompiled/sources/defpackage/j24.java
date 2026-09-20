package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: j24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j24 implements oh4 {
    public final g24 w;
    public final q67 x;
    public final h24 y;
    public final yo4 z = new yo4();

    public j24(g24 g24, q67 q67) {
        this.w = g24;
        this.x = q67;
        this.y = (h24) g24.b.b();
        ne3.a();
    }

    public final long A0(long j) {
        return this.x.A0(j);
    }

    public final float C0(long j) {
        return this.x.C0(j);
    }

    public final mh4 E(int i, int i2, pb pbVar, z0 z0Var, Map map, wd wdVar) {
        return this.x.E(i, i2, pbVar, z0Var, map, wdVar);
    }

    public final long L(float f) {
        return this.x.L(f);
    }

    public final float P(int i) {
        return this.x.P(i);
    }

    public final float S(float f) {
        return this.x.S(f);
    }

    public final float Y() {
        return this.x.Y();
    }

    public final List a(int i) {
        yo4 yo4 = this.z;
        List list = (List) yo4.b(i);
        if (list != null) {
            return list;
        }
        h24 h24 = this.y;
        Object b = h24.b(i);
        List x2 = this.x.x(this.w.a(i, b, h24.c(i)), b);
        yo4.i(i, x2);
        return x2;
    }

    public final boolean a0() {
        return this.x.a0();
    }

    public final float b() {
        return this.x.b();
    }

    public final mh4 d0(int i, int i2, Map map, vr2 vr2) {
        return this.x.d0(i, i2, map, vr2);
    }

    public final float e0(float f) {
        return this.x.e0(f);
    }

    public final ey3 getLayoutDirection() {
        return this.x.getLayoutDirection();
    }

    public final int l0(long j) {
        return this.x.l0(j);
    }

    public final long o(float f) {
        return this.x.o(f);
    }

    public final long p(long j) {
        return this.x.p(j);
    }

    public final int r0(float f) {
        return this.x.r0(f);
    }

    public final mh4 u(int i, int i2, Map map, vr2 vr2, vr2 vr22) {
        return this.x.u(i, i2, map, vr2, vr22);
    }

    public final float z(long j) {
        return this.x.z(j);
    }
}
