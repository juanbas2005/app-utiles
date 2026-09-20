package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vd5 implements kl7, cw5 {
    public final gs2 a;
    public final ua6 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public jl7 d;

    public vd5(gs2 gs2, ua6 ua6) {
        ua6.getClass();
        this.a = gs2;
        this.b = ua6;
    }

    public final Object a(jl7 jl7, gs2 gs2, a97 a97) {
        return this.a.H(new zc(this, jl7, gs2, (f61) null, 2), a97);
    }

    public final Boolean b(f61 f61) {
        boolean z;
        if (this.d != null || this.b.Z()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final ua6 c() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r9 == r5) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        defpackage.dh4.f(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object d(String str, vr2 vr2, h61 h61) {
        td5 td5;
        Object obj;
        int i;
        if (h61 instanceof td5) {
            td5 = (td5) h61;
            int i2 = td5.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                td5.D = i2 - Integer.MIN_VALUE;
                obj = td5.B;
                i = td5.D;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    td5.z = str;
                    td5.A = vr2;
                    td5.D = 1;
                    obj = b(td5);
                } else if (i == 1) {
                    vr2 = td5.A;
                    str = td5.z;
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) obj).booleanValue()) {
                    ud5 ud5 = new ud5(this, str, vr2, (f61) null);
                    td5.z = null;
                    td5.A = null;
                    td5.D = 2;
                    Object H = this.a.H(ud5, td5);
                    if (H == p81) {
                        return p81;
                    }
                    return H;
                }
                ab6 k0 = this.b.k0(str);
                Object y = vr2.y(k0);
                dh4.f(k0, (Throwable) null);
                return y;
            }
        }
        td5 = new td5(this, h61);
        obj = td5.B;
        i = td5.D;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r4.decrementAndGet() == 0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0090, code lost:
        r7.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        defpackage.l55.m(r6, "ROLLBACK TRANSACTION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        defpackage.su0.b(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public final Object e(jl7 jl7, gs2 gs2, h61 h61) {
        sd5 sd5;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        if (h61 instanceof sd5) {
            sd5 = (sd5) h61;
            int i3 = sd5.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sd5.C = i3 - Integer.MIN_VALUE;
                Object obj = sd5.A;
                i = sd5.C;
                atomicInteger = this.c;
                i2 = 1;
                ua6 ua6 = this.b;
                if (i != 0) {
                    o85.q(obj);
                    int ordinal = jl7.ordinal();
                    if (ordinal == 0) {
                        l55.m(ua6, "BEGIN DEFERRED TRANSACTION");
                    } else if (ordinal == 1) {
                        l55.m(ua6, "BEGIN IMMEDIATE TRANSACTION");
                    } else if (ordinal == 2) {
                        l55.m(ua6, "BEGIN EXCLUSIVE TRANSACTION");
                    } else {
                        h.c();
                        return null;
                    }
                    if (atomicInteger.incrementAndGet() > 0) {
                        this.d = jl7;
                    }
                    rd5 rd5 = new rd5(0, this);
                    sd5.z = 1;
                    sd5.C = 1;
                    obj = gs2.H(rd5, sd5);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    i2 = sd5.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.d = null;
                }
                if (i2 == 0) {
                    l55.m(ua6, "END TRANSACTION");
                    return obj;
                }
                l55.m(ua6, "ROLLBACK TRANSACTION");
                return obj;
            }
        }
        sd5 = new sd5(this, h61);
        Object obj2 = sd5.A;
        i = sd5.C;
        atomicInteger = this.c;
        i2 = 1;
        ua6 ua62 = this.b;
        if (i != 0) {
        }
        if (atomicInteger.decrementAndGet() == 0) {
        }
        if (i2 == 0) {
        }
    }
}
