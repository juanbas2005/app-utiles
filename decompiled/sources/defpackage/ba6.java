package defpackage;

/* renamed from: ba6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ba6 {
    public float a = 0.0f;
    public boolean b = true;
    public ie1 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba6)) {
            return false;
        }
        ba6 ba6 = (ba6) obj;
        if (Float.compare(this.a, ba6.a) == 0 && this.b == ba6.b && sg3.e(this.c, ba6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i(Float.hashCode(this.a) * 31, 31, this.b);
        ie1 ie1 = this.c;
        if (ie1 == null) {
            i = 0;
        } else {
            i = ie1.hashCode();
        }
        return (i2 + i) * 31;
    }

    public final String toString() {
        float f = this.a;
        boolean z = this.b;
        ie1 ie1 = this.c;
        return "RowColumnParentData(weight=" + f + ", fill=" + z + ", crossAxisAlignment=" + ie1 + ", flowLayoutData=null)";
    }
}
