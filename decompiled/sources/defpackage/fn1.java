package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fn1 implements db2 {
    public final mu5 a;
    public final mu5 b;
    public final ng6 c;
    public final mu5 d;
    public final mu5 e;

    public fn1(mu5 mu5, mu5 mu52, ng6 ng6, mu5 mu53, mu5 mu54) {
        this.a = mu5;
        this.b = mu52;
        this.c = ng6;
        this.d = mu53;
        this.e = mu54;
    }

    public final Object get() {
        return new en1((Executor) this.a.get(), (hk4) this.b.get(), (wr0) this.c.get(), (za6) this.d.get(), (za6) this.e.get());
    }
}
