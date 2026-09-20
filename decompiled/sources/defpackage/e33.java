package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: e33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e33 extends b33 {
    public long A;
    public final /* synthetic */ h33 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e33(h33 h33, g73 g73, long j) {
        super(h33, g73);
        g73.getClass();
        this.B = h33;
        this.A = j;
        if (j == 0) {
            a(bz2.x);
        }
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        if (j < 0) {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        } else if (!this.y) {
            long j2 = this.A;
            if (j2 == 0) {
                return -1;
            }
            long Y = super.Y(Math.min(j2, j), sc0);
            if (Y != -1) {
                long j3 = this.A - Y;
                this.A = j3;
                if (j3 == 0) {
                    a(bz2.x);
                }
                return Y;
            }
            this.B.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(h33.f);
            throw protocolException;
        } else {
            h.s("closed");
            return 0;
        }
    }

    public final void close() {
        boolean z;
        if (!this.y) {
            if (this.A != 0) {
                TimeZone timeZone = fg8.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    z = fg8.g(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    this.B.b.e();
                    a(h33.f);
                }
            }
            this.y = true;
        }
    }
}
