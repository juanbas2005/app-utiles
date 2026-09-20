package defpackage;

/* renamed from: hx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hx implements q25 {
    public static final hx a = new Object();
    public static final kc2 b = kc2.a("generator");
    public static final kc2 c = kc2.a("identifier");
    public static final kc2 d = kc2.a("appQualitySessionId");
    public static final kc2 e = kc2.a("startedAt");
    public static final kc2 f = kc2.a("endedAt");
    public static final kc2 g = kc2.a("crashed");
    public static final kc2 h = kc2.a("app");
    public static final kc2 i = kc2.a("user");
    public static final kc2 j = kc2.a("os");
    public static final kc2 k = kc2.a("device");
    public static final kc2 l = kc2.a("events");
    public static final kc2 m = kc2.a("generatorType");

    public final void a(Object obj, Object obj2) {
        qa1 qa1 = (qa1) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, ((lz) qa1).a);
        lz lzVar = (lz) qa1;
        r25.a(c, lzVar.b.getBytes(ra1.a));
        r25.a(d, lzVar.c);
        r25.g(e, lzVar.d);
        r25.a(f, lzVar.e);
        r25.d(g, lzVar.f);
        r25.a(h, lzVar.g);
        r25.a(i, lzVar.h);
        r25.a(j, lzVar.i);
        r25.a(k, lzVar.j);
        r25.a(l, lzVar.k);
        r25.e(m, lzVar.l);
    }
}
