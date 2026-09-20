package defpackage;

import com.google.protobuf.b;

/* renamed from: e91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e91 extends b {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e91 DEFAULT_INSTANCE;
    private static volatile nd5 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.protobuf.b, e91] */
    static {
        ? bVar = new b();
        DEFAULT_INSTANCE = bVar;
        b.q(e91.class, bVar);
    }

    public static void s(e91 e91, long j) {
        e91.bitField0_ |= 1;
        e91.clientTimeUs_ = j;
    }

    public static void t(e91 e91, long j) {
        e91.bitField0_ |= 2;
        e91.userTimeUs_ = j;
    }

    public static void u(e91 e91, long j) {
        e91.bitField0_ |= 4;
        e91.systemTimeUs_ = j;
    }

    public static d91 v() {
        return (d91) DEFAULT_INSTANCE.j();
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
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
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
                synchronized (e91.class) {
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
