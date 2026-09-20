package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: fs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fs5 extends ru2 implements yj4 {
    public gs5 A;
    public bt5 B;
    public int C;
    public List D;
    public List E;
    public int x;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [fs5, ru2] */
    public static fs5 g() {
        ? ru2 = new ru2();
        ru2.A = gs5.x;
        ru2.B = bt5.Q;
        List list = Collections.EMPTY_LIST;
        ru2.D = list;
        ru2.E = list;
        return ru2;
    }

    public final k2 c() {
        hs5 f = f();
        if (f.a()) {
            return f;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        fs5 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        hs5 hs5;
        hs5 hs52 = null;
        try {
            hs5.I.getClass();
            h(new hs5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            hs5 = (hs5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            hs52 = hs5;
        }
        if (hs52 != null) {
            h(hs52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((hs5) zu2);
        return this;
    }

    public final hs5 f() {
        hs5 hs5 = new hs5(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        hs5.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        hs5.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        hs5.A = this.A;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        hs5.B = this.B;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        hs5.C = this.C;
        if ((i & 32) == 32) {
            this.D = Collections.unmodifiableList(this.D);
            this.x &= -33;
        }
        hs5.D = this.D;
        if ((this.x & 64) == 64) {
            this.E = Collections.unmodifiableList(this.E);
            this.x &= -65;
        }
        hs5.E = this.E;
        hs5.x = i2;
        return hs5;
    }

    public final void h(hs5 hs5) {
        bt5 bt5;
        if (hs5 != hs5.H) {
            int i = hs5.x;
            if ((i & 1) == 1) {
                int i2 = hs5.y;
                this.x = 1 | this.x;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = hs5.z;
                this.x = 2 | this.x;
                this.z = i3;
            }
            if ((i & 4) == 4) {
                gs5 gs5 = hs5.A;
                gs5.getClass();
                this.x = 4 | this.x;
                this.A = gs5;
            }
            if ((hs5.x & 8) == 8) {
                bt5 bt52 = hs5.B;
                if ((this.x & 8) != 8 || (bt5 = this.B) == bt5.Q) {
                    this.B = bt52;
                } else {
                    at5 r = bt5.r(bt5);
                    r.i(bt52);
                    this.B = r.g();
                }
                this.x |= 8;
            }
            if ((hs5.x & 16) == 16) {
                int i4 = hs5.C;
                this.x = 16 | this.x;
                this.C = i4;
            }
            if (!hs5.D.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = hs5.D;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.x |= 32;
                    }
                    this.D.addAll(hs5.D);
                }
            }
            if (!hs5.E.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = hs5.E;
                    this.x &= -65;
                } else {
                    if ((this.x & 64) != 64) {
                        this.E = new ArrayList(this.E);
                        this.x |= 64;
                    }
                    this.E.addAll(hs5.E);
                }
            }
            this.w = this.w.f(hs5.w);
        }
    }
}
