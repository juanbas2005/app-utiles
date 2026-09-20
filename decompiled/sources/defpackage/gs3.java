package defpackage;

/* renamed from: gs3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gs3 {
    public static final gs3 c = new gs3((as3) null, (ks3) null);
    public final ks3 a;
    public final as3 b;

    public gs3(as3 as3, ks3 ks3) {
        boolean z;
        String str;
        this.a = ks3;
        this.b = as3;
        boolean z2 = false;
        if (ks3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z != (as3 == null ? true : z2)) {
            if (ks3 == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + ks3 + " requires type to be specified.";
            }
            h.j(str);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs3)) {
            return false;
        }
        gs3 gs3 = (gs3) obj;
        if (this.a == gs3.a && sg3.e(this.b, gs3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        ks3 ks3 = this.a;
        if (ks3 == null) {
            i = 0;
        } else {
            i = ks3.hashCode();
        }
        int i3 = i * 31;
        as3 as3 = this.b;
        if (as3 != null) {
            i2 = as3.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        int i;
        ks3 ks3 = this.a;
        if (ks3 == null) {
            i = -1;
        } else {
            i = fs3.a[ks3.ordinal()];
        }
        if (i == -1) {
            return "*";
        }
        as3 as3 = this.b;
        if (i == 1) {
            return String.valueOf(as3);
        }
        if (i == 2) {
            return "in " + as3;
        } else if (i == 3) {
            return "out " + as3;
        } else {
            h.c();
            return null;
        }
    }
}
