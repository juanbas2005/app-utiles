package kotlinx.datetime;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 $2\u00020\u0001:\u0001%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00108 X \u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0014\u0010#\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000f\u0001\u0002&'¨\u0006("}, d2 = {"Lkotlinx/datetime/DateTimePeriod;", "", "<init>", "()V", "", "allNonpositive", "()Z", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "getTotalMonths$kotlinx_datetime", "()J", "totalMonths", "getDays", "days", "getTotalNanoseconds$kotlinx_datetime", "totalNanoseconds", "getYears", "years", "getMonths", "months", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getNanoseconds", "nanoseconds", "Companion", "vi1", "Lkotlinx/datetime/DatePeriod;", "Lwi1;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = yi1.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class DateTimePeriod {
    public static final vi1 Companion = new Object();

    public /* synthetic */ DateTimePeriod(hl1 hl1) {
        this();
    }

    private final boolean allNonpositive() {
        if (getTotalMonths$kotlinx_datetime() > 0 || getDays() > 0 || getTotalNanoseconds$kotlinx_datetime() > 0) {
            return false;
        }
        if ((getTotalMonths$kotlinx_datetime() | getTotalNanoseconds$kotlinx_datetime()) == 0 && getDays() == 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimePeriod)) {
            return false;
        }
        DateTimePeriod dateTimePeriod = (DateTimePeriod) obj;
        if (getTotalMonths$kotlinx_datetime() == dateTimePeriod.getTotalMonths$kotlinx_datetime() && getDays() == dateTimePeriod.getDays() && getTotalNanoseconds$kotlinx_datetime() == dateTimePeriod.getTotalNanoseconds$kotlinx_datetime()) {
            return true;
        }
        return false;
    }

    public abstract int getDays();

    public int getHours() {
        return (int) (getTotalNanoseconds$kotlinx_datetime() / 3600000000000L);
    }

    public int getMinutes() {
        return (int) ((getTotalNanoseconds$kotlinx_datetime() % 3600000000000L) / 60000000000L);
    }

    public final int getMonths() {
        return (int) (getTotalMonths$kotlinx_datetime() % 12);
    }

    public int getNanoseconds() {
        return (int) (getTotalNanoseconds$kotlinx_datetime() % 1000000000);
    }

    public int getSeconds() {
        return (int) ((getTotalNanoseconds$kotlinx_datetime() % 60000000000L) / 1000000000);
    }

    public abstract long getTotalMonths$kotlinx_datetime();

    public abstract long getTotalNanoseconds$kotlinx_datetime();

    public final int getYears() {
        return (int) (getTotalMonths$kotlinx_datetime() / 12);
    }

    public int hashCode() {
        int days = getDays();
        return Long.hashCode(getTotalNanoseconds$kotlinx_datetime()) + ((days + (Long.hashCode(getTotalMonths$kotlinx_datetime()) * 31)) * 31);
    }

    public String toString() {
        int i;
        Object obj;
        StringBuilder sb = new StringBuilder();
        if (allNonpositive()) {
            sb.append('-');
            i = -1;
        } else {
            i = 1;
        }
        sb.append('P');
        if (getYears() != 0) {
            sb.append(getYears() * i);
            sb.append('Y');
        }
        if (getMonths() != 0) {
            sb.append(getMonths() * i);
            sb.append('M');
        }
        if (getDays() != 0) {
            sb.append(getDays() * i);
            sb.append('D');
        }
        String str = "";
        String str2 = "T";
        if (getHours() != 0) {
            sb.append(str2);
            sb.append(getHours() * i);
            sb.append('H');
            str2 = str;
        }
        if (getMinutes() != 0) {
            sb.append(str2);
            sb.append(getMinutes() * i);
            sb.append('M');
        } else {
            str = str2;
        }
        if ((getSeconds() | getNanoseconds()) != 0) {
            sb.append(str);
            if (getSeconds() != 0) {
                obj = Integer.valueOf(getSeconds() * i);
            } else if (getNanoseconds() * i < 0) {
                obj = "-0";
            } else {
                obj = "0";
            }
            sb.append(obj);
            if (getNanoseconds() != 0) {
                sb.append('.');
                sb.append(d57.O0(9, String.valueOf(Math.abs(getNanoseconds()))));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }

    private DateTimePeriod() {
    }
}
