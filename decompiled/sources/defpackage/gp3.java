package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: gp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gp3 extends ru2 implements yj4 {
    public int A;
    public final /* synthetic */ int x;
    public int y;
    public int z;

    public /* synthetic */ gp3(int i) {
        this.x = i;
    }

    public final k2 c() {
        switch (this.x) {
            case b85.b:
                hp3 f = f();
                f.a();
                return f;
            default:
                ip3 g = g();
                g.a();
                return g;
        }
    }

    public final Object clone() {
        switch (this.x) {
            case b85.b:
                gp3 gp3 = new gp3(0);
                gp3.h(f());
                return gp3;
            default:
                gp3 gp32 = new gp3(1);
                gp32.i(g());
                return gp32;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: hp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ip3} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        hp3 hp3;
        ip3 ip3;
        ? r0 = 0;
        switch (this.x) {
            case b85.b:
                try {
                    hp3.D.getClass();
                    h(new hp3(ts0));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    hp3 = (hp3) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r0 = hp3;
                    break;
                }
            default:
                try {
                    ip3.D.getClass();
                    i(new ip3(ts0));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    ip3 = (ip3) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = ip3;
                    break;
                }
        }
        if (r0 != 0) {
            h(r0);
        }
        throw th;
        if (r0 != 0) {
            i(r0);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.x) {
            case b85.b:
                h((hp3) zu2);
                return this;
            default:
                i((ip3) zu2);
                return this;
        }
    }

    public hp3 f() {
        hp3 hp3 = new hp3(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        hp3.y = this.z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        hp3.z = this.A;
        hp3.x = i2;
        return hp3;
    }

    public ip3 g() {
        ip3 ip3 = new ip3(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        ip3.y = this.z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ip3.z = this.A;
        ip3.x = i2;
        return ip3;
    }

    public void h(hp3 hp3) {
        if (hp3 != hp3.C) {
            int i = hp3.x;
            if ((i & 1) == 1) {
                int i2 = hp3.y;
                this.y = 1 | this.y;
                this.z = i2;
            }
            if ((i & 2) == 2) {
                int i3 = hp3.z;
                this.y = 2 | this.y;
                this.A = i3;
            }
            this.w = this.w.f(hp3.w);
        }
    }

    public void i(ip3 ip3) {
        if (ip3 != ip3.C) {
            int i = ip3.x;
            if ((i & 1) == 1) {
                int i2 = ip3.y;
                this.y = 1 | this.y;
                this.z = i2;
            }
            if ((i & 2) == 2) {
                int i3 = ip3.z;
                this.y = 2 | this.y;
                this.A = i3;
            }
            this.w = this.w.f(ip3.w);
        }
    }
}
