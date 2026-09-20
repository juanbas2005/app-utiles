package defpackage;

/* renamed from: is7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class is7 {
    public final Object a;
    public final boolean b;
    public final hv2 c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ is7(int i, Object obj) {
        this(obj, r4, new hv2(25, (Object) null));
        boolean z;
        if ((i & 2) != 0) {
            z = false;
        } else {
            z = true;
        }
    }

    public static is7 a(is7 is7, Object obj, boolean z, hv2 hv2, int i) {
        if ((i & 1) != 0) {
            obj = is7.a;
        }
        if ((i & 2) != 0) {
            z = is7.b;
        }
        if ((i & 4) != 0) {
            hv2 = is7.c;
        }
        is7.getClass();
        obj.getClass();
        hv2.getClass();
        return new is7(obj, z, hv2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is7)) {
            return false;
        }
        is7 is7 = (is7) obj;
        if (sg3.e(this.a, is7.a) && this.b == is7.b && sg3.e(this.c, is7.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "UiState(data=" + this.a + ", loading=" + this.b + ", error=" + this.c + ")";
    }

    public is7(Object obj, boolean z, hv2 hv2) {
        obj.getClass();
        hv2.getClass();
        this.a = obj;
        this.b = z;
        this.c = hv2;
    }
}
