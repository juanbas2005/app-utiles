package defpackage;

/* renamed from: lh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lh5 {
    public final String a;
    public final int b;
    public final Integer c;

    public lh5(int i, Integer num, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh5)) {
            return false;
        }
        lh5 lh5 = (lh5) obj;
        if (sg3.e(this.a, lh5.a) && this.b == lh5.b && sg3.e(this.c, lh5.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int e = f21.e(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        return "Plan(key=" + this.a + ", nameRes=" + this.b + ", dias=" + this.c + ")";
    }
}
