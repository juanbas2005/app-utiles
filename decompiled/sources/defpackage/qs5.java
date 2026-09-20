package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: qs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs5 extends wu2 {
    public static final qs5 a0;
    public static final fp3 b0 = new fp3(18);
    public int A;
    public int B;
    public bt5 C;
    public int D;
    public List E;
    public bt5 F;
    public int G;
    public List H;
    public List I;
    public int J;
    public List K;
    public jt5 L;
    public int M;
    public int N;
    public List O;
    public List P;
    public List Q;
    public List R;
    public List S;
    public List T;
    public List U;
    public List V;
    public yr5 W;
    public yr5 X;
    public byte Y;
    public int Z;
    public final bg0 x;
    public int y;
    public int z;

    static {
        qs5 qs5 = new qs5();
        a0 = qs5;
        qs5.p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: it5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: at5} */
    /* JADX WARNING: type inference failed for: r20v6, types: [it5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0442  */
    public qs5(ts0 ts0, y92 y92) {
        xr5 xr5;
        xr5 xr52;
        ts0 ts02 = ts0;
        y92 y922 = y92;
        this.J = -1;
        this.Y = -1;
        this.Z = -1;
        p();
        ag0 p = bg0.p();
        boolean z2 = true;
        xs0 G2 = xs0.G(p, 1);
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean z5 = z2;
            if (!z3) {
                try {
                    int o = ts02.o();
                    at5 at5 = null;
                    switch (o) {
                        case b85.b:
                            z3 = z5;
                            break;
                        case 8:
                            this.y |= 2;
                            this.A = ts02.g();
                            break;
                        case 16:
                            this.y |= 4;
                            this.B = ts02.g();
                            break;
                        case 26:
                            at5 s = (this.y & 8) == 8 ? this.C.e() : at5;
                            bt5 bt5 = (bt5) ts02.h(bt5.R, y922);
                            this.C = bt5;
                            if (s != null) {
                                s.i(bt5);
                                this.C = s.g();
                            }
                            this.y |= 8;
                            break;
                        case 34:
                            if (!(z4 & true)) {
                                this.E = new ArrayList();
                                z4 |= true;
                            }
                            this.E.add(ts02.h(gt5.K, y922));
                            break;
                        case 42:
                            at5 s2 = (this.y & 32) == 32 ? this.F.e() : at5;
                            bt5 bt52 = (bt5) ts02.h(bt5.R, y922);
                            this.F = bt52;
                            if (s2 != null) {
                                s2.i(bt52);
                                this.F = s2.g();
                            }
                            this.y |= 32;
                            break;
                        case 50:
                            it5 p2 = (this.y & 128) == 128 ? this.L.p() : at5;
                            jt5 jt5 = (jt5) ts02.h(jt5.K, y922);
                            this.L = jt5;
                            if (p2 != null) {
                                p2.i(jt5);
                                this.L = p2.g();
                            }
                            this.y |= 128;
                            break;
                        case 56:
                            this.y |= 256;
                            this.M = ts02.g();
                            break;
                        case 64:
                            this.y |= 512;
                            this.N = ts02.g();
                            break;
                        case 72:
                            this.y |= 16;
                            this.D = ts02.g();
                            break;
                        case 80:
                            this.y |= 64;
                            this.G = ts02.g();
                            break;
                        case 88:
                            this.y |= 1;
                            this.z = ts02.g();
                            break;
                        case 98:
                            if (!(z4 & true)) {
                                this.H = new ArrayList();
                                z4 |= true;
                            }
                            this.H.add(ts02.h(bt5.R, y922));
                            break;
                        case 104:
                            if (!(z4 & true)) {
                                this.I = new ArrayList();
                                z4 |= true;
                            }
                            this.I.add(Integer.valueOf(ts02.g()));
                            break;
                        case 106:
                            int e = ts02.e(ts02.l());
                            if (!(z4 & true) && ts02.c() > 0) {
                                this.I = new ArrayList();
                                z4 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.I.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e);
                            break;
                        case 114:
                            if (!(z4 & true)) {
                                this.Q = new ArrayList();
                                z4 |= true;
                            }
                            this.Q.add(ts02.h(qr5.D, y922));
                            break;
                        case 122:
                            if (!(z4 & true)) {
                                this.R = new ArrayList();
                                z4 |= true;
                            }
                            this.R.add(ts02.h(qr5.D, y922));
                            break;
                        case 130:
                            if (!(z4 & true)) {
                                this.S = new ArrayList();
                                z4 |= true;
                            }
                            this.S.add(ts02.h(qr5.D, y922));
                            break;
                        case 138:
                            if (!(z4 & true)) {
                                this.K = new ArrayList();
                                z4 |= true;
                            }
                            this.K.add(ts02.h(jt5.K, y922));
                            break;
                        case 248:
                            if (!(z4 & true)) {
                                this.O = new ArrayList();
                                z4 |= true;
                            }
                            this.O.add(Integer.valueOf(ts02.g()));
                            break;
                        case 250:
                            int e2 = ts02.e(ts02.l());
                            if (!(z4 & true) && ts02.c() > 0) {
                                this.O = new ArrayList();
                                z4 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.O.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e2);
                            break;
                        case 258:
                            if (!(z4 & true)) {
                                this.P = new ArrayList();
                                z4 |= true;
                            }
                            this.P.add(ts02.h(ur5.D, y922));
                            break;
                        case 266:
                            if (!(z4 & true)) {
                                this.T = new ArrayList();
                                z4 |= true;
                            }
                            this.T.add(ts02.h(qr5.D, y922));
                            break;
                        case 274:
                            if (!(z4 & true)) {
                                this.U = new ArrayList();
                                z4 |= true;
                            }
                            this.U.add(ts02.h(qr5.D, y922));
                            break;
                        case 282:
                            if (!(z4 & true)) {
                                this.V = new ArrayList();
                                z4 |= true;
                            }
                            this.V.add(ts02.h(qr5.D, y922));
                            break;
                        case 322:
                            if ((this.y & 1024) == 1024) {
                                yr5 yr5 = this.W;
                                yr5.getClass();
                                xr5 = new xr5(0);
                                xr5.z = Collections.EMPTY_LIST;
                                xr5.j(yr5);
                            } else {
                                xr5 = null;
                            }
                            yr5 yr52 = (yr5) ts02.h(yr5.B, y922);
                            this.W = yr52;
                            if (xr5 != null) {
                                xr5.j(yr52);
                                this.W = xr5.f();
                            }
                            this.y |= 1024;
                            break;
                        case 330:
                            try {
                                if ((this.y & 2048) == 2048) {
                                    try {
                                        yr5 yr53 = this.X;
                                        yr53.getClass();
                                        xr52 = new xr5(0);
                                        xr52.z = Collections.EMPTY_LIST;
                                        xr52.j(yr53);
                                    } catch (InvalidProtocolBufferException e3) {
                                        e = e3;
                                        e.a(this);
                                        throw e;
                                    } catch (IOException e4) {
                                        e = e4;
                                        try {
                                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                            invalidProtocolBufferException.a(this);
                                            throw invalidProtocolBufferException;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (z4 & true) {
                                                this.E = Collections.unmodifiableList(this.E);
                                            }
                                            if (z4 & true) {
                                                this.H = Collections.unmodifiableList(this.H);
                                            }
                                            if (z4 & true) {
                                                this.I = Collections.unmodifiableList(this.I);
                                            }
                                            if (z4 & true) {
                                                this.Q = Collections.unmodifiableList(this.Q);
                                            }
                                            if (z4 & true) {
                                                this.R = Collections.unmodifiableList(this.R);
                                            }
                                            if (z4 & true) {
                                                this.S = Collections.unmodifiableList(this.S);
                                            }
                                            if (z4 & true) {
                                                this.K = Collections.unmodifiableList(this.K);
                                            }
                                            if (z4 & true) {
                                                this.O = Collections.unmodifiableList(this.O);
                                            }
                                            if (z4 & true) {
                                                this.P = Collections.unmodifiableList(this.P);
                                            }
                                            if (z4 & true) {
                                                this.T = Collections.unmodifiableList(this.T);
                                            }
                                            if (z4 & true) {
                                                this.U = Collections.unmodifiableList(this.U);
                                            }
                                            if (z4 & true) {
                                                this.V = Collections.unmodifiableList(this.V);
                                            }
                                            try {
                                                G2.x();
                                            } catch (IOException unused) {
                                            } catch (Throwable th2) {
                                                this.x = p.l();
                                                throw th2;
                                            }
                                            this.x = p.l();
                                            m();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        if (z4 & true) {
                                        }
                                        G2.x();
                                        this.x = p.l();
                                        m();
                                        throw th;
                                    }
                                } else {
                                    xr52 = null;
                                }
                                yr5 yr54 = (yr5) ts02.h(yr5.B, y922);
                                this.X = yr54;
                                if (xr52 != null) {
                                    xr52.j(yr54);
                                    this.X = xr52.f();
                                }
                                this.y |= 2048;
                                break;
                            } catch (InvalidProtocolBufferException e5) {
                                e = e5;
                                e.a(this);
                                throw e;
                            } catch (IOException e6) {
                                e = e6;
                                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException2.a(this);
                                throw invalidProtocolBufferException2;
                            } catch (Throwable th4) {
                                th = th4;
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                if (z4 & true) {
                                }
                                G2.x();
                                this.x = p.l();
                                m();
                                throw th;
                            }
                        default:
                            if (n(ts02, G2, y922, o)) {
                                break;
                            }
                            z3 = z5;
                            break;
                    }
                } catch (InvalidProtocolBufferException e7) {
                    e = e7;
                    e.a(this);
                    throw e;
                } catch (IOException e8) {
                    e = e8;
                    InvalidProtocolBufferException invalidProtocolBufferException22 = new InvalidProtocolBufferException(e.getMessage());
                    invalidProtocolBufferException22.a(this);
                    throw invalidProtocolBufferException22;
                }
            } else {
                if (z4 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (z4 & true) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if (z4 & true) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (z4 & true) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (z4 & true) {
                    this.R = Collections.unmodifiableList(this.R);
                }
                if (z4 & true) {
                    this.S = Collections.unmodifiableList(this.S);
                }
                if (z4 & true) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                if (z4 & true) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if (z4 & true) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (z4 & true) {
                    this.T = Collections.unmodifiableList(this.T);
                }
                if (z4 & true) {
                    this.U = Collections.unmodifiableList(this.U);
                }
                if (z4 & true) {
                    this.V = Collections.unmodifiableList(this.V);
                }
                try {
                    G2.x();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.x = p.l();
                    throw th5;
                }
                this.x = p.l();
                m();
                return;
            }
            z2 = z5;
        }
    }

    public final boolean a() {
        byte b = this.Y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.y;
        if ((i & 4) != 4) {
            this.Y = 0;
            return false;
        } else if ((i & 8) != 8 || this.C.a()) {
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                if (!((gt5) this.E.get(i2)).a()) {
                    this.Y = 0;
                    return false;
                }
            }
            if ((this.y & 32) != 32 || this.F.a()) {
                for (int i3 = 0; i3 < this.H.size(); i3++) {
                    if (!((bt5) this.H.get(i3)).a()) {
                        this.Y = 0;
                        return false;
                    }
                }
                for (int i4 = 0; i4 < this.K.size(); i4++) {
                    if (!((jt5) this.K.get(i4)).a()) {
                        this.Y = 0;
                        return false;
                    }
                }
                if ((this.y & 128) != 128 || this.L.a()) {
                    for (int i5 = 0; i5 < this.P.size(); i5++) {
                        if (!((ur5) this.P.get(i5)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i6 = 0; i6 < this.Q.size(); i6++) {
                        if (!((qr5) this.Q.get(i6)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i7 = 0; i7 < this.R.size(); i7++) {
                        if (!((qr5) this.R.get(i7)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i8 = 0; i8 < this.S.size(); i8++) {
                        if (!((qr5) this.S.get(i8)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i9 = 0; i9 < this.T.size(); i9++) {
                        if (!((qr5) this.T.get(i9)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i10 = 0; i10 < this.U.size(); i10++) {
                        if (!((qr5) this.U.get(i10)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    for (int i11 = 0; i11 < this.V.size(); i11++) {
                        if (!((qr5) this.V.get(i11)).a()) {
                            this.Y = 0;
                            return false;
                        }
                    }
                    if ((this.y & 1024) == 1024 && !this.W.a()) {
                        this.Y = 0;
                        return false;
                    } else if ((this.y & 2048) == 2048 && !this.X.a()) {
                        this.Y = 0;
                        return false;
                    } else if (!i()) {
                        this.Y = 0;
                        return false;
                    } else {
                        this.Y = 1;
                        return true;
                    }
                } else {
                    this.Y = 0;
                    return false;
                }
            } else {
                this.Y = 0;
                return false;
            }
        } else {
            this.Y = 0;
            return false;
        }
    }

    public final k2 b() {
        return a0;
    }

    public final int c() {
        int i;
        List list;
        List list2;
        int i2 = this.Z;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 2) == 2) {
            i = xs0.l(1, this.A);
        } else {
            i = 0;
        }
        if ((this.y & 4) == 4) {
            i += xs0.l(2, this.B);
        }
        if ((this.y & 8) == 8) {
            i += xs0.n(3, this.C);
        }
        for (int i3 = 0; i3 < this.E.size(); i3++) {
            i += xs0.n(4, (k2) this.E.get(i3));
        }
        if ((this.y & 32) == 32) {
            i += xs0.n(5, this.F);
        }
        if ((this.y & 128) == 128) {
            i += xs0.n(6, this.L);
        }
        if ((this.y & 256) == 256) {
            i += xs0.l(7, this.M);
        }
        if ((this.y & 512) == 512) {
            i += xs0.l(8, this.N);
        }
        if ((this.y & 16) == 16) {
            i += xs0.l(9, this.D);
        }
        if ((this.y & 64) == 64) {
            i += xs0.l(10, this.G);
        }
        if ((this.y & 1) == 1) {
            i += xs0.l(11, this.z);
        }
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            i += xs0.n(12, (k2) this.H.get(i4));
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = this.I.size();
            list = this.I;
            if (i5 >= size) {
                break;
            }
            i6 += xs0.m(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int i7 = i + i6;
        if (!list.isEmpty()) {
            i7 = i7 + 1 + xs0.m(i6);
        }
        this.J = i6;
        for (int i8 = 0; i8 < this.Q.size(); i8++) {
            i7 += xs0.n(14, (k2) this.Q.get(i8));
        }
        for (int i9 = 0; i9 < this.R.size(); i9++) {
            i7 += xs0.n(15, (k2) this.R.get(i9));
        }
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            i7 += xs0.n(16, (k2) this.S.get(i10));
        }
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            i7 += xs0.n(17, (k2) this.K.get(i11));
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size2 = this.O.size();
            list2 = this.O;
            if (i12 >= size2) {
                break;
            }
            i13 += xs0.m(((Integer) list2.get(i12)).intValue());
            i12++;
        }
        int size3 = (list2.size() * 2) + i7 + i13;
        for (int i14 = 0; i14 < this.P.size(); i14++) {
            size3 += xs0.n(32, (k2) this.P.get(i14));
        }
        for (int i15 = 0; i15 < this.T.size(); i15++) {
            size3 += xs0.n(33, (k2) this.T.get(i15));
        }
        for (int i16 = 0; i16 < this.U.size(); i16++) {
            size3 += xs0.n(34, (k2) this.U.get(i16));
        }
        for (int i17 = 0; i17 < this.V.size(); i17++) {
            size3 += xs0.n(35, (k2) this.V.get(i17));
        }
        if ((this.y & 1024) == 1024) {
            size3 += xs0.n(40, this.W);
        }
        if ((this.y & 2048) == 2048) {
            size3 += xs0.n(41, this.X);
        }
        int size4 = this.x.size() + j() + size3;
        this.Z = size4;
        return size4;
    }

    public final ru2 d() {
        return ps5.h();
    }

    public final ru2 e() {
        ps5 h = ps5.h();
        h.i(this);
        return h;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 2) == 2) {
            xs0.W(1, this.A);
        }
        if ((this.y & 4) == 4) {
            xs0.W(2, this.B);
        }
        if ((this.y & 8) == 8) {
            xs0.Y(3, this.C);
        }
        for (int i = 0; i < this.E.size(); i++) {
            xs0.Y(4, (k2) this.E.get(i));
        }
        if ((this.y & 32) == 32) {
            xs0.Y(5, this.F);
        }
        if ((this.y & 128) == 128) {
            xs0.Y(6, this.L);
        }
        if ((this.y & 256) == 256) {
            xs0.W(7, this.M);
        }
        if ((this.y & 512) == 512) {
            xs0.W(8, this.N);
        }
        if ((this.y & 16) == 16) {
            xs0.W(9, this.D);
        }
        if ((this.y & 64) == 64) {
            xs0.W(10, this.G);
        }
        if ((this.y & 1) == 1) {
            xs0.W(11, this.z);
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            xs0.Y(12, (k2) this.H.get(i2));
        }
        if (this.I.size() > 0) {
            xs0.f0(106);
            xs0.f0(this.J);
        }
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            xs0.X(((Integer) this.I.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.Q.size(); i4++) {
            xs0.Y(14, (k2) this.Q.get(i4));
        }
        for (int i5 = 0; i5 < this.R.size(); i5++) {
            xs0.Y(15, (k2) this.R.get(i5));
        }
        for (int i6 = 0; i6 < this.S.size(); i6++) {
            xs0.Y(16, (k2) this.S.get(i6));
        }
        for (int i7 = 0; i7 < this.K.size(); i7++) {
            xs0.Y(17, (k2) this.K.get(i7));
        }
        for (int i8 = 0; i8 < this.O.size(); i8++) {
            xs0.W(31, ((Integer) this.O.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.P.size(); i9++) {
            xs0.Y(32, (k2) this.P.get(i9));
        }
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            xs0.Y(33, (k2) this.T.get(i10));
        }
        for (int i11 = 0; i11 < this.U.size(); i11++) {
            xs0.Y(34, (k2) this.U.get(i11));
        }
        for (int i12 = 0; i12 < this.V.size(); i12++) {
            xs0.Y(35, (k2) this.V.get(i12));
        }
        if ((this.y & 1024) == 1024) {
            xs0.Y(40, this.W);
        }
        if ((this.y & 2048) == 2048) {
            xs0.Y(41, this.X);
        }
        jz0.b0(19000, xs0);
        xs0.b0(this.x);
    }

    public final void p() {
        this.z = 518;
        this.A = 2054;
        this.B = 0;
        bt5 bt5 = bt5.Q;
        this.C = bt5;
        this.D = 0;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = bt5;
        this.G = 0;
        this.H = list;
        this.I = list;
        this.K = list;
        this.L = jt5.J;
        this.M = 0;
        this.N = 0;
        this.O = list;
        this.P = list;
        this.Q = list;
        this.R = list;
        this.S = list;
        this.T = list;
        this.U = list;
        this.V = list;
        yr5 yr5 = yr5.A;
        this.W = yr5;
        this.X = yr5;
    }

    public qs5() {
        this.J = -1;
        this.Y = -1;
        this.Z = -1;
        this.x = bg0.w;
    }

    public qs5(ps5 ps5) {
        super(ps5);
        this.J = -1;
        this.Y = -1;
        this.Z = -1;
        this.x = ps5.w;
    }
}
