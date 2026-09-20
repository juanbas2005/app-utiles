package defpackage;

/* renamed from: nt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt3 extends fu3 {
    public final String a;
    public final int b;
    public final String c;

    public nt3(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
        if (i > 0) {
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.a);
            int i3 = this.b;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.c = sb.toString();
            return;
        }
        h.q("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt3)) {
            return false;
        }
        nt3 nt3 = (nt3) obj;
        if (sg3.e(this.a, nt3.a) && this.b == nt3.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.c;
    }
}
