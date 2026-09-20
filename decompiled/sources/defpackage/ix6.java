package defpackage;

/* renamed from: ix6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ix6 {
    public mx6 a;
    public long b;
    public boolean c;
    public int d;

    public ix6(long j, mx6 mx6) {
        int i;
        int numberOfTrailingZeros;
        this.a = mx6;
        this.b = j;
        nf6 nf6 = nx6.a;
        if (j != 0) {
            mx6 d2 = d();
            long j2 = d2.y;
            long[] jArr = d2.z;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d2.x;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d2.w;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) numberOfTrailingZeros) + j2;
            }
            synchronized (nx6.c) {
                i = nx6.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ix6 ix6) {
        nx6.b.D(ix6);
    }

    public final void a() {
        synchronized (nx6.c) {
            b();
            p();
        }
    }

    public void b() {
        nx6.d = nx6.d.g(g());
    }

    public abstract void c();

    public mx6 d() {
        return this.a;
    }

    public abstract vr2 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract vr2 i();

    public final ix6 j() {
        cf4 cf4 = nx6.b;
        ix6 ix6 = (ix6) cf4.f();
        cf4.D(this);
        return ix6;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(n37 n37);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            nx6.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(mx6 mx6) {
        this.a = mx6;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ix6 u(vr2 vr2);
}
