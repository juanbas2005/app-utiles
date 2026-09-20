package defpackage;

/* renamed from: ze6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze6 implements q54, AutoCloseable {
    public final String w;
    public final ye6 x;
    public boolean y;

    public ze6(String str, ye6 ye6) {
        this.w = str;
        this.x = ye6;
    }

    public final void k(kg5 kg5, in8 in8) {
        kg5.getClass();
        in8.getClass();
        if (!this.y) {
            this.y = true;
            in8.x0(this);
            kg5.K(this.w, (lv0) this.x.b.B);
            return;
        }
        h.s("Already attached to lifecycleOwner");
    }

    public final void o(t54 t54, j54 j54) {
        if (j54 == j54.ON_DESTROY) {
            this.y = false;
            t54.k().M0(this);
        }
    }

    public final void close() {
    }
}
