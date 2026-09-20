package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wc0 implements g88 {
    public Object w = cd0.p;
    public kk0 x;
    public final /* synthetic */ ad0 y;

    public wc0(ad0 ad0) {
        this.y = ad0;
    }

    public final Object a(h61 h61) {
        sn0 sn0;
        Boolean bool;
        sn0 sn02;
        Object obj = this.w;
        boolean z = true;
        if (obj == cd0.p || obj == cd0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ad0.D;
            ad0 ad0 = this.y;
            sn0 sn03 = (sn0) atomicReferenceFieldUpdater.get(ad0);
            while (true) {
                if (ad0.D()) {
                    this.w = cd0.l;
                    Throwable u = ad0.u();
                    if (u == null) {
                        z = false;
                    } else {
                        int i = z17.a;
                        throw u;
                    }
                } else {
                    long andIncrement = ad0.z.getAndIncrement(ad0);
                    long j = (long) cd0.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (sn03.e != j2) {
                        sn0 r = ad0.r(j2, sn03);
                        if (r == null) {
                            continue;
                        } else {
                            sn0 = r;
                        }
                    } else {
                        sn0 = sn03;
                    }
                    Object Q = ad0.Q(sn0, i2, andIncrement, (Object) null);
                    py2 py2 = cd0.m;
                    gc5 gc5 = null;
                    if (Q != py2) {
                        py2 py22 = cd0.o;
                        if (Q == py22) {
                            if (andIncrement < ad0.x()) {
                                sn0.a();
                            }
                            sn03 = sn0;
                        } else if (Q == cd0.n) {
                            kk0 y2 = hj8.y(rc9.a0(h61));
                            try {
                                this.x = y2;
                                Object Q2 = ad0.Q(sn0, i2, andIncrement, this);
                                vr2 vr2 = ad0.x;
                                if (Q2 == py2) {
                                    b(sn0, i2);
                                } else {
                                    if (Q2 == py22) {
                                        if (andIncrement < ad0.x()) {
                                            sn0.a();
                                        }
                                        sn0 sn04 = (sn0) ad0.D.get(ad0);
                                        while (true) {
                                            if (ad0.D()) {
                                                kk0 kk0 = this.x;
                                                kk0.getClass();
                                                this.x = null;
                                                this.w = cd0.l;
                                                Throwable u2 = ad0.u();
                                                if (u2 == null) {
                                                    kk0.f(Boolean.FALSE);
                                                } else {
                                                    kk0.f(new m66(u2));
                                                }
                                            } else {
                                                long andIncrement2 = ad0.z.getAndIncrement(ad0);
                                                long j3 = (long) cd0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (sn04.e != j4) {
                                                    sn0 r2 = ad0.r(j4, sn04);
                                                    if (r2 != null) {
                                                        sn02 = r2;
                                                    }
                                                } else {
                                                    sn02 = sn04;
                                                }
                                                Object Q3 = ad0.Q(sn02, i3, andIncrement2, this);
                                                sn0 sn05 = sn02;
                                                if (Q3 == cd0.m) {
                                                    b(sn05, i3);
                                                    break;
                                                } else if (Q3 == cd0.o) {
                                                    if (andIncrement2 < ad0.x()) {
                                                        sn05.a();
                                                    }
                                                    sn04 = sn05;
                                                } else if (Q3 != cd0.n) {
                                                    sn05.a();
                                                    this.w = Q3;
                                                    this.x = null;
                                                    bool = Boolean.TRUE;
                                                    if (vr2 != null) {
                                                        gc5 = new gc5(vr2, Q3, 5);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        sn0.a();
                                        this.w = Q2;
                                        this.x = null;
                                        bool = Boolean.TRUE;
                                        if (vr2 != null) {
                                            gc5 = new gc5(vr2, Q2, 5);
                                        }
                                    }
                                    y2.J(bool, gc5);
                                }
                                return y2.t();
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                y2.C();
                                throw th2;
                            }
                        } else {
                            sn0.a();
                            this.w = Q;
                        }
                    } else {
                        h.s("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final void b(ri6 ri6, int i) {
        kk0 kk0 = this.x;
        if (kk0 != null) {
            kk0.b(ri6, i);
        }
    }

    public final Object c() {
        Object obj = this.w;
        py2 py2 = cd0.p;
        if (obj != py2) {
            this.w = py2;
            if (obj != cd0.l) {
                return obj;
            }
            Throwable v = this.y.v();
            int i = z17.a;
            throw v;
        }
        h.s("`hasNext()` has not been invoked");
        return null;
    }
}
