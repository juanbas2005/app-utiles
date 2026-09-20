package defpackage;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: zt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt {
    public static final Pattern c = Pattern.compile("(\\w+)\\s*=\\s*([^\\s#][^#]*)");
    public static final Pattern d = Pattern.compile("\\s*,\\s*");
    public final String a;
    public final String b;

    public zt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static Optional a(CharSequence charSequence) {
        Matcher matcher = c.matcher(charSequence);
        if (!matcher.matches()) {
            return Optional.empty();
        }
        return Optional.of(new zt(matcher.group(1), matcher.group(2)));
    }
}
