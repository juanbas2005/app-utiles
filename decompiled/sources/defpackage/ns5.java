package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ns5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns5 extends wu2 {
    public static final ns5 G;
    public static final fp3 H = new fp3(16);
    public List A;
    public List B;
    public ht5 C;
    public ot5 D;
    public byte E;
    public int F;
    public final bg0 x;
    public int y;
    public List z;

    static {
        ns5 ns5 = new ns5();
        G = ns5;
        List list = Collections.EMPTY_LIST;
        ns5.z = list;
        ns5.A = list;
        ns5.B = list;
        ns5.C = ht5.C;
        ns5.D = ot5.A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: pr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: xr5} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public ns5(ts0 ts0, y92 y92) {
        this.E = -1;
        this.F = -1;
        List list = Collections.EMPTY_LIST;
        this.z = list;
        this.A = list;
        this.B = list;
        this.C = ht5.C;
        this.D = ot5.A;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 26) {
                        if (!z3 || !true) {
                            this.z = new ArrayList();
                            z3 |= true;
                        }
                        this.z.add(ts0.h(js5.V, y92));
                    } else if (o == 34) {
                        if (!(z3 & true)) {
                            this.A = new ArrayList();
                            z3 |= true;
                        }
                        this.A.add(ts0.h(qs5.b0, y92));
                    } else if (o != 42) {
                        ? r9 = 0;
                        if (o == 242) {
                            if ((this.y & 1) == 1) {
                                ht5 ht5 = this.C;
                                ht5.getClass();
                                r9 = ht5.i(ht5);
                            }
                            ht5 ht52 = (ht5) ts0.h(ht5.D, y92);
                            this.C = ht52;
                            if (r9 != 0) {
                                r9.j(ht52);
                                this.C = r9.g();
                            }
                            this.y |= 1;
                        } else if (o == 258) {
                            if ((this.y & 2) == 2) {
                                ot5 ot5 = this.D;
                                ot5.getClass();
                                xr5 xr5 = new xr5(2);
                                xr5.z = Collections.EMPTY_LIST;
                                xr5.m(ot5);
                                r9 = xr5;
                            }
                            ot5 ot52 = (ot5) ts0.h(ot5.B, y92);
                            this.D = ot52;
                            if (r9 != 0) {
                                r9.m(ot52);
                                this.D = r9.i();
                            }
                            this.y |= 2;
                        } else if (n(ts0, G2, y92, o)) {
                        }
                    } else {
                        if (!(z3 & true)) {
                            this.B = new ArrayList();
                            z3 |= true;
                        }
                        this.B.add(ts0.h(dt5.M, y92));
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
                if (z3 && true) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if (z3 & true) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if (z3 & true) {
                    this.B = Collections.unmodifiableList(this.B);
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
        if (z3 && true) {
            this.z = Collections.unmodifiableList(this.z);
        }
        if (z3 & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if (z3 & true) {
            this.B = Collections.unmodifiableList(this.B);
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
        byte b = this.E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.z.size(); i++) {
            if (!((js5) this.z.get(i)).a()) {
                this.E = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            if (!((qs5) this.A.get(i2)).a()) {
                this.E = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.B.size(); i3++) {
            if (!((dt5) this.B.get(i3)).a()) {
                this.E = 0;
                return false;
            }
        }
        if ((this.y & 1) == 1 && !this.C.a()) {
            this.E = 0;
            return false;
        } else if (!i()) {
            this.E = 0;
            return false;
        } else {
            this.E = 1;
            return true;
        }
    }

    public final k2 b() {
        return G;
    }

    public final int c() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            i2 += xs0.n(3, (k2) this.z.get(i3));
        }
        for (int i4 = 0; i4 < this.A.size(); i4++) {
            i2 += xs0.n(4, (k2) this.A.get(i4));
        }
        for (int i5 = 0; i5 < this.B.size(); i5++) {
            i2 += xs0.n(5, (k2) this.B.get(i5));
        }
        if ((this.y & 1) == 1) {
            i2 += xs0.n(30, this.C);
        }
        if ((this.y & 2) == 2) {
            i2 += xs0.n(32, this.D);
        }
        int size = this.x.size() + j() + i2;
        this.F = size;
        return size;
    }

    public final ru2 d() {
        return ms5.i();
    }

    public final ru2 e() {
        ms5 i = ms5.i();
        i.k(this);
        return i;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        for (int i = 0; i < this.z.size(); i++) {
            xs0.Y(3, (k2) this.z.get(i));
        }
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            xs0.Y(4, (k2) this.A.get(i2));
        }
        for (int i3 = 0; i3 < this.B.size(); i3++) {
            xs0.Y(5, (k2) this.B.get(i3));
        }
        if ((this.y & 1) == 1) {
            xs0.Y(30, this.C);
        }
        if ((this.y & 2) == 2) {
            xs0.Y(32, this.D);
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public ns5() {
        this.E = -1;
        this.F = -1;
        this.x = bg0.w;
    }

    public ns5(ms5 ms5) {
        super(ms5);
        this.E = -1;
        this.F = -1;
        this.x = ms5.w;
    }
}
