package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: ps5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ps5 extends vu2 {
    public int A;
    public int B;
    public int C;
    public bt5 D;
    public int E;
    public List F;
    public bt5 G;
    public int H;
    public List I;
    public List J;
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
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, ps5] */
    public static ps5 h() {
        ? vu2 = new vu2();
        vu2.A = 518;
        vu2.B = 2054;
        bt5 bt5 = bt5.Q;
        vu2.D = bt5;
        List list = Collections.EMPTY_LIST;
        vu2.F = list;
        vu2.G = bt5;
        vu2.I = list;
        vu2.J = list;
        vu2.K = list;
        vu2.L = jt5.J;
        vu2.O = list;
        vu2.P = list;
        vu2.Q = list;
        vu2.R = list;
        vu2.S = list;
        vu2.T = list;
        vu2.U = list;
        vu2.V = list;
        yr5 yr5 = yr5.A;
        vu2.W = yr5;
        vu2.X = yr5;
        return vu2;
    }

    public final k2 c() {
        qs5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        ps5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        qs5 qs5;
        qs5 qs52 = null;
        try {
            qs5.b0.getClass();
            i(new qs5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            qs5 = (qs5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            qs52 = qs5;
        }
        if (qs52 != null) {
            i(qs52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((qs5) zu2);
        return this;
    }

    public final qs5 g() {
        qs5 qs5 = new qs5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        qs5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        qs5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        qs5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        qs5.C = this.D;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        qs5.D = this.E;
        if ((i & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.z &= -33;
        }
        qs5.E = this.F;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        qs5.F = this.G;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        qs5.G = this.H;
        if ((this.z & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.z &= -257;
        }
        qs5.H = this.I;
        if ((this.z & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.z &= -513;
        }
        qs5.I = this.J;
        if ((this.z & 1024) == 1024) {
            this.K = Collections.unmodifiableList(this.K);
            this.z &= -1025;
        }
        qs5.K = this.K;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        qs5.L = this.L;
        if ((i & 4096) == 4096) {
            i2 |= 256;
        }
        qs5.M = this.M;
        if ((i & 8192) == 8192) {
            i2 |= 512;
        }
        qs5.N = this.N;
        if ((this.z & 16384) == 16384) {
            this.O = Collections.unmodifiableList(this.O);
            this.z &= -16385;
        }
        qs5.O = this.O;
        if ((this.z & 32768) == 32768) {
            this.P = Collections.unmodifiableList(this.P);
            this.z &= -32769;
        }
        qs5.P = this.P;
        if ((this.z & 65536) == 65536) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.z &= -65537;
        }
        qs5.Q = this.Q;
        if ((this.z & 131072) == 131072) {
            this.R = Collections.unmodifiableList(this.R);
            this.z &= -131073;
        }
        qs5.R = this.R;
        if ((this.z & 262144) == 262144) {
            this.S = Collections.unmodifiableList(this.S);
            this.z &= -262145;
        }
        qs5.S = this.S;
        if ((this.z & 524288) == 524288) {
            this.T = Collections.unmodifiableList(this.T);
            this.z &= -524289;
        }
        qs5.T = this.T;
        if ((this.z & 1048576) == 1048576) {
            this.U = Collections.unmodifiableList(this.U);
            this.z &= -1048577;
        }
        qs5.U = this.U;
        if ((this.z & 2097152) == 2097152) {
            this.V = Collections.unmodifiableList(this.V);
            this.z &= -2097153;
        }
        qs5.V = this.V;
        if ((i & 4194304) == 4194304) {
            i2 |= 1024;
        }
        qs5.W = this.W;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        qs5.X = this.X;
        qs5.y = i2;
        return qs5;
    }

    public final void i(qs5 qs5) {
        yr5 yr5;
        yr5 yr52;
        jt5 jt5;
        bt5 bt5;
        bt5 bt52;
        if (qs5 != qs5.a0) {
            int i = qs5.y;
            if ((i & 1) == 1) {
                int i2 = qs5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = qs5.A;
                this.z = 2 | this.z;
                this.B = i3;
            }
            if ((i & 4) == 4) {
                int i4 = qs5.B;
                this.z = 4 | this.z;
                this.C = i4;
            }
            if ((i & 8) == 8) {
                bt5 bt53 = qs5.C;
                if ((this.z & 8) != 8 || (bt52 = this.D) == bt5.Q) {
                    this.D = bt53;
                } else {
                    at5 r = bt5.r(bt52);
                    r.i(bt53);
                    this.D = r.g();
                }
                this.z |= 8;
            }
            if ((qs5.y & 16) == 16) {
                int i5 = qs5.D;
                this.z = 16 | this.z;
                this.E = i5;
            }
            if (!qs5.E.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = qs5.E;
                    this.z &= -33;
                } else {
                    if ((this.z & 32) != 32) {
                        this.F = new ArrayList(this.F);
                        this.z |= 32;
                    }
                    this.F.addAll(qs5.E);
                }
            }
            if ((qs5.y & 32) == 32) {
                bt5 bt54 = qs5.F;
                if ((this.z & 64) != 64 || (bt5 = this.G) == bt5.Q) {
                    this.G = bt54;
                } else {
                    at5 r2 = bt5.r(bt5);
                    r2.i(bt54);
                    this.G = r2.g();
                }
                this.z |= 64;
            }
            if ((qs5.y & 64) == 64) {
                int i6 = qs5.G;
                this.z |= 128;
                this.H = i6;
            }
            if (!qs5.H.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = qs5.H;
                    this.z &= -257;
                } else {
                    if ((this.z & 256) != 256) {
                        this.I = new ArrayList(this.I);
                        this.z |= 256;
                    }
                    this.I.addAll(qs5.H);
                }
            }
            if (!qs5.I.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = qs5.I;
                    this.z &= -513;
                } else {
                    if ((this.z & 512) != 512) {
                        this.J = new ArrayList(this.J);
                        this.z |= 512;
                    }
                    this.J.addAll(qs5.I);
                }
            }
            if (!qs5.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = qs5.K;
                    this.z &= -1025;
                } else {
                    if ((this.z & 1024) != 1024) {
                        this.K = new ArrayList(this.K);
                        this.z |= 1024;
                    }
                    this.K.addAll(qs5.K);
                }
            }
            if ((qs5.y & 128) == 128) {
                jt5 jt52 = qs5.L;
                if ((this.z & 2048) != 2048 || (jt5 = this.L) == jt5.J) {
                    this.L = jt52;
                } else {
                    it5 h = it5.h();
                    h.i(jt5);
                    h.i(jt52);
                    this.L = h.g();
                }
                this.z |= 2048;
            }
            int i7 = qs5.y;
            if ((i7 & 256) == 256) {
                int i8 = qs5.M;
                this.z |= 4096;
                this.M = i8;
            }
            if ((i7 & 512) == 512) {
                int i9 = qs5.N;
                this.z |= 8192;
                this.N = i9;
            }
            if (!qs5.O.isEmpty()) {
                if (this.O.isEmpty()) {
                    this.O = qs5.O;
                    this.z &= -16385;
                } else {
                    if ((this.z & 16384) != 16384) {
                        this.O = new ArrayList(this.O);
                        this.z |= 16384;
                    }
                    this.O.addAll(qs5.O);
                }
            }
            if (!qs5.P.isEmpty()) {
                if (this.P.isEmpty()) {
                    this.P = qs5.P;
                    this.z &= -32769;
                } else {
                    if ((this.z & 32768) != 32768) {
                        this.P = new ArrayList(this.P);
                        this.z |= 32768;
                    }
                    this.P.addAll(qs5.P);
                }
            }
            if (!qs5.Q.isEmpty()) {
                if (this.Q.isEmpty()) {
                    this.Q = qs5.Q;
                    this.z &= -65537;
                } else {
                    if ((this.z & 65536) != 65536) {
                        this.Q = new ArrayList(this.Q);
                        this.z |= 65536;
                    }
                    this.Q.addAll(qs5.Q);
                }
            }
            if (!qs5.R.isEmpty()) {
                if (this.R.isEmpty()) {
                    this.R = qs5.R;
                    this.z &= -131073;
                } else {
                    if ((this.z & 131072) != 131072) {
                        this.R = new ArrayList(this.R);
                        this.z |= 131072;
                    }
                    this.R.addAll(qs5.R);
                }
            }
            if (!qs5.S.isEmpty()) {
                if (this.S.isEmpty()) {
                    this.S = qs5.S;
                    this.z &= -262145;
                } else {
                    if ((this.z & 262144) != 262144) {
                        this.S = new ArrayList(this.S);
                        this.z |= 262144;
                    }
                    this.S.addAll(qs5.S);
                }
            }
            if (!qs5.T.isEmpty()) {
                if (this.T.isEmpty()) {
                    this.T = qs5.T;
                    this.z &= -524289;
                } else {
                    if ((this.z & 524288) != 524288) {
                        this.T = new ArrayList(this.T);
                        this.z |= 524288;
                    }
                    this.T.addAll(qs5.T);
                }
            }
            if (!qs5.U.isEmpty()) {
                if (this.U.isEmpty()) {
                    this.U = qs5.U;
                    this.z &= -1048577;
                } else {
                    if ((this.z & 1048576) != 1048576) {
                        this.U = new ArrayList(this.U);
                        this.z |= 1048576;
                    }
                    this.U.addAll(qs5.U);
                }
            }
            if (!qs5.V.isEmpty()) {
                if (this.V.isEmpty()) {
                    this.V = qs5.V;
                    this.z &= -2097153;
                } else {
                    if ((this.z & 2097152) != 2097152) {
                        this.V = new ArrayList(this.V);
                        this.z |= 2097152;
                    }
                    this.V.addAll(qs5.V);
                }
            }
            if ((qs5.y & 1024) == 1024) {
                yr5 yr53 = qs5.W;
                if ((this.z & 4194304) != 4194304 || (yr52 = this.W) == yr5.A) {
                    this.W = yr53;
                } else {
                    xr5 xr5 = new xr5(0);
                    xr5.z = Collections.EMPTY_LIST;
                    xr5.j(yr52);
                    xr5.j(yr53);
                    this.W = xr5.f();
                }
                this.z |= 4194304;
            }
            if ((qs5.y & 2048) == 2048) {
                yr5 yr54 = qs5.X;
                if ((this.z & 8388608) != 8388608 || (yr5 = this.X) == yr5.A) {
                    this.X = yr54;
                } else {
                    xr5 xr52 = new xr5(0);
                    xr52.z = Collections.EMPTY_LIST;
                    xr52.j(yr5);
                    xr52.j(yr54);
                    this.X = xr52.f();
                }
                this.z |= 8388608;
            }
            f(qs5);
            this.w = this.w.f(qs5.x);
        }
    }
}
