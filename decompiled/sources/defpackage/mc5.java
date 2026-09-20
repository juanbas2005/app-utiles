package defpackage;

/* renamed from: mc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mc5 {
    public String a;
    public tg7 b;
    public dl2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h = ec3.a;
    public tp1 i;
    public zg j;
    public boolean k;
    public long l = 0;
    public yk4 m;
    public lc5 n;
    public ey3 o;
    public long p = m31.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;
    public long s;

    public mc5(String str, tg7 tg7, dl2 dl2, int i2, boolean z, int i3, int i4) {
        this.a = str;
        this.b = tg7;
        this.c = dl2;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = i4;
    }

    public static long f(mc5 mc5, long j2, ey3 ey3) {
        tg7 tg7 = mc5.b;
        yk4 yk4 = mc5.m;
        tp1 tp1 = mc5.i;
        tp1.getClass();
        yk4 U = mp7.U(yk4, ey3, tg7, tp1, mc5.c);
        mc5.m = U;
        return U.a(j2, mc5.g);
    }

    public final int a(int i2, ey3 ey3) {
        int i3;
        int i4 = this.q;
        int i5 = this.r;
        if (i2 == i4 && i4 != -1) {
            return i5;
        }
        long a2 = m31.a(0, i2, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a2 = f(this, a2, ey3);
        }
        lc5 e2 = e(ey3);
        long R = gl0.R(a2, this.e, this.d, e2.e());
        boolean z = this.e;
        int i6 = this.d;
        int i7 = this.f;
        if ((z || !(i6 == 2 || i6 == 4 || i6 == 5)) && i7 >= 1) {
            i3 = i7;
        } else {
            i3 = 1;
        }
        int f2 = l55.f(new zg((dh) e2, i3, i6, R).b());
        int i8 = k31.i(a2);
        if (f2 < i8) {
            f2 = i8;
        }
        this.q = i2;
        this.r = f2;
        return f2;
    }

    public final boolean b(long j2, ey3 ey3) {
        long j3;
        int i2;
        lc5 lc5;
        ey3 ey32 = ey3;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j3 = f(this, j2, ey3);
        } else {
            j3 = j2;
        }
        zg zgVar = this.j;
        boolean z2 = false;
        if (zgVar != null && (lc5 = this.n) != null && !lc5.b() && ey32 == this.o && (k31.b(j3, this.p) || (k31.h(j3) == k31.h(this.p) && k31.j(j3) == k31.j(this.p) && ((float) k31.g(j3)) >= zgVar.b() && !zgVar.d.d))) {
            if (!k31.b(j3, this.p)) {
                zg zgVar2 = this.j;
                zgVar2.getClass();
                long d2 = m31.d(j3, (((long) l55.f(Math.min(zgVar2.a.E.c(), zgVar2.d()))) << 32) | (((long) l55.f(zgVar2.b())) & 4294967295L));
                this.l = d2;
                if (this.d == 3 || (((float) ((int) (d2 >> 32))) >= zgVar2.d() && ((float) ((int) (4294967295L & d2))) >= zgVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j3;
            }
            return false;
        }
        lc5 e2 = e(ey32);
        long R = gl0.R(j3, this.e, this.d, e2.e());
        boolean z3 = this.e;
        int i3 = this.d;
        int i4 = this.f;
        if ((z3 || !(i3 == 2 || i3 == 4 || i3 == 5)) && i4 >= 1) {
            i2 = i4;
        } else {
            i2 = 1;
        }
        zg zgVar3 = new zg((dh) e2, i2, i3, R);
        this.p = j3;
        long d3 = m31.d(j3, (((long) l55.f(zgVar3.b())) & 4294967295L) | (((long) l55.f(zgVar3.d())) << 32));
        this.l = d3;
        if (this.d != 3 && (((float) ((int) (d3 >> 32))) < zgVar3.d() || ((float) ((int) (d3 & 4294967295L))) < zgVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = zgVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = m31.h(0, 0, 0, 0);
        this.l = 0;
        this.k = false;
    }

    public final void d(tp1 tp1) {
        long j2;
        tp1 tp12 = this.i;
        if (tp1 != null) {
            int i2 = ec3.b;
            j2 = ec3.a(tp1.b(), tp1.Y());
        } else {
            j2 = ec3.a;
        }
        if (tp12 == null) {
            this.i = tp1;
            this.h = j2;
        } else if (tp1 == null || this.h != j2) {
            this.i = tp1;
            this.h = j2;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final lc5 e(ey3 ey3) {
        lc5 lc5 = this.n;
        if (lc5 == null || ey3 != this.o || lc5.b()) {
            this.o = ey3;
            String str = this.a;
            tg7 k2 = aa5.k(this.b, ey3);
            tp1 tp1 = this.i;
            tp1.getClass();
            dl2 dl2 = this.c;
            a42 a42 = a42.w;
            lc5 = new dh(str, k2, a42, a42, dl2, tp1);
        }
        this.n = lc5;
        return lc5;
    }

    public final String toString() {
        String str;
        if (this.j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        String b2 = ec3.b(this.h);
        return f21.k(f21.o("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", b2, ", history="), this.s, ", constraints=$)");
    }
}
