package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: he8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class he8 {
    public final a96 a;
    public final bq1 b = new bq1(9);

    public he8(a96 a96) {
        this.a = a96;
    }

    public final void a(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sg3.O(this.a, false, true, new k77(24, (Object) this, (Object) new ge8((String) it.next(), str)));
        }
    }
}
