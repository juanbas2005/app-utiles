package defpackage;

/* renamed from: ib3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ib3 implements hl {
    public final v02 a;
    public final o46 b;

    public ib3(v02 v02, o46 o46) {
        this.a = v02;
        this.b = o46;
        if (v02 instanceof jo7) {
            jo7 jo7 = (jo7) v02;
            if (!(jo7.a == 0 && jo7.b == 0)) {
                return;
            }
        } else if (!(v02 instanceof hx6) || ((hx6) v02).a != 0) {
            return;
        }
        h.q("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final m38 a(lo7 lo7) {
        return new r38(this.a.a(lo7), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3 = (ib3) obj;
        if (!ib3.a.equals(this.a) || ib3.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(0) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }
}
