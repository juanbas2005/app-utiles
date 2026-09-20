package defpackage;

import java.util.ConcurrentModificationException;

/* renamed from: zf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class zf5 extends xf5 {
    public Object A;
    public boolean B;
    public int C;
    public final yf5 z;

    public zf5(yf5 yf5, sn7[] sn7Arr) {
        super(yf5.y, sn7Arr);
        this.z = yf5;
        this.C = yf5.A;
    }

    public final void c(int i, rn7 rn7, Object obj, int i2) {
        int i3 = i2 * 5;
        sn7[] sn7Arr = this.w;
        if (i3 > 30) {
            sn7 sn7 = sn7Arr[i2];
            Object[] objArr = rn7.d;
            sn7.a(objArr, objArr.length, 0);
            while (true) {
                sn7 sn72 = sn7Arr[i2];
                if (!sg3.e(sn72.w[sn72.y], obj)) {
                    sn7Arr[i2].y += 2;
                } else {
                    this.x = i2;
                    return;
                }
            }
        } else {
            int k = 1 << k75.k(i, i3);
            if (rn7.h(k)) {
                sn7Arr[i2].a(rn7.d, Integer.bitCount(rn7.a) * 2, rn7.f(k));
                this.x = i2;
                return;
            }
            int t = rn7.t(k);
            rn7 s = rn7.s(t);
            sn7Arr[i2].a(rn7.d, Integer.bitCount(rn7.a) * 2, t);
            c(i, s, obj, i2 + 1);
        }
    }

    public final Object next() {
        if (this.z.A != this.C) {
            throw new ConcurrentModificationException();
        } else if (this.y) {
            sn7 sn7 = this.w[this.x];
            this.A = sn7.w[sn7.y];
            this.B = true;
            return super.next();
        } else {
            rf2.c();
            return null;
        }
    }

    public final void remove() {
        int i;
        if (this.B) {
            boolean z2 = this.y;
            yf5 yf5 = this.z;
            if (!z2) {
                mp7.O(yf5).remove(this.A);
            } else if (z2) {
                sn7 sn7 = this.w[this.x];
                Object obj = sn7.w[sn7.y];
                mp7.O(yf5).remove(this.A);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                c(i, yf5.y, obj, 0);
            } else {
                rf2.c();
                return;
            }
            this.A = null;
            this.B = false;
            this.C = yf5.A;
            return;
        }
        throw new IllegalStateException();
    }
}
