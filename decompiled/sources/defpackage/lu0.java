package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: lu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lu0 extends ja {
    public static final Logger K = Logger.getLogger(lu0.class.getName());
    public j93 H;
    public final boolean I;
    public ku0 J;

    public lu0(j93 j93, boolean z) {
        int size = j93.size();
        this.D = null;
        this.E = size;
        this.H = j93;
        this.I = z;
    }

    public final void c() {
        boolean z;
        j93 j93 = this.H;
        this.H = null;
        this.J = null;
        boolean z2 = this.w instanceof i1;
        if (j93 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && z) {
            boolean p = p();
            at7 o = j93.iterator();
            while (o.hasNext()) {
                ((Future) o.next()).cancel(p);
            }
        }
    }

    public final void i() {
        ku0 ku0 = this.J;
        if (ku0 != null) {
            ku0.c();
        }
    }

    public final String j() {
        j93 j93 = this.H;
        if (j93 == null) {
            return super.j();
        }
        String valueOf = String.valueOf(j93);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void q(j93 j93) {
        boolean z;
        int F = ja.F.F(this);
        if (F >= 0) {
            z = true;
        } else {
            z = false;
        }
        g75.o("Less than 0 remaining futures", z);
        if (F == 0) {
            if (j93 != null) {
                at7 o = j93.iterator();
                while (o.hasNext()) {
                    Future future = (Future) o.next();
                    if (!future.isCancelled()) {
                        try {
                            pt2.b(future);
                        } catch (ExecutionException e) {
                            r(e.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    }
                }
            }
            this.D = null;
            ku0 ku0 = this.J;
            if (ku0 != null) {
                try {
                    ku0.y.execute(ku0);
                } catch (RejectedExecutionException e2) {
                    ku0.z.m(e2);
                }
            }
            this.H = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        String str = "Input Future failed with Error";
        if (this.I && !m(th)) {
            Set set = this.D;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.w instanceof i1)) {
                    Throwable o = o();
                    Objects.requireNonNull(o);
                    while (o != null && newSetFromMap.add(o)) {
                        o = o.getCause();
                    }
                }
                ja.F.y(this, newSetFromMap);
                Set set2 = this.D;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable th2 = th;
            while (th2 != null) {
                if (set.add(th2)) {
                    th2 = th2.getCause();
                }
            }
            if (!(th instanceof Error)) {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            K.log(Level.SEVERE, str, th);
            return;
        }
        if (th instanceof Error) {
            K.log(Level.SEVERE, str, th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.H);
        if (this.H.isEmpty()) {
            ku0 ku0 = this.J;
            if (ku0 != null) {
                try {
                    ku0.y.execute(ku0);
                } catch (RejectedExecutionException e) {
                    ku0.z.m(e);
                }
            }
        } else {
            boolean z = this.I;
            fv1 fv1 = fv1.w;
            if (z) {
                at7 o = this.H.iterator();
                int i = 0;
                while (o.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) o.next();
                    listenableFuture.a(new ga(this, listenableFuture, i), fv1);
                    i++;
                }
                return;
            }
            ga gaVar = new ga(1, (Object) this, (Object) null);
            at7 o2 = this.H.iterator();
            while (o2.hasNext()) {
                ((ListenableFuture) o2.next()).a(gaVar, fv1);
            }
        }
    }
}
