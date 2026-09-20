package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aq8 extends ro8 {
    public final no7 A;
    public final ArrayList y;
    public final ArrayList z;

    public aq8(String str, ArrayList arrayList, List list, no7 no7) {
        super(str);
        this.y = new ArrayList();
        this.A = no7;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.y.add(((bq8) it.next()).g());
            }
        }
        this.z = new ArrayList(list);
    }

    public final bq8 a(no7 no7, List list) {
        qq8 qq8;
        no7 k = this.A.k();
        k68 k68 = (k68) k.y;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            int size = arrayList.size();
            qq8 = bq8.o;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                k.o((String) arrayList.get(i), ((k68) no7.y).r(no7, (bq8) list.get(i)));
            } else {
                k.o((String) arrayList.get(i), qq8);
            }
            i++;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            bq8 bq8 = (bq8) it.next();
            bq8 r = k68.r(k, bq8);
            if (r instanceof gq8) {
                r = k68.r(k, bq8);
            }
            if (r instanceof cn8) {
                return ((cn8) r).w;
            }
        }
        return qq8;
    }

    public final bq8 v() {
        return new aq8(this);
    }

    public aq8(aq8 aq8) {
        super(aq8.w);
        ArrayList arrayList = new ArrayList(aq8.y.size());
        this.y = arrayList;
        arrayList.addAll(aq8.y);
        ArrayList arrayList2 = new ArrayList(aq8.z.size());
        this.z = arrayList2;
        arrayList2.addAll(aq8.z);
        this.A = aq8.A;
    }
}
