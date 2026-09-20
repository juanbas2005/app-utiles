package defpackage;

/* renamed from: cx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cx0 implements t54 {
    public final w54 w = new w54(this, true);
    public k54 x;
    public k54 y;

    public cx0() {
        k54 k54 = k54.x;
        this.x = k54;
        this.y = k54;
    }

    public final void a() {
        k54 k54;
        if (this.x.ordinal() < this.y.ordinal()) {
            k54 = this.x;
        } else {
            k54 = this.y;
        }
        w54 w54 = this.w;
        if (w54.E != k54.x || k54 != k54.w) {
            w54.h1(k54);
        }
    }

    public final in8 k() {
        return this.w;
    }
}
