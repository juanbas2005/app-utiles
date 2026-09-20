package defpackage;

/* renamed from: cz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz extends ra1 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final qa1 k;
    public final w91 l;
    public final t91 m;

    public cz(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, qa1 qa1, w91 w91, t91 t91) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = qa1;
        this.l = w91;
        this.m = t91;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bz, java.lang.Object] */
    public final bz a() {
        ? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.e;
        obj.e = this.f;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ra1) {
            cz czVar = (cz) ((ra1) obj);
            if (this.b.equals(czVar.b) && this.c.equals(czVar.c) && this.d == czVar.d && this.e.equals(czVar.e)) {
                String str = czVar.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = czVar.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = czVar.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(czVar.i) && this.j.equals(czVar.j)) {
                                qa1 qa1 = czVar.k;
                                qa1 qa12 = this.k;
                                if (qa12 != null ? qa12.equals(qa1) : qa1 == null) {
                                    w91 w91 = czVar.l;
                                    w91 w912 = this.l;
                                    if (w912 != null ? w912.equals(w91) : w91 == null) {
                                        t91 t91 = czVar.m;
                                        t91 t912 = this.m;
                                        if (t912 != null ? !t912.equals(t91) : t91 != null) {
                                            return false;
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i8 = (hashCode ^ i2) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int hashCode2 = (((((i9 ^ i4) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        qa1 qa1 = this.k;
        if (qa1 == null) {
            i5 = 0;
        } else {
            i5 = qa1.hashCode();
        }
        int i10 = (hashCode2 ^ i5) * 1000003;
        w91 w91 = this.l;
        if (w91 == null) {
            i6 = 0;
        } else {
            i6 = w91.hashCode();
        }
        int i11 = (i10 ^ i6) * 1000003;
        t91 t91 = this.m;
        if (t91 != null) {
            i7 = t91.hashCode();
        }
        return i11 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
