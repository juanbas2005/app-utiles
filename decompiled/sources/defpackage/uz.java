package defpackage;

/* renamed from: uz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uz extends aa1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public uz(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aa1) {
            uz uzVar = (uz) ((aa1) obj);
            if (this.a == uzVar.a && this.b == uzVar.b && this.c.equals(uzVar.c)) {
                String str = uzVar.d;
                String str2 = this.d;
                if (str2 != null ? !str2.equals(str) : str != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return f21.l(sb, this.d, "}");
    }
}
