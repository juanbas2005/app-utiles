package defpackage;

import com.google.protobuf.b;
import java.util.Arrays;

/* renamed from: rf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rf5 extends b {
    private static final rf5 DEFAULT_INSTANCE;
    private static volatile nd5 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final of3 sessionVerbosity_converter_ = new z53(5);
    private int bitField0_;
    private String sessionId_ = "";
    private nf3 sessionVerbosity_ = fe3.z;

    static {
        rf5 rf5 = new rf5();
        DEFAULT_INSTANCE = rf5;
        b.q(rf5.class, rf5);
    }

    public static void s(rf5 rf5, String str) {
        rf5.getClass();
        str.getClass();
        rf5.bitField0_ |= 1;
        rf5.sessionId_ = str;
    }

    public static void t(rf5 rf5) {
        int i;
        rf5.getClass();
        nf3 nf3 = rf5.sessionVerbosity_;
        if (!((r2) nf3).w) {
            fe3 fe3 = (fe3) nf3;
            int i2 = fe3.y;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            if (i >= i2) {
                rf5.sessionVerbosity_ = new fe3(Arrays.copyOf(fe3.x, i), fe3.y, true);
            } else {
                ku4.v();
                return;
            }
        }
        ((fe3) rf5.sessionVerbosity_).f(b81.B(2));
    }

    public static qf5 w() {
        return (qf5) DEFAULT_INSTANCE.j();
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
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", kw5.K});
            case 3:
                return new rf5();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (rf5.class) {
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

    public final int u() {
        int i = 0;
        int k = ((fe3) this.sessionVerbosity_).k(0);
        if (k == 0) {
            i = 1;
        } else if (k == 1) {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int v() {
        return ((fe3) this.sessionVerbosity_).size();
    }
}
