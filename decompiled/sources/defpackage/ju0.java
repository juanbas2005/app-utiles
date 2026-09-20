package defpackage;

import java.io.Serializable;

/* renamed from: ju0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ju0 implements e81, Serializable {
    public final e81 w;
    public final c81 x;

    public ju0(c81 c81, e81 e81) {
        e81.getClass();
        c81.getClass();
        this.w = e81;
        this.x = c81;
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(this.w.G(gs2, obj), this.x);
    }

    public final e81 L(d81 d81) {
        d81.getClass();
        c81 c81 = this.x;
        c81 a0 = c81.a0(d81);
        e81 e81 = this.w;
        if (a0 != null) {
            return e81;
        }
        e81 L = e81.L(d81);
        if (L == e81) {
            return this;
        }
        if (L == x32.w) {
            return c81;
        }
        return new ju0(c81, L);
    }

    public final e81 X(e81 e81) {
        e81.getClass();
        if (e81 == x32.w) {
            return this;
        }
        return (e81) e81.G(new xw0(24), this);
    }

    public final c81 a0(d81 d81) {
        d81.getClass();
        while (true) {
            c81 a0 = this.x.a0(d81);
            if (a0 != null) {
                return a0;
            }
            e81 e81 = this.w;
            if (!(e81 instanceof ju0)) {
                return e81.a0(d81);
            }
            this = (ju0) e81;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ju0) {
            ju0 ju0 = (ju0) obj;
            int i = 2;
            ju0 ju02 = ju0;
            int i2 = 2;
            while (true) {
                e81 e81 = ju02.w;
                if (e81 instanceof ju0) {
                    ju02 = (ju0) e81;
                } else {
                    ju02 = null;
                }
                if (ju02 == null) {
                    break;
                }
                i2++;
            }
            ju0 ju03 = this;
            while (true) {
                e81 e812 = ju03.w;
                if (e812 instanceof ju0) {
                    ju03 = (ju0) e812;
                } else {
                    ju03 = null;
                }
                if (ju03 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    c81 c81 = this.x;
                    if (sg3.e(ju0.a0(c81.getKey()), c81)) {
                        e81 e813 = this.w;
                        if (!(e813 instanceof ju0)) {
                            e813.getClass();
                            c81 c812 = (c81) e813;
                            z = sg3.e(ju0.a0(c812.getKey()), c812);
                            break;
                        }
                        this = (ju0) e813;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() + this.w.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("["), (String) G(new vw0(5), ""), ']');
    }
}
