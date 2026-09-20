package defpackage;

import java.io.Closeable;

/* renamed from: cc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cc9 implements Runnable, Closeable {
    public final boolean A = false;
    public jc9 w;
    public final boolean x;
    public boolean y;
    public boolean z;

    public cc9(jc9 jc9, boolean z2) {
        this.w = jc9;
        this.x = ag8.M(Thread.currentThread());
        this.A = z2;
    }

    public final void a(x1 x1Var) {
        if (this.y) {
            h.s("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (!this.z) {
            this.z = true;
            x1Var.a(this, fv1.w);
        } else {
            h.s("Signal is already attached to future");
        }
    }

    public final void close() {
        jc9 jc9 = this.w;
        try {
            this.w = null;
            boolean z2 = this.z;
            if (!z2) {
                if (!this.y) {
                    this.y = true;
                    if (this.x && !z2) {
                        ag8.M(Thread.currentThread());
                    }
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (jc9 != null) {
                ((qb9) jc9).close();
            }
            if (this.A) {
                vb9.b(vb9.c(), bc9.C);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void run() {
        boolean z2;
        if (this.y || !(z2 = this.z)) {
            ag8.N().post(z22.z);
            return;
        }
        this.y = true;
        if (this.x && !z2) {
            ag8.M(Thread.currentThread());
        }
    }
}
