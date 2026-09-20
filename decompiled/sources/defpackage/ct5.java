package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: ct5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ct5 extends vu2 {
    public int A;
    public int B;
    public List C;
    public bt5 D;
    public int E;
    public bt5 F;
    public int G;
    public List H;
    public List I;
    public List J;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, ct5] */
    public static ct5 h() {
        ? vu2 = new vu2();
        vu2.A = 6;
        List list = Collections.EMPTY_LIST;
        vu2.C = list;
        bt5 bt5 = bt5.Q;
        vu2.D = bt5;
        vu2.F = bt5;
        vu2.H = list;
        vu2.I = list;
        vu2.J = list;
        return vu2;
    }

    public final k2 c() {
        dt5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        ct5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        dt5 dt5;
        dt5 dt52 = null;
        try {
            dt5.M.getClass();
            i(new dt5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            dt5 = (dt5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            dt52 = dt5;
        }
        if (dt52 != null) {
            i(dt52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((dt5) zu2);
        return this;
    }

    public final dt5 g() {
        dt5 dt5 = new dt5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        dt5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dt5.A = this.B;
        if ((i & 4) == 4) {
            this.C = Collections.unmodifiableList(this.C);
            this.z &= -5;
        }
        dt5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        dt5.C = this.D;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        dt5.D = this.E;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        dt5.E = this.F;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        dt5.F = this.G;
        if ((this.z & 128) == 128) {
            this.H = Collections.unmodifiableList(this.H);
            this.z &= -129;
        }
        dt5.G = this.H;
        if ((this.z & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.z &= -257;
        }
        dt5.H = this.I;
        if ((this.z & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.z &= -513;
        }
        dt5.I = this.J;
        dt5.y = i2;
        return dt5;
    }

    public final void i(dt5 dt5) {
        bt5 bt5;
        bt5 bt52;
        if (dt5 != dt5.L) {
            int i = dt5.y;
            if ((i & 1) == 1) {
                int i2 = dt5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = dt5.A;
                this.z = 2 | this.z;
                this.B = i3;
            }
            if (!dt5.B.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = dt5.B;
                    this.z &= -5;
                } else {
                    if ((this.z & 4) != 4) {
                        this.C = new ArrayList(this.C);
                        this.z |= 4;
                    }
                    this.C.addAll(dt5.B);
                }
            }
            if ((dt5.y & 4) == 4) {
                bt5 bt53 = dt5.C;
                if ((this.z & 8) != 8 || (bt52 = this.D) == bt5.Q) {
                    this.D = bt53;
                } else {
                    at5 r = bt5.r(bt52);
                    r.i(bt53);
                    this.D = r.g();
                }
                this.z |= 8;
            }
            int i4 = dt5.y;
            if ((i4 & 8) == 8) {
                int i5 = dt5.D;
                this.z |= 16;
                this.E = i5;
            }
            if ((i4 & 16) == 16) {
                bt5 bt54 = dt5.E;
                if ((this.z & 32) != 32 || (bt5 = this.F) == bt5.Q) {
                    this.F = bt54;
                } else {
                    at5 r2 = bt5.r(bt5);
                    r2.i(bt54);
                    this.F = r2.g();
                }
                this.z |= 32;
            }
            if ((dt5.y & 32) == 32) {
                int i6 = dt5.F;
                this.z |= 64;
                this.G = i6;
            }
            if (!dt5.G.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = dt5.G;
                    this.z &= -129;
                } else {
                    if ((this.z & 128) != 128) {
                        this.H = new ArrayList(this.H);
                        this.z |= 128;
                    }
                    this.H.addAll(dt5.G);
                }
            }
            if (!dt5.H.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = dt5.H;
                    this.z &= -257;
                } else {
                    if ((this.z & 256) != 256) {
                        this.I = new ArrayList(this.I);
                        this.z |= 256;
                    }
                    this.I.addAll(dt5.H);
                }
            }
            if (!dt5.I.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = dt5.I;
                    this.z &= -513;
                } else {
                    if ((this.z & 512) != 512) {
                        this.J = new ArrayList(this.J);
                        this.z |= 512;
                    }
                    this.J.addAll(dt5.I);
                }
            }
            f(dt5);
            this.w = this.w.f(dt5.x);
        }
    }
}
