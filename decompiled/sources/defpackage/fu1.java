package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: fu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fu1 {
    public static final String a = bc4.p("DiagnosticsWrkr");

    public static final String a(td8 td8, he8 he8, ja7 ja7, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            be8 be8 = (be8) it.next();
            id8 h = z85.h(be8);
            String str = be8.a;
            ja7.getClass();
            String str2 = h.a;
            int i = h.b;
            str2.getClass();
            ga7 ga7 = (ga7) sg3.O(ja7.a, true, false, new ia7(i, 0, str2));
            if (ga7 != null) {
                num = Integer.valueOf(ga7.c);
            } else {
                num = null;
            }
            td8.getClass();
            str.getClass();
            String E0 = dt0.E0((List) sg3.O(td8.a, true, false, new sd8(str, 0)), ",", (String) null, (String) null, (vr2) null, 62);
            he8.getClass();
            String E02 = dt0.E0((List) sg3.O(he8.a, true, false, new sd8(str, 12)), ",", (String) null, (String) null, (vr2) null, 62);
            StringBuilder q = b81.q("\n", str, "\t ");
            q.append(be8.c);
            q.append("\t ");
            q.append(num);
            q.append("\t ");
            q.append(be8.b.name());
            q.append("\t ");
            q.append(E0);
            q.append("\t ");
            q.append(E02);
            q.append(9);
            sb.append(q.toString());
        }
        return sb.toString();
    }
}
