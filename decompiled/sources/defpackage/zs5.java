package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: zs5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs5 extends zu2 {
    public static final zs5 D;
    public static final fp3 E = new fp3(23);
    public int A;
    public byte B;
    public int C;
    public final bg0 w;
    public int x;
    public ys5 y;
    public bt5 z;

    static {
        zs5 zs5 = new zs5();
        D = zs5;
        zs5.y = ys5.z;
        zs5.z = bt5.Q;
        zs5.A = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: ys5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: at5} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    public zs5(ts0 ts0, y92 y92) {
        this.B = -1;
        this.C = -1;
        ys5 ys5 = ys5.z;
        this.y = ys5;
        this.z = bt5.Q;
        boolean z2 = false;
        this.A = 0;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    ? r7 = 0;
                    if (o == 8) {
                        int l = ts0.l();
                        if (l == 0) {
                            r7 = ys5.x;
                        } else if (l == 1) {
                            r7 = ys5.y;
                        } else if (l == 2) {
                            r7 = ys5;
                        } else if (l == 3) {
                            r7 = ys5.A;
                        }
                        if (r7 == 0) {
                            G.f0(o);
                            G.f0(l);
                        } else {
                            this.x |= 1;
                            this.y = r7;
                        }
                    } else if (o == 18) {
                        if ((this.x & 2) == 2) {
                            bt5 bt5 = this.z;
                            bt5.getClass();
                            r7 = bt5.r(bt5);
                        }
                        bt5 bt52 = (bt5) ts0.h(bt5.R, y92);
                        this.z = bt52;
                        if (r7 != 0) {
                            r7.i(bt52);
                            this.z = r7.g();
                        }
                        this.x |= 2;
                    } else if (o == 24) {
                        this.x |= 4;
                        this.A = ts0.l();
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
        if ((this.x & 2) != 2 || this.z.a()) {
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
            i = xs0.k(1, this.y.w);
        } else {
            i = 0;
        }
        if ((this.x & 2) == 2) {
            i += xs0.n(2, this.z);
        }
        if ((this.x & 4) == 4) {
            i += xs0.l(3, this.A);
        }
        int size = this.w.size() + i;
        this.C = size;
        return size;
    }

    public final ru2 d() {
        return xs5.g();
    }

    public final ru2 e() {
        xs5 g = xs5.g();
        g.h(this);
        return g;
    }

    public final void f(xs0 xs0) {
        c();
        if ((this.x & 1) == 1) {
            xs0.V(1, this.y.w);
        }
        if ((this.x & 2) == 2) {
            xs0.Y(2, this.z);
        }
        if ((this.x & 4) == 4) {
            xs0.W(3, this.A);
        }
        xs0.b0(this.w);
    }

    public zs5() {
        this.B = -1;
        this.C = -1;
        this.w = bg0.w;
    }

    public zs5(xs5 xs5) {
        this.B = -1;
        this.C = -1;
        this.w = xs5.w;
    }
}
