package defpackage;

/* renamed from: zz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zz extends da1 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public zz(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof da1) {
            zz zzVar = (zz) ((da1) obj);
            if (this.a == zzVar.a && this.b.equals(zzVar.b)) {
                String str = zzVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == zzVar.d && this.e == zzVar.e) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.d;
        return this.e ^ ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return hl6.n(sb, this.e, "}");
    }
}
