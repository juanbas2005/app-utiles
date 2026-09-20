package defpackage;

/* renamed from: uy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uy implements q25 {
    public static final uy a = new Object();
    public static final kc2 b = kc2.a("sessionId");
    public static final kc2 c = kc2.a("firstSessionId");
    public static final kc2 d = kc2.a("sessionIndex");
    public static final kc2 e = kc2.a("eventTimestampUs");
    public static final kc2 f = kc2.a("dataCollectionStatus");
    public static final kc2 g = kc2.a("firebaseInstallationId");
    public static final kc2 h = kc2.a("firebaseAuthenticationToken");

    public final void a(Object obj, Object obj2) {
        ym6 ym6 = (ym6) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, ym6.a);
        r25.a(c, ym6.b);
        r25.e(d, ym6.c);
        r25.g(e, ym6.d);
        r25.a(f, ym6.e);
        r25.a(g, ym6.f);
        r25.a(h, ym6.g);
    }
}
