package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: xs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xs5 extends ru2 implements yj4 {
    public int A;
    public int x;
    public ys5 y;
    public bt5 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [xs5, ru2] */
    public static xs5 g() {
        ? ru2 = new ru2();
        ru2.y = ys5.z;
        ru2.z = bt5.Q;
        return ru2;
    }

    public final k2 c() {
        zs5 f = f();
        if (f.a()) {
            return f;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        xs5 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        zs5 zs5;
        zs5 zs52 = null;
        try {
            zs5.E.getClass();
            h(new zs5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            zs5 = (zs5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            zs52 = zs5;
        }
        if (zs52 != null) {
            h(zs52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((zs5) zu2);
        return this;
    }

    public final zs5 f() {
        zs5 zs5 = new zs5(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        zs5.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zs5.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zs5.A = this.A;
        zs5.x = i2;
        return zs5;
    }

    public final void h(zs5 zs5) {
        bt5 bt5;
        if (zs5 != zs5.D) {
            if ((zs5.x & 1) == 1) {
                ys5 ys5 = zs5.y;
                ys5.getClass();
                this.x = 1 | this.x;
                this.y = ys5;
            }
            if ((zs5.x & 2) == 2) {
                bt5 bt52 = zs5.z;
                if ((this.x & 2) != 2 || (bt5 = this.z) == bt5.Q) {
                    this.z = bt52;
                } else {
                    at5 r = bt5.r(bt5);
                    r.i(bt52);
                    this.z = r.g();
                }
                this.x |= 2;
            }
            if ((zs5.x & 4) == 4) {
                int i = zs5.A;
                this.x = 4 | this.x;
                this.A = i;
            }
            this.w = this.w.f(zs5.w);
        }
    }
}
