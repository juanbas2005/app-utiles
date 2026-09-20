package defpackage;

/* renamed from: zw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw implements q25 {
    public static final zw a = new Object();
    public static final kc2 b = kc2.a("pid");
    public static final kc2 c = kc2.a("processName");
    public static final kc2 d = kc2.a("reasonCode");
    public static final kc2 e = kc2.a("importance");
    public static final kc2 f = kc2.a("pss");
    public static final kc2 g = kc2.a("rss");
    public static final kc2 h = kc2.a("timestamp");
    public static final kc2 i = kc2.a("traceFile");
    public static final kc2 j = kc2.a("buildIdMappingForArch");

    public final void a(Object obj, Object obj2) {
        t91 t91 = (t91) obj;
        r25 r25 = (r25) obj2;
        r25.e(b, ((fz) t91).a);
        fz fzVar = (fz) t91;
        r25.a(c, fzVar.b);
        r25.e(d, fzVar.c);
        r25.e(e, fzVar.d);
        r25.g(f, fzVar.e);
        r25.g(g, fzVar.f);
        r25.g(h, fzVar.g);
        r25.a(i, fzVar.h);
        r25.a(j, fzVar.i);
    }
}
