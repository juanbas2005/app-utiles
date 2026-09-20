package defpackage;

/* renamed from: qx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qx implements q25 {
    public static final qx a = new Object();
    public static final kc2 b = kc2.a("batteryLevel");
    public static final kc2 c = kc2.a("batteryVelocity");
    public static final kc2 d = kc2.a("proximityOn");
    public static final kc2 e = kc2.a("orientation");
    public static final kc2 f = kc2.a("ramUsed");
    public static final kc2 g = kc2.a("diskUsed");

    public final void a(Object obj, Object obj2) {
        ia1 ia1 = (ia1) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, ((d00) ia1).a);
        d00 d00 = (d00) ia1;
        r25.e(c, d00.b);
        r25.d(d, d00.c);
        r25.e(e, d00.d);
        r25.g(f, d00.e);
        r25.g(g, d00.f);
    }
}
