package defpackage;

/* renamed from: ga7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ga7 {
    public final String a;
    public final int b;
    public final int c;

    public ga7(int i, int i2, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga7)) {
            return false;
        }
        ga7 ga7 = (ga7) obj;
        if (sg3.e(this.a, ga7.a) && this.b == ga7.b && this.c == ga7.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f21.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return f21.j(sb, this.c, ')');
    }
}
