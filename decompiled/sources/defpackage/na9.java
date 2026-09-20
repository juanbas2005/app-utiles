package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: na9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class na9 extends ro8 {
    public final /* synthetic */ v39 A;
    public final boolean y;
    public final boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public na9(v39 v39, boolean z2, boolean z3) {
        super("log");
        this.A = v39;
        this.y = z2;
        this.z = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    public final bq8 a(no7 no7, List list) {
        int i;
        int i2;
        no7 no72 = no7;
        List list2 = list;
        ya5.y("log", 1, list2);
        int size = list2.size();
        qq8 qq8 = bq8.o;
        v39 v39 = this.A;
        if (size == 1) {
            ((ay4) v39.z).x(3, ((k68) no72.y).r(no72, (bq8) list2.get(0)).g(), Collections.EMPTY_LIST, this.y, this.z);
            return qq8;
        }
        k68 k68 = (k68) no72.y;
        k68 k682 = (k68) no72.y;
        int D = ya5.D(k68.r(no72, (bq8) list2.get(0)).p().doubleValue());
        if (D != 2) {
            i2 = 3;
            if (D == 3) {
                i = 1;
            } else if (D == 5) {
                i = 5;
            } else if (D == 6) {
                i = 2;
            }
            String g = k682.r(no72, (bq8) list2.get(1)).g();
            if (list2.size() != 2) {
                ((ay4) v39.z).x(i, g, Collections.EMPTY_LIST, this.y, this.z);
                return qq8;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list2.size(), 5); i3++) {
                arrayList.add(k682.r(no72, (bq8) list2.get(i3)).g());
            }
            ((ay4) v39.z).x(i, g, arrayList, this.y, this.z);
            return qq8;
        }
        i2 = 4;
        i = i2;
        String g2 = k682.r(no72, (bq8) list2.get(1)).g();
        if (list2.size() != 2) {
        }
    }
}
