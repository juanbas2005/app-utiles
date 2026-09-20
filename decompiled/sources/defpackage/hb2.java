package defpackage;

/* renamed from: hb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb2 {
    public final Object a;
    public final fw0 b;

    public hb2(nw6 nw6, fw0 fw0) {
        this.a = nw6;
        this.b = fw0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hb2) {
            hb2 hb2 = (hb2) obj;
            if (sg3.e(this.a, hb2.a) && this.b == hb2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return this.b.hashCode() + (i * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ")";
    }
}
