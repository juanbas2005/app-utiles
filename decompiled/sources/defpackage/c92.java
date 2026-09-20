package defpackage;

import java.util.Calendar;

/* renamed from: c92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c92 {
    public final String a;
    public final Calendar b;
    public final long c;

    public c92(String str, Calendar calendar, long j) {
        str.getClass();
        this.a = str;
        this.b = calendar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92 = (c92) obj;
        if (sg3.e(this.a, c92.a) && this.b.equals(c92.b) && jt0.c(this.c, c92.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = jt0.h;
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String i = jt0.i(this.c);
        StringBuilder sb = new StringBuilder("ExpiryEntry(label=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", color=");
        return f21.l(sb, i, ")");
    }
}
