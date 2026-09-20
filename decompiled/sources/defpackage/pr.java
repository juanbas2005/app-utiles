package defpackage;

/* renamed from: pr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pr extends ub5 {
    public static volatile pr d;
    public static final or e = new or(0);
    public final wn1 c = new wn1();

    public static pr K() {
        if (d != null) {
            return d;
        }
        synchronized (pr.class) {
            try {
                if (d == null) {
                    d = new pr();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return d;
    }
}
