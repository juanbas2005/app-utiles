package defpackage;

/* renamed from: ym6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ym6 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final ke1 e;
    public final String f;
    public final String g;

    public ym6(String str, String str2, int i, long j, ke1 ke1, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = ke1;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym6)) {
            return false;
        }
        ym6 ym6 = (ym6) obj;
        if (sg3.e(this.a, ym6.a) && sg3.e(this.b, ym6.b) && this.c == ym6.c && this.d == ym6.d && this.e.equals(ym6.e) && this.f.equals(ym6.f) && sg3.e(this.g, ym6.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + hl6.h((this.e.hashCode() + pb4.b(f21.e(this.c, hl6.h(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return hl6.o(sb, this.g, ')');
    }
}
