package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: at5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class at5 extends vu2 {
    public List A;
    public boolean B;
    public int C;
    public bt5 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public bt5 J;
    public int K;
    public bt5 L;
    public int M;
    public int N;
    public List O;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, at5] */
    public static at5 h() {
        ? vu2 = new vu2();
        List list = Collections.EMPTY_LIST;
        vu2.A = list;
        bt5 bt5 = bt5.Q;
        vu2.D = bt5;
        vu2.J = bt5;
        vu2.L = bt5;
        vu2.O = list;
        return vu2;
    }

    public final k2 c() {
        bt5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        at5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        bt5 bt5;
        bt5 bt52 = null;
        try {
            bt5.R.getClass();
            i(new bt5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            bt5 = (bt5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            bt52 = bt5;
        }
        if (bt52 != null) {
            i(bt52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((bt5) zu2);
        return this;
    }

    public final bt5 g() {
        bt5 bt5 = new bt5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) == 1) {
            this.A = Collections.unmodifiableList(this.A);
            this.z &= -2;
        }
        bt5.z = this.A;
        if ((i & 2) != 2) {
            i2 = 0;
        }
        bt5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        bt5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        bt5.C = this.D;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        bt5.D = this.E;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        bt5.E = this.F;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        bt5.F = this.G;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        bt5.G = this.H;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        bt5.H = this.I;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        bt5.I = this.J;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        bt5.J = this.K;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        bt5.K = this.L;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        bt5.L = this.M;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        bt5.M = this.N;
        if ((this.z & 16384) == 16384) {
            this.O = Collections.unmodifiableList(this.O);
            this.z &= -16385;
        }
        bt5.N = this.O;
        bt5.y = i2;
        return bt5;
    }

    public final at5 i(bt5 bt5) {
        bt5 bt52;
        bt5 bt53;
        bt5 bt54;
        bt5 bt55 = bt5.Q;
        if (bt5 == bt55) {
            return this;
        }
        if (!bt5.z.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = bt5.z;
                this.z &= -2;
            } else {
                if ((this.z & 1) != 1) {
                    this.A = new ArrayList(this.A);
                    this.z |= 1;
                }
                this.A.addAll(bt5.z);
            }
        }
        int i = bt5.y;
        if ((i & 1) == 1) {
            boolean z2 = bt5.A;
            this.z |= 2;
            this.B = z2;
        }
        if ((i & 2) == 2) {
            int i2 = bt5.B;
            this.z |= 4;
            this.C = i2;
        }
        if ((i & 4) == 4) {
            bt5 bt56 = bt5.C;
            if ((this.z & 8) != 8 || (bt54 = this.D) == bt55) {
                this.D = bt56;
            } else {
                at5 r = bt5.r(bt54);
                r.i(bt56);
                this.D = r.g();
            }
            this.z |= 8;
        }
        if ((bt5.y & 8) == 8) {
            int i3 = bt5.D;
            this.z |= 16;
            this.E = i3;
        }
        if (bt5.p()) {
            int i4 = bt5.E;
            this.z |= 32;
            this.F = i4;
        }
        int i5 = bt5.y;
        if ((i5 & 32) == 32) {
            int i6 = bt5.F;
            this.z |= 64;
            this.G = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = bt5.G;
            this.z |= 128;
            this.H = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = bt5.H;
            this.z |= 256;
            this.I = i8;
        }
        if ((i5 & 256) == 256) {
            bt5 bt57 = bt5.I;
            if ((this.z & 512) != 512 || (bt53 = this.J) == bt55) {
                this.J = bt57;
            } else {
                at5 r2 = bt5.r(bt53);
                r2.i(bt57);
                this.J = r2.g();
            }
            this.z |= 512;
        }
        int i9 = bt5.y;
        if ((i9 & 512) == 512) {
            int i10 = bt5.J;
            this.z |= 1024;
            this.K = i10;
        }
        if ((i9 & 1024) == 1024) {
            bt5 bt58 = bt5.K;
            if ((this.z & 2048) != 2048 || (bt52 = this.L) == bt55) {
                this.L = bt58;
            } else {
                at5 r3 = bt5.r(bt52);
                r3.i(bt58);
                this.L = r3.g();
            }
            this.z |= 2048;
        }
        int i11 = bt5.y;
        if ((i11 & 2048) == 2048) {
            int i12 = bt5.L;
            this.z |= 4096;
            this.M = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = bt5.M;
            this.z |= 8192;
            this.N = i13;
        }
        if (!bt5.N.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = bt5.N;
                this.z &= -16385;
            } else {
                if ((this.z & 16384) != 16384) {
                    this.O = new ArrayList(this.O);
                    this.z |= 16384;
                }
                this.O.addAll(bt5.N);
            }
        }
        f(bt5);
        this.w = this.w.f(bt5.x);
        return this;
    }
}
