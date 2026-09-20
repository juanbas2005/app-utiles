package defpackage;

/* renamed from: ky  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ky implements q25 {
    public static final ky a = new Object();
    public static final kc2 b;
    public static final kc2 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ky] */
    static {
        Class<zt5> cls = zt5.class;
        b = new kc2("currentCacheSizeBytes", b81.s(b81.r(cls, new wt(1))));
        c = new kc2("maxCacheSizeBytes", b81.s(b81.r(cls, new wt(2))));
    }

    public final void a(Object obj, Object obj2) {
        i47 i47 = (i47) obj;
        r25 r25 = (r25) obj2;
        r25.g(b, i47.a);
        r25.g(c, i47.b);
    }
}
