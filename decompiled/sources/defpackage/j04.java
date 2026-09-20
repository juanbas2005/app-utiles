package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j04 {
    public final vz3 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f = -1;
    public final ArrayList g = new ArrayList();
    public List h = a42.w;
    public int i;

    public j04(vz3 vz3) {
        this.a = vz3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h04(0, 0));
        this.b = arrayList;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r9 < r7) goto L_0x00a1;
     */
    public final cm2 b(int i2) {
        int i3;
        int i4;
        int i5;
        List list;
        boolean z = true;
        if (!this.a.r) {
            int i6 = this.i;
            int i7 = i2 * i6;
            int d2 = d() - i7;
            if (i6 > d2) {
                i6 = d2;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 == this.h.size()) {
                list = this.h;
            } else {
                ArrayList arrayList = new ArrayList(i6);
                for (int i8 = 0; i8 < i6; i8++) {
                    arrayList.add(new px2(rj1.g(1)));
                }
                this.h = arrayList;
                list = arrayList;
            }
            return new cm2(i7, list);
        }
        ArrayList arrayList2 = this.b;
        int min = Math.min(i2 / a(), arrayList2.size() - 1);
        int a2 = a() * min;
        int i9 = ((h04) arrayList2.get(min)).a;
        int i10 = ((h04) arrayList2.get(min)).b;
        int i11 = this.c;
        ArrayList arrayList3 = this.g;
        if (a2 <= i11 && i11 <= i2) {
            i9 = this.d;
            i10 = this.e;
            a2 = i11;
        } else if (min == this.f && (i5 = i2 - a2) < arrayList3.size()) {
            i9 = ((Number) arrayList3.get(i5)).intValue();
            a2 = i2;
            i10 = 0;
        }
        if (a2 % a() == 0) {
            int a3 = a();
            int i12 = i2 - a2;
            if (2 <= i12) {
            }
        }
        z = false;
        if (z) {
            this.f = min;
            arrayList3.clear();
        }
        if (a2 > i2) {
            bc3.c("currentLine (" + a2 + ") > lineIndex (" + i2 + ")");
        }
        while (a2 < i2 && i9 < d()) {
            if (z) {
                arrayList3.add(Integer.valueOf(i9));
            }
            int i13 = 0;
            while (i13 < this.i && i9 < d()) {
                if (i10 == 0) {
                    i4 = i10;
                    i10 = e(i9);
                } else {
                    i4 = 0;
                }
                i13 += i10;
                if (i13 > this.i) {
                    break;
                }
                i9++;
                i10 = i4;
            }
            a2++;
            if (a2 % a() == 0 && i9 < d()) {
                if (arrayList2.size() != a2 / a()) {
                    bc3.c("invalid starting point");
                }
                arrayList2.add(new h04(i9, i10));
            }
        }
        this.c = i2;
        this.d = i9;
        this.e = i10;
        ArrayList arrayList4 = new ArrayList();
        int i14 = 0;
        int i15 = i9;
        while (i14 < this.i && i15 < d()) {
            if (i10 == 0) {
                int i16 = i10;
                i10 = e(i15);
                i3 = i16;
            } else {
                i3 = 0;
            }
            i14 += i10;
            if (i14 > this.i) {
                break;
            }
            i15++;
            arrayList4.add(new px2(rj1.g(i10)));
            i10 = i3;
        }
        return new cm2(i9, arrayList4);
    }

    public final int c(int i2) {
        int i3;
        int i4;
        if (d() <= 0) {
            return 0;
        }
        if (i2 >= d()) {
            bc3.a("ItemIndex > total count");
        }
        if (!this.a.r) {
            return i2 / this.i;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        sg3.R(arrayList.size(), size);
        int i5 = size - 1;
        int i6 = 0;
        while (true) {
            if (i6 > i5) {
                i3 = -(i6 + 1);
                break;
            }
            i3 = (i6 + i5) >>> 1;
            int i7 = ((h04) arrayList.get(i3)).a - i2;
            if (i7 >= 0) {
                if (i7 <= 0) {
                    break;
                }
                i5 = i3 - 1;
            } else {
                i6 = i3 + 1;
            }
        }
        if (i3 < 0) {
            i3 = (-i3) - 2;
        }
        int a2 = a() * i3;
        int i8 = ((h04) arrayList.get(i3)).a;
        if (i8 > i2) {
            bc3.a("currentItemIndex > itemIndex");
        }
        int i9 = 0;
        while (i8 < i2) {
            int i10 = i8 + 1;
            int e2 = e(i8);
            i9 += e2;
            int i11 = this.i;
            if (i9 >= i11) {
                if (i9 == i11) {
                    a2++;
                    i9 = 0;
                } else {
                    a2++;
                    i9 = e2;
                }
            }
            if (a2 % a() == 0 && a2 / a() >= arrayList.size()) {
                if (i9 > 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                arrayList.add(new h04(i10 - i4, 0));
            }
            i8 = i10;
        }
        if (e(i2) + i9 > this.i) {
            return a2 + 1;
        }
        return a2;
    }

    public final int d() {
        return this.a.q.b;
    }

    public final int e(int i2) {
        i04.b = this.i;
        hg3 e2 = this.a.q.e(i2);
        return (int) ((px2) ((uz3) e2.c).b.H(i04.a, Integer.valueOf(i2 - e2.a))).a;
    }
}
