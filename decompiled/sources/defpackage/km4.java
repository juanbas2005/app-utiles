package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: km4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km4 {
    public final ArrayList a;

    public km4(s96 s96, s96 s962) {
        yb5 yb5;
        Throwable th;
        float f;
        float f2;
        yb5 yb52;
        yb5 yb53;
        float f3;
        s96 s963 = s96;
        s96 s964 = s962;
        rh4 T = fd1.T(new pj(s963.b, s963.c), s963);
        rh4 T2 = fd1.T(new pj(s964.b, s964.c), s964);
        List list = T.y;
        List list2 = T2.y;
        list.getClass();
        list2.getClass();
        n74 m = sg3.m();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((tq5) list.get(i)).b instanceof ac2) {
                m.add(list.get(i));
            }
        }
        n74 i2 = sg3.i(m);
        n74 m2 = sg3.m();
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((tq5) list2.get(i3)).b instanceof ac2) {
                m2.add(list2.get(i3));
            }
        }
        n74 i4 = sg3.i(m2);
        if (i2.f() > i4.f()) {
            yb5 = new yb5(rd3.o(i4, i2), i4);
        } else {
            yb5 = new yb5(i2, rd3.o(i2, i4));
        }
        List list3 = (List) yb5.w;
        List list4 = (List) yb5.x;
        n74 m3 = sg3.m();
        int size3 = list3.size();
        int i5 = 0;
        while (i5 < size3 && i5 != list4.size()) {
            m3.add(new yb5(Float.valueOf(((tq5) list3.get(i5)).a), Float.valueOf(((tq5) list4.get(i5)).a)));
            i5++;
        }
        yb5[] yb5Arr = (yb5[]) sg3.i(m3).toArray(new yb5[0]);
        fx1 fx1 = new fx1((yb5[]) Arrays.copyOf(yb5Arr, yb5Arr.length));
        vo4 vo4 = fx1.a;
        vo4 vo42 = fx1.b;
        float I = ar7.I(vo4, vo42, 0.0f);
        ArrayList arrayList = T2.x;
        if (0.0f > I || I > 1.0f) {
            h.q("Cutting point is expected to be between 0 and 1");
            throw null;
        }
        if (I < 1.0E-4f) {
            th = null;
        } else {
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                }
                qh4 qh4 = (qh4) it.next();
                float f4 = qh4.c;
                if (I <= qh4.d && f4 <= I) {
                    break;
                }
                i6++;
            }
            yb5 a2 = ((qh4) arrayList.get(i6)).a(I);
            qh4 qh42 = (qh4) a2.w;
            ArrayList I2 = sg3.I(((qh4) a2.x).a);
            int size4 = arrayList.size();
            for (int i7 = 1; i7 < size4; i7++) {
                I2.add(((qh4) arrayList.get((i7 + i6) % arrayList.size())).a);
            }
            th = null;
            I2.add(qh42.a);
            vo4 vo43 = new vo4(arrayList.size() + 2);
            int size5 = arrayList.size() + 2;
            for (int i8 = 0; i8 < size5; i8++) {
                if (i8 == 0) {
                    f3 = 0.0f;
                } else if (i8 == arrayList.size() + 1) {
                    f3 = 1.0f;
                } else {
                    f3 = j18.d(((qh4) arrayList.get(((i6 + i8) - 1) % arrayList.size())).d - I, 1.0f);
                }
                vo43.a(f3);
            }
            n74 m4 = sg3.m();
            int size6 = list2.size();
            for (int i9 = 0; i9 < size6; i9++) {
                m4.add(new tq5(j18.d(((tq5) list2.get(i9)).a - I, 1.0f), ((tq5) list2.get(i9)).b));
            }
            T2 = new rh4(T2.w, sg3.i(m4), I2, vo43);
        }
        ArrayList arrayList2 = new ArrayList();
        qh4 qh43 = (qh4) dt0.z0(0, T);
        qh4 qh44 = (qh4) dt0.z0(0, T2);
        int i10 = 1;
        int i11 = 1;
        while (qh43 != null && qh44 != null) {
            if (i11 == T.x.size()) {
                f = 1.0f;
            } else {
                f = qh43.d;
            }
            if (i10 == T2.x.size()) {
                f2 = 1.0f;
            } else {
                f2 = ar7.I(vo42, vo4, j18.d(qh44.d + I, 1.0f));
            }
            float min = Math.min(f, f2);
            float f5 = 1.0E-6f + min;
            if (f > f5) {
                yb52 = qh43.a(min);
            } else {
                yb5 yb54 = new yb5(qh43, dt0.z0(i11, T));
                i11++;
                yb52 = yb54;
            }
            qh4 qh45 = (qh4) yb52.w;
            qh43 = (qh4) yb52.x;
            if (f2 > f5) {
                yb53 = qh44.a(j18.d(ar7.I(vo4, vo42, min) - I, 1.0f));
            } else {
                yb5 yb55 = new yb5(qh44, dt0.z0(i10, T2));
                i10++;
                yb53 = yb55;
            }
            qh44 = (qh4) yb53.x;
            arrayList2.add(new yb5(qh45.a, ((qh4) yb53.w).a));
        }
        if (qh43 == null && qh44 == null) {
            this.a = arrayList2;
        } else {
            h.q("Expected both Polygon's Cubic to be fully matched");
            throw th;
        }
    }
}
