package defpackage;

import kotlinx.datetime.UtcOffset;

/* renamed from: fa3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fa3 implements c08, d71 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public fa3(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final Boolean D() {
        return this.a;
    }

    public final UtcOffset a() {
        int i;
        Integer num;
        Integer num2;
        if (sg3.e(this.a, Boolean.TRUE)) {
            i = -1;
        } else {
            i = 1;
        }
        Integer num3 = this.b;
        Integer num4 = null;
        if (num3 != null) {
            num = Integer.valueOf(num3.intValue() * i);
        } else {
            num = null;
        }
        Integer num5 = this.c;
        if (num5 != null) {
            num2 = Integer.valueOf(num5.intValue() * i);
        } else {
            num2 = null;
        }
        Integer num6 = this.d;
        if (num6 != null) {
            num4 = Integer.valueOf(num6.intValue() * i);
        }
        return j08.a(num, num2, num4);
    }

    public final Integer c() {
        return this.d;
    }

    public final Object copy() {
        return new fa3(this.a, this.b, this.c, this.d);
    }

    public final void d(Integer num) {
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fa3)) {
            return false;
        }
        fa3 fa3 = (fa3) obj;
        if (!sg3.e(this.a, fa3.a) || !sg3.e(this.b, fa3.b) || !sg3.e(this.c, fa3.c) || !sg3.e(this.d, fa3.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Boolean bool = this.a;
        int i4 = 0;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        Integer num = this.b;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        Integer num2 = this.c;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = i5 + i3;
        Integer num3 = this.d;
        if (num3 != null) {
            i4 = num3.hashCode();
        }
        return i6 + i4;
    }

    public final void i(Integer num) {
        this.c = num;
    }

    public final void j(Integer num) {
        this.b = num;
    }

    public final void p(Boolean bool) {
        this.a = bool;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        if (bool == null) {
            str = " ";
        } else if (bool.booleanValue()) {
            str = "-";
        } else {
            str = "+";
        }
        sb.append(str);
        Object obj = this.b;
        Object obj2 = "??";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(':');
        Object obj3 = this.c;
        if (obj3 == null) {
            obj3 = obj2;
        }
        sb.append(obj3);
        sb.append(':');
        Object obj4 = this.d;
        if (obj4 != null) {
            obj2 = obj4;
        }
        sb.append(obj2);
        return sb.toString();
    }

    public final Integer w() {
        return this.b;
    }

    public final Integer x() {
        return this.c;
    }
}
