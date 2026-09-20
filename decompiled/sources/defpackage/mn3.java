package defpackage;

/* renamed from: mn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mn3 {
    public static final up2 a;
    public static final gq0 b = pv8.F("kotlin/jvm/internal/RepeatableContainer", false);

    static {
        up2 up2 = new up2("kotlin.jvm.JvmField");
        a = up2;
        pv8.P(up2);
        pv8.P(new up2("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    public static final String a(String str) {
        str.getClass();
        if (b(str)) {
            return str;
        }
        return "get".concat(gw8.j(str));
    }

    public static final boolean b(String str) {
        char charAt;
        str.getClass();
        if (k57.u0(str, "is", false) && str.length() != 2 && ('a' > (charAt = str.charAt(2)) || charAt > 'z')) {
            return true;
        }
        return false;
    }
}
