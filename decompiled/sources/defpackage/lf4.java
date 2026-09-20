package defpackage;

/* renamed from: lf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf4 {
    public static jf4 a(Object obj, Object obj2) {
        jf4 jf4 = (jf4) obj;
        jf4 jf42 = (jf4) obj2;
        if (!jf42.isEmpty()) {
            if (!jf4.w) {
                jf4 = jf4.b();
            }
            jf4.a();
            if (!jf42.isEmpty()) {
                jf4.putAll(jf42);
            }
        }
        return jf4;
    }
}
