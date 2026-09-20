package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: mx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mx0 extends f1 {
    public final o81 c;
    public gs2 d = new bj(2, (f61) null, 1);
    public ad0 e;
    public h27 f;
    public boolean g;

    public mx0(o81 o81, cn5 cn5) {
        super((yv4) cn5);
        this.c = o81;
    }

    public final void k() {
        ad0 ad0 = this.e;
        if (ad0 != null) {
            ad0.j(new CancellationException("onBack cancelled"), true);
        }
        h27 h27 = this.f;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public final void l() {
        if (this.e != null && !this.g) {
            k();
        }
        if (this.e == null) {
            this.g = false;
            this.e = rj1.c(-2, 4, vc0.w);
            this.f = ar7.H(this.c, (e81) null, (r81) null, new n0(this, (f61) null, 17), 3);
        }
        ad0 ad0 = this.e;
        if (ad0 != null) {
            ad0.h((Throwable) null);
        }
        this.g = false;
    }

    public final void m(e30 e30) {
        ad0 ad0 = this.e;
        if (ad0 != null) {
            ad0.c(e30);
        }
    }

    public final void n() {
        k();
        if (super.j()) {
            this.g = true;
            this.e = rj1.c(-2, 4, vc0.w);
            this.f = ar7.H(this.c, (e81) null, (r81) null, new n0(this, (f61) null, 17), 3);
        }
    }

    public final void s(boolean z) {
        h27 h27;
        if (!z && super.j() && (h27 = this.f) != null && !h27.l()) {
            k();
        }
        ((g30) this.a).e(z);
        ((f30) this.b).i(z);
    }
}
