package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzmk;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: e89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class e89 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ w89 x;

    public /* synthetic */ e89(w89 w89, int i) {
        this.w = i;
        this.x = w89;
    }

    public final void run() {
        boolean z;
        x49 x49;
        kw5 kw5;
        d79 d79;
        boolean z2;
        cb9 cb9;
        String str;
        boolean z3;
        xj2 xj2;
        f0 f0Var;
        int i = this.w;
        w89 w89 = this.x;
        switch (i) {
            case b85.b:
                w89.b();
                return;
            case 1:
                x49 x492 = w89.b;
                String str2 = w89.c;
                lb9 lb9 = f99.a;
                kw5 kw52 = kw5.O;
                Context context = x492.b;
                Pattern pattern = pa9.a;
                kd6 kd6 = new kd6(context);
                kd6.P0("phenotype");
                kd6.Q0("all_accounts.pb");
                Uri R0 = kd6.R0();
                if (R0 != null) {
                    d79 u = d79.u();
                    if (u != null) {
                        lb9 lb92 = f99.a;
                        lb92.getClass();
                        xn5 xn5 = new xn5(lb92);
                        m93 m93 = q93.x;
                        i36 i36 = i36.A;
                        cb9 cb92 = new cb9(R0, u, xn5, i36);
                        o9 o9Var = f99.c;
                        if (o9Var == null) {
                            synchronized (f99.b) {
                                try {
                                    o9Var = f99.c;
                                    if (o9Var == null) {
                                        HashMap hashMap = new HashMap();
                                        fb9 fb9 = fb9.a;
                                        z = true;
                                        x49 = x492;
                                        g75.i(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                        hashMap.put("singleproc", fb9);
                                        o9 o9Var2 = new o9(x492.a(), (ka9) x492.f.get(), hashMap);
                                        f99.c = o9Var2;
                                        o9Var = o9Var2;
                                    } else {
                                        x49 = x492;
                                        z = true;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            x49 = x492;
                            z = true;
                        }
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o9Var.x;
                        Pair pair = (Pair) concurrentHashMap.get(R0);
                        if (pair == null) {
                            g75.i(R0.isHierarchical(), "Uri must be hierarchical: %s", R0);
                            String lastPathSegment = R0.getLastPathSegment();
                            int i2 = fj5.a;
                            if (lastPathSegment == null) {
                                lastPathSegment = "";
                            }
                            int lastIndexOf = lastPathSegment.lastIndexOf(46);
                            if (lastIndexOf == -1) {
                                str = "";
                            } else {
                                str = lastPathSegment.substring(lastIndexOf + 1);
                            }
                            g75.i(str.equals("pb"), "Uri extension must be .pb: %s", R0);
                            fb9 fb92 = (fb9) ((HashMap) o9Var.B).get("singleproc");
                            if (fb92 != null) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            g75.i(z3, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                            String lastPathSegment2 = R0.getLastPathSegment();
                            if (lastPathSegment2 == null) {
                                lastPathSegment2 = "";
                            }
                            int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                            if (lastIndexOf2 != -1) {
                                lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
                            }
                            h3 g = pt2.g(pt2.d(R0), (y59) o9Var.A, fv1.w);
                            Executor executor = (Executor) o9Var.y;
                            fb92.getClass();
                            String str3 = lastPathSegment2;
                            mb9 mb9 = new mb9(u, gl8.a());
                            h3 h3Var = g;
                            d79 d792 = u;
                            z2 = z;
                            kw5 = kw52;
                            h3 h3Var2 = h3Var;
                            d79 = d792;
                            cb9 cb93 = cb92;
                            eb9 eb9 = new eb9(new o00(str3, pt2.d(R0), mb9, executor, (ka9) o9Var.z, xn5, new hx8(4)), h3Var2);
                            if (!i36.isEmpty()) {
                                l99 l99 = new l99(z2 ? 1 : 0, i36, executor);
                                synchronized (eb9.g) {
                                    eb9.i.add(l99);
                                }
                            }
                            Pair create = Pair.create(eb9, cb93);
                            Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(R0, create);
                            if (pair2 != null) {
                                cb9 cb94 = cb93;
                                pair = pair2;
                                cb9 = cb94;
                            } else {
                                cb9 = cb93;
                                pair = create;
                            }
                        } else {
                            d79 = u;
                            cb9 = cb92;
                            z2 = z;
                            kw5 = kw52;
                        }
                        eb9 eb92 = (eb9) pair.first;
                        cb9 cb95 = (cb9) pair.second;
                        if (cb9.equals(cb95)) {
                            i3 a = eb92.a(new n89(z2 ? 1 : 0, str2), x49.a());
                            a.a(new j89(w89, a, 0), x49.a());
                            return;
                        }
                        String o = u55.o("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", d79.class.getSimpleName(), R0);
                        g75.i(R0.equals(cb95.a), o, "uri");
                        g75.i(d79.equals(cb95.b), o, "schema");
                        g75.i(xn5.equals(cb95.c), o, "handler");
                        g75.i(i36.equals(cb95.d), o, "migrations");
                        kw5 kw53 = kw5;
                        g75.i(kw53.equals(kw53), o, "variantConfig");
                        h.q(u55.o(o, "unknown"));
                        return;
                    }
                    ku4.j("Null schema");
                    return;
                }
                ku4.j("Null uri");
                return;
            case 2:
                n99 n99 = w89.b.i;
                boolean z4 = w89.e;
                l89 l89 = l89.a;
                q99 q99 = (q99) n99.c.get();
                if (q99 != null || z4) {
                    if ((n99.e & 64) == 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList = n99.f;
                        synchronized (copyOnWriteArrayList) {
                            try {
                                int i3 = n99.e;
                                if ((i3 & 64) == 0) {
                                    copyOnWriteArrayList.add(l89);
                                    n99.e = i3 | 64;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (n99.h == null) {
                        synchronized (n99.g) {
                            try {
                                if (n99.h == null) {
                                    if (q99 == null) {
                                        q99 = m99.a;
                                    }
                                    Context context2 = n99.a;
                                    if (!h49.W(context2)) {
                                        z22 z22 = z22.y;
                                        x77 x77 = n99.b;
                                        xj2 = pt2.g(h49.V(context2, Executors.callable(z22, (Object) null), (Executor) x77.get()), new l99(0, n99, q99), (Executor) x77.get());
                                        n99.h = xj2;
                                    } else {
                                        xj2 = ((a69) n99.d.get()).a(new k68(n99, q99));
                                        n99.h = xj2;
                                    }
                                    xj2.a(new m89(3, (Object) xj2), (Executor) n99.b.get());
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        return;
                    }
                    return;
                }
                f93 f93 = f93.x;
                return;
            default:
                ge2 a2 = w89.a();
                String str4 = (String) a2.b;
                x49 x493 = w89.b;
                x77 x772 = x493.d;
                r99 b = x493.g.b();
                boolean z5 = b.i;
                if (b.j) {
                    if (!fj5.a(str4) || z5) {
                        m59 u2 = r59.u();
                        dv5 dv5 = (dv5) a2.e;
                        int i4 = dv5.b;
                        o59 t = p59.t();
                        t.b();
                        ((p59) t.x).u(i4);
                        int i5 = dv5.c;
                        t.b();
                        ((p59) t.x).v(i5);
                        u2.b();
                        ((r59) u2.x).w((p59) t.d());
                        if (!fj5.a(str4)) {
                            u2.b();
                            ((r59) u2.x).v(str4);
                        }
                        if (z5) {
                            String str5 = w89.c;
                            u2.b();
                            ((r59) u2.x).x(str5);
                        }
                        r59 r59 = (r59) u2.d();
                        b49 b49 = ((a69) x772.get()).a;
                        za0 b2 = i93.b();
                        b2.d = new br4(29, (Object) r59);
                        b2.e = new cc2[]{mp7.E};
                        b2.c = false;
                        f0Var = a69.b(b49.b(0, b2.a()).g(fv1.w, new k68(17, b49, r59)));
                    } else {
                        f93 f932 = f93.x;
                        return;
                    }
                } else if (fj5.a(str4)) {
                    f93 f933 = f93.x;
                    return;
                } else {
                    a69 a69 = (a69) x772.get();
                    a69.getClass();
                    str4.getClass();
                    f0Var = a69.b(a69.a.c(str4));
                }
                pt2.a(f0Var, zzmk.class, new h89(0, w89), x493.a());
                return;
        }
    }
}
