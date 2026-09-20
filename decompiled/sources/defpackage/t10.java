package defpackage;

/* renamed from: t10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t10 {
    public final String a;
    public final long b;
    public final int c;

    public t10(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10 = (t10) obj;
        String str = t10.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != t10.b) {
            return false;
        }
        int i = t10.c;
        int i2 = this.c;
        if (i2 == 0) {
            if (i == 0) {
                return true;
            }
            return false;
        } else if (b81.c(i2, i)) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i4 = this.c;
        if (i4 != 0) {
            i2 = b81.B(i4);
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "BAD_CONFIG";
        } else if (i != 3) {
            str = "null";
        } else {
            str = "AUTH_ERROR";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
