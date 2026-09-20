package defpackage;

/* renamed from: g10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g10 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        byte b2 = (byte) (((byte) (0 | 2)) | 1);
        if (b2 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            h.s(f21.i("Missing required properties:", sb));
        }
    }

    public g10(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f10, java.lang.Object] */
    public final f10 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10 = (g10) obj;
        String str = g10.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!b81.c(this.b, g10.b)) {
            return false;
        }
        String str3 = g10.c;
        String str4 = this.c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = g10.d;
        String str6 = this.d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.e != g10.e || this.f != g10.f) {
            return false;
        }
        String str7 = g10.g;
        String str8 = this.g;
        if (str8 == null) {
            if (str7 == null) {
                return true;
            }
            return false;
        } else if (str8.equals(str7)) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        String str = this.a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int B = (((i ^ 1000003) * 1000003) ^ b81.B(this.b)) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (B ^ i2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.e;
        long j2 = this.f;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i == 4) {
            str = "REGISTERED";
        } else if (i != 5) {
            str = "null";
        } else {
            str = "REGISTER_ERROR";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return f21.l(sb, this.g, "}");
    }
}
