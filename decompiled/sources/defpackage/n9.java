package defpackage;

/* renamed from: n9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n9 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof n9)) {
                return false;
            }
            n9 n9Var = (n9) obj;
            int i = this.a;
            if (i != n9Var.a) {
                return false;
            }
            if (!(i == 8 && Math.abs(this.c - this.b) == 1 && this.c == n9Var.b && this.b == n9Var.c)) {
                if (this.c == n9Var.c && this.b == n9Var.b) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        return hl6.n(sb, this.c, ",p:null]");
    }
}
