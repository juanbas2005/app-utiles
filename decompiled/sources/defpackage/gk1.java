package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* renamed from: gk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gk1 {
    public final BitmapDrawable a;
    public final boolean b;

    public gk1(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk1)) {
            return false;
        }
        gk1 gk1 = (gk1) obj;
        if (!this.a.equals(gk1.a) || this.b != gk1.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
