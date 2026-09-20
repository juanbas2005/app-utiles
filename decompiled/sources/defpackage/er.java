package defpackage;

import android.content.Context;

/* renamed from: er  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class er {
    public Context a;

    /* JADX WARNING: type inference failed for: r0v4, types: [zd1, java.lang.Object] */
    public zd1 a() {
        Context context = this.a;
        if (context != null) {
            ? obj = new Object();
            obj.w = dx1.a(su0.e);
            fb1 fb1 = new fb1(1, context);
            obj.x = fb1;
            obj.y = dx1.a(new ik4(fb1, new fb1(0, fb1), 0));
            fb1 fb12 = obj.x;
            obj.z = new q72(fb12, 1);
            mu5 a2 = dx1.a(new ik4(obj.z, dx1.a(new q72(fb12, 0)), 1));
            obj.A = a2;
            c82 c82 = new c82(1);
            fb1 fb13 = obj.x;
            ng6 ng6 = new ng6(fb13, a2, c82, 0);
            mu5 mu5 = obj.w;
            mu5 mu52 = obj.y;
            mu5 mu53 = a2;
            ng6 ng62 = ng6;
            mu5 mu54 = a2;
            ng6 ng63 = ng62;
            fn1 fn1 = new fn1(mu5, mu52, ng63, mu54, mu53);
            mu5 mu55 = mu54;
            ng6 ng64 = ng63;
            mu5 mu56 = mu55;
            mu5 mu57 = mu5;
            obj.B = dx1.a(new ng6(fn1, new pu7(fb13, mu52, mu56, ng64, mu57, mu56, mu56), new md8(mu57, mu56, ng64, mu56), 1));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }
}
