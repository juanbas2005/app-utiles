package defpackage;

/* renamed from: jx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jx implements q25 {
    public static final jx a = new Object();
    public static final kc2 b = kc2.a("baseAddress");
    public static final kc2 c = kc2.a("size");
    public static final kc2 d = kc2.a("name");
    public static final kc2 e = kc2.a("uuid");

    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        aa1 aa1 = (aa1) obj;
        r25 r25 = (r25) obj2;
        r25.g(b, ((uz) aa1).a);
        uz uzVar = (uz) aa1;
        r25.g(c, uzVar.b);
        r25.a(d, uzVar.c);
        String str = uzVar.d;
        if (str != null) {
            bArr = str.getBytes(ra1.a);
        } else {
            bArr = null;
        }
        r25.a(e, bArr);
    }
}
