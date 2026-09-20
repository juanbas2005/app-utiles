package defpackage;

import java.util.Collections;

/* renamed from: hx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hx1 {
    public static final au a;
    public static final au b;
    public static final z97 c = new z97(new nf1(7));
    public static final wr0 d = new wr0("SaveBody", (sr2) new o(20), (vr2) new f81(25));

    static {
        as3 as3;
        as3 as32;
        Class<vs7> cls = vs7.class;
        gq3 b2 = b26.a.b(cls);
        as3 as33 = null;
        try {
            as3 = b26.b(cls);
        } catch (Throwable unused) {
            as3 = null;
        }
        a = new au("SkipSaveBody", new fp7(b2, as3));
        gq3 b3 = b26.a.b(cls);
        try {
            as32 = b26.b(cls);
        } catch (Throwable unused2) {
            as32 = null;
        }
        b = new au("ResponseBodySaved", new fp7(b3, as32));
        int i = gx1.D;
        c26 c26 = b26.a;
        Class<xr0> cls2 = xr0.class;
        gq3 b4 = c26.b(cls2);
        try {
            gs3 gs3 = gs3.c;
            cs3 n = c26.n(c26.b(wr0.class));
            c26.l(n, Collections.singletonList(b26.b(Object.class)));
            as33 = b26.c(cls2, x91.C(c26.m(n, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused3) {
        }
        new au("DoubleReceivePlugin", new fp7(b4, as33));
    }

    public static final cc4 a() {
        return (cc4) c.getValue();
    }
}
