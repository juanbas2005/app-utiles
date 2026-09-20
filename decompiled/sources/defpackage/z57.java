package defpackage;

/* renamed from: z57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z57 {
    public kc0 A;
    public long B;
    public kc0 C;
    public boolean D;
    public pq6 E;
    public Object F;
    public Object G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public lt0 T;
    public long U;
    public kc0 V;
    public jg7 W;
    public mf7 X;
    public long Y;
    public long Z;
    public long a;
    public long a0;
    public int b;
    public float b0;
    public float c;
    public int c0;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public long x = jt0.b;
    public kc0 y;
    public long z = jt0.f;

    public z57() {
        long j2 = jt0.g;
        this.B = j2;
        this.E = gr8.h;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        long j3 = ql7.b;
        this.P = Float.intBitsToFloat((int) (j3 >> 32));
        this.Q = Float.intBitsToFloat((int) (j3 & 4294967295L));
        this.R = 1.0f;
        this.U = j2;
        this.W = jg7.c;
        long j4 = wg7.c;
        this.Y = j4;
        this.Z = j4;
        this.a0 = j4;
        this.b0 = Float.NaN;
    }

    public final void A(int i2) {
        this.a |= 4398046511104L;
        this.c0 = ((i2 << 4) & 112) | (this.c0 & -113);
    }

    public final void a(kc0 kc0) {
        int i2;
        this.a &= -17179869185L;
        int i3 = this.b;
        if (kc0 != null) {
            i2 = i3 | 2;
        } else {
            i2 = i3 & -3;
        }
        this.b = i2;
        this.A = kc0;
        int i4 = jt0.h;
        this.z = jt0.g;
    }

    public final void b(long j2) {
        this.a |= 17179869184L;
        this.b &= -3;
        this.z = j2;
        this.A = null;
    }

    public final void c(kc0 kc0) {
        int i2;
        this.a &= -34359738369L;
        int i3 = this.b;
        if (kc0 != null) {
            i2 = i3 | 1;
        } else {
            i2 = i3 & -2;
        }
        this.b = i2;
        this.y = kc0;
        int i4 = jt0.h;
        this.x = jt0.g;
    }

    public final void d(long j2) {
        this.a |= 34359738368L;
        this.b &= -2;
        this.x = j2;
        this.y = null;
    }

    public final void e(kc0 kc0) {
        int i2;
        this.a &= -137438953473L;
        int i3 = this.b;
        if (kc0 != null) {
            i2 = i3 | 128;
        } else {
            i2 = i3 & -129;
        }
        this.b = i2;
        this.V = kc0;
        int i4 = jt0.h;
        this.U = jt0.g;
    }

    public final void f(z57 z57) {
        z57.a = this.a;
        z57.b = this.b;
        z57.p = this.p;
        z57.q = this.q;
        z57.r = this.r;
        z57.s = this.s;
        z57.t = this.t;
        z57.u = this.u;
        z57.v = this.v;
        z57.w = this.w;
        z57.c = this.c;
        z57.d = this.d;
        z57.e = this.e;
        z57.f = this.f;
        z57.g = this.g;
        z57.h = this.h;
        z57.i = this.i;
        z57.j = this.j;
        z57.k = this.k;
        z57.E = this.E;
        z57.H = this.H;
        z57.I = this.I;
        z57.J = this.J;
        z57.K = this.K;
        z57.L = this.L;
        z57.M = this.M;
        z57.N = this.N;
        z57.O = this.O;
        z57.P = this.P;
        z57.Q = this.Q;
        z57.S = this.S;
        z57.T = this.T;
        z57.R = this.R;
        z57.x = this.x;
        z57.y = this.y;
        z57.z = this.z;
        z57.A = this.A;
        z57.B = this.B;
        z57.C = this.C;
        z57.F = this.F;
        z57.G = this.G;
        z57.D = this.D;
        z57.l = this.l;
        z57.m = this.m;
        z57.n = this.n;
        z57.o = this.o;
        z57.U = this.U;
        z57.V = this.V;
        z57.W = this.W;
        z57.X = this.X;
        z57.Y = this.Y;
        z57.Z = this.Z;
        z57.a0 = this.a0;
        z57.b0 = this.b0;
        z57.c0 = this.c0;
    }

    public final void g(z57 z57, long j2, int i2) {
        int i3;
        int i4;
        long j3 = j2 & this.a;
        if (j3 != 0) {
            if ((j3 & 8192) != 0) {
                float f2 = this.p;
                z57.a = 8192 | z57.a;
                z57.p = f2;
            }
            if ((j3 & 16384) != 0) {
                float f3 = this.q;
                z57.a = 16384 | z57.a;
                z57.q = f3;
            }
            if ((j3 & 32768) != 0) {
                float f4 = this.r;
                z57.a = 32768 | z57.a;
                z57.r = f4;
            }
            if ((j3 & 65536) != 0) {
                float f5 = this.s;
                z57.a = 65536 | z57.a;
                z57.s = f5;
            }
            if ((j3 & 262144) != 0) {
                float f6 = this.t;
                z57.a = 262144 | z57.a;
                z57.t = f6;
            }
            if ((j3 & 1048576) != 0) {
                float f7 = this.u;
                z57.a = 1048576 | z57.a;
                z57.u = f7;
            }
            if ((j3 & 131072) != 0) {
                float f8 = this.v;
                z57.a = 131072 | z57.a;
                z57.v = f8;
            }
            if ((j3 & 524288) != 0) {
                float f9 = this.w;
                z57.a = 524288 | z57.a;
                z57.w = f9;
            }
            if ((j3 & 1) != 0) {
                float f10 = this.c;
                z57.a = 1 | z57.a;
                z57.c = f10;
            }
            if ((j3 & 2) != 0) {
                float f11 = this.d;
                z57.a = 2 | z57.a;
                z57.d = f11;
            }
            if ((j3 & 4) != 0) {
                float f12 = this.e;
                z57.a = 4 | z57.a;
                z57.e = f12;
            }
            if ((j3 & 8) != 0) {
                float f13 = this.f;
                z57.a = 8 | z57.a;
                z57.f = f13;
            }
            if ((j3 & 16) != 0) {
                float f14 = this.g;
                z57.a = 16 | z57.a;
                z57.g = f14;
            }
            if ((j3 & 32) != 0) {
                float f15 = this.h;
                z57.a = 32 | z57.a;
                z57.h = f15;
            }
            if ((j3 & 64) != 0) {
                float f16 = this.i;
                z57.a = 64 | z57.a;
                z57.i = f16;
            }
            if ((j3 & 128) != 0) {
                float f17 = this.j;
                z57.a = 128 | z57.a;
                z57.j = f17;
            }
            if ((j3 & 256) != 0) {
                float f18 = this.k;
                z57.a = 256 | z57.a;
                z57.k = f18;
            }
            if ((j3 & 2097152) != 0) {
                float f19 = this.H;
                z57.a = 2097152 | z57.a;
                z57.H = f19;
            }
            if ((j3 & 4194304) != 0) {
                float f20 = this.I;
                z57.a = 4194304 | z57.a;
                z57.I = f20;
            }
            if ((j3 & 8388608) != 0) {
                float f21 = this.J;
                z57.a = 8388608 | z57.a;
                z57.J = f21;
            }
            if ((j3 & 16777216) != 0) {
                float f22 = this.K;
                z57.a = 16777216 | z57.a;
                z57.K = f22;
            }
            if ((j3 & 33554432) != 0) {
                float f23 = this.L;
                z57.a = 33554432 | z57.a;
                z57.L = f23;
            }
            if ((j3 & 67108864) != 0) {
                float f24 = this.M;
                z57.a = 67108864 | z57.a;
                z57.M = f24;
            }
            if ((j3 & 134217728) != 0) {
                float f25 = this.N;
                z57.a = 134217728 | z57.a;
                z57.N = f25;
            }
            if ((j3 & 268435456) != 0) {
                float f26 = this.O;
                z57.a = 268435456 | z57.a;
                z57.O = f26;
            }
            if ((j3 & 536870912) != 0) {
                float f27 = this.P;
                z57.a = 536870912 | z57.a;
                z57.P = f27;
            }
            if ((j3 & 1073741824) != 0) {
                float f28 = this.Q;
                z57.a = 1073741824 | z57.a;
                z57.Q = f28;
            }
            if ((j3 & 4294967296L) != 0) {
                float f29 = this.S;
                z57.a = 4294967296L | z57.a;
                z57.S = f29;
            }
            if ((j3 & 8589934592L) != 0) {
                float f30 = this.R;
                z57.a = 8589934592L | z57.a;
                z57.R = f30;
            }
            if ((34359738368L & j3) != 0) {
                z57.d(this.x);
            }
            if ((17179869184L & j3) != 0) {
                z57.b(this.z);
            }
            if ((j3 & 68719476736L) != 0) {
                long j4 = this.B;
                z57.a = 68719476736L | z57.a;
                z57.b &= -5;
                z57.B = j4;
                z57.C = null;
            }
            if ((j3 & 2147483648L) != 0) {
                boolean z2 = this.D;
                z57.a = 2147483648L | z57.a;
                z57.D = z2;
            }
            if ((j3 & 512) != 0) {
                float f31 = this.l;
                z57.a = (512 | z57.a) & -2049;
                z57.l = f31;
                z57.n = Float.NaN;
            }
            if ((j3 & 1024) != 0) {
                float f32 = this.m;
                z57.a = (1024 | z57.a) & -4097;
                z57.m = f32;
                z57.o = Float.NaN;
            }
            if ((j3 & 2048) != 0) {
                float f33 = this.n;
                z57.a = 2048 | (z57.a & -513);
                z57.n = f33;
                z57.l = Float.NaN;
            }
            if ((j3 & 4096) != 0) {
                float f34 = this.o;
                z57.a = 4096 | (z57.a & -1025);
                z57.o = f34;
                z57.m = Float.NaN;
            }
            if ((j3 & 137438953472L) != 0) {
                long j5 = this.U;
                z57.a = 137438953472L | z57.a;
                z57.b &= -129;
                z57.U = j5;
                z57.V = null;
            }
            if ((j3 & 140737488355328L) != 0) {
                long j6 = this.Z;
                z57.a = 140737488355328L | z57.a;
                z57.Z = j6;
            }
            if ((j3 & 281474976710656L) != 0) {
                long j7 = this.a0;
                z57.a = 281474976710656L | z57.a;
                z57.a0 = j7;
            }
            if ((j3 & 8796093022208L) != 0) {
                float f35 = this.b0;
                z57.a = 8796093022208L | z57.a;
                z57.b0 = f35;
            }
            if ((j3 & 562949953421312L) != 0) {
                z57.a = 562949953421312L | z57.a;
            }
            if ((131666517426176L & j3) != 0) {
                if ((274877906944L & j3) != 0) {
                    z57.z(t());
                }
                if ((j3 & 70368744177664L) != 0) {
                    long j8 = this.Y;
                    z57.a = 70368744177664L | z57.a;
                    z57.Y = j8;
                }
                if ((2199023255552L & j3) != 0) {
                    z57.y(s());
                }
                if ((4398046511104L & j3) != 0) {
                    z57.A(u());
                }
                if ((17592186044416L & j3) != 0) {
                    z57.x(q());
                }
                if ((35184372088832L & j3) != 0) {
                    z57.k(o());
                }
                if ((549755813888L & j3) != 0) {
                    z57.l(p());
                }
                if ((j3 & 1099511627776L) != 0) {
                    z57.j(n());
                }
            }
        }
        int i5 = this.b & i2;
        if (i5 != 0) {
            if ((i5 & 8) != 0) {
                pq6 pq6 = this.E;
                z57.b |= 8;
                z57.E = pq6;
            }
            if ((i5 & 16) != 0) {
                lt0 lt0 = this.T;
                z57.b |= 16;
                z57.T = lt0;
            }
            if ((i5 & 1) != 0) {
                z57.c(this.y);
            }
            if ((i5 & 2) != 0) {
                z57.a(this.A);
            }
            if ((i5 & 4) != 0) {
                z57.m(this.C);
            }
            if ((i5 & 32) != 0) {
                Object obj = this.F;
                int i6 = z57.b;
                if (obj != null) {
                    i4 = i6 | 32;
                } else {
                    i4 = i6 & -33;
                }
                z57.b = i4;
                z57.F = obj;
            }
            if ((i5 & 64) != 0) {
                Object obj2 = this.G;
                int i7 = z57.b;
                if (obj2 != null) {
                    i3 = i7 | 64;
                } else {
                    i3 = i7 & -65;
                }
                z57.b = i3;
                z57.G = obj2;
            }
            if ((i5 & 128) != 0) {
                z57.e(this.V);
            }
            if ((i5 & 256) != 0) {
                z57.b |= 256;
            }
            if ((i5 & 512) != 0) {
                jg7 jg7 = this.W;
                z57.b |= 512;
                z57.W = jg7;
            }
            if ((i5 & 1024) != 0) {
                mf7 mf7 = this.X;
                mf7.getClass();
                z57.b |= 1024;
                z57.X = mf7;
            }
        }
    }

    public final int h(int i2, z57 z57) {
        int i3 = this.b;
        int i4 = z57.b;
        int i5 = i3 & i4 & i2;
        int i6 = i2 & (i3 ^ i4);
        if (i5 == 0) {
            return i6;
        }
        if ((i5 & 1) != 0 && sg3.e(this.y, z57.y)) {
            i5 &= -2;
        }
        if ((i5 & 2) != 0 && sg3.e(this.A, z57.A)) {
            i5 &= -3;
        }
        if ((i5 & 4) != 0 && sg3.e(this.C, z57.C)) {
            i5 &= -5;
        }
        if ((i5 & 8) != 0 && sg3.e(this.E, z57.E)) {
            i5 &= -9;
        }
        if ((i5 & 16) != 0 && sg3.e(this.T, z57.T)) {
            i5 &= -17;
        }
        if ((i5 & 32) != 0 && sg3.e(this.F, z57.F)) {
            i5 &= -33;
        }
        if ((i5 & 64) != 0 && sg3.e(this.G, z57.G)) {
            i5 &= -65;
        }
        if ((i5 & 128) != 0 && sg3.e(this.V, z57.V)) {
            i5 &= -129;
        }
        if ((i5 & 256) != 0) {
            i5 &= -257;
        }
        if ((i5 & 512) != 0 && sg3.e(this.W, z57.W)) {
            i5 &= -513;
        }
        if ((i5 & 1024) != 0 && sg3.e(this.X, z57.X)) {
            i5 &= -1025;
        }
        return i5 | i6;
    }

    public final long i(z57 z57, long j2) {
        long j3 = this.a;
        long j4 = z57.a;
        long j5 = j3 & j4 & j2;
        long j6 = j2 & (j3 ^ j4);
        if (j5 == 0) {
            return j6;
        }
        if ((1 & j5) != 0 && Float.floatToRawIntBits(this.c) == Float.floatToRawIntBits(z57.c)) {
            j5 &= -2;
        }
        if ((2 & j5) != 0 && Float.floatToRawIntBits(this.d) == Float.floatToRawIntBits(z57.d)) {
            j5 &= -3;
        }
        if ((4 & j5) != 0 && Float.floatToRawIntBits(this.e) == Float.floatToRawIntBits(z57.e)) {
            j5 &= -5;
        }
        if ((8 & j5) != 0 && Float.floatToRawIntBits(this.f) == Float.floatToRawIntBits(z57.f)) {
            j5 &= -9;
        }
        if ((16 & j5) != 0 && Float.floatToRawIntBits(this.g) == Float.floatToRawIntBits(z57.g)) {
            j5 &= -17;
        }
        if ((32 & j5) != 0 && Float.floatToRawIntBits(this.h) == Float.floatToRawIntBits(z57.h)) {
            j5 &= -33;
        }
        if ((64 & j5) != 0 && Float.floatToRawIntBits(this.i) == Float.floatToRawIntBits(z57.i)) {
            j5 &= -65;
        }
        if ((128 & j5) != 0 && Float.floatToRawIntBits(this.j) == Float.floatToRawIntBits(z57.j)) {
            j5 &= -129;
        }
        if ((256 & j5) != 0 && Float.floatToRawIntBits(this.k) == Float.floatToRawIntBits(z57.k)) {
            j5 &= -257;
        }
        if ((512 & j5) != 0 && Float.floatToRawIntBits(this.l) == Float.floatToRawIntBits(z57.l)) {
            j5 &= -513;
        }
        if ((1024 & j5) != 0 && Float.floatToRawIntBits(this.m) == Float.floatToRawIntBits(z57.m)) {
            j5 &= -1025;
        }
        if ((2048 & j5) != 0 && Float.floatToRawIntBits(this.n) == Float.floatToRawIntBits(z57.n)) {
            j5 &= -2049;
        }
        if ((4096 & j5) != 0 && Float.floatToRawIntBits(this.o) == Float.floatToRawIntBits(z57.o)) {
            j5 &= -4097;
        }
        if ((8192 & j5) != 0 && Float.floatToRawIntBits(this.p) == Float.floatToRawIntBits(z57.p)) {
            j5 &= -8193;
        }
        if ((16384 & j5) != 0 && Float.floatToRawIntBits(this.q) == Float.floatToRawIntBits(z57.q)) {
            j5 &= -16385;
        }
        if ((32768 & j5) != 0 && Float.floatToRawIntBits(this.r) == Float.floatToRawIntBits(z57.r)) {
            j5 &= -32769;
        }
        if ((65536 & j5) != 0 && Float.floatToRawIntBits(this.s) == Float.floatToRawIntBits(z57.s)) {
            j5 &= -65537;
        }
        if ((131072 & j5) != 0 && Float.floatToRawIntBits(this.v) == Float.floatToRawIntBits(z57.v)) {
            j5 &= -131073;
        }
        if ((262144 & j5) != 0 && Float.floatToRawIntBits(this.t) == Float.floatToRawIntBits(z57.t)) {
            j5 &= -262145;
        }
        if ((524288 & j5) != 0 && Float.floatToRawIntBits(this.w) == Float.floatToRawIntBits(z57.w)) {
            j5 &= -524289;
        }
        if ((1048576 & j5) != 0 && Float.floatToRawIntBits(this.u) == Float.floatToRawIntBits(z57.u)) {
            j5 &= -1048577;
        }
        if ((2097152 & j5) != 0 && Float.floatToRawIntBits(this.H) == Float.floatToRawIntBits(z57.H)) {
            j5 &= -2097153;
        }
        if ((4194304 & j5) != 0 && Float.floatToRawIntBits(this.I) == Float.floatToRawIntBits(z57.I)) {
            j5 &= -4194305;
        }
        if ((8388608 & j5) != 0 && Float.floatToRawIntBits(this.J) == Float.floatToRawIntBits(z57.J)) {
            j5 &= -8388609;
        }
        if ((16777216 & j5) != 0 && Float.floatToRawIntBits(this.K) == Float.floatToRawIntBits(z57.K)) {
            j5 &= -16777217;
        }
        if ((33554432 & j5) != 0 && Float.floatToRawIntBits(this.L) == Float.floatToRawIntBits(z57.L)) {
            j5 &= -33554433;
        }
        if ((67108864 & j5) != 0 && Float.floatToRawIntBits(this.M) == Float.floatToRawIntBits(z57.M)) {
            j5 &= -67108865;
        }
        if ((134217728 & j5) != 0 && Float.floatToRawIntBits(this.N) == Float.floatToRawIntBits(z57.N)) {
            j5 &= -134217729;
        }
        if ((268435456 & j5) != 0 && Float.floatToRawIntBits(this.O) == Float.floatToRawIntBits(z57.O)) {
            j5 &= -268435457;
        }
        if ((536870912 & j5) != 0 && Float.floatToRawIntBits(this.P) == Float.floatToRawIntBits(z57.P)) {
            j5 &= -536870913;
        }
        if ((1073741824 & j5) != 0 && Float.floatToRawIntBits(this.Q) == Float.floatToRawIntBits(z57.Q)) {
            j5 &= -1073741825;
        }
        if ((2147483648L & j5) != 0 && this.D == z57.D) {
            j5 &= -2147483649L;
        }
        if ((4294967296L & j5) != 0 && Float.floatToRawIntBits(this.S) == Float.floatToRawIntBits(z57.S)) {
            j5 &= -4294967297L;
        }
        if ((8589934592L & j5) != 0 && Float.floatToRawIntBits(this.R) == Float.floatToRawIntBits(z57.R)) {
            j5 &= -8589934593L;
        }
        if ((17179869184L & j5) != 0 && jt0.c(this.z, z57.z)) {
            j5 &= -17179869185L;
        }
        if ((34359738368L & j5) != 0 && jt0.c(this.x, z57.x)) {
            j5 &= -34359738369L;
        }
        if ((68719476736L & j5) != 0 && jt0.c(this.B, z57.B)) {
            j5 &= -68719476737L;
        }
        if ((137438953472L & j5) != 0 && jt0.c(this.U, z57.U)) {
            j5 &= -137438953473L;
        }
        if ((274877906944L & j5) != 0 && t().equals(z57.t())) {
            j5 &= -274877906945L;
        }
        if ((549755813888L & j5) != 0 && sg3.e(p(), z57.p())) {
            j5 &= -549755813889L;
        }
        if ((1099511627776L & j5) != 0 && n() == z57.n()) {
            j5 &= -1099511627777L;
        }
        if ((2199023255552L & j5) != 0 && s() == z57.s()) {
            j5 &= -2199023255553L;
        }
        if ((4398046511104L & j5) != 0 && u() == z57.u()) {
            j5 &= -4398046511105L;
        }
        if ((8796093022208L & j5) != 0 && Float.compare(this.b0, z57.b0) == 0) {
            j5 &= -8796093022209L;
        }
        if ((17592186044416L & j5) != 0 && q() == z57.q()) {
            j5 &= -17592186044417L;
        }
        if ((35184372088832L & j5) != 0 && o() == z57.o()) {
            j5 &= -35184372088833L;
        }
        if ((70368744177664L & j5) != 0 && wg7.a(this.Y, z57.Y)) {
            j5 &= -70368744177665L;
        }
        if ((140737488355328L & j5) != 0 && wg7.a(this.Z, z57.Z)) {
            j5 &= -140737488355329L;
        }
        if ((281474976710656L & j5) != 0 && wg7.a(this.a0, z57.a0)) {
            j5 &= -281474976710657L;
        }
        if ((562949953421312L & j5) != 0) {
            j5 &= -562949953421313L;
        }
        return j5 | j6;
    }

    public final void j(int i2) {
        this.a |= 1099511627776L;
        this.c0 = ((i2 | 2) & 3) | (this.c0 & -4);
    }

    public final void k(int i2) {
        this.a |= 35184372088832L;
        this.c0 = ((i2 << 10) & 15360) | (this.c0 & -15361);
    }

    public final void l(am2 am2) {
        this.a |= 549755813888L;
        this.c0 = ((am2.w << 17) & 134086656) | (this.c0 & -134086657);
    }

    public final void m(kc0 kc0) {
        int i2;
        this.a &= -68719476737L;
        int i3 = this.b;
        if (kc0 != null) {
            i2 = i3 | 4;
        } else {
            i2 = i3 & -5;
        }
        this.b = i2;
        this.C = kc0;
        int i4 = jt0.h;
        this.B = jt0.g;
    }

    public final int n() {
        if ((this.a & 1099511627776L) == 0 || (this.c0 & 1) != 1) {
            return 0;
        }
        return 1;
    }

    public final int o() {
        if ((this.a & 35184372088832L) == 0) {
            return 0;
        }
        int i2 = ((this.c0 & 15360) >> 10) & 15;
        if (!(i2 == 0 || i2 == 1 || i2 == 2 || i2 == 65535)) {
            zb3.a("The given value=" + i2 + " is not recognized by FontSynthesis.");
        }
        return i2;
    }

    public final am2 p() {
        if ((this.a & 549755813888L) != 0) {
            return new am2((this.c0 & 134086656) >> 17);
        }
        am2 am2 = am2.x;
        return am2.y;
    }

    public final int q() {
        if ((this.a & 17592186044416L) == 0) {
            return 0;
        }
        int i2 = (this.c0 & 768) >> 8;
        if (i2 >= 0 && i2 < 3) {
            return i2;
        }
        zb3.a("The given value=" + i2 + " is not recognized by Hyphens.");
        return i2;
    }

    public final int r() {
        return a67.e(this.b) | a67.g(this.a);
    }

    public final int s() {
        if ((this.a & 2199023255552L) == 0) {
            return 0;
        }
        int i2 = (this.c0 & 28) >> 2;
        if (i2 >= 0 && i2 < 7) {
            return i2;
        }
        zb3.a("The given value=" + i2 + " is not recognized by TextAlign.");
        return i2;
    }

    public final rd7 t() {
        int i2;
        int i3 = ((this.a & 274877906944L) > 0 ? 1 : ((this.a & 274877906944L) == 0 ? 0 : -1));
        rd7 rd7 = rd7.b;
        if (i3 == 0 || (i2 = ((this.c0 & 114688) >> 14) & 3) == 0) {
            return rd7;
        }
        if (i2 == 1) {
            return rd7.c;
        }
        if (i2 != 2) {
            return new rd7(i2);
        }
        return rd7.d;
    }

    public final int u() {
        if ((this.a & 4398046511104L) == 0) {
            return 0;
        }
        int i2 = (this.c0 & 112) >> 4;
        if (i2 >= 0 && i2 < 6) {
            return i2;
        }
        zb3.a("The given value=" + i2 + " is not recognized by TextDirection.");
        return i2;
    }

    public final boolean v(byte b2) {
        long j2 = this.a;
        if (b2 >= 50 || ((1 << b2) & j2) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(int i2) {
        int i3 = this.b;
        if (i2 < 50 || (i3 & (1 << (i2 - 50))) == 0) {
            return false;
        }
        return true;
    }

    public final void x(int i2) {
        this.a |= 17592186044416L;
        this.c0 = ((i2 << 8) & 768) | (this.c0 & -769);
    }

    public final void y(int i2) {
        this.a |= 2199023255552L;
        this.c0 = ((i2 << 2) & 28) | (this.c0 & -29);
    }

    public final void z(rd7 rd7) {
        this.a |= 274877906944L;
        this.c0 = (((rd7.a | 4) << 14) & 114688) | (this.c0 & -114689);
    }
}
