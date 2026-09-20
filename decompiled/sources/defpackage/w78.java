package defpackage;

/* renamed from: w78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w78 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public w78(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static w78 a(w78 w78, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = w78.a;
        }
        if ((i & 2) != 0) {
            str2 = w78.b;
        }
        if ((i & 4) != 0) {
            str3 = w78.c;
        }
        if ((i & 8) != 0) {
            z = w78.d;
        }
        w78.getClass();
        return new w78(str, str2, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w78)) {
            return false;
        }
        w78 w78 = (w78) obj;
        if (sg3.e(this.a, w78.a) && sg3.e(this.b, w78.b) && sg3.e(this.c, w78.c) && this.d == w78.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Boolean.hashCode(this.d) + ((i5 + i3) * 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("VpnScreenData(configName=", this.a, ", endpoint=", this.b, ", address=");
        o.append(this.c);
        o.append(", connected=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
