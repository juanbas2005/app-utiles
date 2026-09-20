package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bb7 implements vr2 {
    public final /* synthetic */ k31 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ fw0 C;
    public final /* synthetic */ ArrayList D;
    public final /* synthetic */ int E;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ q67 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ f06 z;

    public /* synthetic */ bb7(ArrayList arrayList, q67 q67, gs2 gs2, f06 f06, k31 k31, int i, fw0 fw0, ArrayList arrayList2, int i2) {
        this.w = arrayList;
        this.x = q67;
        this.y = gs2;
        this.z = f06;
        this.A = k31;
        this.B = i;
        this.C = fw0;
        this.D = arrayList2;
        this.E = i2;
    }

    public final Object y(Object obj) {
        int i;
        boolean z2;
        boolean z3;
        dh5 dh5 = (dh5) obj;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dh5.k(dh5, (eh5) arrayList.get(i2), this.z.w * i2, 0);
        }
        cb7 cb7 = cb7.x;
        q67 q67 = this.x;
        List x2 = q67.x(this.y, cb7);
        int size2 = x2.size();
        int i3 = 0;
        while (true) {
            i = this.B;
            if (i3 >= size2) {
                break;
            }
            eh5 y2 = ((gh4) x2.get(i3)).y(k31.a(this.A.a, 0, 0, 0, 0, 11));
            dh5.k(dh5, y2, 0, i - y2.x);
            i3++;
        }
        List x3 = q67.x(new fw0(1918742627, new dx4(16, this.C, this.D), true), cb7.y);
        int size3 = x3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            gh4 gh4 = (gh4) x3.get(i4);
            int i5 = this.E;
            if (i5 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 || !z3) {
                ac3.a("width and height must be >= 0");
            }
            dh5.k(dh5, gh4.y(m31.h(i5, i5, i, i)), 0, 0);
        }
        return vs7.a;
    }
}
