package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: bt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bt5 extends wu2 {
    public static final bt5 Q;
    public static final fp3 R = new fp3(22);
    public boolean A;
    public int B;
    public bt5 C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public bt5 I;
    public int J;
    public bt5 K;
    public int L;
    public int M;
    public List N;
    public byte O;
    public int P;
    public final bg0 x;
    public int y;
    public List z;

    static {
        bt5 bt5 = new bt5();
        Q = bt5;
        bt5.q();
    }

    public bt5(ts0 ts0, y92 y92) {
        boolean z2;
        this.O = -1;
        this.P = -1;
        q();
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
        boolean z4 = false;
        while (!z3) {
            try {
                int o = ts0.o();
                fp3 fp3 = R;
                at5 at5 = null;
                switch (o) {
                    case b85.b:
                        break;
                    case 8:
                        this.y |= 4096;
                        this.M = ts0.l();
                        continue;
                    case 18:
                        if (!z4 || !true) {
                            this.z = new ArrayList();
                            z4 |= true;
                        }
                        this.z.add(ts0.h(zs5.E, y92));
                        continue;
                    case 24:
                        this.y |= 1;
                        if (ts0.m() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.A = z2;
                        continue;
                    case 32:
                        this.y |= 2;
                        this.B = ts0.l();
                        continue;
                    case 42:
                        if ((this.y & 4) == 4) {
                            bt5 bt5 = this.C;
                            bt5.getClass();
                            at5 = r(bt5);
                        }
                        bt5 bt52 = (bt5) ts0.h(fp3, y92);
                        this.C = bt52;
                        if (at5 != null) {
                            at5.i(bt52);
                            this.C = at5.g();
                        }
                        this.y |= 4;
                        continue;
                    case h75.h /*48*/:
                        this.y |= 16;
                        this.E = ts0.l();
                        continue;
                    case 56:
                        this.y |= 32;
                        this.F = ts0.l();
                        continue;
                    case 64:
                        this.y |= 8;
                        this.D = ts0.l();
                        continue;
                    case 72:
                        this.y |= 64;
                        this.G = ts0.l();
                        continue;
                    case 82:
                        if ((this.y & 256) == 256) {
                            bt5 bt53 = this.I;
                            bt53.getClass();
                            at5 = r(bt53);
                        }
                        bt5 bt54 = (bt5) ts0.h(fp3, y92);
                        this.I = bt54;
                        if (at5 != null) {
                            at5.i(bt54);
                            this.I = at5.g();
                        }
                        this.y |= 256;
                        continue;
                    case 88:
                        this.y |= 512;
                        this.J = ts0.l();
                        continue;
                    case 96:
                        this.y |= 128;
                        this.H = ts0.l();
                        continue;
                    case 106:
                        if ((this.y & 1024) == 1024) {
                            bt5 bt55 = this.K;
                            bt55.getClass();
                            at5 = r(bt55);
                        }
                        bt5 bt56 = (bt5) ts0.h(fp3, y92);
                        this.K = bt56;
                        if (at5 != null) {
                            at5.i(bt56);
                            this.K = at5.g();
                        }
                        this.y |= 1024;
                        continue;
                    case 112:
                        this.y |= 2048;
                        this.L = ts0.l();
                        continue;
                    case 802:
                        if (!(z4 & true)) {
                            this.N = new ArrayList();
                            z4 |= true;
                        }
                        this.N.add(ts0.h(qr5.D, y92));
                        continue;
                    default:
                        if (n(ts0, G2, y92, o)) {
                            continue;
                        }
                        break;
                }
                z3 = true;
            } catch (InvalidProtocolBufferException e) {
                e.w = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z4 && true) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if (z4 & true) {
                    this.N = Collections.unmodifiableList(this.N);
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
        if (z4 && true) {
            this.z = Collections.unmodifiableList(this.z);
        }
        if (z4 & true) {
            this.N = Collections.unmodifiableList(this.N);
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

    public static at5 r(bt5 bt5) {
        at5 h = at5.h();
        h.i(bt5);
        return h;
    }

    public final boolean a() {
        byte b = this.O;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.z.size(); i++) {
            if (!((zs5) this.z.get(i)).a()) {
                this.O = 0;
                return false;
            }
        }
        if ((this.y & 4) == 4 && !this.C.a()) {
            this.O = 0;
            return false;
        } else if ((this.y & 256) == 256 && !this.I.a()) {
            this.O = 0;
            return false;
        } else if ((this.y & 1024) != 1024 || this.K.a()) {
            for (int i2 = 0; i2 < this.N.size(); i2++) {
                if (!((qr5) this.N.get(i2)).a()) {
                    this.O = 0;
                    return false;
                }
            }
            if (!i()) {
                this.O = 0;
                return false;
            }
            this.O = 1;
            return true;
        } else {
            this.O = 0;
            return false;
        }
    }

    public final k2 b() {
        return Q;
    }

    public final int c() {
        int i;
        int i2 = this.P;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 4096) == 4096) {
            i = xs0.l(1, this.M);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            i += xs0.n(2, (k2) this.z.get(i3));
        }
        if ((this.y & 1) == 1) {
            i += xs0.r(3) + 1;
        }
        if ((this.y & 2) == 2) {
            i += xs0.l(4, this.B);
        }
        if ((this.y & 4) == 4) {
            i += xs0.n(5, this.C);
        }
        if ((this.y & 16) == 16) {
            i += xs0.l(6, this.E);
        }
        if ((this.y & 32) == 32) {
            i += xs0.l(7, this.F);
        }
        if ((this.y & 8) == 8) {
            i += xs0.l(8, this.D);
        }
        if ((this.y & 64) == 64) {
            i += xs0.l(9, this.G);
        }
        if ((this.y & 256) == 256) {
            i += xs0.n(10, this.I);
        }
        if ((this.y & 512) == 512) {
            i += xs0.l(11, this.J);
        }
        if ((this.y & 128) == 128) {
            i += xs0.l(12, this.H);
        }
        if ((this.y & 1024) == 1024) {
            i += xs0.n(13, this.K);
        }
        if ((this.y & 2048) == 2048) {
            i += xs0.l(14, this.L);
        }
        for (int i4 = 0; i4 < this.N.size(); i4++) {
            i += xs0.n(100, (k2) this.N.get(i4));
        }
        int size = this.x.size() + j() + i;
        this.P = size;
        return size;
    }

    public final ru2 d() {
        return at5.h();
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 4096) == 4096) {
            xs0.W(1, this.M);
        }
        for (int i = 0; i < this.z.size(); i++) {
            xs0.Y(2, (k2) this.z.get(i));
        }
        if ((this.y & 1) == 1) {
            boolean z2 = this.A;
            xs0.h0(3, 0);
            xs0.a0(z2 ? 1 : 0);
        }
        if ((this.y & 2) == 2) {
            xs0.W(4, this.B);
        }
        if ((this.y & 4) == 4) {
            xs0.Y(5, this.C);
        }
        if ((this.y & 16) == 16) {
            xs0.W(6, this.E);
        }
        if ((this.y & 32) == 32) {
            xs0.W(7, this.F);
        }
        if ((this.y & 8) == 8) {
            xs0.W(8, this.D);
        }
        if ((this.y & 64) == 64) {
            xs0.W(9, this.G);
        }
        if ((this.y & 256) == 256) {
            xs0.Y(10, this.I);
        }
        if ((this.y & 512) == 512) {
            xs0.W(11, this.J);
        }
        if ((this.y & 128) == 128) {
            xs0.W(12, this.H);
        }
        if ((this.y & 1024) == 1024) {
            xs0.Y(13, this.K);
        }
        if ((this.y & 2048) == 2048) {
            xs0.W(14, this.L);
        }
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            xs0.Y(100, (k2) this.N.get(i2));
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public final boolean p() {
        if ((this.y & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void q() {
        List list = Collections.EMPTY_LIST;
        this.z = list;
        this.A = false;
        this.B = 0;
        bt5 bt5 = Q;
        this.C = bt5;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = bt5;
        this.J = 0;
        this.K = bt5;
        this.L = 0;
        this.M = 0;
        this.N = list;
    }

    /* renamed from: s */
    public final at5 e() {
        return r(this);
    }

    public bt5() {
        this.O = -1;
        this.P = -1;
        this.x = bg0.w;
    }

    public bt5(at5 at5) {
        super(at5);
        this.O = -1;
        this.P = -1;
        this.x = at5.w;
    }
}
