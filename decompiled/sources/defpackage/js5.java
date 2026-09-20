package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: js5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class js5 extends wu2 {
    public static final js5 U;
    public static final fp3 V = new fp3(15);
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
    public List L;
    public ht5 M;
    public List N;
    public yr5 O;
    public List P;
    public List Q;
    public List R;
    public byte S;
    public int T;
    public final bg0 x;
    public int y;
    public int z;

    static {
        js5 js5 = new js5();
        U = js5;
        js5.p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v54, resolved type: pr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: at5} */
    /* JADX WARNING: type inference failed for: r18v6, types: [pr5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0360  */
    public js5(ts0 ts0, y92 y92) {
        boolean z2;
        xr5 xr5;
        ts0 ts02 = ts0;
        y92 y922 = y92;
        this.J = -1;
        this.S = -1;
        this.T = -1;
        p();
        ag0 ag0 = new ag0();
        boolean z3 = true;
        xs0 G2 = xs0.G(ag0, 1);
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = z3;
            if (!z4) {
                try {
                    int o = ts02.o();
                    at5 at5 = null;
                    switch (o) {
                        case b85.b:
                            z4 = z6;
                            break;
                        case 8:
                            this.y |= 2;
                            this.A = ts02.l();
                            break;
                        case 16:
                            this.y |= 4;
                            this.B = ts02.l();
                            break;
                        case 26:
                            if ((this.y & 8) == 8) {
                                bt5 bt5 = this.C;
                                bt5.getClass();
                                at5 = bt5.r(bt5);
                            }
                            at5 at52 = at5;
                            bt5 bt52 = (bt5) ts02.h(bt5.R, y922);
                            this.C = bt52;
                            if (at52 != null) {
                                at52.i(bt52);
                                this.C = at52.g();
                            }
                            this.y |= 8;
                            break;
                        case 34:
                            if (!(z5 & true)) {
                                this.E = new ArrayList();
                                z5 |= true;
                            }
                            this.E.add(ts02.h(gt5.K, y922));
                            break;
                        case 42:
                            if ((this.y & 32) == 32) {
                                bt5 bt53 = this.F;
                                bt53.getClass();
                                at5 = bt5.r(bt53);
                            }
                            at5 at53 = at5;
                            bt5 bt54 = (bt5) ts02.h(bt5.R, y922);
                            this.F = bt54;
                            if (at53 != null) {
                                at53.i(bt54);
                                this.F = at53.g();
                            }
                            this.y |= 32;
                            break;
                        case 50:
                            if (!(z5 & true)) {
                                this.L = new ArrayList();
                                z5 |= true;
                            }
                            this.L.add(ts02.h(jt5.K, y922));
                            break;
                        case 56:
                            this.y |= 16;
                            this.D = ts02.l();
                            break;
                        case 64:
                            this.y |= 64;
                            this.G = ts02.l();
                            break;
                        case 72:
                            this.y |= 1;
                            this.z = ts02.l();
                            break;
                        case 82:
                            if (!(z5 & true)) {
                                this.H = new ArrayList();
                                z5 |= true;
                            }
                            this.H.add(ts02.h(bt5.R, y922));
                            break;
                        case 88:
                            if (!(z5 & true)) {
                                this.I = new ArrayList();
                                z5 |= true;
                            }
                            this.I.add(Integer.valueOf(ts02.l()));
                            break;
                        case 90:
                            int e = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.I = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.I.add(Integer.valueOf(ts02.l()));
                            }
                            ts02.d(e);
                            break;
                        case 98:
                            if (!(z5 & true)) {
                                this.Q = new ArrayList();
                                z5 |= true;
                            }
                            this.Q.add(ts02.h(qr5.D, y922));
                            break;
                        case 106:
                            if (!(z5 & true)) {
                                this.K = new ArrayList();
                                z5 |= true;
                            }
                            this.K.add(ts02.h(jt5.K, y922));
                            break;
                        case 242:
                            if ((this.y & 128) == 128) {
                                ht5 ht5 = this.M;
                                ht5.getClass();
                                at5 = ht5.i(ht5);
                            }
                            pr5 pr5 = at5;
                            ht5 ht52 = (ht5) ts02.h(ht5.D, y922);
                            this.M = ht52;
                            if (pr5 != null) {
                                pr5.j(ht52);
                                this.M = pr5.g();
                            }
                            this.y |= 128;
                            break;
                        case 248:
                            if (!(z5 & true)) {
                                this.N = new ArrayList();
                                z5 |= true;
                            }
                            this.N.add(Integer.valueOf(ts02.l()));
                            break;
                        case 250:
                            int e2 = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.N = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.N.add(Integer.valueOf(ts02.l()));
                            }
                            ts02.d(e2);
                            break;
                        case 258:
                            if ((this.y & 256) == 256) {
                                yr5 yr5 = this.O;
                                yr5.getClass();
                                xr5 = new xr5(i);
                                xr5.z = Collections.EMPTY_LIST;
                                xr5.j(yr5);
                            } else {
                                xr5 = null;
                            }
                            yr5 yr52 = (yr5) ts02.h(yr5.B, y922);
                            this.O = yr52;
                            if (xr5 != null) {
                                xr5.j(yr52);
                                this.O = xr5.f();
                            }
                            this.y |= 256;
                            break;
                        case 266:
                            if (!(z5 & true)) {
                                this.P = new ArrayList();
                                z5 |= true;
                            }
                            this.P.add(ts02.h(ur5.D, y922));
                            break;
                        case 274:
                            if (!(z5 & true)) {
                                this.R = new ArrayList();
                                z5 |= true;
                            }
                            z2 = true;
                            try {
                                this.R.add(ts02.h(qr5.D, y922));
                                break;
                            } catch (InvalidProtocolBufferException e3) {
                                e = e3;
                                e.w = this;
                                throw e;
                            } catch (IOException e4) {
                                e = e4;
                                try {
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                    invalidProtocolBufferException.w = this;
                                    throw invalidProtocolBufferException;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if (z5 & true) {
                                    }
                                    if ((z5 & z2) == z2) {
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
                            break;
                        default:
                            if (n(ts02, G2, y922, o)) {
                                break;
                            }
                            z4 = z6;
                            break;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e = e5;
                    e.w = this;
                    throw e;
                } catch (IOException e6) {
                    e = e6;
                    z2 = true;
                    InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                    invalidProtocolBufferException2.w = this;
                    throw invalidProtocolBufferException2;
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
                    if (z5 & true) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (z5 & true) {
                        this.L = Collections.unmodifiableList(this.L);
                    }
                    if (z5 & true) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (z5 & true) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (z5 & true) {
                        this.Q = Collections.unmodifiableList(this.Q);
                    }
                    if (z5 & true) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if (z5 & true) {
                        this.N = Collections.unmodifiableList(this.N);
                    }
                    if (z5 & true) {
                        this.P = Collections.unmodifiableList(this.P);
                    }
                    if ((z5 & z2) == z2) {
                        this.R = Collections.unmodifiableList(this.R);
                    }
                    G2.R();
                    this.x = ag0.l();
                    m();
                    throw th;
                }
            } else {
                if (z5 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (z5 & true) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if (z5 & true) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if (z5 & true) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (z5 & true) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (z5 & true) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                if (z5 & true) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                if (z5 & true) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (z5 & true) {
                    this.R = Collections.unmodifiableList(this.R);
                }
                try {
                    G2.R();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.x = ag0.l();
                    throw th4;
                }
                this.x = ag0.l();
                m();
                return;
            }
            z3 = z6;
            i = 0;
        }
    }

    public final boolean a() {
        byte b = this.S;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.y;
        if ((i & 4) != 4) {
            this.S = 0;
            return false;
        } else if ((i & 8) != 8 || this.C.a()) {
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                if (!((gt5) this.E.get(i2)).a()) {
                    this.S = 0;
                    return false;
                }
            }
            if ((this.y & 32) != 32 || this.F.a()) {
                for (int i3 = 0; i3 < this.H.size(); i3++) {
                    if (!((bt5) this.H.get(i3)).a()) {
                        this.S = 0;
                        return false;
                    }
                }
                for (int i4 = 0; i4 < this.K.size(); i4++) {
                    if (!((jt5) this.K.get(i4)).a()) {
                        this.S = 0;
                        return false;
                    }
                }
                for (int i5 = 0; i5 < this.L.size(); i5++) {
                    if (!((jt5) this.L.get(i5)).a()) {
                        this.S = 0;
                        return false;
                    }
                }
                if ((this.y & 128) == 128 && !this.M.a()) {
                    this.S = 0;
                    return false;
                } else if ((this.y & 256) != 256 || this.O.a()) {
                    for (int i6 = 0; i6 < this.P.size(); i6++) {
                        if (!((ur5) this.P.get(i6)).a()) {
                            this.S = 0;
                            return false;
                        }
                    }
                    for (int i7 = 0; i7 < this.Q.size(); i7++) {
                        if (!((qr5) this.Q.get(i7)).a()) {
                            this.S = 0;
                            return false;
                        }
                    }
                    for (int i8 = 0; i8 < this.R.size(); i8++) {
                        if (!((qr5) this.R.get(i8)).a()) {
                            this.S = 0;
                            return false;
                        }
                    }
                    if (!i()) {
                        this.S = 0;
                        return false;
                    }
                    this.S = 1;
                    return true;
                } else {
                    this.S = 0;
                    return false;
                }
            } else {
                this.S = 0;
                return false;
            }
        } else {
            this.S = 0;
            return false;
        }
    }

    public final k2 b() {
        return U;
    }

    public final int c() {
        int i;
        List list;
        List list2;
        int i2 = this.T;
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
        for (int i4 = 0; i4 < this.L.size(); i4++) {
            i += xs0.n(6, (k2) this.L.get(i4));
        }
        if ((this.y & 16) == 16) {
            i += xs0.l(7, this.D);
        }
        if ((this.y & 64) == 64) {
            i += xs0.l(8, this.G);
        }
        if ((this.y & 1) == 1) {
            i += xs0.l(9, this.z);
        }
        for (int i5 = 0; i5 < this.H.size(); i5++) {
            i += xs0.n(10, (k2) this.H.get(i5));
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int size = this.I.size();
            list = this.I;
            if (i6 >= size) {
                break;
            }
            i7 += xs0.m(((Integer) list.get(i6)).intValue());
            i6++;
        }
        int i8 = i + i7;
        if (!list.isEmpty()) {
            i8 = i8 + 1 + xs0.m(i7);
        }
        this.J = i7;
        for (int i9 = 0; i9 < this.Q.size(); i9++) {
            i8 += xs0.n(12, (k2) this.Q.get(i9));
        }
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            i8 += xs0.n(13, (k2) this.K.get(i10));
        }
        if ((this.y & 128) == 128) {
            i8 += xs0.n(30, this.M);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size2 = this.N.size();
            list2 = this.N;
            if (i11 >= size2) {
                break;
            }
            i12 += xs0.m(((Integer) list2.get(i11)).intValue());
            i11++;
        }
        int size3 = (list2.size() * 2) + i8 + i12;
        if ((this.y & 256) == 256) {
            size3 += xs0.n(32, this.O);
        }
        for (int i13 = 0; i13 < this.P.size(); i13++) {
            size3 += xs0.n(33, (k2) this.P.get(i13));
        }
        for (int i14 = 0; i14 < this.R.size(); i14++) {
            size3 += xs0.n(34, (k2) this.R.get(i14));
        }
        int size4 = this.x.size() + j() + size3;
        this.T = size4;
        return size4;
    }

    public final ru2 d() {
        return is5.h();
    }

    public final ru2 e() {
        is5 h = is5.h();
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
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            xs0.Y(6, (k2) this.L.get(i2));
        }
        if ((this.y & 16) == 16) {
            xs0.W(7, this.D);
        }
        if ((this.y & 64) == 64) {
            xs0.W(8, this.G);
        }
        if ((this.y & 1) == 1) {
            xs0.W(9, this.z);
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            xs0.Y(10, (k2) this.H.get(i3));
        }
        if (this.I.size() > 0) {
            xs0.f0(90);
            xs0.f0(this.J);
        }
        for (int i4 = 0; i4 < this.I.size(); i4++) {
            xs0.X(((Integer) this.I.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.Q.size(); i5++) {
            xs0.Y(12, (k2) this.Q.get(i5));
        }
        for (int i6 = 0; i6 < this.K.size(); i6++) {
            xs0.Y(13, (k2) this.K.get(i6));
        }
        if ((this.y & 128) == 128) {
            xs0.Y(30, this.M);
        }
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            xs0.W(31, ((Integer) this.N.get(i7)).intValue());
        }
        if ((this.y & 256) == 256) {
            xs0.Y(32, this.O);
        }
        for (int i8 = 0; i8 < this.P.size(); i8++) {
            xs0.Y(33, (k2) this.P.get(i8));
        }
        for (int i9 = 0; i9 < this.R.size(); i9++) {
            xs0.Y(34, (k2) this.R.get(i9));
        }
        jz0.b0(19000, xs0);
        xs0.b0(this.x);
    }

    public final void p() {
        this.z = 6;
        this.A = 6;
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
        this.L = list;
        this.M = ht5.C;
        this.N = list;
        this.O = yr5.A;
        this.P = list;
        this.Q = list;
        this.R = list;
    }

    public js5() {
        this.J = -1;
        this.S = -1;
        this.T = -1;
        this.x = bg0.w;
    }

    public js5(is5 is5) {
        super(is5);
        this.J = -1;
        this.S = -1;
        this.T = -1;
        this.x = is5.w;
    }
}
