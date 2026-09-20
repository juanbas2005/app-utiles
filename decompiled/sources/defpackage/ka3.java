package defpackage;

/* renamed from: ka3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ka3 {
    public final int a;
    public final Object b;

    public ka3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3 = (ka3) obj;
        if (this.a == ka3.a && sg3.e(this.b, ka3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
