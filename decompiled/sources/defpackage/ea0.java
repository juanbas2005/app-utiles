package defpackage;

/* renamed from: ea0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ea0 {
    public static final au a;
    public static final au b;
    public static final wr0 c = new wr0("BodyProgress", (sr2) new o(20), (vr2) new j5(15));

    static {
        as3 as3;
        Class<sq5> cls = sq5.class;
        gq3 b2 = b26.a.b(cls);
        as3 as32 = null;
        try {
            as3 = b26.b(cls);
        } catch (Throwable unused) {
            as3 = null;
        }
        a = new au("UploadProgressListenerAttributeKey", new fp7(b2, as3));
        gq3 b3 = b26.a.b(cls);
        try {
            as32 = b26.b(cls);
        } catch (Throwable unused2) {
        }
        b = new au("DownloadProgressListenerAttributeKey", new fp7(b3, as32));
    }
}
