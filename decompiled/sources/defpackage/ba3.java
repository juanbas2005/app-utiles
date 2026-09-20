package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.f;

/* renamed from: ba3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ba3 implements mf8, pf1, d71 {
    public final ga3 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public ba3(ga3 ga3, Integer num, Integer num2, Integer num3) {
        this.a = ga3;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final void F(Integer num) {
        this.d = num;
    }

    /* renamed from: a */
    public final ba3 copy() {
        ga3 ga3 = this.a;
        return new ba3(new ga3(ga3.a, ga3.b), this.b, this.c, this.d);
    }

    public final LocalDate b() {
        LocalDate localDate;
        ga3 ga3 = this.a;
        Integer num = ga3.a;
        rf8.a("year", num);
        int intValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = ga3.b;
            rf8.a("monthNumber", num3);
            int intValue2 = num3.intValue();
            Integer num4 = this.b;
            rf8.a("day", num4);
            localDate = new LocalDate(intValue, intValue2, num4.intValue());
        } else {
            LocalDate localDate2 = new LocalDate(intValue, 1, 1);
            DateTimeUnit.Companion.getClass();
            DateTimeUnit.DayBased access$getDAY$cp = DateTimeUnit.DAY;
            access$getDAY$cp.getClass();
            LocalDate a2 = f.a(localDate2, (long) (num2.intValue() - 1), access$getDAY$cp);
            if (a2.getYear() == intValue) {
                if (ga3.b != null) {
                    yl4 month = a2.getMonth();
                    month.getClass();
                    int ordinal = month.ordinal() + 1;
                    Integer num5 = ga3.b;
                    if (num5 == null || ordinal != num5.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        sb.append(a2.getMonth());
                        Integer num6 = ga3.b;
                        sb.append(", but ");
                        sb.append(num6);
                        sb.append(" was specified as the month number");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (this.b != null) {
                    int day = a2.getDay();
                    Integer num7 = this.b;
                    if (num7 == null || day != num7.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(a2.getDay());
                        sb2.append(" of ");
                        sb2.append(a2.getMonth());
                        Integer num8 = this.b;
                        sb2.append(", but ");
                        sb2.append(num8);
                        sb2.append(" was specified as the day of month");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                localDate = a2;
            } else {
                throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue);
            }
        }
        Integer num9 = this.c;
        if (num9 != null) {
            int intValue3 = num9.intValue();
            ij1 dayOfWeek = localDate.getDayOfWeek();
            dayOfWeek.getClass();
            if (intValue3 != dayOfWeek.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > intValue3 || intValue3 >= 8) {
                    h.j(hl6.k(intValue3, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((ij1) ij1.x.get(intValue3 - 1));
                sb3.append(" but the date is ");
                sb3.append(localDate);
                sb3.append(", which is a ");
                sb3.append(localDate.getDayOfWeek());
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return localDate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba3)) {
            return false;
        }
        ba3 ba3 = (ba3) obj;
        if (!sg3.e(this.a, ba3.a) || !sg3.e(this.b, ba3.b) || !sg3.e(this.c, ba3.c) || !sg3.e(this.d, ba3.d)) {
            return false;
        }
        return true;
    }

    public final void g(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i * 961) + hashCode;
        Integer num2 = this.c;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i2 * 31) + i4;
        Integer num3 = this.d;
        if (num3 != null) {
            i3 = num3.hashCode();
        }
        return i5 + i3;
    }

    public final Integer l() {
        return this.a.a;
    }

    public final Integer m() {
        return this.c;
    }

    public final Integer r() {
        return this.b;
    }

    public final void s(Integer num) {
        this.b = num;
    }

    public final String toString() {
        Integer num = this.d;
        ga3 ga3 = this.a;
        Object obj = "??";
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ga3);
            sb.append('-');
            Object obj2 = this.b;
            if (obj2 == null) {
                obj2 = obj;
            }
            sb.append(obj2);
            sb.append(" (day of week is ");
            Object obj3 = this.c;
            if (obj3 != null) {
                obj = obj3;
            }
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        } else if (this.b == null && ga3.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj4 = ga3.a;
            if (obj4 == null) {
                obj4 = obj;
            }
            sb2.append(obj4);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Object obj5 = this.c;
            if (obj5 != null) {
                obj = obj5;
            }
            sb2.append(obj);
            sb2.append(')');
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ga3);
            sb3.append('-');
            Object obj6 = this.b;
            if (obj6 == null) {
                obj6 = obj;
            }
            sb3.append(obj6);
            sb3.append(" (day of week is ");
            Object obj7 = this.c;
            if (obj7 != null) {
                obj = obj7;
            }
            sb3.append(obj);
            sb3.append(", day of year is ");
            sb3.append(this.d);
            sb3.append(')');
            return sb3.toString();
        }
    }

    public final Integer u() {
        return this.d;
    }

    public final void v(Integer num) {
        this.a.a = num;
    }

    public final Integer y() {
        return this.a.b;
    }

    public final void z(Integer num) {
        this.c = num;
    }

    public /* synthetic */ ba3() {
        this(new ga3((Integer) null, (Integer) null), (Integer) null, (Integer) null, (Integer) null);
    }
}
