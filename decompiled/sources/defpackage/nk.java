package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nk implements lh4 {
    public final yk a;
    public boolean b;

    public nk(yk ykVar) {
        this.a = ykVar;
    }

    public final int a(kg3 kg3, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int v = ((gh4) list.get(0)).v(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int v2 = ((gh4) list.get(i2)).v(i);
                if (v2 > v) {
                    v = v2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return v;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        ed5 ed5 = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            eh5 y = ((gh4) list.get(i3)).y(j);
            i = Math.max(i, y.w);
            i2 = Math.max(i2, y.x);
            arrayList.add(y);
        }
        if (oh4.a0()) {
            this.b = true;
            ed5.setValue(new we3((((long) i2) & 4294967295L) | (((long) i) << 32)));
        } else if (!this.b) {
            ed5.setValue(new we3((((long) i2) & 4294967295L) | (((long) i) << 32)));
        }
        return oh4.d0(i, i2, b42.w, new of(2, arrayList));
    }

    public final int c(kg3 kg3, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int l = ((gh4) list.get(0)).l(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int l2 = ((gh4) list.get(i2)).l(i);
                if (l2 > l) {
                    l = l2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return l;
    }

    public final int d(kg3 kg3, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c = ((gh4) list.get(0)).c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int c2 = ((gh4) list.get(i2)).c(i);
                if (c2 > c) {
                    c = c2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return c;
    }

    public final int e(kg3 kg3, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int W = ((gh4) list.get(0)).W(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int W2 = ((gh4) list.get(i2)).W(i);
                if (W2 > W) {
                    W = W2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return W;
    }
}
