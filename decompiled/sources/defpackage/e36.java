package defpackage;

import java.util.ArrayList;

/* renamed from: e36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e36 {
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e36(ArrayList arrayList, String str, String str2, String str3, String str4) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e36)) {
            return false;
        }
        e36 e36 = (e36) obj;
        if (this.a.equals(e36.a) && this.b.equals(e36.b) && this.c.equals(e36.c) && this.d.equals(e36.d) && this.e.equals(e36.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSummary(rows=");
        sb.append(this.a);
        sb.append(", transferReceived=");
        sb.append(this.b);
        sb.append(", transferSent=");
        f21.v(sb, this.c, ", transferCommission=", this.d, ", total=");
        return f21.l(sb, this.e, ")");
    }
}
