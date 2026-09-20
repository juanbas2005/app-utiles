package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: nt5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt5 extends zu2 {
    public static final nt5 G;
    public static final fp3 H = new fp3(28);
    public lt5 A;
    public int B;
    public int C;
    public mt5 D;
    public byte E;
    public int F;
    public final bg0 w;
    public int x;
    public int y;
    public int z;

    static {
        nt5 nt5 = new nt5();
        G = nt5;
        nt5.y = 0;
        nt5.z = 0;
        nt5.A = lt5.y;
        nt5.B = 0;
        nt5.C = 0;
        nt5.D = mt5.x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: lt5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: mt5} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public nt5(ts0 ts0) {
        this.E = -1;
        this.F = -1;
        boolean z2 = false;
        this.y = 0;
        this.z = 0;
        lt5 lt5 = lt5.y;
        this.A = lt5;
        this.B = 0;
        this.C = 0;
        mt5 mt5 = mt5.x;
        this.D = mt5;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.x |= 1;
                        this.y = ts0.l();
                    } else if (o != 16) {
                        ? r11 = 0;
                        if (o == 24) {
                            int l = ts0.l();
                            if (l == 0) {
                                r11 = lt5.x;
                            } else if (l == 1) {
                                r11 = lt5;
                            } else if (l == 2) {
                                r11 = lt5.z;
                            }
                            if (r11 == 0) {
                                G2.f0(o);
                                G2.f0(l);
                            } else {
                                this.x |= 4;
                                this.A = r11;
                            }
                        } else if (o == 32) {
                            this.x |= 8;
                            this.B = ts0.l();
                        } else if (o == 40) {
                            this.x |= 16;
                            this.C = ts0.l();
                        } else if (o == 48) {
                            int l2 = ts0.l();
                            if (l2 == 0) {
                                r11 = mt5;
                            } else if (l2 == 1) {
                                r11 = mt5.y;
                            } else if (l2 == 2) {
                                r11 = mt5.z;
                            }
                            if (r11 == 0) {
                                G2.f0(o);
                                G2.f0(l2);
                            } else {
                                this.x |= 32;
                                this.D = r11;
                            }
                        } else if (ts0.r(o, G2)) {
                        }
                    } else {
                        this.x |= 2;
                        this.z = ts0.l();
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
        if (this.E == 1) {
            return true;
        }
        this.E = 1;
        return true;
    }

    public final int c() {
        int i;
        int i2 = this.F;
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
        if ((this.x & 8) == 8) {
            i += xs0.l(4, this.B);
        }
        if ((this.x & 16) == 16) {
            i += xs0.l(5, this.C);
        }
        if ((this.x & 32) == 32) {
            i += xs0.k(6, this.D.w);
        }
        int size = this.w.size() + i;
        this.F = size;
        return size;
    }

    public final ru2 d() {
        return kt5.g();
    }

    public final ru2 e() {
        kt5 g = kt5.g();
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
        if ((this.x & 8) == 8) {
            xs0.W(4, this.B);
        }
        if ((this.x & 16) == 16) {
            xs0.W(5, this.C);
        }
        if ((this.x & 32) == 32) {
            xs0.V(6, this.D.w);
        }
        xs0.b0(this.w);
    }

    public nt5() {
        this.E = -1;
        this.F = -1;
        this.w = bg0.w;
    }

    public nt5(kt5 kt5) {
        this.E = -1;
        this.F = -1;
        this.w = kt5.w;
    }
}
