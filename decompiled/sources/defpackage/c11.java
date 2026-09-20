package defpackage;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: c11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c11 extends ad0 {
    public final vc0 M;

    public c11(int i, vc0 vc0, vr2 vr2) {
        super(i, vr2);
        this.M = vc0;
        if (vc0 == vc0.w) {
            ku4.w(b26.a.b(ad0.class).A(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        } else if (i < 1) {
            h.j(pb4.i(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
    }

    public final boolean F() {
        if (this.M == vc0.x) {
            return true;
        }
        return false;
    }

    public final Object T(Object obj, boolean z) {
        g88 g88;
        vr2 vr2;
        UndeliveredElementException e;
        vc0 vc0 = this.M;
        vc0 vc02 = vc0.y;
        vs7 vs7 = vs7.a;
        g88 g882 = null;
        if (vc0 == vc02) {
            Object c = super.c(obj);
            if (!(c instanceof qn0) || (c instanceof pn0)) {
                return c;
            }
            if (!(!z || (vr2 = this.x) == null || (e = l55.e(vr2, obj, (UndeliveredElementException) null)) == null)) {
                throw e;
            }
        } else {
            Object obj2 = obj;
            py2 py2 = cd0.d;
            sn0 sn0 = (sn0) ad0.C.get(this);
            while (true) {
                long andIncrement = ad0.y.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean C = C(false, andIncrement);
                int i = cd0.b;
                long j2 = (long) i;
                long j3 = j / j2;
                g88 g883 = g882;
                long j4 = j;
                int i2 = (int) (j4 % j2);
                if (sn0.e != j3) {
                    sn0 t = t(j3, sn0);
                    if (t != null) {
                        sn0 = t;
                    } else if (C) {
                        return new pn0(w());
                    } else {
                        g882 = g883;
                    }
                }
                long j5 = j4;
                int d = ad0.d(this, sn0, i2, obj2, j5, py2, C);
                long j6 = j5;
                if (d == 0) {
                    sn0.a();
                    return vs7;
                } else if (d == 1) {
                    break;
                } else if (d != 2) {
                    if (d == 3) {
                        h.s("unexpected");
                        return g883;
                    } else if (d != 4) {
                        if (d == 5) {
                            sn0.a();
                        }
                        obj2 = obj;
                        g882 = g883;
                    } else {
                        if (j6 < ad0.z.get(this)) {
                            sn0.a();
                        }
                        return new pn0(w());
                    }
                } else if (C) {
                    sn0.m();
                    return new pn0(w());
                } else {
                    if (py2 instanceof g88) {
                        g88 = (g88) py2;
                    } else {
                        g88 = g883;
                    }
                    if (g88 != null) {
                        g88.b(sn0, i2 + i);
                    }
                    l((sn0.e * j2) + ((long) i2));
                }
            }
        }
        return vs7;
    }

    public final Object b(f61 f61, Object obj) {
        UndeliveredElementException e;
        if (!(T(obj, true) instanceof pn0)) {
            return vs7.a;
        }
        vr2 vr2 = this.x;
        if (vr2 == null || (e = l55.e(vr2, obj, (UndeliveredElementException) null)) == null) {
            throw w();
        }
        su0.b(e, w());
        throw e;
    }

    public final Object c(Object obj) {
        return T(obj, false);
    }
}
