package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: zo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum zo3 {
    BOOLEAN(ro5.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(ro5.CHAR, "char", "C", "java.lang.Character"),
    BYTE(ro5.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(ro5.SHORT, "short", "S", "java.lang.Short"),
    INT(ro5.INT, "int", "I", "java.lang.Integer"),
    FLOAT(ro5.FLOAT, "float", "F", "java.lang.Float"),
    LONG(ro5.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(ro5.DOUBLE, "double", "D", "java.lang.Double");
    
    public static final HashMap I = null;
    public static final EnumMap J = null;
    public static final HashMap K = null;
    public static final HashSet L = null;
    public static final HashMap M = null;
    public final ro5 w;
    public final String x;
    public final String y;
    public final up2 z;

    static {
        I = new HashMap();
        J = new EnumMap(ro5.class);
        K = new HashMap();
        L = new HashSet();
        M = new HashMap();
        for (zo3 zo3 : values()) {
            HashMap hashMap = I;
            String str = zo3.x;
            String str2 = zo3.y;
            hashMap.put(str, zo3);
            J.put(zo3.c(), zo3);
            K.put(str2, zo3);
            String replace = zo3.z.a.a.replace('.', '/');
            L.add(replace);
            M.put(replace, pb4.m("(", str2, ")L", replace, ";"));
        }
    }

    /* access modifiers changed from: public */
    zo3(ro5 ro5, String str, String str2, String str3) {
        if (ro5 != null) {
            this.w = ro5;
            this.x = str;
            this.y = str2;
            this.z = new up2(str3);
            return;
        }
        a(8);
        throw null;
    }

    public static zo3 b(String str) {
        zo3 zo3 = (zo3) I.get(str);
        if (zo3 != null) {
            return zo3;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final ro5 c() {
        ro5 ro5 = this.w;
        if (ro5 != null) {
            return ro5;
        }
        a(12);
        throw null;
    }
}
