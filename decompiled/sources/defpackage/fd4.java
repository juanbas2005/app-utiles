package defpackage;

import java.util.LinkedHashMap;

/* renamed from: fd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fd4 extends dd4 implements gh4 {
    public final xz4 O;
    public long P = 0;
    public LinkedHashMap Q;
    public final gd4 R = new gd4(this);
    public mh4 S;
    public final hp4 T;

    public fd4(xz4 xz4) {
        this.O = xz4;
        hp4 hp4 = v25.a;
        this.T = new hp4();
    }

    public static final void R0(fd4 fd4, mh4 mh4) {
        LinkedHashMap linkedHashMap;
        if (mh4 != null) {
            int e = mh4.e();
            fd4.i0((((long) mh4.c()) & 4294967295L) | (((long) e) << 32));
        } else {
            fd4.i0(0);
        }
        if (!sg3.e(fd4.S, mh4) && mh4 != null && ((((linkedHashMap = fd4.Q) != null && !linkedHashMap.isEmpty()) || !mh4.a().isEmpty()) && !sg3.e(mh4.a(), fd4.Q))) {
            jd4 jd4 = fd4.O.O.b0.q;
            jd4.getClass();
            jd4.N.f();
            LinkedHashMap linkedHashMap2 = fd4.Q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                fd4.Q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(mh4.a());
        }
        fd4.S = mh4;
    }

    public final Object B() {
        return this.O.B();
    }

    public final dy3 B0() {
        return this.R;
    }

    public final boolean D0() {
        if (this.S != null) {
            return true;
        }
        return false;
    }

    public final uy3 G0() {
        return this.O.O;
    }

    public final mh4 J0() {
        mh4 mh4 = this.S;
        if (mh4 != null) {
            return mh4;
        }
        throw b81.t("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public final dd4 K0() {
        xz4 xz4 = this.O.Q;
        if (xz4 != null) {
            return xz4.a1();
        }
        return null;
    }

    public final long L0() {
        return this.P;
    }

    public final void P0() {
        h0(this.P, 0.0f, (vr2) null);
    }

    public void S0() {
        J0().b();
    }

    public final void T0(long j) {
        if (!oe3.a(this.P, j)) {
            this.P = j;
            xz4 xz4 = this.O;
            jd4 jd4 = xz4.O.b0.q;
            if (jd4 != null) {
                jd4.u0();
            }
            dd4.N0(xz4);
        }
        if (!this.K) {
            u0(J0());
        }
    }

    public final long U0(fd4 fd4, boolean z) {
        long j = 0;
        while (!this.equals(fd4)) {
            if (!this.H || !z) {
                j = oe3.c(j, this.P);
            }
            xz4 xz4 = this.O.Q;
            xz4.getClass();
            this = xz4.a1();
            this.getClass();
        }
        return j;
    }

    public final float Y() {
        return this.O.Y();
    }

    public final boolean a0() {
        return true;
    }

    public final float b() {
        return this.O.b();
    }

    public final ey3 getLayoutDirection() {
        return this.O.O.U;
    }

    public final void h0(long j, float f, vr2 vr2) {
        T0(j);
        if (!this.J) {
            S0();
        }
    }

    public final dd4 x0() {
        xz4 xz4 = this.O.P;
        if (xz4 != null) {
            return xz4.a1();
        }
        return null;
    }
}
