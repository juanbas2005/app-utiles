package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: fm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fm4 {
    public static final fm4 b = new fm4(sg3.E("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    public final List a;

    static {
        new fm4(sg3.E("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
    }

    public fm4(List list) {
        this.a = list;
        if (list.size() == 12) {
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
                                h.j(f21.l(new StringBuilder("Month names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                                throw null;
                            }
                        }
                    }
                } else {
                    h.q("A month name can not be empty");
                    throw null;
                }
            }
            return;
        }
        h.q("Month names must contain exactly 12 elements");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fm4)) {
            return false;
        }
        if (this.a.equals(((fm4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dt0.E0(this.a, ", ", "MonthNames(", ")", em4.D, 24);
    }
}
