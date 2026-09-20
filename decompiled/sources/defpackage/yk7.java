package defpackage;

import com.google.protobuf.a;
import com.google.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: yk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yk7 extends b {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final yk7 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile nd5 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private if4 counters_;
    private if4 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private pf3 perfSessions_;
    private pf3 subtraces_;

    static {
        yk7 yk7 = new yk7();
        DEFAULT_INSTANCE = yk7;
        b.q(yk7.class, yk7);
    }

    public yk7() {
        if4 if4 = if4.x;
        this.counters_ = if4;
        this.customAttributes_ = if4;
        cu5 cu5 = cu5.z;
        this.subtraces_ = cu5;
        this.perfSessions_ = cu5;
    }

    public static void A(yk7 yk7, long j) {
        yk7.bitField0_ |= 8;
        yk7.durationUs_ = j;
    }

    public static yk7 F() {
        return DEFAULT_INSTANCE;
    }

    public static vk7 L() {
        return (vk7) DEFAULT_INSTANCE.j();
    }

    public static void s(yk7 yk7, String str) {
        yk7.getClass();
        str.getClass();
        yk7.bitField0_ |= 1;
        yk7.name_ = str;
    }

    public static if4 t(yk7 yk7) {
        if4 if4 = yk7.counters_;
        if (!if4.w) {
            yk7.counters_ = if4.c();
        }
        return yk7.counters_;
    }

    public static void u(yk7 yk7, yk7 yk72) {
        yk7.getClass();
        yk72.getClass();
        pf3 pf3 = yk7.subtraces_;
        if (!((r2) pf3).w) {
            yk7.subtraces_ = b.p(pf3);
        }
        yk7.subtraces_.add(yk72);
    }

    public static void v(yk7 yk7, ArrayList arrayList) {
        pf3 pf3 = yk7.subtraces_;
        if (!((r2) pf3).w) {
            yk7.subtraces_ = b.p(pf3);
        }
        a.g(arrayList, yk7.subtraces_);
    }

    public static if4 w(yk7 yk7) {
        if4 if4 = yk7.customAttributes_;
        if (!if4.w) {
            yk7.customAttributes_ = if4.c();
        }
        return yk7.customAttributes_;
    }

    public static void x(yk7 yk7, rf5 rf5) {
        yk7.getClass();
        pf3 pf3 = yk7.perfSessions_;
        if (!((r2) pf3).w) {
            yk7.perfSessions_ = b.p(pf3);
        }
        yk7.perfSessions_.add(rf5);
    }

    public static void y(yk7 yk7, List list) {
        pf3 pf3 = yk7.perfSessions_;
        if (!((r2) pf3).w) {
            yk7.perfSessions_ = b.p(pf3);
        }
        a.g(list, yk7.perfSessions_);
    }

    public static void z(yk7 yk7, long j) {
        yk7.bitField0_ |= 4;
        yk7.clientStartTimeUs_ = j;
    }

    public final boolean B() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int C() {
        return this.counters_.size();
    }

    public final Map D() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map E() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long G() {
        return this.durationUs_;
    }

    public final String H() {
        return this.name_;
    }

    public final pf3 I() {
        return this.perfSessions_;
    }

    public final pf3 J() {
        return this.subtraces_;
    }

    public final boolean K() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r13v12, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", wk7.a, "subtraces_", yk7.class, "customAttributes_", xk7.a, "perfSessions_", rf5.class});
            case 3:
                return new yk7();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (yk7.class) {
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
