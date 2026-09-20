package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: nr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr5 extends zu2 {
    public static final nr5 L;
    public static final fp3 M = new fp3(7);
    public float A;
    public double B;
    public int C;
    public int D;
    public int E;
    public qr5 F;
    public List G;
    public int H;
    public int I;
    public byte J;
    public int K;
    public final bg0 w;
    public int x;
    public mr5 y;
    public long z;

    static {
        nr5 nr5 = new nr5();
        L = nr5;
        nr5.i();
    }

    public nr5(ts0 ts0, y92 y92) {
        pr5 pr5;
        this.J = -1;
        this.K = -1;
        i();
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                switch (o) {
                    case b85.b:
                        z2 = true;
                        break;
                    case 8:
                        int l = ts0.l();
                        mr5 b = mr5.b(l);
                        if (b != null) {
                            this.x |= 1;
                            this.y = b;
                            break;
                        } else {
                            G2.f0(o);
                            G2.f0(l);
                            break;
                        }
                    case 16:
                        this.x |= 2;
                        long m = ts0.m();
                        this.z = (-(m & 1)) ^ (m >>> 1);
                        break;
                    case 29:
                        this.x |= 4;
                        this.A = Float.intBitsToFloat(ts0.j());
                        break;
                    case 33:
                        this.x |= 8;
                        this.B = Double.longBitsToDouble(ts0.k());
                        break;
                    case 40:
                        this.x |= 16;
                        this.C = ts0.l();
                        break;
                    case h75.h:
                        this.x |= 32;
                        this.D = ts0.l();
                        break;
                    case 56:
                        this.x |= 64;
                        this.E = ts0.l();
                        break;
                    case 66:
                        if ((this.x & 128) == 128) {
                            qr5 qr5 = this.F;
                            qr5.getClass();
                            pr5 = new pr5(0);
                            pr5.z = Collections.EMPTY_LIST;
                            pr5.i(qr5);
                        } else {
                            pr5 = null;
                        }
                        qr5 qr52 = (qr5) ts0.h(qr5.D, y92);
                        this.F = qr52;
                        if (pr5 != null) {
                            pr5.i(qr52);
                            this.F = pr5.f();
                        }
                        this.x |= 128;
                        break;
                    case 74:
                        if (!(z3 & true)) {
                            this.G = new ArrayList();
                            z3 = true;
                        }
                        this.G.add(ts0.h(M, y92));
                        break;
                    case 80:
                        this.x |= 512;
                        this.I = ts0.l();
                        break;
                    case 88:
                        this.x |= 256;
                        this.H = ts0.l();
                        break;
                    default:
                        if (ts0.r(o, G2)) {
                            break;
                        }
                        z2 = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e) {
                e.w = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                try {
                    G2.R();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.w = ag0.l();
                    throw th2;
                }
                this.w = ag0.l();
                throw th;
            }
        }
        if (z3 & true) {
            this.G = Collections.unmodifiableList(this.G);
        }
        try {
            G2.R();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.w = ag0.l();
            throw th3;
        }
        this.w = ag0.l();
    }

    public static lr5 j(nr5 nr5) {
        lr5 g = lr5.g();
        g.h(nr5);
        return g;
    }

    public final boolean a() {
        byte b = this.J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.x & 128) != 128 || this.F.a()) {
            for (int i = 0; i < this.G.size(); i++) {
                if (!((nr5) this.G.get(i)).a()) {
                    this.J = 0;
                    return false;
                }
            }
            this.J = 1;
            return true;
        }
        this.J = 0;
        return false;
    }

    public final int c() {
        int i;
        int i2 = this.K;
        if (i2 != -1) {
            return i2;
        }
        if ((this.x & 1) == 1) {
            i = xs0.k(1, this.y.w);
        } else {
            i = 0;
        }
        if ((this.x & 2) == 2) {
            long j = this.z;
            i += xs0.q((j >> 63) ^ (j << 1)) + xs0.r(2);
        }
        if ((this.x & 4) == 4) {
            i += xs0.r(3) + 4;
        }
        if ((this.x & 8) == 8) {
            i += xs0.r(4) + 8;
        }
        if ((this.x & 16) == 16) {
            i += xs0.l(5, this.C);
        }
        if ((this.x & 32) == 32) {
            i += xs0.l(6, this.D);
        }
        if ((this.x & 64) == 64) {
            i += xs0.l(7, this.E);
        }
        if ((this.x & 128) == 128) {
            i += xs0.n(8, this.F);
        }
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            i += xs0.n(9, (k2) this.G.get(i3));
        }
        if ((this.x & 512) == 512) {
            i += xs0.l(10, this.I);
        }
        if ((this.x & 256) == 256) {
            i += xs0.l(11, this.H);
        }
        int size = this.w.size() + i;
        this.K = size;
        return size;
    }

    public final ru2 d() {
        return lr5.g();
    }

    public final ru2 e() {
        return j(this);
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.V(1, this.y.w);
        }
        if ((this.x & 2) == 2) {
            long j = this.z;
            xs0.h0(2, 0);
            xs0.g0((j >> 63) ^ (j << 1));
        }
        if ((this.x & 4) == 4) {
            float f = this.A;
            xs0.h0(3, 5);
            xs0.d0(Float.floatToRawIntBits(f));
        }
        if ((this.x & 8) == 8) {
            double d = this.B;
            xs0.h0(4, 1);
            xs0.e0(Double.doubleToRawLongBits(d));
        }
        if ((this.x & 16) == 16) {
            xs0.W(5, this.C);
        }
        if ((this.x & 32) == 32) {
            xs0.W(6, this.D);
        }
        if ((this.x & 64) == 64) {
            xs0.W(7, this.E);
        }
        if ((this.x & 128) == 128) {
            xs0.Y(8, this.F);
        }
        for (int i = 0; i < this.G.size(); i++) {
            xs0.Y(9, (k2) this.G.get(i));
        }
        if ((this.x & 512) == 512) {
            xs0.W(10, this.I);
        }
        if ((this.x & 256) == 256) {
            xs0.W(11, this.H);
        }
        xs0.b0(this.w);
    }

    public final void i() {
        this.y = mr5.x;
        this.z = 0;
        this.A = 0.0f;
        this.B = 0.0d;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = qr5.C;
        this.G = Collections.EMPTY_LIST;
        this.H = 0;
        this.I = 0;
    }

    public nr5() {
        this.J = -1;
        this.K = -1;
        this.w = bg0.w;
    }

    public nr5(lr5 lr5) {
        this.J = -1;
        this.K = -1;
        this.w = lr5.w;
    }
}
