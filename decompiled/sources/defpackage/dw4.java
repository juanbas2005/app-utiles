package defpackage;

/* renamed from: dw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dw4 extends ew4 {
    public final qv4 a;
    public final int b;

    public dw4(qv4 qv4, int i) {
        qv4.getClass();
        this.a = qv4;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dw4.class != obj.getClass()) {
            return false;
        }
        dw4 dw4 = (dw4) obj;
        if (this.b == dw4.b && sg3.e(this.a, dw4.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return f21.j(sb, this.b, ')');
    }
}
