package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: sn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sn0 extends ri6 {
    public final ad0 g;
    public final /* synthetic */ AtomicReferenceArray h = new AtomicReferenceArray(cd0.b * 2);

    public sn0(long j, sn0 sn0, ad0 ad0, int i) {
        super(j, sn0, i);
        this.g = ad0;
    }

    public final int k() {
        return cd0.b;
    }

    public final void l(int i, e81 e81) {
        boolean z;
        ad0 ad0;
        py2 py2;
        int i2 = cd0.b;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i -= i2;
        }
        Object obj = this.h.get(i * 2);
        while (true) {
            Object p = p(i);
            boolean z2 = p instanceof g88;
            ad0 = this.g;
            if (z2 || (p instanceof h88)) {
                if (z) {
                    py2 = cd0.j;
                } else {
                    py2 = cd0.k;
                }
                if (o(i, p, py2)) {
                    r(i, (Object) null);
                    q(i, !z);
                    if (z) {
                        ad0.getClass();
                        vr2 vr2 = ad0.x;
                        if (vr2 != null) {
                            l55.d(vr2, obj, e81);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (p == cd0.j || p == cd0.k) {
                r(i, (Object) null);
            } else if (!(p == cd0.g || p == cd0.f)) {
                if (p != cd0.i && p != cd0.d && p != cd0.l) {
                    ta1.l("unexpected state: ", p);
                    return;
                }
                return;
            }
        }
        r(i, (Object) null);
        if (z) {
            ad0.getClass();
            vr2 vr22 = ad0.x;
            if (vr22 != null) {
                l55.d(vr22, obj, e81);
            }
        }
    }

    public final boolean o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            ad0 ad0 = this.g;
            ad0.getClass();
            ad0.S((this.e * ((long) cd0.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
