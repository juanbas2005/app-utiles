package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: wc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wc3 implements oy6 {
    public final InputStream w;
    public final ri7 x;

    public wc3(InputStream inputStream, ri7 ri7) {
        inputStream.getClass();
        this.w = inputStream;
        this.x = ri7;
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.x.f();
                qi6 V = sc0.V(1);
                int read = this.w.read(V.a, V.c, (int) Math.min(j, (long) (8192 - V.c)));
                if (read != -1) {
                    V.c += read;
                    long j2 = (long) read;
                    sc0.x += j2;
                    return j2;
                } else if (V.b != V.c) {
                    return -1;
                } else {
                    sc0.w = V.a();
                    ti6.a(V);
                    return -1;
                }
            } catch (AssertionError e) {
                if (cg8.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        }
    }

    public final void close() {
        this.w.close();
    }

    public final ri7 g() {
        return this.x;
    }

    public final String toString() {
        return "source(" + this.w + ')';
    }
}
