package defpackage;

import androidx.work.OverwritingInputMerger;

/* renamed from: be8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be8 {
    public static final String z = bc4.p("WorkSpec");
    public final String a;
    public kd8 b;
    public final String c;
    public final String d;
    public ce1 e;
    public final ce1 f;
    public long g;
    public long h;
    public long i;
    public j31 j;
    public final int k;
    public final d40 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public g85 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ be8(String str, kd8 kd8, String str2, String str3, ce1 ce1, ce1 ce12, long j2, long j3, long j4, j31 j31, int i2, d40 d40, long j5, long j6, long j7, long j8, boolean z2, g85 g85, int i3, long j9, int i4, int i5, String str4, Boolean bool, int i6) {
        this(str, r4, str2, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, (32768 & r0) != 0 ? -1 : j8, (65536 & r0) != 0 ? false : z2, (131072 & r0) != 0 ? g85.w : g85, (262144 & r0) != 0 ? 0 : i3, 0, (1048576 & r0) != 0 ? Long.MAX_VALUE : j9, (2097152 & r0) != 0 ? 0 : i4, (4194304 & r0) != 0 ? -256 : i5, (8388608 & r0) != 0 ? null : str4, (r0 & 16777216) != 0 ? Boolean.FALSE : bool);
        int i7 = i6;
        kd8 kd82 = (i7 & 2) != 0 ? kd8.w : kd8;
        String name = (i7 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        ce1 ce13 = (i7 & 16) != 0 ? ce1.b : ce1;
        ce1 ce14 = (i7 & 32) != 0 ? ce1.b : ce12;
        long j10 = 0;
        long j11 = (i7 & 64) != 0 ? 0 : j2;
        long j12 = (i7 & 128) != 0 ? 0 : j3;
        long j13 = (i7 & 256) != 0 ? 0 : j4;
        j31 j312 = (i7 & 512) != 0 ? j31.j : j31;
        int i8 = (i7 & 1024) != 0 ? 0 : i2;
        d40 d402 = (i7 & 2048) != 0 ? d40.w : d40;
        long j14 = (i7 & 4096) != 0 ? 30000 : j5;
        long j15 = (i7 & 8192) != 0 ? -1 : j6;
        long j16 = j15;
        long j17 = (i7 & 16384) == 0 ? j7 : j10;
    }

    public static be8 b(be8 be8, String str, kd8 kd8, String str2, ce1 ce1, int i2, long j2, int i3, int i4, long j3, int i5, int i6) {
        String str3;
        kd8 kd82;
        String str4;
        ce1 ce12;
        int i7;
        long j4;
        int i8;
        int i9;
        long j5;
        int i10;
        be8 be82 = be8;
        int i11 = i6;
        if ((i11 & 1) != 0) {
            str3 = be82.a;
        } else {
            str3 = str;
        }
        if ((i11 & 2) != 0) {
            kd82 = be82.b;
        } else {
            kd82 = kd8;
        }
        if ((i11 & 4) != 0) {
            str4 = be82.c;
        } else {
            str4 = str2;
        }
        String str5 = be82.d;
        if ((i11 & 16) != 0) {
            ce12 = be82.e;
        } else {
            ce12 = ce1;
        }
        ce1 ce13 = be82.f;
        long j6 = be82.g;
        long j7 = be82.h;
        long j8 = be82.i;
        j31 j31 = be82.j;
        if ((i11 & 1024) != 0) {
            i7 = be82.k;
        } else {
            i7 = i2;
        }
        j31 j312 = j31;
        d40 d40 = be82.l;
        long j9 = be82.m;
        if ((i11 & 8192) != 0) {
            j4 = be82.n;
        } else {
            j4 = j2;
        }
        long j10 = be82.o;
        long j11 = be82.p;
        boolean z2 = be82.q;
        long j12 = j11;
        g85 g85 = be82.r;
        if ((i6 & 262144) != 0) {
            i8 = be82.s;
        } else {
            i8 = i3;
        }
        if ((i6 & 524288) != 0) {
            i9 = be82.t;
        } else {
            i9 = i4;
        }
        g85 g852 = g85;
        if ((i6 & 1048576) != 0) {
            j5 = be82.u;
        } else {
            j5 = j3;
        }
        if ((i6 & 2097152) != 0) {
            i10 = be82.v;
        } else {
            i10 = i5;
        }
        int i12 = be82.w;
        String str6 = be82.x;
        int i13 = i12;
        Boolean bool = be82.y;
        be82.getClass();
        str3.getClass();
        kd82.getClass();
        str4.getClass();
        str5.getClass();
        ce12.getClass();
        ce13.getClass();
        j312.getClass();
        d40.getClass();
        g852.getClass();
        return new be8(str3, kd82, str4, str5, ce12, ce13, j6, j7, j8, j312, i7, d40, j9, j4, j10, j12, z2, g852, i8, i9, j5, i10, i13, str6, bool);
    }

    public final long a() {
        boolean z2;
        if (this.b != kd8.w || this.k <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2;
        long j2 = this.n;
        boolean c2 = c();
        long j3 = this.g;
        long j4 = this.i;
        long j5 = this.h;
        return o85.a(z3, this.k, this.l, this.m, j2, this.s, c2, j3, j4, j5, this.u);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be8)) {
            return false;
        }
        be8 be8 = (be8) obj;
        if (sg3.e(this.a, be8.a) && this.b == be8.b && sg3.e(this.c, be8.c) && sg3.e(this.d, be8.d) && sg3.e(this.e, be8.e) && sg3.e(this.f, be8.f) && this.g == be8.g && this.h == be8.h && this.i == be8.i && sg3.e(this.j, be8.j) && this.k == be8.k && this.l == be8.l && this.m == be8.m && this.n == be8.n && this.o == be8.o && this.p == be8.p && this.q == be8.q && this.r == be8.r && this.s == be8.s && this.t == be8.t && this.u == be8.u && this.v == be8.v && this.w == be8.w && sg3.e(this.x, be8.x) && sg3.e(this.y, be8.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int e2 = f21.e(this.w, f21.e(this.v, pb4.b(f21.e(this.t, f21.e(this.s, (this.r.hashCode() + hl6.i(pb4.b(pb4.b(pb4.b(pb4.b((this.l.hashCode() + f21.e(this.k, (this.j.hashCode() + pb4.b(pb4.b(pb4.b((this.f.hashCode() + ((this.e.hashCode() + hl6.h(hl6.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int i3 = 0;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i4 = (e2 + i2) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return hl6.o(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public be8(String str, kd8 kd8, String str2, String str3, ce1 ce1, ce1 ce12, long j2, long j3, long j4, j31 j31, int i2, d40 d40, long j5, long j6, long j7, long j8, boolean z2, g85 g85, int i3, int i4, long j9, int i5, int i6, String str4, Boolean bool) {
        str.getClass();
        kd8.getClass();
        str2.getClass();
        str3.getClass();
        ce1.getClass();
        ce12.getClass();
        j31.getClass();
        d40.getClass();
        g85.getClass();
        this.a = str;
        this.b = kd8;
        this.c = str2;
        this.d = str3;
        this.e = ce1;
        this.f = ce12;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = j31;
        this.k = i2;
        this.l = d40;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = j8;
        this.q = z2;
        this.r = g85;
        this.s = i3;
        this.t = i4;
        this.u = j9;
        this.v = i5;
        this.w = i6;
        this.x = str4;
        this.y = bool;
    }
}
