package defpackage;

/* renamed from: xu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xu2 implements Comparable {
    public final int w;
    public final rc8 x;
    public final boolean y;

    public xu2(int i, rc8 rc8, boolean z) {
        this.w = i;
        this.x = rc8;
        this.y = z;
    }

    public final int compareTo(Object obj) {
        return this.w - ((xu2) obj).w;
    }
}
