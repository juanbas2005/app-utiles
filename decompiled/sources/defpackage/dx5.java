package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.ProxySelector;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.net.ssl.HostnameVerifier;

/* renamed from: dx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dx5 implements zh0, Cloneable {
    public volatile h72 A = h72.a;
    public final cx5 B;
    public final AtomicBoolean C;
    public Object D;
    public x72 E;
    public ex5 F;
    public boolean G;
    public u72 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public volatile boolean N;
    public volatile u72 O;
    public final CopyOnWriteArrayList P;
    public final d45 w;
    public final kd6 x;
    public final boolean y;
    public final m22 z;

    static {
        AtomicReferenceFieldUpdater.newUpdater(dx5.class, h72.class, "A");
    }

    public dx5(d45 d45, kd6 kd6, boolean z2) {
        d45.getClass();
        kd6.getClass();
        this.w = d45;
        this.x = kd6;
        this.y = z2;
        this.z = (m22) d45.D.x;
        d45.d.getClass();
        cx5 cx5 = new cx5(this);
        cx5.g((long) d45.v, TimeUnit.MILLISECONDS);
        this.B = cx5;
        this.C = new AtomicBoolean();
        this.M = true;
        this.P = new CopyOnWriteArrayList();
        new AtomicReference((jb5) kd6.B);
    }

    public static final String a(dx5 dx5) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (dx5.N) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (dx5.y) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(((g73) dx5.x.x).g());
        return sb.toString();
    }

    public final void b(ex5 ex5) {
        ex5.getClass();
        TimeZone timeZone = fg8.a;
        if (this.F == null) {
            this.F = ex5;
            ex5.p.add(new bx5(this, this.D));
            return;
        }
        h.s("Check failed.");
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k;
        TimeZone timeZone = fg8.a;
        ex5 ex5 = this.F;
        if (ex5 != null) {
            synchronized (ex5) {
                k = k();
            }
            if (this.F == null) {
                if (k != null) {
                    fg8.c(k);
                }
                this.A.getClass();
            } else if (k != null) {
                h.s("Check failed.");
                return null;
            }
        }
        if (!this.G && this.B.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        h72 h72 = this.A;
        if (iOException != null) {
            iOException2.getClass();
            h72.getClass();
            return iOException2;
        }
        h72.getClass();
        return iOException2;
    }

    public final Object clone() {
        return new dx5(this.w, this.x, this.y);
    }

    public final void d() {
        if (!this.N) {
            this.N = true;
            u72 u72 = this.O;
            if (u72 != null) {
                ((w72) u72.e).cancel();
            }
            Iterator it = this.P.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((y96) it.next()).cancel();
            }
            this.A.getClass();
        }
    }

    public final void e(vi0 vi0) {
        if (this.C.compareAndSet(false, true)) {
            ej5 ej5 = ej5.a;
            this.D = ej5.a.g();
            this.A.getClass();
            am6 am6 = this.w.a;
            ax5 ax5 = new ax5(this, vi0);
            am6.getClass();
            am6.P(am6, ax5, (dx5) null, (ax5) null, 6);
            return;
        }
        h.s("Already Executed");
    }

    public final a66 f() {
        if (this.C.compareAndSet(false, true)) {
            this.B.h();
            ej5 ej5 = ej5.a;
            this.D = ej5.a.g();
            this.A.getClass();
            try {
                am6 am6 = this.w.a;
                synchronized (am6) {
                    ((ArrayDeque) am6.z).add(this);
                }
                a66 h = h();
                am6 am62 = this.w.a;
                am62.getClass();
                am6.P(am62, (ax5) null, this, (ax5) null, 5);
                return h;
            } catch (Throwable th) {
                am6 am63 = this.w.a;
                am63.getClass();
                am6.P(am63, (ax5) null, this, (ax5) null, 5);
                throw th;
            }
        } else {
            h.s("Already Executed");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void g(boolean z2) {
        u72 u72;
        synchronized (this) {
            try {
                if (!this.M) {
                    throw new IllegalStateException("released");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && (u72 = this.O) != null) {
            ((w72) u72.e).cancel();
            ((dx5) u72.c).i(u72, true, true, true, true, (IOException) null);
        }
        this.H = null;
    }

    public final a66 h() {
        ArrayList arrayList = new ArrayList();
        it0.h0(arrayList, this.w.b);
        arrayList.add(new ni0(4));
        arrayList.add(new ni0(2));
        arrayList.add(new ni0(3));
        arrayList.add(ni0.c);
        if (!this.y) {
            it0.h0(arrayList, this.w.c);
        }
        arrayList.add(ni0.b);
        kd6 kd6 = this.x;
        d45 d45 = this.w;
        kd6.getClass();
        d45.getClass();
        int i = d45.w;
        int i2 = d45.x;
        int i3 = d45.y;
        g22 g22 = d45.g;
        sm0 sm0 = d45.t;
        ji8 ji8 = d45.D;
        s61 s61 = d45.j;
        yw1 yw1 = d45.k;
        HostnameVerifier hostnameVerifier = d45.s;
        g22 g222 = d45.m;
        ProxySelector proxySelector = d45.l;
        ProxySelector proxySelector2 = proxySelector;
        try {
            a66 b = new lx5(this, arrayList, 0, (u72) null, kd6, i, i2, i3, g22, sm0, ji8, s61, yw1, hostnameVerifier, g222, proxySelector2, d45.e, d45.n, d45.o, d45.p, d45.u).b(this.x);
            if (!this.N) {
                j((IOException) null);
                return b;
            }
            dg8.b(b);
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException j = j(e);
            j.getClass();
            throw j;
        } catch (Throwable th) {
            if (1 == 0) {
                j((IOException) null);
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0039 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004b A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004d A[Catch:{ all -> 0x0017 }] */
    public final IOException i(u72 u72, boolean z2, boolean z3, boolean z4, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        u72.getClass();
        if (u72.equals(this.O)) {
            synchronized (this) {
                z6 = false;
                if (z2) {
                    try {
                        if (!this.I) {
                        }
                        if (z2) {
                            this.I = false;
                        }
                        if (z3) {
                            this.J = false;
                        }
                        if (z5) {
                            this.K = false;
                        }
                        if (z4) {
                            this.L = false;
                        }
                        if (this.I || this.J || this.K || this.L) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z8 && !this.M) {
                            z6 = true;
                        }
                        boolean z9 = z6;
                        z6 = z8;
                        z7 = z9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z3 || !this.J) && ((!z5 || !this.K) && (!z4 || !this.L))) {
                    z7 = false;
                }
                if (z2) {
                }
                if (z3) {
                }
                if (z5) {
                }
                if (z4) {
                }
                if (this.I || this.J || this.K || this.L) {
                }
                z6 = true;
                boolean z92 = z6;
                z6 = z8;
                z7 = z92;
            }
            if (z6) {
                this.O = null;
                ex5 ex5 = this.F;
                if (ex5 != null) {
                    synchronized (ex5) {
                        ex5.m++;
                    }
                }
            }
            if (z7) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.M) {
                this.M = false;
                if (!this.I && !this.J && !this.K && !this.L) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket k() {
        ex5 ex5 = this.F;
        ex5.getClass();
        TimeZone timeZone = fg8.a;
        ArrayList arrayList = ex5.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (sg3.e(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.F = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            ex5.q = System.nanoTime();
            m22 m22 = this.z;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) m22.z;
            ac7 ac7 = (ac7) m22.x;
            TimeZone timeZone2 = fg8.a;
            if (!ex5.j) {
                ac7.d((fx5) m22.y, 0);
                return null;
            }
            ex5.j = true;
            concurrentLinkedQueue.remove(ex5);
            if (concurrentLinkedQueue.isEmpty()) {
                ac7.a();
            }
            return ex5.e;
        }
        h.s("Check failed.");
        return null;
    }
}
