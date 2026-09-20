package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: pz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pz1 extends hc2 {
    public final Drawable a;
    public final boolean b;
    public final pe1 c;

    public pz1(Drawable drawable, boolean z, pe1 pe1) {
        this.a = drawable;
        this.b = z;
        this.c = pe1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        pz1 pz1 = (pz1) obj;
        if (sg3.e(this.a, pz1.a) && this.b == pz1.b && this.c == pz1.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.i(this.a.hashCode() * 31, 31, this.b);
    }
}
