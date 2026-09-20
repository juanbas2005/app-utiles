package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kt5 extends ru2 implements yj4 {
    public lt5 A;
    public int B;
    public int C;
    public mt5 D;
    public int x;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [kt5, ru2] */
    public static kt5 g() {
        ? ru2 = new ru2();
        ru2.A = lt5.y;
        ru2.D = mt5.x;
        return ru2;
    }

    public final k2 c() {
        nt5 f = f();
        f.a();
        return f;
    }

    public final Object clone() {
        kt5 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        nt5 nt5;
        nt5 nt52 = null;
        try {
            nt5.H.getClass();
            h(new nt5(ts0));
            return this;
        } catch (InvalidProtocolBufferException e) {
            nt5 = (nt5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            nt52 = nt5;
        }
        if (nt52 != null) {
            h(nt52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((nt5) zu2);
        return this;
    }

    public final nt5 f() {
        nt5 nt5 = new nt5(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        nt5.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        nt5.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        nt5.A = this.A;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        nt5.B = this.B;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        nt5.C = this.C;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        nt5.D = this.D;
        nt5.x = i2;
        return nt5;
    }

    public final void h(nt5 nt5) {
        if (nt5 != nt5.G) {
            int i = nt5.x;
            if ((i & 1) == 1) {
                int i2 = nt5.y;
                this.x = 1 | this.x;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = nt5.z;
                this.x = 2 | this.x;
                this.z = i3;
            }
            if ((i & 4) == 4) {
                lt5 lt5 = nt5.A;
                lt5.getClass();
                this.x = 4 | this.x;
                this.A = lt5;
            }
            int i4 = nt5.x;
            if ((i4 & 8) == 8) {
                int i5 = nt5.B;
                this.x = 8 | this.x;
                this.B = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = nt5.C;
                this.x = 16 | this.x;
                this.C = i6;
            }
            if ((i4 & 32) == 32) {
                mt5 mt5 = nt5.D;
                mt5.getClass();
                this.x = 32 | this.x;
                this.D = mt5;
            }
            this.w = this.w.f(nt5.w);
        }
    }
}
