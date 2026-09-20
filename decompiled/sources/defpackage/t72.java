package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: t72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t72 extends sp2 {
    public boolean A = true;
    public boolean B;
    public boolean C;
    public final /* synthetic */ u72 D;
    public final long x;
    public final boolean y;
    public long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t72(u72 u72, oy6 oy6, long j, boolean z2) {
        super(oy6);
        oy6.getClass();
        this.D = u72;
        this.x = j;
        this.y = z2;
        if (j == 0) {
            a((IOException) null);
        }
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        if (!this.C) {
            try {
                long Y = this.w.Y(j, sc0);
                if (this.A) {
                    this.A = false;
                    ((dx5) this.D.c).A.getClass();
                }
                if (Y == -1) {
                    a((IOException) null);
                    return -1;
                }
                long j2 = this.z + Y;
                long j3 = this.x;
                if (j3 != -1) {
                    if (j2 > j3) {
                        throw new ProtocolException("expected " + this.x + " bytes but received " + j2);
                    }
                }
                this.z = j2;
                if (((w72) this.D.e).c()) {
                    a((IOException) null);
                }
                return Y;
            } catch (IOException e) {
                IOException a = a(e);
                a.getClass();
                throw a;
            }
        } else {
            h.s("closed");
            return 0;
        }
    }

    public final IOException a(IOException iOException) {
        if (this.B) {
            return iOException;
        }
        this.B = true;
        if (iOException == null && this.A) {
            this.A = false;
            ((dx5) this.D.c).A.getClass();
        }
        return u72.a(this.D, this.y, iOException, 8);
    }

    public final void close() {
        if (!this.C) {
            this.C = true;
            try {
                super.close();
                a((IOException) null);
            } catch (IOException e) {
                IOException a = a(e);
                a.getClass();
                throw a;
            }
        }
    }
}
