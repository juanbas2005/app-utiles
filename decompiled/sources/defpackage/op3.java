package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: op3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op3 extends zu2 {
    public static final op3 I;
    public static final fp3 J = new fp3(4);
    public Object A;
    public np3 B;
    public List C;
    public int D;
    public List E;
    public int F;
    public byte G;
    public int H;
    public final bg0 w;
    public int x;
    public int y;
    public int z;

    static {
        op3 op3 = new op3();
        I = op3;
        op3.y = 1;
        op3.z = 0;
        op3.A = "";
        op3.B = np3.x;
        List list = Collections.EMPTY_LIST;
        op3.C = list;
        op3.E = list;
    }

    public op3(ts0 ts0) {
        np3 np3;
        this.D = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.y = 1;
        boolean z2 = false;
        this.z = 0;
        this.A = "";
        np3 np32 = np3.x;
        this.B = np32;
        List list = Collections.EMPTY_LIST;
        this.C = list;
        this.E = list;
        ag0 ag0 = new ag0();
        xs0 G2 = xs0.G(ag0, 1);
        boolean z3 = false;
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
                            np3 = np32;
                        } else if (l == 1) {
                            np3 = np3.y;
                        } else if (l != 2) {
                            np3 = null;
                        } else {
                            np3 = np3.z;
                        }
                        if (np3 == null) {
                            G2.f0(o);
                            G2.f0(l);
                        } else {
                            this.x |= 8;
                            this.B = np3;
                        }
                    } else if (o == 32) {
                        if (!(z3 & true)) {
                            this.C = new ArrayList();
                            z3 |= true;
                        }
                        this.C.add(Integer.valueOf(ts0.l()));
                    } else if (o == 34) {
                        int e = ts0.e(ts0.l());
                        if (!(z3 & true) && ts0.c() > 0) {
                            this.C = new ArrayList();
                            z3 |= true;
                        }
                        while (ts0.c() > 0) {
                            this.C.add(Integer.valueOf(ts0.l()));
                        }
                        ts0.d(e);
                    } else if (o == 40) {
                        if (!(z3 & true)) {
                            this.E = new ArrayList();
                            z3 |= true;
                        }
                        this.E.add(Integer.valueOf(ts0.l()));
                    } else if (o == 42) {
                        int e2 = ts0.e(ts0.l());
                        if (!(z3 & true) && ts0.c() > 0) {
                            this.E = new ArrayList();
                            z3 |= true;
                        }
                        while (ts0.c() > 0) {
                            this.E.add(Integer.valueOf(ts0.l()));
                        }
                        ts0.d(e2);
                    } else if (o == 50) {
                        b94 f = ts0.f();
                        this.x |= 4;
                        this.A = f;
                    } else if (ts0.r(o, G2)) {
                    }
                }
                z2 = true;
            } catch (InvalidProtocolBufferException e3) {
                e3.w = this;
                throw e3;
            } catch (IOException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e4.getMessage());
                invalidProtocolBufferException.w = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (z3 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
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
        if (z3 & true) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if (z3 & true) {
            this.E = Collections.unmodifiableList(this.E);
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
        if (this.G == 1) {
            return true;
        }
        this.G = 1;
        return true;
    }

    public final int c() {
        int i;
        List list;
        List list2;
        bg0 bg0;
        int i2 = this.H;
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
        if ((this.x & 8) == 8) {
            i += xs0.k(3, this.B.w);
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = this.C.size();
            list = this.C;
            if (i3 >= size) {
                break;
            }
            i4 += xs0.m(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int i5 = i + i4;
        if (!list.isEmpty()) {
            i5 = i5 + 1 + xs0.m(i4);
        }
        this.D = i4;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int size2 = this.E.size();
            list2 = this.E;
            if (i6 >= size2) {
                break;
            }
            i7 += xs0.m(((Integer) list2.get(i6)).intValue());
            i6++;
        }
        int i8 = i5 + i7;
        if (!list2.isEmpty()) {
            i8 = i8 + 1 + xs0.m(i7);
        }
        this.F = i7;
        if ((this.x & 4) == 4) {
            Object obj = this.A;
            if (obj instanceof String) {
                try {
                    bg0 = new b94(((String) obj).getBytes("UTF-8"));
                    this.A = bg0;
                } catch (UnsupportedEncodingException e) {
                    ku4.o("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                bg0 = (bg0) obj;
            }
            i8 += bg0.size() + xs0.p(bg0.size()) + xs0.r(6);
        }
        int size3 = this.w.size() + i8;
        this.H = size3;
        return size3;
    }

    public final ru2 d() {
        return mp3.g();
    }

    public final ru2 e() {
        mp3 g = mp3.g();
        g.h(this);
        return g;
    }

    public final void f(xs0 xs0) {
        bg0 bg0;
        c();
        if ((this.x & 1) == 1) {
            xs0.W(1, this.y);
        }
        if ((this.x & 2) == 2) {
            xs0.W(2, this.z);
        }
        if ((this.x & 8) == 8) {
            xs0.V(3, this.B.w);
        }
        if (this.C.size() > 0) {
            xs0.f0(34);
            xs0.f0(this.D);
        }
        for (int i = 0; i < this.C.size(); i++) {
            xs0.X(((Integer) this.C.get(i)).intValue());
        }
        if (this.E.size() > 0) {
            xs0.f0(42);
            xs0.f0(this.F);
        }
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            xs0.X(((Integer) this.E.get(i2)).intValue());
        }
        if ((this.x & 4) == 4) {
            Object obj = this.A;
            if (obj instanceof String) {
                try {
                    bg0 = new b94(((String) obj).getBytes("UTF-8"));
                    this.A = bg0;
                } catch (UnsupportedEncodingException e) {
                    ku4.o("UTF-8 not supported?", e);
                    return;
                }
            } else {
                bg0 = (bg0) obj;
            }
            xs0.h0(6, 2);
            xs0.f0(bg0.size());
            xs0.b0(bg0);
        }
        xs0.b0(this.w);
    }

    public op3() {
        this.D = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.w = bg0.w;
    }

    public op3(mp3 mp3) {
        this.D = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.w = mp3.w;
    }
}
