package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: lr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lr5 extends ru2 implements yj4 {
    public float A;
    public double B;
    public int C;
    public int D;
    public int E;
    public qr5 F;
    public List G;
    public int H;
    public int I;
    public int x;
    public mr5 y;
    public long z;

    /* JADX WARNING: type inference failed for: r0v0, types: [ru2, lr5] */
    public static lr5 g() {
        ? ru2 = new ru2();
        ru2.y = mr5.x;
        ru2.F = qr5.C;
        ru2.G = Collections.EMPTY_LIST;
        return ru2;
    }

    public final k2 c() {
        nr5 f = f();
        if (f.a()) {
            return f;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        lr5 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        nr5 nr5;
        nr5 nr52 = null;
        try {
            nr5.M.getClass();
            h(new nr5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            nr5 = (nr5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            nr52 = nr5;
        }
        if (nr52 != null) {
            h(nr52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((nr5) zu2);
        return this;
    }

    public final nr5 f() {
        nr5 nr5 = new nr5(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        nr5.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        nr5.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        nr5.A = this.A;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        nr5.B = this.B;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        nr5.C = this.C;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        nr5.D = this.D;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        nr5.E = this.E;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        nr5.F = this.F;
        if ((i & 256) == 256) {
            this.G = Collections.unmodifiableList(this.G);
            this.x &= -257;
        }
        nr5.G = this.G;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        nr5.H = this.H;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        nr5.I = this.I;
        nr5.x = i2;
        return nr5;
    }

    public final void h(nr5 nr5) {
        qr5 qr5;
        if (nr5 != nr5.L) {
            if ((nr5.x & 1) == 1) {
                mr5 mr5 = nr5.y;
                mr5.getClass();
                this.x = 1 | this.x;
                this.y = mr5;
            }
            int i = nr5.x;
            if ((i & 2) == 2) {
                long j = nr5.z;
                this.x |= 2;
                this.z = j;
            }
            if ((i & 4) == 4) {
                float f = nr5.A;
                this.x = 4 | this.x;
                this.A = f;
            }
            if ((i & 8) == 8) {
                double d = nr5.B;
                this.x |= 8;
                this.B = d;
            }
            if ((i & 16) == 16) {
                int i2 = nr5.C;
                this.x = 16 | this.x;
                this.C = i2;
            }
            if ((i & 32) == 32) {
                int i3 = nr5.D;
                this.x = 32 | this.x;
                this.D = i3;
            }
            if ((i & 64) == 64) {
                int i4 = nr5.E;
                this.x = 64 | this.x;
                this.E = i4;
            }
            if ((i & 128) == 128) {
                qr5 qr52 = nr5.F;
                if ((this.x & 128) != 128 || (qr5 = this.F) == qr5.C) {
                    this.F = qr52;
                } else {
                    pr5 pr5 = new pr5(0);
                    pr5.z = Collections.EMPTY_LIST;
                    pr5.i(qr5);
                    pr5.i(qr52);
                    this.F = pr5.f();
                }
                this.x |= 128;
            }
            if (!nr5.G.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = nr5.G;
                    this.x &= -257;
                } else {
                    if ((this.x & 256) != 256) {
                        this.G = new ArrayList(this.G);
                        this.x |= 256;
                    }
                    this.G.addAll(nr5.G);
                }
            }
            int i5 = nr5.x;
            if ((i5 & 256) == 256) {
                int i6 = nr5.H;
                this.x |= 512;
                this.H = i6;
            }
            if ((i5 & 512) == 512) {
                int i7 = nr5.I;
                this.x |= 1024;
                this.I = i7;
            }
            this.w = this.w.f(nr5.w);
        }
    }
}
