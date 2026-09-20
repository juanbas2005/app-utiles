package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: ds5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ds5 extends vu2 {
    public int A;
    public List B;
    public int z;

    public final k2 c() {
        es5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, ds5, java.lang.Object] */
    public final Object clone() {
        ? vu2 = new vu2();
        vu2.B = Collections.EMPTY_LIST;
        vu2.h(g());
        return vu2;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        es5 es5;
        es5 es52 = null;
        try {
            es5.E.getClass();
            h(new es5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            es5 = (es5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            es52 = es5;
        }
        if (es52 != null) {
            h(es52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        h((es5) zu2);
        return this;
    }

    public final es5 g() {
        es5 es5 = new es5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        es5.z = this.A;
        if ((i & 2) == 2) {
            this.B = Collections.unmodifiableList(this.B);
            this.z &= -3;
        }
        es5.A = this.B;
        es5.y = i2;
        return es5;
    }

    public final void h(es5 es5) {
        if (es5 != es5.D) {
            if ((es5.y & 1) == 1) {
                int i = es5.z;
                this.z = 1 | this.z;
                this.A = i;
            }
            if (!es5.A.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = es5.A;
                    this.z &= -3;
                } else {
                    if ((this.z & 2) != 2) {
                        this.B = new ArrayList(this.B);
                        this.z |= 2;
                    }
                    this.B.addAll(es5.A);
                }
            }
            f(es5);
            this.w = this.w.f(es5.x);
        }
    }
}
