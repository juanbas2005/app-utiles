package defpackage;

/* renamed from: o78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o78 {
    public final String a;
    public final String b;
    public final String c;

    public o78(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o78)) {
            return false;
        }
        o78 o78 = (o78) obj;
        if (this.a.equals(o78.a) && this.b.equals(o78.b) && this.c.equals(o78.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f21.l(f21.o("VpnConfigInfo(name=", this.a, ", endpoint=", this.b, ", address="), this.c, ")");
    }
}
