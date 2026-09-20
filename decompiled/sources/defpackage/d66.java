package defpackage;

import java.io.Closeable;

/* renamed from: d66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d66 implements Closeable {
    public static final c66 w;

    /* JADX WARNING: type inference failed for: r1v0, types: [sc0, java.lang.Object] */
    static {
        dg0 dg0 = dg0.z;
        dg0.getClass();
        ? obj = new Object();
        obj.X(dg0);
        w = new c66((long) dg0.w.length, obj);
    }

    public abstract long a();

    public void close() {
        dg8.b(l());
    }

    public abstract yh4 k();

    public abstract ed0 l();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final String o() {
        Throwable th;
        ed0 l = l();
        String th2 = null;
        try {
            String Q = l.Q(fg8.f(l, gw8.k(k())));
            try {
                l.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            String str = th2;
            th2 = Q;
            th = str;
        } catch (Throwable th4) {
            su0.b(th, th4);
            th = th;
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }
}
