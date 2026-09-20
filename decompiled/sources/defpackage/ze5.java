package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ze5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze5 {
    public final py0 a;
    public final ky0 b;
    public final yt2 c;
    public final gs2 d;
    public final boolean e;
    public final gs7 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(bf5.y);
    public long i = jb5.f();
    public up4 j;
    public final u36 k;
    public final hy5 l;

    public ze5(py0 py0, ky0 ky0, yt2 yt2, wp4 wp4, gs2 gs2, boolean z, gs7 gs7, Object obj) {
        this.a = py0;
        this.b = ky0;
        this.c = yt2;
        this.d = gs2;
        this.e = z;
        this.f = gs7;
        this.g = obj;
        up4 up4 = cg6.a;
        up4.getClass();
        this.j = up4;
        u36 u36 = new u36();
        u36.g(wp4, yt2.D());
        this.k = u36;
        this.l = new hy5(gs7.y);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((bf5) atomicReference.get()).ordinal()) {
                case b85.b:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    bf5 bf5 = bf5.B;
                    bf5 bf52 = bf5.C;
                    while (!atomicReference.compareAndSet(bf5, bf52)) {
                        if (atomicReference.get() != bf5) {
                            vm5.b("Unexpected state change from: " + bf5 + " to: " + bf52 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e2) {
            atomicReference.set(bf5.w);
            throw e2;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                this.l.a(this.f, this.k);
                this.k.c();
                this.k.d();
                this.k.b();
                this.a.M = null;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean c() {
        if (((bf5) this.h.get()).compareTo(bf5.B) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void d() {
        bf5 bf5;
        bf5 bf52;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            bf5 = bf5.z;
            bf52 = bf5.B;
            if (atomicReference.compareAndSet(bf5, bf52)) {
                z = true;
                break;
            } else if (atomicReference.get() != bf5) {
                z = false;
                break;
            }
        }
        if (!z) {
            vm5.b("Unexpected state change from: " + bf5 + " to: " + bf52 + ".");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1.compareAndSet(r3, r0) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r1.get() == r3) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        defpackage.vm5.b("Unexpected state change from: " + r3 + " to: " + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r9 = r13.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r13.i = defpackage.jb5.f();
        r13.j = r5.q(r4, r14, r13.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r13.i = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r1.compareAndSet(r0, r3) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r1.get() == r0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        defpackage.vm5.b("Unexpected state change from: " + r0 + " to: " + r3 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r13.j.g() == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        return c();
     */
    public final boolean e(ps6 ps6) {
        bf5 bf5;
        long j2;
        bf5 bf52 = bf5.A;
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((bf5) atomicReference.get()).ordinal();
            bf5 = bf5.z;
            py0 py0 = this.a;
            ky0 ky0 = this.b;
            switch (ordinal) {
                case b85.b:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    yt2 yt2 = this.c;
                    boolean z = this.e;
                    if (z) {
                        yt2.z = 0;
                        yt2.y = true;
                    }
                    this.j = ky0.b(py0, ps6, this.d);
                    if (z) {
                        if (yt2.F || yt2.z != 0) {
                            vm5.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        yt2.z = -1;
                        yt2.y = false;
                    }
                    bf5 bf53 = bf5.y;
                    while (true) {
                        if (!atomicReference.compareAndSet(bf53, bf5)) {
                            if (atomicReference.get() != bf53) {
                                vm5.b("Unexpected state change from: " + bf53 + " to: " + bf5 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    ey0.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e2) {
            atomicReference.set(bf5.w);
            throw e2;
        } catch (Throwable th) {
            this.i = j2;
            while (true) {
                if (!atomicReference.compareAndSet(bf52, bf5)) {
                    if (atomicReference.get() != bf52) {
                        vm5.b("Unexpected state change from: " + bf52 + " to: " + bf5 + ".");
                    }
                }
            }
            throw th;
        }
    }
}
