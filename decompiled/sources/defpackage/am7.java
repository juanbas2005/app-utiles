package defpackage;

/* renamed from: am7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am7 implements a37 {
    public final im7 w;
    public vr2 x;
    public vr2 y;
    public final /* synthetic */ bm7 z;

    public am7(bm7 bm7, im7 im7, vr2 vr2, vr2 vr22) {
        this.z = bm7;
        this.w = im7;
        this.x = vr2;
        this.y = vr22;
    }

    public final void b(gm7 gm7, Object obj, ol olVar) {
        Object y2 = this.y.y(gm7.d());
        boolean h = this.z.c.h();
        im7 im7 = this.w;
        if (h) {
            im7.f(this.y.y(gm7.b()), y2, (je2) this.x.y(gm7));
        } else {
            im7.g(y2, (je2) this.x.y(gm7), obj, olVar);
        }
    }

    public final Object getValue() {
        b(this.z.c.f(), (Object) null, (ol) null);
        return this.w.F.getValue();
    }
}
