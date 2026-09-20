package defpackage;

/* renamed from: fy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fy implements q25 {
    public static final fy a = new Object();
    public static final kc2 b;
    public static final kc2 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [fy, java.lang.Object] */
    static {
        Class<zt5> cls = zt5.class;
        b = new kc2("logSource", b81.s(b81.r(cls, new wt(1))));
        c = new kc2("logEventDropped", b81.s(b81.r(cls, new wt(2))));
    }

    public final void a(Object obj, Object obj2) {
        wb4 wb4 = (wb4) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, wb4.a);
        r25.a(c, wb4.b);
    }
}
