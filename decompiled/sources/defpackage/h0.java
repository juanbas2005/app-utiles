package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: h0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h0 extends xj2 implements Runnable {
    public static final /* synthetic */ int H = 0;
    public ListenableFuture E;
    public Class F;
    public Object G;

    public h0(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.E = listenableFuture;
        this.F = cls;
        this.G = obj;
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
        this.G = null;
    }

    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.E;
        Class cls = this.F;
        Object obj = this.G;
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
        if (cls != null && obj != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + valueOf2.length() + str.length() + 29);
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            return f21.l(sb2, valueOf3, "]");
        } else if (j == null) {
            return null;
        } else {
            if (j.length() != 0) {
                return str.concat(j);
            }
            return new String(str);
        }
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        Throwable th;
        ListenableFuture listenableFuture = this.E;
        Class cls = this.F;
        Object obj2 = this.G;
        boolean z3 = false;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (obj2 == null) {
            z3 = true;
        }
        if ((!z3 && !z4) && !(this.w instanceof i1)) {
            this.E = null;
            try {
                if (listenableFuture instanceof x1) {
                    th = ((x1) listenableFuture).o();
                } else {
                    th = null;
                }
                if (th == null) {
                    obj = pt2.b(listenableFuture);
                    if (th != null) {
                        l(obj);
                        return;
                    } else if (!cls.isInstance(th)) {
                        n(listenableFuture);
                        return;
                    } else {
                        try {
                            Object q = q(obj2, th);
                            this.F = null;
                            this.G = null;
                            r(q);
                            return;
                        } catch (Throwable th2) {
                            this.F = null;
                            this.G = null;
                            throw th2;
                        }
                    }
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(listenableFuture.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 35);
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    cause = new NullPointerException(sb.toString());
                }
                th = cause;
            } catch (Throwable th3) {
                th = th3;
            }
            obj = null;
            if (th != null) {
            }
        }
    }
}
