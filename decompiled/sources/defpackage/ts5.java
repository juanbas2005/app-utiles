package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ts5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts5 extends zu2 {
    public static final ts5 D;
    public static final fp3 E = new fp3(20);
    public ss5 A;
    public byte B;
    public int C;
    public final bg0 w;
    public int x;
    public int y;
    public int z;

    static {
        ts5 ts5 = new ts5();
        D = ts5;
        ts5.y = -1;
        ts5.z = 0;
        ts5.A = ss5.y;
    }

    public ts5(ts0 ts0) {
        ss5 ss5;
        this.B = -1;
        this.C = -1;
        this.y = -1;
        boolean z2 = false;
        this.z = 0;
        ss5 ss52 = ss5.y;
        this.A = ss52;
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
                    } else if (o == 24) {
                        int l = ts0.l();
                        if (l == 0) {
                            ss5 = ss5.x;
                        } else if (l == 1) {
                            ss5 = ss52;
                        } else if (l != 2) {
                            ss5 = null;
                        } else {
                            ss5 = ss5.z;
                        }
                        if (ss5 == null) {
                            G.f0(o);
                            G.f0(l);
                        } else {
                            this.x |= 4;
                            this.A = ss5;
                        }
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
        byte b = this.B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.x & 2) == 2) {
            this.B = 1;
            return true;
        }
        this.B = 0;
        return false;
    }

    public final int c() {
        int i;
        int i2 = this.C;
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
        if ((this.x & 4) == 4) {
            i += xs0.k(3, this.A.w);
        }
        int size = this.w.size() + i;
        this.C = size;
        return size;
    }

    public final ru2 d() {
        return rs5.g();
    }

    public final ru2 e() {
        rs5 g = rs5.g();
        g.h(this);
        return g;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        if ((this.x & 2) == 2) {
            xs0.W(2, this.z);
        }
        if ((this.x & 4) == 4) {
            xs0.V(3, this.A.w);
        }
        xs0.b0(this.w);
    }

    public ts5() {
        this.B = -1;
        this.C = -1;
        this.w = bg0.w;
    }

    public ts5(rs5 rs5) {
        this.B = -1;
        this.C = -1;
        this.w = rs5.w;
    }
}
