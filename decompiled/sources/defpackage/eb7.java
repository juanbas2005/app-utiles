package defpackage;

import java.util.List;

/* renamed from: eb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eb7 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public eb7(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb7)) {
            return false;
        }
        eb7 eb7 = (eb7) obj;
        if (sg3.e(this.a, eb7.a) && sg3.e(this.b, eb7.b) && sg3.e(this.c, eb7.c) && this.d.equals(eb7.d)) {
            return this.e.equals(eb7.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl6.j(this.d, hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return e57.e0(e57.g0("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + fb5.o(dt0.T0(this.d)) + "\n            |   referenceColumnNames = {" + fb5.n(dt0.T0(this.e)) + "\n            |}\n        "));
    }
}
