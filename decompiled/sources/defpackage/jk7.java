package defpackage;

import java.util.List;

/* renamed from: jk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jk7 implements lh4 {
    public final nh2 a;
    public final g80 b;
    public final float c;
    public final la5 d;

    public jk7(nh2 nh2, g80 g80, float f, la5 la5) {
        this.a = nh2;
        this.b = g80;
        this.c = f;
        this.d = la5;
    }

    public final int a(kg3 kg3, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((gh4) list.get(i3)).v(i);
        }
        return i2;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        jk7 jk7 = this;
        oh4 oh42 = oh4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            gh4 gh4 = (gh4) list2.get(i6);
            if (sg3.e(rc9.P(gh4), "navigationIcon")) {
                eh5 y = gh4.y(k31.a(j, 0, 0, 0, 0, 14));
                int size2 = list2.size();
                int i7 = 0;
                while (i7 < size2) {
                    gh4 gh42 = (gh4) list2.get(i7);
                    if (sg3.e(rc9.P(gh42), "actionIcons")) {
                        eh5 y2 = gh42.y(k31.a(j, 0, 0, 0, 0, 14));
                        ey3 layoutDirection = oh42.getLayoutDirection();
                        la5 la5 = jk7.d;
                        float l = x91.l(la5, layoutDirection);
                        float k = x91.k(la5, oh42.getLayoutDirection());
                        int max = Math.max(oh42.r0(vn.b), y.w);
                        if (k31.h(j) == Integer.MAX_VALUE) {
                            i = k31.h(j);
                        } else {
                            int h = (((k31.h(j) - max) - y2.w) - oh42.r0(l)) - oh42.r0(k);
                            if (h < 0) {
                                i = 0;
                            } else {
                                i = h;
                            }
                        }
                        int i8 = i;
                        int size3 = list2.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            gh4 gh43 = (gh4) list2.get(i9);
                            if (sg3.e(rc9.P(gh43), "title")) {
                                eh5 y3 = gh43.y(k31.a(j, 0, i8, 0, 0, 12));
                                h23 h23 = nb.b;
                                if (y3.X(h23) != Integer.MIN_VALUE) {
                                    i2 = y3.X(h23);
                                } else {
                                    i2 = 0;
                                }
                                float b2 = jk7.a.b();
                                if (Float.isNaN(b2)) {
                                    i3 = 0;
                                } else {
                                    i3 = dh4.C(b2);
                                }
                                int max2 = Math.max(oh42.r0(jk7.c), y3.x) + oh42.r0(la5.d()) + oh42.r0(la5.a());
                                if (k31.g(j) == Integer.MAX_VALUE) {
                                    i4 = max2;
                                } else {
                                    int i10 = i3 + max2;
                                    if (i10 >= 0) {
                                        i5 = i10;
                                    }
                                    i4 = i5;
                                }
                                int r0 = oh42.r0(la5.d());
                                int r02 = oh42.r0(la5.a());
                                return oh42.d0(k31.h(j), i4, b42.w, new ik7(y, oh42.r0(x91.l(la5, oh42.getLayoutDirection())), (r0 + i4) - r02, y3, y2, j, oh42.r0(x91.k(la5, oh42.getLayoutDirection())), jk7, i2, max2));
                            }
                            i9++;
                            jk7 = this;
                        }
                        throw b81.z("Collection contains no element matching the predicate.");
                    }
                    i7++;
                    jk7 = this;
                }
                throw b81.z("Collection contains no element matching the predicate.");
            }
            i6++;
            jk7 = this;
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }

    public final int c(kg3 kg3, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((gh4) list.get(i3)).l(i);
        }
        return i2;
    }

    public final int d(kg3 kg3, List list, int i) {
        Integer num;
        int r0 = kg3.r0(this.c);
        int i2 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).c(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i3)).c(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            i2 = num.intValue();
        }
        return Math.max(r0, i2);
    }

    public final int e(kg3 kg3, List list, int i) {
        Integer num;
        int r0 = kg3.r0(this.c);
        int i2 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((gh4) list.get(0)).W(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((gh4) list.get(i3)).W(i));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            i2 = num.intValue();
        }
        return Math.max(r0, i2);
    }
}
