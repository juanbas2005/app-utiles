package defpackage;

/* renamed from: yy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yy0 extends hu5 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public yy0(vr2 vr2) {
        super(new o(22));
        this.c = new zy0(vr2);
    }

    public final ju5 a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case b85.b:
                Object obj2 = obj;
                if (obj2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new ju5(this, obj2, z, (ux6) null, (vr2) null, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new ju5(this, obj, z2, (ux6) this.c, (vr2) null, true);
        }
    }

    public c28 b() {
        switch (this.b) {
            case b85.b:
                return (zy0) this.c;
            default:
                return super.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yy0(sr2 sr2) {
        super(sr2);
        g22 g22 = g22.K;
        this.c = g22;
    }
}
