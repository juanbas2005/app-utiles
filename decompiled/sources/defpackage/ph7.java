package defpackage;

/* renamed from: ph7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ph7 {
    public final int a;
    public final long b;
    public final long c;
    public final ll4 d;
    public final vr2 e;
    public ph7 f;
    public long g;
    public long h;
    public long i = Long.MIN_VALUE;
    public long j = -1;
    public final /* synthetic */ qh7 k;

    public ph7(qh7 qh7, int i2, long j2, long j3, ll4 ll4, vr2 vr2) {
        this.k = qh7;
        this.a = i2;
        this.b = j2;
        this.c = j3;
        this.d = ll4;
        this.e = vr2;
    }

    public final void a(long j2, long j3, long j4, long j5, float[] fArr) {
        s36 s36;
        s36 s362;
        long j6 = this.k.f;
        ll4 ll4 = this.d;
        xz4 M0 = rc9.M0(ll4, 2);
        uy3 O0 = rc9.O0(ll4);
        boolean K = O0.K();
        o00 o00 = O0.a0;
        if (!K) {
            s36 = null;
        } else {
            if (((xz4) o00.e) != M0) {
                long floatToRawIntBits = (long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)));
                long j7 = M0.y;
                xz4 xz4 = (xz4) o00.e;
                xz4.getClass();
                long V = gr8.V(xz4.O(M0, (((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L)))) & 4294967295L) | (floatToRawIntBits << 32)));
                long j8 = 4294967295L & ((long) (((int) (V & 4294967295L)) + ((int) (j7 & 4294967295L))));
                s362 = new s36(V, j8 | (((long) (((int) (V >> 32)) + ((int) (j7 >> 32)))) << 32), j4, j5, j6, fArr, ll4);
            } else {
                s362 = new s36(j2, j3, j4, j5, j6, fArr, ll4);
            }
            s36 = s362;
        }
        if (s36 != null) {
            this.e.y(s36);
        }
    }

    public final void b() {
        ph7 ph7;
        qh7 qh7 = this.k;
        yo4 yo4 = qh7.a;
        int i2 = this.a;
        ph7 ph72 = (ph7) yo4.g(i2);
        if (ph72 != null) {
            if (ph72 != this) {
                int d2 = yo4.d(i2);
                Object[] objArr = yo4.c;
                Object obj = objArr[d2];
                yo4.b[d2] = i2;
                objArr[d2] = ph72;
                while (true) {
                    ph7 ph73 = ph72.f;
                    if (ph73 == null) {
                        break;
                    } else if (ph73 == this) {
                        ph72.f = this.f;
                        this.f = null;
                        return;
                    } else {
                        ph72 = ph73;
                    }
                }
            } else {
                ph7 ph74 = this.f;
                this.f = null;
                if (ph74 != null) {
                    int d3 = yo4.d(i2);
                    Object[] objArr2 = yo4.c;
                    Object obj2 = objArr2[d3];
                    yo4.b[d3] = i2;
                    objArr2[d3] = ph74;
                    return;
                }
                uy3 O0 = rc9.O0(this.d.w);
                if (O0.J()) {
                    ny5 rectManager = ((je) xy3.a(O0)).getRectManager();
                    rectManager.getClass();
                    if (O0.C != -4) {
                        ig igVar = rectManager.c;
                        int e2 = rectManager.e(O0);
                        long[] jArr = (long[]) igVar.c;
                        int i3 = e2 + 2;
                        jArr[i3] = jArr[i3] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ph7 ph75 = qh7.b;
        if (ph75 == this) {
            qh7.b = ph75.f;
            this.f = null;
            return;
        }
        if (ph75 != null) {
            ph7 = ph75.f;
        } else {
            ph7 = null;
        }
        while (true) {
            ph7 ph76 = ph75;
            ph75 = ph7;
            ph7 ph77 = ph76;
            if (ph75 == null) {
                return;
            }
            if (ph75 == this) {
                if (ph77 != null) {
                    ph77.f = ph75.f;
                }
                this.f = null;
                return;
            }
            ph7 = ph75.f;
        }
    }
}
