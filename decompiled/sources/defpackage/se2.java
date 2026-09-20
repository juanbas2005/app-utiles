package defpackage;

/* renamed from: se2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class se2 {
    public final String a;
    public final String b;

    public se2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se2)) {
            return false;
        }
        se2 se2 = (se2) obj;
        if (sg3.e(this.a, se2.a) && sg3.e(this.b, se2.b)) {
            return true;
        }
        return false;
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
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        return hl6.o(sb, this.b, ')');
    }
}
