package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eb9 {
    public final String a;
    public final h3 b;
    public final o00 c;
    public final jz0 d;
    public final kd6 e;
    public final kd6 f = new kd6((ct) new k68(29, (Object) this));
    public final Object g;
    public final hx8 h;
    public List i;

    public eb9(o00 o00, h3 h3Var) {
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = o00;
        this.b = h3Var;
        this.a = (String) o00.b;
        this.e = new kd6((ct) new ay4(23, o00));
        this.d = new jz0(23);
        this.h = new hx8(4);
        h89 h89 = new h89(4, this);
        synchronized (obj) {
            this.i.add(h89);
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, os2] */
    public final i3 a(n89 n89, jm4 jm4) {
        Throwable th;
        h89 h89 = new h89(3, n89);
        int i2 = mc9.a;
        l99 l99 = new l99(4, vb9.a(), h89);
        a35 a35 = oc9.a;
        g75.l("ticker", a35);
        a35.l();
        String concat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        cc9 b2 = hx8.b(concat);
        try {
            x1 O0 = this.f.O0();
            jz0 jz0 = this.d;
            n49 n49 = new n49(5, O0);
            fv1 fv1 = fv1.w;
            jz0.Y(n49, fv1);
            ListenableFuture Y = jz0.Y(mc9.a(new no7(this, O0, l99, jm4, 8)), fv1);
            pt2.propagateCancellation(Y, O0);
            pt2.e(this.b);
            i3 f2 = pt2.f(Y, new Object(), fv1);
            b2.a(f2);
            b2.close();
            return f2;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
