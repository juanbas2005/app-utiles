package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: wy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wy2 {
    public final String a;
    public final List b;
    public final double c;

    public wy2(String str, List list) {
        Double d;
        Object obj;
        String str2;
        Double i0;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (sg3.e(((xy2) obj).a, "q")) {
                break;
            }
        }
        xy2 xy2 = (xy2) obj;
        double d2 = 1.0d;
        if (!(xy2 == null || (str2 = xy2.b) == null || (i0 = j57.i0(str2)) == null)) {
            double doubleValue = i0.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d = i0;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy2)) {
            return false;
        }
        wy2 wy2 = (wy2) obj;
        if (sg3.e(this.a, wy2.a) && sg3.e(this.b, wy2.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
