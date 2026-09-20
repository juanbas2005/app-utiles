package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ws5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ws5 extends zu2 {
    public static final ws5 A;
    public static final fp3 B = new fp3(21);
    public final bg0 w;
    public f44 x;
    public byte y;
    public int z;

    static {
        ws5 ws5 = new ws5();
        A = ws5;
        ws5.x = c44.x;
    }

    public ws5(ts0 ts0) {
        this.y = -1;
        this.z = -1;
        this.x = c44.x;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 10) {
                        b94 f = ts0.f();
                        if (!z3) {
                            this.x = new c44();
                            z3 = true;
                        }
                        this.x.r(f);
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
                if (z3) {
                    this.x = this.x.c();
                }
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
        if (z3) {
            this.x = this.x.c();
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
        if (this.y == 1) {
            return true;
        }
        this.y = 1;
        return true;
    }

    public final int c() {
        int i = this.z;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.x.size();
            f44 f44 = this.x;
            if (i2 < size) {
                bg0 q = f44.q(i2);
                i3 += q.size() + xs0.p(q.size());
                i2++;
            } else {
                int size2 = this.w.size() + f44.size() + i3;
                this.z = size2;
                return size2;
            }
        }
    }

    public final ru2 d() {
        xr5 xr5 = new xr5(3);
        xr5.z = c44.x;
        return xr5;
    }

    public final ru2 e() {
        xr5 xr5 = new xr5(3);
        xr5.z = c44.x;
        xr5.l(this);
        return xr5;
    }

    public final void f(xs0 xs0) {
        c();
        for (int i = 0; i < this.x.size(); i++) {
            bg0 q = this.x.q(i);
            xs0.h0(1, 2);
            xs0.f0(q.size());
            xs0.b0(q);
        }
        xs0.b0(this.w);
    }

    public ws5() {
        this.y = -1;
        this.z = -1;
        this.w = bg0.w;
    }

    public ws5(xr5 xr5) {
        this.y = -1;
        this.z = -1;
        this.w = xr5.w;
    }
}
