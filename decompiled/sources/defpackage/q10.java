package defpackage;

/* renamed from: q10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final jz0 f;

    public q10(String str, String str2, String str3, String str4, int i, jz0 jz0) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = jz0;
                        return;
                    }
                    ku4.j("Null installUuid");
                    throw null;
                }
                ku4.j("Null versionName");
                throw null;
            }
            ku4.j("Null versionCode");
            throw null;
        }
        ku4.j("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q10) {
            q10 q10 = (q10) obj;
            if (!this.a.equals(q10.a) || !this.b.equals(q10.b) || !this.c.equals(q10.c) || !this.d.equals(q10.d) || this.e != q10.e || this.f != q10.f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
