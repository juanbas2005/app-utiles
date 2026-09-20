package defpackage;

/* renamed from: jt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt extends mt {
    public final vb5 a;
    public final s62 b;

    public jt(vb5 vb5, s62 s62) {
        this.a = vb5;
        this.b = s62;
    }

    public final vb5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt)) {
            return false;
        }
        jt jtVar = (jt) obj;
        if (sg3.e(this.a, jtVar.a) && this.b.equals(jtVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        vb5 vb5 = this.a;
        if (vb5 == null) {
            i = 0;
        } else {
            i = vb5.hashCode();
        }
        return this.b.hashCode() + (i * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
