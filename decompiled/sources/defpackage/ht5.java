package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ht5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ht5 extends zu2 {
    public static final ht5 C;
    public static final fp3 D = new fp3(26);
    public byte A;
    public int B;
    public final bg0 w;
    public int x;
    public List y;
    public int z;

    static {
        ht5 ht5 = new ht5();
        C = ht5;
        ht5.y = Collections.EMPTY_LIST;
        ht5.z = -1;
    }

    public ht5(ts0 ts0, y92 y92) {
        this.A = -1;
        this.B = -1;
        this.y = Collections.EMPTY_LIST;
        this.z = -1;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 10) {
                        if (!z3) {
                            this.y = new ArrayList();
                            z3 = true;
                        }
                        this.y.add(ts0.h(bt5.R, y92));
                    } else if (o == 16) {
                        this.x |= 1;
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
                if (z3) {
                    this.y = Collections.unmodifiableList(this.y);
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
            this.y = Collections.unmodifiableList(this.y);
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

    public static pr5 i(ht5 ht5) {
        pr5 h = pr5.h();
        h.j(ht5);
        return h;
    }

    public final boolean a() {
        byte b = this.A;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.y.size(); i++) {
            if (!((bt5) this.y.get(i)).a()) {
                this.A = 0;
                return false;
            }
        }
        this.A = 1;
        return true;
    }

    public final int c() {
        int i = this.B;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            i2 += xs0.n(1, (k2) this.y.get(i3));
        }
        if ((this.x & 1) == 1) {
            i2 += xs0.l(2, this.z);
        }
        int size = this.w.size() + i2;
        this.B = size;
        return size;
    }

    public final ru2 d() {
        return pr5.h();
    }

    public final ru2 e() {
        return i(this);
    }

    public final void f(xs0 xs0) {
        c();
        for (int i = 0; i < this.y.size(); i++) {
            xs0.Y(1, (k2) this.y.get(i));
        }
        if ((this.x & 1) == 1) {
            xs0.W(2, this.z);
        }
        xs0.b0(this.w);
    }

    public ht5() {
        this.A = -1;
        this.B = -1;
        this.w = bg0.w;
    }

    public ht5(pr5 pr5) {
        this.A = -1;
        this.B = -1;
        this.w = pr5.w;
    }
}
