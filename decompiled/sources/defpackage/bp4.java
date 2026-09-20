package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: bp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class bp4 {
    public static final Object k = new Object();
    public final Object a;
    public final de6 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final ge j;

    public bp4(int i2) {
        y65 y65 = g22.G;
        this.a = new Object();
        this.b = new de6();
        this.c = 0;
        this.f = k;
        this.j = new ge(10, (Object) this);
        this.e = y65;
        this.g = 0;
    }

    public static void a(String str) {
        pr.K().c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            h.s(f21.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(e94 e94) {
        if (e94.x) {
            if (!e94.e()) {
                e94.b(false);
                return;
            }
            int i2 = e94.y;
            int i3 = this.g;
            if (i2 < i3) {
                e94.y = i3;
                e94.w.m(this.e);
            }
        }
    }

    public final void c(e94 e94) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (e94 == null) {
                de6 de6 = this.b;
                de6.getClass();
                be6 be6 = new be6(de6);
                de6.y.put(be6, Boolean.FALSE);
                while (be6.hasNext()) {
                    b((e94) ((Map.Entry) be6.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(e94);
                e94 = null;
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(t54 t54, g35 g35) {
        a("observe");
        if (t54.k().G0() != k54.w) {
            d94 d94 = new d94(this, t54, g35);
            e94 e94 = (e94) this.b.d(g35, d94);
            if (e94 != null && !e94.d(t54)) {
                h.q("Cannot add the same observer with different lifecycles");
            } else if (e94 == null) {
                t54.k().x0(d94);
            }
        }
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (z) {
            pr K = pr.K();
            ge geVar = this.j;
            wn1 wn1 = K.c;
            if (wn1.e == null) {
                synchronized (wn1.c) {
                    try {
                        if (wn1.e == null) {
                            wn1.e = wn1.K(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            wn1.e.post(geVar);
        }
    }

    public void h(g35 g35) {
        a("removeObserver");
        de6 de6 = this.b;
        WeakHashMap weakHashMap = de6.y;
        ae6 ae6 = de6.w;
        while (ae6 != null && !ae6.w.equals(g35)) {
            ae6 = ae6.y;
        }
        e94 e94 = null;
        if (ae6 != null) {
            de6.z--;
            if (!weakHashMap.isEmpty()) {
                for (ce6 a2 : weakHashMap.keySet()) {
                    a2.a(ae6);
                }
            }
            ae6 ae62 = ae6.z;
            ae6 ae63 = ae6.y;
            if (ae62 != null) {
                ae62.y = ae63;
            } else {
                de6.w = ae63;
            }
            ae6 ae64 = ae6.y;
            if (ae64 != null) {
                ae64.z = ae62;
            } else {
                de6.x = ae62;
            }
            ae6.y = null;
            ae6.z = null;
            e94 = ae6.x;
        }
        if (e94 != null) {
            e94.c();
            e94.b(false);
        }
    }

    public void i(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c((e94) null);
    }

    public void e() {
    }

    public void f() {
    }

    public bp4() {
        this.a = new Object();
        this.b = new de6();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new ge(10, (Object) this);
        this.e = obj;
        this.g = -1;
    }
}
