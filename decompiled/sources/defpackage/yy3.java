package defpackage;

/* renamed from: yy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yy3 {
    public final uy3 a;
    public boolean b;
    public boolean c;
    public qy3 d = qy3.A;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public final kh4 p = new kh4(this);
    public jd4 q;

    public yy3(uy3 uy3) {
        this.a = uy3;
    }

    public final xz4 a() {
        return (xz4) this.a.a0.e;
    }

    public final void b() {
        qy3 qy3 = this.a.b0.d;
        qy3 qy32 = qy3.y;
        qy3 qy33 = qy3.z;
        if (qy3 == qy32 || qy3 == qy33) {
            if (this.p.W) {
                g(true);
            } else {
                f(true);
            }
        }
        if (qy3 == qy33) {
            jd4 jd4 = this.q;
            if (jd4 == null || !jd4.Q) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j2) {
        jd4 jd4 = this.q;
        if (jd4 != null) {
            yy3 yy3 = jd4.B;
            yy3.d = qy3.x;
            uy3 uy3 = yy3.a;
            yy3.e = false;
            jd4.U = j2;
            r95 snapshotObserver = ((je) xy3.a(uy3)).getSnapshotObserver();
            id4 id4 = jd4.V;
            snapshotObserver.a.e(uy3, snapshotObserver.b, id4);
            yy3.f = true;
            yy3.g = true;
            boolean B = we.B(uy3);
            kh4 kh4 = yy3.p;
            if (B) {
                kh4.R = true;
                kh4.S = true;
            } else {
                kh4.Q = true;
            }
            yy3.d = qy3.A;
        }
    }

    public final void d(int i2) {
        boolean z;
        yy3 yy3;
        int i3 = this.l;
        this.l = i2;
        boolean z2 = false;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0) {
            z2 = true;
        }
        if (z != z2) {
            uy3 v = this.a.v();
            if (v != null) {
                yy3 = v.b0;
            } else {
                yy3 = null;
            }
            if (yy3 != null) {
                int i4 = yy3.l;
                if (i2 == 0) {
                    yy3.d(i4 - 1);
                } else {
                    yy3.d(i4 + 1);
                }
            }
        }
    }

    public final void e(int i2) {
        boolean z;
        yy3 yy3;
        int i3 = this.o;
        this.o = i2;
        boolean z2 = false;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0) {
            z2 = true;
        }
        if (z != z2) {
            uy3 v = this.a.v();
            if (v != null) {
                yy3 = v.b0;
            } else {
                yy3 = null;
            }
            if (yy3 != null) {
                int i4 = yy3.o;
                if (i2 == 0) {
                    yy3.e(i4 - 1);
                } else {
                    yy3.e(i4 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else if (!z && !this.j) {
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else if (!z && !this.k) {
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else if (!z && !this.m) {
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else if (!z && !this.n) {
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        kh4 kh4 = this.p;
        yy3 yy3 = kh4.B;
        Object obj = kh4.N;
        uy3 uy3 = this.a;
        if (!(obj == null && yy3.a().B() == null) && kh4.M) {
            kh4.M = false;
            kh4.N = yy3.a().B();
            uy3 v = uy3.v();
            if (v != null) {
                uy3.Z(v, false, 7);
            }
        }
        jd4 jd4 = this.q;
        if (jd4 != null) {
            yy3 yy32 = jd4.B;
            if (jd4.T == null) {
                fd4 a1 = yy32.a().a1();
                a1.getClass();
                if (a1.O.B() == null) {
                    return;
                }
            }
            if (jd4.S) {
                jd4.S = false;
                fd4 a12 = yy32.a().a1();
                a12.getClass();
                jd4.T = a12.O.B();
                if (we.B(uy3)) {
                    uy3 v2 = uy3.v();
                    if (v2 != null) {
                        uy3.Z(v2, false, 7);
                        return;
                    }
                    return;
                }
                uy3 v3 = uy3.v();
                if (v3 != null) {
                    uy3.X(v3, false, 7);
                }
            }
        }
    }
}
