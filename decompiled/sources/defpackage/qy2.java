package defpackage;

/* renamed from: qy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qy2 {
    public final gb0 a;
    public final py2 b;
    public final bl2 c;

    public qy2(gb0 gb0, py2 py2, bl2 bl2) {
        this.a = gb0;
        this.b = py2;
        this.c = bl2;
        if (gb0.b() == 0 && gb0.a() == 0) {
            h.q("Bounds must be non zero");
            throw null;
        } else if (gb0.a != 0 && gb0.b != 0) {
            h.q("Bounding rectangle must start at the top or left window edge for folding features");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (qy2.class.equals(cls)) {
            obj.getClass();
            qy2 qy2 = (qy2) obj;
            if (this.a.equals(qy2.a) && this.b == qy2.b && this.c == qy2.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return qy2.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
