package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xl implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ArrayList x;

    public /* synthetic */ xl(int i, ArrayList arrayList) {
        this.w = i;
        this.x = arrayList;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = 0;
        ArrayList arrayList = this.x;
        switch (i) {
            case b85.b:
                dh5 dh5 = (dh5) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dh5.k(dh5, (eh5) arrayList.get(i3), 0, 0);
                }
                return vs7;
            case 1:
                dh5 dh52 = (dh5) obj;
                int size2 = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    eh5 eh5 = (eh5) arrayList.get(i5);
                    dh5.k(dh52, eh5, i4, 0);
                    i4 += eh5.w;
                }
                return vs7;
            case 2:
                dh5 dh53 = (dh5) obj;
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    ph4 ph4 = (ph4) arrayList.get(i6);
                    List list = ph4.b;
                    boolean z = ph4.g;
                    if (ph4.k == Integer.MIN_VALUE) {
                        bc3.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i7 = i2;
                    while (i7 < size4) {
                        eh5 eh52 = (eh5) list.get(i7);
                        int[] iArr = ph4.i;
                        int i8 = i7 * 2;
                        int i9 = size3;
                        long c = oe3.c((((long) iArr[i8 + 1]) & 4294967295L) | (((long) iArr[i8]) << 32), ph4.c);
                        if (z) {
                            dh5.r(dh53, eh52, c);
                        } else {
                            dh5.m(dh53, eh52, c);
                        }
                        i7++;
                        size3 = i9;
                    }
                    int i10 = size3;
                    i6++;
                    i2 = 0;
                }
                return vs7;
            default:
                dh5 dh54 = (dh5) obj;
                int size5 = arrayList.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    dh54.g((eh5) arrayList.get(i11), 0, 0, 0.0f);
                }
                return vs7;
        }
    }
}
