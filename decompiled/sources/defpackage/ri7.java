package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ri7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ri7 {
    public static final qi7 d = new Object();
    public boolean a;
    public long b;
    public long c;

    public ri7 a() {
        this.a = false;
        return this;
    }

    public ri7 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        h.s("No deadline");
        return 0;
    }

    public ri7 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ri7 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        h.j(f21.f(j, "timeout < 0: "));
        return null;
    }
}
