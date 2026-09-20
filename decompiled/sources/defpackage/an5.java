package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: an5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an5 {
    public final cp7 a;
    public final List b;
    public final String c;
    public final an5 d;

    public an5(cp7 cp7, List list, String str) {
        cp7 cp72;
        cp7 cp73;
        list.getClass();
        this.a = cp7;
        this.b = list;
        this.c = str;
        an5 an5 = null;
        if (str != null) {
            if (cp7 != null) {
                cp72 = cp7.a();
            } else {
                cp72 = null;
            }
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cp7 cp74 = (cp7) it.next();
                if (cp74 != null) {
                    cp73 = cp74.a();
                } else {
                    cp73 = null;
                }
                arrayList.add(cp73);
            }
            an5 = new an5(cp72, arrayList, (String) null);
        }
        this.d = an5;
    }
}
