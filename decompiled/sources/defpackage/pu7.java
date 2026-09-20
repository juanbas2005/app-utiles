package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: pu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pu7 implements db2 {
    public final mu5 a;
    public final mu5 b;
    public final mu5 c;
    public final ng6 d;
    public final mu5 e;
    public final mu5 f;
    public final mu5 g;

    public pu7(mu5 mu5, mu5 mu52, mu5 mu53, ng6 ng6, mu5 mu54, mu5 mu55, mu5 mu56) {
        this.a = mu5;
        this.b = mu52;
        this.c = mu53;
        this.d = ng6;
        this.e = mu54;
        this.f = mu55;
        this.g = mu56;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, z00] */
    public final Object get() {
        jv2 jv2 = new jv2(14);
        n63 n63 = new n63(13);
        ? obj = new Object();
        obj.a = (Context) this.a.get();
        obj.b = (hk4) this.b.get();
        obj.c = (za6) this.c.get();
        obj.d = (wr0) this.d.get();
        obj.e = (Executor) this.e.get();
        obj.f = (za6) this.f.get();
        obj.g = jv2;
        obj.h = n63;
        obj.i = (za6) this.g.get();
        return obj;
    }
}
