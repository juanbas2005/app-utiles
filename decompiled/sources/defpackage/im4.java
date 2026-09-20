package defpackage;

/* renamed from: im4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class im4 extends q1 implements Runnable {
    public final Runnable D;

    public im4(Runnable runnable) {
        runnable.getClass();
        this.D = runnable;
    }

    public final String j() {
        String valueOf = String.valueOf(this.D);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        try {
            this.D.run();
        } catch (Throwable th) {
            m(th);
            Object obj = rh7.a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (!(th instanceof Error)) {
                rf2.o(th);
            } else {
                throw th;
            }
        }
    }
}
