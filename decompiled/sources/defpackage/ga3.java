package defpackage;

/* renamed from: ga3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ga3 implements mf8, d71 {
    public Integer a;
    public Integer b;

    public ga3(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final Object copy() {
        return new ga3(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ga3)) {
            return false;
        }
        ga3 ga3 = (ga3) obj;
        if (!sg3.e(this.a, ga3.a) || !sg3.e(this.b, ga3.b)) {
            return false;
        }
        return true;
    }

    public final void g(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        int i;
        Integer num = this.a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public final Integer l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        Object obj2 = "??";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append('-');
        Object obj3 = this.b;
        if (obj3 != null) {
            obj2 = obj3;
        }
        sb.append(obj2);
        return sb.toString();
    }

    public final void v(Integer num) {
        this.a = num;
    }

    public final Integer y() {
        return this.b;
    }
}
