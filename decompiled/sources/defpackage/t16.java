package defpackage;

/* renamed from: t16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t16 implements dq3 {
    public t16() {
        rg3.y(i44.w, new xo3(10, this));
    }

    public abstract boolean C();

    public abstract boolean D();

    public abstract p16 b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof t16)) {
            return false;
        }
        t16 t16 = (t16) obj;
        if (!sg3.e(b(), t16.b()) || s() != t16.s()) {
            return false;
        }
        return true;
    }

    public abstract boolean g();

    public abstract String getName();

    public final int hashCode() {
        return Integer.hashCode(s()) + (b().hashCode() * 31);
    }

    public abstract int s();

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int ordinal = u().ordinal();
        if (ordinal == 0) {
            sb.append("instance parameter");
        } else if (ordinal == 1) {
            sb.append("context parameter " + getName());
        } else if (ordinal == 2) {
            sb.append("extension receiver parameter");
        } else if (ordinal == 3) {
            sb.append("parameter #" + s() + ' ' + getName());
        } else {
            h.c();
            return null;
        }
        sb.append(" of ");
        p16 b = b();
        if (b instanceof yr3) {
            yr3 yr3 = (yr3) b;
            StringBuilder sb2 = new StringBuilder();
            d63.k(sb2, yr3);
            if (yr3 instanceof kr3) {
                str2 = "var ";
            } else {
                str2 = "val ";
            }
            sb2.append(str2);
            d63.m(sb2, yr3);
            d63.l(yr3.getName(), sb2);
            sb2.append(": ");
            sb2.append(d63.v(yr3.k(), false));
            str = sb2.toString();
        } else if (b instanceof zq3) {
            str = d63.r((zq3) b);
        } else {
            ta1.l("Illegal callable: ", b);
            return null;
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract qr3 u();

    public abstract as3 y();
}
