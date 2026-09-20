package defpackage;

import java.util.regex.Pattern;

/* renamed from: wa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wa9 {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(i36 i36) {
        if (i36.isEmpty()) {
            return null;
        }
        bl2 bl2 = new bl2("+", 3);
        m93 w = i36.listIterator(0);
        StringBuilder sb = new StringBuilder();
        bl2.a(sb, w);
        return "transform=".concat(sb.toString());
    }
}
