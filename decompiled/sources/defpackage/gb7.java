package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: gb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gb7 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public gb7(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb7)) {
            return false;
        }
        gb7 gb7 = (gb7) obj;
        if (!this.a.equals(gb7.a) || !this.b.equals(gb7.b) || !sg3.e(this.c, gb7.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = gb7.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(fb5.j(dt0.U0(this.b.values(), new a91(27))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(fb5.j(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = dt0.U0(set, new a91(28));
        } else {
            collection = a42.w;
        }
        sb.append(fb5.j(collection));
        sb.append("\n            |}\n        ");
        return e57.g0(sb.toString());
    }
}
