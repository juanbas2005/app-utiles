package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yw5 implements dd0 {
    public final tu6 w;
    public final sc0 x = new Object();
    public boolean y;

    /* JADX WARNING: type inference failed for: r1v1, types: [sc0, java.lang.Object] */
    public yw5(tu6 tu6) {
        tu6.getClass();
        this.w = tu6;
    }

    public final dd0 N(String str) {
        str.getClass();
        if (!this.y) {
            this.x.o0(str);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final dd0 a() {
        if (!this.y) {
            sc0 sc0 = this.x;
            long l = sc0.l();
            if (l > 0) {
                this.w.g0(l, sc0);
            }
            return this;
        }
        h.s("closed");
        return null;
    }

    public final sc0 c() {
        return this.x;
    }

    public final void close() {
        tu6 tu6 = this.w;
        if (!this.y) {
            try {
                sc0 sc0 = this.x;
                long j = sc0.x;
                if (j > 0) {
                    tu6.g0(j, sc0);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                tu6.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.y = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final dd0 f0(dg0 dg0) {
        dg0.getClass();
        if (!this.y) {
            this.x.X(dg0);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final void flush() {
        if (!this.y) {
            sc0 sc0 = this.x;
            long j = sc0.x;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            tu6 tu6 = this.w;
            if (i > 0) {
                tu6.g0(j, sc0);
            }
            tu6.flush();
            return;
        }
        h.s("closed");
    }

    public final ri7 g() {
        return this.w.g();
    }

    public final void g0(long j, sc0 sc0) {
        sc0.getClass();
        if (!this.y) {
            this.x.g0(j, sc0);
            a();
            return;
        }
        h.s("closed");
    }

    public final boolean isOpen() {
        return !this.y;
    }

    public final dd0 k(long j) {
        if (!this.y) {
            this.x.b0(j);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final long t(oy6 oy6) {
        long j = 0;
        while (true) {
            long Y = ((wc3) oy6).Y(8192, this.x);
            if (Y == -1) {
                return j;
            }
            j += Y;
            a();
        }
    }

    public final String toString() {
        return "buffer(" + this.w + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.y) {
            int write = this.x.write(byteBuffer);
            a();
            return write;
        }
        h.s("closed");
        return 0;
    }

    public final dd0 writeByte(int i) {
        if (!this.y) {
            this.x.a0(i);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final dd0 writeInt(int i) {
        if (!this.y) {
            this.x.j0(i);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final dd0 writeShort(int i) {
        if (!this.y) {
            this.x.m0(i);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final dd0 write(byte[] bArr) {
        if (!this.y) {
            this.x.write(bArr, 0, bArr.length);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }

    public final dd0 write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.y) {
            this.x.write(bArr, i, i2);
            a();
            return this;
        }
        h.s("closed");
        return null;
    }
}
