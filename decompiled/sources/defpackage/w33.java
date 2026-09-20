package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: w33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w33 implements dy6 {
    public long A;
    public final ArrayDeque B;
    public boolean C;
    public final u33 D;
    public final t33 E;
    public final v33 F = new v33(this);
    public final v33 G = new v33(this);
    public k62 H;
    public IOException I;
    public final int w;
    public final p33 x;
    public final ko7 y;
    public long z;

    public w33(int i, p33 p33, boolean z2, boolean z3, bz2 bz2) {
        p33.getClass();
        this.w = i;
        this.x = p33;
        this.y = new ko7(i);
        this.A = (long) p33.N.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.B = arrayDeque;
        this.D = new u33(this, (long) p33.M.a(), z3);
        this.E = new t33(this, z2);
        if (bz2 != null) {
            if (!i()) {
                arrayDeque.add(bz2);
            } else {
                h.s("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        } else if (!i()) {
            h.s("remotely-initiated streams should have headers");
            throw null;
        }
    }

    public final void a() {
        boolean z2;
        boolean j;
        TimeZone timeZone = fg8.a;
        synchronized (this) {
            try {
                u33 u33 = this.D;
                if (!u33.x && u33.A) {
                    t33 t33 = this.E;
                    if (!t33.w) {
                        if (t33.y) {
                        }
                    }
                    z2 = true;
                    j = j();
                }
                z2 = false;
                j = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c(k62.D, (IOException) null);
        } else if (!j) {
            this.x.l(this.w);
        }
    }

    public final void b() {
        t33 t33 = this.E;
        if (t33.y) {
            rf2.i("stream closed");
        } else if (t33.w) {
            rf2.i("stream finished");
        } else if (g() != null) {
            Throwable th = this.I;
            if (th == null) {
                k62 g = g();
                g.getClass();
                th = new StreamResetException(g);
            }
            throw th;
        }
    }

    public final void c(k62 k62, IOException iOException) {
        if (d(k62, iOException)) {
            p33 p33 = this.x;
            p33.getClass();
            p33.S.B(this.w, k62);
        }
    }

    public final void cancel() {
        f(k62.D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        r2.x.l(r2.w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return true;
     */
    public final boolean d(k62 k62, IOException iOException) {
        TimeZone timeZone = fg8.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.H = k62;
            this.I = iOException;
            notifyAll();
            if (this.D.x && this.E.w) {
                return false;
            }
        }
    }

    public final oy6 e() {
        return this.D;
    }

    public final void f(k62 k62) {
        if (d(k62, (IOException) null)) {
            this.x.B(this.w, k62);
        }
    }

    public final k62 g() {
        k62 k62;
        synchronized (this) {
            k62 = this.H;
        }
        return k62;
    }

    public final tu6 h() {
        return this.E;
    }

    public final boolean i() {
        boolean z2;
        if ((this.w & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x.getClass();
        if (true == z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0028, code lost:
        return true;
     */
    public final boolean j() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                u33 u33 = this.D;
                if (!u33.x) {
                    if (u33.A) {
                    }
                }
                t33 t33 = this.E;
                if ((t33.w || t33.y) && this.C) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[Catch:{ all -> 0x0022 }] */
    public final void k(bz2 bz2, boolean z2) {
        boolean j;
        bz2.getClass();
        TimeZone timeZone = fg8.a;
        synchronized (this) {
            try {
                if (this.C && bz2.f(":status") == null) {
                    if (bz2.f(":method") == null) {
                        this.D.getClass();
                        if (z2) {
                            this.D.x = true;
                        }
                        j = j();
                        notifyAll();
                    }
                }
                this.C = true;
                this.B.add(bz2);
                if (z2) {
                }
                j = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!j) {
            this.x.l(this.w);
        }
    }
}
