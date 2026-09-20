package defpackage;

import com.google.protobuf.b;

/* renamed from: ir  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ir extends b {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ir DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile nd5 PARSER;
    private kd androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private if4 customAttributes_ = if4.x;
    private String googleAppId_ = "";

    static {
        ir irVar = new ir();
        DEFAULT_INSTANCE = irVar;
        b.q(ir.class, irVar);
    }

    public static fr D() {
        return (fr) DEFAULT_INSTANCE.j();
    }

    public static void s(ir irVar, String str) {
        irVar.getClass();
        str.getClass();
        irVar.bitField0_ |= 1;
        irVar.googleAppId_ = str;
    }

    public static void t(ir irVar, jr jrVar) {
        irVar.getClass();
        irVar.applicationProcessState_ = jrVar.w;
        irVar.bitField0_ |= 8;
    }

    public static if4 u(ir irVar) {
        if4 if4 = irVar.customAttributes_;
        if (!if4.w) {
            irVar.customAttributes_ = if4.c();
        }
        return irVar.customAttributes_;
    }

    public static void v(ir irVar, String str) {
        irVar.getClass();
        str.getClass();
        irVar.bitField0_ |= 2;
        irVar.appInstanceId_ = str;
    }

    public static void w(ir irVar, kd kdVar) {
        irVar.getClass();
        irVar.androidAppInfo_ = kdVar;
        irVar.bitField0_ |= 4;
    }

    public static ir y() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, nd5] */
    public final Object k(int i) {
        nd5 nd5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dw5(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", td0.y, "customAttributes_", gr.a});
            case 3:
                return new ir();
            case 4:
                return new qu2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nd5 nd52 = PARSER;
                if (nd52 != null) {
                    return nd52;
                }
                synchronized (ir.class) {
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

    public final kd x() {
        kd kdVar = this.androidAppInfo_;
        if (kdVar == null) {
            return kd.v();
        }
        return kdVar;
    }

    public final boolean z() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }
}
