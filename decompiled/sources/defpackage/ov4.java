package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ov4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ov4 implements lh4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ a37 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ov4(Object obj, a37 a37, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = a37;
        this.d = obj2;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        Integer num;
        int i;
        int i2;
        int i3;
        boolean z;
        long j2;
        oh4 oh42 = oh4;
        List list2 = list;
        int i4 = this.a;
        b42 b42 = b42.w;
        Object obj = this.d;
        Object obj2 = this.b;
        a37 a37 = this.c;
        switch (i4) {
            case b85.b:
                long a2 = k31.a(j, 0, 0, 0, 0, 10);
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(((gh4) list2.get(i5)).y(a2));
                }
                Integer num2 = null;
                if (arrayList.isEmpty()) {
                    num = null;
                } else {
                    num = Integer.valueOf(((eh5) arrayList.get(0)).w);
                    int size2 = arrayList.size() - 1;
                    if (1 <= size2) {
                        int i6 = 1;
                        while (true) {
                            Integer valueOf = Integer.valueOf(((eh5) arrayList.get(i6)).w);
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i6 != size2) {
                                i6++;
                            }
                        }
                    }
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (arrayList.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    num2 = Integer.valueOf(((eh5) arrayList.get(0)).x);
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        int i7 = 1;
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(((eh5) arrayList.get(i7)).x);
                            if (valueOf2.compareTo(num2) > 0) {
                                num2 = valueOf2;
                            }
                            if (i7 != size3) {
                                i7++;
                            }
                        }
                    }
                }
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    i3 = i2;
                }
                return oh42.d0(i, i3, b42, new wg1((Object) (xz1) obj2, i, (Object) arrayList, (aq4) a37, (o37) (ad5) obj, 2));
            default:
                long a3 = k31.a(j, 0, 0, 0, 0, 10);
                int size4 = list2.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    gh4 gh4 = (gh4) list2.get(i8);
                    if (sg3.e(rc9.P(gh4), "navigationSuite")) {
                        eh5 y = gh4.y(a3);
                        int size5 = list2.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            gh4 gh42 = (gh4) list2.get(i9);
                            if (sg3.e(rc9.P(gh42), "primaryActionContent")) {
                                eh5 y2 = gh42.y(a3);
                                String str = (String) obj2;
                                if (str.equals("ShortNavigationBarCompact") || str.equals("ShortNavigationBarMedium") || str.equals("NavigationBar")) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int g = k31.g(j);
                                int h = k31.h(j);
                                int size6 = list2.size();
                                int i10 = 0;
                                while (i10 < size6) {
                                    gh4 gh43 = (gh4) list2.get(i10);
                                    if (sg3.e(rc9.P(gh43), "content")) {
                                        if (z) {
                                            j2 = k31.a(j, 0, 0, g - ((int) (fx4.h(a37) * ((float) y.x))), g - ((int) (((Number) a37.getValue()).floatValue() * ((float) y.x))), 3);
                                        } else {
                                            j2 = k31.a(j, h - ((int) (fx4.h(a37) * ((float) y.w))), h - ((int) (((Number) a37.getValue()).floatValue() * ((float) y.w))), 0, 0, 12);
                                        }
                                        return oh42.d0(h, g, b42, new ex4(z, gh43.y(j2), y, g, (ib) obj, h, y2, this.c));
                                    }
                                    eh5 eh5 = y;
                                    int i11 = g;
                                    int i12 = h;
                                    i10++;
                                    y = eh5;
                                }
                                throw b81.z("Collection contains no element matching the predicate.");
                            }
                            eh5 eh52 = y;
                        }
                        throw b81.z("Collection contains no element matching the predicate.");
                    }
                }
                throw b81.z("Collection contains no element matching the predicate.");
        }
    }
}
