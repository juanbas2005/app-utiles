package defpackage;

/* renamed from: dg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dg implements sj5 {
    public final int w;

    public dg(int i) {
        this.w = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dg) && this.w == ((dg) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w);
    }

    public final String toString() {
        return pb4.i(this.w, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
