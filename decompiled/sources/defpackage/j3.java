package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: j3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j3 extends xj2 implements Runnable {
    public static final /* synthetic */ int G = 0;
    public ListenableFuture E;
    public Object F;

    public j3(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.E = listenableFuture;
        obj.getClass();
        this.F = obj;
    }

    public final void c() {
        boolean z;
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && (this.w instanceof i1)) {
            listenableFuture.cancel(p());
        }
        this.E = null;
        this.F = null;
    }

    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.E;
        Object obj = this.F;
        String j = super.j();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + str.length() + 11);
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (j == null) {
            return null;
        } else {
            if (j.length() != 0) {
                return str.concat(j);
            }
            return new String(str);
        }
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    public final void run() {
        boolean z;
        ListenableFuture listenableFuture = this.E;
        Object obj = this.F;
        boolean z2 = this.w instanceof i1;
        boolean z3 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (obj != null) {
            z3 = false;
        }
        if (!z4 && !z3) {
            this.E = null;
            if (listenableFuture.isCancelled()) {
                n(listenableFuture);
                return;
            }
            try {
                try {
                    Object q = q(obj, pt2.b(listenableFuture));
                    this.F = null;
                    r(q);
                } catch (Throwable th) {
                    this.F = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                m(e.getCause());
            } catch (RuntimeException e2) {
                m(e2);
            } catch (Error e3) {
                m(e3);
            }
        }
    }
}
