package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: vj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vj8 implements Iterator {
    public final /* synthetic */ int w;
    public int x = 0;
    public final /* synthetic */ AbstractSet y;

    public /* synthetic */ vj8(AbstractSet abstractSet, int i) {
        this.w = i;
        this.y = abstractSet;
    }

    public final boolean hasNext() {
        int i = this.w;
        AbstractSet abstractSet = this.y;
        switch (i) {
            case b85.b:
                wj8 wj8 = (wj8) abstractSet;
                if (this.x < wj8.f() - wj8.d()) {
                    return true;
                }
                return false;
            default:
                if (this.x < ((ce9) ((ds) abstractSet).x).e) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        AbstractSet abstractSet = this.y;
        switch (i) {
            case b85.b:
                int i2 = this.x;
                wj8 wj8 = (wj8) abstractSet;
                if (i2 < wj8.f() - wj8.d()) {
                    xj8 xj8 = wj8.x;
                    Object obj = xj8.w[wj8.d() + i2];
                    this.x = i2 + 1;
                    return obj;
                }
                rf2.c();
                return null;
            default:
                int i3 = this.x;
                this.x = i3 + 1;
                ce9 ce9 = (ce9) ((ds) abstractSet).x;
                return ce9.d(ce9.d[i3] & 31);
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
