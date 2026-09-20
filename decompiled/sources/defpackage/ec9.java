package defpackage;

/* renamed from: ec9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ec9 extends fc9 {
    public static final fc9 e;
    public static final fc9 f;

    static {
        fc9 b = new fc9((fc9) null, new zt6(0)).b();
        e = b;
        fc9 fc9 = new fc9(b, new zt6(0));
        Boolean bool = Boolean.TRUE;
        g75.o("Can't mutate after handing to trace", !fc9.c);
        g75.o("Key already present", !fc9.c());
        fc9.b.put(fc9.d, bool);
        f = fc9.b();
    }
}
