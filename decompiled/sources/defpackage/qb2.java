package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: qb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qb2 extends vb7 {
    public final /* synthetic */ y96 e;
    public final /* synthetic */ rb2 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qb2(String str, y96 y96, rb2 rb2) {
        super(str, true);
        this.e = y96;
        this.f = rb2;
    }

    public final long a() {
        x96 x96;
        y96 y96 = this.e;
        try {
            x96 = y96.d();
        } catch (Throwable th) {
            x96 = new x96(y96, th, 2);
        }
        rb2 rb2 = this.f;
        if (!((CopyOnWriteArrayList) rb2.z).contains(y96)) {
            return -1;
        }
        ((LinkedBlockingDeque) rb2.A).put(x96);
        return -1;
    }
}
