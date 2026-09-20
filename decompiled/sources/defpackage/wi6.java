package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wi6 implements in4 {
    public final o81 a;
    public final hl b;
    public uj c;
    public Integer d;

    public wi6(o81 o81, hl hlVar) {
        this.a = o81;
        this.b = hlVar;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        Object obj;
        int i;
        Object obj2;
        Integer num;
        Object obj3;
        int i2;
        int i3;
        wi6 wi6;
        ArrayList arrayList = (ArrayList) list;
        int i4 = 0;
        List list2 = (List) arrayList.get(0);
        int i5 = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList2.add(((gh4) list2.get(i6)).y(j));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i7 = ((eh5) obj).w;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i8 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i8);
                    int i9 = ((eh5) obj4).w;
                    if (i7 < i9) {
                        obj = obj4;
                        i7 = i9;
                    }
                    if (i8 == size2) {
                        break;
                    }
                    i8++;
                }
            }
        }
        eh5 eh5 = (eh5) obj;
        if (eh5 != null) {
            i = eh5.w;
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i10 = 0; i10 < size3; i10++) {
            arrayList3.add(((gh4) list3.get(i10)).y(j));
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i11 = ((eh5) obj2).w;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i12 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i12);
                    int i13 = ((eh5) obj5).w;
                    if (i11 < i13) {
                        obj2 = obj5;
                        i11 = i13;
                    }
                    if (i12 == size4) {
                        break;
                    }
                    i12++;
                }
            }
        }
        eh5 eh52 = (eh5) obj2;
        if (eh52 != null) {
            num = Integer.valueOf(eh52.w);
        } else {
            num = null;
        }
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i14 = ((eh5) obj3).x;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i5);
                    int i15 = ((eh5) obj6).x;
                    if (i14 < i15) {
                        obj3 = obj6;
                        i14 = i15;
                    }
                    if (i5 == size5) {
                        break;
                    }
                    i5++;
                }
            }
        }
        eh5 eh53 = (eh5) obj3;
        if (eh53 != null) {
            i2 = eh53.x;
        } else {
            i2 = 0;
        }
        float f = xi6.c;
        int r0 = oh4.r0(8.0f) + Math.max(oh4.r0(f), i);
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        int i16 = i3 + r0;
        if (i == 0) {
            i4 = (-(oh4.r0(8.0f) + oh4.r0(f))) / 2;
        }
        int i17 = i4;
        Integer num2 = this.d;
        if (num2 == null) {
            this.d = Integer.valueOf(i17);
        } else {
            uj ujVar = this.c;
            if (ujVar == null) {
                ujVar = new uj(num2, we.w, (Object) null, 12);
                this.c = ujVar;
            }
            if (((Number) ujVar.e.getValue()).intValue() != i17) {
                int i18 = i17;
                i17 = i18;
                wi6 = this;
                ar7.H(wi6.a, (e81) null, (r81) null, new q34(ujVar, i18, this, (f61) null, 3), 3);
                int i19 = i2;
                return oh4.d0(i16, i19, b42.w, new da6(arrayList2, wi6, i17, arrayList3, i19));
            }
        }
        wi6 = this;
        int i192 = i2;
        return oh4.d0(i16, i192, b42.w, new da6(arrayList2, wi6, i17, arrayList3, i192));
    }
}
