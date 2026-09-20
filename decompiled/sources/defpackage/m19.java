package defpackage;

import java.lang.Thread;

/* renamed from: m19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m19 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ r19 b;

    public m19(r19 r19, String str) {
        this.b = r19;
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        pz8 pz8 = ((y19) this.b.w).B;
        y19.g(pz8);
        pz8.B.b(this.a, th);
    }
}
