package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: jp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jp3 extends ru2 implements yj4 {
    public Object A;
    public zu2 B;
    public Serializable C;
    public Serializable D;
    public final /* synthetic */ int x;
    public int y;
    public Serializable z;

    public /* synthetic */ jp3(int i) {
        this.x = i;
    }

    public static jp3 h() {
        jp3 jp3 = new jp3(0);
        jp3.z = hp3.C;
        ip3 ip3 = ip3.C;
        jp3.A = ip3;
        jp3.B = ip3;
        jp3.C = ip3;
        jp3.D = ip3;
        return jp3;
    }

    public static jp3 i() {
        jp3 jp3 = new jp3(1);
        jp3.z = as5.x;
        jp3.A = Collections.EMPTY_LIST;
        jp3.B = hs5.H;
        jp3.C = bs5.x;
        jp3.D = zr5.x;
        return jp3;
    }

    public final k2 c() {
        switch (this.x) {
            case b85.b:
                kp3 f = f();
                f.a();
                return f;
            default:
                cs5 g = g();
                if (g.a()) {
                    return g;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.x) {
            case b85.b:
                jp3 h = h();
                h.j(f());
                return h;
            default:
                jp3 i = i();
                i.k(g());
                return i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: cs5} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        kp3 kp3;
        cs5 cs5;
        ? r1 = 0;
        switch (this.x) {
            case b85.b:
                try {
                    kp3.G.getClass();
                    j(new kp3(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    kp3 = (kp3) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1 = kp3;
                    break;
                }
            default:
                try {
                    cs5.G.getClass();
                    k(new cs5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    cs5 = (cs5) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = cs5;
                    break;
                }
        }
        if (r1 != 0) {
            j(r1);
        }
        throw th;
        if (r1 != 0) {
            k(r1);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.x) {
            case b85.b:
                j((kp3) zu2);
                return this;
            default:
                k((cs5) zu2);
                return this;
        }
    }

    public kp3 f() {
        kp3 kp3 = new kp3(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        kp3.y = (hp3) this.z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        kp3.z = (ip3) this.A;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        kp3.A = (ip3) this.B;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        kp3.B = (ip3) this.C;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        kp3.C = (ip3) this.D;
        kp3.x = i2;
        return kp3;
    }

    public cs5 g() {
        cs5 cs5 = new cs5(this);
        int i = this.y;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        cs5.y = (as5) this.z;
        if ((i & 2) == 2) {
            this.A = Collections.unmodifiableList((List) this.A);
            this.y &= -3;
        }
        cs5.z = (List) this.A;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        cs5.A = (hs5) this.B;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        cs5.B = (bs5) this.C;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        cs5.C = (zr5) this.D;
        cs5.x = i2;
        return cs5;
    }

    public void j(kp3 kp3) {
        ip3 ip3;
        ip3 ip32;
        ip3 ip33;
        ip3 ip34;
        hp3 hp3;
        if (kp3 != kp3.F) {
            if ((kp3.x & 1) == 1) {
                hp3 hp32 = kp3.y;
                if ((this.y & 1) != 1 || (hp3 = (hp3) this.z) == hp3.C) {
                    this.z = hp32;
                } else {
                    gp3 gp3 = new gp3(0);
                    gp3.h(hp3);
                    gp3.h(hp32);
                    this.z = gp3.f();
                }
                this.y |= 1;
            }
            if ((kp3.x & 2) == 2) {
                ip3 ip35 = kp3.z;
                if ((this.y & 2) != 2 || (ip34 = (ip3) this.A) == ip3.C) {
                    this.A = ip35;
                } else {
                    gp3 i = ip3.i(ip34);
                    i.i(ip35);
                    this.A = i.g();
                }
                this.y |= 2;
            }
            if (kp3.i()) {
                ip3 ip36 = kp3.A;
                if ((this.y & 4) != 4 || (ip33 = (ip3) this.B) == ip3.C) {
                    this.B = ip36;
                } else {
                    gp3 i2 = ip3.i(ip33);
                    i2.i(ip36);
                    this.B = i2.g();
                }
                this.y |= 4;
            }
            if ((kp3.x & 8) == 8) {
                ip3 ip37 = kp3.B;
                if ((this.y & 8) != 8 || (ip32 = (ip3) this.C) == ip3.C) {
                    this.C = ip37;
                } else {
                    gp3 i3 = ip3.i(ip32);
                    i3.i(ip37);
                    this.C = i3.g();
                }
                this.y |= 8;
            }
            if ((kp3.x & 16) == 16) {
                ip3 ip38 = kp3.C;
                if ((this.y & 16) != 16 || (ip3 = (ip3) this.D) == ip3.C) {
                    this.D = ip38;
                } else {
                    gp3 i4 = ip3.i(ip3);
                    i4.i(ip38);
                    this.D = i4.g();
                }
                this.y |= 16;
            }
            this.w = this.w.f(kp3.w);
        }
    }

    public void k(cs5 cs5) {
        hs5 hs5;
        if (cs5 != cs5.F) {
            if ((cs5.x & 1) == 1) {
                as5 as5 = cs5.y;
                as5.getClass();
                this.y = 1 | this.y;
                this.z = as5;
            }
            if (!cs5.z.isEmpty()) {
                if (((List) this.A).isEmpty()) {
                    this.A = cs5.z;
                    this.y &= -3;
                } else {
                    if ((this.y & 2) != 2) {
                        this.A = new ArrayList((List) this.A);
                        this.y |= 2;
                    }
                    ((List) this.A).addAll(cs5.z);
                }
            }
            if ((cs5.x & 2) == 2) {
                hs5 hs52 = cs5.A;
                if ((this.y & 4) != 4 || (hs5 = (hs5) this.B) == hs5.H) {
                    this.B = hs52;
                } else {
                    fs5 g = fs5.g();
                    g.h(hs5);
                    g.h(hs52);
                    this.B = g.f();
                }
                this.y |= 4;
            }
            if ((cs5.x & 4) == 4) {
                bs5 bs5 = cs5.B;
                bs5.getClass();
                this.y |= 8;
                this.C = bs5;
            }
            if ((cs5.x & 8) == 8) {
                zr5 zr5 = cs5.C;
                zr5.getClass();
                this.y |= 16;
                this.D = zr5;
            }
            this.w = this.w.f(cs5.w);
        }
    }
}
