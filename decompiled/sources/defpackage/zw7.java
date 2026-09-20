package defpackage;

import android.view.View;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoBootReceiver;
import cu.lestebang.utiletecsa.messaging.UtilEsMessagingService;
import cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zw7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw7(d37 d37, f61 f61, e88 e88) {
        super(2, f61);
        this.A = 8;
        this.C = d37;
        this.D = e88;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((zw7) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 3:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((zw7) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                return new zw7((dy7) this.C, (DarkThemeConfigPreferences) obj2, f61, 0);
            case 1:
                return new zw7((dy7) this.C, (List) obj2, f61, 1);
            case 2:
                zw7 zw7 = new zw7(this.B, f61, (String) obj2);
                zw7.C = obj;
                return zw7;
            case 3:
                zw7 zw72 = new zw7((Object) (UssdAutoBootReceiver) obj2, f61, 3);
                zw72.C = obj;
                return zw72;
            case 4:
                return new zw7((zy7) this.C, (ArrayList) obj2, f61, 4);
            case 5:
                return new zw7((Object) (UssdRefreshWorker) obj2, f61, 5);
            case 6:
                return new zw7((qz7) this.C, (ArrayList) obj2, f61, 6);
            case 7:
                return new zw7((UtilEsMessagingService) this.C, (String) obj2, f61, 7);
            case 8:
                return new zw7((d37) this.C, f61, (e88) obj2);
            default:
                return new zw7((gy5) this.C, (View) obj2, f61, 9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0237, code lost:
        r82 = r4;
        r4 = r2;
        r2 = r82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023c, code lost:
        r4 = defpackage.o66.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0240, code lost:
        if (r4 == null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0242, code lost:
        r2.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0245, code lost:
        r0.C = r2;
        r0.B = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024e, code lost:
        if (defpackage.t49.G(1000, r0) != r9) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0251, code lost:
        r0.C = r2;
        r0.B = 7;
        r4 = ((defpackage.c50) r1).m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x025d, code lost:
        if (r4 != r9) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0260, code lost:
        r4 = defpackage.o66.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0264, code lost:
        if (r4 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0266, code lost:
        r2.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0269, code lost:
        r0.C = r2;
        r0.B = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0273, code lost:
        if (defpackage.t49.G(1000, r0) != r9) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0276, code lost:
        r0.C = r2;
        r0.B = 9;
        r1 = ((defpackage.c50) r1).j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0282, code lost:
        if (r1 != r9) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0285, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0286, code lost:
        r1 = defpackage.o66.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028a, code lost:
        if (r1 == null) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028c, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0293, code lost:
        if (r0.isEmpty() == false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029f, code lost:
        if (r10.b.c >= 3) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a1, code lost:
        r1 = defpackage.yh7.a;
        r0.size();
        r1.getClass();
        defpackage.hr2.z(new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return new defpackage.p84();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return new defpackage.r84();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (r0 == r9) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (r0 == r9) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f0, code lost:
        r0.C = null;
        r0.B = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fa, code lost:
        if (r7.e((defpackage.hm2) r6, r0) != r9) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fe, code lost:
        r4 = new java.util.ArrayList();
        r0.C = r4;
        r0.B = 3;
        r6 = ((defpackage.c50) r1).i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        if (r6 != r9) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0212, code lost:
        r6 = defpackage.o66.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0216, code lost:
        if (r6 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0218, code lost:
        r4.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021b, code lost:
        r0.C = r4;
        r0.B = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0224, code lost:
        if (defpackage.t49.G(1000, r0) != r9) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0228, code lost:
        r0.C = r4;
        r0.B = 5;
        r2 = ((defpackage.c50) r1).g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0233, code lost:
        if (r2 != r9) goto L_0x0237;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        List list;
        List list2;
        UssdRefreshWorker ussdRefreshWorker;
        Object obj4;
        Object obj5;
        Object obj6;
        Object value;
        Object value2;
        Object value3;
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj7 = this.D;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.C).a;
                    tc1 tc1 = new tc1((DarkThemeConfigPreferences) obj7, (f61) null, 19);
                    this.B = 1;
                    Object a = qe1.a(tc1, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    qe1 qe12 = ((dy7) this.C).a;
                    tc1 tc12 = new tc1((List) obj7, (f61) null, 20);
                    this.B = 1;
                    Object a2 = qe12.a(tc12, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                UserDataPreferences userDataPreferences = (UserDataPreferences) this.C;
                o85.q(obj);
                String str = (String) obj7;
                if (this.B == 0) {
                    return UserDataPreferences.copy$default(userDataPreferences, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, str, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -16777217, -1, (Object) null);
                }
                return UserDataPreferences.copy$default(userDataPreferences, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, str, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -33554433, -1, (Object) null);
            case 3:
                o81 o81 = (o81) this.C;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    dv7 dv7 = ((UssdAutoBootReceiver) obj7).c;
                    if (dv7 != null) {
                        di2 d = ((dy7) dv7).d();
                        this.C = null;
                        this.B = 1;
                        obj3 = gr8.H(d, this);
                        if (obj3 == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("userPreferencesDataSource");
                        throw null;
                    }
                } else if (i4 == 1) {
                    try {
                        o85.q(obj);
                        obj3 = obj;
                    } catch (Throwable th) {
                        obj2 = new m66(th);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = Boolean.valueOf(((UserDataPreferences) obj3).getUssdAutoEnabled());
                Boolean bool = Boolean.FALSE;
                if (obj2 instanceof m66) {
                    return bool;
                }
                return obj2;
            case 4:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    xy7 xy7 = ((zy7) this.C).a;
                    this.B = 1;
                    Object P = sg3.P(this, xy7.a, false, true, new k77(16, (Object) xy7, (Object) (ArrayList) obj7));
                    if (P != p81) {
                        P = vs7;
                    }
                    if (P == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 5:
                UssdRefreshWorker ussdRefreshWorker2 = (UssdRefreshWorker) obj7;
                k40 k40 = ussdRefreshWorker2.i;
                switch (this.B) {
                    case b85.b:
                        o85.q(obj);
                        this.C = ussdRefreshWorker2;
                        this.B = 1;
                        obj4 = ussdRefreshWorker2.d(this);
                        if (obj4 != p81) {
                            ussdRefreshWorker = ussdRefreshWorker2;
                            break;
                        } else {
                            return p81;
                        }
                    case 1:
                        o85.q(obj);
                        ussdRefreshWorker = (UssdRefreshWorker) this.C;
                        obj4 = obj;
                        break;
                    case 2:
                        o85.q(obj);
                        break;
                    case 3:
                        list2 = (List) this.C;
                        o85.q(obj);
                        Object obj8 = ((o66) obj).w;
                        break;
                    case 4:
                        list2 = (List) this.C;
                        o85.q(obj);
                        break;
                    case 5:
                        list = (List) this.C;
                        o85.q(obj);
                        Object obj9 = ((o66) obj).w;
                        break;
                    case 6:
                        list = (List) this.C;
                        o85.q(obj);
                        break;
                    case 7:
                        list = (List) this.C;
                        o85.q(obj);
                        Object obj10 = ((o66) obj).w;
                        break;
                    case 8:
                        list = (List) this.C;
                        o85.q(obj);
                        break;
                    case 9:
                        List list3 = (List) this.C;
                        o85.q(obj);
                        Object obj11 = ((o66) obj).w;
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 6:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    oz7 oz7 = ((qz7) this.C).a;
                    this.B = 1;
                    Object P2 = sg3.P(this, oz7.a, false, true, new k77(17, (Object) oz7, (Object) (ArrayList) obj7));
                    if (P2 != p81) {
                        P2 = vs7;
                    }
                    if (P2 == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 7:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    s77 s77 = ((UtilEsMessagingService) this.C).G;
                    if (s77 != null) {
                        this.B = 1;
                        obj5 = s77.a((String) obj7, this);
                        if (obj5 == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("supabaseProfileRepository");
                        throw null;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj5 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj5 instanceof m66)) {
                    vs7 vs72 = (vs7) obj5;
                    yh7.a.getClass();
                    hr2.m(new Object[0]);
                }
                if (o66.a(obj5) == null) {
                    return vs7;
                }
                yh7.a.getClass();
                hr2.p(new Object[0]);
                return vs7;
            case 8:
                d37 d37 = (d37) this.C;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, b81.h((Object) null, (is7) value3, (Object) null, true, 1)));
                    boolean z = ((w78) ((is7) d37.getValue()).a).d;
                    v78 v78 = ((e88) obj7).b;
                    if (!z) {
                        this.B = 2;
                        obj6 = v78.c(this);
                        break;
                    } else {
                        this.B = 1;
                        obj6 = v78.d(this);
                        break;
                    }
                    return p81;
                } else if (i8 == 1 || i8 == 2) {
                    o85.q(obj);
                    obj6 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj12 = obj6;
                if (!(obj12 instanceof m66)) {
                    do {
                        value2 = d37.getValue();
                    } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
                    return vs7;
                }
                do {
                    value = d37.getValue();
                } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj12)), 1)));
                return vs7;
            default:
                gy5 gy5 = (gy5) this.C;
                View view = (View) obj7;
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object I = gr8.I(gy5.u, new da0(2, (f61) null, 3), this);
                    if (I != p81) {
                        I = vs7;
                    }
                    if (I == p81) {
                        return p81;
                    }
                } else if (i9 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        if (ac8.a(view) == gy5) {
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
                        }
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (ac8.a(view) != gy5) {
                    return vs7;
                }
                view.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw7(int i, f61 f61, String str) {
        super(2, f61);
        this.A = 2;
        this.B = i;
        this.D = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw7(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw7(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }
}
