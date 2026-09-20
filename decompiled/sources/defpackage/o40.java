package defpackage;

import java.io.Serializable;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: o40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o40 implements di2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ o40(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d4  */
    public final Object a(fi2 fi2, f61 f61) {
        l40 l40;
        int i;
        ui2 ui2;
        int i2;
        fi2 fi22;
        ui2 ui22;
        int i3;
        long j;
        int i4;
        long j2;
        Throwable th;
        int i5;
        int i6;
        Throwable th2;
        Object C;
        Serializable x2;
        wi2 wi2;
        int i7;
        n40 n40;
        cs4 cs4;
        int i8;
        dq6 dq6;
        int i9;
        fi2 fi23 = fi2;
        f61 f612 = f61;
        int i10 = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.y;
        Object obj2 = this.x;
        Throwable th3 = null;
        p81 p81 = p81.w;
        switch (i10) {
            case b85.b:
                if (f612 instanceof l40) {
                    l40 = (l40) f612;
                    int i11 = l40.A;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        l40.A = i11 - Integer.MIN_VALUE;
                        Object obj3 = l40.z;
                        i = l40.A;
                        if (i != 0) {
                            o85.q(obj3);
                            n40 n402 = new n40(0, fi23, (String) obj);
                            l40.A = 1;
                            if (((di2) obj2).a(n402, l40) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i == 1) {
                            o85.q(obj3);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                l40 = new l40(this, f612);
                Object obj32 = l40.z;
                i = l40.A;
                if (i != 0) {
                }
            case 1:
                if (f612 instanceof ui2) {
                    ui2 = (ui2) f612;
                    int i12 = ui2.A;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ui2.A = i12 - Integer.MIN_VALUE;
                        Object obj4 = ui2.z;
                        i2 = ui2.A;
                        if (i2 != 0) {
                            o85.q(obj4);
                            j2 = 0;
                            i4 = 0;
                        } else if (i2 == 1) {
                            int i13 = ui2.F;
                            long j3 = ui2.G;
                            int i14 = ui2.E;
                            fi22 = ui2.C;
                            o85.q(obj4);
                            ui2 ui23 = ui2;
                            i3 = i13;
                            long j4 = j3;
                            i6 = i14;
                            ui22 = ui23;
                            j = j4;
                            th2 = (Throwable) obj4;
                            if (th2 == null) {
                                Long l = new Long(j);
                                ui22.C = fi22;
                                ui22.D = th2;
                                ui22.E = i6;
                                ui22.G = j;
                                ui22.F = i3;
                                ui22.A = 2;
                                C = ((qs7) obj).C(fi22, th2, l, ui22);
                                if (C != p81) {
                                    int i15 = i6;
                                    th = th2;
                                    obj4 = C;
                                    ui2 = ui22;
                                    i5 = i15;
                                    if (!((Boolean) obj4).booleanValue()) {
                                        throw th;
                                    }
                                    throw th;
                                }
                                return p81;
                            }
                            i4 = i6;
                            long j5 = j;
                            fi23 = fi22;
                            long j6 = j5;
                            if (i3 == 0) {
                            }
                            return vs7;
                        } else if (i2 == 2) {
                            j = ui2.G;
                            i5 = ui2.E;
                            th = ui2.D;
                            fi22 = ui2.C;
                            o85.q(obj4);
                            if (!((Boolean) obj4).booleanValue()) {
                                j++;
                                i4 = i5;
                                ui22 = ui2;
                                i3 = 1;
                                long j52 = j;
                                fi23 = fi22;
                                long j62 = j52;
                                if (i3 == 0) {
                                    return vs7;
                                }
                                ui2 = ui22;
                                j2 = j62;
                                th3 = null;
                                return vs7;
                            }
                            throw th;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ui2.C = fi23;
                        ui2.D = th3;
                        ui2.E = i4;
                        ui2.G = j2;
                        ui2.F = 0;
                        ui2.A = 1;
                        x2 = gr8.x((wj2) obj2, fi23, ui2);
                        if (x2 != p81) {
                            fi22 = fi23;
                            long j7 = j2;
                            i6 = i4;
                            obj4 = x2;
                            ui22 = ui2;
                            i3 = 0;
                            j = j7;
                            th2 = (Throwable) obj4;
                            if (th2 == null) {
                                i4 = i6;
                                long j522 = j;
                                fi23 = fi22;
                                long j622 = j522;
                                if (i3 == 0) {
                                }
                                return vs7;
                            }
                            Long l2 = new Long(j);
                            ui22.C = fi22;
                            ui22.D = th2;
                            ui22.E = i6;
                            ui22.G = j;
                            ui22.F = i3;
                            ui22.A = 2;
                            C = ((qs7) obj).C(fi22, th2, l2, ui22);
                            if (C != p81) {
                            }
                        }
                        return p81;
                    }
                }
                ui2 = new ui2(this, f612);
                Object obj42 = ui2.z;
                i2 = ui2.A;
                if (i2 != 0) {
                }
                ui2.C = fi23;
                ui2.D = th3;
                ui2.E = i4;
                ui2.G = j2;
                ui2.F = 0;
                ui2.A = 1;
                x2 = gr8.x((wj2) obj2, fi23, ui2);
                if (x2 != p81) {
                }
                return p81;
            case 2:
                if (f612 instanceof wi2) {
                    wi2 = (wi2) f612;
                    int i16 = wi2.A;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        wi2.A = i16 - Integer.MIN_VALUE;
                        Object obj5 = wi2.z;
                        i7 = wi2.A;
                        if (i7 != 0) {
                            o85.q(obj5);
                            qi2 qi2 = (qi2) obj2;
                            n40 n403 = new n40((da0) obj, fi23);
                            try {
                                wi2.C = n403;
                                wi2.A = 1;
                                if (qi2.a(n403, wi2) == p81) {
                                    return p81;
                                }
                                return vs7;
                            } catch (AbortFlowException e) {
                                e = e;
                                n40 = n403;
                                if (e.w == n40) {
                                    e81 e81 = wi2.x;
                                    e81.getClass();
                                    r16.x(e81);
                                    return vs7;
                                }
                                throw e;
                            }
                        } else if (i7 == 1) {
                            n40 = wi2.C;
                            try {
                                o85.q(obj5);
                                return vs7;
                            } catch (AbortFlowException e2) {
                                e = e2;
                            }
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                wi2 = new wi2(this, f612);
                Object obj52 = wi2.z;
                i7 = wi2.A;
                if (i7 != 0) {
                }
            case 3:
                Object S = mp7.S(f612, fi23, x10.G, new yi2((f61) null, (ds2) (jq5) obj, 1), (di2[]) obj2);
                if (S == p81) {
                    return S;
                }
                return vs7;
            case 4:
                Object S2 = mp7.S(f612, fi23, x10.G, new yi2((f61) null, (ds2) (ks2) obj, 2), (di2[]) obj2);
                if (S2 == p81) {
                    return S2;
                }
                return vs7;
            case 5:
                Object a = ((di2) obj2).a(new n40(5, fi23, (rf4) obj), f612);
                if (a == p81) {
                    return a;
                }
                return vs7;
            case 6:
                if (f612 instanceof cs4) {
                    cs4 = (cs4) f612;
                    int i17 = cs4.A;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        cs4.A = i17 - Integer.MIN_VALUE;
                        Object obj6 = cs4.z;
                        i8 = cs4.A;
                        if (i8 != 0) {
                            o85.q(obj6);
                            b6 b6Var = new b6(fi23, (gs4) obj, 16);
                            cs4.A = 1;
                            if (((wj2) obj2).a(b6Var, cs4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i8 == 1) {
                            o85.q(obj6);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                cs4 = new cs4(this, f612);
                Object obj62 = cs4.z;
                i8 = cs4.A;
                if (i8 != 0) {
                }
            default:
                if (f612 instanceof dq6) {
                    dq6 = (dq6) f612;
                    int i18 = dq6.A;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        dq6.A = i18 - Integer.MIN_VALUE;
                        Object obj7 = dq6.z;
                        i9 = dq6.A;
                        if (i9 != 0) {
                            o85.q(obj7);
                            b6 b6Var2 = new b6(fi23, (fq6) obj, 20);
                            dq6.A = 1;
                            if (((c6) obj2).a(b6Var2, dq6) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i9 == 1) {
                            o85.q(obj7);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                dq6 = new dq6(this, f612);
                Object obj72 = dq6.z;
                i9 = dq6.A;
                if (i9 != 0) {
                }
        }
    }
}
