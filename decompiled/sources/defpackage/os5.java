package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: os5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class os5 extends wu2 {
    public static final os5 G;
    public static final fp3 H = new fp3(17);
    public us5 A;
    public ns5 B;
    public List C;
    public List D;
    public byte E;
    public int F;
    public final bg0 x;
    public int y;
    public ws5 z;

    static {
        os5 os5 = new os5();
        G = os5;
        os5.z = ws5.A;
        os5.A = us5.A;
        os5.B = ns5.G;
        List list = Collections.EMPTY_LIST;
        os5.C = list;
        os5.D = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: xr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: xr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: ms5} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public os5(ts0 ts0, y92 y92) {
        this.E = -1;
        this.F = -1;
        this.z = ws5.A;
        this.A = us5.A;
        this.B = ns5.G;
        List list = Collections.EMPTY_LIST;
        this.C = list;
        this.D = list;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    ? r9 = 0;
                    if (o == 10) {
                        if ((this.y & 1) == 1) {
                            ws5 ws5 = this.z;
                            ws5.getClass();
                            xr5 xr5 = new xr5(3);
                            xr5.z = c44.x;
                            xr5.l(ws5);
                            r9 = xr5;
                        }
                        ws5 ws52 = (ws5) ts0.h(ws5.B, y92);
                        this.z = ws52;
                        if (r9 != 0) {
                            r9.l(ws52);
                            this.z = r9.h();
                        }
                        this.y |= 1;
                    } else if (o == 18) {
                        if ((this.y & 2) == 2) {
                            us5 us5 = this.A;
                            us5.getClass();
                            xr5 xr52 = new xr5(1);
                            xr52.z = Collections.EMPTY_LIST;
                            xr52.k(us5);
                            r9 = xr52;
                        }
                        us5 us52 = (us5) ts0.h(us5.B, y92);
                        this.A = us52;
                        if (r9 != 0) {
                            r9.k(us52);
                            this.A = r9.g();
                        }
                        this.y |= 2;
                    } else if (o == 26) {
                        if ((this.y & 4) == 4) {
                            ns5 ns5 = this.B;
                            ns5.getClass();
                            ms5 i = ms5.i();
                            i.k(ns5);
                            r9 = i;
                        }
                        ns5 ns52 = (ns5) ts0.h(ns5.H, y92);
                        this.B = ns52;
                        if (r9 != 0) {
                            r9.k(ns52);
                            this.B = r9.g();
                        }
                        this.y |= 4;
                    } else if (o == 34) {
                        if (!(z3 & true)) {
                            this.C = new ArrayList();
                            z3 |= true;
                        }
                        this.C.add(ts0.h(tr5.d0, y92));
                    } else if (o == 42) {
                        if (!(z3 & true)) {
                            this.D = new ArrayList();
                            z3 |= true;
                        }
                        this.D.add(ts0.h(qr5.D, y92));
                    } else if (n(ts0, G2, y92, o)) {
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
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (z3 & true) {
                    this.D = Collections.unmodifiableList(this.D);
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
            this.C = Collections.unmodifiableList(this.C);
        }
        if (z3 & true) {
            this.D = Collections.unmodifiableList(this.D);
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
        if ((this.y & 2) == 2 && !this.A.a()) {
            this.E = 0;
            return false;
        } else if ((this.y & 4) != 4 || this.B.a()) {
            for (int i = 0; i < this.C.size(); i++) {
                if (!((tr5) this.C.get(i)).a()) {
                    this.E = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                if (!((qr5) this.D.get(i2)).a()) {
                    this.E = 0;
                    return false;
                }
            }
            if (!i()) {
                this.E = 0;
                return false;
            }
            this.E = 1;
            return true;
        } else {
            this.E = 0;
            return false;
        }
    }

    public final k2 b() {
        return G;
    }

    public final int c() {
        int i;
        int i2 = this.F;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == 1) {
            i = xs0.n(1, this.z);
        } else {
            i = 0;
        }
        if ((this.y & 2) == 2) {
            i += xs0.n(2, this.A);
        }
        if ((this.y & 4) == 4) {
            i += xs0.n(3, this.B);
        }
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            i += xs0.n(4, (k2) this.C.get(i3));
        }
        for (int i4 = 0; i4 < this.D.size(); i4++) {
            i += xs0.n(5, (k2) this.D.get(i4));
        }
        int size = this.x.size() + j() + i;
        this.F = size;
        return size;
    }

    public final ru2 d() {
        return ms5.j();
    }

    public final ru2 e() {
        ms5 j = ms5.j();
        j.l(this);
        return j;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 1) == 1) {
            xs0.Y(1, this.z);
        }
        if ((this.y & 2) == 2) {
            xs0.Y(2, this.A);
        }
        if ((this.y & 4) == 4) {
            xs0.Y(3, this.B);
        }
        for (int i = 0; i < this.C.size(); i++) {
            xs0.Y(4, (k2) this.C.get(i));
        }
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            xs0.Y(5, (k2) this.D.get(i2));
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public os5() {
        this.E = -1;
        this.F = -1;
        this.x = bg0.w;
    }

    public os5(ms5 ms5) {
        super(ms5);
        this.E = -1;
        this.F = -1;
        this.x = ms5.w;
    }
}
