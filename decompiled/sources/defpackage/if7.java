package defpackage;

/* renamed from: if7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class if7 {
    public final String a;
    public final String b;

    public if7(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public static if7 a(if7 if7, String str) {
        String str2 = if7.a;
        if7.getClass();
        str2.getClass();
        return new if7(str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if7)) {
            return false;
        }
        if7 if7 = (if7) obj;
        if (sg3.e(this.a, if7.a) && sg3.e(this.b, if7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return pb4.m("TextFiledData(value=", this.a, ", errorMessage=", this.b, ")");
    }
}
