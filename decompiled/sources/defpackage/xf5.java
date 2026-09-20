package defpackage;

import java.util.Iterator;

/* renamed from: xf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xf5 implements Iterator, ar3 {
    public final sn7[] w;
    public int x;
    public boolean y = true;

    public xf5(rn7 rn7, sn7[] sn7Arr) {
        this.w = sn7Arr;
        sn7Arr[0].a(rn7.d, Integer.bitCount(rn7.a) * 2, 0);
        this.x = 0;
        a();
    }

    public final void a() {
        int i = this.x;
        sn7[] sn7Arr = this.w;
        sn7 sn7 = sn7Arr[i];
        if (sn7.y >= sn7.x) {
            while (-1 < i) {
                int b = b(i);
                if (b == -1) {
                    sn7 sn72 = sn7Arr[i];
                    int i2 = sn72.y;
                    Object[] objArr = sn72.w;
                    if (i2 < objArr.length) {
                        int length = objArr.length;
                        sn72.y = i2 + 1;
                        b = b(i);
                    }
                }
                if (b != -1) {
                    this.x = b;
                    return;
                }
                if (i > 0) {
                    sn7 sn73 = sn7Arr[i - 1];
                    int i3 = sn73.y;
                    int length2 = sn73.w.length;
                    sn73.y = i3 + 1;
                }
                sn7Arr[i].a(rn7.e.d, 0, 0);
                i--;
            }
            this.y = false;
        }
    }

    public final int b(int i) {
        sn7[] sn7Arr = this.w;
        sn7 sn7 = sn7Arr[i];
        int i2 = sn7.y;
        if (i2 < sn7.x) {
            return i;
        }
        Object[] objArr = sn7.w;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        rn7 rn7 = (rn7) obj;
        if (i == 6) {
            sn7 sn72 = sn7Arr[i + 1];
            Object[] objArr2 = rn7.d;
            sn72.a(objArr2, objArr2.length, 0);
        } else {
            sn7Arr[i + 1].a(rn7.d, Integer.bitCount(rn7.a) * 2, 0);
        }
        return b(i + 1);
    }

    public final boolean hasNext() {
        return this.y;
    }

    public Object next() {
        if (this.y) {
            Object next = this.w[this.x].next();
            a();
            return next;
        }
        rf2.c();
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
