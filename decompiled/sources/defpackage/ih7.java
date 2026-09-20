package defpackage;

/* renamed from: ih7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ih7 {
    public static final ThreadLocal a = new ThreadLocal();

    public static i72 a() {
        ThreadLocal threadLocal = a;
        i72 i72 = (i72) threadLocal.get();
        if (i72 != null) {
            return i72;
        }
        z90 z90 = new z90(Thread.currentThread());
        threadLocal.set(z90);
        return z90;
    }
}
