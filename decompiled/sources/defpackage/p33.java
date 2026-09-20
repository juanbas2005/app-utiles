package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* renamed from: p33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p33 implements Closeable {
    public static final ao6 V;
    public int A;
    public boolean B;
    public final bc7 C;
    public final ac7 D;
    public final ac7 E;
    public final ac7 F;
    public final me6 G;
    public long H;
    public long I;
    public long J;
    public long K;
    public final gi2 L;
    public final ao6 M;
    public ao6 N;
    public final ko7 O;
    public long P;
    public long Q;
    public final wr0 R;
    public final x33 S;
    public final p3 T;
    public final LinkedHashSet U;
    public final n33 w;
    public final LinkedHashMap x = new LinkedHashMap();
    public final String y;
    public int z;

    static {
        ao6 ao6 = new ao6();
        ao6.b(4, 65535);
        ao6.b(5, 16384);
        V = ao6;
    }

    public p33(o9 o9Var) {
        this.w = (n33) o9Var.A;
        String str = (String) o9Var.z;
        if (str != null) {
            this.y = str;
            this.A = 3;
            bc7 bc7 = (bc7) o9Var.x;
            this.C = bc7;
            this.D = bc7.d();
            this.E = bc7.d();
            this.F = bc7.d();
            this.G = me6.J;
            this.L = (gi2) o9Var.B;
            ao6 ao6 = new ao6();
            ao6.b(4, 16777216);
            this.M = ao6;
            ao6 ao62 = V;
            this.N = ao62;
            this.O = new ko7(0);
            this.Q = (long) ao62.a();
            wr0 wr0 = (wr0) o9Var.y;
            if (wr0 != null) {
                this.R = wr0;
                this.S = new x33((yw5) wr0.z);
                this.T = new p3(11, (Object) this, (Object) new s33((zw5) wr0.y));
                this.U = new LinkedHashSet();
                return;
            }
            sg3.a0("socket");
            throw null;
        }
        sg3.a0("connectionName");
        throw null;
    }

    public final void B(int i, k62 k62) {
        ac7.c(this.D, this.y + '[' + i + "] writeSynReset", 0, new s52(this, i, k62), 6);
    }

    public final void D(long j, int i) {
        ac7.c(this.D, this.y + '[' + i + "] windowUpdate", 0, new j33(this, i, j), 6);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0039 */
    public final void a(k62 k62, k62 k622, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = fg8.a;
        try {
            o(k62);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.x.isEmpty()) {
                objArr = this.x.values().toArray(new w33[0]);
                this.x.clear();
            } else {
                objArr = null;
            }
        }
        w33[] w33Arr = (w33[]) objArr;
        if (w33Arr != null) {
            for (w33 c : w33Arr) {
                try {
                    c.c(k622, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        this.S.close();
        try {
            this.R.cancel();
        } catch (IOException unused3) {
        }
        this.D.f();
        this.E.f();
        this.F.f();
    }

    public final void close() {
        a(k62.y, k62.D, (IOException) null);
    }

    public final void flush() {
        this.S.flush();
    }

    public final w33 k(int i) {
        w33 w33;
        synchronized (this) {
            w33 = (w33) this.x.get(Integer.valueOf(i));
        }
        return w33;
    }

    public final w33 l(int i) {
        w33 w33;
        synchronized (this) {
            w33 = (w33) this.x.remove(Integer.valueOf(i));
            notifyAll();
        }
        return w33;
    }

    public final void o(k62 k62) {
        synchronized (this.S) {
            synchronized (this) {
                if (!this.B) {
                    this.B = true;
                    int i = this.z;
                    this.S.o(i, k62, dg8.a);
                }
            }
        }
    }

    public final void u(long j) {
        synchronized (this) {
            try {
                ko7.c(this.O, j, 0, 2);
                long b = this.O.b();
                if (b >= ((long) (this.M.a() / 2))) {
                    D(b, 0);
                    ko7.c(this.O, 0, b, 1);
                }
                gi2 gi2 = this.L;
                ko7 ko7 = this.O;
                gi2.getClass();
                ko7.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.S.y);
        r6 = (long) r2;
        r8.P += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    public final void v(int i, boolean z2, sc0 sc0, long j) {
        int min;
        long j2;
        boolean z3;
        if (j == 0) {
            this.S.k(z2, i, sc0, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    long j3 = this.P;
                    long j4 = this.Q;
                    if (j3 < j4) {
                        break;
                    } else if (this.x.containsKey(Integer.valueOf(i))) {
                        wait();
                    } else {
                        throw new IOException("stream closed");
                    }
                }
            }
            j -= j2;
            x33 x33 = this.S;
            if (!z2 || j != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            x33.k(z3, i, sc0, min);
        }
    }
}
