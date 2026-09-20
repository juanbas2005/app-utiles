package defpackage;

/* renamed from: az  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class az extends cv0 {
    public final t00 a;

    public az(t00 t00) {
        bv0 bv0 = bv0.w;
        this.a = t00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cv0)) {
            return false;
        }
        if (!this.a.equals(((az) ((cv0) obj)).a)) {
            return false;
        }
        bv0 bv0 = bv0.w;
        if (bv0.equals(bv0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ bv0.w.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + bv0.w + "}";
    }
}
