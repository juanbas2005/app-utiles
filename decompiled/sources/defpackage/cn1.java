package defpackage;

/* renamed from: cn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cn1 {
    public static final au a;
    public static final cc4 b = fc4.b("io.ktor.client.plugins.DefaultResponseValidation");

    static {
        as3 as3;
        Class<vs7> cls = vs7.class;
        gq3 b2 = b26.a.b(cls);
        try {
            as3 = b26.b(cls);
        } catch (Throwable unused) {
            as3 = null;
        }
        a = new au("ValidateMark", new fp7(b2, as3));
    }
}
