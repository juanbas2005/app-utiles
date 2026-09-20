package defpackage;

/* renamed from: xc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xc8 {
    public final Object a;
    public final boolean b;

    public xc8(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public static xc8 a(xc8 xc8, s15 s15, boolean z, int i) {
        Object obj = s15;
        if ((i & 1) != 0) {
            obj = xc8.a;
        }
        if ((i & 2) != 0) {
            z = xc8.b;
        }
        xc8.getClass();
        return new xc8(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc8)) {
            return false;
        }
        xc8 xc8 = (xc8) obj;
        if (sg3.e(this.a, xc8.a) && this.b == xc8.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return Boolean.hashCode(this.b) + (i * 31);
    }

    public final String toString() {
        return "WithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }
}
