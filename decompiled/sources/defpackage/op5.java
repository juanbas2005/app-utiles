package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: op5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op5 extends b1 implements en0, xk6 {
    public final ad0 B;

    public op5(e81 e81, ad0 ad0) {
        super(e81, true);
        this.B = ad0;
    }

    public final Object b(f61 f61, Object obj) {
        return this.B.b(f61, obj);
    }

    public final Object c(Object obj) {
        return this.B.c(obj);
    }

    public final wc0 iterator() {
        ad0 ad0 = this.B;
        ad0.getClass();
        return new wc0(ad0);
    }

    public final void j(CancellationException cancellationException) {
        this.B.j(cancellationException, true);
        i(cancellationException);
    }

    public final void o(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(t(), (Throwable) null, this);
            }
            j(cancellationException);
        }
    }

    public final Object p() {
        return this.B.p();
    }

    public final Object q(a97 a97) {
        ad0 ad0 = this.B;
        ad0.getClass();
        return ad0.J(ad0, a97);
    }

    public final Object s(fu0 fu0) {
        ad0 ad0 = this.B;
        ad0.getClass();
        return ad0.K(ad0, fu0);
    }

    public final void v0(Throwable th, boolean z) {
        if (!this.B.j(th, false) && !z) {
            bb0.p0(this.A, th);
        }
    }

    public final void w0(Object obj) {
        vs7 vs7 = (vs7) obj;
        this.B.h((Throwable) null);
    }

    public final boolean y0(Throwable th) {
        return this.B.j(th, false);
    }
}
