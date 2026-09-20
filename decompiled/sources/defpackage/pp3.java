package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: pp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pp3 extends zu2 {
    public static final pp3 C;
    public static final fp3 D = new fp3(3);
    public byte A;
    public int B;
    public final bg0 w;
    public List x;
    public List y;
    public int z;

    static {
        pp3 pp3 = new pp3();
        C = pp3;
        List list = Collections.EMPTY_LIST;
        pp3.x = list;
        pp3.y = list;
    }

    public pp3(ts0 ts0, y92 y92) {
        this.z = -1;
        this.A = -1;
        this.B = -1;
        List list = Collections.EMPTY_LIST;
        this.x = list;
        this.y = list;
        ag0 ag0 = new ag0();
        xs0 G = xs0.G(ag0, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o = ts0.o();
                if (o != 0) {
                    if (o == 10) {
                        if (!z3 || !true) {
                            this.x = new ArrayList();
                            z3 |= true;
                        }
                        this.x.add(ts0.h(op3.J, y92));
                    } else if (o == 40) {
                        if (!(z3 & true)) {
                            this.y = new ArrayList();
                            z3 |= true;
                        }
                        this.y.add(Integer.valueOf(ts0.l()));
                    } else if (o == 42) {
                        int e = ts0.e(ts0.l());
                        if (!(z3 & true) && ts0.c() > 0) {
                            this.y = new ArrayList();
                            z3 |= true;
                        }
                        while (ts0.c() > 0) {
                            this.y.add(Integer.valueOf(ts0.l()));
                        }
                        ts0.d(e);
                    } else if (ts0.r(o, G)) {
                    }
                }
                z2 = true;
            } catch (InvalidProtocolBufferException e2) {
                e2.w = this;
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 && true) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if (z3 & true) {
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
        if (z3 && true) {
            this.x = Collections.unmodifiableList(this.x);
        }
        if (z3 & true) {
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

    public final boolean a() {
        if (this.A == 1) {
            return true;
        }
        this.A = 1;
        return true;
    }

    public final int c() {
        List list;
        int i = this.B;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.x.size(); i4++) {
            i3 += xs0.n(1, (k2) this.x.get(i4));
        }
        int i5 = 0;
        while (true) {
            int size = this.y.size();
            list = this.y;
            if (i2 >= size) {
                break;
            }
            i5 += xs0.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int i6 = i3 + i5;
        if (!list.isEmpty()) {
            i6 = i6 + 1 + xs0.m(i5);
        }
        this.z = i5;
        int size2 = this.w.size() + i6;
        this.B = size2;
        return size2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ru2, lp3] */
    public final ru2 d() {
        ? ru2 = new ru2();
        List list = Collections.EMPTY_LIST;
        ru2.y = list;
        ru2.z = list;
        return ru2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru2, lp3] */
    public final ru2 e() {
        ? ru2 = new ru2();
        List list = Collections.EMPTY_LIST;
        ru2.y = list;
        ru2.z = list;
        ru2.g(this);
        return ru2;
    }

    public final void f(xs0 xs0) {
        c();
        for (int i = 0; i < this.x.size(); i++) {
            xs0.Y(1, (k2) this.x.get(i));
        }
        if (this.y.size() > 0) {
            xs0.f0(42);
            xs0.f0(this.z);
        }
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            xs0.X(((Integer) this.y.get(i2)).intValue());
        }
        xs0.b0(this.w);
    }

    public pp3() {
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.w = bg0.w;
    }

    public pp3(lp3 lp3) {
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.w = lp3.w;
    }
}
