package defpackage;

import android.os.Build;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: b6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b6 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fi2 x;

    public /* synthetic */ b6(fi2 fi2, int i) {
        this.w = i;
        this.x = fi2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02aa, code lost:
        if (r5 != null) goto L_0x02af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x080b  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0846  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x08dc  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0932  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x093e  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x09b5  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x09c1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0a2e  */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:640:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a7  */
    public final Object k(Object obj, f61 f61) {
        a6 a6Var;
        int i;
        e6 e6Var;
        int i2;
        g6 g6Var;
        int i3;
        mj mjVar;
        int i4;
        pt ptVar;
        int i5;
        mp7 mp7;
        c31 c31;
        int i6;
        n31 n31;
        int i7;
        boolean z;
        mp7 mp72;
        ye1 ye1;
        int i8;
        l03 l03;
        int i9;
        rk3 rk3;
        int i10;
        xd4 xd4;
        int i11;
        ae4 ae4;
        int i12;
        he4 he4;
        int i13;
        ke4 ke4;
        int i14;
        me4 me4;
        int i15;
        jr4 jr4;
        int i16;
        Object obj2;
        ds4 ds4;
        int i17;
        Object obj3;
        yb5 yb5;
        bu4 bu4;
        int i18;
        so6 so6;
        int i19;
        aq6 aq6;
        int i20;
        eq6 eq6;
        int i21;
        is7 is7;
        za4 za4;
        Locale locale;
        xx3 xx3;
        qz6 qz6;
        int i22;
        a17 a17;
        int i23;
        s97 s97;
        int i24;
        jv7 jv7;
        int i25;
        lv7 lv7;
        int i26;
        nv7 nv7;
        int i27;
        pv7 pv7;
        int i28;
        rv7 rv7;
        int i29;
        tv7 tv7;
        int i30;
        Object obj4 = obj;
        f61 f612 = f61;
        int i31 = this.w;
        boolean z2 = false;
        vs7 vs7 = vs7.a;
        fi2 fi2 = this.x;
        p81 p81 = p81.w;
        Object obj5 = null;
        switch (i31) {
            case b85.b /*0*/:
                if (f612 instanceof a6) {
                    a6Var = (a6) f612;
                    int i32 = a6Var.A;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        a6Var.A = i32 - Integer.MIN_VALUE;
                        Object obj6 = a6Var.z;
                        i = a6Var.A;
                        if (i != 0) {
                            o85.q(obj6);
                            UserDataPreferences userDataPreferences = (UserDataPreferences) obj4;
                            userDataPreferences.getClass();
                            if (userDataPreferences.getAccountId().length() != 0) {
                                obj5 = new u5(userDataPreferences.getAccountId(), userDataPreferences.getAccountName(), userDataPreferences.getAccountEmail(), userDataPreferences.getAccountAvatarUrl(), userDataPreferences.getInvitationCode());
                            }
                            a6Var.A = 1;
                            if (fi2.k(obj5, a6Var) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i == 1) {
                            o85.q(obj6);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                a6Var = new a6(this, f612);
                Object obj62 = a6Var.z;
                i = a6Var.A;
                if (i != 0) {
                }
            case 1:
                if (f612 instanceof e6) {
                    e6Var = (e6) f612;
                    int i33 = e6Var.A;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        e6Var.A = i33 - Integer.MIN_VALUE;
                        Object obj7 = e6Var.z;
                        i2 = e6Var.A;
                        if (i2 != 0) {
                            o85.q(obj7);
                            UserDataPreferences userDataPreferences2 = (UserDataPreferences) obj4;
                            userDataPreferences2.getClass();
                            String licenseStatus = userDataPreferences2.getLicenseStatus();
                            g54.w.getClass();
                            licenseStatus.getClass();
                            Iterator it = g54.B.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (sg3.e(((g54) next).name(), licenseStatus)) {
                                        obj5 = next;
                                    }
                                }
                            }
                            g54 g54 = (g54) obj5;
                            if (g54 == null) {
                                g54 = g54.x;
                            }
                            a54 a54 = new a54(g54, userDataPreferences2.getLicenseTransferId(), userDataPreferences2.getLicenseActivatedAt());
                            e6Var.A = 1;
                            if (fi2.k(a54, e6Var) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i2 == 1) {
                            o85.q(obj7);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                e6Var = new e6(this, f612);
                Object obj72 = e6Var.z;
                i2 = e6Var.A;
                if (i2 != 0) {
                }
            case 2:
                if (f612 instanceof g6) {
                    g6Var = (g6) f612;
                    int i34 = g6Var.A;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        g6Var.A = i34 - Integer.MIN_VALUE;
                        Object obj8 = g6Var.z;
                        i3 = g6Var.A;
                        if (i3 != 0) {
                            o85.q(obj8);
                            UserDataPreferences userDataPreferences3 = (UserDataPreferences) obj4;
                            userDataPreferences3.getClass();
                            int licensePriceTransferCup = userDataPreferences3.getLicensePriceTransferCup();
                            int licensePriceSaldoCup = userDataPreferences3.getLicensePriceSaldoCup();
                            int licenseDiscountPercent = userDataPreferences3.getLicenseDiscountPercent();
                            String licenseDiscountSource = userDataPreferences3.getLicenseDiscountSource();
                            mv1.w.getClass();
                            licenseDiscountSource.getClass();
                            Iterator it2 = mv1.A.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (sg3.e(((mv1) next2).name(), licenseDiscountSource)) {
                                        obj5 = next2;
                                    }
                                }
                            }
                            mv1 mv1 = (mv1) obj5;
                            if (mv1 == null) {
                                mv1 = mv1.x;
                            }
                            b54 b54 = new b54(licensePriceTransferCup, licensePriceSaldoCup, licenseDiscountPercent, mv1, userDataPreferences3.getLicenseCouponCode());
                            g6Var.A = 1;
                            if (fi2.k(b54, g6Var) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i3 == 1) {
                            o85.q(obj8);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                g6Var = new g6(this, f612);
                Object obj82 = g6Var.z;
                i3 = g6Var.A;
                if (i3 != 0) {
                }
            case 3:
                if (f612 instanceof mj) {
                    mjVar = (mj) f612;
                    int i35 = mjVar.A;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        mjVar.A = i35 - Integer.MIN_VALUE;
                        Object obj9 = mjVar.z;
                        i4 = mjVar.A;
                        if (i4 != 0) {
                            o85.q(obj9);
                            List list = ((pb8) obj4).a;
                            ArrayList arrayList = new ArrayList();
                            for (Object next3 : list) {
                                if (next3 instanceof qy2) {
                                    arrayList.add(next3);
                                }
                            }
                            mjVar.A = 1;
                            if (fi2.k(arrayList, mjVar) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i4 == 1) {
                            o85.q(obj9);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                mjVar = new mj(this, f612);
                Object obj92 = mjVar.z;
                i4 = mjVar.A;
                if (i4 != 0) {
                }
            case 4:
                if (f612 instanceof pt) {
                    ptVar = (pt) f612;
                    int i36 = ptVar.A;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ptVar.A = i36 - Integer.MIN_VALUE;
                        Object obj10 = ptVar.z;
                        i5 = ptVar.A;
                        if (i5 != 0) {
                            o85.q(obj10);
                            long j = ((wu6) obj4).a;
                            mp7 mp73 = cv1.L;
                            if (j == 9205357640488583168L) {
                                obj5 = uu6.c;
                            } else {
                                qx5 qx5 = k18.b;
                                if (((double) wu6.d(j)) >= 0.5d && ((double) wu6.b(j)) >= 0.5d) {
                                    float d = wu6.d(j);
                                    if (Float.isInfinite(d) || Float.isNaN(d)) {
                                        mp7 = mp73;
                                    } else {
                                        mp7 = new bv1(dh4.C(wu6.d(j)));
                                    }
                                    float b = wu6.b(j);
                                    if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                                        mp73 = new bv1(dh4.C(wu6.b(j)));
                                    }
                                    obj5 = new uu6(mp7, mp73);
                                }
                            }
                            if (obj5 == null) {
                                return vs7;
                            }
                            ptVar.A = 1;
                            if (fi2.k(obj5, ptVar) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i5 == 1) {
                            o85.q(obj10);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ptVar = new pt(this, f612);
                Object obj102 = ptVar.z;
                i5 = ptVar.A;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (f612 instanceof c31) {
                    c31 = (c31) f612;
                    int i37 = c31.A;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c31.A = i37 - Integer.MIN_VALUE;
                        Object obj11 = c31.z;
                        i6 = c31.A;
                        if (i6 != 0) {
                            o85.q(obj11);
                            if (!(obj4 instanceof q31)) {
                                return vs7;
                            }
                            c31.A = 1;
                            if (fi2.k(obj4, c31) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i6 == 1) {
                            o85.q(obj11);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                c31 = new c31(this, f612);
                Object obj112 = c31.z;
                i6 = c31.A;
                if (i6 != 0) {
                }
            case 6:
                if (f612 instanceof n31) {
                    n31 = (n31) f612;
                    int i38 = n31.A;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        n31.A = i38 - Integer.MIN_VALUE;
                        Object obj12 = n31.z;
                        i7 = n31.A;
                        if (i7 != 0) {
                            o85.q(obj12);
                            long j2 = ((k31) obj4).a;
                            qx5 qx52 = k18.b;
                            mp7 mp74 = cv1.L;
                            int i39 = (int) (3 & j2);
                            int i40 = (((i39 & 2) >> 1) * 3) + ((i39 & 1) << 1);
                            int i41 = (((int) (j2 >> 33)) & ((1 << (i40 + 13)) - 1)) - 1;
                            int i42 = (((1 << (18 - i40)) - 1) & ((int) (j2 >> (i40 + 46)))) - 1;
                            if (i41 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i42 == 0) {
                                z2 = true;
                            }
                            if (!z && !z2) {
                                if (k31.d(j2)) {
                                    mp72 = new bv1(k31.h(j2));
                                } else {
                                    mp72 = mp74;
                                }
                                if (k31.c(j2)) {
                                    mp74 = new bv1(k31.g(j2));
                                }
                                obj5 = new uu6(mp72, mp74);
                            }
                            if (obj5 == null) {
                                return vs7;
                            }
                            n31.A = 1;
                            if (fi2.k(obj5, n31) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i7 == 1) {
                            o85.q(obj12);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                n31 = new n31(this, f612);
                Object obj122 = n31.z;
                i7 = n31.A;
                if (i7 != 0) {
                }
            case 7:
                if (f612 instanceof ye1) {
                    ye1 = (ye1) f612;
                    int i43 = ye1.A;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ye1.A = i43 - Integer.MIN_VALUE;
                        Object obj13 = ye1.z;
                        i8 = ye1.A;
                        if (i8 != 0) {
                            o85.q(obj13);
                            y27 y27 = (y27) obj4;
                            if (y27 instanceof lw5) {
                                throw ((lw5) y27).b;
                            } else if (y27 instanceof de1) {
                                Object obj14 = ((de1) y27).b;
                                ye1.A = 1;
                                if (fi2.k(obj14, ye1) == p81) {
                                    return p81;
                                }
                                return vs7;
                            } else if ((y27 instanceof be2) || (y27 instanceof ks7) || (y27 instanceof qz4)) {
                                h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            } else {
                                h.c();
                            }
                        } else if (i8 == 1) {
                            o85.q(obj13);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                }
                ye1 = new ye1(this, f612);
                Object obj132 = ye1.z;
                i8 = ye1.A;
                if (i8 != 0) {
                }
                return null;
            case 8:
                if (f612 instanceof l03) {
                    l03 = (l03) f612;
                    int i44 = l03.A;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        l03.A = i44 - Integer.MIN_VALUE;
                        Object obj15 = l03.z;
                        i9 = l03.A;
                        if (i9 != 0) {
                            o85.q(obj15);
                            al3 al3 = (al3) obj4;
                            al3.getClass();
                            String str = al3.a;
                            String str2 = al3.b;
                            double d2 = al3.c;
                            long j3 = al3.e;
                            gk3 gk3 = new gk3(str, str2, d2, j3, al3.f, al3.g, rc9.q(j3));
                            l03.A = 1;
                            if (fi2.k(gk3, l03) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i9 == 1) {
                            o85.q(obj15);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                l03 = new l03(this, f612);
                Object obj152 = l03.z;
                i9 = l03.A;
                if (i9 != 0) {
                }
            case 9:
                if (f612 instanceof rk3) {
                    rk3 = (rk3) f612;
                    int i45 = rk3.A;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        rk3.A = i45 - Integer.MIN_VALUE;
                        Object obj16 = rk3.z;
                        i10 = rk3.A;
                        if (i10 != 0) {
                            o85.q(obj16);
                            if (((uy4) obj4) != uy4.w) {
                                z2 = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z2);
                            rk3.A = 1;
                            if (fi2.k(valueOf, rk3) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i10 == 1) {
                            o85.q(obj16);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                rk3 = new rk3(this, f612);
                Object obj162 = rk3.z;
                i10 = rk3.A;
                if (i10 != 0) {
                }
            case 10:
                if (f612 instanceof xd4) {
                    xd4 = (xd4) f612;
                    int i46 = xd4.A;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        xd4.A = i46 - Integer.MIN_VALUE;
                        Object obj17 = xd4.z;
                        i11 = xd4.A;
                        if (i11 != 0) {
                            o85.q(obj17);
                            Boolean valueOf2 = Boolean.valueOf(((dh7) obj4).a);
                            xd4.A = 1;
                            if (fi2.k(valueOf2, xd4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i11 == 1) {
                            o85.q(obj17);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                xd4 = new xd4(this, f612);
                Object obj172 = xd4.z;
                i11 = xd4.A;
                if (i11 != 0) {
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (f612 instanceof ae4) {
                    ae4 = (ae4) f612;
                    int i47 = ae4.A;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ae4.A = i47 - Integer.MIN_VALUE;
                        Object obj18 = ae4.z;
                        i12 = ae4.A;
                        if (i12 != 0) {
                            o85.q(obj18);
                            if (((is7) obj4).b) {
                                return vs7;
                            }
                            ae4.A = 1;
                            if (fi2.k(obj4, ae4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i12 == 1) {
                            o85.q(obj18);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ae4 = new ae4(this, f612);
                Object obj182 = ae4.z;
                i12 = ae4.A;
                if (i12 != 0) {
                }
            case 12:
                if (f612 instanceof he4) {
                    he4 = (he4) f612;
                    int i48 = he4.A;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        he4.A = i48 - Integer.MIN_VALUE;
                        Object obj19 = he4.z;
                        i13 = he4.A;
                        if (i13 != 0) {
                            o85.q(obj19);
                            is7 is72 = new is7(6, (UserDataPreferences) obj4);
                            he4.A = 1;
                            if (fi2.k(is72, he4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i13 == 1) {
                            o85.q(obj19);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                he4 = new he4(this, f612);
                Object obj192 = he4.z;
                i13 = he4.A;
                if (i13 != 0) {
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (f612 instanceof ke4) {
                    ke4 = (ke4) f612;
                    int i49 = ke4.A;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ke4.A = i49 - Integer.MIN_VALUE;
                        Object obj20 = ke4.z;
                        i14 = ke4.A;
                        if (i14 != 0) {
                            o85.q(obj20);
                            if (((String) obj4).length() <= 0) {
                                return vs7;
                            }
                            ke4.A = 1;
                            if (fi2.k(obj4, ke4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i14 == 1) {
                            o85.q(obj20);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ke4 = new ke4(this, f612);
                Object obj202 = ke4.z;
                i14 = ke4.A;
                if (i14 != 0) {
                }
            case 14:
                if (f612 instanceof me4) {
                    me4 = (me4) f612;
                    int i50 = me4.A;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        me4.A = i50 - Integer.MIN_VALUE;
                        Object obj21 = me4.z;
                        i15 = me4.A;
                        if (i15 != 0) {
                            o85.q(obj21);
                            String accountId = ((UserDataPreferences) obj4).getAccountId();
                            me4.A = 1;
                            if (fi2.k(accountId, me4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i15 == 1) {
                            o85.q(obj21);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                me4 = new me4(this, f612);
                Object obj212 = me4.z;
                i15 = me4.A;
                if (i15 != 0) {
                }
            case h75.g /*15*/:
                if (f612 instanceof jr4) {
                    jr4 = (jr4) f612;
                    int i51 = jr4.A;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jr4.A = i51 - Integer.MIN_VALUE;
                        Object obj22 = jr4.z;
                        i16 = jr4.A;
                        if (i16 != 0) {
                            o85.q(obj22);
                            Iterator it3 = ((List) obj4).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj2 = it3.next();
                                    if (((ld8) obj2).b == kd8.w) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            ld8 ld8 = (ld8) obj2;
                            if (ld8 != null) {
                                Long l = new Long(ld8.k);
                                if (l.longValue() != Long.MAX_VALUE) {
                                    obj5 = l;
                                }
                            }
                            jr4.A = 1;
                            if (fi2.k(obj5, jr4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i16 == 1) {
                            o85.q(obj22);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                jr4 = new jr4(this, f612);
                Object obj222 = jr4.z;
                i16 = jr4.A;
                if (i16 != 0) {
                }
            case 16:
                if (f612 instanceof ds4) {
                    ds4 = (ds4) f612;
                    int i52 = ds4.A;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ds4.A = i52 - Integer.MIN_VALUE;
                        Object obj23 = ds4.z;
                        i17 = ds4.A;
                        if (i17 != 0) {
                            o85.q(obj23);
                            ArrayList arrayList2 = new ArrayList();
                            for (gr4 gr4 : (List) obj4) {
                                try {
                                    obj3 = su0.k(gr4.b);
                                } catch (Throwable th) {
                                    obj3 = new m66(th);
                                }
                                if (obj3 instanceof m66) {
                                    obj3 = null;
                                }
                                String str3 = (String) obj3;
                                if (str3 != null) {
                                    yb5 = new yb5(gr4.a, str3);
                                } else {
                                    yb5 = null;
                                }
                                if (yb5 != null) {
                                    arrayList2.add(yb5);
                                }
                            }
                            ds4.A = 1;
                            if (fi2.k(arrayList2, ds4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i17 == 1) {
                            o85.q(obj23);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ds4 = new ds4(this, f612);
                Object obj232 = ds4.z;
                i17 = ds4.A;
                if (i17 != 0) {
                }
            case 17:
                if (f612 instanceof bu4) {
                    bu4 = (bu4) f612;
                    int i53 = bu4.A;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        bu4.A = i53 - Integer.MIN_VALUE;
                        Object obj24 = bu4.z;
                        i18 = bu4.A;
                        if (i18 != 0) {
                            o85.q(obj24);
                            if (((Boolean) obj4).booleanValue()) {
                                return vs7;
                            }
                            bu4.A = 1;
                            if (fi2.k(obj4, bu4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i18 == 1) {
                            o85.q(obj24);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                bu4 = new bu4(this, f612);
                Object obj242 = bu4.z;
                i18 = bu4.A;
                if (i18 != 0) {
                }
            case 18:
                if (f612 instanceof so6) {
                    so6 = (so6) f612;
                    int i54 = so6.A;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        so6.A = i54 - Integer.MIN_VALUE;
                        Object obj25 = so6.z;
                        i19 = so6.A;
                        if (i19 != 0) {
                            o85.q(obj25);
                            zn6 c = fb5.c((UserDataPreferences) obj4);
                            so6.A = 1;
                            if (fi2.k(c, so6) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i19 == 1) {
                            o85.q(obj25);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                so6 = new so6(this, f612);
                Object obj252 = so6.z;
                i19 = so6.A;
                if (i19 != 0) {
                }
            case 19:
                if (f612 instanceof aq6) {
                    aq6 = (aq6) f612;
                    int i55 = aq6.A;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        aq6.A = i55 - Integer.MIN_VALUE;
                        Object obj26 = aq6.z;
                        i20 = aq6.A;
                        if (i20 != 0) {
                            o85.q(obj26);
                            Boolean valueOf3 = Boolean.valueOf(((a54) obj4).b());
                            aq6.A = 1;
                            if (fi2.k(valueOf3, aq6) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i20 == 1) {
                            o85.q(obj26);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                aq6 = new aq6(this, f612);
                Object obj262 = aq6.z;
                i20 = aq6.A;
                if (i20 != 0) {
                }
            case 20:
                if (f612 instanceof eq6) {
                    eq6 = (eq6) f612;
                    int i56 = eq6.A;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        eq6.A = i56 - Integer.MIN_VALUE;
                        Object obj27 = eq6.z;
                        i21 = eq6.A;
                        if (i21 != 0) {
                            o85.q(obj27);
                            zn6 zn6 = (zn6) obj4;
                            if (Build.VERSION.SDK_INT < 33) {
                                za4 = ko.y;
                                break;
                            } else {
                                Object b2 = ko.b();
                                if (b2 != null) {
                                    za4 = new za4(new ab4(jo.a(b2)));
                                    za4.getClass();
                                    if (!za4.b()) {
                                        locale = Locale.getDefault();
                                        locale.getClass();
                                    } else {
                                        locale = za4.a.a.get(0);
                                        if (locale == null) {
                                            locale = Locale.getDefault();
                                        }
                                        locale.getClass();
                                    }
                                    if (!sg3.e(locale.getLanguage(), "es")) {
                                        xx3 = xx3.SPANISH;
                                    } else {
                                        xx3 = xx3.ENGLISH;
                                    }
                                    xx3 xx32 = xx3;
                                    String str4 = zn6.a;
                                    boolean z3 = zn6.b;
                                    ae1 ae1 = zn6.c;
                                    boolean z4 = zn6.e;
                                    int i57 = zn6.f;
                                    boolean z5 = zn6.g;
                                    Set set = zn6.h;
                                    g40 g40 = zn6.i;
                                    boolean z6 = zn6.j;
                                    boolean z7 = zn6.k;
                                    ae1 ae12 = ae1;
                                    boolean z8 = zn6.l;
                                    boolean z9 = zn6.m;
                                    boolean z10 = zn6.n;
                                    boolean z11 = zn6.o;
                                    boolean z12 = zn6.p;
                                    boolean z13 = zn6.q;
                                    boolean z14 = zn6.r;
                                    az7 az7 = zn6.s;
                                    az7 az72 = zn6.t;
                                    boolean z15 = zn6.u;
                                    boolean z16 = zn6.v;
                                    boolean z17 = zn6.w;
                                    boolean z18 = zn6.x;
                                    boolean z19 = zn6.y;
                                    boolean z20 = zn6.z;
                                    boolean z21 = zn6.A;
                                    boolean z22 = zn6.B;
                                    int i58 = zn6.C;
                                    jy7 jy7 = zn6.D;
                                    ae12.getClass();
                                    set.getClass();
                                    g40.getClass();
                                    az7.getClass();
                                    az72.getClass();
                                    jy7.getClass();
                                    boolean z23 = z4;
                                    int i59 = i57;
                                    boolean z24 = z5;
                                    Set set2 = set;
                                    boolean z25 = z6;
                                    is7 = new is7(6, new zn6(str4, z3, ae12, xx32, z23, i59, z24, set2, g40, z25, z7, z8, z9, z10, z11, z12, z13, z14, az7, az72, z15, z16, z17, z18, z19, z20, z21, z22, i58, jy7));
                                    eq6.A = 1;
                                    if (fi2.k(is7, eq6) != p81) {
                                        return p81;
                                    }
                                    return vs7;
                                }
                            }
                            za4 = za4.b;
                            za4.getClass();
                            if (!za4.b()) {
                            }
                            if (!sg3.e(locale.getLanguage(), "es")) {
                            }
                            xx3 xx322 = xx3;
                            String str42 = zn6.a;
                            boolean z32 = zn6.b;
                            ae1 ae13 = zn6.c;
                            boolean z42 = zn6.e;
                            int i572 = zn6.f;
                            boolean z52 = zn6.g;
                            Set set3 = zn6.h;
                            g40 g402 = zn6.i;
                            boolean z62 = zn6.j;
                            boolean z72 = zn6.k;
                            ae1 ae122 = ae13;
                            boolean z82 = zn6.l;
                            boolean z92 = zn6.m;
                            boolean z102 = zn6.n;
                            boolean z112 = zn6.o;
                            boolean z122 = zn6.p;
                            boolean z132 = zn6.q;
                            boolean z142 = zn6.r;
                            az7 az73 = zn6.s;
                            az7 az722 = zn6.t;
                            boolean z152 = zn6.u;
                            boolean z162 = zn6.v;
                            boolean z172 = zn6.w;
                            boolean z182 = zn6.x;
                            boolean z192 = zn6.y;
                            boolean z202 = zn6.z;
                            boolean z212 = zn6.A;
                            boolean z222 = zn6.B;
                            int i582 = zn6.C;
                            jy7 jy72 = zn6.D;
                            ae122.getClass();
                            set3.getClass();
                            g402.getClass();
                            az73.getClass();
                            az722.getClass();
                            jy72.getClass();
                            boolean z232 = z42;
                            int i592 = i572;
                            boolean z242 = z52;
                            Set set22 = set3;
                            boolean z252 = z62;
                            is7 = new is7(6, new zn6(str42, z32, ae122, xx322, z232, i592, z242, set22, g402, z252, z72, z82, z92, z102, z112, z122, z132, z142, az73, az722, z152, z162, z172, z182, z192, z202, z212, z222, i582, jy72));
                            eq6.A = 1;
                            if (fi2.k(is7, eq6) != p81) {
                            }
                        } else if (i21 == 1) {
                            o85.q(obj27);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                eq6 = new eq6(this, f612);
                Object obj272 = eq6.z;
                i21 = eq6.A;
                if (i21 != 0) {
                }
            case 21:
                if (f612 instanceof qz6) {
                    qz6 = (qz6) f612;
                    int i60 = qz6.A;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        qz6.A = i60 - Integer.MIN_VALUE;
                        Object obj28 = qz6.z;
                        i22 = qz6.A;
                        if (i22 != 0) {
                            o85.q(obj28);
                            Boolean valueOf4 = Boolean.valueOf(((zn6) obj4).w);
                            qz6.A = 1;
                            if (fi2.k(valueOf4, qz6) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i22 == 1) {
                            o85.q(obj28);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                qz6 = new qz6(this, f612);
                Object obj282 = qz6.z;
                i22 = qz6.A;
                if (i22 != 0) {
                }
            case 22:
                if (f612 instanceof a17) {
                    a17 = (a17) f612;
                    int i61 = a17.A;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        a17.A = i61 - Integer.MIN_VALUE;
                        Object obj29 = a17.z;
                        i23 = a17.A;
                        if (i23 != 0) {
                            o85.q(obj29);
                            String spotsNick = ((UserDataPreferences) obj4).getSpotsNick();
                            a17.A = 1;
                            if (fi2.k(spotsNick, a17) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i23 == 1) {
                            o85.q(obj29);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                a17 = new a17(this, f612);
                Object obj292 = a17.z;
                i23 = a17.A;
                if (i23 != 0) {
                }
            case 23:
                if (f612 instanceof s97) {
                    s97 = (s97) f612;
                    int i62 = s97.A;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        s97.A = i62 - Integer.MIN_VALUE;
                        Object obj30 = s97.z;
                        i24 = s97.A;
                        if (i24 != 0) {
                            o85.q(obj30);
                            List list2 = (List) obj4;
                            if (list2 == null || !list2.isEmpty()) {
                                Iterator it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((ld8) it4.next()).b == kd8.x) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            Boolean valueOf5 = Boolean.valueOf(z2);
                            s97.A = 1;
                            if (fi2.k(valueOf5, s97) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i24 == 1) {
                            o85.q(obj30);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                s97 = new s97(this, f612);
                Object obj302 = s97.z;
                i24 = s97.A;
                if (i24 != 0) {
                }
            case 24:
                if (f612 instanceof jv7) {
                    jv7 = (jv7) f612;
                    int i63 = jv7.A;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        jv7.A = i63 - Integer.MIN_VALUE;
                        Object obj31 = jv7.z;
                        i25 = jv7.A;
                        if (i25 != 0) {
                            o85.q(obj31);
                            String appUpdateNotifiedVersion = ((UserDataPreferences) obj4).getAppUpdateNotifiedVersion();
                            jv7.A = 1;
                            if (fi2.k(appUpdateNotifiedVersion, jv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i25 == 1) {
                            o85.q(obj31);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                jv7 = new jv7(this, f612);
                Object obj312 = jv7.z;
                i25 = jv7.A;
                if (i25 != 0) {
                }
            case 25:
                if (f612 instanceof lv7) {
                    lv7 = (lv7) f612;
                    int i64 = lv7.A;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        lv7.A = i64 - Integer.MIN_VALUE;
                        Object obj32 = lv7.z;
                        i26 = lv7.A;
                        if (i26 != 0) {
                            o85.q(obj32);
                            List<String> asterisco99History = ((UserDataPreferences) obj4).getAsterisco99History();
                            lv7.A = 1;
                            if (fi2.k(asterisco99History, lv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i26 == 1) {
                            o85.q(obj32);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                lv7 = new lv7(this, f612);
                Object obj322 = lv7.z;
                i26 = lv7.A;
                if (i26 != 0) {
                }
            case 26:
                if (f612 instanceof nv7) {
                    nv7 = (nv7) f612;
                    int i65 = nv7.A;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        nv7.A = i65 - Integer.MIN_VALUE;
                        Object obj33 = nv7.z;
                        i27 = nv7.A;
                        if (i27 != 0) {
                            o85.q(obj33);
                            Boolean valueOf6 = Boolean.valueOf(((UserDataPreferences) obj4).getForumTermsAccepted());
                            nv7.A = 1;
                            if (fi2.k(valueOf6, nv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i27 == 1) {
                            o85.q(obj33);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                nv7 = new nv7(this, f612);
                Object obj332 = nv7.z;
                i27 = nv7.A;
                if (i27 != 0) {
                }
            case 27:
                if (f612 instanceof pv7) {
                    pv7 = (pv7) f612;
                    int i66 = pv7.A;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        pv7.A = i66 - Integer.MIN_VALUE;
                        Object obj34 = pv7.z;
                        i28 = pv7.A;
                        if (i28 != 0) {
                            o85.q(obj34);
                            if (((UserDataPreferences) obj4).getNautaLogoutUrl().length() > 0) {
                                z2 = true;
                            }
                            Boolean valueOf7 = Boolean.valueOf(z2);
                            pv7.A = 1;
                            if (fi2.k(valueOf7, pv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i28 == 1) {
                            o85.q(obj34);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                pv7 = new pv7(this, f612);
                Object obj342 = pv7.z;
                i28 = pv7.A;
                if (i28 != 0) {
                }
            case 28:
                if (f612 instanceof rv7) {
                    rv7 = (rv7) f612;
                    int i67 = rv7.A;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        rv7.A = i67 - Integer.MIN_VALUE;
                        Object obj35 = rv7.z;
                        i29 = rv7.A;
                        if (i29 != 0) {
                            o85.q(obj35);
                            String nautaSessionAvailableTime = ((UserDataPreferences) obj4).getNautaSessionAvailableTime();
                            rv7.A = 1;
                            if (fi2.k(nautaSessionAvailableTime, rv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i29 == 1) {
                            o85.q(obj35);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                rv7 = new rv7(this, f612);
                Object obj352 = rv7.z;
                i29 = rv7.A;
                if (i29 != 0) {
                }
            default:
                if (f612 instanceof tv7) {
                    tv7 = (tv7) f612;
                    int i68 = tv7.A;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        tv7.A = i68 - Integer.MIN_VALUE;
                        Object obj36 = tv7.z;
                        i30 = tv7.A;
                        if (i30 != 0) {
                            o85.q(obj36);
                            String nautaSessionUser = ((UserDataPreferences) obj4).getNautaSessionUser();
                            tv7.A = 1;
                            if (fi2.k(nautaSessionUser, tv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i30 == 1) {
                            o85.q(obj36);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                tv7 = new tv7(this, f612);
                Object obj362 = tv7.z;
                i30 = tv7.A;
                if (i30 != 0) {
                }
        }
    }

    public /* synthetic */ b6(fi2 fi2, Object obj, int i) {
        this.w = i;
        this.x = fi2;
    }
}
