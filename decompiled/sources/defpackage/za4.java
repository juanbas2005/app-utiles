package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: za4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class za4 {
    public static final za4 b = new za4(new ab4(new LocaleList(new Locale[0])));
    public final ab4 a;

    public za4(ab4 ab4) {
        this.a = ab4;
    }

    public static za4 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new za4(new ab4(new LocaleList(localeArr)));
    }

    public final boolean b() {
        return this.a.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof za4)) {
            return false;
        }
        if (this.a.equals(((za4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
