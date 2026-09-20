package defpackage;

/* renamed from: mz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mz extends y91 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public mz(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y91) {
            mz mzVar = (mz) ((y91) obj);
            if (this.a.equals(mzVar.a) && this.b.equals(mzVar.b)) {
                String str = mzVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = mzVar.d;
                    String str4 = this.d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = mzVar.e;
                        String str6 = this.e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = mzVar.f;
                            String str8 = this.f;
                            if (str8 != null ? !str8.equals(str7) : str7 != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i4 = 0;
        String str = this.c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (hashCode ^ i) * -721379959;
        String str2 = this.d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 ^ i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return f21.l(sb, this.f, "}");
    }
}
