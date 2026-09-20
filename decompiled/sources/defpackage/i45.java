package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: i45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i45 implements cz2 {
    public final /* synthetic */ bz2 c;

    public i45(bz2 bz2) {
        this.c = bz2;
    }

    public final Set l() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        bz2 bz2 = this.c;
        int size = bz2.size();
        for (int i = 0; i < size; i++) {
            String g = bz2.g(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = g.toLowerCase(locale);
            lowerCase.getClass();
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(bz2.l(i));
        }
        return treeMap.entrySet();
    }

    public final Set names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        bz2 bz2 = this.c;
        int size = bz2.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(bz2.g(i));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final boolean t() {
        return true;
    }

    public final List v(String str) {
        str.getClass();
        List n = this.c.n(str);
        if (!n.isEmpty()) {
            return n;
        }
        return null;
    }
}
