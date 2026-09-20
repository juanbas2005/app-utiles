package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: u43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u43 {
    public static final au a;

    static {
        as3 as3;
        c26 c26 = b26.a;
        Class<Map> cls = Map.class;
        gq3 b = c26.b(cls);
        try {
            as3 = c26.d(c26.m(c26.b(cls), Arrays.asList(new gs3[]{x91.C(b26.c(t43.class, gs3.c)), x91.C(b26.b(Object.class))}), false));
        } catch (Throwable unused) {
            as3 = null;
        }
        a = new au("EngineCapabilities", new fp7(b, as3));
        wn6.w(x63.a);
    }
}
