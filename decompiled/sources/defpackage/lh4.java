package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface lh4 {
    int a(kg3 kg3, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bm1((gh4) list.get(i2), lg3.x, pg3.w, 0));
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList, m31.b(0, 0, 0, i, 7)).e();
    }

    mh4 b(oh4 oh4, List list, long j);

    int c(kg3 kg3, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bm1((gh4) list.get(i2), lg3.w, pg3.w, 0));
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList, m31.b(0, 0, 0, i, 7)).e();
    }

    int d(kg3 kg3, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bm1((gh4) list.get(i2), lg3.x, pg3.x, 0));
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList, m31.b(0, i, 0, 0, 13)).c();
    }

    int e(kg3 kg3, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bm1((gh4) list.get(i2), lg3.w, pg3.x, 0));
        }
        return b(new zg3(kg3, kg3.getLayoutDirection()), arrayList, m31.b(0, i, 0, 0, 13)).c();
    }
}
