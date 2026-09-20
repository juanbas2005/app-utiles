package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: dt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dt5 extends wu2 {
    public static final dt5 L;
    public static final fp3 M = new fp3(24);
    public int A;
    public List B;
    public bt5 C;
    public int D;
    public bt5 E;
    public int F;
    public List G;
    public List H;
    public List I;
    public byte J;
    public int K;
    public final bg0 x;
    public int y;
    public int z;

    static {
        dt5 dt5 = new dt5();
        L = dt5;
        dt5.z = 6;
        dt5.A = 0;
        List list = Collections.EMPTY_LIST;
        dt5.B = list;
        bt5 bt5 = bt5.Q;
        dt5.C = bt5;
        dt5.D = 0;
        dt5.E = bt5;
        dt5.F = 0;
        dt5.G = list;
        dt5.H = list;
        dt5.I = list;
    }

    public dt5(ts0 ts0, y92 y92) {
        this.J = -1;
        this.K = -1;
        this.z = 6;
        boolean z2 = false;
        this.A = 0;
        List list = Collections.EMPTY_LIST;
        this.B = list;
        bt5 bt5 = bt5.Q;
        this.C = bt5;
        this.D = 0;
        this.E = bt5;
        this.F = 0;
        this.G = list;
        this.H = list;
        this.I = list;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                at5 at5 = null;
                switch (o) {
                    case b85.b:
                        z2 = true;
                        break;
                    case 8:
                        this.y |= 1;
                        this.z = ts0.l();
                        break;
                    case 16:
                        this.y |= 2;
                        this.A = ts0.l();
                        break;
                    case 26:
                        if (!(z3 & true)) {
                            this.B = new ArrayList();
                            z3 |= true;
                        }
                        this.B.add(ts0.h(gt5.K, y92));
                        break;
                    case 34:
                        if ((this.y & 4) == 4) {
                            bt5 bt52 = this.C;
                            bt52.getClass();
                            at5 = bt5.r(bt52);
                        }
                        bt5 bt53 = (bt5) ts0.h(bt5.R, y92);
                        this.C = bt53;
                        if (at5 != null) {
                            at5.i(bt53);
                            this.C = at5.g();
                        }
                        this.y |= 4;
                        break;
                    case 40:
                        this.y |= 8;
                        this.D = ts0.l();
                        break;
                    case 50:
                        if ((this.y & 16) == 16) {
                            bt5 bt54 = this.E;
                            bt54.getClass();
                            at5 = bt5.r(bt54);
                        }
                        bt5 bt55 = (bt5) ts0.h(bt5.R, y92);
                        this.E = bt55;
                        if (at5 != null) {
                            at5.i(bt55);
                            this.E = at5.g();
                        }
                        this.y |= 16;
                        break;
                    case 56:
                        this.y |= 32;
                        this.F = ts0.l();
                        break;
                    case 66:
                        if (!(z3 & true)) {
                            this.G = new ArrayList();
                            z3 |= true;
                        }
                        this.G.add(ts0.h(qr5.D, y92));
                        break;
                    case 248:
                        if (!(z3 & true)) {
                            this.H = new ArrayList();
                            z3 |= true;
                        }
                        this.H.add(Integer.valueOf(ts0.l()));
                        break;
                    case 250:
                        int e = ts0.e(ts0.l());
                        if (!(z3 & true) && ts0.c() > 0) {
                            this.H = new ArrayList();
                            z3 |= true;
                        }
                        while (ts0.c() > 0) {
                            this.H.add(Integer.valueOf(ts0.l()));
                        }
                        ts0.d(e);
                        break;
                    case 258:
                        if (!(z3 & true)) {
                            this.I = new ArrayList();
                            z3 |= true;
                        }
                        this.I.add(ts0.h(ur5.D, y92));
                        break;
                    default:
                        if (n(ts0, G2, y92, o)) {
                            break;
                        }
                        z2 = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e2) {
                e2.w = this;
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (z3 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if (z3 & true) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if (z3 & true) {
                    this.I = Collections.unmodifiableList(this.I);
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
        if (z3 & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if (z3 & true) {
            this.G = Collections.unmodifiableList(this.G);
        }
        if (z3 & true) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if (z3 & true) {
            this.I = Collections.unmodifiableList(this.I);
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
        byte b = this.J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.y & 2) == 2) {
            for (int i = 0; i < this.B.size(); i++) {
                if (!((gt5) this.B.get(i)).a()) {
                    this.J = 0;
                    return false;
                }
            }
            if ((this.y & 4) == 4 && !this.C.a()) {
                this.J = 0;
                return false;
            } else if ((this.y & 16) != 16 || this.E.a()) {
                for (int i2 = 0; i2 < this.G.size(); i2++) {
                    if (!((qr5) this.G.get(i2)).a()) {
                        this.J = 0;
                        return false;
                    }
                }
                for (int i3 = 0; i3 < this.I.size(); i3++) {
                    if (!((ur5) this.I.get(i3)).a()) {
                        this.J = 0;
                        return false;
                    }
                }
                if (!i()) {
                    this.J = 0;
                    return false;
                }
                this.J = 1;
                return true;
            } else {
                this.J = 0;
                return false;
            }
        } else {
            this.J = 0;
            return false;
        }
    }

    public final k2 b() {
        return L;
    }

    public final int c() {
        int i;
        List list;
        int i2 = this.K;
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
        for (int i3 = 0; i3 < this.B.size(); i3++) {
            i += xs0.n(3, (k2) this.B.get(i3));
        }
        if ((this.y & 4) == 4) {
            i += xs0.n(4, this.C);
        }
        if ((this.y & 8) == 8) {
            i += xs0.l(5, this.D);
        }
        if ((this.y & 16) == 16) {
            i += xs0.n(6, this.E);
        }
        if ((this.y & 32) == 32) {
            i += xs0.l(7, this.F);
        }
        for (int i4 = 0; i4 < this.G.size(); i4++) {
            i += xs0.n(8, (k2) this.G.get(i4));
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = this.H.size();
            list = this.H;
            if (i5 >= size) {
                break;
            }
            i6 += xs0.m(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int size2 = (list.size() * 2) + i + i6;
        for (int i7 = 0; i7 < this.I.size(); i7++) {
            size2 += xs0.n(32, (k2) this.I.get(i7));
        }
        int size3 = this.x.size() + j() + size2;
        this.K = size3;
        return size3;
    }

    public final ru2 d() {
        return ct5.h();
    }

    public final ru2 e() {
        ct5 h = ct5.h();
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
        for (int i = 0; i < this.B.size(); i++) {
            xs0.Y(3, (k2) this.B.get(i));
        }
        if ((this.y & 4) == 4) {
            xs0.Y(4, this.C);
        }
        if ((this.y & 8) == 8) {
            xs0.W(5, this.D);
        }
        if ((this.y & 16) == 16) {
            xs0.Y(6, this.E);
        }
        if ((this.y & 32) == 32) {
            xs0.W(7, this.F);
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            xs0.Y(8, (k2) this.G.get(i2));
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            xs0.W(31, ((Integer) this.H.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.I.size(); i4++) {
            xs0.Y(32, (k2) this.I.get(i4));
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public dt5() {
        this.J = -1;
        this.K = -1;
        this.x = bg0.w;
    }

    public dt5(ct5 ct5) {
        super(ct5);
        this.J = -1;
        this.K = -1;
        this.x = ct5.w;
    }
}
