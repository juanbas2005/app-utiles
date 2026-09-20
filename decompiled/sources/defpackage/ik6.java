package defpackage;

import android.view.autofill.AutofillValue;

/* renamed from: ik6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ik6 {
    public final uy3 a;
    public final e42 b;
    public final me3 c;
    public final lp4 d = new lp4(2);

    public ik6(uy3 uy3, e42 e42, yo4 yo4) {
        this.a = uy3;
        this.b = e42;
        this.c = yo4;
    }

    public final fk6 a() {
        return new fk6(this.b, false, this.a, new ak6());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0135  */
    public final void b(uy3 uy3, ak6 ak6) {
        cf cfVar;
        cf cfVar2;
        boolean z;
        String str;
        String str2;
        ij7 ij7;
        ij7 ij72;
        ag agVar;
        ag agVar2;
        Boolean bool;
        ak6 ak62 = ak6;
        lp4 lp4 = this.d;
        Object[] objArr = lp4.a;
        int i = lp4.b;
        for (int i2 = 0; i2 < i; i2++) {
            md mdVar = (md) objArr[i2];
            mdVar.getClass();
            ak6 x = uy3.x();
            int i3 = uy3.x;
            kg5 kg5 = mdVar.w;
            je jeVar = mdVar.y;
            if (ak62 != null) {
                Object g = ak62.w.g(jk6.s);
                if (g == null) {
                    g = null;
                }
                cfVar = (cf) g;
            } else {
                cfVar = null;
            }
            if (x != null) {
                Object g2 = x.w.g(jk6.s);
                if (g2 == null) {
                    g2 = null;
                }
                cfVar2 = (cf) g2;
            } else {
                cfVar2 = null;
            }
            cf cfVar3 = pe2.z;
            boolean z2 = true;
            if (!sg3.e(cfVar2, cfVar3)) {
                if (sg3.e(cfVar, cfVar3) && !sg3.e(cfVar2, cfVar3)) {
                    kg5.B(jeVar, i3, true);
                }
                if (ak62 != null) {
                    Object g3 = ak62.w.g(jk6.F);
                    if (g3 == null) {
                        g3 = null;
                    }
                    vl vlVar = (vl) g3;
                    if (vlVar != null) {
                        str = vlVar.x;
                        if (x != null) {
                            Object g4 = x.w.g(jk6.F);
                            if (g4 == null) {
                                g4 = null;
                            }
                            vl vlVar2 = (vl) g4;
                            if (vlVar2 != null) {
                                str2 = vlVar2.x;
                                if (str != str2) {
                                    if (str == null) {
                                        kg5.B(jeVar, i3, true);
                                    } else if (str2 == null) {
                                        kg5.B(jeVar, i3, false);
                                    } else if (sg3.e(cfVar2, pe2.A)) {
                                        kg5.w().notifyValueChanged(jeVar, i3, AutofillValue.forText(r16.i0(str2)));
                                    }
                                }
                                if (ak62 != null) {
                                    Object g5 = ak62.w.g(jk6.K);
                                    if (g5 == null) {
                                        g5 = null;
                                    }
                                    ij7 = (ij7) g5;
                                } else {
                                    ij7 = null;
                                }
                                if (x != null) {
                                    Object g6 = x.w.g(jk6.K);
                                    if (g6 == null) {
                                        g6 = null;
                                    }
                                    ij72 = (ij7) g6;
                                } else {
                                    ij72 = null;
                                }
                                if (ij7 != ij72) {
                                    if (ij7 == null) {
                                        kg5.B(jeVar, i3, true);
                                    } else if (ij72 == null) {
                                        kg5.B(jeVar, i3, false);
                                    } else if (sg3.e(cfVar2, pe2.B)) {
                                        int ordinal = ij72.ordinal();
                                        if (ordinal == 0) {
                                            bool = Boolean.TRUE;
                                        } else if (ordinal != 1) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.FALSE;
                                        }
                                        if (bool != null) {
                                            kg5.w().notifyValueChanged(jeVar, i3, AutofillValue.forToggle(bool.booleanValue()));
                                        }
                                    }
                                }
                                if (ak62 != null) {
                                    Object g7 = ak62.w.g(jk6.t);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    agVar = (ag) g7;
                                } else {
                                    agVar = null;
                                }
                                if (x != null) {
                                    Object g8 = x.w.g(jk6.t);
                                    if (g8 == null) {
                                        g8 = null;
                                    }
                                    agVar2 = (ag) g8;
                                } else {
                                    agVar2 = null;
                                }
                                if (!sg3.e(agVar, agVar2)) {
                                    if (agVar == null) {
                                        kg5.B(jeVar, i3, true);
                                    } else if (agVar2 == null) {
                                        kg5.B(jeVar, i3, false);
                                    } else {
                                        kg5.w().notifyValueChanged(jeVar, i3, agVar2.a);
                                    }
                                }
                            }
                        }
                        str2 = null;
                        if (str != str2) {
                        }
                        if (ak62 != null) {
                        }
                        if (x != null) {
                        }
                        if (ij7 != ij72) {
                        }
                        if (ak62 != null) {
                        }
                        if (x != null) {
                        }
                        if (!sg3.e(agVar, agVar2)) {
                        }
                    }
                }
                str = null;
                if (x != null) {
                }
                str2 = null;
                if (str != str2) {
                }
                if (ak62 != null) {
                }
                if (x != null) {
                }
                if (ij7 != ij72) {
                }
                if (ak62 != null) {
                }
                if (x != null) {
                }
                if (!sg3.e(agVar, agVar2)) {
                }
            } else if (!sg3.e(cfVar, cfVar3)) {
                kg5.B(jeVar, i3, false);
            }
            if (ak62 == null || !ak62.w.b(jk6.r)) {
                z = false;
            } else {
                z = true;
            }
            if (x == null || !x.w.b(jk6.r)) {
                z2 = false;
            }
            if (z != z2) {
                zo4 zo4 = mdVar.D;
                if (z2) {
                    zo4.a(i3);
                } else {
                    zo4.f(i3);
                }
            }
        }
    }
}
