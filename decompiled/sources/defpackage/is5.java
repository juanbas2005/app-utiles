package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: is5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class is5 extends vu2 {
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
    public List L;
    public ht5 M;
    public List N;
    public yr5 O;
    public List P;
    public List Q;
    public List R;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, is5] */
    public static is5 h() {
        ? vu2 = new vu2();
        vu2.A = 6;
        vu2.B = 6;
        bt5 bt5 = bt5.Q;
        vu2.D = bt5;
        List list = Collections.EMPTY_LIST;
        vu2.F = list;
        vu2.G = bt5;
        vu2.I = list;
        vu2.J = list;
        vu2.K = list;
        vu2.L = list;
        vu2.M = ht5.C;
        vu2.N = list;
        vu2.O = yr5.A;
        vu2.P = list;
        vu2.Q = list;
        vu2.R = list;
        return vu2;
    }

    public final k2 c() {
        js5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        is5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        js5 js5;
        js5 js52 = null;
        try {
            js5.V.getClass();
            i(new js5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            js5 = (js5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            js52 = js5;
        }
        if (js52 != null) {
            i(js52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((js5) zu2);
        return this;
    }

    public final js5 g() {
        js5 js5 = new js5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        js5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        js5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        js5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        js5.C = this.D;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        js5.D = this.E;
        if ((i & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.z &= -33;
        }
        js5.E = this.F;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        js5.F = this.G;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        js5.G = this.H;
        if ((this.z & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.z &= -257;
        }
        js5.H = this.I;
        if ((this.z & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.z &= -513;
        }
        js5.I = this.J;
        if ((this.z & 1024) == 1024) {
            this.K = Collections.unmodifiableList(this.K);
            this.z &= -1025;
        }
        js5.K = this.K;
        if ((this.z & 2048) == 2048) {
            this.L = Collections.unmodifiableList(this.L);
            this.z &= -2049;
        }
        js5.L = this.L;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        js5.M = this.M;
        if ((this.z & 8192) == 8192) {
            this.N = Collections.unmodifiableList(this.N);
            this.z &= -8193;
        }
        js5.N = this.N;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        js5.O = this.O;
        if ((this.z & 32768) == 32768) {
            this.P = Collections.unmodifiableList(this.P);
            this.z &= -32769;
        }
        js5.P = this.P;
        if ((this.z & 65536) == 65536) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.z &= -65537;
        }
        js5.Q = this.Q;
        if ((this.z & 131072) == 131072) {
            this.R = Collections.unmodifiableList(this.R);
            this.z &= -131073;
        }
        js5.R = this.R;
        js5.y = i2;
        return js5;
    }

    public final void i(js5 js5) {
        yr5 yr5;
        ht5 ht5;
        bt5 bt5;
        bt5 bt52;
        if (js5 != js5.U) {
            int i = js5.y;
            if ((i & 1) == 1) {
                int i2 = js5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = js5.A;
                this.z = 2 | this.z;
                this.B = i3;
            }
            if ((i & 4) == 4) {
                int i4 = js5.B;
                this.z = 4 | this.z;
                this.C = i4;
            }
            if ((i & 8) == 8) {
                bt5 bt53 = js5.C;
                if ((this.z & 8) != 8 || (bt52 = this.D) == bt5.Q) {
                    this.D = bt53;
                } else {
                    at5 r = bt5.r(bt52);
                    r.i(bt53);
                    this.D = r.g();
                }
                this.z |= 8;
            }
            if ((js5.y & 16) == 16) {
                int i5 = js5.D;
                this.z = 16 | this.z;
                this.E = i5;
            }
            if (!js5.E.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = js5.E;
                    this.z &= -33;
                } else {
                    if ((this.z & 32) != 32) {
                        this.F = new ArrayList(this.F);
                        this.z |= 32;
                    }
                    this.F.addAll(js5.E);
                }
            }
            if ((js5.y & 32) == 32) {
                bt5 bt54 = js5.F;
                if ((this.z & 64) != 64 || (bt5 = this.G) == bt5.Q) {
                    this.G = bt54;
                } else {
                    at5 r2 = bt5.r(bt5);
                    r2.i(bt54);
                    this.G = r2.g();
                }
                this.z |= 64;
            }
            if ((js5.y & 64) == 64) {
                int i6 = js5.G;
                this.z |= 128;
                this.H = i6;
            }
            if (!js5.H.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = js5.H;
                    this.z &= -257;
                } else {
                    if ((this.z & 256) != 256) {
                        this.I = new ArrayList(this.I);
                        this.z |= 256;
                    }
                    this.I.addAll(js5.H);
                }
            }
            if (!js5.I.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = js5.I;
                    this.z &= -513;
                } else {
                    if ((this.z & 512) != 512) {
                        this.J = new ArrayList(this.J);
                        this.z |= 512;
                    }
                    this.J.addAll(js5.I);
                }
            }
            if (!js5.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = js5.K;
                    this.z &= -1025;
                } else {
                    if ((this.z & 1024) != 1024) {
                        this.K = new ArrayList(this.K);
                        this.z |= 1024;
                    }
                    this.K.addAll(js5.K);
                }
            }
            if (!js5.L.isEmpty()) {
                if (this.L.isEmpty()) {
                    this.L = js5.L;
                    this.z &= -2049;
                } else {
                    if ((this.z & 2048) != 2048) {
                        this.L = new ArrayList(this.L);
                        this.z |= 2048;
                    }
                    this.L.addAll(js5.L);
                }
            }
            if ((js5.y & 128) == 128) {
                ht5 ht52 = js5.M;
                if ((this.z & 4096) != 4096 || (ht5 = this.M) == ht5.C) {
                    this.M = ht52;
                } else {
                    pr5 i7 = ht5.i(ht5);
                    i7.j(ht52);
                    this.M = i7.g();
                }
                this.z |= 4096;
            }
            if (!js5.N.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = js5.N;
                    this.z &= -8193;
                } else {
                    if ((this.z & 8192) != 8192) {
                        this.N = new ArrayList(this.N);
                        this.z |= 8192;
                    }
                    this.N.addAll(js5.N);
                }
            }
            if ((js5.y & 256) == 256) {
                yr5 yr52 = js5.O;
                if ((this.z & 16384) != 16384 || (yr5 = this.O) == yr5.A) {
                    this.O = yr52;
                } else {
                    xr5 xr5 = new xr5(0);
                    xr5.z = Collections.EMPTY_LIST;
                    xr5.j(yr5);
                    xr5.j(yr52);
                    this.O = xr5.f();
                }
                this.z |= 16384;
            }
            if (!js5.P.isEmpty()) {
                if (this.P.isEmpty()) {
                    this.P = js5.P;
                    this.z &= -32769;
                } else {
                    if ((this.z & 32768) != 32768) {
                        this.P = new ArrayList(this.P);
                        this.z |= 32768;
                    }
                    this.P.addAll(js5.P);
                }
            }
            if (!js5.Q.isEmpty()) {
                if (this.Q.isEmpty()) {
                    this.Q = js5.Q;
                    this.z &= -65537;
                } else {
                    if ((this.z & 65536) != 65536) {
                        this.Q = new ArrayList(this.Q);
                        this.z |= 65536;
                    }
                    this.Q.addAll(js5.Q);
                }
            }
            if (!js5.R.isEmpty()) {
                if (this.R.isEmpty()) {
                    this.R = js5.R;
                    this.z &= -131073;
                } else {
                    if ((this.z & 131072) != 131072) {
                        this.R = new ArrayList(this.R);
                        this.z |= 131072;
                    }
                    this.R.addAll(js5.R);
                }
            }
            f(js5);
            this.w = this.w.f(js5.x);
        }
    }
}
