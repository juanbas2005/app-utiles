package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: s72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s72 extends rp2 {
    public long A;
    public boolean B;
    public boolean C;
    public final /* synthetic */ u72 D;
    public final long x;
    public final boolean y;
    public boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s72(u72 u72, tu6 tu6, long j, boolean z2) {
        super(tu6);
        tu6.getClass();
        this.D = u72;
        this.x = j;
        this.y = z2;
        this.B = z2;
    }

    public final IOException a(IOException iOException) {
        if (this.z) {
            return iOException;
        }
        this.z = true;
        return u72.a(this.D, this.y, iOException, 4);
    }

    public final void close() {
        if (!this.C) {
            this.C = true;
            long j = this.x;
            if (j == -1 || this.A == j) {
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e) {
                    IOException a = a(e);
                    a.getClass();
                    throw a;
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            IOException a = a(e);
            a.getClass();
            throw a;
        }
    }

    public final void g0(long j, sc0 sc0) {
        if (!this.C) {
            long j2 = this.x;
            if (j2 == -1 || this.A + j <= j2) {
                try {
                    if (this.B) {
                        this.B = false;
                        ((dx5) this.D.c).A.getClass();
                    }
                    this.w.g0(j, sc0);
                    this.A += j;
                } catch (IOException e) {
                    IOException a = a(e);
                    a.getClass();
                    throw a;
                }
            } else {
                throw new ProtocolException("expected " + this.x + " bytes but received " + (this.A + j));
            }
        } else {
            h.s("closed");
        }
    }
}
