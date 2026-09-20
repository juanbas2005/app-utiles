package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ur5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ur5 extends zu2 {
    public static final ur5 C;
    public static final fp3 D = new fp3(9);
    public byte A;
    public int B;
    public final bg0 w;
    public int x;
    public int y;
    public b94 z;

    static {
        ur5 ur5 = new ur5();
        C = ur5;
        ur5.y = 0;
        ur5.z = bg0.w;
    }

    public ur5(ts0 ts0) {
        this.A = -1;
        this.B = -1;
        boolean z2 = false;
        this.y = 0;
        this.z = bg0.w;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = ts0.l();
                    } else if (o == 18) {
                        this.x |= 2;
                        this.z = ts0.f();
                    } else if (ts0.r(o, G)) {
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
                    G.R();
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
            G.R();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.w = ag0.l();
            throw th3;
        }
        this.w = ag0.l();
    }

    public final boolean a() {
        byte b = this.A;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.x;
        if ((i & 1) != 1) {
            this.A = 0;
            return false;
        } else if ((i & 2) == 2) {
            this.A = 1;
            return true;
        } else {
            this.A = 0;
            return false;
        }
    }

    public final int c() {
        int i;
        int i2 = this.B;
        if (i2 != -1) {
            return i2;
        }
        if ((this.x & 1) == 1) {
            i = xs0.l(1, this.y);
        } else {
            i = 0;
        }
        if ((this.x & 2) == 2) {
            b94 b94 = this.z;
            i += b94.size() + xs0.p(b94.size()) + xs0.r(2);
        }
        int size = this.w.size() + i;
        this.B = size;
        return size;
    }

    public final ru2 d() {
        kr5 kr5 = new kr5(1);
        kr5.A = bg0.w;
        return kr5;
    }

    public final ru2 e() {
        kr5 kr5 = new kr5(1);
        kr5.A = bg0.w;
        kr5.i(this);
        return kr5;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        if ((this.x & 2) == 2) {
            b94 b94 = this.z;
            xs0.h0(2, 2);
            xs0.f0(b94.size());
            xs0.b0(b94);
        }
        xs0.b0(this.w);
    }

    public ur5() {
        this.A = -1;
        this.B = -1;
        this.w = bg0.w;
    }

    public ur5(kr5 kr5) {
        this.A = -1;
        this.B = -1;
        this.w = kr5.w;
    }
}
