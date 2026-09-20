package defpackage;

import kotlinx.datetime.LocalTime;

/* renamed from: da3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da3 implements ei7, d71 {
    public Integer a;
    public Integer b;
    public ub c;
    public Integer d;
    public Integer e;
    public Integer f;

    public da3(Integer num, Integer num2, ub ubVar, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = ubVar;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    public final void A(Integer num) {
        this.a = num;
    }

    public final Integer B() {
        return this.a;
    }

    public final Integer C() {
        return this.e;
    }

    public final void E(Integer num) {
        this.e = num;
    }

    public final ub b() {
        return this.c;
    }

    /* renamed from: c */
    public final da3 copy() {
        return new da3(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final LocalTime d() {
        int i;
        int i2;
        boolean z;
        int intValue;
        Integer num = this.a;
        Integer num2 = this.b;
        ub ubVar = ub.w;
        Integer num3 = null;
        int i3 = 12;
        int i4 = 0;
        if (num != null) {
            i = num.intValue();
            boolean z2 = true;
            if (num2 == null || ((i + 11) % 12) + 1 == (intValue = num2.intValue())) {
                ub ubVar2 = this.c;
                if (ubVar2 != null) {
                    if (ubVar2 == ubVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i < 12) {
                        z2 = false;
                    }
                    if (z != z2) {
                        throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + i + ", but the AM/PM marker is " + ubVar2).toString());
                    }
                }
            } else {
                h.j(b81.l(i, intValue, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
        } else {
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ub ubVar3 = this.c;
                if (ubVar3 != null) {
                    if (intValue2 == 12) {
                        intValue2 = 0;
                    }
                    if (ubVar3 != ubVar) {
                        i3 = 0;
                    }
                    num3 = Integer.valueOf(intValue2 + i3);
                }
            }
            if (num3 != null) {
                i = num3.intValue();
            } else {
                throw new IllegalArgumentException("Incomplete time: missing hour");
            }
        }
        Integer num4 = this.d;
        rf8.a("minute", num4);
        int intValue3 = num4.intValue();
        Integer num5 = this.e;
        if (num5 != null) {
            i2 = num5.intValue();
        } else {
            i2 = 0;
        }
        Integer num6 = this.f;
        if (num6 != null) {
            i4 = num6.intValue();
        }
        return new LocalTime(i, intValue3, i2, i4);
    }

    public final void e(Integer num) {
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof da3)) {
            return false;
        }
        da3 da3 = (da3) obj;
        if (!sg3.e(this.a, da3.a) || !sg3.e(this.b, da3.b) || this.c != da3.c || !sg3.e(this.d, da3.d) || !sg3.e(this.e, da3.e) || !sg3.e(this.f, da3.f)) {
            return false;
        }
        return true;
    }

    public final void f(Integer num) {
        this.f = num;
    }

    public final Integer h() {
        return this.d;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num = this.a;
        int i6 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        int i8 = (i2 * 31) + i7;
        ub ubVar = this.c;
        if (ubVar != null) {
            i3 = ubVar.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i3 * 31) + i8;
        Integer num3 = this.d;
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            i4 = 0;
        }
        int i10 = (i4 * 31) + i9;
        Integer num4 = this.e;
        if (num4 != null) {
            i5 = num4.intValue();
        } else {
            i5 = 0;
        }
        int i11 = (i5 * 31) + i10;
        Integer num5 = this.f;
        if (num5 != null) {
            i6 = num5.intValue();
        }
        return i11 + i6;
    }

    public final void k(Integer num) {
        this.d = num;
    }

    public final Integer o() {
        return this.f;
    }

    public final Integer q() {
        return this.b;
    }

    public final void t(ub ubVar) {
        this.c = ubVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r4 == null) goto L_0x0045;
     */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        Object obj2 = "??";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(':');
        Object obj3 = this.d;
        if (obj3 == null) {
            obj3 = obj2;
        }
        sb.append(obj3);
        sb.append(':');
        Object obj4 = this.e;
        if (obj4 != null) {
            obj2 = obj4;
        }
        sb.append(obj2);
        sb.append('.');
        Integer num = this.f;
        if (num != null) {
            String valueOf = String.valueOf(num.intValue());
            str = d57.O0(9 - valueOf.length(), valueOf);
        }
        str = "???";
        sb.append(str);
        return sb.toString();
    }

    public /* synthetic */ da3() {
        this((Integer) null, (Integer) null, (ub) null, (Integer) null, (Integer) null, (Integer) null);
    }
}
