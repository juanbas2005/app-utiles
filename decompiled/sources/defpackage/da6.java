package defpackage;

import java.util.ArrayList;

/* renamed from: da6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class da6 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ da6(ue8 ue8, int i, eh5 eh5, int i2, oh4 oh4) {
        this.z = ue8;
        this.x = i;
        this.A = eh5;
        this.y = i2;
        this.B = oh4;
    }

    public final Object y(Object obj) {
        ba6 ba6;
        int i;
        int i2 = this.w;
        int i3 = 0;
        int i4 = this.y;
        int i5 = this.x;
        vs7 vs7 = vs7.a;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i2) {
            case b85.b:
                eh5[] eh5Arr = (eh5[]) obj4;
                ea6 ea6 = (ea6) obj3;
                int[] iArr = (int[]) obj2;
                dh5 dh5 = (dh5) obj;
                int length = eh5Arr.length;
                int i6 = 0;
                while (i3 < length) {
                    eh5 eh5 = eh5Arr[i3];
                    int i7 = i6 + 1;
                    eh5.getClass();
                    Object B2 = eh5.B();
                    ie1 ie1 = null;
                    if (B2 instanceof ba6) {
                        ba6 = (ba6) B2;
                    } else {
                        ba6 = null;
                    }
                    if (ba6 != null) {
                        ie1 = ba6.c;
                    }
                    ie1 ie12 = ie1;
                    int i8 = this.x;
                    if (ie12 != null) {
                        i = ie12.o(i8, eh5.x, ey3.w, eh5, this.y);
                    } else {
                        i = ea6.b.a(eh5.x, i8);
                    }
                    dh5.g(eh5, iArr[i6], i, 0.0f);
                    i3++;
                    i6 = i7;
                }
                return vs7;
            case 1:
                ArrayList arrayList = (ArrayList) obj4;
                wi6 wi6 = (wi6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                dh5 dh52 = (dh5) obj;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    eh5 eh52 = (eh5) arrayList.get(i9);
                    dh52.g(eh52, 0, (i4 - eh52.x) / 2, 0.0f);
                }
                int r0 = dh52.r0(8.0f) + dh52.r0(xi6.c);
                uj ujVar = wi6.c;
                if (ujVar != null) {
                    i5 = ((Number) ujVar.d()).intValue();
                }
                int i10 = r0 + i5;
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    eh5 eh53 = (eh5) arrayList2.get(i3);
                    dh52.g(eh53, i10, (i4 - eh53.x) / 2, 0.0f);
                    i3++;
                }
                return vs7;
            default:
                eh5 eh54 = (eh5) obj3;
                dh5.j((dh5) obj, eh54, ((oe3) ((ue8) obj4).L.H(new we3((((long) (i5 - eh54.w)) << 32) | (((long) (i4 - eh54.x)) & 4294967295L)), ((oh4) obj2).getLayoutDirection())).a);
                return vs7;
        }
    }

    public /* synthetic */ da6(ArrayList arrayList, wi6 wi6, int i, ArrayList arrayList2, int i2) {
        this.z = arrayList;
        this.A = wi6;
        this.x = i;
        this.B = arrayList2;
        this.y = i2;
    }

    public /* synthetic */ da6(eh5[] eh5Arr, ea6 ea6, int i, int i2, int[] iArr) {
        this.z = eh5Arr;
        this.A = ea6;
        this.x = i;
        this.y = i2;
        this.B = iArr;
    }
}
