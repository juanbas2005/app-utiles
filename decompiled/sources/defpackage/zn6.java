package defpackage;

import java.util.Set;

/* renamed from: zn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zn6 {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final jy7 D;
    public final String a;
    public final boolean b;
    public final ae1 c;
    public final xx3 d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final Set h;
    public final g40 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final az7 s;
    public final az7 t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ zn6(String str, boolean z2, ae1 ae1, boolean z3, int i2, boolean z4, Set set, g40 g40, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, az7 az7, az7 az72, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i3, jy7 jy7, int i4) {
        this(r3, r4, r5, xx3.ENGLISH, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, (1048576 & r0) != 0 ? false : z14, (2097152 & r0) != 0 ? false : z15, (4194304 & r0) != 0 ? false : z16, (8388608 & r0) != 0 ? false : z17, (16777216 & r0) != 0 ? false : z18, (33554432 & r0) != 0 ? false : z19, (67108864 & r0) != 0 ? false : z20, (134217728 & r0) != 0 ? false : z21, (268435456 & r0) != 0 ? 30 : i3, (r0 & 536870912) != 0 ? jy7.SALDO : jy7);
        int i5 = i4;
        String str2 = (i5 & 1) != 0 ? null : str;
        boolean z22 = (i5 & 2) != 0 ? true : z2;
        ae1 ae12 = (i5 & 4) != 0 ? ae1.w : ae1;
        boolean z23 = (i5 & 16) != 0 ? false : z3;
        int i6 = (i5 & 32) != 0 ? 0 : i2;
        boolean z24 = (i5 & 64) != 0 ? true : z4;
        g42 g42 = (i5 & 128) != 0 ? g42.w : set;
        g40 g402 = (i5 & 256) != 0 ? g40.x : g40;
        boolean z25 = (i5 & 512) != 0 ? false : z5;
        boolean z26 = (i5 & 1024) != 0 ? false : z6;
        boolean z27 = (i5 & 2048) != 0 ? false : z7;
        boolean z28 = (i5 & 4096) != 0 ? false : z8;
        boolean z29 = (i5 & 8192) != 0 ? false : z9;
        boolean z30 = (i5 & 16384) != 0 ? false : z10;
        boolean z31 = (32768 & i5) != 0 ? false : z11;
        boolean z32 = (65536 & i5) != 0 ? false : z12;
        boolean z33 = (131072 & i5) != 0 ? false : z13;
        int i7 = 262144 & i5;
        az7 az73 = az7.CONSULTAR_SALDO;
        az7 az74 = i7 != 0 ? az73 : az7;
        az7 az75 = (524288 & i5) != 0 ? az73 : az72;
    }

    public final boolean a() {
        return this.k;
    }

    public final az7 b() {
        return this.t;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn6)) {
            return false;
        }
        zn6 zn6 = (zn6) obj;
        if (sg3.e(this.a, zn6.a) && this.b == zn6.b && this.c == zn6.c && this.d == zn6.d && this.e == zn6.e && this.f == zn6.f && this.g == zn6.g && sg3.e(this.h, zn6.h) && this.i == zn6.i && this.j == zn6.j && this.k == zn6.k && this.l == zn6.l && this.m == zn6.m && this.n == zn6.n && this.o == zn6.o && this.p == zn6.p && this.q == zn6.q && this.r == zn6.r && this.s == zn6.s && this.t == zn6.t && this.u == zn6.u && this.v == zn6.v && this.w == zn6.w && this.x == zn6.x && this.y == zn6.y && this.z == zn6.z && this.A == zn6.A && this.B == zn6.B && this.C == zn6.C && this.D == zn6.D) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        String str = this.a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i3 = hl6.i(i2 * 31, 31, this.b);
        int i4 = hl6.i(f21.e(this.f, hl6.i((this.d.hashCode() + ((this.c.hashCode() + i3) * 31)) * 31, 31, this.e), 31), 31, this.g);
        int i5 = hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i((this.i.hashCode() + ((this.h.hashCode() + i4) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        return this.D.hashCode() + f21.e(this.C, hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i((this.t.hashCode() + ((this.s.hashCode() + i5) * 31)) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Settings(userName=");
        sb.append(this.a);
        sb.append(", useDynamicColor=");
        sb.append(this.b);
        sb.append(", darkThemeConfig=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", ussdRefreshModeEnabled=");
        sb.append(this.e);
        sb.append(", defaultSimSlot=");
        sb.append(this.f);
        sb.append(", showEtecsaBanner=");
        sb.append(this.g);
        sb.append(", homeCollapsedSections=");
        sb.append(this.h);
        sb.append(", balanceSecondaryInfo=");
        sb.append(this.i);
        sb.append(", planExpiryNotifyEnabled=");
        sb.append(this.j);
        sb.append(", appLockEnabled=");
        pb4.s(sb, this.k, ", blockAnonymousCalls=", this.l, ", blockRevertidaCalls=");
        pb4.s(sb, this.m, ", blockFijoCalls=", this.n, ", blockUnknownCalls=");
        pb4.s(sb, this.o, ", blockAllCalls=", this.p, ", callAlertAllCalls=");
        pb4.s(sb, this.q, ", callAlertRevertidaCalls=", this.r, ", saldoUssdSim1=");
        sb.append(this.s);
        sb.append(", saldoUssdSim2=");
        sb.append(this.t);
        sb.append(", voiceNotificationsUssdEnabled=");
        pb4.s(sb, this.u, ", voiceNotificationsIncomingEnabled=", this.v, ", speedOverlayAutoEnabled=");
        pb4.s(sb, this.w, ", ussdAutoEnabled=", this.x, ", ussdAutoAfterCallEnabled=");
        pb4.s(sb, this.y, ", ussdAutoAfterSmsEnabled=", this.z, ", ussdAutoAfterDataOffEnabled=");
        pb4.s(sb, this.A, ", ussdAutoPeriodicEnabled=", this.B, ", ussdAutoIntervalMinutes=");
        sb.append(this.C);
        sb.append(", ussdAutoPeriodicQuery=");
        sb.append(this.D);
        sb.append(")");
        return sb.toString();
    }

    public zn6(String str, boolean z2, ae1 ae1, xx3 xx3, boolean z3, int i2, boolean z4, Set set, g40 g40, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, az7 az7, az7 az72, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i3, jy7 jy7) {
        ae1.getClass();
        set.getClass();
        g40.getClass();
        az7.getClass();
        az72.getClass();
        jy7.getClass();
        this.a = str;
        this.b = z2;
        this.c = ae1;
        this.d = xx3;
        this.e = z3;
        this.f = i2;
        this.g = z4;
        this.h = set;
        this.i = g40;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = z12;
        this.r = z13;
        this.s = az7;
        this.t = az72;
        this.u = z14;
        this.v = z15;
        this.w = z16;
        this.x = z17;
        this.y = z18;
        this.z = z19;
        this.A = z20;
        this.B = z21;
        this.C = i3;
        this.D = jy7;
    }
}
