package defpackage;

import java.util.List;

/* renamed from: ek  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ek implements lh4 {
    public final mk a;

    public ek(mk mkVar) {
        this.a = mkVar;
    }

    public final int a(kg3 kg3, List list, int i) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).v(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i2)).v(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        yb5 yb5;
        hk hkVar;
        hk hkVar2;
        List list2 = list;
        long j2 = j;
        int size = list2.size();
        eh5[] eh5Arr = new eh5[size];
        int size2 = list2.size();
        long j3 = 0;
        for (int i = 0; i < size2; i++) {
            gh4 gh4 = (gh4) list2.get(i);
            Object B = gh4.B();
            if (B instanceof hk) {
                hkVar2 = (hk) B;
            } else {
                hkVar2 = null;
            }
            if (hkVar2 != null && ((Boolean) hkVar2.w.getValue()).booleanValue()) {
                eh5 y = gh4.y(j2);
                int i2 = y.w;
                long j4 = ((long) y.x) & 4294967295L;
                eh5Arr[i] = y;
                j3 = j4 | (((long) i2) << 32);
            }
        }
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            gh4 gh42 = (gh4) list2.get(i3);
            if (eh5Arr[i3] == null) {
                eh5Arr[i3] = gh42.y(j2);
            }
        }
        if (oh4.a0()) {
            yb5 = new yb5(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)));
        } else {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                eh5 eh5 = eh5Arr[i6];
                if (eh5 != null) {
                    Object B2 = ((gh4) list2.get(i6)).B();
                    if (B2 instanceof hk) {
                        hkVar = (hk) B2;
                    } else {
                        hkVar = null;
                    }
                    if (hkVar == null || !((Boolean) hkVar.x.getValue()).booleanValue()) {
                        int i7 = eh5.w;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                        int i8 = eh5.x;
                        if (i8 > i5) {
                            i5 = i8;
                        }
                    }
                }
            }
            yb5 = new yb5(Integer.valueOf(i4), Integer.valueOf(i5));
        }
        int intValue = ((Number) yb5.w).intValue();
        int intValue2 = ((Number) yb5.x).intValue();
        if (!oh4.a0()) {
            this.a.c.setValue(new we3((((long) intValue) << 32) | (((long) intValue2) & 4294967295L)));
        }
        return oh4.d0(intValue, intValue2, b42.w, new dk(eh5Arr, this, intValue, intValue2));
    }

    public final int c(kg3 kg3, List list, int i) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).l(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i2)).l(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int d(kg3 kg3, List list, int i) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i2)).c(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int e(kg3 kg3, List list, int i) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).W(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i2)).W(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
