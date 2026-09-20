package defpackage;

import java.util.ArrayList;

/* renamed from: of  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class of extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ ArrayList y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(int i, ArrayList arrayList) {
        super(1);
        this.x = i;
        this.y = arrayList;
    }

    public final Object y(Object obj) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        ArrayList arrayList = this.y;
        switch (i) {
            case b85.b:
                dh5 dh5 = (dh5) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dh5.k(dh5, (eh5) arrayList.get(i2), 0, 0);
                }
                return vs7;
            case 1:
                dh5 dh52 = (dh5) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        dh5.k(dh52, (eh5) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return vs7;
            case 2:
                dh5 dh53 = (dh5) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    dh53.g((eh5) arrayList.get(i4), 0, 0, 0.0f);
                }
                return vs7;
            default:
                dh5 dh54 = (dh5) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    dh5.l(dh54, (eh5) arrayList.get(i5), 0, 0, (vr2) null, 12);
                }
                return vs7;
        }
    }
}
