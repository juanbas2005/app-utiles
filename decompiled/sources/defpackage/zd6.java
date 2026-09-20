package defpackage;

import java.util.Iterator;

/* renamed from: zd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zd6 extends ce6 implements Iterator {
    public ae6 w;
    public ae6 x;

    public final void a(ae6 ae6) {
        ae6 ae62 = null;
        if (this.w == ae6 && ae6 == this.x) {
            this.x = null;
            this.w = null;
        }
        ae6 ae63 = this.w;
        if (ae63 == ae6) {
            this.w = ae63.z;
        }
        ae6 ae64 = this.x;
        if (ae64 == ae6) {
            ae6 ae65 = this.w;
            if (!(ae64 == ae65 || ae65 == null)) {
                ae62 = ae64.y;
            }
            this.x = ae62;
        }
    }

    public final boolean hasNext() {
        if (this.x != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        ae6 ae6;
        ae6 ae62 = this.x;
        ae6 ae63 = this.w;
        if (ae62 == ae63 || ae63 == null) {
            ae6 = null;
        } else {
            ae6 = ae62.y;
        }
        this.x = ae6;
        return ae62;
    }
}
