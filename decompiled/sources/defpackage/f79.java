package defpackage;

import java.util.Objects;

/* renamed from: f79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f79 implements Runnable {
    public final long w;
    public final long x;
    public final /* synthetic */ k68 y;

    public f79(k68 k68, long j, long j2) {
        Objects.requireNonNull(k68);
        this.y = k68;
        this.w = j;
        this.x = j2;
    }

    public final void run() {
        r19 r19 = ((y19) ((o79) this.y.y).w).C;
        y19.g(r19);
        r19.l1(new ge(29, (Object) this));
    }
}
