package defpackage;

import io.github.jan.supabase.auth.a;

/* renamed from: gq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gq6 implements nm1 {
    public final /* synthetic */ uu w;
    public final /* synthetic */ o81 x;

    public gq6(uu uuVar, o81 o81) {
        this.w = uuVar;
        this.x = o81;
    }

    public final void a(t54 t54) {
        uu uuVar = this.w;
        a aVar = (a) uuVar;
        h27 h27 = aVar.n;
        if (h27 != null && h27.l()) {
            cf4 cf4 = aVar.d;
            ms3 ms3 = (ms3) cf4.z;
            String str = (String) cf4.y;
            ub4 ub4 = ub4.w;
            if (ms3.a(ub4)) {
                ms3.b(ub4, str, (Throwable) null, "Cancelling auto refresh because app is switching to the background");
            }
            ar7.H(this.x, (e81) null, (r81) null, new f70(uuVar, (f61) null, 15), 3);
        }
    }

    public final void l(t54 t54) {
        t54.getClass();
        uu uuVar = this.w;
        a aVar = (a) uuVar;
        h27 h27 = aVar.n;
        if ((h27 == null || !h27.l()) && aVar.c.v) {
            cf4 cf4 = aVar.d;
            ms3 ms3 = (ms3) cf4.z;
            String str = (String) cf4.y;
            ub4 ub4 = ub4.w;
            if (ms3.a(ub4)) {
                ms3.b(ub4, str, (Throwable) null, "Trying to re-load session from storage...");
            }
            ar7.H(this.x, (e81) null, (r81) null, new ot(uuVar, (f61) null, 29), 3);
        }
    }
}
