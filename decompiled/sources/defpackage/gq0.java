package defpackage;

/* renamed from: gq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gq0 {
    public final up2 a;
    public final up2 b;
    public final boolean c;

    public gq0(up2 up2, up2 up22, boolean z) {
        up2.getClass();
        up22.getClass();
        this.a = up2;
        this.b = up22;
        this.c = z;
        up22.a.c();
    }

    public static final String c(up2 up2) {
        String str = up2.a.a;
        if (d57.y0(str, '/')) {
            return pb4.h('`', "`", str);
        }
        return str;
    }

    public final up2 a() {
        up2 up2 = this.a;
        boolean c2 = up2.a.c();
        up2 up22 = this.b;
        if (c2) {
            return up22;
        }
        return new up2(up2.a.a + '.' + up22.a.a);
    }

    public final String b() {
        up2 up2 = this.a;
        boolean c2 = up2.a.c();
        up2 up22 = this.b;
        if (c2) {
            return c(up22);
        }
        return k57.r0(up2.a.a, '.', '/') + "/" + c(up22);
    }

    public final gq0 d(uq4 uq4) {
        uq4.getClass();
        return new gq0(this.a, this.b.a(uq4), this.c);
    }

    public final gq0 e() {
        up2 b2 = this.b.b();
        if (b2.a.c()) {
            return null;
        }
        return new gq0(this.a, b2, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq0)) {
            return false;
        }
        gq0 gq0 = (gq0) obj;
        if (sg3.e(this.a, gq0.a) && sg3.e(this.b, gq0.b) && this.c == gq0.c) {
            return true;
        }
        return false;
    }

    public final uq4 f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean c2 = this.a.a.c();
        String b2 = b();
        if (c2) {
            return "/".concat(b2);
        }
        return b2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gq0(up2 up2, uq4 uq4) {
        this(up2, dh4.I(uq4), false);
        up2.getClass();
        uq4.getClass();
        up2 up22 = up2.c;
    }
}
