package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: wr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wr5 extends wu2 {
    public static final wr5 G;
    public static final fp3 H = new fp3(10);
    public List A;
    public List B;
    public List C;
    public List D;
    public byte E;
    public int F;
    public final bg0 x;
    public int y;
    public int z;

    static {
        wr5 wr5 = new wr5();
        G = wr5;
        wr5.z = 6;
        List list = Collections.EMPTY_LIST;
        wr5.A = list;
        wr5.B = list;
        wr5.C = list;
        wr5.D = list;
    }

    public wr5(ts0 ts0, y92 y92) {
        this.E = -1;
        this.F = -1;
        this.z = 6;
        List list = Collections.EMPTY_LIST;
        this.A = list;
        this.B = list;
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
                    if (o == 8) {
                        this.y |= 1;
                        this.z = ts0.l();
                    } else if (o == 18) {
                        if (!(z3 & true)) {
                            this.A = new ArrayList();
                            z3 |= true;
                        }
                        this.A.add(ts0.h(jt5.K, y92));
                    } else if (o == 26) {
                        if (!(z3 & true)) {
                            this.D = new ArrayList();
                            z3 |= true;
                        }
                        this.D.add(ts0.h(qr5.D, y92));
                    } else if (o == 248) {
                        if (!(z3 & true)) {
                            this.B = new ArrayList();
                            z3 |= true;
                        }
                        this.B.add(Integer.valueOf(ts0.l()));
                    } else if (o == 250) {
                        int e = ts0.e(ts0.l());
                        if (!(z3 & true) && ts0.c() > 0) {
                            this.B = new ArrayList();
                            z3 |= true;
                        }
                        while (ts0.c() > 0) {
                            this.B.add(Integer.valueOf(ts0.l()));
                        }
                        ts0.d(e);
                    } else if (o == 258) {
                        if (!(z3 & true)) {
                            this.C = new ArrayList();
                            z3 |= true;
                        }
                        this.C.add(ts0.h(ur5.D, y92));
                    } else if (n(ts0, G2, y92, o)) {
                    }
                }
                z2 = true;
            } catch (InvalidProtocolBufferException e2) {
                e2.w = this;
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if (z3 & true) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if (z3 & true) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (z3 & true) {
                    this.C = Collections.unmodifiableList(this.C);
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
            this.A = Collections.unmodifiableList(this.A);
        }
        if (z3 & true) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if (z3 & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if (z3 & true) {
            this.C = Collections.unmodifiableList(this.C);
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
        for (int i = 0; i < this.A.size(); i++) {
            if (!((jt5) this.A.get(i)).a()) {
                this.E = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            if (!((ur5) this.C.get(i2)).a()) {
                this.E = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            if (!((qr5) this.D.get(i3)).a()) {
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
    }

    public final k2 b() {
        return G;
    }

    public final int c() {
        int i;
        List list;
        int i2 = this.F;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == 1) {
            i = xs0.l(1, this.z);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            i += xs0.n(2, (k2) this.A.get(i3));
        }
        for (int i4 = 0; i4 < this.D.size(); i4++) {
            i += xs0.n(3, (k2) this.D.get(i4));
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = this.B.size();
            list = this.B;
            if (i5 >= size) {
                break;
            }
            i6 += xs0.m(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int size2 = (list.size() * 2) + i + i6;
        for (int i7 = 0; i7 < this.C.size(); i7++) {
            size2 += xs0.n(32, (k2) this.C.get(i7));
        }
        int size3 = this.x.size() + j() + size2;
        this.F = size3;
        return size3;
    }

    public final ru2 d() {
        return vr5.h();
    }

    public final ru2 e() {
        vr5 h = vr5.h();
        h.i(this);
        return h;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 1) == 1) {
            xs0.W(1, this.z);
        }
        for (int i = 0; i < this.A.size(); i++) {
            xs0.Y(2, (k2) this.A.get(i));
        }
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            xs0.Y(3, (k2) this.D.get(i2));
        }
        for (int i3 = 0; i3 < this.B.size(); i3++) {
            xs0.W(31, ((Integer) this.B.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.C.size(); i4++) {
            xs0.Y(32, (k2) this.C.get(i4));
        }
        jz0.b0(19000, xs0);
        xs0.b0(this.x);
    }

    public wr5() {
        this.E = -1;
        this.F = -1;
        this.x = bg0.w;
    }

    public wr5(vr5 vr5) {
        super(vr5);
        this.E = -1;
        this.F = -1;
        this.x = vr5.w;
    }
}
