package defpackage;

/* renamed from: xb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xb5 extends ll4 implements my3, gz1 {
    public vb5 K;
    public boolean L;
    public jb M;
    public j51 N;
    public float O;
    public lt0 P;

    public static boolean W0(long j) {
        if (wu6.a(j, 9205357640488583168L) || (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        return true;
    }

    public static boolean X0(long j) {
        if (wu6.a(j, 9205357640488583168L) || (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        return true;
    }

    public final boolean K0() {
        return false;
    }

    public final boolean V0() {
        if (!this.L || this.K.i() == 9205357640488583168L) {
            return false;
        }
        return true;
    }

    public final long Y0(long j) {
        boolean z;
        int i;
        int i2;
        float f;
        float f2;
        boolean z2 = false;
        if (!k31.d(j) || !k31.c(j)) {
            z = false;
        } else {
            z = true;
        }
        if (k31.f(j) && k31.e(j)) {
            z2 = true;
        }
        if ((V0() || !z) && !z2) {
            long j2 = j;
            long i3 = this.K.i();
            if (X0(i3)) {
                i = Math.round(Float.intBitsToFloat((int) (i3 >> 32)));
            } else {
                i = k31.j(j2);
            }
            if (W0(i3)) {
                i2 = Math.round(Float.intBitsToFloat((int) (i3 & 4294967295L)));
            } else {
                i2 = k31.i(j2);
            }
            long floatToRawIntBits = (((long) Float.floatToRawIntBits((float) m31.f(j2, i2))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) m31.g(j2, i))) << 32);
            if (V0()) {
                if (!X0(this.K.i())) {
                    f = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else {
                    f = Float.intBitsToFloat((int) (this.K.i() >> 32));
                }
                if (!W0(this.K.i())) {
                    f2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                } else {
                    f2 = Float.intBitsToFloat((int) (this.K.i() & 4294967295L));
                }
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                    floatToRawIntBits = 0;
                } else {
                    floatToRawIntBits = ya5.w(floatToRawIntBits2, this.N.c(floatToRawIntBits2, floatToRawIntBits));
                }
            }
            return k31.a(j2, m31.g(j2, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, m31.f(j2, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
        }
        return k31.a(j, k31.h(j), 0, k31.g(j), 0, 10);
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        if (!V0()) {
            return gh4.c(i);
        }
        long Y0 = Y0(m31.b(0, i, 0, 0, 13));
        return Math.max(k31.i(Y0), gh4.c(i));
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(Y0(j));
        return oh4.d0(y.w, y.x, b42.w, new wd(y, 5));
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        if (!V0()) {
            return gh4.v(i);
        }
        long Y0 = Y0(m31.b(0, 0, 0, i, 7));
        return Math.max(k31.j(Y0), gh4.v(i));
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        if (!V0()) {
            return gh4.W(i);
        }
        long Y0 = Y0(m31.b(0, i, 0, 0, 13));
        return Math.max(k31.i(Y0), gh4.W(i));
    }

    /* JADX INFO: finally extract failed */
    public final void p0(wy3 wy3) {
        float f;
        float f2;
        long j;
        wy3 wy32 = wy3;
        tk0 tk0 = wy32.w;
        long i = this.K.i();
        if (X0(i)) {
            f = Float.intBitsToFloat((int) (i >> 32));
        } else {
            f = Float.intBitsToFloat((int) (tk0.e() >> 32));
        }
        if (W0(i)) {
            f2 = Float.intBitsToFloat((int) (i & 4294967295L));
        } else {
            f2 = Float.intBitsToFloat((int) (tk0.e() & 4294967295L));
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (Float.intBitsToFloat((int) (tk0.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (tk0.e() & 4294967295L)) == 0.0f) {
            j = 0;
        } else {
            j = ya5.w(floatToRawIntBits, this.N.c(floatToRawIntBits, tk0.e()));
        }
        long a = this.M.a((((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (tk0.e() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (tk0.e() & 4294967295L)))) & 4294967295L), wy32.getLayoutDirection());
        float f3 = (float) ((int) (a >> 32));
        float f4 = (float) ((int) (a & 4294967295L));
        ((ji8) tk0.x.x).F(f3, f4);
        try {
            vb5 vb5 = this.K;
            vb5 vb52 = vb5;
            vb52.g(wy32, j, this.O, this.P);
            ((ji8) tk0.x.x).F(-f3, -f4);
            wy3.a();
        } catch (Throwable th) {
            ((ji8) tk0.x.x).F(-f3, -f4);
            throw th;
        }
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        if (!V0()) {
            return gh4.l(i);
        }
        long Y0 = Y0(m31.b(0, 0, 0, i, 7));
        return Math.max(k31.j(Y0), gh4.l(i));
    }

    public final String toString() {
        vb5 vb5 = this.K;
        boolean z = this.L;
        jb jbVar = this.M;
        float f = this.O;
        lt0 lt0 = this.P;
        return "PainterModifier(painter=" + vb5 + ", sizeToIntrinsics=" + z + ", alignment=" + jbVar + ", alpha=" + f + ", colorFilter=" + lt0 + ")";
    }
}
