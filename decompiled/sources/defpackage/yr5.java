package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: yr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yr5 extends zu2 {
    public static final yr5 A;
    public static final fp3 B = new fp3(11);
    public final bg0 w;
    public List x;
    public byte y;
    public int z;

    static {
        yr5 yr5 = new yr5();
        A = yr5;
        yr5.x = Collections.EMPTY_LIST;
    }

    public yr5(ts0 ts0, y92 y92) {
        this.y = -1;
        this.z = -1;
        this.x = Collections.EMPTY_LIST;
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
                            this.x = new ArrayList();
                            z3 = true;
                        }
                        this.x.add(ts0.h(cs5.G, y92));
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
                    this.x = Collections.unmodifiableList(this.x);
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
            this.x = Collections.unmodifiableList(this.x);
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
        byte b = this.y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.x.size(); i++) {
            if (!((cs5) this.x.get(i)).a()) {
                this.y = 0;
                return false;
            }
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
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            i2 += xs0.n(1, (k2) this.x.get(i3));
        }
        int size = this.w.size() + i2;
        this.z = size;
        return size;
    }

    public final ru2 d() {
        xr5 xr5 = new xr5(0);
        xr5.z = Collections.EMPTY_LIST;
        return xr5;
    }

    public final ru2 e() {
        xr5 xr5 = new xr5(0);
        xr5.z = Collections.EMPTY_LIST;
        xr5.j(this);
        return xr5;
    }

    public final void f(xs0 xs0) {
        c();
        for (int i = 0; i < this.x.size(); i++) {
            xs0.Y(1, (k2) this.x.get(i));
        }
        xs0.b0(this.w);
    }

    public yr5() {
        this.y = -1;
        this.z = -1;
        this.w = bg0.w;
    }

    public yr5(xr5 xr5) {
        this.y = -1;
        this.z = -1;
        this.w = xr5.w;
    }
}
