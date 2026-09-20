package defpackage;

/* renamed from: r58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r58 {
    public final s58 a = new s58();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        s58 s58 = this.a;
        if (s58 == null) {
            return;
        }
        if (s58.d) {
            s58.a(autoCloseable);
            return;
        }
        synchronized (s58.a) {
            autoCloseable2 = (AutoCloseable) s58.b.put(str, autoCloseable);
        }
        s58.a(autoCloseable2);
    }

    public final void b() {
        s58 s58 = this.a;
        if (s58 != null && !s58.d) {
            s58.d = true;
            synchronized (s58.a) {
                try {
                    for (AutoCloseable a2 : s58.b.values()) {
                        s58.a(a2);
                    }
                    for (AutoCloseable a3 : s58.c) {
                        s58.a(a3);
                    }
                    s58.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        s58 s58 = this.a;
        if (s58 == null) {
            return null;
        }
        synchronized (s58.a) {
            autoCloseable = (AutoCloseable) s58.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
