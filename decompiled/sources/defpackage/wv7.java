package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: wv7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv7 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fi2 x;

    public /* synthetic */ wv7(fi2 fi2, int i) {
        this.w = i;
        this.x = fi2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f5  */
    public final Object k(Object obj, f61 f61) {
        vv7 vv7;
        int i;
        yv7 yv7;
        int i2;
        aw7 aw7;
        int i3;
        cw7 cw7;
        int i4;
        ly7 ly7;
        int i5;
        gz7 gz7;
        int i6;
        vy7 vy7;
        iz7 iz7;
        int i7;
        kz7 kz7;
        int i8;
        mz7 mz7;
        int i9;
        yb5 yb5;
        ce8 ce8;
        int i10;
        ce1 ce1;
        ld8 ld8;
        int i11;
        ld8 ld82;
        Iterator it;
        jd8 jd8;
        long j;
        boolean z;
        boolean z2;
        f61 f612 = f61;
        int i12 = this.w;
        int i13 = 0;
        vs7 vs7 = vs7.a;
        fi2 fi2 = this.x;
        p81 p81 = p81.w;
        int i14 = 1;
        switch (i12) {
            case b85.b:
                if (f612 instanceof vv7) {
                    vv7 = (vv7) f612;
                    int i15 = vv7.A;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        vv7.A = i15 - Integer.MIN_VALUE;
                        Object obj2 = vv7.z;
                        i = vv7.A;
                        if (i != 0) {
                            o85.q(obj2);
                            List<String> planExpiryNotified = ((UserDataPreferences) obj).getPlanExpiryNotified();
                            vv7.A = 1;
                            if (fi2.k(planExpiryNotified, vv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i == 1) {
                            o85.q(obj2);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                vv7 = new vv7(this, f612);
                Object obj22 = vv7.z;
                i = vv7.A;
                if (i != 0) {
                }
            case 1:
                if (f612 instanceof yv7) {
                    yv7 = (yv7) f612;
                    int i16 = yv7.A;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        yv7.A = i16 - Integer.MIN_VALUE;
                        Object obj3 = yv7.z;
                        i2 = yv7.A;
                        if (i2 != 0) {
                            o85.q(obj3);
                            Boolean valueOf = Boolean.valueOf(((UserDataPreferences) obj).getPlanExpiryNotifyEnabled());
                            yv7.A = 1;
                            if (fi2.k(valueOf, yv7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i2 == 1) {
                            o85.q(obj3);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                yv7 = new yv7(this, f612);
                Object obj32 = yv7.z;
                i2 = yv7.A;
                if (i2 != 0) {
                }
            case 2:
                if (f612 instanceof aw7) {
                    aw7 = (aw7) f612;
                    int i17 = aw7.A;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        aw7.A = i17 - Integer.MIN_VALUE;
                        Object obj4 = aw7.z;
                        i3 = aw7.A;
                        if (i3 != 0) {
                            o85.q(obj4);
                            Boolean valueOf2 = Boolean.valueOf(((UserDataPreferences) obj).getPlanesSinConfirmacion());
                            aw7.A = 1;
                            if (fi2.k(valueOf2, aw7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i3 == 1) {
                            o85.q(obj4);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                aw7 = new aw7(this, f612);
                Object obj42 = aw7.z;
                i3 = aw7.A;
                if (i3 != 0) {
                }
            case 3:
                if (f612 instanceof cw7) {
                    cw7 = (cw7) f612;
                    int i18 = cw7.A;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        cw7.A = i18 - Integer.MIN_VALUE;
                        Object obj5 = cw7.z;
                        i4 = cw7.A;
                        if (i4 != 0) {
                            o85.q(obj5);
                            String transferPin = ((UserDataPreferences) obj).getTransferPin();
                            cw7.A = 1;
                            if (fi2.k(transferPin, cw7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i4 == 1) {
                            o85.q(obj5);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                cw7 = new cw7(this, f612);
                Object obj52 = cw7.z;
                i4 = cw7.A;
                if (i4 != 0) {
                }
            case 4:
                if (f612 instanceof ly7) {
                    ly7 = (ly7) f612;
                    int i19 = ly7.A;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ly7.A = i19 - Integer.MIN_VALUE;
                        Object obj6 = ly7.z;
                        i5 = ly7.A;
                        if (i5 != 0) {
                            o85.q(obj6);
                            Boolean valueOf3 = Boolean.valueOf(((UserDataPreferences) obj).getUssdAutoEnabled());
                            ly7.A = 1;
                            if (fi2.k(valueOf3, ly7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i5 == 1) {
                            o85.q(obj6);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ly7 = new ly7(this, f612);
                Object obj62 = ly7.z;
                i5 = ly7.A;
                if (i5 != 0) {
                }
            case 5:
                if (f612 instanceof gz7) {
                    gz7 = (gz7) f612;
                    int i20 = gz7.A;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        gz7.A = i20 - Integer.MIN_VALUE;
                        Object obj7 = gz7.z;
                        i6 = gz7.A;
                        if (i6 != 0) {
                            o85.q(obj7);
                            yy7 yy7 = (yy7) obj;
                            if (yy7 != null) {
                                vy7 = t75.J(yy7);
                            } else {
                                vy7 = null;
                            }
                            gz7.A = 1;
                            if (fi2.k(vy7, gz7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i6 == 1) {
                            o85.q(obj7);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                gz7 = new gz7(this, f612);
                Object obj72 = gz7.z;
                i6 = gz7.A;
                if (i6 != 0) {
                }
            case 6:
                if (f612 instanceof iz7) {
                    iz7 = (iz7) f612;
                    int i21 = iz7.A;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        iz7.A = i21 - Integer.MIN_VALUE;
                        Object obj8 = iz7.z;
                        i7 = iz7.A;
                        if (i7 != 0) {
                            o85.q(obj8);
                            ArrayList z3 = t75.z((List) obj);
                            iz7.A = 1;
                            if (fi2.k(z3, iz7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i7 == 1) {
                            o85.q(obj8);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                iz7 = new iz7(this, f612);
                Object obj82 = iz7.z;
                i7 = iz7.A;
                if (i7 != 0) {
                }
            case 7:
                if (f612 instanceof kz7) {
                    kz7 = (kz7) f612;
                    int i22 = kz7.A;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        kz7.A = i22 - Integer.MIN_VALUE;
                        Object obj9 = kz7.z;
                        i8 = kz7.A;
                        if (i8 != 0) {
                            o85.q(obj9);
                            ArrayList z4 = t75.z((List) obj);
                            kz7.A = 1;
                            if (fi2.k(z4, kz7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i8 == 1) {
                            o85.q(obj9);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                kz7 = new kz7(this, f612);
                Object obj92 = kz7.z;
                i8 = kz7.A;
                if (i8 != 0) {
                }
            case 8:
                if (f612 instanceof mz7) {
                    mz7 = (mz7) f612;
                    int i23 = mz7.A;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mz7.A = i23 - Integer.MIN_VALUE;
                        Object obj10 = mz7.z;
                        i9 = mz7.A;
                        if (i9 != 0) {
                            o85.q(obj10);
                            List<String> list = (List) obj;
                            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                            for (String str : list) {
                                int G0 = d57.G0(str, ":::", 0, false, 6);
                                if (G0 >= 0) {
                                    yb5 = new yb5(str.substring(0, G0), str.substring(G0 + 3));
                                } else {
                                    yb5 = new yb5(str, str);
                                }
                                arrayList.add(yb5);
                            }
                            mz7.A = 1;
                            if (fi2.k(arrayList, mz7) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i9 == 1) {
                            o85.q(obj10);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                mz7 = new mz7(this, f612);
                Object obj102 = mz7.z;
                i9 = mz7.A;
                if (i9 != 0) {
                }
            default:
                if (f612 instanceof ce8) {
                    ce8 = (ce8) f612;
                    int i24 = ce8.A;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ce8.A = i24 - Integer.MIN_VALUE;
                        Object obj11 = ce8.z;
                        i10 = ce8.A;
                        if (i10 != 0) {
                            o85.q(obj11);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(et0.e0(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                ae8 ae8 = (ae8) it2.next();
                                List list3 = ae8.q;
                                kd8 kd8 = ae8.b;
                                if (!list3.isEmpty()) {
                                    ce1 = (ce1) list3.get(i13);
                                } else {
                                    ce1 = ce1.b;
                                }
                                ce1 ce12 = ce1;
                                UUID fromString = UUID.fromString(ae8.a);
                                fromString.getClass();
                                HashSet hashSet = new HashSet(ae8.p);
                                ce1 ce13 = ae8.c;
                                int i25 = ae8.h;
                                int i26 = ae8.m;
                                j31 j31 = ae8.g;
                                int i27 = i25;
                                long j2 = ae8.d;
                                long j3 = ae8.e;
                                int i28 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                                if (i28 != 0) {
                                    it = it2;
                                    i11 = i26;
                                    ld82 = ld8;
                                    jd8 = new jd8(j3, ae8.f);
                                } else {
                                    it = it2;
                                    i11 = i26;
                                    ld82 = ld8;
                                    jd8 = null;
                                }
                                kd8 kd82 = kd8.w;
                                if (kd8 == kd82) {
                                    String str2 = be8.z;
                                    if (kd8 != kd82 || i27 <= 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    d40 d40 = ae8.i;
                                    long j4 = j3;
                                    long j5 = ae8.j;
                                    long j6 = ae8.k;
                                    int i29 = ae8.l;
                                    if (i28 != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    j = o85.a(z, i27, d40, j5, j6, i29, z2, j2, ae8.f, j4, ae8.n);
                                } else {
                                    j = Long.MAX_VALUE;
                                }
                                ce1 ce14 = ce13;
                                int i30 = i27;
                                int i31 = i11;
                                arrayList2.add(new ld8(fromString, kd8, hashSet, ce14, ce12, i30, i31, j31, j2, jd8, j, ae8.o));
                                it2 = it;
                                i13 = 0;
                                i14 = 1;
                            }
                            ce8.A = i14;
                            if (fi2.k(arrayList2, ce8) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i10 == 1) {
                            o85.q(obj11);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ce8 = new ce8(this, f612);
                Object obj112 = ce8.z;
                i10 = ce8.A;
                if (i10 != 0) {
                }
        }
    }
}
