package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: sc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc9 extends md9 {
    public static final /* synthetic */ int d = 0;
    public final AtomicLong c = new AtomicLong(-1);

    static {
        new pc9(1);
    }

    public final void a() {
        AtomicLong atomicLong = this.c;
        atomicLong.set(Math.max(-atomicLong.get(), 0));
    }
}
