package defpackage;

/* renamed from: vf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf1 {
    public final String a;
    public final char b;
    public final String c;

    public vf1(String str, char c2) {
        this.a = str;
        this.b = c2;
        this.c = k57.s0(str, String.valueOf(c2), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf1)) {
            return false;
        }
        vf1 vf1 = (vf1) obj;
        if (this.a.equals(vf1.a) && this.b == vf1.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ")";
    }
}
