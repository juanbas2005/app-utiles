package defpackage;

import java.util.concurrent.Executor;

/* renamed from: md8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class md8 implements db2 {
    public final mu5 a;
    public final mu5 b;
    public final ng6 c;
    public final mu5 d;

    public md8(mu5 mu5, mu5 mu52, ng6 ng6, mu5 mu53) {
        this.a = mu5;
        this.b = mu52;
        this.c = ng6;
        this.d = mu53;
    }

    public final Object get() {
        return new no7((Executor) this.a.get(), (za6) this.b.get(), (wr0) this.c.get(), (za6) this.d.get(), 3);
    }
}
