package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: d37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d37 extends c3 implements di2, mt2, b37, xp4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ long C;
    public int A;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<d37> cls = d37.class;
        B = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state$volatile");
        C = y79.a.objectFieldOffset(cls.getDeclaredField("_state$volatile"));
    }

    public d37(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        if (r15 == r2) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object a(fi2 fi2, f61 f61) {
        c37 c37;
        int i;
        Object obj;
        Object obj2;
        fi2 fi22;
        f37 f37;
        el3 el3;
        Object andSet;
        Object obj3;
        Object obj4;
        if (f61 instanceof c37) {
            c37 = (c37) f61;
            int i2 = c37.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c37.G = i2 - Integer.MIN_VALUE;
                Object obj5 = c37.E;
                i = c37.G;
                obj = p81.w;
                if (i != 0) {
                    o85.q(obj5);
                    f37 = (f37) d();
                } else if (i == 1) {
                    f37 = c37.A;
                    fi2 = c37.z;
                    o85.q(obj5);
                } else if (i == 2) {
                    obj2 = c37.D;
                    el3 = c37.B;
                    f37 = c37.A;
                    fi22 = c37.z;
                    o85.q(obj5);
                    AtomicReference atomicReference = f37.a;
                    py2 py2 = e37.a;
                    andSet = atomicReference.getAndSet(py2);
                    andSet.getClass();
                    if (andSet == e37.b) {
                    }
                    obj3 = B.get(this);
                    if (el3 != null) {
                    }
                    if (obj3 == o15.a) {
                    }
                    c37.z = fi22;
                    c37.A = f37;
                    c37.B = el3;
                    c37.C = null;
                    c37.D = obj3;
                    c37.G = 2;
                    if (fi22.k(obj4, c37) != obj) {
                    }
                    return obj;
                } else if (i == 3) {
                    obj2 = c37.C;
                    el3 = c37.B;
                    f37 = c37.A;
                    fi22 = c37.z;
                    try {
                        o85.q(obj5);
                        obj3 = B.get(this);
                        if (el3 != null) {
                            if (el3.l()) {
                            }
                            throw el3.E();
                        }
                        if (obj2 == null || !obj2.equals(obj3)) {
                            if (obj3 == o15.a) {
                                obj4 = null;
                            } else {
                                obj4 = obj3;
                            }
                            c37.z = fi22;
                            c37.A = f37;
                            c37.B = el3;
                            c37.C = null;
                            c37.D = obj3;
                            c37.G = 2;
                            if (fi22.k(obj4, c37) != obj) {
                                obj2 = obj3;
                            }
                            return obj;
                        }
                        AtomicReference atomicReference2 = f37.a;
                        py2 py22 = e37.a;
                        andSet = atomicReference2.getAndSet(py22);
                        andSet.getClass();
                        if (andSet == e37.b) {
                            c37.z = fi22;
                            c37.A = f37;
                            c37.B = el3;
                            c37.C = obj2;
                            c37.D = null;
                            c37.G = 3;
                            Object obj6 = vs7.a;
                            kk0 kk0 = new kk0(1, rc9.a0(c37));
                            kk0.v();
                            AtomicReference atomicReference3 = f37.a;
                            while (true) {
                                if (!atomicReference3.compareAndSet(py22, kk0)) {
                                    if (atomicReference3.get() != py22) {
                                        kk0.f(obj6);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            Object t = kk0.t();
                            if (t == obj) {
                                obj6 = t;
                            }
                        }
                        obj3 = B.get(this);
                        if (el3 != null) {
                        }
                        if (obj3 == o15.a) {
                        }
                        c37.z = fi22;
                        c37.A = f37;
                        c37.B = el3;
                        c37.C = null;
                        c37.D = obj3;
                        c37.G = 2;
                        if (fi22.k(obj4, c37) != obj) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        g(f37);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e81 e81 = c37.x;
                e81.getClass();
                fi22 = fi2;
                el3 = (el3) e81.a0(me6.E);
                obj2 = null;
                obj3 = B.get(this);
                if (el3 != null) {
                }
                if (obj3 == o15.a) {
                }
                c37.z = fi22;
                c37.A = f37;
                c37.B = el3;
                c37.C = null;
                c37.D = obj3;
                c37.G = 2;
                if (fi22.k(obj4, c37) != obj) {
                }
                return obj;
            }
        }
        c37 = new c37(this, f61);
        Object obj52 = c37.E;
        i = c37.G;
        obj = p81.w;
        if (i != 0) {
        }
        e81 e812 = c37.x;
        e812.getClass();
        fi22 = fi2;
        el3 = (el3) e812.a0(me6.E);
        obj2 = null;
        obj3 = B.get(this);
        if (el3 != null) {
        }
        if (obj3 == o15.a) {
        }
        c37.z = fi22;
        c37.A = f37;
        c37.B = el3;
        c37.C = null;
        c37.D = obj3;
        c37.G = 2;
        if (fi22.k(obj4, c37) != obj) {
        }
        return obj;
    }

    public final di2 b(e81 e81, int i, vc0 vc0) {
        if (((i < 0 || i >= 2) && i != -2) || vc0 != vc0.x) {
            return qr6.c(this, e81, i, vc0);
        }
        return this;
    }

    public final d3 e() {
        return new f37();
    }

    public final d3[] f() {
        return new f37[2];
    }

    public final Object getValue() {
        B.getClass();
        Object objectVolatile = y79.a.getObjectVolatile(this, C);
        if (objectVolatile == o15.a) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean i(Object obj, Object obj2) {
        py2 py2 = o15.a;
        if (obj == null) {
            obj = py2;
        }
        if (obj2 == null) {
            obj2 = py2;
        }
        return l(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = o15.a;
        }
        l((Object) null, obj);
    }

    public final Object k(Object obj, f61 f61) {
        j(obj);
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r11 = (defpackage.f37[]) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r11 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = r11.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        r4 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r5 = r4.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r6 = defpackage.e37.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        if (r5 != r6) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r7 = defpackage.e37.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        if (r5 != r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r4.compareAndSet(r5, r6) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        if (r4.get() == r5) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (r4.compareAndSet(r5, r7) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005f, code lost:
        ((defpackage.kk0) r5).f(defpackage.vs7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        if (r4.get() == r5) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11 = r9.A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        if (r11 != r10) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0076, code lost:
        r9.A = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10 = r9.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        r8 = r11;
        r11 = r10;
        r10 = r8;
     */
    public final boolean l(Object obj, Object obj2) {
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !sg3.e(obj3, obj)) {
                return false;
            }
            if (sg3.e(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i = this.A;
            if ((i & 1) == 0) {
                int i2 = i + 1;
                this.A = i2;
                d3[] d3VarArr = this.w;
            } else {
                this.A = i + 2;
                return true;
            }
        }
    }
}
