package defpackage;

import java.util.ArrayList;

/* renamed from: tf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tf6 implements vr2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ aa8 D;
    public final /* synthetic */ q67 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ Integer I;
    public final /* synthetic */ Integer J;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ dv5 z;

    public /* synthetic */ tf6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, dv5 dv5, ArrayList arrayList4, int i, int i2, aa8 aa8, q67 q67, int i3, int i4, ArrayList arrayList5, Integer num, Integer num2) {
        this.w = arrayList;
        this.x = arrayList2;
        this.y = arrayList3;
        this.z = dv5;
        this.A = arrayList4;
        this.B = i;
        this.C = i2;
        this.D = aa8;
        this.E = q67;
        this.F = i3;
        this.G = i4;
        this.H = arrayList5;
        this.I = num;
        this.J = num2;
    }

    public final Object y(Object obj) {
        int i;
        int i2;
        dh5 dh5 = (dh5) obj;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            dh5.g((eh5) arrayList.get(i3), 0, 0, 1.0f);
        }
        ArrayList arrayList2 = this.x;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            dh5.g((eh5) arrayList2.get(i4), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.y;
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            i = this.F;
            if (i5 >= size3) {
                break;
            }
            int i6 = this.B - this.C;
            q67 q67 = this.E;
            ey3 layoutDirection = q67.getLayoutDirection();
            aa8 aa8 = this.D;
            dh5.g((eh5) arrayList3.get(i5), ((aa8.d(q67, layoutDirection) + i6) - aa8.b(q67, q67.getLayoutDirection())) / 2, i - this.G, 2.0f);
            i5++;
        }
        dv5 dv5 = this.z;
        if (dv5 != null) {
            ArrayList arrayList4 = this.H;
            int size4 = arrayList4.size();
            for (int i7 = 0; i7 < size4; i7++) {
                int i8 = dv5.b;
                Integer num = this.I;
                num.getClass();
                dh5.g((eh5) arrayList4.get(i7), i8, i - num.intValue(), 4.0f);
            }
        }
        ArrayList arrayList5 = this.A;
        int size5 = arrayList5.size();
        for (int i9 = 0; i9 < size5; i9++) {
            eh5 eh5 = (eh5) arrayList5.get(i9);
            Integer num2 = this.J;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            dh5.g(eh5, 0, i - i2, 3.0f);
        }
        return vs7.a;
    }
}
