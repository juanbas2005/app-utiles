package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: ms5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ms5 extends vu2 {
    public int A;
    public List B;
    public List C;
    public Object D;
    public zu2 E;
    public zu2 F;
    public final /* synthetic */ int z;

    public /* synthetic */ ms5(int i) {
        this.z = i;
    }

    public static ms5 i() {
        ms5 ms5 = new ms5(0);
        List list = Collections.EMPTY_LIST;
        ms5.B = list;
        ms5.C = list;
        ms5.D = list;
        ms5.E = ht5.C;
        ms5.F = ot5.A;
        return ms5;
    }

    public static ms5 j() {
        ms5 ms5 = new ms5(1);
        ms5.D = ws5.A;
        ms5.E = us5.A;
        ms5.F = ns5.G;
        List list = Collections.EMPTY_LIST;
        ms5.B = list;
        ms5.C = list;
        return ms5;
    }

    public final k2 c() {
        switch (this.z) {
            case b85.b:
                ns5 g = g();
                if (g.a()) {
                    return g;
                }
                throw new UninitializedMessageException();
            default:
                os5 h = h();
                if (h.a()) {
                    return h;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.z) {
            case b85.b:
                ms5 i = i();
                i.k(g());
                return i;
            default:
                ms5 j = j();
                j.l(h());
                return j;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ns5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: os5} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        ns5 ns5;
        os5 os5;
        ? r1 = 0;
        switch (this.z) {
            case b85.b:
                try {
                    ns5.H.getClass();
                    k(new ns5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ns5 = (ns5) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1 = ns5;
                    break;
                }
            default:
                try {
                    os5.H.getClass();
                    l(new os5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    os5 = (os5) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = os5;
                    break;
                }
        }
        if (r1 != 0) {
            k(r1);
        }
        throw th;
        if (r1 != 0) {
            l(r1);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.z) {
            case b85.b:
                k((ns5) zu2);
                return this;
            default:
                l((os5) zu2);
                return this;
        }
    }

    public ns5 g() {
        ns5 ns5 = new ns5(this);
        int i = this.A;
        int i2 = 1;
        if ((i & 1) == 1) {
            this.B = Collections.unmodifiableList(this.B);
            this.A &= -2;
        }
        ns5.z = this.B;
        if ((this.A & 2) == 2) {
            this.C = Collections.unmodifiableList(this.C);
            this.A &= -3;
        }
        ns5.A = this.C;
        if ((this.A & 4) == 4) {
            this.D = Collections.unmodifiableList((List) this.D);
            this.A &= -5;
        }
        ns5.B = (List) this.D;
        if ((i & 8) != 8) {
            i2 = 0;
        }
        ns5.C = (ht5) this.E;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        ns5.D = (ot5) this.F;
        ns5.y = i2;
        return ns5;
    }

    public os5 h() {
        os5 os5 = new os5(this);
        int i = this.A;
        int i2 = 1;
        if ((i & 1) != 1) {
            i2 = 0;
        }
        os5.z = (ws5) this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        os5.A = (us5) this.E;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        os5.B = (ns5) this.F;
        if ((i & 8) == 8) {
            this.B = Collections.unmodifiableList(this.B);
            this.A &= -9;
        }
        os5.C = this.B;
        if ((this.A & 16) == 16) {
            this.C = Collections.unmodifiableList(this.C);
            this.A &= -17;
        }
        os5.D = this.C;
        os5.y = i2;
        return os5;
    }

    public void k(ns5 ns5) {
        ot5 ot5;
        ht5 ht5;
        if (ns5 != ns5.G) {
            if (!ns5.z.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = ns5.z;
                    this.A &= -2;
                } else {
                    if ((this.A & 1) != 1) {
                        this.B = new ArrayList(this.B);
                        this.A |= 1;
                    }
                    this.B.addAll(ns5.z);
                }
            }
            if (!ns5.A.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = ns5.A;
                    this.A &= -3;
                } else {
                    if ((this.A & 2) != 2) {
                        this.C = new ArrayList(this.C);
                        this.A |= 2;
                    }
                    this.C.addAll(ns5.A);
                }
            }
            if (!ns5.B.isEmpty()) {
                if (((List) this.D).isEmpty()) {
                    this.D = ns5.B;
                    this.A &= -5;
                } else {
                    if ((this.A & 4) != 4) {
                        this.D = new ArrayList((List) this.D);
                        this.A |= 4;
                    }
                    ((List) this.D).addAll(ns5.B);
                }
            }
            if ((ns5.y & 1) == 1) {
                ht5 ht52 = ns5.C;
                if ((this.A & 8) != 8 || (ht5 = (ht5) this.E) == ht5.C) {
                    this.E = ht52;
                } else {
                    pr5 i = ht5.i(ht5);
                    i.j(ht52);
                    this.E = i.g();
                }
                this.A |= 8;
            }
            if ((ns5.y & 2) == 2) {
                ot5 ot52 = ns5.D;
                if ((this.A & 16) != 16 || (ot5 = (ot5) this.F) == ot5.A) {
                    this.F = ot52;
                } else {
                    xr5 xr5 = new xr5(2);
                    xr5.z = Collections.EMPTY_LIST;
                    xr5.m(ot5);
                    xr5.m(ot52);
                    this.F = xr5.i();
                }
                this.A |= 16;
            }
            f(ns5);
            this.w = this.w.f(ns5.x);
        }
    }

    public void l(os5 os5) {
        ns5 ns5;
        us5 us5;
        ws5 ws5;
        if (os5 != os5.G) {
            if ((os5.y & 1) == 1) {
                ws5 ws52 = os5.z;
                if ((this.A & 1) != 1 || (ws5 = (ws5) this.D) == ws5.A) {
                    this.D = ws52;
                } else {
                    xr5 xr5 = new xr5(3);
                    xr5.z = c44.x;
                    xr5.l(ws5);
                    xr5.l(ws52);
                    this.D = xr5.h();
                }
                this.A |= 1;
            }
            if ((os5.y & 2) == 2) {
                us5 us52 = os5.A;
                if ((this.A & 2) != 2 || (us5 = (us5) this.E) == us5.A) {
                    this.E = us52;
                } else {
                    xr5 xr52 = new xr5(1);
                    xr52.z = Collections.EMPTY_LIST;
                    xr52.k(us5);
                    xr52.k(us52);
                    this.E = xr52.g();
                }
                this.A |= 2;
            }
            if ((os5.y & 4) == 4) {
                ns5 ns52 = os5.B;
                if ((this.A & 4) != 4 || (ns5 = (ns5) this.F) == ns5.G) {
                    this.F = ns52;
                } else {
                    ms5 i = i();
                    i.k(ns5);
                    i.k(ns52);
                    this.F = i.g();
                }
                this.A |= 4;
            }
            if (!os5.C.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = os5.C;
                    this.A &= -9;
                } else {
                    if ((this.A & 8) != 8) {
                        this.B = new ArrayList(this.B);
                        this.A |= 8;
                    }
                    this.B.addAll(os5.C);
                }
            }
            if (!os5.D.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = os5.D;
                    this.A &= -17;
                } else {
                    if ((this.A & 16) != 16) {
                        this.C = new ArrayList(this.C);
                        this.A |= 16;
                    }
                    this.C.addAll(os5.D);
                }
            }
            f(os5);
            this.w = this.w.f(os5.x);
        }
    }
}
