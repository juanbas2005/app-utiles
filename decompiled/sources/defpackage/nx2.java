package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: nx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nx2 implements jg6, a55, b82 {
    public static final String K = bc4.p("GreedyScheduler");
    public final Object A = new Object();
    public final kg5 B = new kg5(new tb3(1));
    public final lp5 C;
    public final k68 D;
    public final f01 E;
    public final HashMap F = new HashMap();
    public Boolean G;
    public final zy2 H;
    public final qd8 I;
    public final am6 J;
    public final Context w;
    public final HashMap x = new HashMap();
    public final uo1 y;
    public boolean z;

    public nx2(Context context, f01 f01, zk7 zk7, lp5 lp5, k68 k68, qd8 qd8) {
        this.w = context;
        ns8 ns8 = f01.g;
        this.y = new uo1(this, ns8, f01.d);
        this.J = new am6(ns8, k68);
        this.I = qd8;
        this.H = new zy2(zk7);
        this.E = f01;
        this.C = lp5;
        this.D = k68;
    }

    public final void a(be8 be8, r31 r31) {
        id8 h = z85.h(be8);
        boolean z2 = r31 instanceof p31;
        k68 k68 = this.D;
        am6 am6 = this.J;
        String str = K;
        kg5 kg5 = this.B;
        if (!z2) {
            bc4 k = bc4.k();
            k.e(str, "Constraints not met: Cancelling work ID " + h);
            v27 L = kg5.L(h);
            if (L != null) {
                am6.n(L);
                int i = ((q31) r31).a;
                k68.getClass();
                k68.j(L, i);
            }
        } else if (!kg5.k(h)) {
            bc4 k2 = bc4.k();
            k2.e(str, "Constraints met: Scheduling work ID " + h);
            v27 S = kg5.S(h);
            am6.T(S);
            k68.getClass();
            k68.h(S, (or2) null);
        }
    }

    public final void b(id8 id8, boolean z2) {
        el3 el3;
        v27 L = this.B.L(id8);
        if (L != null) {
            this.J.n(L);
        }
        synchronized (this.A) {
            el3 = (el3) this.x.remove(id8);
        }
        if (el3 != null) {
            bc4 k = bc4.k();
            String str = K;
            k.e(str, "Stopping tracking for " + id8);
            el3.o((CancellationException) null);
        }
        if (!z2) {
            synchronized (this.A) {
                this.F.remove(id8);
            }
        }
    }

    public final boolean c() {
        return false;
    }

    public final void d(String str) {
        List<v27> d;
        Runnable runnable;
        String str2 = K;
        if (this.G == null) {
            this.G = Boolean.valueOf(kp5.a(this.w, this.E));
        }
        if (!this.G.booleanValue()) {
            bc4.k().m(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.z) {
            this.C.a(this);
            this.z = true;
        }
        bc4 k = bc4.k();
        k.e(str2, "Cancelling work ID " + str);
        uo1 uo1 = this.y;
        if (!(uo1 == null || (runnable = (Runnable) uo1.d.remove(str)) == null)) {
            ((Handler) uo1.b.x).removeCallbacks(runnable);
        }
        kg5 kg5 = this.B;
        kg5.getClass();
        str.getClass();
        synchronized (kg5.y) {
            d = ((tb3) kg5.x).d(str);
        }
        for (v27 v27 : d) {
            this.J.n(v27);
            k68 k68 = this.D;
            k68.getClass();
            k68.j(v27, -512);
        }
    }

    public final void e(be8... be8Arr) {
        long max;
        if (this.G == null) {
            this.G = Boolean.valueOf(kp5.a(this.w, this.E));
        }
        if (!this.G.booleanValue()) {
            bc4.k().m(K, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.z) {
            this.C.a(this);
            this.z = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (be8 be8 : be8Arr) {
            if (!this.B.k(z85.h(be8))) {
                synchronized (this.A) {
                    try {
                        id8 h = z85.h(be8);
                        mx2 mx2 = (mx2) this.F.get(h);
                        if (mx2 == null) {
                            int i = be8.k;
                            this.E.d.getClass();
                            mx2 = new mx2(System.currentTimeMillis(), i);
                            this.F.put(h, mx2);
                        }
                        max = (((long) Math.max((be8.k - mx2.a) - 5, 0)) * 30000) + mx2.b;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                long max2 = Math.max(be8.a(), max);
                this.E.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (be8.b == kd8.w) {
                    if (currentTimeMillis < max2) {
                        uo1 uo1 = this.y;
                        if (uo1 != null) {
                            ns8 ns8 = uo1.b;
                            HashMap hashMap = uo1.d;
                            Runnable runnable = (Runnable) hashMap.remove(be8.a);
                            if (runnable != null) {
                                ((Handler) ns8.x).removeCallbacks(runnable);
                            }
                            nt2 nt2 = new nt2(uo1, false, be8, 6);
                            hashMap.put(be8.a, nt2);
                            uo1.c.getClass();
                            ((Handler) ns8.x).postDelayed(nt2, max2 - System.currentTimeMillis());
                        }
                    } else if (!sg3.e(j31.j, be8.j)) {
                        j31 j31 = be8.j;
                        if (j31.d) {
                            bc4.k().e(K, "Ignoring " + be8 + ". Requires device idle.");
                        } else if (!j31.i.isEmpty()) {
                            bc4.k().e(K, "Ignoring " + be8 + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(be8);
                            hashSet2.add(be8.a);
                        }
                    } else if (!this.B.k(z85.h(be8))) {
                        bc4.k().e(K, "Starting work for " + be8.a);
                        kg5 kg5 = this.B;
                        kg5.getClass();
                        v27 S = kg5.S(z85.h(be8));
                        this.J.T(S);
                        k68 k68 = this.D;
                        k68.getClass();
                        k68.h(S, (or2) null);
                    }
                }
            }
        }
        synchronized (this.A) {
            try {
                if (!hashSet.isEmpty()) {
                    bc4.k().e(K, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        be8 be82 = (be8) it.next();
                        id8 h2 = z85.h(be82);
                        if (!this.x.containsKey(h2)) {
                            this.x.put(h2, bd8.a(this.H, be82, this.I.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
