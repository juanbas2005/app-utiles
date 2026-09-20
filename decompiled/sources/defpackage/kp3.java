package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp3 extends zu2 {
    public static final kp3 F;
    public static final fp3 G = new fp3(2);
    public ip3 A;
    public ip3 B;
    public ip3 C;
    public byte D;
    public int E;
    public final bg0 w;
    public int x;
    public hp3 y;
    public ip3 z;

    static {
        kp3 kp3 = new kp3();
        F = kp3;
        kp3.y = hp3.C;
        ip3 ip3 = ip3.C;
        kp3.z = ip3;
        kp3.A = ip3;
        kp3.B = ip3;
        kp3.C = ip3;
    }

    public kp3(ts0 ts0, y92 y92) {
        this.D = -1;
        this.E = -1;
        this.y = hp3.C;
        ip3 ip3 = ip3.C;
        this.z = ip3;
        this.A = ip3;
        this.B = ip3;
        this.C = ip3;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z2 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    gp3 gp3 = null;
                    if (o == 10) {
                        if ((this.x & 1) == 1) {
                            hp3 hp3 = this.y;
                            hp3.getClass();
                            gp3 = new gp3(0);
                            gp3.h(hp3);
                        }
                        hp3 hp32 = (hp3) ts0.h(hp3.D, y92);
                        this.y = hp32;
                        if (gp3 != null) {
                            gp3.h(hp32);
                            this.y = gp3.f();
                        }
                        this.x |= 1;
                    } else if (o == 18) {
                        if ((this.x & 2) == 2) {
                            ip3 ip32 = this.z;
                            ip32.getClass();
                            gp3 = ip3.i(ip32);
                        }
                        ip3 ip33 = (ip3) ts0.h(ip3.D, y92);
                        this.z = ip33;
                        if (gp3 != null) {
                            gp3.i(ip33);
                            this.z = gp3.g();
                        }
                        this.x |= 2;
                    } else if (o == 26) {
                        if ((this.x & 4) == 4) {
                            ip3 ip34 = this.A;
                            ip34.getClass();
                            gp3 = ip3.i(ip34);
                        }
                        ip3 ip35 = (ip3) ts0.h(ip3.D, y92);
                        this.A = ip35;
                        if (gp3 != null) {
                            gp3.i(ip35);
                            this.A = gp3.g();
                        }
                        this.x |= 4;
                    } else if (o == 34) {
                        if ((this.x & 8) == 8) {
                            ip3 ip36 = this.B;
                            ip36.getClass();
                            gp3 = ip3.i(ip36);
                        }
                        ip3 ip37 = (ip3) ts0.h(ip3.D, y92);
                        this.B = ip37;
                        if (gp3 != null) {
                            gp3.i(ip37);
                            this.B = gp3.g();
                        }
                        this.x |= 8;
                    } else if (o == 42) {
                        if ((this.x & 16) == 16) {
                            ip3 ip38 = this.C;
                            ip38.getClass();
                            gp3 = ip3.i(ip38);
                        }
                        ip3 ip39 = (ip3) ts0.h(ip3.D, y92);
                        this.C = ip39;
                        if (gp3 != null) {
                            gp3.i(ip39);
                            this.C = gp3.g();
                        }
                        this.x |= 16;
                    } else if (ts0.r(o, G2)) {
                    }
                }
                z2 = true;
            } catch (InvalidProtocolBufferException e) {
                e.w = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                try {
                    G2.R();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.w = ag0.l();
                    throw th2;
                }
                this.w = ag0.l();
                throw th;
            }
        }
        try {
            G2.R();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.w = ag0.l();
            throw th3;
        }
        this.w = ag0.l();
    }

    public final boolean a() {
        if (this.D == 1) {
            return true;
        }
        this.D = 1;
        return true;
    }

    public final int c() {
        int i;
        int i2 = this.E;
        if (i2 != -1) {
            return i2;
        }
        if ((this.x & 1) == 1) {
            i = xs0.n(1, this.y);
        } else {
            i = 0;
        }
        if ((this.x & 2) == 2) {
            i += xs0.n(2, this.z);
        }
        if ((this.x & 4) == 4) {
            i += xs0.n(3, this.A);
        }
        if ((this.x & 8) == 8) {
            i += xs0.n(4, this.B);
        }
        if ((this.x & 16) == 16) {
            i += xs0.n(5, this.C);
        }
        int size = this.w.size() + i;
        this.E = size;
        return size;
    }

    public final ru2 d() {
        return jp3.h();
    }

    public final ru2 e() {
        jp3 h = jp3.h();
        h.j(this);
        return h;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.Y(1, this.y);
        }
        if ((this.x & 2) == 2) {
            xs0.Y(2, this.z);
        }
        if ((this.x & 4) == 4) {
            xs0.Y(3, this.A);
        }
        if ((this.x & 8) == 8) {
            xs0.Y(4, this.B);
        }
        if ((this.x & 16) == 16) {
            xs0.Y(5, this.C);
        }
        xs0.b0(this.w);
    }

    public final boolean i() {
        if ((this.x & 4) == 4) {
            return true;
        }
        return false;
    }

    public kp3() {
        this.D = -1;
        this.E = -1;
        this.w = bg0.w;
    }

    public kp3(jp3 jp3) {
        this.D = -1;
        this.E = -1;
        this.w = jp3.w;
    }
}
