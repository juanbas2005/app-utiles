package defpackage;

import java.util.concurrent.Callable;

/* renamed from: n91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n91 implements Callable {
    public final /* synthetic */ p91 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ n91(p91 p91, long j, String str) {
        this.a = p91;
        this.b = j;
        this.c = str;
    }

    public final Object call() {
        p91 p91 = this.a;
        return ((ya1) p91.o.y).a(new o91(p91, this.b, this.c));
    }
}
