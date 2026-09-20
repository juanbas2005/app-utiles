package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fb7 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public fb7(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add("ASC");
            }
            arrayList = arrayList2;
        }
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fb7) {
            fb7 fb7 = (fb7) obj;
            String str = fb7.a;
            if (this.b == fb7.b && this.c.equals(fb7.c) && sg3.e(this.d, fb7.d)) {
                String str2 = this.a;
                if (k57.u0(str2, "index_", false)) {
                    return k57.u0(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        if (k57.u0(str, "index_", false)) {
            i = -1184239155;
        } else {
            i = str.hashCode();
        }
        return this.d.hashCode() + hl6.j(this.c, ((i * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return e57.e0(e57.g0("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + fb5.o(this.c) + "\n            |   orders = {" + fb5.n(this.d) + "\n            |}\n        "));
    }
}
