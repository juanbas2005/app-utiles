package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: xr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xr5 extends ru2 implements yj4 {
    public final /* synthetic */ int x;
    public int y;
    public List z;

    public /* synthetic */ xr5(int i) {
        this.x = i;
    }

    public final k2 c() {
        switch (this.x) {
            case b85.b:
                yr5 f = f();
                if (f.a()) {
                    return f;
                }
                throw new UninitializedMessageException();
            case 1:
                us5 g = g();
                if (g.a()) {
                    return g;
                }
                throw new UninitializedMessageException();
            case 2:
                ot5 i = i();
                i.a();
                return i;
            default:
                ws5 h = h();
                h.a();
                return h;
        }
    }

    public final Object clone() {
        switch (this.x) {
            case b85.b:
                xr5 xr5 = new xr5(0);
                xr5.z = Collections.EMPTY_LIST;
                xr5.j(f());
                return xr5;
            case 1:
                xr5 xr52 = new xr5(1);
                xr52.z = Collections.EMPTY_LIST;
                xr52.k(g());
                return xr52;
            case 2:
                xr5 xr53 = new xr5(2);
                xr53.z = Collections.EMPTY_LIST;
                xr53.m(i());
                return xr53;
            default:
                xr5 xr54 = new xr5(3);
                xr54.z = c44.x;
                xr54.l(h());
                return xr54;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: yr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: us5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ot5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ws5} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ru2 d(ts0 ts0, y92 y92) {
        yr5 yr5;
        us5 us5;
        ot5 ot5;
        ws5 ws5;
        ? r1 = 0;
        switch (this.x) {
            case b85.b:
                try {
                    yr5.B.getClass();
                    j(new yr5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    yr5 = (yr5) e.w;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1 = yr5;
                    break;
                }
            case 1:
                try {
                    us5.B.getClass();
                    k(new us5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e2) {
                    us5 = (us5) e2.w;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = us5;
                    break;
                }
            case 2:
                try {
                    ot5.B.getClass();
                    m(new ot5(ts0, y92));
                    return this;
                } catch (InvalidProtocolBufferException e3) {
                    ot5 = (ot5) e3.w;
                    throw e3;
                } catch (Throwable th3) {
                    th = th3;
                    r1 = ot5;
                    break;
                }
            default:
                try {
                    ws5.B.getClass();
                    l(new ws5(ts0));
                    return this;
                } catch (InvalidProtocolBufferException e4) {
                    ws5 = (ws5) e4.w;
                    throw e4;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = ws5;
                    break;
                }
        }
        if (r1 != 0) {
            j(r1);
        }
        throw th;
        if (r1 != 0) {
            k(r1);
        }
        throw th;
        if (r1 != 0) {
            m(r1);
        }
        throw th;
        if (r1 != 0) {
            l(r1);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ ru2 e(zu2 zu2) {
        switch (this.x) {
            case b85.b:
                j((yr5) zu2);
                return this;
            case 1:
                k((us5) zu2);
                return this;
            case 2:
                m((ot5) zu2);
                return this;
            default:
                l((ws5) zu2);
                return this;
        }
    }

    public yr5 f() {
        yr5 yr5 = new yr5(this);
        if ((this.y & 1) == 1) {
            this.z = Collections.unmodifiableList(this.z);
            this.y &= -2;
        }
        yr5.x = this.z;
        return yr5;
    }

    public us5 g() {
        us5 us5 = new us5(this);
        if ((this.y & 1) == 1) {
            this.z = Collections.unmodifiableList(this.z);
            this.y &= -2;
        }
        us5.x = this.z;
        return us5;
    }

    public ws5 h() {
        ws5 ws5 = new ws5(this);
        if ((this.y & 1) == 1) {
            this.z = ((f44) this.z).c();
            this.y &= -2;
        }
        ws5.x = (f44) this.z;
        return ws5;
    }

    public ot5 i() {
        ot5 ot5 = new ot5(this);
        if ((this.y & 1) == 1) {
            this.z = Collections.unmodifiableList(this.z);
            this.y &= -2;
        }
        ot5.x = this.z;
        return ot5;
    }

    public void j(yr5 yr5) {
        if (yr5 != yr5.A) {
            if (!yr5.x.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = yr5.x;
                    this.y &= -2;
                } else {
                    if ((this.y & 1) != 1) {
                        this.z = new ArrayList(this.z);
                        this.y |= 1;
                    }
                    this.z.addAll(yr5.x);
                }
            }
            this.w = this.w.f(yr5.w);
        }
    }

    public void k(us5 us5) {
        if (us5 != us5.A) {
            if (!us5.x.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = us5.x;
                    this.y &= -2;
                } else {
                    if ((this.y & 1) != 1) {
                        this.z = new ArrayList(this.z);
                        this.y |= 1;
                    }
                    this.z.addAll(us5.x);
                }
            }
            this.w = this.w.f(us5.w);
        }
    }

    public void l(ws5 ws5) {
        if (ws5 != ws5.A) {
            if (!ws5.x.isEmpty()) {
                if (((f44) this.z).isEmpty()) {
                    this.z = ws5.x;
                    this.y &= -2;
                } else {
                    if ((this.y & 1) != 1) {
                        this.z = new c44((f44) this.z);
                        this.y |= 1;
                    }
                    ((f44) this.z).addAll(ws5.x);
                }
            }
            this.w = this.w.f(ws5.w);
        }
    }

    public void m(ot5 ot5) {
        if (ot5 != ot5.A) {
            if (!ot5.x.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = ot5.x;
                    this.y &= -2;
                } else {
                    if ((this.y & 1) != 1) {
                        this.z = new ArrayList(this.z);
                        this.y |= 1;
                    }
                    this.z.addAll(ot5.x);
                }
            }
            this.w = this.w.f(ot5.w);
        }
    }
}
