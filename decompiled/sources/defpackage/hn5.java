package defpackage;

import java.util.logging.Logger;

/* renamed from: hn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hn5 {
    public final String a;
    public final Object b;
    public volatile Object c;

    public hn5() {
        this.b = new Object();
        this.a = y99.class.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((si0) this.b)) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public hn5(String str, br4 br4, vr2 vr2, o81 o81) {
        this.a = str;
        this.b = new Object();
    }
}
