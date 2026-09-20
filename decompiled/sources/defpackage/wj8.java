package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: wj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj8 extends AbstractSet {
    public final int w;
    public final /* synthetic */ xj8 x;

    public wj8(xj8 xj8, int i) {
        this.x = xj8;
        this.w = i;
    }

    public final boolean contains(Object obj) {
        zf8 zf8;
        int d = d();
        int f = f();
        if (this.w == -1) {
            zf8 = xj8.B;
        } else {
            zf8 = yj8.b;
        }
        if (Arrays.binarySearch(this.x.w, d, f, obj, zf8) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        int i = this.w;
        if (i == -1) {
            return 0;
        }
        return this.x.x[i];
    }

    public final int f() {
        return this.x.x[this.w + 1];
    }

    public final Iterator iterator() {
        return new vj8(this, 0);
    }

    public final int size() {
        return f() - d();
    }
}
