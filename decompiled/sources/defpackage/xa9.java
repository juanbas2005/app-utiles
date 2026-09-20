package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xa9 implements ja9 {
    public boolean w;

    static {
        new AtomicInteger();
    }

    public final Object d(ia9 ia9) {
        if (!this.w) {
            InputStream x = o55.x(ia9);
            try {
                if (x instanceof ra9) {
                    File a = ((ra9) x).a();
                    if (x != null) {
                        x.close();
                    }
                    return a;
                }
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (ia9.b.isEmpty()) {
            return ia9.a.c(ia9.d);
        } else {
            throw new IOException("Short circuit would skip transforms.");
        }
        throw th;
    }
}
