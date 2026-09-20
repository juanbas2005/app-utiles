package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ho1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ho1 {
    public final String a;
    public final wv2 b;

    public ho1(Set set, wv2 wv2) {
        this.a = b(set);
        this.b = wv2;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            y00 y00 = (y00) it.next();
            sb.append(y00.a);
            sb.append('/');
            sb.append(y00.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        wv2 wv2 = this.b;
        synchronized (((HashSet) wv2.x)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) wv2.x);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) wv2.x)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) wv2.x);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
