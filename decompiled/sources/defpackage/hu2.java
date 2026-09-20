package defpackage;

import com.google.protobuf.b;

/* renamed from: hu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hu2 extends b {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final hu2 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile nd5 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        hu2 hu2 = new hu2();
        DEFAULT_INSTANCE = hu2;
        b.q(hu2.class, hu2);
    }

    public static void s(hu2 hu2, int i) {
        hu2.bitField0_ |= 16;
        hu2.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void t(hu2 hu2, int i) {
        hu2.bitField0_ |= 32;
        hu2.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void u(hu2 hu2, int i) {
        hu2.bitField0_ |= 8;
        hu2.deviceRamSizeKb_ = i;
    }

    public static hu2 v() {
        return DEFAULT_INSTANCE;
    }

    public static gu2 x() {
        return (gu2) DEFAULT_INSTANCE.j();
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
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new hu2();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (hu2.class) {
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
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }
}
