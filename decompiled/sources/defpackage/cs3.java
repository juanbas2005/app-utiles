package defpackage;

import java.util.List;

/* renamed from: cs3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cs3 implements vq3 {
    public final Object w;
    public final nz3 x = rg3.y(i44.w, new zh(24, (Object) this));

    public cs3(Object obj) {
        obj.getClass();
        this.w = obj;
    }

    public abstract String b();

    public abstract ks3 c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs3)) {
            return false;
        }
        cs3 cs3 = (cs3) obj;
        if (!sg3.e(b(), cs3.b()) || !sg3.e(this.w, cs3.w)) {
            return false;
        }
        return true;
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return b().hashCode() + (this.w.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int ordinal = c().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                sb.append("in ");
            } else if (ordinal == 2) {
                sb.append("out ");
            } else {
                h.c();
                return null;
            }
        }
        sb.append(b());
        return sb.toString();
    }
}
