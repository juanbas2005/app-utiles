package defpackage;

import java.nio.charset.Charset;

/* renamed from: vc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc7 extends h85 {
    public final String a;
    public final q51 b;
    public final byte[] c;

    public vc7(String str, q51 q51) {
        str.getClass();
        q51.getClass();
        this.a = str;
        this.b = q51;
        Charset a2 = t51.a(q51);
        this.c = z65.R(str, a2 == null ? mo0.a : a2);
    }

    public final Long a() {
        return Long.valueOf((long) this.c.length);
    }

    public final q51 b() {
        return this.b;
    }

    public final byte[] d() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + d57.i1(30, this.a) + '\"';
    }
}
