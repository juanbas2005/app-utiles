package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: h97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h97 extends ll4 implements uk5, tp1, tk5 {
    public Object K;
    public Object L;
    public PointerInputEventHandler M;
    public h27 N;
    public kk5 O = d97.a;
    public final eq4 P;
    public final eq4 Q;
    public final eq4 R;
    public kk5 S;
    public long T;

    public h97(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.K = obj;
        this.L = obj2;
        this.M = pointerInputEventHandler;
        eq4 eq4 = new eq4(new g97[16]);
        this.P = eq4;
        this.Q = eq4;
        this.R = new eq4(new g97[16]);
        this.T = 0;
    }

    public final void B0() {
        X0();
    }

    public final void I() {
        kk5 kk5 = this.S;
        if (kk5 != null) {
            List list = kk5.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((qk5) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        qk5 qk5 = (qk5) list.get(i2);
                        long j = qk5.a;
                        long j2 = qk5.c;
                        long j3 = qk5.b;
                        float f = qk5.e;
                        boolean z = qk5.d;
                        arrayList.add(new qk5(j, j3, j2, false, f, j3, j2, z, z, qk5.i, 0, 1.0f, 0));
                    }
                    kk5 kk52 = new kk5(arrayList, (hv2) null);
                    this.O = kk52;
                    W0(kk52, lk5.w);
                    W0(kk52, lk5.x);
                    W0(kk52, lk5.y);
                    this.S = null;
                    return;
                }
            }
        }
    }

    public final void O0() {
        X0();
    }

    public final Object V0(gs2 gs2, f61 f61) {
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        g97 g97 = new g97(this, kk0);
        synchronized (this.Q) {
            this.P.b(g97);
            new yd6(rc9.a0(rc9.C(g97, g97, gs2))).f(vs7.a);
        }
        kk0.x(new pb(23, g97));
        return kk0.t();
    }

    public final void W0(kk5 kk5, lk5 lk5) {
        kk0 kk0;
        kk0 kk02;
        synchronized (this.Q) {
            eq4 eq4 = this.R;
            eq4.c(eq4.y, this.P);
        }
        try {
            int ordinal = lk5.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    eq4 eq42 = this.R;
                    int i = eq42.y - 1;
                    Object[] objArr = eq42.w;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            g97 g97 = (g97) objArr[i];
                            if (lk5 == g97.z && (kk02 = g97.y) != null) {
                                g97.y = null;
                                kk02.f(kk5);
                            }
                            i--;
                        }
                    }
                    this.R.g();
                } else if (ordinal != 2) {
                    throw new RuntimeException();
                }
            }
            eq4 eq43 = this.R;
            Object[] objArr2 = eq43.w;
            int i2 = eq43.y;
            for (int i3 = 0; i3 < i2; i3++) {
                g97 g972 = (g97) objArr2[i3];
                if (lk5 == g972.z && (kk0 = g972.y) != null) {
                    g972.y = null;
                    kk0.f(kk5);
                }
            }
            this.R.g();
        } catch (Throwable th) {
            this.R.g();
            throw th;
        }
    }

    public final void X0() {
        h27 h27 = this.N;
        if (h27 != null) {
            h27.j(new CancellationException("Pointer input was reset"));
            this.N = null;
        }
    }

    public final float Y() {
        return rc9.O0(this).T.Y();
    }

    public final float b() {
        return rc9.O0(this).T.b();
    }

    public final void d() {
        X0();
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        this.T = j;
        if (lk5 == lk5.w) {
            this.O = kk5;
        }
        if (this.N == null) {
            this.N = ar7.H(J0(), (e81) null, r81.z, new gw6(this, (f61) null, 3), 1);
        }
        W0(kk5, lk5);
        List list = kk5.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kk5 = null;
                break;
            } else if (!ub5.d((qk5) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.S = kk5;
    }
}
