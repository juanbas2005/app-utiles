package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: es5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class es5 extends wu2 {
    public static final es5 D;
    public static final fp3 E = new fp3(13);
    public List A;
    public byte B;
    public int C;
    public final bg0 x;
    public int y;
    public int z;

    static {
        es5 es5 = new es5();
        D = es5;
        es5.z = 0;
        es5.A = Collections.EMPTY_LIST;
    }

    public es5(ts0 ts0, y92 y92) {
        this.B = -1;
        this.C = -1;
        boolean z2 = false;
        this.z = 0;
        this.A = Collections.EMPTY_LIST;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.z = ts0.l();
                    } else if (o == 18) {
                        if (!(z3 & true)) {
                            this.A = new ArrayList();
                            z3 = true;
                        }
                        this.A.add(ts0.h(qr5.D, y92));
                    } else if (n(ts0, G, y92, o)) {
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
                    this.A = Collections.unmodifiableList(this.A);
                }
                try {
                    G.R();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.x = ag0.l();
                    throw th2;
                }
                this.x = ag0.l();
                m();
                throw th;
            }
        }
        if (z3 & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        try {
            G.R();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.x = ag0.l();
            throw th3;
        }
        this.x = ag0.l();
        m();
    }

    public final boolean a() {
        byte b = this.B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.A.size(); i++) {
            if (!((qr5) this.A.get(i)).a()) {
                this.B = 0;
                return false;
            }
        }
        if (!i()) {
            this.B = 0;
            return false;
        }
        this.B = 1;
        return true;
    }

    public final k2 b() {
        return D;
    }

    public final int c() {
        int i;
        int i2 = this.C;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == 1) {
            i = xs0.l(1, this.z);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            i += xs0.n(2, (k2) this.A.get(i3));
        }
        int size = this.x.size() + j() + i;
        this.C = size;
        return size;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [vu2, ds5, ru2] */
    public final ru2 d() {
        ? vu2 = new vu2();
        vu2.B = Collections.EMPTY_LIST;
        return vu2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vu2, ds5, ru2] */
    public final ru2 e() {
        ? vu2 = new vu2();
        vu2.B = Collections.EMPTY_LIST;
        vu2.h(this);
        return vu2;
    }

    public final void f(xs0 xs0) {
        c();
        jz0 jz0 = new jz0((wu2) this);
        if ((this.y & 1) == 1) {
            xs0.W(1, this.z);
        }
        for (int i = 0; i < this.A.size(); i++) {
            xs0.Y(2, (k2) this.A.get(i));
        }
        jz0.b0(200, xs0);
        xs0.b0(this.x);
    }

    public es5() {
        this.B = -1;
        this.C = -1;
        this.x = bg0.w;
    }

    public es5(ds5 ds5) {
        super(ds5);
        this.B = -1;
        this.C = -1;
        this.x = ds5.w;
    }
}
