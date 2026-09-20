package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: kr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kr8 extends y29 {
    public long y;
    public String z;

    public final boolean d1() {
        Calendar instance = Calendar.getInstance();
        this.y = ((long) (instance.get(16) + instance.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.z = f21.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long g1() {
        e1();
        return this.y;
    }

    public final String h1() {
        e1();
        return this.z;
    }
}
