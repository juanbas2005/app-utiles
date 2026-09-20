package defpackage;

import java.util.ArrayList;

/* renamed from: t63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t63 {
    public static final s63 b = new s63(0);
    public static final au c;
    public final ArrayList a = new ArrayList();

    static {
        as3 as3;
        Class<t63> cls = t63.class;
        gq3 b2 = b26.a.b(cls);
        try {
            as3 = b26.b(cls);
        } catch (Throwable unused) {
            as3 = null;
        }
        c = new au("HttpSend", new fp7(b2, as3));
    }
}
