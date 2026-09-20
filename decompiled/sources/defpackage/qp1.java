package defpackage;

import java.util.Iterator;

/* renamed from: qp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qp1 implements Iterator, ar3 {
    public int A;
    public final /* synthetic */ rp1 B;
    public int w = -1;
    public int x;
    public int y;
    public re3 z;

    public qp1(rp1 rp1) {
        this.B = rp1;
        int p = z65.p(0, 0, rp1.a.length());
        this.x = p;
        this.y = p;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [re3, pe3] */
    /* JADX WARNING: type inference failed for: r0v8, types: [re3, pe3] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r7 < r4) goto L_0x001c;
     */
    public final void a() {
        rp1 rp1 = this.B;
        CharSequence charSequence = rp1.a;
        int i = this.y;
        int i2 = 0;
        if (i < 0) {
            this.w = 0;
            this.z = null;
            return;
        }
        int i3 = rp1.b;
        if (i3 > 0) {
            int i4 = this.A + 1;
            this.A = i4;
        }
        if (i <= charSequence.length()) {
            yb5 yb5 = (yb5) rp1.c.H(charSequence, Integer.valueOf(this.y));
            if (yb5 == null) {
                this.z = new pe3(this.x, d57.C0(charSequence), 1);
                this.y = -1;
            } else {
                int intValue = ((Number) yb5.w).intValue();
                int intValue2 = ((Number) yb5.x).intValue();
                this.z = z65.V(this.x, intValue);
                int i5 = intValue + intValue2;
                this.x = i5;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.y = i5 + i2;
            }
            this.w = 1;
        }
        this.z = new pe3(this.x, d57.C0(charSequence), 1);
        this.y = -1;
        this.w = 1;
    }

    public final boolean hasNext() {
        if (this.w == -1) {
            a();
        }
        if (this.w == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.w == -1) {
            a();
        }
        if (this.w != 0) {
            re3 re3 = this.z;
            re3.getClass();
            this.z = null;
            this.w = -1;
            return re3;
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
