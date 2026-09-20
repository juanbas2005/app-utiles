package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: rs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rs5 extends ru2 implements yj4 {
    public ss5 A;
    public int x;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [rs5, ru2] */
    public static rs5 g() {
        ? ru2 = new ru2();
        ru2.y = -1;
        ru2.A = ss5.y;
        return ru2;
    }

    public final k2 c() {
        ts5 f = f();
        if (f.a()) {
            return f;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        rs5 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        ts5 ts5;
        ts5 ts52 = null;
        try {
            ts5.E.getClass();
            h(new ts5(ts0));
            return this;
        } catch (InvalidProtocolBufferException e) {
            ts5 = (ts5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            ts52 = ts5;
        }
        if (ts52 != null) {
            h(ts52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((ts5) zu2);
        return this;
    }

    public final ts5 f() {
        ts5 ts5 = new ts5(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        ts5.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ts5.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ts5.A = this.A;
        ts5.x = i2;
        return ts5;
    }

    public final void h(ts5 ts5) {
        if (ts5 != ts5.D) {
            int i = ts5.x;
            if ((i & 1) == 1) {
                int i2 = ts5.y;
                this.x = 1 | this.x;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = ts5.z;
                this.x = 2 | this.x;
                this.z = i3;
            }
            if ((i & 4) == 4) {
                ss5 ss5 = ts5.A;
                ss5.getClass();
                this.x = 4 | this.x;
                this.A = ss5;
            }
            this.w = this.w.f(ts5.w);
        }
    }
}
