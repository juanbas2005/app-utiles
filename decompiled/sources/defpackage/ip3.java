package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ip3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ip3 extends zu2 {
    public static final ip3 C;
    public static final fp3 D = new fp3(1);
    public byte A;
    public int B;
    public final bg0 w;
    public int x;
    public int y;
    public int z;

    static {
        ip3 ip3 = new ip3();
        C = ip3;
        ip3.y = 0;
        ip3.z = 0;
    }

    public ip3(ts0 ts0) {
        this.A = -1;
        this.B = -1;
        boolean z2 = false;
        this.y = 0;
        this.z = 0;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = ts0.l();
                    } else if (o == 16) {
                        this.x |= 2;
                        this.z = ts0.l();
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

    public static gp3 i(ip3 ip3) {
        gp3 gp3 = new gp3(1);
        gp3.i(ip3);
        return gp3;
    }

    public final boolean a() {
        if (this.A == 1) {
            return true;
        }
        this.A = 1;
        return true;
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
            i += xs0.l(2, this.z);
        }
        int size = this.w.size() + i;
        this.B = size;
        return size;
    }

    public final ru2 d() {
        return new gp3(1);
    }

    public final ru2 e() {
        return i(this);
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        if ((this.x & 2) == 2) {
            xs0.W(2, this.z);
        }
        xs0.b0(this.w);
    }

    public ip3() {
        this.A = -1;
        this.B = -1;
        this.w = bg0.w;
    }

    public ip3(gp3 gp3) {
        this.A = -1;
        this.B = -1;
        this.w = gp3.w;
    }
}
