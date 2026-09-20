package defpackage;

/* renamed from: sx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sx0 {
    public final int a;
    public final Integer b;

    public sx0(int i, g75 g75, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0 = (sx0) obj;
        if (this.a == sx0.a && sg3.e((Object) null, (Object) null) && sg3.e(this.b, sx0.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + null + ", groupOffset=" + this.b + ")";
    }
}
