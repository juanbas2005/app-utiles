package defpackage;

/* renamed from: zb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zb7 extends wb7 {
    public final Runnable y;

    public zb7(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.y = runnable;
    }

    public final void run() {
        this.y.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.y;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(rj1.t(runnable));
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        if (this.x) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return hl6.o(sb, str, ']');
    }
}
