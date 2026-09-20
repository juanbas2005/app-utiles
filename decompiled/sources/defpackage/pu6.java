package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pu6 implements cf3 {
    public final qq4 a = new qq4();
    public final wv2 b = new wv2(5);
    public final ze1 c = new ze1(3, new bj(2, (f61) null, 3));

    public pu6(String str) {
    }

    public final Object a(h61 h61) {
        return new Integer(((AtomicInteger) this.b.x).get());
    }

    public final Object b(if1 if1) {
        return new Integer(((AtomicInteger) this.b.x).incrementAndGet());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r8 == r5) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r8 != r5) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object c(vr2 vr2, h61 h61) {
        nu6 nu6;
        int i;
        qq4 qq4;
        qq4 qq42;
        qq4 qq43;
        if (h61 instanceof nu6) {
            nu6 = (nu6) h61;
            int i2 = nu6.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nu6.D = i2 - Integer.MIN_VALUE;
                Object obj = nu6.B;
                i = nu6.D;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    nu6.z = vr2;
                    qq4 qq44 = this.a;
                    nu6.A = qq44;
                    nu6.D = 1;
                    Object a2 = qq44.a(nu6);
                    qq42 = qq44;
                } else if (i == 1) {
                    qq4 qq45 = nu6.A;
                    vr2 = (vr2) nu6.z;
                    o85.q(obj);
                    qq42 = qq45;
                } else if (i == 2) {
                    oq4 oq4 = (oq4) nu6.z;
                    try {
                        qq43 = oq4;
                        o85.q(obj);
                        qq43 = oq4;
                        qq4 = oq4;
                        qq4.k((Object) null);
                        return obj;
                    } catch (Throwable th) {
                        qq43.k((Object) null);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qq43 = qq42;
                nu6.z = qq42;
                nu6.A = null;
                nu6.D = 2;
                obj = vr2.y(nu6);
                qq4 = qq42;
            }
        }
        nu6 = new nu6(this, h61);
        Object obj2 = nu6.B;
        i = nu6.D;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        qq43 = qq42;
        nu6.z = qq42;
        nu6.A = null;
        nu6.D = 2;
        obj2 = vr2.y(nu6);
        qq4 = qq42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object d(gs2 gs2, h61 h61) {
        ou6 ou6;
        int i;
        Throwable th;
        qq4 qq4;
        boolean z;
        if (h61 instanceof ou6) {
            ou6 = (ou6) h61;
            int i2 = ou6.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ou6.D = i2 - Integer.MIN_VALUE;
                Object obj = ou6.B;
                i = ou6.D;
                if (i != 0) {
                    o85.q(obj);
                    qq4 qq42 = this.a;
                    boolean g = qq42.g();
                    try {
                        Boolean valueOf = Boolean.valueOf(g);
                        ou6.z = qq42;
                        ou6.A = g;
                        ou6.D = 1;
                        Object H = gs2.H(valueOf, ou6);
                        p81 p81 = p81.w;
                        if (H == p81) {
                            return p81;
                        }
                        Object obj2 = H;
                        qq4 = qq42;
                        z = g;
                        obj = obj2;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        qq4 = qq42;
                        z = g;
                        th = th3;
                        if (z) {
                            qq4.k((Object) null);
                        }
                        throw th;
                    }
                } else if (i == 1) {
                    z = ou6.A;
                    qq4 = ou6.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (z) {
                    qq4.k((Object) null);
                }
                return obj;
            }
        }
        ou6 = new ou6(this, h61);
        Object obj3 = ou6.B;
        i = ou6.D;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }

    public final di2 e() {
        return this.c;
    }
}
