package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

/* renamed from: y99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y99 extends sw8 {
    public yb9 D;

    public static Object c(Object obj) {
        if (obj instanceof hw8) {
            Throwable th = ((hw8) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof jw8) {
            throw new ExecutionException(((jw8) obj).a);
        } else if (obj == sw8.z) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object d(y99 y99) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = y99.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void e(y99 y99) {
        for (rw8 C = sw8.C.C(y99); C != null; C = C.b) {
            Thread thread = C.a;
            if (thread != null) {
                C.a = null;
                LockSupport.unpark(thread);
            }
        }
        y99.D = null;
        kw8 D2 = sw8.C.D(y99);
        kw8 kw8 = null;
        while (D2 != null) {
            kw8 kw82 = D2.a;
            D2.a = kw8;
            kw8 = D2;
            D2 = kw82;
        }
        if (kw8 != null) {
            throw null;
        }
    }

    public final boolean cancel(boolean z) {
        hw8 hw8;
        hw8 hw82;
        Object obj = this.w;
        if (obj != null) {
            return false;
        }
        if (sw8.B) {
            hw8 = new hw8(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                hw82 = hw8.b;
            } else {
                hw82 = hw8.c;
            }
            hw8 = hw82;
            Objects.requireNonNull(hw8);
        }
        if (!sw8.C.E(this, obj, hw8)) {
            return false;
        }
        e(this);
        return true;
    }

    public final Throwable exceptionNow() {
        boolean z;
        Object obj = this.w;
        if (obj instanceof jw8) {
            return ((jw8) obj).a;
        }
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            h.s("Task has not completed");
            return null;
        } else if (obj instanceof hw8) {
            h.s("Task was cancelled");
            return null;
        } else {
            h.s("Task completed with a result");
            return null;
        }
    }

    public final void f(StringBuilder sb) {
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            if (d == null) {
                sb.append("null");
            } else if (d == this) {
                sb.append("this future");
            } else {
                sb.append(d.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(d)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long j3;
        boolean z;
        long j4 = j;
        TimeUnit timeUnit2 = timeUnit;
        rw8 rw8 = rw8.c;
        long nanos = timeUnit2.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.w;
            if (obj != null) {
                return c(obj);
            }
            long j5 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                rw8 rw82 = this.y;
                if (rw82 != rw8) {
                    rw8 rw83 = new rw8();
                    while (true) {
                        o85 o85 = sw8.C;
                        o85.A(rw83, rw82);
                        if (o85.B(this, rw82, rw83)) {
                            j3 = j5;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.w;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    b(rw83);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(rw83);
                        } else {
                            long j6 = j5;
                            rw82 = this.y;
                            if (rw82 == rw8) {
                                break;
                            }
                            j5 = j6;
                        }
                    }
                }
                Object obj3 = this.w;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.w;
                if (obj4 != null) {
                    return c(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String y99 = toString();
            String obj5 = timeUnit2.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit2.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + 8 + String.valueOf(lowerCase2).length());
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
                    z = true;
                } else {
                    z = false;
                }
                if (i > 0) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    sb3.append(concat);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = sb4.concat(" ");
                }
                if (z) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(nanos2).length() + concat.length() + 13);
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
            throw new TimeoutException(f21.m(new StringBuilder(sb2.length() + 5 + y99.length()), sb2, " for ", y99));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.w instanceof hw8;
    }

    public final boolean isDone() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public final Object resultNow() {
        boolean z;
        Object obj = this.w;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            h.s("Task has not completed");
            return null;
        } else if (obj instanceof jw8) {
            h.s("Task completed with exception");
            return null;
        } else if (obj instanceof hw8) {
            h.s("Task was cancelled");
            return null;
        } else if (obj == sw8.z) {
            return null;
        } else {
            return obj;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Class<y99> cls = y99.class;
        if (cls.getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.w instanceof hw8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                yb9 yb9 = this.D;
                if (yb9 == null) {
                    str = "";
                } else {
                    str = yb9.toString();
                }
                if (str == null || str.isEmpty()) {
                    str = null;
                }
            } catch (Throwable th) {
                if (!(th instanceof Error) || (th instanceof StackOverflowError)) {
                    str = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
                } else {
                    throw th;
                }
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        rw8 rw8 = rw8.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.w;
            if (obj2 != null) {
                return c(obj2);
            }
            rw8 rw82 = this.y;
            if (rw82 != rw8) {
                rw8 rw83 = new rw8();
                do {
                    o85 o85 = sw8.C;
                    o85.A(rw83, rw82);
                    if (o85.B(this, rw82, rw83)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.w;
                            } else {
                                b(rw83);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    rw82 = this.y;
                } while (rw82 != rw8);
            }
            Object obj3 = this.w;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        throw new InterruptedException();
    }
}
