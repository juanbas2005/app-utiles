package defpackage;

/* renamed from: pl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pl7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public pl7(String str, String str2, String str3, String str4, boolean z, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl7)) {
            return false;
        }
        pl7 pl7 = (pl7) obj;
        if (this.a.equals(pl7.a) && this.b.equals(pl7.b) && this.c.equals(pl7.c) && this.d.equals(pl7.d) && this.e == pl7.e && this.f == pl7.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl6.i(hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder o = f21.o("TransferRecord(description=", this.a, ", amount=", this.b, ", date=");
        f21.v(o, this.c, ", detail=", this.d, ", isReceived=");
        o.append(this.e);
        o.append(", dateMillis=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
