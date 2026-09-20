package defpackage;

/* renamed from: tl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl7 {
    public final vl a;
    public final v35 b;

    public tl7(vl vlVar, v35 v35) {
        this.a = vlVar;
        this.b = v35;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl7)) {
            return false;
        }
        tl7 tl7 = (tl7) obj;
        if (sg3.e(this.a, tl7.a) && sg3.e(this.b, tl7.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ")";
    }
}
