package defpackage;

/* renamed from: c2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class c2 implements ro1, bh2, hu6, po7, as3 {
    public final y16 w;

    public c2(sr2 sr2) {
        y16 y16;
        y16 y162 = null;
        if (sr2 instanceof y16) {
            y16 = (y16) sr2;
        } else {
            y16 = null;
        }
        if (y16 != null) {
            y162 = y16;
        } else if (sr2 != null) {
            y162 = p25.u((ri0) null, sr2);
        }
        this.w = y162;
    }

    public abstract boolean C();

    public abstract c2 D();

    public abstract c2 F(boolean z);

    public abstract c2 H(boolean z);

    public abstract c2 K();

    public abstract as3 b();

    public boolean equals(Object obj) {
        if (!(obj instanceof c2) || !rg3.C(hz2.J, this, (zw3) obj)) {
            return false;
        }
        return true;
    }

    public abstract gq3 g();

    public int hashCode() {
        int i;
        vq3 J = J();
        if (J != null) {
            i = J.hashCode();
        } else {
            i = 0;
        }
        int hashCode = I().hashCode();
        return Boolean.hashCode(v()) + ((hashCode + (i * 31)) * 31);
    }

    public abstract boolean s();

    public String toString() {
        return d63.v(this, false);
    }

    public abstract boolean u();

    public abstract boolean y();
}
