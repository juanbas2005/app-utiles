package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: vr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vr5 extends vu2 {
    public int A;
    public List B;
    public List C;
    public List D;
    public List E;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, vr5] */
    public static vr5 h() {
        ? vu2 = new vu2();
        vu2.A = 6;
        List list = Collections.EMPTY_LIST;
        vu2.B = list;
        vu2.C = list;
        vu2.D = list;
        vu2.E = list;
        return vu2;
    }

    public final k2 c() {
        wr5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        vr5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        wr5 wr5;
        wr5 wr52 = null;
        try {
            wr5.H.getClass();
            i(new wr5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            wr5 = (wr5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            wr52 = wr5;
        }
        if (wr52 != null) {
            i(wr52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((wr5) zu2);
        return this;
    }

    public final wr5 g() {
        wr5 wr5 = new wr5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        wr5.z = this.A;
        if ((i & 2) == 2) {
            this.B = Collections.unmodifiableList(this.B);
            this.z &= -3;
        }
        wr5.A = this.B;
        if ((this.z & 4) == 4) {
            this.C = Collections.unmodifiableList(this.C);
            this.z &= -5;
        }
        wr5.B = this.C;
        if ((this.z & 8) == 8) {
            this.D = Collections.unmodifiableList(this.D);
            this.z &= -9;
        }
        wr5.C = this.D;
        if ((this.z & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
            this.z &= -17;
        }
        wr5.D = this.E;
        wr5.y = i2;
        return wr5;
    }

    public final void i(wr5 wr5) {
        if (wr5 != wr5.G) {
            if ((wr5.y & 1) == 1) {
                int i = wr5.z;
                this.z = 1 | this.z;
                this.A = i;
            }
            if (!wr5.A.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = wr5.A;
                    this.z &= -3;
                } else {
                    if ((this.z & 2) != 2) {
                        this.B = new ArrayList(this.B);
                        this.z |= 2;
                    }
                    this.B.addAll(wr5.A);
                }
            }
            if (!wr5.B.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = wr5.B;
                    this.z &= -5;
                } else {
                    if ((this.z & 4) != 4) {
                        this.C = new ArrayList(this.C);
                        this.z |= 4;
                    }
                    this.C.addAll(wr5.B);
                }
            }
            if (!wr5.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = wr5.C;
                    this.z &= -9;
                } else {
                    if ((this.z & 8) != 8) {
                        this.D = new ArrayList(this.D);
                        this.z |= 8;
                    }
                    this.D.addAll(wr5.C);
                }
            }
            if (!wr5.D.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = wr5.D;
                    this.z &= -17;
                } else {
                    if ((this.z & 16) != 16) {
                        this.E = new ArrayList(this.E);
                        this.z |= 16;
                    }
                    this.E.addAll(wr5.D);
                }
            }
            f(wr5);
            this.w = this.w.f(wr5.x);
        }
    }
}
