package defpackage;

import java.util.Iterator;

/* renamed from: ze1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze1 implements di2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ ze1(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018e  */
    public final Object a(fi2 fi2, f61 f61) {
        ki2 ki2;
        int i;
        int i2;
        int i3;
        Iterator it;
        qk3 qk3;
        int i4;
        h1 h1Var;
        int i5;
        vd6 vd6;
        Throwable th;
        zp6 zp6;
        int i6;
        pz6 pz6;
        int i7;
        int i8 = this.w;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj = this.x;
        switch (i8) {
            case b85.b:
                Object a = ((qi2) obj).a(new b6(fi2, 7), f61);
                if (a == p81) {
                    return a;
                }
                return vs7;
            case 1:
                if (f61 instanceof ki2) {
                    ki2 = (ki2) f61;
                    int i9 = ki2.A;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ki2.A = i9 - Integer.MIN_VALUE;
                        Object obj2 = ki2.z;
                        i = ki2.A;
                        if (i != 0) {
                            o85.q(obj2);
                            i2 = 0;
                            it = ((Iterable) obj).iterator();
                            i3 = 0;
                        } else if (i == 1) {
                            int i10 = ki2.F;
                            int i11 = ki2.E;
                            it = ki2.D;
                            fi2 fi22 = ki2.C;
                            o85.q(obj2);
                            i3 = i11;
                            i2 = i10;
                            fi2 = fi22;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            ki2.C = fi2;
                            ki2.D = it;
                            ki2.E = i3;
                            ki2.F = i2;
                            ki2.A = 1;
                            if (fi2.k(next, ki2) == p81) {
                                return p81;
                            }
                        }
                        return vs7;
                    }
                }
                ki2 = new ki2(this, f61);
                Object obj22 = ki2.z;
                i = ki2.A;
                if (i != 0) {
                }
                while (it.hasNext()) {
                }
                return vs7;
            case 2:
                if (f61 instanceof qk3) {
                    qk3 = (qk3) f61;
                    int i12 = qk3.A;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        qk3.A = i12 - Integer.MIN_VALUE;
                        Object obj3 = qk3.z;
                        i4 = qk3.A;
                        if (i4 != 0) {
                            o85.q(obj3);
                            b6 b6Var = new b6(fi2, 9);
                            qk3.A = 1;
                            if (((xi0) obj).a(b6Var, qk3) == p81) {
                                return p81;
                            }
                        } else if (i4 == 1) {
                            o85.q(obj3);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        return vs7;
                    }
                }
                qk3 = new qk3(this, f61);
                Object obj32 = qk3.z;
                i4 = qk3.A;
                if (i4 != 0) {
                }
                return vs7;
            case 3:
                if (f61 instanceof h1) {
                    h1Var = (h1) f61;
                    int i13 = h1Var.C;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        h1Var.C = i13 - Integer.MIN_VALUE;
                        Object obj4 = h1Var.A;
                        i5 = h1Var.C;
                        if (i5 != 0) {
                            o85.q(obj4);
                            e81 e81 = h1Var.x;
                            e81.getClass();
                            vd6 vd62 = new vd6(fi2, e81);
                            try {
                                h1Var.z = vd62;
                                h1Var.C = 1;
                                Object H = ((gs2) obj).H(vd62, h1Var);
                                if (H != p81) {
                                    H = vs7;
                                }
                                if (H == p81) {
                                    return p81;
                                }
                                vd6 = vd62;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                vd6 = vd62;
                                th = th3;
                                vd6.t();
                                throw th;
                            }
                        } else if (i5 == 1) {
                            vd6 = h1Var.z;
                            try {
                                o85.q(obj4);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vd6.t();
                        return vs7;
                    }
                }
                h1Var = new h1(this, f61);
                Object obj42 = h1Var.A;
                i5 = h1Var.C;
                if (i5 != 0) {
                }
                vd6.t();
                return vs7;
            case 4:
                if (f61 instanceof zp6) {
                    zp6 = (zp6) f61;
                    int i14 = zp6.A;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        zp6.A = i14 - Integer.MIN_VALUE;
                        Object obj5 = zp6.z;
                        i6 = zp6.A;
                        if (i6 != 0) {
                            o85.q(obj5);
                            b6 b6Var2 = new b6(fi2, 19);
                            zp6.A = 1;
                            if (((c6) obj).a(b6Var2, zp6) == p81) {
                                return p81;
                            }
                        } else if (i6 == 1) {
                            o85.q(obj5);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        return vs7;
                    }
                }
                zp6 = new zp6(this, f61);
                Object obj52 = zp6.z;
                i6 = zp6.A;
                if (i6 != 0) {
                }
                return vs7;
            case 5:
                if (f61 instanceof pz6) {
                    pz6 = (pz6) f61;
                    int i15 = pz6.A;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        pz6.A = i15 - Integer.MIN_VALUE;
                        Object obj6 = pz6.z;
                        i7 = pz6.A;
                        if (i7 != 0) {
                            o85.q(obj6);
                            b6 b6Var3 = new b6(fi2, 21);
                            pz6.A = 1;
                            if (((c6) obj).a(b6Var3, pz6) == p81) {
                                return p81;
                            }
                        } else if (i7 == 1) {
                            o85.q(obj6);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        return vs7;
                    }
                }
                pz6 = new pz6(this, f61);
                Object obj62 = pz6.z;
                i7 = pz6.A;
                if (i7 != 0) {
                }
                return vs7;
            case 6:
                di2[] di2Arr = (di2[]) obj;
                Object S = mp7.S(f61, fi2, new xo3(17, di2Arr), new do1(3, (f61) null, 5), di2Arr);
                if (S == p81) {
                    return S;
                }
                return vs7;
            default:
                Object a2 = ((wj2) obj).a(new wv7(fi2, 9), f61);
                if (a2 == p81) {
                    return a2;
                }
                return vs7;
        }
    }
}
