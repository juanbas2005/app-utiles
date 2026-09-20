package defpackage;

import java.util.Set;

/* renamed from: u61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u61 {
    public static final Set a = qs.r1(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    public static final k26 b = new k26("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    public static final Set c = qs.r1(new Character[]{';', ',', '\"'});

    public static final void a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (rd3.C(charAt) || sg3.k(charAt, 32) < 0 || c.contains(Character.valueOf(charAt))) {
                h.q("Cookie name is not valid: ".concat(str));
                return;
            }
        }
    }

    public static final String b(String str, r61 r61) {
        str.getClass();
        int ordinal = r61.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ss0.e(str, true);
                }
                if (ordinal == 3) {
                    return m50.a(m50.f, k57.l0(str));
                }
                h.c();
                return null;
            } else if (!d57.y0(str, '\"')) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (rd3.C(charAt) || sg3.k(charAt, 32) < 0 || c.contains(Character.valueOf(charAt))) {
                        return pb4.h('\"', "\"", str);
                    }
                }
            } else {
                h.q("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                return null;
            }
        }
        return str;
    }
}
