package defpackage;

import java.util.Locale;

/* renamed from: db7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class db7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public db7(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (d57.x0(upperCase, "INT", false)) {
            i3 = 3;
        } else if (d57.x0(upperCase, "CHAR", false) || d57.x0(upperCase, "CLOB", false) || d57.x0(upperCase, "TEXT", false)) {
            i3 = 2;
        } else if (d57.x0(upperCase, "BLOB", false)) {
            i3 = 5;
        } else if (d57.x0(upperCase, "REAL", false) || d57.x0(upperCase, "FLOA", false) || d57.x0(upperCase, "DOUB", false)) {
            i3 = 4;
        } else {
            i3 = 1;
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj instanceof db7) {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                db7 db7 = (db7) obj;
                int i = db7.f;
                if (db7.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2 && sg3.e(this.a, db7.a) && this.c == db7.c) {
                    String str = db7.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || fb5.h(str2, str)) && ((i2 != 2 || i != 1 || str == null || fb5.h(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : fb5.h(str2, str))) && this.g == db7.g))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.g) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return e57.e0(e57.g0(sb.toString()));
    }
}
