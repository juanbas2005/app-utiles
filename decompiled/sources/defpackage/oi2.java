package defpackage;

/* renamed from: oi2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oi2 implements di2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ di2 x;
    public final /* synthetic */ hs2 y;

    public /* synthetic */ oi2(di2 di2, hs2 hs2, int i) {
        this.w = i;
        this.x = di2;
        this.y = hs2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r0 == r9) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r6.a(r1, r3) == r9) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f8, code lost:
        if (defpackage.pv8.l(r0, r5, r1, r3) != r9) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    public final Object a(fi2 fi2, f61 f61) {
        ni2 ni2;
        int i;
        Throwable th;
        vd6 vd6;
        vd6 vd62;
        ri2 ri2;
        int i2;
        Throwable th2;
        fi2 fi22 = fi2;
        f61 f612 = f61;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        hs2 hs2 = this.y;
        di2 di2 = this.x;
        int i4 = 0;
        p81 p81 = p81.w;
        switch (i3) {
            case b85.b:
                if (f612 instanceof ni2) {
                    ni2 = (ni2) f612;
                    int i5 = ni2.A;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ni2.A = i5 - Integer.MIN_VALUE;
                        Object obj = ni2.z;
                        i = ni2.A;
                        if (i == 0) {
                            if (i == 1) {
                                i4 = ni2.E;
                                fi22 = ni2.C;
                                try {
                                    o85.q(obj);
                                } catch (Throwable th3) {
                                    th = th3;
                                    th7 th7 = new th7(th);
                                    ni2.C = null;
                                    ni2.D = th;
                                    ni2.E = i4;
                                    ni2.A = 2;
                                    break;
                                }
                            } else if (i == 2) {
                                th = (Throwable) ni2.D;
                                o85.q(obj);
                                throw th;
                            } else if (i == 3) {
                                vd6 = (vd6) ni2.D;
                                try {
                                    o85.q(obj);
                                    vd6.t();
                                    return vs7;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } else {
                                h.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            o85.q(obj);
                            ni2.C = fi22;
                            ni2.E = 0;
                            ni2.A = 1;
                            break;
                        }
                        e81 e81 = ni2.x;
                        e81.getClass();
                        vd62 = new vd6(fi22, e81);
                        ni2.C = null;
                        ni2.D = vd62;
                        ni2.E = i4;
                        ni2.A = 3;
                        if (hs2.u(vd62, (Object) null, ni2) != p81) {
                            vd6 = vd62;
                            vd6.t();
                            return vs7;
                        }
                        return p81;
                    }
                }
                ni2 = new ni2(this, f612);
                Object obj2 = ni2.z;
                i = ni2.A;
                if (i == 0) {
                }
                e81 e812 = ni2.x;
                e812.getClass();
                vd62 = new vd6(fi22, e812);
                try {
                    ni2.C = null;
                    ni2.D = vd62;
                    ni2.E = i4;
                    ni2.A = 3;
                    if (hs2.u(vd62, (Object) null, ni2) != p81) {
                    }
                    return p81;
                } catch (Throwable th5) {
                    th = th5;
                    vd6 = vd62;
                    vd6.t();
                    throw th;
                }
            default:
                if (f612 instanceof ri2) {
                    ri2 = (ri2) f612;
                    int i6 = ri2.A;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ri2.A = i6 - Integer.MIN_VALUE;
                        Object obj3 = ri2.z;
                        i2 = ri2.A;
                        if (i2 != 0) {
                            o85.q(obj3);
                            ri2.C = fi22;
                            ri2.D = 0;
                            ri2.A = 1;
                            obj3 = gr8.x(di2, fi22, ri2);
                            break;
                        } else if (i2 == 1) {
                            i4 = ri2.D;
                            fi22 = ri2.C;
                            o85.q(obj3);
                        } else if (i2 == 2) {
                            o85.q(obj3);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            return vs7;
                        }
                        ri2.C = null;
                        ri2.D = i4;
                        ri2.A = 2;
                        if (hs2.u(fi22, th2, ri2) != p81) {
                            return vs7;
                        }
                        return p81;
                    }
                }
                ri2 = new ri2(this, f612);
                Object obj32 = ri2.z;
                i2 = ri2.A;
                if (i2 != 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
        }
    }
}
