package defpackage;

import com.google.protobuf.a;
import com.google.protobuf.b;
import java.util.List;

/* renamed from: ry4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ry4 extends b {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final ry4 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile nd5 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private if4 customAttributes_ = if4.x;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private pf3 perfSessions_ = cu5.z;
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    static {
        ry4 ry4 = new ry4();
        DEFAULT_INSTANCE = ry4;
        b.q(ry4.class, ry4);
    }

    public static void A(ry4 ry4, long j) {
        ry4.bitField0_ |= 1024;
        ry4.timeToResponseCompletedUs_ = j;
    }

    public static void B(ry4 ry4, List list) {
        pf3 pf3 = ry4.perfSessions_;
        if (!((r2) pf3).w) {
            ry4.perfSessions_ = b.p(pf3);
        }
        a.g(list, ry4.perfSessions_);
    }

    public static void C(ry4 ry4, int i) {
        ry4.getClass();
        ry4.httpMethod_ = b81.B(i);
        ry4.bitField0_ |= 2;
    }

    public static void D(ry4 ry4, long j) {
        ry4.bitField0_ |= 4;
        ry4.requestPayloadBytes_ = j;
    }

    public static void E(ry4 ry4, long j) {
        ry4.bitField0_ |= 8;
        ry4.responsePayloadBytes_ = j;
    }

    public static ry4 G() {
        return DEFAULT_INSTANCE;
    }

    public static py4 Y() {
        return (py4) DEFAULT_INSTANCE.j();
    }

    public static void s(ry4 ry4, String str) {
        ry4.getClass();
        ry4.bitField0_ |= 1;
        ry4.url_ = str;
    }

    public static void t(ry4 ry4) {
        ry4.getClass();
        ry4.networkClientErrorReason_ = b81.B(2);
        ry4.bitField0_ |= 16;
    }

    public static void u(ry4 ry4, int i) {
        ry4.bitField0_ |= 32;
        ry4.httpResponseCode_ = i;
    }

    public static void v(ry4 ry4, String str) {
        ry4.getClass();
        str.getClass();
        ry4.bitField0_ |= 64;
        ry4.responseContentType_ = str;
    }

    public static void w(ry4 ry4) {
        ry4.bitField0_ &= -65;
        ry4.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void x(ry4 ry4, long j) {
        ry4.bitField0_ |= 128;
        ry4.clientStartTimeUs_ = j;
    }

    public static void y(ry4 ry4, long j) {
        ry4.bitField0_ |= 256;
        ry4.timeToRequestCompletedUs_ = j;
    }

    public static void z(ry4 ry4, long j) {
        ry4.bitField0_ |= 512;
        ry4.timeToResponseInitiatedUs_ = j;
    }

    public final long F() {
        return this.clientStartTimeUs_;
    }

    public final int H() {
        int i;
        switch (this.httpMethod_) {
            case b85.b:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int I() {
        return this.httpResponseCode_;
    }

    public final pf3 J() {
        return this.perfSessions_;
    }

    public final long K() {
        return this.requestPayloadBytes_;
    }

    public final long L() {
        return this.responsePayloadBytes_;
    }

    public final long M() {
        return this.timeToRequestCompletedUs_;
    }

    public final long N() {
        return this.timeToResponseCompletedUs_;
    }

    public final long O() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String P() {
        return this.url_;
    }

    public final boolean Q() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", pe2.I, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", hz2.G, "customAttributes_", qy4.a, "perfSessions_", rf5.class});
            case 3:
                return new ry4();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (ry4.class) {
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
