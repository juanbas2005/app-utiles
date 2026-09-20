package defpackage;

import com.google.protobuf.b;

/* renamed from: kd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kd extends b {
    private static final kd DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile nd5 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        kd kdVar = new kd();
        DEFAULT_INSTANCE = kdVar;
        b.q(kd.class, kdVar);
    }

    public static void s(kd kdVar, String str) {
        kdVar.getClass();
        str.getClass();
        kdVar.bitField0_ |= 1;
        kdVar.packageName_ = str;
    }

    public static void t(kd kdVar) {
        kdVar.getClass();
        kdVar.bitField0_ |= 2;
        kdVar.sdkVersion_ = "22.0.5";
    }

    public static void u(kd kdVar, String str) {
        kdVar.getClass();
        kdVar.bitField0_ |= 4;
        kdVar.versionName_ = str;
    }

    public static kd v() {
        return DEFAULT_INSTANCE;
    }

    public static id y() {
        return (id) DEFAULT_INSTANCE.j();
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
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new kd();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (kd.class) {
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

    public final boolean w() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }
}
