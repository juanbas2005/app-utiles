package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import java.util.concurrent.CancellationException;

/* renamed from: qt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qt extends vb5 implements v36 {
    public static final j5 P = new j5(11);
    public ig0 A;
    public final d37 B = e37.a(new wu6(0));
    public final ed5 C = u55.p((Object) null);
    public final ad5 D = new ad5(1.0f);
    public final ed5 E = u55.p((Object) null);
    public mt F;
    public vb5 G;
    public vr2 H;
    public vr2 I;
    public j51 J;
    public int K;
    public boolean L;
    public final ed5 M;
    public final ed5 N;
    public final ed5 O;

    public qt(s83 s83, jx5 jx5) {
        ht htVar = ht.a;
        this.F = htVar;
        this.H = P;
        this.J = i51.b;
        this.K = 1;
        this.M = u55.p(htVar);
        this.N = u55.p(s83);
        this.O = u55.p(jx5);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [vb5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void a() {
        ig0 ig0 = this.A;
        v36 v36 = null;
        if (ig0 != null) {
            gl0.J(ig0, (CancellationException) null);
        }
        this.A = null;
        ? r2 = this.G;
        if (r2 instanceof v36) {
            v36 = r2;
        }
        if (v36 != null) {
            v36.a();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [vb5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void b() {
        ig0 ig0 = this.A;
        v36 v36 = null;
        if (ig0 != null) {
            gl0.J(ig0, (CancellationException) null);
        }
        this.A = null;
        ? r2 = this.G;
        if (r2 instanceof v36) {
            v36 = r2;
        }
        if (v36 != null) {
            v36.b();
        }
    }

    public final void c() {
        v36 v36;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.A == null) {
                w77 d = b85.d();
                dn1 dn1 = aw1.a;
                ig0 E2 = gl0.E(rc9.D0(d, pe4.a.B));
                this.A = E2;
                vb5 vb5 = this.G;
                if (vb5 instanceof v36) {
                    v36 = (v36) vb5;
                } else {
                    v36 = null;
                }
                if (v36 != null) {
                    v36.c();
                }
                if (this.L) {
                    r83 a = s83.a((s83) this.N.getValue());
                    a.b = ((jx5) this.O.getValue()).b;
                    a.r = null;
                    a.a().A.getClass();
                    bn1 bn1 = g.a;
                    l(new kt((vb5) null));
                } else {
                    ar7.H(E2, (e81) null, (r81) null, new ot(this, (f61) null, 0), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void d(float f) {
        this.D.e(f);
    }

    public final void e(lt0 lt0) {
        this.E.setValue(lt0);
    }

    public final long i() {
        vb5 vb5 = (vb5) this.C.getValue();
        if (vb5 != null) {
            return vb5.i();
        }
        return 9205357640488583168L;
    }

    public final void j(wy3 wy3) {
        tk0 tk0 = wy3.w;
        wu6 wu6 = new wu6(tk0.e());
        d37 d37 = this.B;
        d37.getClass();
        d37.l((Object) null, wu6);
        vb5 vb5 = (vb5) this.C.getValue();
        if (vb5 != null) {
            vb5.g(wy3, tk0.e(), this.D.d(), (lt0) this.E.getValue());
        }
    }

    public final vb5 k(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ie1.f(new hg(((BitmapDrawable) drawable).getBitmap()), this.K);
        }
        return new nz1(drawable.mutate());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [vb5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void l(mt mtVar) {
        vb5 vb5;
        vr2 vr2;
        vb5 a;
        v36 v36;
        ? a2;
        t83 t83;
        vb5 vb52;
        boolean z;
        mt mtVar2 = this.F;
        mt mtVar3 = (mt) this.H.y(mtVar);
        this.F = mtVar3;
        this.M.setValue(mtVar3);
        v36 v362 = null;
        if (mtVar3 instanceof lt) {
            t83 = ((lt) mtVar3).b;
        } else {
            if (mtVar3 instanceof jt) {
                t83 = ((jt) mtVar3).b;
            }
            vb5 = null;
            if (vb5 == null) {
                vb5 = mtVar3.a();
            }
            this.G = vb5;
            this.C.setValue(vb5);
            if (!(this.A == null || mtVar2.a() == mtVar3.a())) {
                a = mtVar2.a();
                if (a instanceof v36) {
                    v36 = (v36) a;
                } else {
                    v36 = null;
                }
                if (v36 != null) {
                    v36.b();
                }
                a2 = mtVar3.a();
                if (a2 instanceof v36) {
                    v362 = a2;
                }
                if (v362 != null) {
                    v362.c();
                }
            }
            vr2 = this.I;
            if (vr2 != null) {
                vr2.y(mtVar3);
                return;
            }
            return;
        }
        lm7 a3 = t83.b().h.a(dh4.a, t83);
        if (a3 instanceof jc1) {
            vb5 a4 = mtVar2.a();
            if (mtVar2 instanceof kt) {
                vb52 = a4;
            } else {
                vb52 = null;
            }
            vb5 a5 = mtVar3.a();
            j51 j51 = this.J;
            int i = ((jc1) a3).c;
            if (!(t83 instanceof f77) || !((f77) t83).g) {
                z = true;
            } else {
                z = false;
            }
            vb5 = new hc1(vb52, a5, j51, i, z);
            if (vb5 == null) {
            }
            this.G = vb5;
            this.C.setValue(vb5);
            a = mtVar2.a();
            if (a instanceof v36) {
            }
            if (v36 != null) {
            }
            a2 = mtVar3.a();
            if (a2 instanceof v36) {
            }
            if (v362 != null) {
            }
            vr2 = this.I;
            if (vr2 != null) {
            }
        }
        vb5 = null;
        if (vb5 == null) {
        }
        this.G = vb5;
        this.C.setValue(vb5);
        a = mtVar2.a();
        if (a instanceof v36) {
        }
        if (v36 != null) {
        }
        a2 = mtVar3.a();
        if (a2 instanceof v36) {
        }
        if (v362 != null) {
        }
        vr2 = this.I;
        if (vr2 != null) {
        }
    }
}
