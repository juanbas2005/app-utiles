package defpackage;

/* renamed from: ab3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ab3 implements yy1 {
    public wa3 A;
    public h03 B;
    public uy5 C;
    public cp0 D;
    public final qa E;
    public final qa F;
    public final ty1 w;
    public va3 x;
    public ya3 y;
    public xa3 z;

    public ab3(ty1 ty1) {
        this.w = ty1;
        qa qaVar = new qa(2, (byte) 0);
        qaVar.y = new lp4();
        this.E = qaVar;
        qa qaVar2 = new qa(6, (byte) 0);
        qaVar2.y = new cp4();
        this.F = qaVar2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, xa3] */
    public static void c(ab3 ab3, ta3 ta3, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ty1 ty1 = ab3.w;
        xa3 xa3 = ab3.z;
        xa3 xa32 = xa3;
        if (xa3 == null) {
            ? obj = new Object();
            obj.N0 = null;
            obj.O0 = Long.MAX_VALUE;
            obj.P0 = false;
            ab3.z = obj;
            xa32 = obj;
        }
        xa32.N0 = ta3;
        xa32.O0 = j;
        cp0 cp0 = ab3.D;
        z75 z75 = ty1.M;
        if (cp0 == null) {
            ab3.D = new cp0(z75);
        } else {
            cp0.y = z75;
            cp0.x = j2;
        }
        xa32.P0 = false;
        ab3.B = xa32;
    }

    public final String O() {
        h03 h03 = this.B;
        if (h03 instanceof va3) {
            if (((va3) h03).P0) {
                return "waiting";
            }
            return "idle";
        } else if ((h03 instanceof xa3) || (h03 instanceof wa3)) {
            return "waiting";
        } else {
            if (h03 instanceof ya3) {
                return "recognized";
            }
            return "idle";
        }
    }

    public final z75 W() {
        return this.w.M;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [va3, java.lang.Object] */
    public final void a() {
        va3 va3 = this.x;
        ua3 ua3 = ua3.y;
        va3 va32 = va3;
        if (va3 == null) {
            ? obj = new Object();
            obj.N0 = ua3;
            obj.O0 = false;
            obj.P0 = false;
            this.x = obj;
            va32 = obj;
        }
        va32.N0 = ua3;
        va32.O0 = false;
        va32.P0 = false;
        this.B = va32;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [wa3, java.lang.Object] */
    public final void b(ta3 ta3, long j, cp0 cp0) {
        wa3 wa3 = this.A;
        wa3 wa32 = wa3;
        if (wa3 == null) {
            ? obj = new Object();
            obj.N0 = null;
            obj.O0 = Long.MAX_VALUE;
            this.A = obj;
            wa32 = obj;
        }
        wa32.N0 = ta3;
        wa32.O0 = j;
        cp0.x = 0;
        this.B = wa32;
    }

    public final uy5 d() {
        uy5 uy5 = this.C;
        if (uy5 != null) {
            return uy5;
        }
        h.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(ta3 ta3, sa3 sa3, long j) {
        long j2;
        long j3;
        float f;
        ta3 ta32 = ta3;
        long j4 = j;
        long j5 = ta32.c;
        ty1 ty1 = this.w;
        z75 z75 = ty1.M;
        z75.getClass();
        int i = az1.a;
        long j6 = 4294967295L;
        if (z75 == z75.w) {
            j2 = j4 & 4294967295L;
        } else {
            j2 = j4 >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            uy5 d = d();
            z75 z752 = ty1.M;
            qa qaVar = this.E;
            lp4 lp4 = (lp4) qaVar.y;
            float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
            if (rd3.h(ta32)) {
                qaVar.x = 0;
                lp4.d();
            }
            float f2 = 0.0f;
            if (rd3.c(ta32) || rd3.h(ta32)) {
                j3 = 4294967295L;
            } else {
                if (lp4.b == 3) {
                    int i2 = qaVar.x;
                    qaVar.x = i2 + 1;
                    lp4.n(i2, ta32);
                } else {
                    lp4.a(ta32);
                }
                if (qaVar.x == 3) {
                    qaVar.x = 0;
                }
                Object[] objArr = lp4.a;
                int i3 = lp4.b;
                int i4 = 0;
                float f3 = 0.0f;
                while (i4 < i3) {
                    f3 += Float.intBitsToFloat((int) (((ta3) objArr[i4]).c >> 32));
                    i4++;
                    j6 = j6;
                }
                j3 = j6;
                int i5 = lp4.b;
                intBitsToFloat = f3 / ((float) i5);
                Object[] objArr2 = lp4.a;
                float f4 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    f4 += Float.intBitsToFloat((int) (((ta3) objArr2[i6]).c & j3));
                }
                intBitsToFloat2 = f4 / ((float) lp4.b);
            }
            long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat2)) & j3) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32);
            if (z752 != null) {
                int i7 = sa3.a;
                if (i7 == 1) {
                    f = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else if (i7 == 2) {
                    f = Float.intBitsToFloat((int) (floatToRawIntBits & j3));
                }
                if (z752 == z75.x) {
                    floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j3);
                } else {
                    floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) & j3) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                }
            }
            ((md4) d.x).a(ta32.b, floatToRawIntBits);
            qa qaVar2 = this.F;
            cp4 cp4 = (cp4) qaVar2.y;
            int i8 = cp4.b;
            if (i8 == 3) {
                int i9 = qaVar2.x;
                qaVar2.x = i9 + 1;
                if (i9 < 0 || i9 >= i8) {
                    h.l("Index must be between 0 and size");
                    return;
                }
                long[] jArr = cp4.a;
                long j7 = jArr[i9];
                jArr[i9] = j4;
            } else {
                cp4.a(j4);
            }
            if (qaVar2.x == 3) {
                qaVar2.x = 0;
            }
            long[] jArr2 = cp4.a;
            int i10 = cp4.b;
            float f5 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                f5 += Float.intBitsToFloat((int) (jArr2[i11] >> 32));
            }
            int i12 = cp4.b;
            float f6 = f5 / ((float) i12);
            long[] jArr3 = cp4.a;
            for (int i13 = 0; i13 < i12; i13++) {
                f2 = Float.intBitsToFloat((int) (jArr3[i13] & j3)) + f2;
            }
            ty1.g1(new by1(true, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f2 / ((float) cp4.b))) & j3)));
        }
    }

    public final void f(ta3 ta3, ta3 ta32, sa3 sa3, long j) {
        long j2;
        char c;
        float f;
        ta3 ta33 = ta3;
        sa3 sa32 = sa3;
        if (this.C == null) {
            this.C = new uy5(9);
        }
        uy5 d = d();
        ty1 ty1 = this.w;
        z75 z75 = ty1.M;
        qa qaVar = this.E;
        lp4 lp4 = (lp4) qaVar.y;
        char c2 = ' ';
        float intBitsToFloat = Float.intBitsToFloat((int) (ta33.c >> 32));
        long j3 = 4294967295L;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ta33.c & 4294967295L));
        if (rd3.h(ta33)) {
            qaVar.x = 0;
            lp4.d();
        }
        if (rd3.c(ta33) || rd3.h(ta33)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (lp4.b == 3) {
                int i = qaVar.x;
                qaVar.x = i + 1;
                lp4.n(i, ta33);
            } else {
                lp4.a(ta33);
            }
            if (qaVar.x == 3) {
                qaVar.x = 0;
            }
            Object[] objArr = lp4.a;
            int i2 = lp4.b;
            int i3 = 0;
            float f2 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                f2 += Float.intBitsToFloat((int) (((ta3) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = lp4.b;
            intBitsToFloat = f2 / ((float) i4);
            Object[] objArr2 = lp4.a;
            float f3 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f3 += Float.intBitsToFloat((int) (((ta3) objArr2[i5]).c & j2));
            }
            intBitsToFloat2 = f3 / ((float) lp4.b);
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & j2);
        if (z75 != null) {
            int i6 = sa32.a;
            if (i6 == 1) {
                f = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
            } else if (i6 == 2) {
                f = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
            }
            if (z75 == z75.x) {
                floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2);
            } else {
                floatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(f)) & j2);
            }
        }
        ((md4) d.x).a(ta33.b, floatToRawIntBits);
        long d2 = l35.d(rd3.F(ta32, ty1.M, sa32), j);
        if (((Boolean) ty1.N.y(new wk5(1))).booleanValue()) {
            ty1.g1(new cy1(d2));
        }
        qa qaVar2 = this.F;
        qaVar2.x = 0;
        ((cp4) qaVar2.y).b = 0;
    }
}
