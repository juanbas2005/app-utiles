package defpackage;

import com.google.protobuf.b;

/* renamed from: tg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tg extends b {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final tg DEFAULT_INSTANCE;
    private static volatile nd5 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.protobuf.b, tg] */
    static {
        ? bVar = new b();
        DEFAULT_INSTANCE = bVar;
        b.q(tg.class, bVar);
    }

    public static void s(tg tgVar, long j) {
        tgVar.bitField0_ |= 1;
        tgVar.clientTimeUs_ = j;
    }

    public static void t(tg tgVar, int i) {
        tgVar.bitField0_ |= 2;
        tgVar.usedAppJavaHeapMemoryKb_ = i;
    }

    public static sg u() {
        return (sg) DEFAULT_INSTANCE.j();
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new b();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (tg.class) {
                    try {
                        nd5 nd53 = PARSER;
                        nd5 = nd53;
                        if (nd53 == null) {
                            ? obj = new Object();
                            PARSER = obj;
                            nd5 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nd5;
            default:
                ku4.p();
                return null;
        }
    }
}
