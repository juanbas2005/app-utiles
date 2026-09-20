package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: oo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class oo {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static za4 b(Configuration configuration) {
        return za4.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(za4 za4) {
        LocaleList.setDefault(LocaleList.forLanguageTags(za4.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, za4 za4) {
        configuration.setLocales(LocaleList.forLanguageTags(za4.a.a.toLanguageTags()));
    }
}
