package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: jq3  reason: default package */
public final class jq3 implements sr2 {
    public final /* synthetic */ int w;
    public final kq3 x;

    public /* synthetic */ jq3(kq3 kq3, int i) {
        this.w = i;
        this.x = kq3;
    }

    public final Object b() {
        int i = this.w;
        kq3 kq3 = this.x;
        switch (i) {
            case b85.b:
                boolean e = kq3.e();
                if (e) {
                    y16 y16 = kq3.m;
                    yr3[] yr3Arr = kq3.w;
                    yr3 yr3 = yr3Arr[10];
                    Object b = y16.b();
                    b.getClass();
                    y16 y162 = kq3.o;
                    yr3 yr32 = yr3Arr[12];
                    Object b2 = y162.b();
                    b2.getClass();
                    return dt0.M0((Collection) b, (Collection) b2);
                } else if (!e) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : kq3.a()) {
                        if (!mb2.e((p16) next)) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                } else {
                    h.c();
                    return null;
                }
            case 1:
                boolean e2 = kq3.e();
                if (e2) {
                    y16 y163 = kq3.n;
                    yr3[] yr3Arr2 = kq3.w;
                    yr3 yr33 = yr3Arr2[11];
                    Object b3 = y163.b();
                    b3.getClass();
                    y16 y164 = kq3.p;
                    yr3 yr34 = yr3Arr2[13];
                    Object b4 = y164.b();
                    b4.getClass();
                    return dt0.M0((Collection) b3, (Collection) b4);
                } else if (!e2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : kq3.a()) {
                        if (mb2.e((p16) next2)) {
                            arrayList2.add(next2);
                        }
                    }
                    return arrayList2;
                } else {
                    h.c();
                    return null;
                }
            default:
                y16 y165 = kq3.m;
                yr3[] yr3Arr3 = kq3.w;
                yr3 yr35 = yr3Arr3[10];
                Object b5 = y165.b();
                b5.getClass();
                y16 y166 = kq3.n;
                yr3 yr36 = yr3Arr3[11];
                Object b6 = y166.b();
                b6.getClass();
                return dt0.M0((Collection) b5, (Collection) b6);
        }
    }
}
