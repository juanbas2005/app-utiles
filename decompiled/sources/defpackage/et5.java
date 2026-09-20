package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: et5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class et5 extends vu2 {
    public int A;
    public int B;
    public boolean C;
    public ft5 D;
    public List E;
    public List F;
    public List G;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, et5] */
    public static et5 h() {
        ? vu2 = new vu2();
        vu2.D = ft5.z;
        List list = Collections.EMPTY_LIST;
        vu2.E = list;
        vu2.F = list;
        vu2.G = list;
        return vu2;
    }

    public final k2 c() {
        gt5 g = g();
        if (g.a()) {
            return g;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        et5 h = h();
        h.i(g());
        return h;
    }

    public final ru2 d(ts0 ts0, y92 y92) {
        gt5 gt5;
        gt5 gt52 = null;
        try {
            gt5.K.getClass();
            i(new gt5(ts0, y92));
            return this;
        } catch (InvalidProtocolBufferException e) {
            gt5 = (gt5) e.w;
            throw e;
        } catch (Throwable th) {
            th = th;
            gt52 = gt5;
        }
        if (gt52 != null) {
            i(gt52);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        i((gt5) zu2);
        return this;
    }

    public final gt5 g() {
        gt5 gt5 = new gt5(this);
        int i = this.z;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        gt5.z = this.A;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        gt5.A = this.B;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        gt5.B = this.C;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        gt5.C = this.D;
        if ((i & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
            this.z &= -17;
        }
        gt5.D = this.E;
        if ((this.z & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.z &= -33;
        }
        gt5.E = this.F;
        if ((this.z & 64) == 64) {
            this.G = Collections.unmodifiableList(this.G);
            this.z &= -65;
        }
        gt5.G = this.G;
        gt5.y = i2;
        return gt5;
    }

    public final void i(gt5 gt5) {
        if (gt5 != gt5.J) {
            int i = gt5.y;
            if ((i & 1) == 1) {
                int i2 = gt5.z;
                this.z = 1 | this.z;
                this.A = i2;
            }
            if ((i & 2) == 2) {
                int i3 = gt5.A;
                this.z = 2 | this.z;
                this.B = i3;
            }
            if ((i & 4) == 4) {
                boolean z2 = gt5.B;
                this.z = 4 | this.z;
                this.C = z2;
            }
            if ((i & 8) == 8) {
                ft5 ft5 = gt5.C;
                ft5.getClass();
                this.z = 8 | this.z;
                this.D = ft5;
            }
            if (!gt5.D.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = gt5.D;
                    this.z &= -17;
                } else {
                    if ((this.z & 16) != 16) {
                        this.E = new ArrayList(this.E);
                        this.z |= 16;
                    }
                    this.E.addAll(gt5.D);
                }
            }
            if (!gt5.E.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = gt5.E;
                    this.z &= -33;
                } else {
                    if ((this.z & 32) != 32) {
                        this.F = new ArrayList(this.F);
                        this.z |= 32;
                    }
                    this.F.addAll(gt5.E);
                }
            }
            if (!gt5.G.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = gt5.G;
                    this.z &= -65;
                } else {
                    if ((this.z & 64) != 64) {
                        this.G = new ArrayList(this.G);
                        this.z |= 64;
                    }
                    this.G.addAll(gt5.G);
                }
            }
            f(gt5);
            this.w = this.w.f(gt5.x);
        }
    }
}
