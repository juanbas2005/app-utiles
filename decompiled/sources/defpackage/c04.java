package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c04 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ List z;

    public /* synthetic */ c04(aq4 aq4, ArrayList arrayList, List list, boolean z2, int i) {
        this.w = i;
        this.x = aq4;
        this.y = arrayList;
        this.z = list;
    }

    public final Object y(Object obj) {
        int i = this.w;
        List list = this.z;
        ArrayList arrayList = this.y;
        aq4 aq4 = this.x;
        vs7 vs7 = vs7.a;
        dh5 dh5 = (dh5) obj;
        switch (i) {
            case b85.b:
                dh5.w = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((e04) arrayList.get(i2)).l(dh5);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((e04) list.get(i3)).l(dh5);
                }
                dh5.w = false;
                aq4.getValue();
                return vs7;
            default:
                dh5.w = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((n34) arrayList.get(i4)).l(dh5);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((n34) list.get(i5)).l(dh5);
                }
                dh5.w = false;
                aq4.getValue();
                return vs7;
        }
    }
}
