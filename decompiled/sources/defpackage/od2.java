package defpackage;

/* renamed from: od2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class od2 {
    public final String a;
    public final String b;
    public final String c;

    public od2(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od2)) {
            return false;
        }
        od2 od2 = (od2) obj;
        if (this.a.equals(od2.a) && sg3.e(this.b, od2.b) && this.c.equals(od2.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileUploadResponse(id=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", key=");
        return hl6.o(sb, this.c, ')');
    }
}
