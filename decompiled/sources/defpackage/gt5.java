package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: gt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt5 extends wu2 {
    public static final gt5 J;
    public static final fp3 K = new fp3(25);
    public int A;
    public boolean B;
    public ft5 C;
    public List D;
    public List E;
    public int F;
    public List G;
    public byte H;
    public int I;
    public final bg0 x;
    public int y;
    public int z;

    static {
        gt5 gt5 = new gt5();
        J = gt5;
        gt5.z = 0;
        gt5.A = 0;
        gt5.B = false;
        gt5.C = ft5.z;
        List list = Collections.EMPTY_LIST;
        gt5.D = list;
        gt5.E = list;
        gt5.G = list;
    }

    public gt5(ts0 ts0, y92 y92) {
        boolean z2;
        ft5 ft5;
        ts0 ts02 = ts0;
        y92 y922 = y92;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.z = 0;
        this.A = 0;
        this.B = false;
        ft5 ft52 = ft5.z;
        this.C = ft52;
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = list;
        this.G = list;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
        boolean z4 = false;
        while (!z3) {
            try {
                int o = ts02.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.z = ts02.l();
                    } else if (o == 16) {
                        this.y |= 2;
                        this.A = ts02.l();
                    } else if (o == 24) {
                        this.y |= 4;
                        if (ts02.m() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.B = z2;
                    } else if (o == 32) {
                        int l = ts02.l();
                        if (l == 0) {
                            ft5 = ft5.x;
                        } else if (l == 1) {
                            ft5 = ft5.y;
                        } else if (l != 2) {
                            ft5 = null;
                        } else {
                            ft5 = ft52;
                        }
                        if (ft5 == null) {
                            G2.f0(o);
                            G2.f0(l);
                        } else {
                            this.y |= 8;
                            this.C = ft5;
                        }
                    } else if (o == 42) {
                        if (!(z4 & true)) {
                            this.D = new ArrayList();
                            z4 |= true;
                        }
                        this.D.add(ts02.h(bt5.R, y922));
                    } else if (o == 48) {
                        if (!(z4 & true)) {
                            this.E = new ArrayList();
                            z4 |= true;
                        }
                        this.E.add(Integer.valueOf(ts02.l()));
                    } else if (o == 50) {
                        int e = ts02.e(ts02.l());
                        if (!(z4 & true) && ts02.c() > 0) {
                            this.E = new ArrayList();
                            z4 |= true;
                        }
                        while (ts02.c() > 0) {
                            this.E.add(Integer.valueOf(ts02.l()));
                        }
                        ts02.d(e);
                    } else if (o == 802) {
                        if (!(z4 & true)) {
                            this.G = new ArrayList();
                            z4 |= true;
                        }
                        this.G.add(ts02.h(qr5.D, y922));
                    } else if (n(ts02, G2, y922, o)) {
                    }
                }
                z3 = true;
            } catch (InvalidProtocolBufferException e2) {
                e2.w = this;
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z4 & true) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if (z4 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (z4 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                try {
                    G2.R();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.x = ag0.l();
                    throw th2;
                }
                this.x = ag0.l();
                m();
                throw th;
            }
        }
        if (z4 & true) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if (z4 & true) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if (z4 & true) {
            this.G = Collections.unmodifiableList(this.G);
        }
        try {
            G2.R();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.x = ag0.l();
            throw th3;
        }
        this.x = ag0.l();
        m();
    }

    public final boolean a() {
        byte b = this.H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.y;
        if ((i & 1) != 1) {
            this.H = 0;
            return false;
        } else if ((i & 2) == 2) {
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                if (!((bt5) this.D.get(i2)).a()) {
                    this.H = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.G.size(); i3++) {
                if (!((qr5) this.G.get(i3)).a()) {
                    this.H = 0;
                    return false;
                }
            }
            if (!i()) {
                this.H = 0;
                return false;
            }
            this.H = 1;
            return true;
        } else {
            this.H = 0;
            return false;
        }
    }

    public final k2 b() {
        return J;
    }

    public final int c() {
        int i;
        List list;
        int i2 = this.I;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == 1) {
            i = xs0.l(1, this.z);
        } else {
            i = 0;
        }
        if ((this.y & 2) == 2) {
            i += xs0.l(2, this.A);
        }
        if ((this.y & 4) == 4) {
            i += xs0.r(3) + 1;
        }
        if ((this.y & 8) == 8) {
            i += xs0.k(4, this.C.w);
        }
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            i += xs0.n(5, (k2) this.D.get(i3));
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int size = this.E.size();
            list = this.E;
            if (i4 >= size) {
                break;
            }
            i5 += xs0.m(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int i6 = i + i5;
        if (!list.isEmpty()) {
            i6 = i6 + 1 + xs0.m(i5);
        }
        this.F = i5;
        for (int i7 = 0; i7 < this.G.size(); i7++) {
            i6 += xs0.n(100, (k2) this.G.get(i7));
        }
        int size2 = this.x.size() + j() + i6;
        this.I = size2;
        return size2;
    }

    public final ru2 d() {
        return et5.h();
    }

    public final ru2 e() {
        et5 h = et5.h();
        h.i(this);
        return h;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 1) == 1) {
            xs0.W(1, this.z);
        }
        if ((this.y & 2) == 2) {
            xs0.W(2, this.A);
        }
        if ((this.y & 4) == 4) {
            boolean z2 = this.B;
            xs0.h0(3, 0);
            xs0.a0(z2 ? 1 : 0);
        }
        if ((this.y & 8) == 8) {
            xs0.V(4, this.C.w);
        }
        for (int i = 0; i < this.D.size(); i++) {
            xs0.Y(5, (k2) this.D.get(i));
        }
        if (this.E.size() > 0) {
            xs0.f0(50);
            xs0.f0(this.F);
        }
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            xs0.X(((Integer) this.E.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            xs0.Y(100, (k2) this.G.get(i3));
        }
        jz0.b0(1000, xs0);
        xs0.b0(this.x);
    }

    public gt5() {
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.x = bg0.w;
    }

    public gt5(et5 et5) {
        super(et5);
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.x = et5.w;
    }
}
