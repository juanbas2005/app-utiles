package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: in4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface in4 {
    int a(kg3 kg3, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new bm1((gh4) list2.get(i3), lg3.x, pg3.w, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList2, m31.b(0, 0, 0, i, 7)).e();
    }

    mh4 b(oh4 oh4, List list, long j);

    int c(kg3 kg3, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new bm1((gh4) list2.get(i3), lg3.w, pg3.w, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList2, m31.b(0, 0, 0, i, 7)).e();
    }

    int d(kg3 kg3, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new bm1((gh4) list2.get(i3), lg3.x, pg3.x, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList2, m31.b(0, i, 0, 0, 13)).c();
    }

    int e(kg3 kg3, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new bm1((gh4) list2.get(i3), lg3.w, pg3.x, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList2, m31.b(0, i, 0, 0, 13)).c();
    }
}
