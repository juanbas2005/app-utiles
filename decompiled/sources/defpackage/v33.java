package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: v33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v33 extends vt {
    public final /* synthetic */ w33 n;

    public v33(w33 w33) {
        this.n = w33;
    }

    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    public final void k() {
        this.n.f(k62.D);
        p33 p33 = this.n.x;
        synchronized (p33) {
            long j = p33.J;
            long j2 = p33.I;
            if (j >= j2) {
                p33.I = j2 + 1;
                p33.K = System.nanoTime() + 1000000000;
                ac7.c(p33.D, f21.l(new StringBuilder(), p33.y, " ping"), 0, new zh(20, (Object) p33), 6);
            }
        }
    }

    public final void l() {
        if (i()) {
            throw j((IOException) null);
        }
    }
}
