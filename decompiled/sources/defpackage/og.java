package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* renamed from: og  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class og implements ck5 {
    public o44 a;
    public h27 b;
    public v44 c;
    public pr6 d;

    public final void a() {
        j((b9) null);
    }

    public final void b() {
        gy6 gy6;
        o44 o44 = this.a;
        if (o44 != null && (gy6 = (gy6) h49.w(o44, xy0.r)) != null) {
            ((ip1) gy6).b();
        }
    }

    public final void c() {
        h27 h27 = this.b;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.b = null;
        xp4 i = i();
        if (i != null) {
            pr6 pr6 = (pr6) i;
            synchronized (pr6) {
                try {
                    pr6.v(pr6.p() + ((long) pr6.G), pr6.F, pr6.p() + ((long) pr6.G), pr6.p() + ((long) pr6.G) + ((long) pr6.H));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(hf7 hf7, v35 v35, bg7 bg7, st6 st6, ly5 ly5, ly5 ly52) {
        v44 v44 = this.c;
        if (v44 != null) {
            q44 q44 = v44.m;
            synchronized (q44.c) {
                try {
                    q44.j = hf7;
                    q44.l = v35;
                    q44.k = bg7;
                    q44.m = ly5;
                    q44.n = ly52;
                    if (!q44.e) {
                        if (q44.d) {
                        }
                    }
                    q44.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(hf7 hf7, hf7 hf72) {
        boolean z;
        int i;
        int i2;
        int i3;
        v44 v44 = this.c;
        if (v44 != null) {
            if (!lg7.b(v44.h.b, hf72.b) || !sg3.e(v44.h.c, hf72.c)) {
                z = true;
            } else {
                z = false;
            }
            v44.h = hf72;
            int size = v44.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                jy5 jy5 = (jy5) ((WeakReference) v44.j.get(i4)).get();
                if (jy5 != null) {
                    jy5.g = hf72;
                }
            }
            q44 q44 = v44.m;
            synchronized (q44.c) {
                try {
                    q44.j = null;
                    q44.l = null;
                    q44.k = null;
                    q44.m = null;
                    q44.n = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = -1;
            if (sg3.e(hf7, hf72)) {
                if (z) {
                    qc3 qc3 = v44.b;
                    int f = lg7.f(hf72.b);
                    int e = lg7.e(hf72.b);
                    lg7 lg7 = v44.h.c;
                    if (lg7 != null) {
                        i3 = lg7.f(lg7.a);
                    } else {
                        i3 = -1;
                    }
                    lg7 lg72 = v44.h.c;
                    if (lg72 != null) {
                        i5 = lg7.e(lg72.a);
                    }
                    qc3.A().updateSelection((View) qc3.x, f, e, i3, i5);
                }
            } else if (hf7 == null || (sg3.e(hf7.a.x, hf72.a.x) && (!lg7.b(hf7.b, hf72.b) || sg3.e(hf7.c, hf72.c)))) {
                int size2 = v44.j.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    jy5 jy52 = (jy5) ((WeakReference) v44.j.get(i6)).get();
                    if (jy52 != null) {
                        hf7 hf73 = v44.h;
                        qc3 qc32 = v44.b;
                        if (jy52.k) {
                            jy52.g = hf73;
                            if (jy52.i) {
                                qc32.A().updateExtractedText((View) qc32.x, jy52.h, n85.b(hf73));
                            }
                            lg7 lg73 = hf73.c;
                            long j = hf73.b;
                            if (lg73 != null) {
                                i = lg7.f(lg73.a);
                            } else {
                                i = -1;
                            }
                            lg7 lg74 = hf73.c;
                            if (lg74 != null) {
                                i2 = lg7.e(lg74.a);
                            } else {
                                i2 = -1;
                            }
                            qc32.A().updateSelection((View) qc32.x, lg7.f(j), lg7.e(j), i, i2);
                        }
                    }
                }
            } else {
                qc3 qc33 = v44.b;
                qc33.A().restartInput((View) qc33.x);
            }
        }
    }

    public final void f() {
        gy6 gy6;
        o44 o44 = this.a;
        if (o44 != null && (gy6 = (gy6) h49.w(o44, xy0.r)) != null) {
            ((ip1) gy6).a();
        }
    }

    public final void g(hf7 hf7, c93 c93, h17 h17, j71 j71) {
        j(new b9((Object) hf7, (Object) this, (Object) c93, (Object) h17, (Object) j71, 1));
    }

    public final void h(ly5 ly5) {
        Rect rect;
        v44 v44 = this.c;
        if (v44 != null) {
            v44.l = new Rect(dh4.C(ly5.a), dh4.C(ly5.b), dh4.C(ly5.c), dh4.C(ly5.d));
            if (v44.j.isEmpty() && (rect = v44.l) != null) {
                v44.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final xp4 i() {
        pr6 pr6 = this.d;
        if (pr6 != null) {
            return pr6;
        }
        if (!e67.a) {
            return null;
        }
        pr6 a2 = qr6.a(vc0.y, 2);
        this.d = a2;
        return a2;
    }

    public final void j(b9 b9Var) {
        o44 o44 = this.a;
        if (o44 != null) {
            h27 h27 = null;
            ng ngVar = new ng((Object) b9Var, (Object) this, (Object) o44, (f61) null, 0);
            if (o44.J) {
                h27 = ar7.H(o44.J0(), (e81) null, r81.z, new ju1(o44, ngVar, (f61) null, 18), 1);
            }
            this.b = h27;
        }
    }

    public final void k(o44 o44) {
        boolean z;
        o44 o442 = this.a;
        if (o442 == o44) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bc3.c("Expected textInputModifierNode to be " + o44 + " but was " + o442);
        }
        this.a = null;
    }
}
