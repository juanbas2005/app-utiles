package defpackage;

import java.util.Iterator;

/* renamed from: es  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class es implements Iterator, ar3 {
    public final /* synthetic */ Object A;
    public int w;
    public int x;
    public boolean y;
    public final /* synthetic */ int z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public es(js jsVar, int i) {
        this(jsVar.y);
        this.z = i;
        switch (i) {
            case 1:
                this.A = jsVar;
                this(jsVar.y);
                return;
            default:
                this.A = jsVar;
                return;
        }
    }

    public final boolean hasNext() {
        if (this.x < this.w) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i = this.x;
            int i2 = this.z;
            Object obj2 = this.A;
            switch (i2) {
                case b85.b:
                    obj = ((js) obj2).g(i);
                    break;
                case 1:
                    obj = ((js) obj2).j(i);
                    break;
                default:
                    obj = ((os) obj2).x[i];
                    break;
            }
            this.x++;
            this.y = true;
            return obj;
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        if (this.y) {
            int i = this.x - 1;
            this.x = i;
            int i2 = this.z;
            Object obj = this.A;
            switch (i2) {
                case b85.b:
                    ((js) obj).h(i);
                    break;
                case 1:
                    ((js) obj).h(i);
                    break;
                default:
                    ((os) obj).f(i);
                    break;
            }
            this.w--;
            this.y = false;
            return;
        }
        h.s("Call next() before removing an element.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public es(os osVar) {
        this(osVar.y);
        this.z = 2;
        this.A = osVar;
    }

    public es(int i) {
        this.w = i;
    }
}
