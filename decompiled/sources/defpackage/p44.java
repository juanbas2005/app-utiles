package defpackage;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: p44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p44 extends vh0 {
    public static final TimeZone e = TimeZone.getTimeZone("UTC");
    public final int c;
    public final n74 d;

    public p44(Locale locale) {
        super(locale);
        int i = 7;
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : i;
        n74 m = sg3.m();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List R0 = qs.R0(2, weekdays);
        int size = R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.add(new yb5((String) R0.get(i2), shortWeekdays[i2 + 2]));
        }
        m.add(new yb5(weekdays[1], shortWeekdays[1]));
        this.d = sg3.i(m);
    }

    public final String a(long j, String str, Locale locale) {
        String n = b81.n(str, locale.toLanguageTag());
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(n);
        TimeZone timeZone = e;
        SimpleDateFormat simpleDateFormat = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, locale);
            simpleDateFormat2.setTimeZone(timeZone);
            linkedHashMap.put(n, simpleDateFormat2);
            simpleDateFormat = simpleDateFormat2;
        }
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTimeInMillis(j);
        return ((SimpleDateFormat) simpleDateFormat).format(Long.valueOf(instance.getTimeInMillis()));
    }

    public final th0 b(long j) {
        Calendar instance = Calendar.getInstance(e);
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new th0(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
    }

    public final vf1 c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return rd3.n(((SimpleDateFormat) dateInstance).toPattern());
    }

    public final int d() {
        return this.c;
    }

    public final yh0 e(int i, int i2) {
        Calendar instance = Calendar.getInstance(e);
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, 1);
        return l(instance);
    }

    public final yh0 f(long j) {
        Calendar instance = Calendar.getInstance(e);
        instance.setTimeInMillis(j);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return l(instance);
    }

    public final yh0 g(th0 th0) {
        return e(th0.w, th0.x);
    }

    public final th0 h() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new th0(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis() + ((long) (instance.get(16) + instance.get(15))));
    }

    public final List i() {
        return this.d;
    }

    public final th0 j(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(parse);
            return new th0(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    public final yh0 k(yh0 yh0, int i) {
        if (i <= 0) {
            return yh0;
        }
        Calendar instance = Calendar.getInstance(e);
        instance.setTimeInMillis(yh0.e);
        instance.add(2, i);
        return l(instance);
    }

    public final yh0 l(Calendar calendar) {
        int i = 7;
        int i2 = (calendar.get(7) + 6) % 7;
        if (i2 != 0) {
            i = i2;
        }
        int i3 = i - this.c;
        if (i3 < 0) {
            i3 += 7;
        }
        return new yh0(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i3, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
