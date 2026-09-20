package defpackage;

/* renamed from: lv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lv implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ q51 x;
    public final /* synthetic */ Object y;

    public /* synthetic */ lv(q51 q51, String str, int i) {
        this.w = i;
        this.x = q51;
        this.y = str;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        m15 m15 = m15.a;
        Object obj2 = this.y;
        q51 q51 = this.x;
        Class<String> cls = String.class;
        as3 as3 = null;
        switch (i) {
            case b85.b:
                y53 y53 = (y53) obj;
                y53.getClass();
                y53.d(i53.c);
                pv8.q(y53, q51);
                if (obj2 == null) {
                    y53.d = m15;
                    gq3 b = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused) {
                    }
                    y53.b(new fp7(b, as3));
                } else if (obj2 instanceof j85) {
                    y53.d = obj2;
                    y53.b((fp7) null);
                } else {
                    y53.d = obj2;
                    gq3 b2 = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused2) {
                    }
                    y53.b(new fp7(b2, as3));
                }
                return vs7;
            default:
                y53 y532 = (y53) obj;
                y532.getClass();
                y532.d(i53.d);
                pv8.q(y532, q51);
                if (obj2 == null) {
                    y532.d = m15;
                    gq3 b3 = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused3) {
                    }
                    y532.b(new fp7(b3, as3));
                } else if (obj2 instanceof j85) {
                    y532.d = obj2;
                    y532.b((fp7) null);
                } else {
                    y532.d = obj2;
                    gq3 b4 = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused4) {
                    }
                    y532.b(new fp7(b4, as3));
                }
                return vs7;
        }
    }
}
