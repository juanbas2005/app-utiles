package defpackage;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: sw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sw8 implements Future {
    public static final hn5 A = new hn5();
    public static final boolean B;
    public static final o85 C;
    public static final Object z = new Object();
    public volatile Object w;
    public volatile kw8 x;
    public volatile rw8 y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: o85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: o85} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        o85 o85;
        o85 o852;
        o85 o853;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        B = z2;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                o853 = new Object();
            } catch (Error | Exception e) {
                Throwable th4 = e;
                try {
                    o852 = new Object();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    o852 = new Object();
                }
                th2 = th3;
                th = th4;
                o85 = o852;
            }
        } else {
            try {
                o853 = new Object();
            } catch (NoClassDefFoundError unused2) {
                o853 = new Object();
            }
        }
        th2 = null;
        th = null;
        o85 = o853;
        C = o85;
        if (th2 != null) {
            hn5 hn5 = A;
            Logger a = hn5.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            hn5.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void b(rw8 rw8) {
        rw8.a = null;
        while (true) {
            rw8 rw82 = this.y;
            if (rw82 != rw8.c) {
                rw8 rw83 = null;
                while (rw82 != null) {
                    rw8 rw84 = rw82.b;
                    if (rw82.a != null) {
                        rw83 = rw82;
                    } else if (rw83 != null) {
                        rw83.b = rw84;
                        if (rw83.a == null) {
                        }
                    } else if (!C.B(this, rw82, rw84)) {
                    }
                    rw82 = rw84;
                }
                return;
            }
            return;
        }
    }
}
