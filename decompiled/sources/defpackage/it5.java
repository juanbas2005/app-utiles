package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: it5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class it5 extends vu2 {
    public int A;
    public int B;
    public bt5 C;
    public int D;
    public bt5 E;
    public int F;
    public List G;
    public nr5 H;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, it5] */
    public static it5 h() {
        ? vu2 = new vu2();
        bt5 bt5 = bt5.Q;
        vu2.C = bt5;
        vu2.E = bt5;
        vu2.G = Collections.EMPTY_LIST;
        vu2.H = nr5.L;
        return vu2;
    }

    public final k2 c() {
        jt5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        it5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        jt5 jt5;
        jt5 jt52 = null;
        try {
            jt5.K.getClass();
            i(new jt5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            jt5 = (jt5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            jt52 = jt5;
        }
        if (jt52 != null) {
            i(jt52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((jt5) zu2);
        return this;
    }

    public final jt5 g() {
        jt5 jt5 = new jt5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        jt5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jt5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        jt5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        jt5.C = this.D;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        jt5.D = this.E;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        jt5.E = this.F;
        if ((i & 64) == 64) {
            this.G = Collections.unmodifiableList(this.G);
            this.z &= -65;
        }
        jt5.F = this.G;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        jt5.G = this.H;
        jt5.y = i2;
        return jt5;
    }

    public final void i(jt5 jt5) {
        nr5 nr5;
        bt5 bt5;
        bt5 bt52;
        if (jt5 != jt5.J) {
            int i = jt5.y;
            if ((i & 1) == 1) {
                int i2 = jt5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = jt5.A;
                this.z = 2 | this.z;
                this.B = i3;
            }
            if ((i & 4) == 4) {
                bt5 bt53 = jt5.B;
                if ((this.z & 4) != 4 || (bt52 = this.C) == bt5.Q) {
                    this.C = bt53;
                } else {
                    at5 r = bt5.r(bt52);
                    r.i(bt53);
                    this.C = r.g();
                }
                this.z |= 4;
            }
            int i4 = jt5.y;
            if ((i4 & 8) == 8) {
                int i5 = jt5.C;
                this.z = 8 | this.z;
                this.D = i5;
            }
            if ((i4 & 16) == 16) {
                bt5 bt54 = jt5.D;
                if ((this.z & 16) != 16 || (bt5 = this.E) == bt5.Q) {
                    this.E = bt54;
                } else {
                    at5 r2 = bt5.r(bt5);
                    r2.i(bt54);
                    this.E = r2.g();
                }
                this.z |= 16;
            }
            if ((jt5.y & 32) == 32) {
                int i6 = jt5.E;
                this.z = 32 | this.z;
                this.F = i6;
            }
            if (!jt5.F.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = jt5.F;
                    this.z &= -65;
                } else {
                    if ((this.z & 64) != 64) {
                        this.G = new ArrayList(this.G);
                        this.z |= 64;
                    }
                    this.G.addAll(jt5.F);
                }
            }
            if ((jt5.y & 64) == 64) {
                nr5 nr52 = jt5.G;
                if ((this.z & 128) != 128 || (nr5 = this.H) == nr5.L) {
                    this.H = nr52;
                } else {
                    lr5 j = nr5.j(nr5);
                    j.h(nr52);
                    this.H = j.f();
                }
                this.z |= 128;
            }
            f(jt5);
            this.w = this.w.f(jt5.x);
        }
    }
}
