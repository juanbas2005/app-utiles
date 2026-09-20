package defpackage;

import java.util.Iterator;

/* renamed from: be6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be6 extends ce6 implements Iterator {
    public ae6 w;
    public boolean x = true;
    public final /* synthetic */ de6 y;

    public be6(de6 de6) {
        this.y = de6;
    }

    public final void a(ae6 ae6) {
        boolean z;
        ae6 ae62 = this.w;
        if (ae6 == ae62) {
            ae6 ae63 = ae62.z;
            this.w = ae63;
            if (ae63 == null) {
                z = true;
            } else {
                z = false;
            }
            this.x = z;
        }
    }

    public final boolean hasNext() {
        if (!this.x) {
            ae6 ae6 = this.w;
            if (ae6 == null || ae6.y == null) {
                return false;
            }
            return true;
        } else if (this.y.w != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        ae6 ae6;
        if (this.x) {
            this.x = false;
            this.w = this.y.w;
        } else {
            ae6 ae62 = this.w;
            if (ae62 != null) {
                ae6 = ae62.y;
            } else {
                ae6 = null;
            }
            this.w = ae6;
        }
        return this.w;
    }
}
