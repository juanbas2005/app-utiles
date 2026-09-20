package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* renamed from: pk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pk6 {
    public static final Comparator[] a;
    public static final lk6 b = lk6.A;

    static {
        a91 a91;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                a91 = a91.C;
            } else {
                a91 = a91.z;
            }
            comparatorArr[i] = new la2(5, new la2(a91));
        }
        a = comparatorArr;
    }

    public static final void a(fk6 fk6, ArrayList arrayList, pb pbVar, pb pbVar2, yo4 yo4) {
        ak6 ak6 = fk6.d;
        Object g = ak6.w.g(jk6.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) pbVar2.y(fk6)).booleanValue()) && ((Boolean) pbVar.y(fk6)).booleanValue()) {
            arrayList.add(fk6);
        }
        if (booleanValue) {
            yo4.i(fk6.f, b(fk6, pbVar, pbVar2, fk6.j(7, fk6)));
            return;
        }
        List j = fk6.j(7, fk6);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((fk6) j.get(i), arrayList, pbVar, pbVar2, yo4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f0 A[LOOP:1: B:10:0x0046->B:33:0x00f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9 A[EDGE_INSN: B:51:0x00f9->B:35:0x00f9 ?: BREAK  , SYNTHETIC] */
    public static final ArrayList b(fk6 fk6, pb pbVar, pb pbVar2, List list) {
        boolean z;
        int i;
        int i2;
        int i3;
        pb pbVar3 = pbVar2;
        yo4 yo4 = ne3.a;
        yo4 yo42 = new yo4();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((fk6) list.get(i4), arrayList, pbVar, pbVar3, yo42);
        }
        int i5 = 1;
        if (fk6.c.U == ey3.x) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i6 = 0;
            while (true) {
                fk6 fk62 = (fk6) arrayList.get(i6);
                if (i6 != 0) {
                    float f = fk62.h().b;
                    float f2 = fk62.h().d;
                    if (f >= f2) {
                        i2 = i5;
                    } else {
                        i2 = 0;
                    }
                    int size3 = arrayList2.size() - i5;
                    if (size3 >= 0) {
                        int i7 = 0;
                        while (true) {
                            ly5 ly5 = (ly5) ((yb5) arrayList2.get(i7)).w;
                            i = i5;
                            float f3 = ly5.b;
                            float f4 = ly5.d;
                            if (f3 >= f4) {
                                i3 = i;
                            } else {
                                i3 = 0;
                            }
                            if (i2 != 0 || i3 != 0 || Math.max(f, f3) >= Math.min(f2, f4)) {
                                if (i7 == size3) {
                                    break;
                                }
                                i7++;
                                i5 = i;
                            } else {
                                arrayList2.set(i7, new yb5(new ly5(Math.max(ly5.a, 0.0f), Math.max(ly5.b, f), Math.min(ly5.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((yb5) arrayList2.get(i7)).x));
                                ((List) ((yb5) arrayList2.get(i7)).x).add(fk62);
                                break;
                            }
                        }
                        if (i6 != size2) {
                            break;
                        }
                        i6++;
                        i5 = i;
                    }
                }
                i = i5;
                arrayList2.add(new yb5(fk62.h(), sg3.I(fk62)));
                if (i6 != size2) {
                }
            }
        }
        ht0.g0(arrayList2, a91.D);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[!z];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            yb5 yb5 = (yb5) arrayList2.get(i8);
            ht0.g0((List) yb5.x, comparator);
            arrayList3.addAll((Collection) yb5.x);
        }
        ht0.g0(arrayList3, new wu0(2, b));
        int i9 = 0;
        while (i9 <= arrayList3.size() - 1) {
            List list2 = (List) yo42.b(((fk6) arrayList3.get(i9)).f);
            if (list2 != null) {
                if (!((Boolean) pbVar3.y(arrayList3.get(i9))).booleanValue()) {
                    arrayList3.remove(i9);
                } else {
                    i9++;
                }
                arrayList3.addAll(i9, list2);
                i9 += list2.size();
            } else {
                i9++;
            }
        }
        return arrayList3;
    }
}
