package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: z2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z2 implements ListenableFuture {
    public static final Logger A;
    public static final rd3 B;
    public static final Object C = new Object();
    public static final boolean z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile Object w;
    public volatile v2 x;
    public volatile y2 y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: w2} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        w2 w2Var;
        Class<y2> cls = y2.class;
        Class<z2> cls2 = z2.class;
        A = Logger.getLogger(cls2.getName());
        try {
            w2 w2Var2 = new w2(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "b"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "y"), AtomicReferenceFieldUpdater.newUpdater(cls2, v2.class, "x"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "w"));
            th = null;
            w2Var = w2Var2;
        } catch (Throwable th) {
            th = th;
            w2Var = new Object();
        }
        B = w2Var;
        if (th != null) {
            A.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static void d(z2 z2Var) {
        y2 y2Var;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        do {
            y2Var = z2Var.y;
        } while (!B.g(z2Var, y2Var, y2.c));
        while (true) {
            v2Var = null;
            if (y2Var == null) {
                break;
            }
            Thread thread = y2Var.a;
            if (thread != null) {
                y2Var.a = null;
                LockSupport.unpark(thread);
            }
            y2Var = y2Var.b;
        }
        z2Var.c();
        do {
            v2Var2 = z2Var.x;
        } while (!B.e(z2Var, v2Var2, v2.d));
        while (true) {
            v2Var3 = v2Var;
            v2Var = v2Var2;
            if (v2Var == null) {
                break;
            }
            v2Var2 = v2Var.c;
            v2Var.c = v2Var3;
        }
        while (v2Var3 != null) {
            v2 v2Var4 = v2Var3.c;
            e(v2Var3.a, v2Var3.b);
            v2Var3 = v2Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            A.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof t2) {
            Throwable th = ((t2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof u2) {
            throw new ExecutionException(((u2) obj).a);
        } else if (obj == C) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
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
        return obj;
    }

    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        v2 v2Var = this.x;
        v2 v2Var2 = v2.d;
        if (v2Var != v2Var2) {
            v2 v2Var3 = new v2(runnable, executor);
            do {
                v2Var3.c = v2Var;
                if (!B.e(this, v2Var, v2Var3)) {
                    v2Var = this.x;
                } else {
                    return;
                }
            } while (v2Var != v2Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String str;
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            if (g == this) {
                str = "this future";
            } else {
                str = String.valueOf(g);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z2) {
        boolean z3;
        t2 t2Var;
        Object obj = this.w;
        if (obj == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z) {
                t2Var = new t2(new CancellationException("Future.cancel() was called."), z2);
            } else if (z2) {
                t2Var = t2.c;
            } else {
                t2Var = t2.d;
            }
            if (B.f(this, obj, t2Var)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        boolean z2;
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        y2 y2Var = y2.c;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.w;
            if (obj != null) {
                return f(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                y2 y2Var2 = this.y;
                if (y2Var2 != y2Var) {
                    y2 y2Var3 = new y2();
                    do {
                        rd3 rd3 = B;
                        rd3.G(y2Var3, y2Var2);
                        if (rd3.g(this, y2Var2, y2Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.w;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    i(y2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(y2Var3);
                        } else {
                            y2Var2 = this.y;
                        }
                    } while (y2Var2 != y2Var);
                }
                return f(this.w);
            }
            while (nanos > 0) {
                Object obj3 = this.w;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String z2Var = toString();
            String obj4 = timeUnit2.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder q = hl6.q(j3, "Waited ", " ");
            q.append(timeUnit2.toString().toLowerCase(locale));
            String sb = q.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i == 0 || nanos2 > 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z2) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z2) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(pb4.l(sb, " for ", z2Var));
        }
        throw new InterruptedException();
    }

    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(y2 y2Var) {
        y2Var.a = null;
        while (true) {
            y2 y2Var2 = this.y;
            if (y2Var2 != y2.c) {
                y2 y2Var3 = null;
                while (y2Var2 != null) {
                    y2 y2Var4 = y2Var2.b;
                    if (y2Var2.a != null) {
                        y2Var3 = y2Var2;
                    } else if (y2Var3 != null) {
                        y2Var3.b = y2Var4;
                        if (y2Var3.a == null) {
                        }
                    } else if (!B.g(this, y2Var2, y2Var4)) {
                    }
                    y2Var2 = y2Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.w instanceof t2;
    }

    public final boolean isDone() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = C;
        }
        if (!B.f(this, (Object) null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!B.f(this, (Object) null, new u2(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.w instanceof t2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public final Object get() {
        Object obj;
        y2 y2Var = y2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.w;
            if (obj2 != null) {
                return f(obj2);
            }
            y2 y2Var2 = this.y;
            if (y2Var2 != y2Var) {
                y2 y2Var3 = new y2();
                do {
                    rd3 rd3 = B;
                    rd3.G(y2Var3, y2Var2);
                    if (rd3.g(this, y2Var2, y2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w;
                            } else {
                                i(y2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    y2Var2 = this.y;
                } while (y2Var2 != y2Var);
            }
            return f(this.w);
        }
        throw new InterruptedException();
    }
}
