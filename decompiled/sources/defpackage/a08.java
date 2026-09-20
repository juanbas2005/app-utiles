package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a08 {
    public static final AtomicReference a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c = c(calendar);
        Calendar c2 = c((Calendar) null);
        c2.set(c.get(1), c.get(2), c.get(5));
        return c2;
    }

    public static Calendar b() {
        ni7 ni7 = (ni7) a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
            return instance;
        }
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }
}
