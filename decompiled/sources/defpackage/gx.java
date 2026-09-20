package defpackage;

/* renamed from: gx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gx implements q25 {
    public static final gx a = new Object();
    public static final kc2 b = kc2.a("arch");
    public static final kc2 c = kc2.a("model");
    public static final kc2 d = kc2.a("cores");
    public static final kc2 e = kc2.a("ram");
    public static final kc2 f = kc2.a("diskSpace");
    public static final kc2 g = kc2.a("simulator");
    public static final kc2 h = kc2.a("state");
    public static final kc2 i = kc2.a("manufacturer");
    public static final kc2 j = kc2.a("modelClass");

    public final void a(Object obj, Object obj2) {
        z91 z91 = (z91) obj;
        r25 r25 = (r25) obj2;
        r25.e(b, ((pz) z91).a);
        pz pzVar = (pz) z91;
        r25.a(c, pzVar.b);
        r25.e(d, pzVar.c);
        r25.g(e, pzVar.d);
        r25.g(f, pzVar.e);
        r25.d(g, pzVar.f);
        r25.e(h, pzVar.g);
        r25.a(i, pzVar.h);
        r25.a(j, pzVar.i);
    }
}
