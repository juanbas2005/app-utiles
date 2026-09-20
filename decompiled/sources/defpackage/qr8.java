package defpackage;

/* renamed from: qr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qr8 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public qr8(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        z65.h(str);
        z65.h(str2);
        boolean z4 = false;
        if (j7 >= 0) {
            z = true;
        } else {
            z = false;
        }
        z65.f(z);
        if (j8 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z65.f(z2);
        if (j9 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z65.f(z3);
        z65.f(j10 >= 0 ? true : z4);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.d = j8;
        this.e = j9;
        this.f = j5;
        this.g = j10;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final qr8 a(long j2) {
        return new qr8(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    public final qr8 b(Long l, Long l2, Boolean bool) {
        return new qr8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
