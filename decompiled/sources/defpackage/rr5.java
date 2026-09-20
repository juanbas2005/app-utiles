package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: rr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rr5 extends vu2 {
    public int A;
    public int B;
    public int C;
    public List D;
    public List E;
    public List F;
    public List G;
    public List H;
    public List I;
    public List J;
    public List K;
    public List L;
    public List M;
    public List N;
    public List O;
    public int P;
    public bt5 Q;
    public int R;
    public List S;
    public ht5 T;
    public List U;
    public ot5 V;
    public List W;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, rr5] */
    public static rr5 h() {
        ? vu2 = new vu2();
        vu2.A = 6;
        List list = Collections.EMPTY_LIST;
        vu2.D = list;
        vu2.E = list;
        vu2.F = list;
        vu2.G = list;
        vu2.H = list;
        vu2.I = list;
        vu2.J = list;
        vu2.K = list;
        vu2.L = list;
        vu2.M = list;
        vu2.N = list;
        vu2.O = list;
        vu2.Q = bt5.Q;
        vu2.S = list;
        vu2.T = ht5.C;
        vu2.U = list;
        vu2.V = ot5.A;
        vu2.W = list;
        return vu2;
    }

    public final k2 c() {
        tr5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        rr5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        tr5 tr5;
        tr5 tr52 = null;
        try {
            tr5.d0.getClass();
            i(new tr5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            tr5 = (tr5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            tr52 = tr5;
        }
        if (tr52 != null) {
            i(tr52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((tr5) zu2);
        return this;
    }

    public final tr5 g() {
        tr5 tr5 = new tr5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        tr5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        tr5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        tr5.B = this.C;
        if ((i & 8) == 8) {
            this.D = Collections.unmodifiableList(this.D);
            this.z &= -9;
        }
        tr5.C = this.D;
        if ((this.z & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
            this.z &= -17;
        }
        tr5.D = this.E;
        if ((this.z & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.z &= -33;
        }
        tr5.E = this.F;
        if ((this.z & 64) == 64) {
            this.G = Collections.unmodifiableList(this.G);
            this.z &= -65;
        }
        tr5.G = this.G;
        if ((this.z & 128) == 128) {
            this.H = Collections.unmodifiableList(this.H);
            this.z &= -129;
        }
        tr5.I = this.H;
        if ((this.z & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.z &= -257;
        }
        tr5.J = this.I;
        if ((this.z & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.z &= -513;
        }
        tr5.L = this.J;
        if ((this.z & 1024) == 1024) {
            this.K = Collections.unmodifiableList(this.K);
            this.z &= -1025;
        }
        tr5.M = this.K;
        if ((this.z & 2048) == 2048) {
            this.L = Collections.unmodifiableList(this.L);
            this.z &= -2049;
        }
        tr5.N = this.L;
        if ((this.z & 4096) == 4096) {
            this.M = Collections.unmodifiableList(this.M);
            this.z &= -4097;
        }
        tr5.O = this.M;
        if ((this.z & 8192) == 8192) {
            this.N = Collections.unmodifiableList(this.N);
            this.z &= -8193;
        }
        tr5.P = this.N;
        if ((this.z & 16384) == 16384) {
            this.O = Collections.unmodifiableList(this.O);
            this.z &= -16385;
        }
        tr5.Q = this.O;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        tr5.S = this.P;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        tr5.T = this.Q;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        tr5.U = this.R;
        if ((this.z & 262144) == 262144) {
            this.S = Collections.unmodifiableList(this.S);
            this.z &= -262145;
        }
        tr5.V = this.S;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        tr5.W = this.T;
        if ((this.z & 1048576) == 1048576) {
            this.U = Collections.unmodifiableList(this.U);
            this.z &= -1048577;
        }
        tr5.X = this.U;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        tr5.Y = this.V;
        if ((this.z & 4194304) == 4194304) {
            this.W = Collections.unmodifiableList(this.W);
            this.z &= -4194305;
        }
        tr5.Z = this.W;
        tr5.y = i2;
        return tr5;
    }

    public final void i(tr5 tr5) {
        ot5 ot5;
        ht5 ht5;
        bt5 bt5;
        if (tr5 != tr5.c0) {
            int i = tr5.y;
            if ((i & 1) == 1) {
                int i2 = tr5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = tr5.A;
                this.z |= 2;
                this.B = i3;
            }
            if ((i & 4) == 4) {
                int i4 = tr5.B;
                this.z = 4 | this.z;
                this.C = i4;
            }
            if (!tr5.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = tr5.C;
                    this.z &= -9;
                } else {
                    if ((this.z & 8) != 8) {
                        this.D = new ArrayList(this.D);
                        this.z |= 8;
                    }
                    this.D.addAll(tr5.C);
                }
            }
            if (!tr5.D.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = tr5.D;
                    this.z &= -17;
                } else {
                    if ((this.z & 16) != 16) {
                        this.E = new ArrayList(this.E);
                        this.z |= 16;
                    }
                    this.E.addAll(tr5.D);
                }
            }
            if (!tr5.E.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = tr5.E;
                    this.z &= -33;
                } else {
                    if ((this.z & 32) != 32) {
                        this.F = new ArrayList(this.F);
                        this.z |= 32;
                    }
                    this.F.addAll(tr5.E);
                }
            }
            if (!tr5.G.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = tr5.G;
                    this.z &= -65;
                } else {
                    if ((this.z & 64) != 64) {
                        this.G = new ArrayList(this.G);
                        this.z |= 64;
                    }
                    this.G.addAll(tr5.G);
                }
            }
            if (!tr5.I.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = tr5.I;
                    this.z &= -129;
                } else {
                    if ((this.z & 128) != 128) {
                        this.H = new ArrayList(this.H);
                        this.z |= 128;
                    }
                    this.H.addAll(tr5.I);
                }
            }
            if (!tr5.J.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = tr5.J;
                    this.z &= -257;
                } else {
                    if ((this.z & 256) != 256) {
                        this.I = new ArrayList(this.I);
                        this.z |= 256;
                    }
                    this.I.addAll(tr5.J);
                }
            }
            if (!tr5.L.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = tr5.L;
                    this.z &= -513;
                } else {
                    if ((this.z & 512) != 512) {
                        this.J = new ArrayList(this.J);
                        this.z |= 512;
                    }
                    this.J.addAll(tr5.L);
                }
            }
            if (!tr5.M.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = tr5.M;
                    this.z &= -1025;
                } else {
                    if ((this.z & 1024) != 1024) {
                        this.K = new ArrayList(this.K);
                        this.z |= 1024;
                    }
                    this.K.addAll(tr5.M);
                }
            }
            if (!tr5.N.isEmpty()) {
                if (this.L.isEmpty()) {
                    this.L = tr5.N;
                    this.z &= -2049;
                } else {
                    if ((this.z & 2048) != 2048) {
                        this.L = new ArrayList(this.L);
                        this.z |= 2048;
                    }
                    this.L.addAll(tr5.N);
                }
            }
            if (!tr5.O.isEmpty()) {
                if (this.M.isEmpty()) {
                    this.M = tr5.O;
                    this.z &= -4097;
                } else {
                    if ((this.z & 4096) != 4096) {
                        this.M = new ArrayList(this.M);
                        this.z |= 4096;
                    }
                    this.M.addAll(tr5.O);
                }
            }
            if (!tr5.P.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = tr5.P;
                    this.z &= -8193;
                } else {
                    if ((this.z & 8192) != 8192) {
                        this.N = new ArrayList(this.N);
                        this.z |= 8192;
                    }
                    this.N.addAll(tr5.P);
                }
            }
            if (!tr5.Q.isEmpty()) {
                if (this.O.isEmpty()) {
                    this.O = tr5.Q;
                    this.z &= -16385;
                } else {
                    if ((this.z & 16384) != 16384) {
                        this.O = new ArrayList(this.O);
                        this.z |= 16384;
                    }
                    this.O.addAll(tr5.Q);
                }
            }
            int i5 = tr5.y;
            if ((i5 & 8) == 8) {
                int i6 = tr5.S;
                this.z |= 32768;
                this.P = i6;
            }
            if ((i5 & 16) == 16) {
                bt5 bt52 = tr5.T;
                if ((this.z & 65536) != 65536 || (bt5 = this.Q) == bt5.Q) {
                    this.Q = bt52;
                } else {
                    at5 r = bt5.r(bt5);
                    r.i(bt52);
                    this.Q = r.g();
                }
                this.z |= 65536;
            }
            if ((tr5.y & 32) == 32) {
                int i7 = tr5.U;
                this.z |= 131072;
                this.R = i7;
            }
            if (!tr5.V.isEmpty()) {
                if (this.S.isEmpty()) {
                    this.S = tr5.V;
                    this.z &= -262145;
                } else {
                    if ((this.z & 262144) != 262144) {
                        this.S = new ArrayList(this.S);
                        this.z |= 262144;
                    }
                    this.S.addAll(tr5.V);
                }
            }
            if ((tr5.y & 64) == 64) {
                ht5 ht52 = tr5.W;
                if ((this.z & 524288) != 524288 || (ht5 = this.T) == ht5.C) {
                    this.T = ht52;
                } else {
                    pr5 i8 = ht5.i(ht5);
                    i8.j(ht52);
                    this.T = i8.g();
                }
                this.z |= 524288;
            }
            if (!tr5.X.isEmpty()) {
                if (this.U.isEmpty()) {
                    this.U = tr5.X;
                    this.z &= -1048577;
                } else {
                    if ((this.z & 1048576) != 1048576) {
                        this.U = new ArrayList(this.U);
                        this.z |= 1048576;
                    }
                    this.U.addAll(tr5.X);
                }
            }
            if ((tr5.y & 128) == 128) {
                ot5 ot52 = tr5.Y;
                if ((this.z & 2097152) != 2097152 || (ot5 = this.V) == ot5.A) {
                    this.V = ot52;
                } else {
                    xr5 xr5 = new xr5(2);
                    xr5.z = Collections.EMPTY_LIST;
                    xr5.m(ot5);
                    xr5.m(ot52);
                    this.V = xr5.i();
                }
                this.z |= 2097152;
            }
            if (!tr5.Z.isEmpty()) {
                if (this.W.isEmpty()) {
                    this.W = tr5.Z;
                    this.z &= -4194305;
                } else {
                    if ((this.z & 4194304) != 4194304) {
                        this.W = new ArrayList(this.W);
                        this.z |= 4194304;
                    }
                    this.W.addAll(tr5.Z);
                }
            }
            f(tr5);
            this.w = this.w.f(tr5.x);
        }
    }
}
