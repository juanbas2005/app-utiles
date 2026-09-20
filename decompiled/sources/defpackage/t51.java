package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: t51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t51 {
    public static final /* synthetic */ int a = 0;

    static {
        qs.r1(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});
    }

    public static final Charset a(q51 q51) {
        q51.getClass();
        String b = q51.b("charset");
        if (b == null) {
            return null;
        }
        try {
            Charset charset = mo0.a;
            Charset forName = Charset.forName(b);
            forName.getClass();
            return forName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final q51 b(q51 q51, Charset charset) {
        q51.getClass();
        charset.getClass();
        String lowerCase = q51.c.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("text")) {
            return q51;
        }
        String name = charset.name();
        name.getClass();
        return q51.c(name);
    }
}
