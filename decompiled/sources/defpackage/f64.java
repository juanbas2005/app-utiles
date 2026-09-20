package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f64 extends h81 implements so1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(f64.class, "runningWorkers$volatile");
    public final int A;
    public final mb4 B;
    public final Object C;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ so1 y;
    public final h81 z;

    public f64(h81 h81, int i) {
        so1 so1;
        if (h81 instanceof so1) {
            so1 = (so1) h81;
        } else {
            so1 = null;
        }
        this.y = so1 == null ? pl1.a : so1;
        this.z = h81;
        this.A = i;
        this.B = new mb4();
        this.C = new Object();
    }

    public final void D(e81 e81, Runnable runnable) {
        Runnable o0;
        this.B.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
        if (atomicIntegerFieldUpdater.get(this) < this.A && p0() && (o0 = o0()) != null) {
            try {
                tv1.b(this.z, this, new nt2(this, false, o0, 7));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    public final void V(e81 e81, Runnable runnable) {
        Runnable o0;
        this.B.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
        if (atomicIntegerFieldUpdater.get(this) < this.A && p0() && (o0 = o0()) != null) {
            try {
                this.z.V(this, new nt2(this, false, o0, 7));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    public final mw1 a(long j, si7 si7, e81 e81) {
        return this.y.a(j, si7, e81);
    }

    public final void k(long j, kk0 kk0) {
        this.y.k(j, kk0);
    }

    public final h81 n0(int i) {
        su0.g(1);
        if (1 >= this.A) {
            return this;
        }
        return super.n0(1);
    }

    public final Runnable o0() {
        while (true) {
            Runnable runnable = (Runnable) this.B.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.C) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.B.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean p0() {
        synchronized (this.C) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            if (atomicIntegerFieldUpdater.get(this) >= this.A) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.z);
        sb.append(".limitedParallelism(");
        return f21.j(sb, this.A, ')');
    }
}
