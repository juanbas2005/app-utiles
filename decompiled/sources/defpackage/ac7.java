package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ac7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ac7 {
    public final bc7 a;
    public final String b;
    public boolean c;
    public vb7 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public ac7(bc7 bc7, String str) {
        this.a = bc7;
        this.b = str;
    }

    public static void c(ac7 ac7, String str, long j, sr2 sr2, int i) {
        boolean z;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        ac7.getClass();
        str.getClass();
        sr2.getClass();
        ac7.d(new fx5(str, z, sr2), j);
    }

    public final void a() {
        bc7 bc7 = this.a;
        TimeZone timeZone = fg8.a;
        synchronized (bc7) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        vb7 vb7 = this.d;
        if (vb7 != null && vb7.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((vb7) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                vb7 vb72 = (vb7) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    p25.c(logger, vb72, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        return;
     */
    public final void d(vb7 vb7, long j) {
        vb7.getClass();
        synchronized (this.a) {
            if (this.c) {
                boolean z = vb7.b;
                Logger logger = this.a.b;
                if (!z) {
                    if (logger.isLoggable(Level.FINE)) {
                        p25.c(logger, vb7, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                } else if (logger.isLoggable(Level.FINE)) {
                    p25.c(logger, vb7, this, "schedule canceled (queue is shutdown)");
                }
            } else if (e(vb7, j, false)) {
                this.a.c(this);
            }
        }
    }

    public final boolean e(vb7 vb7, long j, boolean z) {
        String str;
        Logger logger = this.a.b;
        vb7.getClass();
        ac7 ac7 = vb7.c;
        if (ac7 != this) {
            if (ac7 == null) {
                vb7.c = this;
            } else {
                h.s("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(vb7);
        if (indexOf != -1) {
            if (vb7.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    p25.c(logger, vb7, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        vb7.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after ".concat(p25.l(j2 - nanoTime));
            } else {
                str = "scheduled after ".concat(p25.l(j2 - nanoTime));
            }
            p25.c(logger, vb7, this, str);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((vb7) it.next()).d - nanoTime > j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, vb7);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        bc7 bc7 = this.a;
        TimeZone timeZone = fg8.a;
        synchronized (bc7) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
