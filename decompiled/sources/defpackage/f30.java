package defpackage;

/* renamed from: f30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f30 extends tv4 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Object i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f30(pl5 pl5) {
        super(xv4.a, true, 0);
        this.i = pl5;
    }

    public void c() {
        switch (this.h) {
            case b85.b:
                ((f1) this.i).k();
                return;
            default:
                return;
        }
    }

    public final void d() {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case b85.b:
                ((f1) obj).l();
                return;
            default:
                sr2 sr2 = ((pl5) obj).F;
                if (sr2 != null) {
                    sr2.b();
                    return;
                }
                return;
        }
    }

    public void e(qv4 qv4) {
        switch (this.h) {
            case b85.b:
                ((f1) this.i).m(new e30(qv4));
                return;
            default:
                return;
        }
    }

    public void f(qv4 qv4) {
        switch (this.h) {
            case b85.b:
                qv4.getClass();
                ((f1) this.i).n();
                return;
            default:
                super.f(qv4);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f30(f1 f1Var, yv4 yv4) {
        super(yv4, false, 0);
        this.i = f1Var;
    }
}
