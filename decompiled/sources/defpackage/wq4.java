package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: wq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wq4 implements vq4 {
    public final ws5 a;
    public final us5 b;

    public wq4(ws5 ws5, us5 us5) {
        ws5.getClass();
        us5.getClass();
        this.a = ws5;
        this.b = us5;
    }

    public final String a(int i) {
        eo7 c = c(i);
        List list = (List) c.w;
        String E0 = dt0.E0((List) c.x, ".", (String) null, (String) null, (vr2) null, 62);
        if (list.isEmpty()) {
            return E0;
        }
        return dt0.E0(list, "/", (String) null, (String) null, (vr2) null, 62) + '/' + E0;
    }

    public final boolean b(int i) {
        return ((Boolean) c(i).y).booleanValue();
    }

    public final eo7 c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ts5 ts5 = (ts5) this.b.x.get(i);
            String str = (String) this.a.x.get(ts5.z);
            ss5 ss5 = ts5.A;
            ss5.getClass();
            int ordinal = ss5.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            } else {
                h.c();
                return null;
            }
            i = ts5.y;
        }
        return new eo7(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public final String getString(int i) {
        String str = (String) this.a.x.get(i);
        str.getClass();
        return str;
    }
}
