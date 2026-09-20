package defpackage;

import kotlinx.serialization.json.JsonObject;

/* renamed from: m47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m47 extends gl0 implements im3 {
    public final v70 E;
    public final pl3 F;
    public final ef8 G;
    public final im3[] H;
    public final z53 I;
    public final wl3 J;
    public boolean K;
    public String L;
    public String M;

    public m47(v70 v70, pl3 pl3, ef8 ef8, im3[] im3Arr) {
        v70.getClass();
        this.E = v70;
        this.F = pl3;
        this.G = ef8;
        this.H = im3Arr;
        this.I = pl3.b;
        this.J = pl3.a;
        int ordinal = ef8.ordinal();
        if (im3Arr != null) {
            im3 im3 = im3Arr[ordinal];
            if (im3 != null || im3 != this) {
                im3Arr[ordinal] = this;
            }
        }
    }

    public final void A(ll6 ll6, int i, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        if (obj != null || this.J.e) {
            super.A(ll6, i, zr3, obj);
        }
    }

    public final void B(long j) {
        if (this.K) {
            D(String.valueOf(j));
        } else {
            this.E.i(j);
        }
    }

    public final void D(String str) {
        str.getClass();
        this.E.k(str);
    }

    public final void P(ll6 ll6, int i) {
        ll6.getClass();
        int ordinal = this.G.ordinal();
        v70 v70 = this.E;
        boolean z = true;
        if (ordinal == 1) {
            if (!v70.x) {
                v70.g(',');
            }
            v70.d();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (!v70.x) {
                    v70.g(',');
                }
                v70.d();
                rm3.d(this.F, ll6);
                D(ll6.f(i));
                v70.g(':');
                v70.n();
                return;
            }
            if (i == 0) {
                this.K = true;
            }
            if (i == 1) {
                v70.g(',');
                v70.n();
                this.K = false;
            }
        } else if (!v70.x) {
            if (i % 2 == 0) {
                v70.g(',');
                v70.d();
            } else {
                v70.g(':');
                v70.n();
                z = false;
            }
            this.K = z;
        } else {
            this.K = true;
            v70.d();
        }
    }

    public final z53 a() {
        return this.I;
    }

    public final void b(ll6 ll6) {
        ll6.getClass();
        v70 v70 = this.E;
        v70.getClass();
        v70.x = false;
        v70.g(this.G.x);
    }

    public final hy0 c(ll6 ll6) {
        im3 im3;
        ll6.getClass();
        pl3 pl3 = this.F;
        ef8 l = aa5.l(pl3, ll6);
        char c = l.w;
        v70 v70 = this.E;
        v70.g(c);
        v70.x = true;
        String str = this.L;
        if (str != null) {
            String str2 = this.M;
            if (str2 == null) {
                str2 = ll6.a();
            }
            v70.d();
            v70.k(str);
            v70.g(':');
            D(str2);
            this.L = null;
            this.M = null;
        }
        if (this.G == l) {
            return this;
        }
        im3[] im3Arr = this.H;
        if (im3Arr == null || (im3 = im3Arr[l.ordinal()]) == null) {
            return new m47(v70, pl3, l, im3Arr);
        }
        return im3;
    }

    public final void e() {
        v70 v70 = this.E;
        v70.getClass();
        ((qa) v70.y).n("null");
    }

    public final boolean f(ll6 ll6) {
        ll6.getClass();
        return this.J.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (defpackage.sg3.e(r1, defpackage.n57.o) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 != defpackage.fq0.w) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    public final void g(zr3 zr3, Object obj) {
        String str;
        zr3 zr32;
        zr3.getClass();
        pl3 pl3 = this.F;
        boolean z = zr3 instanceof q2;
        fq0 fq0 = pl3.a.j;
        if (!z) {
            int ordinal = fq0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n85 u = zr3.getDescriptor().u();
                    if (!sg3.e(u, n57.l)) {
                    }
                } else if (ordinal != 2) {
                    h.c();
                    return;
                }
            }
            str = null;
            if (!z) {
                q2 q2Var = (q2) zr3;
                if (obj != null) {
                    zr32 = c35.g(q2Var, this, obj);
                } else {
                    ku4.w(q2Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                    return;
                }
            } else {
                zr32 = zr3;
            }
            if (str != null) {
                b35.a(pl3, zr3, zr32, str);
                b35.e(zr32.getDescriptor().u());
                String a = zr32.getDescriptor().a();
                this.L = str;
                this.M = a;
            }
            zr32.serialize(this, obj);
        }
        str = b35.f(pl3, zr3.getDescriptor());
        if (!z) {
        }
        if (str != null) {
        }
        zr32.serialize(this, obj);
    }

    public final void h(double d) {
        if (this.K) {
            D(String.valueOf(d));
        } else {
            ((qa) this.E.y).n(String.valueOf(d));
        }
        if (!this.J.h && Math.abs(d) > Double.MAX_VALUE) {
            throw ar7.b(Double.valueOf(d), (String) null);
        }
    }

    public final void i(short s) {
        if (this.K) {
            D(String.valueOf(s));
        } else {
            this.E.j(s);
        }
    }

    public final void k(byte b) {
        if (this.K) {
            D(String.valueOf(b));
        } else {
            this.E.f(b);
        }
    }

    public final void l(boolean z) {
        if (this.K) {
            D(String.valueOf(z));
        } else {
            ((qa) this.E.y).n(String.valueOf(z));
        }
    }

    public final j42 m(ll6 ll6) {
        ll6.getClass();
        boolean a = n47.a(ll6);
        ef8 ef8 = this.G;
        pl3 pl3 = this.F;
        v70 v70 = this.E;
        if (a) {
            if (!(v70 instanceof dy0)) {
                v70 = new dy0((qa) v70.y, this.K);
            }
            return new m47(v70, pl3, ef8, (im3[]) null);
        } else if (!ll6.j() || !ll6.equals(em3.a)) {
            if (this.L != null) {
                this.M = ll6.a();
            }
            return this;
        } else {
            if (!(v70 instanceof cy0)) {
                v70 = new cy0((qa) v70.y, this.K);
            }
            return new m47(v70, pl3, ef8, (im3[]) null);
        }
    }

    public final void p(float f) {
        if (this.K) {
            D(String.valueOf(f));
        } else {
            ((qa) this.E.y).n(String.valueOf(f));
        }
        if (!this.J.h && Math.abs(f) > Float.MAX_VALUE) {
            throw ar7.b(Float.valueOf(f), (String) null);
        }
    }

    public final void r(char c) {
        D(String.valueOf(c));
    }

    public final void s(JsonObject jsonObject) {
        g(gm3.a, jsonObject);
    }

    public final void u(ll6 ll6, int i) {
        ll6.getClass();
        D(ll6.f(i));
    }

    public final void z(int i) {
        if (this.K) {
            D(String.valueOf(i));
        } else {
            this.E.h(i);
        }
    }
}
