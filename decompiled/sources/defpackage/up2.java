package defpackage;

/* renamed from: up2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class up2 {
    public static final up2 c = new up2("");
    public final vp2 a;
    public transient up2 b;

    public up2(String str) {
        str.getClass();
        this.a = new vp2(this, str);
    }

    public final up2 a(uq4 uq4) {
        uq4.getClass();
        return new up2(this.a.a(uq4), this);
    }

    public final up2 b() {
        up2 up2 = this.b;
        if (up2 != null) {
            return up2;
        }
        vp2 vp2 = this.a;
        if (!vp2.c()) {
            up2 up22 = new up2(vp2.e());
            this.b = up22;
            return up22;
        }
        h.s("root");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up2)) {
            return false;
        }
        if (!sg3.e(this.a, ((up2) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public up2(vp2 vp2) {
        this.a = vp2;
    }

    public up2(vp2 vp2, up2 up2) {
        this.a = vp2;
        this.b = up2;
    }
}
