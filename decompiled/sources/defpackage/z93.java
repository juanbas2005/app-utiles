package defpackage;

/* renamed from: z93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z93 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final rk4 d;
    public final String e;

    public z93(Object obj, Object obj2, rk4 rk4, rk4 rk42, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = rk4;
        this.d = rk42;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z93)) {
            return false;
        }
        z93 z93 = (z93) obj;
        if (this.a.equals(z93.a) && sg3.e(this.b, z93.b) && sg3.e(this.c, z93.c) && this.d.equals(z93.d) && this.e.equals(z93.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        Object obj = this.b;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        Object obj2 = this.c;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return this.e.hashCode() + ((this.d.hashCode() + ((i3 + i2) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return hl6.o(sb, this.e, ')');
    }
}
