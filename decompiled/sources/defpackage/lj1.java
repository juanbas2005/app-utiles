package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: lj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lj1 {
    public static final lj1 b = new lj1(sg3.E("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    public final List a;

    static {
        new lj1(sg3.E("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public lj1(List list) {
        this.a = list;
        if (list.size() == 7) {
            Iterator it = sg3.v(list).iterator();
            while (((qe3) it).y) {
                int nextInt = ((je3) it).nextInt();
                if (((CharSequence) this.a.get(nextInt)).length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i < nextInt) {
                            if (!sg3.e(this.a.get(nextInt), this.a.get(i))) {
                                i++;
                            } else {
                                h.j(f21.l(new StringBuilder("Day-of-week names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                                throw null;
                            }
                        }
                    }
                } else {
                    h.q("A day-of-week name can not be empty");
                    throw null;
                }
            }
            return;
        }
        h.q("Day of week names must contain exactly 7 elements");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lj1)) {
            return false;
        }
        if (this.a.equals(((lj1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dt0.E0(this.a, ", ", "DayOfWeekNames(", ")", kj1.D, 24);
    }
}
