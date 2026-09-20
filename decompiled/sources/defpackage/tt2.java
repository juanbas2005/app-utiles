package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.zzaeg;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: tt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt2 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public tt2(int i, int i2, int i3, bg7 bg7) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bg7;
    }

    public static final void B(int i) {
        if ((i & 3) != 0) {
            zz8.b("Failed to parse the message.");
        }
    }

    public static final void C(int i) {
        if ((i & 7) != 0) {
            zz8.b("Failed to parse the message.");
        }
    }

    public void A(int i) {
        if (((yk8) this.e).e() != i) {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public int D() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = ((yk8) this.e).l();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public vk8 E() {
        w(2);
        return ((yk8) this.e).y();
    }

    public void F(zl8 zl8) {
        int l;
        yk8 yk8 = (yk8) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                zl8.add(Double.valueOf(yk8.o()));
                if (!yk8.d()) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
        } else if (i == 2) {
            int A = yk8.A();
            C(A);
            int e2 = yk8.e() + A;
            do {
                zl8.add(Double.valueOf(yk8.o()));
            } while (yk8.e() < e2);
        } else {
            kj6.g();
        }
    }

    public void G(zl8 zl8) {
        int l;
        yk8 yk8 = (yk8) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = yk8.A();
            B(A);
            int e2 = yk8.e() + A;
            do {
                zl8.add(Float.valueOf(yk8.p()));
            } while (yk8.e() < e2);
        } else if (i == 5) {
            do {
                zl8.add(Float.valueOf(yk8.p()));
                if (!yk8.d()) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
        } else {
            kj6.g();
        }
    }

    public void H(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof dm8;
        int i2 = this.b;
        if (z) {
            dm8 dm8 = (dm8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    dm8.k(yk8.q());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    dm8.k(yk8.q());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Long.valueOf(yk8.q()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Long.valueOf(yk8.q()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void a(int i, int i2) {
        if (i < 0) {
            h.q("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = (int[]) this.e;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 4)];
                this.e = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = (int[]) this.e;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        } else {
            h.q("Pixel distance must be non-negative");
        }
    }

    public ij6 b(int i) {
        return new ij6(o55.j((bg7) this.e, i), i, 1);
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        xy5 xy5 = recyclerView.H;
        if (recyclerView.G != null && xy5 != null && xy5.i) {
            if (z) {
                if (!recyclerView.z.C()) {
                    xy5.i(recyclerView.G.a(), this);
                }
            } else if (!recyclerView.K()) {
                xy5.h(this.b, this.c, recyclerView.z0, this);
            }
            int i = this.d;
            if (i > xy5.j) {
                xy5.j = i;
                xy5.k = z;
                recyclerView.x.l();
            }
        }
    }

    public int d() {
        return this.d - this.c;
    }

    public int e(int i) {
        return ((j75) this.e).i[this.c + i];
    }

    public Object f(int i) {
        return ((j75) this.e).k[this.d + i];
    }

    public void g(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof dm8;
        int i2 = this.b;
        if (z) {
            dm8 dm8 = (dm8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    dm8.k(yk8.r());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    dm8.k(yk8.r());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Long.valueOf(yk8.r()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Long.valueOf(yk8.r()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void h(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    ol8.k(yk8.s());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    ol8.k(yk8.s());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Integer.valueOf(yk8.s()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Integer.valueOf(yk8.s()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void i(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof dm8;
        int i2 = this.b;
        if (z) {
            dm8 dm8 = (dm8) zl8;
            int i3 = i2 & 7;
            if (i3 == 1) {
                do {
                    dm8.k(yk8.t());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int A = yk8.A();
                C(A);
                int e2 = yk8.e() + A;
                do {
                    dm8.k(yk8.t());
                } while (yk8.e() < e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 1) {
                do {
                    zl8.add(Long.valueOf(yk8.t()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int A2 = yk8.A();
                C(A2);
                int e3 = yk8.e() + A2;
                do {
                    zl8.add(Long.valueOf(yk8.t()));
                } while (yk8.e() < e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void j(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int A = yk8.A();
                B(A);
                int e2 = yk8.e() + A;
                do {
                    ol8.k(yk8.u());
                } while (yk8.e() < e2);
                return;
            } else if (i3 == 5) {
                do {
                    ol8.k(yk8.u());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int A2 = yk8.A();
                B(A2);
                int e3 = yk8.e() + A2;
                do {
                    zl8.add(Integer.valueOf(yk8.u()));
                } while (yk8.e() < e3);
                return;
            } else if (i4 == 5) {
                do {
                    zl8.add(Integer.valueOf(yk8.u()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void k(zl8 zl8) {
        int l;
        yk8 yk8 = (yk8) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zl8.add(Boolean.valueOf(yk8.v()));
                if (!yk8.d()) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
        } else if (i == 2) {
            int e2 = yk8.e() + yk8.A();
            do {
                zl8.add(Boolean.valueOf(yk8.v()));
            } while (yk8.e() < e2);
            A(e2);
        } else {
            kj6.g();
        }
    }

    public void l(zl8 zl8, boolean z) {
        String str;
        int l;
        yk8 yk8 = (yk8) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    w(2);
                    str = yk8.x();
                } else {
                    w(2);
                    str = yk8.w();
                }
                zl8.add(str);
                if (!yk8.d()) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        kj6.g();
    }

    public void m(zl8 zl8, wm8 wm8, gl8 gl8) {
        int l;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                nl8 a2 = wm8.a();
                x(a2, wm8, gl8);
                wm8.f(a2);
                zl8.add(a2);
                yk8 yk8 = (yk8) this.e;
                if (!yk8.d() && this.d == 0) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == i);
            this.d = l;
            return;
        }
        kj6.g();
    }

    public void n(zl8 zl8, wm8 wm8, gl8 gl8) {
        int l;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                nl8 a2 = wm8.a();
                y(a2, wm8, gl8);
                wm8.f(a2);
                zl8.add(a2);
                yk8 yk8 = (yk8) this.e;
                if (!yk8.d() && this.d == 0) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == i);
            this.d = l;
            return;
        }
        kj6.g();
    }

    public void o(zl8 zl8) {
        int l;
        if ((this.b & 7) == 2) {
            do {
                zl8.add(E());
                yk8 yk8 = (yk8) this.e;
                if (!yk8.d()) {
                    l = yk8.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        kj6.g();
    }

    public void p(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    ol8.k(yk8.A());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    ol8.k(yk8.A());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Integer.valueOf(yk8.A()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Integer.valueOf(yk8.A()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void q(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    ol8.k(yk8.B());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    ol8.k(yk8.B());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Integer.valueOf(yk8.B()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Integer.valueOf(yk8.B()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void r(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int A = yk8.A();
                B(A);
                int e2 = yk8.e() + A;
                do {
                    ol8.k(yk8.C());
                } while (yk8.e() < e2);
                return;
            } else if (i3 == 5) {
                do {
                    ol8.k(yk8.C());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int A2 = yk8.A();
                B(A2);
                int e3 = yk8.e() + A2;
                do {
                    zl8.add(Integer.valueOf(yk8.C()));
                } while (yk8.e() < e3);
                return;
            } else if (i4 == 5) {
                do {
                    zl8.add(Integer.valueOf(yk8.C()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void s(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof dm8;
        int i2 = this.b;
        if (z) {
            dm8 dm8 = (dm8) zl8;
            int i3 = i2 & 7;
            if (i3 == 1) {
                do {
                    dm8.k(yk8.D());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int A = yk8.A();
                C(A);
                int e2 = yk8.e() + A;
                do {
                    dm8.k(yk8.D());
                } while (yk8.e() < e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 1) {
                do {
                    zl8.add(Long.valueOf(yk8.D()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int A2 = yk8.A();
                C(A2);
                int e3 = yk8.e() + A2;
                do {
                    zl8.add(Long.valueOf(yk8.D()));
                } while (yk8.e() < e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public void t(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof ol8;
        int i2 = this.b;
        if (z) {
            ol8 ol8 = (ol8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    ol8.k(yk8.E());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    ol8.k(yk8.E());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Integer.valueOf(yk8.E()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Integer.valueOf(yk8.E()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    public String toString() {
        switch (this.a) {
            case b85.b:
                return "";
            case 3:
                int i = this.b;
                bg7 bg7 = (bg7) this.e;
                p56 j = o55.j(bg7, i);
                int i2 = this.c;
                p56 j2 = o55.j(bg7, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(j);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(j2);
                sb.append("), prevOffset=");
                return hl6.n(sb, i3, ")");
            default:
                return super.toString();
        }
    }

    public void u(zl8 zl8) {
        int i;
        int l;
        yk8 yk8 = (yk8) this.e;
        boolean z = zl8 instanceof dm8;
        int i2 = this.b;
        if (z) {
            dm8 dm8 = (dm8) zl8;
            int i3 = i2 & 7;
            if (i3 == 0) {
                do {
                    dm8.k(yk8.F());
                    if (!yk8.d()) {
                        i = yk8.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else if (i3 == 2) {
                int e2 = yk8.e() + yk8.A();
                do {
                    dm8.k(yk8.F());
                } while (yk8.e() < e2);
                A(e2);
                return;
            } else {
                kj6.g();
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 == 0) {
                do {
                    zl8.add(Long.valueOf(yk8.F()));
                    if (!yk8.d()) {
                        l = yk8.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else if (i4 == 2) {
                int e3 = yk8.e() + yk8.A();
                do {
                    zl8.add(Long.valueOf(yk8.F()));
                } while (yk8.e() < e3);
                A(e3);
                return;
            } else {
                kj6.g();
                return;
            }
        }
        this.d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ zzaeg -> 0x004b, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0043 A[SYNTHETIC] */
    public void v(hm8 hm8, fm8 fm8, gl8 gl8) {
        String str;
        boolean z;
        boolean z2;
        w(2);
        yk8 yk8 = (yk8) this.e;
        int a2 = yk8.a(yk8.A());
        Object obj = fm8.z;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int D = D();
                if (D == Integer.MAX_VALUE || yk8.d()) {
                    hm8.put(obj2, obj3);
                } else {
                    z = false;
                    str = "Unable to parse map entry.";
                    if (D == 1) {
                        obj2 = z((mn8) fm8.x, (Class) null, (gl8) null);
                    } else if (D != 2) {
                        if (!yk8.d()) {
                            int i = this.b;
                            if (i != this.c) {
                                z2 = yk8.n(i);
                                if (z2) {
                                    throw new IOException(str);
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    } else {
                        obj3 = z((mn8) fm8.y, obj.getClass(), gl8);
                    }
                }
            } catch (zzaeg e2) {
                if (!yk8.d()) {
                    int i2 = this.b;
                    if (i2 != this.c) {
                        z = yk8.n(i2);
                    }
                }
                if (!z) {
                    throw new IOException(str, e2);
                }
            } catch (Throwable th) {
                yk8.b(a2);
                throw th;
            }
        }
        hm8.put(obj2, obj3);
        yk8.b(a2);
    }

    public void w(int i) {
        if ((this.b & 7) != i) {
            kj6.g();
        }
    }

    public void x(Object obj, wm8 wm8, gl8 gl8) {
        yk8 yk8 = (yk8) this.e;
        int A = yk8.A();
        if (yk8.a + yk8.b < 100) {
            int a2 = yk8.a(A);
            yk8.a++;
            wm8.c(obj, this, gl8);
            yk8.m(0);
            yk8.a--;
            yk8.b(a2);
            return;
        }
        zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void y(Object obj, wm8 wm8, gl8 gl8) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            wm8.c(obj, this, gl8);
            if (this.b != this.c) {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public Object z(mn8 mn8, Class cls, gl8 gl8) {
        yk8 yk8 = (yk8) this.e;
        mn8 mn82 = mn8.STRING;
        switch (mn8.ordinal()) {
            case b85.b:
                w(1);
                return Double.valueOf(yk8.o());
            case 1:
                w(5);
                return Float.valueOf(yk8.p());
            case 2:
                w(0);
                return Long.valueOf(yk8.r());
            case 3:
                w(0);
                return Long.valueOf(yk8.q());
            case 4:
                w(0);
                return Integer.valueOf(yk8.s());
            case 5:
                w(1);
                return Long.valueOf(yk8.t());
            case 6:
                w(5);
                return Integer.valueOf(yk8.u());
            case 7:
                w(0);
                return Boolean.valueOf(yk8.v());
            case 8:
                w(2);
                return yk8.x();
            case 10:
                w(2);
                wm8 a2 = tm8.c.a(cls);
                nl8 a3 = a2.a();
                x(a3, a2, gl8);
                a2.f(a3);
                return a3;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return E();
            case 12:
                w(0);
                return Integer.valueOf(yk8.A());
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                w(0);
                return Integer.valueOf(yk8.B());
            case 14:
                w(5);
                return Integer.valueOf(yk8.C());
            case h75.g:
                w(1);
                return Long.valueOf(yk8.D());
            case 16:
                w(0);
                return Integer.valueOf(yk8.E());
            case 17:
                w(0);
                return Long.valueOf(yk8.F());
            default:
                h.q("unsupported field type.");
                return null;
        }
    }

    public tt2(yk8 yk8) {
        this.a = 4;
        this.d = 0;
        this.e = yk8;
        yk8.c = this;
    }

    public tt2(j75 j75) {
        this.a = 2;
        this.e = j75;
    }

    public /* synthetic */ tt2(int i) {
        this.a = i;
    }
}
