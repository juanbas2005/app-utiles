package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: hs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hs5 extends zu2 {
    public static final hs5 H;
    public static final fp3 I = new fp3(14);
    public gs5 A;
    public bt5 B;
    public int C;
    public List D;
    public List E;
    public byte F;
    public int G;
    public final bg0 w;
    public int x;
    public int y;
    public int z;

    static {
        hs5 hs5 = new hs5();
        H = hs5;
        hs5.y = 0;
        hs5.z = 0;
        hs5.A = gs5.x;
        hs5.B = bt5.Q;
        hs5.C = 0;
        List list = Collections.EMPTY_LIST;
        hs5.D = list;
        hs5.E = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: gs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: gs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: gs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: gs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: gs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: gs5} */
    /* JADX WARNING: type inference failed for: r16v5, types: [at5] */
    /* JADX WARNING: Multi-variable type inference failed */
    public hs5(ts0 ts0, y92 y92) {
        gs5 gs5;
        ts0 ts02 = ts0;
        y92 y922 = y92;
        this.F = -1;
        this.G = -1;
        boolean z2 = false;
        this.y = 0;
        this.z = 0;
        gs5 gs52 = gs5.x;
        this.A = gs52;
        this.B = bt5.Q;
        this.C = 0;
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = list;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts02.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = ts02.l();
                    } else if (o != 16) {
                        gs5 gs53 = null;
                        if (o == 24) {
                            int l = ts02.l();
                            if (l != 0) {
                                if (l == 1) {
                                    gs53 = gs5.y;
                                } else if (l == 2) {
                                    gs53 = gs5.z;
                                }
                                gs5 = gs53;
                            } else {
                                gs5 = gs52;
                            }
                            if (gs5 == null) {
                                G2.f0(o);
                                G2.f0(l);
                            } else {
                                this.x |= 4;
                                this.A = gs5;
                            }
                        } else if (o == 34) {
                            if ((this.x & 8) == 8) {
                                bt5 bt5 = this.B;
                                bt5.getClass();
                                gs53 = bt5.r(bt5);
                            }
                            at5 at5 = gs53;
                            bt5 bt52 = (bt5) ts02.h(bt5.R, y922);
                            this.B = bt52;
                            if (at5 != null) {
                                at5.i(bt52);
                                this.B = at5.g();
                            }
                            this.x |= 8;
                        } else if (o != 40) {
                            fp3 fp3 = I;
                            if (o == 50) {
                                if (!(z3 & true)) {
                                    this.D = new ArrayList();
                                    z3 |= true;
                                }
                                this.D.add(ts02.h(fp3, y922));
                            } else if (o == 58) {
                                if (!(z3 & true)) {
                                    this.E = new ArrayList();
                                    z3 |= true;
                                }
                                this.E.add(ts02.h(fp3, y922));
                            } else if (ts02.r(o, G2)) {
                            }
                        } else {
                            this.x |= 16;
                            this.C = ts02.l();
                        }
                    } else {
                        this.x |= 2;
                        this.z = ts02.l();
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
                    this.D = Collections.unmodifiableList(this.D);
                }
                if (z3 & true) {
                    this.E = Collections.unmodifiableList(this.E);
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
            this.D = Collections.unmodifiableList(this.D);
        }
        if (z3 & true) {
            this.E = Collections.unmodifiableList(this.E);
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

    public final boolean a() {
        byte b = this.F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.x & 8) != 8 || this.B.a()) {
            for (int i = 0; i < this.D.size(); i++) {
                if (!((hs5) this.D.get(i)).a()) {
                    this.F = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                if (!((hs5) this.E.get(i2)).a()) {
                    this.F = 0;
                    return false;
                }
            }
            this.F = 1;
            return true;
        }
        this.F = 0;
        return false;
    }

    public final int c() {
        int i;
        int i2 = this.G;
        if (i2 != -1) {
            return i2;
        }
        if ((this.x & 1) == 1) {
            i = xs0.l(1, this.y);
        } else {
            i = 0;
        }
        if ((this.x & 2) == 2) {
            i += xs0.l(2, this.z);
        }
        if ((this.x & 4) == 4) {
            i += xs0.k(3, this.A.w);
        }
        if ((this.x & 8) == 8) {
            i += xs0.n(4, this.B);
        }
        if ((this.x & 16) == 16) {
            i += xs0.l(5, this.C);
        }
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            i += xs0.n(6, (k2) this.D.get(i3));
        }
        for (int i4 = 0; i4 < this.E.size(); i4++) {
            i += xs0.n(7, (k2) this.E.get(i4));
        }
        int size = this.w.size() + i;
        this.G = size;
        return size;
    }

    public final ru2 d() {
        return fs5.g();
    }

    public final ru2 e() {
        fs5 g = fs5.g();
        g.h(this);
        return g;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        if ((this.x & 2) == 2) {
            xs0.W(2, this.z);
        }
        if ((this.x & 4) == 4) {
            xs0.V(3, this.A.w);
        }
        if ((this.x & 8) == 8) {
            xs0.Y(4, this.B);
        }
        if ((this.x & 16) == 16) {
            xs0.W(5, this.C);
        }
        for (int i = 0; i < this.D.size(); i++) {
            xs0.Y(6, (k2) this.D.get(i));
        }
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            xs0.Y(7, (k2) this.E.get(i2));
        }
        xs0.b0(this.w);
    }

    public hs5() {
        this.F = -1;
        this.G = -1;
        this.w = bg0.w;
    }

    public hs5(fs5 fs5) {
        this.F = -1;
        this.G = -1;
        this.w = fs5.w;
    }
}
