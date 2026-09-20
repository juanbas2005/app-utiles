package defpackage;

import java.util.Map;

/* renamed from: zg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zg3 implements oh4, kg3 {
    public final /* synthetic */ kg3 w;
    public final ey3 x;

    public zg3(kg3 kg3, ey3 ey3) {
        this.w = kg3;
        this.x = ey3;
    }

    public final long A0(long j) {
        return this.w.A0(j);
    }

    public final float C0(long j) {
        return this.w.C0(j);
    }

    public final long L(float f) {
        return this.w.L(f);
    }

    public final float P(int i) {
        return this.w.P(i);
    }

    public final float S(float f) {
        return this.w.S(f);
    }

    public final float Y() {
        return this.w.Y();
    }

    public final boolean a0() {
        return this.w.a0();
    }

    public final float b() {
        return this.w.b();
    }

    public final float e0(float f) {
        return this.w.e0(f);
    }

    public final ey3 getLayoutDirection() {
        return this.x;
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
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (!((i & -16777216) == 0 && (-16777216 & i2) == 0)) {
            yb3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new yg3(i, i2, map, vr2);
    }

    public final float z(long j) {
        return this.w.z(j);
    }
}
