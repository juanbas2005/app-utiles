package defpackage;

import java.nio.charset.Charset;

/* renamed from: w47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w47 {
    public static final String a;
    public static final boolean b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        a = name;
        if ("SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name)) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }
}
