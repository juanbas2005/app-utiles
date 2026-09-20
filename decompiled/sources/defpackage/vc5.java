package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc5 implements Iterable, ar3 {
    public static final vc5 x = new vc5(b42.w);
    public final Map w;

    public vc5(Map map) {
        this.w = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc5)) {
            return false;
        }
        if (sg3.e(this.w, ((vc5) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final Iterator iterator() {
        Map map = this.w;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new yb5(str, (Object) null));
            } else {
                ku4.a();
                return null;
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.w + ')';
    }
}
