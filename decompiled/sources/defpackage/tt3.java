package defpackage;

/* renamed from: tt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt3 extends fu3 {
    public final String a;
    public final String b;

    public tt3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt3)) {
            return false;
        }
        tt3 tt3 = (tt3) obj;
        if (sg3.e(this.a, tt3.a) && sg3.e(this.b, tt3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.a);
        sb.append('.');
        return hl6.o(sb, this.b, ')');
    }
}
