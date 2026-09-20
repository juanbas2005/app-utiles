package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cl6  reason: default package */
public abstract class cl6 extends dl6 {
    public static al6 O(Iterator it) {
        it.getClass();
        return new g21(new cn3(it, 1));
    }

    public static al6 P(al6 al6, int i) {
        if (i < 0) {
            h.j(pb4.i(i, "Requested element count ", " is less than zero."));
            return null;
        } else if (i == 0) {
            return al6;
        } else {
            if (al6 instanceof i02) {
                return ((i02) al6).a(i);
            }
            return new g02(al6, i);
        }
    }

    public static final xg2 Q(al6 al6) {
        nf6 nf6 = new nf6(16);
        if (!(al6 instanceof wl7)) {
            return new xg2(al6, new nf6(17), nf6);
        }
        wl7 wl7 = (wl7) al6;
        return new xg2(wl7.a, wl7.b, nf6);
    }

    public static al6 R(sr2 sr2) {
        return new g21(new cv2(sr2, (vr2) new sn(6, sr2)));
    }

    public static al6 S(vr2 vr2, Object obj) {
        vr2.getClass();
        if (obj == null) {
            return f42.a;
        }
        return new cv2((sr2) new hx4(21, obj), vr2);
    }

    public static String T(al6 al6, String str) {
        al6.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (Object next : al6) {
            i++;
            if (i > 1) {
                sb.append(str);
            }
            g75.f(sb, next, (vr2) null);
        }
        sb.append("");
        return sb.toString();
    }

    public static Object U(al6 al6) {
        Iterator it = al6.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        kj6.i("Sequence is empty.");
        return null;
    }

    public static List V(al6 al6) {
        Iterator it = al6.iterator();
        if (!it.hasNext()) {
            return a42.w;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return sg3.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
