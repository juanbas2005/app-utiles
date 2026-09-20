package defpackage;

import com.google.protobuf.b;

/* renamed from: nf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nf5 extends b implements of5 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final nf5 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile nd5 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ir applicationInfo_;
    private int bitField0_;
    private ku2 gaugeMetric_;
    private ry4 networkRequestMetric_;
    private yk7 traceMetric_;
    private fn7 transportInfo_;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.protobuf.b, nf5] */
    static {
        ? bVar = new b();
        DEFAULT_INSTANCE = bVar;
        b.q(nf5.class, bVar);
    }

    public static void s(nf5 nf5, ir irVar) {
        nf5.getClass();
        nf5.applicationInfo_ = irVar;
        nf5.bitField0_ |= 1;
    }

    public static void t(nf5 nf5, ku2 ku2) {
        nf5.getClass();
        nf5.gaugeMetric_ = ku2;
        nf5.bitField0_ |= 8;
    }

    public static void u(nf5 nf5, yk7 yk7) {
        nf5.getClass();
        nf5.traceMetric_ = yk7;
        nf5.bitField0_ |= 2;
    }

    public static void v(nf5 nf5, ry4 ry4) {
        nf5.getClass();
        nf5.networkRequestMetric_ = ry4;
        nf5.bitField0_ |= 4;
    }

    public static mf5 y() {
        return (mf5) DEFAULT_INSTANCE.j();
    }

    public final boolean a() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final yk7 c() {
        yk7 yk7 = this.traceMetric_;
        if (yk7 == null) {
            return yk7.F();
        }
        return yk7;
    }

    public final boolean d() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final ry4 e() {
        ry4 ry4 = this.networkRequestMetric_;
        if (ry4 == null) {
            return ry4.G();
        }
        return ry4;
    }

    public final ku2 f() {
        ku2 ku2 = this.gaugeMetric_;
        if (ku2 == null) {
            return ku2.y();
        }
        return ku2;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
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
                synchronized (nf5.class) {
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

    public final ir w() {
        ir irVar = this.applicationInfo_;
        if (irVar == null) {
            return ir.y();
        }
        return irVar;
    }

    public final boolean x() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
