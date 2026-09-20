package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: vt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class vt extends ri7 {
    public static final qa h;
    public static vt i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l = 60000;
    public static final long m = TimeUnit.MILLISECONDS.toNanos(60000);
    public int e;
    public int f = -1;
    public long g;

    static {
        qa qaVar = new qa(8, (byte) 0);
        qaVar.y = new vt[8];
        h = qaVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        k = newCondition;
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e == 0) {
                    this.e = 1;
                    kw5.g(this);
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            boolean z = false;
            this.e = 0;
            if (i2 == 1) {
                h.l(this);
                return false;
            }
            if (i2 == 2) {
                z = true;
            }
            reentrantLock.unlock();
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
