package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: mp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mp3 extends ru2 implements yj4 {
    public Object A;
    public np3 B;
    public List C;
    public List D;
    public int x;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [mp3, ru2] */
    public static mp3 g() {
        ? ru2 = new ru2();
        ru2.y = 1;
        ru2.A = "";
        ru2.B = np3.x;
        List list = Collections.EMPTY_LIST;
        ru2.C = list;
        ru2.D = list;
        return ru2;
    }

    public final k2 c() {
        op3 f = f();
        f.a();
        return f;
    }

    public final Object clone() {
        mp3 g = g();
        g.h(f());
        return g;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        op3 op3;
        op3 op32 = null;
        try {
            op3.J.getClass();
            h(new op3(ts0));
            return this;
        } catch (InvalidProtocolBufferException e) {
            op3 = (op3) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            op32 = op3;
        }
        if (op32 != null) {
            h(op32);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((op3) zu2);
        return this;
    }

    public final op3 f() {
        op3 op3 = new op3(this);
        int i = this.x;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        op3.y = this.y;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        op3.z = this.z;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        op3.A = this.A;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        op3.B = this.B;
        if ((i & 16) == 16) {
            this.C = Collections.unmodifiableList(this.C);
            this.x &= -17;
        }
        op3.C = this.C;
        if ((this.x & 32) == 32) {
            this.D = Collections.unmodifiableList(this.D);
            this.x &= -33;
        }
        op3.E = this.D;
        op3.x = i2;
        return op3;
    }

    public final void h(op3 op3) {
        if (op3 != op3.I) {
            int i = op3.x;
            if ((i & 1) == 1) {
                int i2 = op3.y;
                this.x = 1 | this.x;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = op3.z;
                this.x = 2 | this.x;
                this.z = i3;
            }
            if ((i & 4) == 4) {
                this.x |= 4;
                this.A = op3.A;
            }
            if ((i & 8) == 8) {
                np3 np3 = op3.B;
                np3.getClass();
                this.x = 8 | this.x;
                this.B = np3;
            }
            if (!op3.C.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = op3.C;
                    this.x &= -17;
                } else {
                    if ((this.x & 16) != 16) {
                        this.C = new ArrayList(this.C);
                        this.x |= 16;
                    }
                    this.C.addAll(op3.C);
                }
            }
            if (!op3.E.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = op3.E;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.x |= 32;
                    }
                    this.D.addAll(op3.E);
                }
            }
            this.w = this.w.f(op3.w);
        }
    }
}
