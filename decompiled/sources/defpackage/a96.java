package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a96 {
    public ig0 a;
    public e81 b;
    public Executor c;
    public ol6 d;
    public dq1 e;
    public eh3 f;
    public final qc3 g = new qc3(new xi5(0, this, a96.class, "onClosed", "onClosed()V", 0, 0, 16));
    public boolean h;
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public a96() {
    }

    public final void a() {
        boolean z;
        if (!this.h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                h.s("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public final void b() {
        a();
        a();
        ir2 P = h().P();
        if (!P.Z()) {
            j45.n(new ot(g(), (f61) null, 9));
        }
        if (P.w.isWriteAheadLoggingEnabled()) {
            P.k();
        } else {
            P.a();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(kl8.u((gq3) entry.getKey()), entry.getValue());
        }
        return a42.w;
    }

    public abstract eh3 d();

    public t22 e() {
        throw new s05(0);
    }

    public final void f() {
        h().P().o();
        if (!l()) {
            eh3 g2 = g();
            g2.b.e(g2.e, g2.f);
        }
    }

    public final eh3 g() {
        eh3 eh3 = this.f;
        if (eh3 != null) {
            return eh3;
        }
        sg3.a0("internalTracker");
        throw null;
    }

    public final j87 h() {
        dq1 dq1 = this.e;
        if (dq1 != null) {
            j87 j87 = (j87) dq1.h;
            if (j87 != null) {
                return j87;
            }
            h.s("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        sg3.a0("connectionManager");
        throw null;
    }

    public Set i() {
        return dt0.g1(new ArrayList(et0.e0(g42.w, 10)));
    }

    public LinkedHashMap j() {
        int F = tf4.F(et0.e0(g42.w, 10));
        if (F < 16) {
            F = 16;
        }
        return new LinkedHashMap(F);
    }

    public final boolean k() {
        dq1 dq1 = this.e;
        if (dq1 == null) {
            sg3.a0("connectionManager");
            throw null;
        } else if (((j87) dq1.h) != null) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean l() {
        if (!n() || !h().P().Z()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        defpackage.dh4.f(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        throw r5;
     */
    public final void m(ua6 ua6) {
        ua6.getClass();
        eh3 g2 = g();
        do7 do7 = g2.b;
        do7.getClass();
        ab6 k0 = ua6.k0("PRAGMA query_only");
        k0.i0();
        boolean J = k0.J();
        dh4.f(k0, (Throwable) null);
        if (!J) {
            l55.m(ua6, "PRAGMA temp_store = MEMORY");
            l55.m(ua6, "PRAGMA recursive_triggers = 1");
            l55.m(ua6, "DROP TABLE IF EXISTS room_table_modification_log");
            if (do7.d) {
                l55.m(ua6, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                l55.m(ua6, k57.s0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
            }
            e35 e35 = do7.h;
            ReentrantLock reentrantLock = e35.a;
            reentrantLock.lock();
            try {
                e35.d = true;
            } finally {
                reentrantLock.unlock();
            }
        }
        synchronized (g2.g) {
        }
    }

    public final boolean n() {
        dq1 dq1 = this.e;
        if (dq1 != null) {
            ir2 ir2 = (ir2) dq1.i;
            if (ir2 != null) {
                return ir2.isOpen();
            }
            return false;
        }
        sg3.a0("connectionManager");
        throw null;
    }

    public final Object o(sr2 sr2) {
        if (!k()) {
            return sg3.O(this, false, true, new sn(4, sr2));
        }
        b();
        try {
            Object b2 = sr2.b();
            p();
            return b2;
        } finally {
            f();
        }
    }

    public final void p() {
        h().P().B();
    }

    public final Object q(boolean z, gs2 gs2, h61 h61) {
        dq1 dq1 = this.e;
        if (dq1 != null) {
            return ((h11) dq1.g).w(z, gs2, h61);
        }
        sg3.a0("connectionManager");
        throw null;
    }
}
