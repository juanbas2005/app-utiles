package defpackage;

/* renamed from: v00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v00 {
    public final String a;
    public final String b;
    public final String c;

    public v00(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        ku4.j("Null crashlyticsInstallId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v00) {
            v00 v00 = (v00) obj;
            if (this.a.equals(v00.a)) {
                String str = v00.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = v00.c;
                    String str4 = this.c;
                    if (str4 != null ? !str4.equals(str3) : str3 != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i2 = 0;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return f21.l(sb, this.c, "}");
    }
}
