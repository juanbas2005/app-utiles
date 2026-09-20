package defpackage;

import com.google.protobuf.b;

/* renamed from: ku2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ku2 extends b {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final ku2 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile nd5 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private pf3 androidMemoryReadings_;
    private int bitField0_;
    private pf3 cpuMetricReadings_;
    private hu2 gaugeMetadata_;
    private String sessionId_ = "";

    static {
        ku2 ku2 = new ku2();
        DEFAULT_INSTANCE = ku2;
        b.q(ku2.class, ku2);
    }

    public ku2() {
        cu5 cu5 = cu5.z;
        this.cpuMetricReadings_ = cu5;
        this.androidMemoryReadings_ = cu5;
    }

    public static ju2 C() {
        return (ju2) DEFAULT_INSTANCE.j();
    }

    public static void s(ku2 ku2, String str) {
        ku2.getClass();
        str.getClass();
        ku2.bitField0_ |= 1;
        ku2.sessionId_ = str;
    }

    public static void t(ku2 ku2, tg tgVar) {
        ku2.getClass();
        tgVar.getClass();
        pf3 pf3 = ku2.androidMemoryReadings_;
        if (!((r2) pf3).w) {
            ku2.androidMemoryReadings_ = b.p(pf3);
        }
        ku2.androidMemoryReadings_.add(tgVar);
    }

    public static void u(ku2 ku2, hu2 hu2) {
        ku2.getClass();
        hu2.getClass();
        ku2.gaugeMetadata_ = hu2;
        ku2.bitField0_ |= 2;
    }

    public static void v(ku2 ku2, e91 e91) {
        ku2.getClass();
        e91.getClass();
        pf3 pf3 = ku2.cpuMetricReadings_;
        if (!((r2) pf3).w) {
            ku2.cpuMetricReadings_ = b.p(pf3);
        }
        ku2.cpuMetricReadings_.add(e91);
    }

    public static ku2 y() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e91.class, "gaugeMetadata_", "androidMemoryReadings_", tg.class});
            case 3:
                return new ku2();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (ku2.class) {
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

    public final int w() {
        return this.androidMemoryReadings_.size();
    }

    public final int x() {
        return this.cpuMetricReadings_.size();
    }

    public final hu2 z() {
        hu2 hu2 = this.gaugeMetadata_;
        if (hu2 == null) {
            return hu2.v();
        }
        return hu2;
    }
}
