package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: qr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qr5 extends zu2 {
    public static final qr5 C;
    public static final fp3 D = new fp3(5);
    public byte A;
    public int B;
    public final bg0 w;
    public int x;
    public int y;
    public List z;

    static {
        qr5 qr5 = new qr5();
        C = qr5;
        qr5.y = 0;
        qr5.z = Collections.EMPTY_LIST;
    }

    public qr5(ts0 ts0, y92 y92) {
        this.A = -1;
        this.B = -1;
        boolean z2 = false;
        this.y = 0;
        this.z = Collections.EMPTY_LIST;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = ts0.l();
                    } else if (o == 18) {
                        if (!(z3 & true)) {
                            this.z = new ArrayList();
                            z3 = true;
                        }
                        this.z.add(ts0.h(or5.D, y92));
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
                if (z3 & true) {
                    this.z = Collections.unmodifiableList(this.z);
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
        if (z3 & true) {
            this.z = Collections.unmodifiableList(this.z);
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
        if ((this.x & 1) == 1) {
            for (int i = 0; i < this.z.size(); i++) {
                if (!((or5) this.z.get(i)).a()) {
                    this.A = 0;
                    return false;
                }
            }
            this.A = 1;
            return true;
        }
        this.A = 0;
        return false;
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
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            i += xs0.n(2, (k2) this.z.get(i3));
        }
        int size = this.w.size() + i;
        this.B = size;
        return size;
    }

    public final ru2 d() {
        pr5 pr5 = new pr5(0);
        pr5.z = Collections.EMPTY_LIST;
        return pr5;
    }

    public final ru2 e() {
        pr5 pr5 = new pr5(0);
        pr5.z = Collections.EMPTY_LIST;
        pr5.i(this);
        return pr5;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        for (int i = 0; i < this.z.size(); i++) {
            xs0.Y(2, (k2) this.z.get(i));
        }
        xs0.b0(this.w);
    }

    public qr5() {
        this.A = -1;
        this.B = -1;
        this.w = bg0.w;
    }

    public qr5(pr5 pr5) {
        this.A = -1;
        this.B = -1;
        this.w = pr5.w;
    }
}
