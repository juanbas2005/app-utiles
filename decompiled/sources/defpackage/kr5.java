package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: kr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kr5 extends ru2 implements yj4 {
    public Object A;
    public final /* synthetic */ int x;
    public int y;
    public int z;

    public /* synthetic */ kr5(int i) {
        this.x = i;
    }

    public final k2 c() {
        switch (this.x) {
            case b85.b:
                or5 f = f();
                if (f.a()) {
                    return f;
                }
                throw new UninitializedMessageException();
            default:
                ur5 g = g();
                if (g.a()) {
                    return g;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.x) {
            case b85.b:
                kr5 kr5 = new kr5(0);
                kr5.A = nr5.L;
                kr5.h(f());
                return kr5;
            default:
                kr5 kr52 = new kr5(1);
                kr52.A = bg0.w;
                kr52.i(g());
                return kr52;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: or5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ur5} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        or5 or5;
        ur5 ur5;
        ? r1 = 0;
        switch (this.x) {
            case b85.b:
                try {
                    or5.D.getClass();
                    h(new or5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    or5 = (or5) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1 = or5;
                    break;
                }
            default:
                try {
                    ur5.D.getClass();
                    i(new ur5(ts0));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    ur5 = (ur5) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = ur5;
                    break;
                }
        }
        if (r1 != 0) {
            h(r1);
        }
        throw th;
        if (r1 != 0) {
            i(r1);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.x) {
            case b85.b:
                h((or5) zu2);
                return this;
            default:
                i((ur5) zu2);
                return this;
        }
    }

    public or5 f() {
        or5 or5 = new or5(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        or5.y = this.z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        or5.z = (nr5) this.A;
        or5.x = i2;
        return or5;
    }

    public ur5 g() {
        ur5 ur5 = new ur5(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        ur5.y = this.z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ur5.z = (b94) this.A;
        ur5.x = i2;
        return ur5;
    }

    public void h(or5 or5) {
        nr5 nr5;
        if (or5 != or5.C) {
            int i = or5.x;
            if ((i & 1) == 1) {
                int i2 = or5.y;
                this.y = 1 | this.y;
                this.z = i2;
            }
            if ((i & 2) == 2) {
                nr5 nr52 = or5.z;
                if ((this.y & 2) != 2 || (nr5 = (nr5) this.A) == nr5.L) {
                    this.A = nr52;
                } else {
                    lr5 j = nr5.j(nr5);
                    j.h(nr52);
                    this.A = j.f();
                }
                this.y |= 2;
            }
            this.w = this.w.f(or5.w);
        }
    }

    public void i(ur5 ur5) {
        if (ur5 != ur5.C) {
            int i = ur5.x;
            if ((i & 1) == 1) {
                int i2 = ur5.y;
                this.y = 1 | this.y;
                this.z = i2;
            }
            if ((i & 2) == 2) {
                b94 b94 = ur5.z;
                b94.getClass();
                this.y = 2 | this.y;
                this.A = b94;
            }
            this.w = this.w.f(ur5.w);
        }
    }
}
