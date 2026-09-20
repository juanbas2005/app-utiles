package defpackage;

/* renamed from: mc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mc7 {
    public final vl a;
    public vl b;
    public boolean c = false;
    public rn4 d = null;

    public mc7(vl vlVar, vl vlVar2) {
        this.a = vlVar;
        this.b = vlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc7)) {
            return false;
        }
        mc7 mc7 = (mc7) obj;
        if (sg3.e(this.a, mc7.a) && sg3.e(this.b, mc7.b) && this.c == mc7.c && sg3.e(this.d, mc7.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        rn4 rn4 = this.d;
        if (rn4 == null) {
            i = 0;
        } else {
            i = rn4.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        vl vlVar = this.b;
        boolean z = this.c;
        rn4 rn4 = this.d;
        return "TextSubstitutionValue(original=" + this.a + ", substitution=" + vlVar + ", isShowingSubstitution=" + z + ", layoutCache=" + rn4 + ")";
    }
}
