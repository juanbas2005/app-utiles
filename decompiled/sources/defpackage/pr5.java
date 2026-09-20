package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: pr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pr5 extends ru2 implements yj4 {
    public int A;
    public final /* synthetic */ int x;
    public int y;
    public List z;

    public /* synthetic */ pr5(int i) {
        this.x = i;
    }

    public static pr5 h() {
        pr5 pr5 = new pr5(1);
        pr5.z = Collections.EMPTY_LIST;
        pr5.A = -1;
        return pr5;
    }

    public final k2 c() {
        switch (this.x) {
            case b85.b:
                qr5 f = f();
                if (f.a()) {
                    return f;
                }
                throw new UninitializedMessageException();
            default:
                ht5 g = g();
                if (g.a()) {
                    return g;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.x) {
            case b85.b:
                pr5 pr5 = new pr5(0);
                pr5.z = Collections.EMPTY_LIST;
                pr5.i(f());
                return pr5;
            default:
                pr5 h = h();
                h.j(g());
                return h;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: qr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ht5} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        qr5 qr5;
        ht5 ht5;
        ? r1 = 0;
        switch (this.x) {
            case b85.b:
                try {
                    i((qr5) qr5.D.b(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qr5 = (qr5) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1 = qr5;
                    break;
                }
            default:
                try {
                    ht5.D.getClass();
                    j(new ht5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    ht5 = (ht5) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = ht5;
                    break;
                }
        }
        if (r1 != 0) {
            i(r1);
        }
        throw th;
        if (r1 != 0) {
            j(r1);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.x) {
            case b85.b:
                i((qr5) zu2);
                return this;
            default:
                j((ht5) zu2);
                return this;
        }
    }

    public qr5 f() {
        qr5 qr5 = new qr5(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        qr5.y = this.A;
        if ((i & 2) == 2) {
            this.z = Collections.unmodifiableList(this.z);
            this.y &= -3;
        }
        qr5.z = this.z;
        qr5.x = i2;
        return qr5;
    }

    public ht5 g() {
        ht5 ht5 = new ht5(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) == 1) {
            this.z = Collections.unmodifiableList(this.z);
            this.y &= -2;
        }
        ht5.y = this.z;
        if ((i & 2) != 2) {
            i2 = 0;
        }
        ht5.z = this.A;
        ht5.x = i2;
        return ht5;
    }

    public void i(qr5 qr5) {
        if (qr5 != qr5.C) {
            if ((qr5.x & 1) == 1) {
                int i = qr5.y;
                this.y = 1 | this.y;
                this.A = i;
            }
            if (!qr5.z.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = qr5.z;
                    this.y &= -3;
                } else {
                    if ((this.y & 2) != 2) {
                        this.z = new ArrayList(this.z);
                        this.y |= 2;
                    }
                    this.z.addAll(qr5.z);
                }
            }
            this.w = this.w.f(qr5.w);
        }
    }

    public void j(ht5 ht5) {
        if (ht5 != ht5.C) {
            if (!ht5.y.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = ht5.y;
                    this.y &= -2;
                } else {
                    if ((this.y & 1) != 1) {
                        this.z = new ArrayList(this.z);
                        this.y |= 1;
                    }
                    this.z.addAll(ht5.y);
                }
            }
            if ((ht5.x & 1) == 1) {
                int i = ht5.z;
                this.y |= 2;
                this.A = i;
            }
            this.w = this.w.f(ht5.w);
        }
    }
}
