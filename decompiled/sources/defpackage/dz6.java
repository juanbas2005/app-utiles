package defpackage;

/* renamed from: dz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz6 extends je3 {
    public int w;
    public final /* synthetic */ cz6 x;

    public dz6(cz6 cz6) {
        this.x = cz6;
    }

    public final boolean hasNext() {
        if (this.w < this.x.f()) {
            return true;
        }
        return false;
    }

    public final int nextInt() {
        int i = this.w;
        this.w = i + 1;
        return this.x.d(i);
    }
}
