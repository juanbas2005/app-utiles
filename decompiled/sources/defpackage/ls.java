package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ls  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ls extends is {
    public Object[] w;
    public int x;

    public final int f() {
        return this.x;
    }

    public final void g(int i, um umVar) {
        Object[] objArr = this.w;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.w = Arrays.copyOf(this.w, length);
        }
        Object[] objArr2 = this.w;
        if (objArr2[i] == null) {
            this.x++;
        }
        objArr2[i] = umVar;
    }

    public final Object get(int i) {
        return qs.b1(i, this.w);
    }

    public final Iterator iterator() {
        return new ks(this);
    }
}
