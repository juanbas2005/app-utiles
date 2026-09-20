package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: xh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh0 extends vh0 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    public xh0(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        w52 w52 = wh0.a;
        ArrayList arrayList = new ArrayList(w52.f());
        int f = w52.f();
        for (int i = 0; i < f; i++) {
            DayOfWeek g = z10.g(w52.get(i));
            TextStyle unused = TextStyle.FULL_STANDALONE;
            String d2 = g.getDisplayName(TextStyle.FULL_STANDALONE, locale);
            TextStyle unused2 = TextStyle.NARROW_STANDALONE;
            arrayList.add(new yb5(d2, g.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    public final String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(e).toLocalDate().format(h03.m(str, locale, this.b));
    }

    public final th0 b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new th0(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final vf1 c(Locale locale) {
        FormatStyle unused = FormatStyle.SHORT;
        return rd3.n(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, (FormatStyle) null, Chronology.ofLocale(locale), locale));
    }

    public final int d() {
        return this.c;
    }

    public final yh0 e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    public final yh0 f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    public final yh0 g(th0 th0) {
        return l(LocalDate.of(th0.w, th0.x, 1));
    }

    public final th0 h() {
        LocalDate now = LocalDate.now();
        return new th0(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final List i() {
        return this.d;
    }

    public final th0 j(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, h03.m(str2, locale, this.b));
            return new th0(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final yh0 k(yh0 yh0, int i) {
        if (i <= 0) {
            return yh0;
        }
        return l(Instant.ofEpochMilli(yh0.e).atZone(e).toLocalDate().plusMonths((long) i));
    }

    public final yh0 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new yh0(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
