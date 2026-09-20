package defpackage;

/* renamed from: fe1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class fe1 {
    public final int a;
    public final int b;

    public fe1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fe1)) {
            return false;
        }
        fe1 fe1 = (fe1) obj;
        if (this.a == fe1.a && this.b == fe1.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(");
        return f21.j(sb, this.b, ')');
    }
}
