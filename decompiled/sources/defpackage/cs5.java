package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: cs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cs5 extends zu2 {
    public static final cs5 F;
    public static final fp3 G = new fp3(12);
    public hs5 A;
    public bs5 B;
    public zr5 C;
    public byte D;
    public int E;
    public final bg0 w;
    public int x;
    public as5 y;
    public List z;

    static {
        cs5 cs5 = new cs5();
        F = cs5;
        cs5.y = as5.x;
        cs5.z = Collections.EMPTY_LIST;
        cs5.A = hs5.H;
        cs5.B = bs5.x;
        cs5.C = zr5.x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: as5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: fs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: bs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: zr5} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r10v21 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r10v23 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    public cs5(ts0 ts0, y92 y92) {
        this.D = -1;
        this.E = -1;
        as5 as5 = as5.x;
        this.y = as5;
        this.z = Collections.EMPTY_LIST;
        this.A = hs5.H;
        bs5 bs5 = bs5.x;
        this.B = bs5;
        zr5 zr5 = zr5.x;
        this.C = zr5;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    ? r10 = 0;
                    if (o == 8) {
                        int l = ts0.l();
                        if (l == 0) {
                            r10 = as5;
                        } else if (l == 1) {
                            r10 = as5.y;
                        } else if (l == 2) {
                            r10 = as5.z;
                        } else if (l == 3) {
                            r10 = as5.A;
                        }
                        if (r10 == 0) {
                            G2.f0(o);
                            G2.f0(l);
                        } else {
                            this.x |= 1;
                            this.y = r10;
                        }
                    } else if (o == 18) {
                        if (!(z3 & true)) {
                            this.z = new ArrayList();
                            z3 = true;
                        }
                        this.z.add(ts0.h(hs5.I, y92));
                    } else if (o == 26) {
                        if ((this.x & 2) == 2) {
                            hs5 hs5 = this.A;
                            hs5.getClass();
                            fs5 g = fs5.g();
                            g.h(hs5);
                            r10 = g;
                        }
                        hs5 hs52 = (hs5) ts0.h(hs5.I, y92);
                        this.A = hs52;
                        if (r10 != 0) {
                            r10.h(hs52);
                            this.A = r10.f();
                        }
                        this.x |= 2;
                    } else if (o == 32) {
                        int l2 = ts0.l();
                        if (l2 == 0) {
                            r10 = bs5;
                        } else if (l2 == 1) {
                            r10 = bs5.y;
                        } else if (l2 == 2) {
                            r10 = bs5.z;
                        }
                        if (r10 == 0) {
                            G2.f0(o);
                            G2.f0(l2);
                        } else {
                            this.x |= 4;
                            this.B = r10;
                        }
                    } else if (o == 40) {
                        int l3 = ts0.l();
                        if (l3 == 0) {
                            r10 = zr5;
                        } else if (l3 == 1) {
                            r10 = zr5.y;
                        } else if (l3 == 2) {
                            r10 = zr5.z;
                        }
                        if (r10 == 0) {
                            G2.f0(o);
                            G2.f0(l3);
                        } else {
                            this.x |= 8;
                            this.C = r10;
                        }
                    } else if (ts0.r(o, G2)) {
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
                    this.z = Collections.unmodifiableList(this.z);
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
            this.z = Collections.unmodifiableList(this.z);
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
        byte b = this.D;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.z.size(); i++) {
            if (!((hs5) this.z.get(i)).a()) {
                this.D = 0;
                return false;
            }
        }
        if ((this.x & 2) != 2 || this.A.a()) {
            this.D = 1;
            return true;
        }
        this.D = 0;
        return false;
    }

    public final int c() {
        int i;
        int i2 = this.E;
        if (i2 != -1) {
            return i2;
        }
        if ((this.x & 1) == 1) {
            i = xs0.k(1, this.y.w);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            i += xs0.n(2, (k2) this.z.get(i3));
        }
        if ((this.x & 2) == 2) {
            i += xs0.n(3, this.A);
        }
        if ((this.x & 4) == 4) {
            i += xs0.k(4, this.B.w);
        }
        if ((this.x & 8) == 8) {
            i += xs0.k(5, this.C.w);
        }
        int size = this.w.size() + i;
        this.E = size;
        return size;
    }

    public final ru2 d() {
        return jp3.i();
    }

    public final ru2 e() {
        jp3 i = jp3.i();
        i.k(this);
        return i;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.V(1, this.y.w);
        }
        for (int i = 0; i < this.z.size(); i++) {
            xs0.Y(2, (k2) this.z.get(i));
        }
        if ((this.x & 2) == 2) {
            xs0.Y(3, this.A);
        }
        if ((this.x & 4) == 4) {
            xs0.V(4, this.B.w);
        }
        if ((this.x & 8) == 8) {
            xs0.V(5, this.C.w);
        }
        xs0.b0(this.w);
    }

    public cs5() {
        this.D = -1;
        this.E = -1;
        this.w = bg0.w;
    }

    public cs5(jp3 jp3) {
        this.D = -1;
        this.E = -1;
        this.w = jp3.w;
    }
}
