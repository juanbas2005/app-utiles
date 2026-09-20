package defpackage;

import java.util.Iterator;

/* renamed from: gu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gu4 implements Iterator, ar3 {
    public int w = -1;
    public boolean x;
    public final /* synthetic */ r14 y;

    public gu4(r14 r14) {
        this.y = r14;
    }

    public final boolean hasNext() {
        if (this.w + 1 < ((cz6) this.y.y).f()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            this.x = true;
            int i = this.w + 1;
            this.w = i;
            return (qt4) ((cz6) this.y.y).g(i);
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        if (this.x) {
            cz6 cz6 = (cz6) this.y.y;
            ((qt4) cz6.g(this.w)).y = null;
            int i = this.w;
            Object[] objArr = cz6.y;
            Object obj = objArr[i];
            Object obj2 = rg3.j;
            if (obj != obj2) {
                objArr[i] = obj2;
                cz6.w = true;
            }
            this.w = i - 1;
            this.x = false;
            return;
        }
        h.s("You must call next() before you can remove an element");
    }
}
