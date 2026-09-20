package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: x1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x1 implements ListenableFuture {
    public static final Logger A;
    public static final x91 B;
    public static final Object C = new Object();
    public static final boolean z;
    public volatile Object w;
    public volatile l1 x;
    public volatile w1 y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: m1} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        boolean z2;
        Throwable th;
        m1 m1Var;
        Class<w1> cls = w1.class;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        z = z2;
        Class<x1> cls2 = x1.class;
        A = Logger.getLogger(cls2.getName());
        Throwable th2 = null;
        try {
            th = null;
            m1Var = new Object();
        } catch (Throwable th3) {
            th2 = th3;
            m1Var = new Object();
        }
        B = m1Var;
        if (th2 != null) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
    }

    public static void e(x1 x1Var) {
        l1 l1Var = null;
        while (true) {
            for (w1 z2 = B.z(x1Var); z2 != null; z2 = z2.b) {
                Thread thread = z2.a;
                if (thread != null) {
                    z2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            x1Var.c();
            l1 l1Var2 = l1Var;
            l1 y2 = B.y(x1Var);
            l1 l1Var3 = l1Var2;
            while (y2 != null) {
                l1 l1Var4 = y2.c;
                y2.c = l1Var3;
                l1Var3 = y2;
                y2 = l1Var4;
            }
            while (true) {
                if (l1Var3 != null) {
                    l1Var = l1Var3.c;
                    Runnable runnable = l1Var3.a;
                    Objects.requireNonNull(runnable);
                    if (runnable instanceof n1) {
                        n1 n1Var = (n1) runnable;
                        x1Var = n1Var.w;
                        if (x1Var.w == n1Var) {
                            if (B.n(x1Var, n1Var, h(n1Var.x))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = l1Var3.b;
                        Objects.requireNonNull(executor);
                        f(runnable, executor);
                    }
                    l1Var3 = l1Var;
                } else {
                    return;
                }
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            A.log(level, sb.toString(), e);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof i1) {
            Throwable th = ((i1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof k1) {
            throw new ExecutionException(((k1) obj).a);
        } else if (obj == C) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable o;
        if (listenableFuture instanceof p1) {
            Object obj2 = ((x1) listenableFuture).w;
            if (obj2 instanceof i1) {
                i1 i1Var = (i1) obj2;
                if (i1Var.a) {
                    obj2 = i1Var.b != null ? new i1(i1Var.b, false) : i1.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        } else if ((listenableFuture instanceof x1) && (o = ((x1) listenableFuture).o()) != null) {
            return new k1(o);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!z) && isCancelled) {
                i1 i1Var2 = i1.d;
                Objects.requireNonNull(i1Var2);
                return i1Var2;
            }
            boolean z2 = false;
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (ExecutionException e) {
                    if (!isCancelled) {
                        return new k1(e.getCause());
                    }
                    String valueOf = String.valueOf(listenableFuture);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                    sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb.append(valueOf);
                    return new i1(new IllegalArgumentException(sb.toString(), e), false);
                } catch (CancellationException e2) {
                    if (isCancelled) {
                        return new i1(e2, false);
                    }
                    String valueOf2 = String.valueOf(listenableFuture);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new k1(new IllegalArgumentException(sb2.toString(), e2));
                } catch (Throwable th) {
                    return new k1(th);
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            if (isCancelled) {
                String valueOf3 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(valueOf3);
                return new i1(new IllegalArgumentException(sb3.toString()), false);
            } else if (obj == null) {
                return C;
            } else {
                return obj;
            }
        }
    }

    public void a(Runnable runnable, Executor executor) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        g75.l("Executor was null.", executor);
        if (isDone() || (l1Var = this.x) == l1Var2) {
            f(runnable, executor);
        }
        l1 l1Var3 = new l1(runnable, executor);
        do {
            l1Var3.c = l1Var;
            if (!B.m(this, l1Var, l1Var3)) {
                l1Var = this.x;
            } else {
                return;
            }
        } while (l1Var != l1Var2);
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    public boolean cancel(boolean z2) {
        boolean z3;
        i1 i1Var;
        boolean z4;
        Object obj = this.w;
        if (obj == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !(obj instanceof n1)) {
            return false;
        }
        if (z) {
            i1Var = new i1(new CancellationException("Future.cancel() was called."), z2);
        } else {
            if (z2) {
                i1Var = i1.c;
            } else {
                i1Var = i1.d;
            }
            Objects.requireNonNull(i1Var);
        }
        boolean z5 = false;
        while (true) {
            if (B.n(this, obj, i1Var)) {
                if (z2) {
                    this.i();
                }
                e(this);
                if (!(obj instanceof n1)) {
                    break;
                }
                ListenableFuture listenableFuture = ((n1) obj).x;
                if (!(listenableFuture instanceof p1)) {
                    listenableFuture.cancel(z2);
                    break;
                }
                this = (x1) listenableFuture;
                obj = this.w;
                if (obj == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && !(obj instanceof n1)) {
                    break;
                }
                z5 = true;
            } else {
                obj = this.w;
                if (!(obj instanceof n1)) {
                    return z5;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public Object get(long j, TimeUnit timeUnit) {
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j4 = j;
        TimeUnit timeUnit2 = timeUnit;
        w1 w1Var = w1.c;
        long nanos = timeUnit2.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.w;
            if (obj != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (!(obj instanceof n1))) {
                return g(obj);
            }
            long j5 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                w1 w1Var2 = this.y;
                if (w1Var2 != w1Var) {
                    w1 w1Var3 = new w1();
                    z3 = true;
                    while (true) {
                        x91 x91 = B;
                        x91.P(w1Var3, w1Var2);
                        if (x91.o(this, w1Var2, w1Var3)) {
                            j3 = j5;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.w;
                                    if (obj2 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6 && (!(obj2 instanceof n1))) {
                                        return g(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    k(w1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(w1Var3);
                        } else {
                            long j6 = j5;
                            w1Var2 = this.y;
                            if (w1Var2 == w1Var) {
                                break;
                            }
                            j5 = j6;
                        }
                    }
                }
                Object obj3 = this.w;
                Objects.requireNonNull(obj3);
                return g(obj3);
            }
            z3 = true;
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.w;
                if (obj4 != null) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                if (z5 && (!(obj4 instanceof n1))) {
                    return g(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String x1Var = toString();
            String obj5 = timeUnit2.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit2.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j4);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < j3) {
                String concat = sb2.concat(" (plus ");
                long j7 = -nanos;
                long convert = timeUnit2.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit2.toNanos(convert);
                int i = (convert > j3 ? 1 : (convert == j3 ? 0 : -1));
                if (i == 0 || nanos2 > 1000) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                if (i > 0) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + concat.length() + 21);
                    sb3.append(concat);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z4) {
                        sb4 = sb4.concat(",");
                    }
                    concat = sb4.concat(" ");
                }
                if (z4) {
                    StringBuilder sb5 = new StringBuilder(concat.length() + 33);
                    sb5.append(concat);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(x1Var).length() + sb2.length() + 5);
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(x1Var);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.w instanceof i1;
    }

    public boolean isDone() {
        boolean z2;
        Object obj = this.w;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return (!(obj instanceof n1)) & z2;
    }

    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void k(w1 w1Var) {
        w1Var.a = null;
        while (true) {
            w1 w1Var2 = this.y;
            if (w1Var2 != w1.c) {
                w1 w1Var3 = null;
                while (w1Var2 != null) {
                    w1 w1Var4 = w1Var2.b;
                    if (w1Var2.a != null) {
                        w1Var3 = w1Var2;
                    } else if (w1Var3 != null) {
                        w1Var3.b = w1Var4;
                        if (w1Var3.a == null) {
                        }
                    } else if (!B.o(this, w1Var2, w1Var4)) {
                    }
                    w1Var2 = w1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = C;
        }
        if (!B.n(this, (Object) null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!B.n(this, (Object) null, new k1(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean n(ListenableFuture listenableFuture) {
        n1 n1Var;
        k1 k1Var;
        listenableFuture.getClass();
        Object obj = this.w;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (B.n(this, (Object) null, h(listenableFuture))) {
                    e(this);
                    return true;
                }
                return false;
            }
            n1Var = new n1(this, listenableFuture);
            if (B.n(this, (Object) null, n1Var)) {
                try {
                    listenableFuture.a(n1Var, fv1.w);
                    return true;
                } catch (Throwable unused) {
                    k1Var = k1.b;
                }
            } else {
                obj = this.w;
            }
        }
        if (obj instanceof i1) {
            listenableFuture.cancel(((i1) obj).a);
        }
        return false;
        B.n(this, n1Var, k1Var);
        return true;
    }

    public final Throwable o() {
        if (!(this instanceof p1)) {
            return null;
        }
        Object obj = this.w;
        if (obj instanceof k1) {
            return ((k1) obj).a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.w;
        if (!(obj instanceof i1) || !((i1) obj).a) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.w;
            if (obj instanceof n1) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((n1) obj).x;
                if (listenableFuture == this) {
                    try {
                        sb.append("this future");
                    } catch (RuntimeException e) {
                        e = e;
                        sb.append("Exception thrown from implementation: ");
                        sb.append(e.getClass());
                        sb.append("]");
                        if (isDone()) {
                        }
                        sb.append("]");
                        return sb.toString();
                    } catch (StackOverflowError e2) {
                        e = e2;
                        sb.append("Exception thrown from implementation: ");
                        sb.append(e.getClass());
                        sb.append("]");
                        if (isDone()) {
                        }
                        sb.append("]");
                        return sb.toString();
                    }
                } else {
                    sb.append(listenableFuture);
                }
                sb.append("]");
            } else {
                try {
                    str = j();
                    if (fj5.a(str)) {
                        str = null;
                    }
                } catch (RuntimeException | StackOverflowError e3) {
                    String valueOf = String.valueOf(e3.getClass());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(valueOf);
                    str = sb2.toString();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public void i() {
    }

    public Object get() {
        Object obj;
        w1 w1Var = w1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.w;
            if ((obj2 != null) && (!(obj2 instanceof n1))) {
                return g(obj2);
            }
            w1 w1Var2 = this.y;
            if (w1Var2 != w1Var) {
                w1 w1Var3 = new w1();
                do {
                    x91 x91 = B;
                    x91.P(w1Var3, w1Var2);
                    if (x91.o(this, w1Var2, w1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w;
                            } else {
                                k(w1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof n1))));
                        return g(obj);
                    }
                    w1Var2 = this.y;
                } while (w1Var2 != w1Var);
            }
            Object obj3 = this.w;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
