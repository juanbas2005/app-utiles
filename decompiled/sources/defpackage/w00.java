package defpackage;

/* renamed from: w00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w00 {
    public final String a;
    public final String b;
    public final String c;
    public final t10 d;
    public final int e;

    public w00(String str, String str2, String str3, t10 t10, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t10;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00 = (w00) obj;
        String str = w00.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = w00.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = w00.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        t10 t10 = w00.d;
        t10 t102 = this.d;
        if (t102 == null) {
            if (t10 != null) {
                return false;
            }
        } else if (!t102.equals(t10)) {
            return false;
        }
        int i = w00.e;
        int i2 = this.e;
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
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        String str = this.a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        t10 t10 = this.d;
        if (t10 == null) {
            i4 = 0;
        } else {
            i4 = t10.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        int i10 = this.e;
        if (i10 != 0) {
            i5 = b81.B(i10);
        }
        return i9 ^ i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = "null";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
