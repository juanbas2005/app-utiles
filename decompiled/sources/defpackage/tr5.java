package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: tr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tr5 extends wu2 {
    public static final tr5 c0;
    public static final fp3 d0 = new fp3(8);
    public int A;
    public int B;
    public List C;
    public List D;
    public List E;
    public int F;
    public List G;
    public int H;
    public List I;
    public List J;
    public int K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public List Q;
    public int R;
    public int S;
    public bt5 T;
    public int U;
    public List V;
    public ht5 W;
    public List X;
    public ot5 Y;
    public List Z;
    public byte a0;
    public int b0;
    public final bg0 x;
    public int y;
    public int z;

    static {
        tr5 tr5 = new tr5();
        c0 = tr5;
        tr5.p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: pr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v77, resolved type: xr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: at5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: at5} */
    /* JADX WARNING: type inference failed for: r19v4, types: [pr5] */
    /* JADX WARNING: type inference failed for: r19v7, types: [xr5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04d3  */
    public tr5(ts0 ts0, y92 y92) {
        boolean z2;
        ts0 ts02 = ts0;
        y92 y922 = y92;
        this.F = -1;
        this.H = -1;
        this.K = -1;
        this.R = -1;
        this.a0 = -1;
        this.b0 = -1;
        p();
        ag0 p = bg0.p();
        boolean z3 = true;
        xs0 G2 = xs0.G(p, 1);
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
                            this.y |= 1;
                            this.z = ts02.g();
                            break;
                        case 16:
                            if (!(z5 & true)) {
                                this.E = new ArrayList();
                                z5 |= true;
                            }
                            this.E.add(Integer.valueOf(ts02.g()));
                            break;
                        case 18:
                            int e = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.E = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.E.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e);
                            break;
                        case 24:
                            this.y |= 2;
                            this.A = ts02.g();
                            break;
                        case 32:
                            this.y |= 4;
                            this.B = ts02.g();
                            break;
                        case 42:
                            if (!(z5 & true)) {
                                this.C = new ArrayList();
                                z5 |= true;
                            }
                            this.C.add(ts02.h(gt5.K, y922));
                            break;
                        case 50:
                            if (!(z5 & true)) {
                                this.D = new ArrayList();
                                z5 |= true;
                            }
                            this.D.add(ts02.h(bt5.R, y922));
                            break;
                        case 56:
                            if (!(z5 & true)) {
                                this.G = new ArrayList();
                                z5 |= true;
                            }
                            this.G.add(Integer.valueOf(ts02.g()));
                            break;
                        case 58:
                            int e2 = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.G = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.G.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e2);
                            break;
                        case 66:
                            if (!(z5 & true)) {
                                this.L = new ArrayList();
                                z5 |= true;
                            }
                            this.L.add(ts02.h(wr5.H, y922));
                            break;
                        case 74:
                            if (!(z5 & true)) {
                                this.M = new ArrayList();
                                z5 |= true;
                            }
                            this.M.add(ts02.h(js5.V, y922));
                            break;
                        case 82:
                            if (!(z5 & true)) {
                                this.N = new ArrayList();
                                z5 |= true;
                            }
                            this.N.add(ts02.h(qs5.b0, y922));
                            break;
                        case 90:
                            if (!(z5 & true)) {
                                this.O = new ArrayList();
                                z5 |= true;
                            }
                            this.O.add(ts02.h(dt5.M, y922));
                            break;
                        case 106:
                            if (!(z5 & true)) {
                                this.P = new ArrayList();
                                z5 |= true;
                            }
                            this.P.add(ts02.h(es5.E, y922));
                            break;
                        case 128:
                            if (!(z5 & true)) {
                                this.Q = new ArrayList();
                                z5 |= true;
                            }
                            this.Q.add(Integer.valueOf(ts02.g()));
                            break;
                        case 130:
                            int e3 = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.Q = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.Q.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e3);
                            break;
                        case 136:
                            this.y |= 8;
                            this.S = ts02.g();
                            break;
                        case 146:
                            at5 s = (this.y & 16) == 16 ? this.T.e() : at5;
                            bt5 bt5 = (bt5) ts02.h(bt5.R, y922);
                            this.T = bt5;
                            if (s != null) {
                                s.i(bt5);
                                this.T = s.g();
                            }
                            this.y |= 16;
                            break;
                        case 152:
                            this.y |= 32;
                            this.U = ts02.g();
                            break;
                        case 162:
                            if (!(z5 & true)) {
                                this.I = new ArrayList();
                                z5 |= true;
                            }
                            this.I.add(ts02.h(bt5.R, y922));
                            break;
                        case 168:
                            if (!(z5 & true)) {
                                this.J = new ArrayList();
                                z5 |= true;
                            }
                            this.J.add(Integer.valueOf(ts02.g()));
                            break;
                        case 170:
                            int e4 = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.J = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.J.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e4);
                            break;
                        case 202:
                            if (!(z5 & true)) {
                                this.V = new ArrayList();
                                z5 |= true;
                            }
                            this.V.add(ts02.h(qr5.D, y922));
                            break;
                        case 242:
                            if ((this.y & 64) == 64) {
                                ht5 ht5 = this.W;
                                ht5.getClass();
                                at5 = ht5.i(ht5);
                            }
                            pr5 pr5 = at5;
                            ht5 ht52 = (ht5) ts02.h(ht5.D, y922);
                            this.W = ht52;
                            if (pr5 != null) {
                                pr5.j(ht52);
                                this.W = pr5.g();
                            }
                            this.y |= 64;
                            break;
                        case 248:
                            if (!(z5 & true)) {
                                this.X = new ArrayList();
                                z5 |= true;
                            }
                            this.X.add(Integer.valueOf(ts02.g()));
                            break;
                        case 250:
                            int e5 = ts02.e(ts02.l());
                            if (!(z5 & true) && ts02.c() > 0) {
                                this.X = new ArrayList();
                                z5 |= true;
                            }
                            while (ts02.c() > 0) {
                                this.X.add(Integer.valueOf(ts02.g()));
                            }
                            ts02.d(e5);
                            break;
                        case 258:
                            xr5 i = (this.y & 128) == 128 ? this.Y.i() : at5;
                            ot5 ot5 = (ot5) ts02.h(ot5.B, y922);
                            this.Y = ot5;
                            if (i != null) {
                                i.m(ot5);
                                this.Y = i.i();
                            }
                            this.y |= 128;
                            break;
                        case 266:
                            if (!(z5 & true)) {
                                this.Z = new ArrayList();
                                z5 |= true;
                            }
                            z2 = true;
                            try {
                                this.Z.add(ts02.h(ur5.D, y922));
                                break;
                            } catch (InvalidProtocolBufferException e6) {
                                e = e6;
                                e.a(this);
                                throw e;
                            } catch (IOException e7) {
                                e = e7;
                                try {
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                    invalidProtocolBufferException.a(this);
                                    throw invalidProtocolBufferException;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z5 & true) {
                                        this.E = Collections.unmodifiableList(this.E);
                                    }
                                    if (z5 & true) {
                                        this.C = Collections.unmodifiableList(this.C);
                                    }
                                    if (z5 & true) {
                                        this.D = Collections.unmodifiableList(this.D);
                                    }
                                    if (z5 & true) {
                                        this.G = Collections.unmodifiableList(this.G);
                                    }
                                    if (z5 & true) {
                                        this.L = Collections.unmodifiableList(this.L);
                                    }
                                    if (z5 & true) {
                                        this.M = Collections.unmodifiableList(this.M);
                                    }
                                    if (z5 & true) {
                                        this.N = Collections.unmodifiableList(this.N);
                                    }
                                    if (z5 & true) {
                                        this.O = Collections.unmodifiableList(this.O);
                                    }
                                    if (z5 & true) {
                                        this.P = Collections.unmodifiableList(this.P);
                                    }
                                    if (z5 & true) {
                                        this.Q = Collections.unmodifiableList(this.Q);
                                    }
                                    if (z5 & true) {
                                        this.I = Collections.unmodifiableList(this.I);
                                    }
                                    if (z5 & true) {
                                        this.J = Collections.unmodifiableList(this.J);
                                    }
                                    if (z5 & true) {
                                        this.V = Collections.unmodifiableList(this.V);
                                    }
                                    if (z5 & true) {
                                        this.X = Collections.unmodifiableList(this.X);
                                    }
                                    if ((z5 & z2) == z2) {
                                        this.Z = Collections.unmodifiableList(this.Z);
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
                            }
                        default:
                            if (n(ts02, G2, y922, o)) {
                                break;
                            }
                            z4 = z6;
                            break;
                    }
                } catch (InvalidProtocolBufferException e8) {
                    e = e8;
                    e.a(this);
                    throw e;
                } catch (IOException e9) {
                    e = e9;
                    z2 = true;
                    InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                    invalidProtocolBufferException2.a(this);
                    throw invalidProtocolBufferException2;
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
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
                    G2.x();
                    this.x = p.l();
                    m();
                    throw th;
                }
            } else {
                if (z5 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (z5 & true) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (z5 & true) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if (z5 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if (z5 & true) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if (z5 & true) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if (z5 & true) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                if (z5 & true) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if (z5 & true) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (z5 & true) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (z5 & true) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (z5 & true) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                if (z5 & true) {
                    this.V = Collections.unmodifiableList(this.V);
                }
                if (z5 & true) {
                    this.X = Collections.unmodifiableList(this.X);
                }
                if (z5 & true) {
                    this.Z = Collections.unmodifiableList(this.Z);
                }
                try {
                    G2.x();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.x = p.l();
                    throw th4;
                }
                this.x = p.l();
                m();
                return;
            }
            z3 = z6;
        }
    }

    public final boolean a() {
        byte b = this.a0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.y & 2) == 2) {
            for (int i = 0; i < this.C.size(); i++) {
                if (!((gt5) this.C.get(i)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                if (!((bt5) this.D.get(i2)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.I.size(); i3++) {
                if (!((bt5) this.I.get(i3)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.L.size(); i4++) {
                if (!((wr5) this.L.get(i4)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.M.size(); i5++) {
                if (!((js5) this.M.get(i5)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.N.size(); i6++) {
                if (!((qs5) this.N.get(i6)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                if (!((dt5) this.O.get(i7)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.P.size(); i8++) {
                if (!((es5) this.P.get(i8)).a()) {
                    this.a0 = 0;
                    return false;
                }
            }
            if ((this.y & 16) != 16 || this.T.a()) {
                for (int i9 = 0; i9 < this.V.size(); i9++) {
                    if (!((qr5) this.V.get(i9)).a()) {
                        this.a0 = 0;
                        return false;
                    }
                }
                if ((this.y & 64) != 64 || this.W.a()) {
                    for (int i10 = 0; i10 < this.Z.size(); i10++) {
                        if (!((ur5) this.Z.get(i10)).a()) {
                            this.a0 = 0;
                            return false;
                        }
                    }
                    if (!i()) {
                        this.a0 = 0;
                        return false;
                    }
                    this.a0 = 1;
                    return true;
                }
                this.a0 = 0;
                return false;
            }
            this.a0 = 0;
            return false;
        }
        this.a0 = 0;
        return false;
    }

    public final k2 b() {
        return c0;
    }

    public final int c() {
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        int i2 = this.b0;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == 1) {
            i = xs0.l(1, this.z);
        } else {
            i = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = this.E.size();
            list = this.E;
            if (i3 >= size) {
                break;
            }
            i4 += xs0.m(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int i5 = i + i4;
        if (!list.isEmpty()) {
            i5 = i5 + 1 + xs0.m(i4);
        }
        this.F = i4;
        if ((this.y & 2) == 2) {
            i5 += xs0.l(3, this.A);
        }
        if ((this.y & 4) == 4) {
            i5 += xs0.l(4, this.B);
        }
        for (int i6 = 0; i6 < this.C.size(); i6++) {
            i5 += xs0.n(5, (k2) this.C.get(i6));
        }
        for (int i7 = 0; i7 < this.D.size(); i7++) {
            i5 += xs0.n(6, (k2) this.D.get(i7));
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int size2 = this.G.size();
            list2 = this.G;
            if (i8 >= size2) {
                break;
            }
            i9 += xs0.m(((Integer) list2.get(i8)).intValue());
            i8++;
        }
        int i10 = i5 + i9;
        if (!list2.isEmpty()) {
            i10 = i10 + 1 + xs0.m(i9);
        }
        this.H = i9;
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            i10 += xs0.n(8, (k2) this.L.get(i11));
        }
        for (int i12 = 0; i12 < this.M.size(); i12++) {
            i10 += xs0.n(9, (k2) this.M.get(i12));
        }
        for (int i13 = 0; i13 < this.N.size(); i13++) {
            i10 += xs0.n(10, (k2) this.N.get(i13));
        }
        for (int i14 = 0; i14 < this.O.size(); i14++) {
            i10 += xs0.n(11, (k2) this.O.get(i14));
        }
        for (int i15 = 0; i15 < this.P.size(); i15++) {
            i10 += xs0.n(13, (k2) this.P.get(i15));
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int size3 = this.Q.size();
            list3 = this.Q;
            if (i16 >= size3) {
                break;
            }
            i17 += xs0.m(((Integer) list3.get(i16)).intValue());
            i16++;
        }
        int i18 = i10 + i17;
        if (!list3.isEmpty()) {
            i18 = i18 + 2 + xs0.m(i17);
        }
        this.R = i17;
        if ((this.y & 8) == 8) {
            i18 += xs0.l(17, this.S);
        }
        if ((this.y & 16) == 16) {
            i18 += xs0.n(18, this.T);
        }
        if ((this.y & 32) == 32) {
            i18 += xs0.l(19, this.U);
        }
        for (int i19 = 0; i19 < this.I.size(); i19++) {
            i18 += xs0.n(20, (k2) this.I.get(i19));
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int size4 = this.J.size();
            list4 = this.J;
            if (i20 >= size4) {
                break;
            }
            i21 += xs0.m(((Integer) list4.get(i20)).intValue());
            i20++;
        }
        int i22 = i18 + i21;
        if (!list4.isEmpty()) {
            i22 = i22 + 2 + xs0.m(i21);
        }
        this.K = i21;
        for (int i23 = 0; i23 < this.V.size(); i23++) {
            i22 += xs0.n(25, (k2) this.V.get(i23));
        }
        if ((this.y & 64) == 64) {
            i22 += xs0.n(30, this.W);
        }
        int i24 = 0;
        int i25 = 0;
        while (true) {
            int size5 = this.X.size();
            list5 = this.X;
            if (i24 >= size5) {
                break;
            }
            i25 += xs0.m(((Integer) list5.get(i24)).intValue());
            i24++;
        }
        int size6 = (list5.size() * 2) + i22 + i25;
        if ((this.y & 128) == 128) {
            size6 += xs0.n(32, this.Y);
        }
        for (int i26 = 0; i26 < this.Z.size(); i26++) {
            size6 += xs0.n(33, (k2) this.Z.get(i26));
        }
        int size7 = this.x.size() + j() + size6;
        this.b0 = size7;
        return size7;
    }

    public final ru2 d() {
        return rr5.h();
    }

    public final ru2 e() {
        rr5 h = rr5.h();
        h.i(this);
        return h;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 1) == 1) {
            xs0.W(1, this.z);
        }
        if (this.E.size() > 0) {
            xs0.f0(18);
            xs0.f0(this.F);
        }
        for (int i = 0; i < this.E.size(); i++) {
            xs0.X(((Integer) this.E.get(i)).intValue());
        }
        if ((this.y & 2) == 2) {
            xs0.W(3, this.A);
        }
        if ((this.y & 4) == 4) {
            xs0.W(4, this.B);
        }
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            xs0.Y(5, (k2) this.C.get(i2));
        }
        for (int i3 = 0; i3 < this.D.size(); i3++) {
            xs0.Y(6, (k2) this.D.get(i3));
        }
        if (this.G.size() > 0) {
            xs0.f0(58);
            xs0.f0(this.H);
        }
        for (int i4 = 0; i4 < this.G.size(); i4++) {
            xs0.X(((Integer) this.G.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.L.size(); i5++) {
            xs0.Y(8, (k2) this.L.get(i5));
        }
        for (int i6 = 0; i6 < this.M.size(); i6++) {
            xs0.Y(9, (k2) this.M.get(i6));
        }
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            xs0.Y(10, (k2) this.N.get(i7));
        }
        for (int i8 = 0; i8 < this.O.size(); i8++) {
            xs0.Y(11, (k2) this.O.get(i8));
        }
        for (int i9 = 0; i9 < this.P.size(); i9++) {
            xs0.Y(13, (k2) this.P.get(i9));
        }
        if (this.Q.size() > 0) {
            xs0.f0(130);
            xs0.f0(this.R);
        }
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            xs0.X(((Integer) this.Q.get(i10)).intValue());
        }
        if ((this.y & 8) == 8) {
            xs0.W(17, this.S);
        }
        if ((this.y & 16) == 16) {
            xs0.Y(18, this.T);
        }
        if ((this.y & 32) == 32) {
            xs0.W(19, this.U);
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            xs0.Y(20, (k2) this.I.get(i11));
        }
        if (this.J.size() > 0) {
            xs0.f0(170);
            xs0.f0(this.K);
        }
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            xs0.X(((Integer) this.J.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.V.size(); i13++) {
            xs0.Y(25, (k2) this.V.get(i13));
        }
        if ((this.y & 64) == 64) {
            xs0.Y(30, this.W);
        }
        for (int i14 = 0; i14 < this.X.size(); i14++) {
            xs0.W(31, ((Integer) this.X.get(i14)).intValue());
        }
        if ((this.y & 128) == 128) {
            xs0.Y(32, this.Y);
        }
        for (int i15 = 0; i15 < this.Z.size(); i15++) {
            xs0.Y(33, (k2) this.Z.get(i15));
        }
        jz0.b0(19000, xs0);
        xs0.b0(this.x);
    }

    public final void p() {
        this.z = 6;
        this.A = 0;
        this.B = 0;
        List list = Collections.EMPTY_LIST;
        this.C = list;
        this.D = list;
        this.E = list;
        this.G = list;
        this.I = list;
        this.J = list;
        this.L = list;
        this.M = list;
        this.N = list;
        this.O = list;
        this.P = list;
        this.Q = list;
        this.S = 0;
        this.T = bt5.Q;
        this.U = 0;
        this.V = list;
        this.W = ht5.C;
        this.X = list;
        this.Y = ot5.A;
        this.Z = list;
    }

    public tr5() {
        this.F = -1;
        this.H = -1;
        this.K = -1;
        this.R = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.x = bg0.w;
    }

    public tr5(rr5 rr5) {
        super(rr5);
        this.F = -1;
        this.H = -1;
        this.K = -1;
        this.R = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.x = rr5.w;
    }
}
