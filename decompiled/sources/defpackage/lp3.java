package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: lp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp3 extends ru2 implements yj4 {
    public int x;
    public List y;
    public List z;

    public final k2 c() {
        pp3 f = f();
        f.a();
        return f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ru2, lp3] */
    public final Object clone() {
        ? ru2 = new ru2();
        List list = Collections.EMPTY_LIST;
        ru2.y = list;
        ru2.z = list;
        ru2.g(f());
        return ru2;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        pp3 pp3;
        pp3 pp32 = null;
        try {
            pp3.D.getClass();
            g(new pp3(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            pp3 = (pp3) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            pp32 = pp3;
        }
        if (pp32 != null) {
            g(pp32);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        g((pp3) zu2);
        return this;
    }

    public final pp3 f() {
        pp3 pp3 = new pp3(this);
        if ((this.x & 1) == 1) {
            this.y = Collections.unmodifiableList(this.y);
            this.x &= -2;
        }
        pp3.x = this.y;
        if ((this.x & 2) == 2) {
            this.z = Collections.unmodifiableList(this.z);
            this.x &= -3;
        }
        pp3.y = this.z;
        return pp3;
    }

    public final void g(pp3 pp3) {
        if (pp3 != pp3.C) {
            if (!pp3.x.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = pp3.x;
                    this.x &= -2;
                } else {
                    if ((this.x & 1) != 1) {
                        this.y = new ArrayList(this.y);
                        this.x |= 1;
                    }
                    this.y.addAll(pp3.x);
                }
            }
            if (!pp3.y.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = pp3.y;
                    this.x &= -3;
                } else {
                    if ((this.x & 2) != 2) {
                        this.z = new ArrayList(this.z);
                        this.x |= 2;
                    }
                    this.z.addAll(pp3.y);
                }
            }
            this.w = this.w.f(pp3.w);
        }
    }
}
