package defpackage;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: xz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz0 {
    public static final Pattern e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final HashSet a = new HashSet();
    public final Executor b;
    public final qz0 c;
    public final qz0 d;

    static {
        Charset.forName("UTF-8");
    }

    public xz0(Executor executor, qz0 qz0, qz0 qz02) {
        this.b = executor;
        this.c = qz0;
        this.d = qz02;
    }

    public static HashSet a(qz0 qz0) {
        HashSet hashSet = new HashSet();
        sz0 c2 = qz0.c();
        if (c2 != null) {
            Iterator<String> keys = c2.b.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }
}
