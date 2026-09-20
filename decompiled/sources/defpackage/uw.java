package defpackage;

/* renamed from: uw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uw implements q25 {
    public static final uw a = new Object();
    public static final kc2 b = kc2.a("requestTimeMs");
    public static final kc2 c = kc2.a("requestUptimeMs");
    public static final kc2 d = kc2.a("clientInfo");
    public static final kc2 e = kc2.a("logSource");
    public static final kc2 f = kc2.a("logSourceName");
    public static final kc2 g = kc2.a("logEvent");
    public static final kc2 h = kc2.a("qosTier");

    public final void a(Object obj, Object obj2) {
        vb4 vb4 = (vb4) obj;
        r25 r25 = (r25) obj2;
        r25.g(b, ((b10) vb4).a);
        b10 b10 = (b10) vb4;
        r25.g(c, b10.b);
        r25.a(d, b10.c);
        r25.a(e, b10.d);
        r25.a(f, b10.e);
        r25.a(g, b10.f);
        r25.a(h, yu5.w);
    }
}
