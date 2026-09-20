package defpackage;

import androidx.datastore.preferences.protobuf.e;

/* renamed from: rn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn5 extends e {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final rn5 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile od5 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        rn5 rn5 = new rn5();
        DEFAULT_INSTANCE = rn5;
        e.j(rn5.class, rn5);
    }

    public static qn5 D() {
        return (qn5) ((su2) DEFAULT_INSTANCE.c(5));
    }

    public static void l(rn5 rn5, long j) {
        rn5.valueCase_ = 4;
        rn5.value_ = Long.valueOf(j);
    }

    public static void m(rn5 rn5, String str) {
        rn5.getClass();
        rn5.valueCase_ = 5;
        rn5.value_ = str;
    }

    public static void n(rn5 rn5, pn5 pn5) {
        rn5.getClass();
        rn5.value_ = pn5;
        rn5.valueCase_ = 6;
    }

    public static void o(rn5 rn5, double d) {
        rn5.valueCase_ = 7;
        rn5.value_ = Double.valueOf(d);
    }

    public static void p(rn5 rn5, zf0 zf0) {
        rn5.getClass();
        rn5.valueCase_ = 8;
        rn5.value_ = zf0;
    }

    public static void q(rn5 rn5, boolean z) {
        rn5.valueCase_ = 1;
        rn5.value_ = Boolean.valueOf(z);
    }

    public static void r(rn5 rn5, float f) {
        rn5.valueCase_ = 2;
        rn5.value_ = Float.valueOf(f);
    }

    public static void s(rn5 rn5, int i) {
        rn5.valueCase_ = 3;
        rn5.value_ = Integer.valueOf(i);
    }

    public static rn5 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final pn5 B() {
        if (this.valueCase_ == 6) {
            return (pn5) this.value_;
        }
        return pn5.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case b85.b:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [od5, java.lang.Object] */
    public final Object c(int i) {
        od5 od5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ew5(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", pn5.class});
            case 3:
                return new rn5();
            case 4:
                return new su2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                od5 od52 = PARSER;
                if (od52 != null) {
                    return od52;
                }
                synchronized (rn5.class) {
                    try {
                        od5 od53 = PARSER;
                        od5 = od53;
                        if (od53 == null) {
                            ? obj = new Object();
                            PARSER = obj;
                            od5 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return od5;
            default:
                ku4.p();
                return null;
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final zf0 u() {
        if (this.valueCase_ == 8) {
            return (zf0) this.value_;
        }
        return zf0.y;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }
}
