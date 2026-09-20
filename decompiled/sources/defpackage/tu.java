package defpackage;

import io.github.jan.supabase.auth.a;

/* renamed from: tu  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tu implements q77 {
    public static final /* synthetic */ tu w = new Object();
    public static final String x = "auth";

    /* JADX WARNING: type inference failed for: r0v0, types: [tu, java.lang.Object] */
    static {
        sg3.E("access_token", "refresh_token", "expires_in", "expires_at", "token_type", "type", "provider_refresh_token", "provider_token", "error", "error_code", "error_description");
        sg3.E("code", "error_code", "error", "error_description");
    }

    public final qe4 e(j77 j77, Object obj) {
        wu wuVar = (wu) obj;
        j77.getClass();
        wuVar.getClass();
        return new a(j77, wuVar);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, wu] */
    public final Object f(vr2 vr2) {
        ? obj = new Object();
        xb4 xb4 = u02.x;
        obj.u = gl0.e0(10, y02.SECONDS);
        obj.v = true;
        obj.w = true;
        obj.x = true;
        obj.y = tj2.w;
        obj.z = true;
        vu7.m.getClass();
        obj.A = me6.P;
        obj.B = true;
        int i = sr6.a;
        pa2.a.getClass();
        obj.C = oa2.b;
        vr2.y(obj);
        return obj;
    }

    public final String getKey() {
        return x;
    }

    public final void l(cy6 cy6, Object obj) {
        wu wuVar = (wu) obj;
    }
}
