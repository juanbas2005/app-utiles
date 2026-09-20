package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: jt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt5 extends wu2 {
    public static final jt5 J;
    public static final fp3 K = new fp3(27);
    public int A;
    public bt5 B;
    public int C;
    public bt5 D;
    public int E;
    public List F;
    public nr5 G;
    public byte H;
    public int I;
    public final bg0 x;
    public int y;
    public int z;

    static {
        jt5 jt5 = new jt5();
        J = jt5;
        jt5.z = 0;
        jt5.A = 0;
        bt5 bt5 = bt5.Q;
        jt5.B = bt5;
        jt5.C = 0;
        jt5.D = bt5;
        jt5.E = 0;
        jt5.F = Collections.EMPTY_LIST;
        jt5.G = nr5.L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: lr5} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public jt5(ts0 ts0, y92 y92) {
        this.H = -1;
        this.I = -1;
        boolean z2 = false;
        this.z = 0;
        this.A = 0;
        bt5 bt5 = bt5.Q;
        this.B = bt5;
        this.C = 0;
        this.D = bt5;
        this.E = 0;
        this.F = Collections.EMPTY_LIST;
        this.G = nr5.L;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.z = ts0.l();
                    } else if (o != 16) {
                        ? r10 = 0;
                        if (o == 26) {
                            if ((this.y & 4) == 4) {
                                bt5 bt52 = this.B;
                                bt52.getClass();
                                r10 = bt5.r(bt52);
                            }
                            bt5 bt53 = (bt5) ts0.h(bt5.R, y92);
                            this.B = bt53;
                            if (r10 != 0) {
                                r10.i(bt53);
                                this.B = r10.g();
                            }
                            this.y |= 4;
                        } else if (o == 34) {
                            if ((this.y & 16) == 16) {
                                bt5 bt54 = this.D;
                                bt54.getClass();
                                r10 = bt5.r(bt54);
                            }
                            bt5 bt55 = (bt5) ts0.h(bt5.R, y92);
                            this.D = bt55;
                            if (r10 != 0) {
                                r10.i(bt55);
                                this.D = r10.g();
                            }
                            this.y |= 16;
                        } else if (o == 40) {
                            this.y |= 8;
                            this.C = ts0.l();
                        } else if (o == 48) {
                            this.y |= 32;
                            this.E = ts0.l();
                        } else if (o == 58) {
                            if (!(z3 & true)) {
                                this.F = new ArrayList();
                                z3 = true;
                            }
                            this.F.add(ts0.h(qr5.D, y92));
                        } else if (o == 66) {
                            if ((this.y & 64) == 64) {
                                nr5 nr5 = this.G;
                                nr5.getClass();
                                r10 = nr5.j(nr5);
                            }
                            nr5 nr52 = (nr5) ts0.h(nr5.M, y92);
                            this.G = nr52;
                            if (r10 != 0) {
                                r10.h(nr52);
                                this.G = r10.f();
                            }
                            this.y |= 64;
                        } else if (n(ts0, G2, y92, o)) {
                        }
                    } else {
                        this.y |= 2;
                        this.A = ts0.l();
                    }
                }
                z2 = true;
            } catch (InvalidProtocolBufferException e) {
                e.w = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.F = Collections.unmodifiableList(this.F);
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
            this.F = Collections.unmodifiableList(this.F);
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
        if ((i & 2) != 2) {
            this.H = 0;
            return false;
        } else if ((i & 4) == 4 && !this.B.a()) {
            this.H = 0;
            return false;
        } else if ((this.y & 16) != 16 || this.D.a()) {
            for (int i2 = 0; i2 < this.F.size(); i2++) {
                if (!((qr5) this.F.get(i2)).a()) {
                    this.H = 0;
                    return false;
                }
            }
            if ((this.y & 64) == 64 && !this.G.a()) {
                this.H = 0;
                return false;
            } else if (!i()) {
                this.H = 0;
                return false;
            } else {
                this.H = 1;
                return true;
            }
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
            i += xs0.n(3, this.B);
        }
        if ((this.y & 16) == 16) {
            i += xs0.n(4, this.D);
        }
        if ((this.y & 8) == 8) {
            i += xs0.l(5, this.C);
        }
        if ((this.y & 32) == 32) {
            i += xs0.l(6, this.E);
        }
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            i += xs0.n(7, (k2) this.F.get(i3));
        }
        if ((this.y & 64) == 64) {
            i += xs0.n(8, this.G);
        }
        int size = this.x.size() + j() + i;
        this.I = size;
        return size;
    }

    public final ru2 d() {
        return it5.h();
    }

    public final ru2 e() {
        it5 h = it5.h();
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
            xs0.Y(3, this.B);
        }
        if ((this.y & 16) == 16) {
            xs0.Y(4, this.D);
        }
        if ((this.y & 8) == 8) {
            xs0.W(5, this.C);
        }
        if ((this.y & 32) == 32) {
            xs0.W(6, this.E);
        }
        for (int i = 0; i < this.F.size(); i++) {
            xs0.Y(7, (k2) this.F.get(i));
        }
        if ((this.y & 64) == 64) {
            xs0.Y(8, this.G);
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public final it5 p() {
        it5 h = it5.h();
        h.i(this);
        return h;
    }

    public jt5() {
        this.H = -1;
        this.I = -1;
        this.x = bg0.w;
    }

    public jt5(it5 it5) {
        super(it5);
        this.H = -1;
        this.I = -1;
        this.x = it5.w;
    }
}
