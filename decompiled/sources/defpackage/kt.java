package defpackage;

/* renamed from: kt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kt extends mt {
    public final vb5 a;

    public kt(vb5 vb5) {
        this.a = vb5;
    }

    public final vb5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kt) && sg3.e(this.a, ((kt) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        vb5 vb5 = this.a;
        if (vb5 == null) {
            return 0;
        }
        return vb5.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
