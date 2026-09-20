package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import cu.lestebang.utiletecsa.shortcuts.UssdShortcutActivity;
import cu.lestebang.utiletecsa.widget.VpnWidgetProvider;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: pd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pd7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd7(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((pd7) o((f61) obj2, (kl7) obj)).s(vs7);
            case 3:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((pd7) o((f61) obj2, (op5) obj)).s(vs7);
            case 9:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((pd7) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new pd7((qd7) this.D, (jd7) this.E, f61, 0);
            case 1:
                return new pd7((Object) (in8) this.E, f61, 1);
            case 2:
                pd7 pd7 = new pd7((Object) (do7) this.E, f61, 2);
                pd7.D = obj;
                return pd7;
            case 3:
                return new pd7((dy7) this.C, (String) this.D, (String) this.E, f61, 3);
            case 4:
                return new pd7((UssdShortcutActivity) this.D, (az7) this.E, f61, 4);
            case 5:
                return new pd7((is2) this.C, (String) this.D, (aq4) this.E, f61, 5);
            case 6:
                return new pd7((d37) this.C, f61, (e88) this.D);
            case 7:
                return new pd7((VpnWidgetProvider) this.C, (Context) this.D, (BroadcastReceiver.PendingResult) this.E, f61, 7);
            case 8:
                pd7 pd72 = new pd7((ay4) this.D, (Context) this.E, f61, 8);
                pd72.C = obj;
                return pd72;
            case 9:
                return new pd7((zy2) this.C, (be8) this.D, (a55) this.E, f61, 9);
            default:
                return new pd7((re8) this.C, (t84) this.D, (hd8) this.E, f61, 10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        if (r3 == r2) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b4, code lost:
        if (r1 == r2) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0356, code lost:
        if (r8 == r2) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r3 == r2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b2, code lost:
        if (r15 != false) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04b5, code lost:
        if (((defpackage.jd7) r1.E).a(r4, r1) == r6) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04c1, code lost:
        if (r3 == r6) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04d1, code lost:
        if (r3 == r6) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:?, code lost:
        return r2;
     */
    public final Object s(Object obj) {
        qq4 qq4;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        e35 e35;
        e35 e352;
        Boolean bool;
        kl7 kl7;
        ReentrantLock reentrantLock3;
        d35[] d35Arr;
        boolean z;
        d35 d35;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        w78 w78;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        boolean z2 = false;
        switch (this.A) {
            case b85.b:
                vs7 vs7 = vs7.a;
                qd7 qd7 = (qd7) this.D;
                p81 p81 = p81.w;
                int i = this.B;
                if (i == 0) {
                    o85.q(obj);
                    ne1 ne1 = qd7.N;
                    if (ne1 != null) {
                        this.B = 1;
                        if (ne1.y(this) == p81) {
                            return p81;
                        }
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        try {
                            o85.q(obj);
                            ue7 ue7 = qd7.O;
                            if (ue7 != null) {
                                this.B = 3;
                                ue7.y(this);
                                break;
                            }
                            return vs7;
                        } catch (Throwable th) {
                            th = th;
                            ue7 ue72 = qd7.O;
                            if (ue72 != null) {
                                this.C = th;
                                this.B = 4;
                                ue72.y(this);
                                break;
                            }
                        }
                    } else if (i == 3) {
                        o85.q(obj);
                        return vs7;
                    } else if (i != 4) {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    } else {
                        th = (Throwable) this.C;
                        o85.q(obj);
                        throw th;
                    }
                } else {
                    o85.q(obj);
                }
                this.B = 2;
                break;
            case 1:
                in8 in8 = (in8) this.E;
                p81 p812 = p81.w;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    oi6 oi6 = (oi6) in8;
                    cy6 cy6 = oi6.D;
                    if (cy6 != null) {
                        cy6.e(oi6, rc9.p, oi6.C);
                    }
                    qq4 qq42 = oi6.G;
                    this.C = qq42;
                    this.D = in8;
                    this.B = 1;
                    if (qq42.a(this) == p812) {
                        return p812;
                    }
                    qq4 = qq42;
                } else if (i2 == 1) {
                    in8 = (in8) this.D;
                    qq4 = (qq4) this.C;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    ((oi6) in8).z = ((oi6) in8).x.getValue();
                    kk0 kk0 = ((oi6) in8).F;
                    if (kk0 != null) {
                        kk0.f(((oi6) in8).x.getValue());
                    }
                    ((oi6) in8).F = null;
                    qq4.k((Object) null);
                    return vs7.a;
                } catch (Throwable th2) {
                    qq4.k((Object) null);
                    throw th2;
                }
            case 2:
                vs7 vs72 = vs7.a;
                p81 p813 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    kl7 = (kl7) this.D;
                    this.D = kl7;
                    this.B = 1;
                    bool = kl7.b(this);
                    break;
                } else if (i3 == 1) {
                    kl7 = (kl7) this.D;
                    o85.q(obj);
                    bool = obj;
                } else if (i3 == 2) {
                    reentrantLock2 = (ReentrantLock) this.C;
                    e35 = (e35) this.D;
                    try {
                        o85.q(obj);
                        e352 = e35;
                        reentrantLock = reentrantLock2;
                        e352.f = false;
                        reentrantLock.unlock();
                        return vs72;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!bool.booleanValue()) {
                    do7 do7 = (do7) this.E;
                    e352 = do7.h;
                    reentrantLock = e352.e;
                    reentrantLock.lock();
                    try {
                        e352.f = true;
                        reentrantLock3 = e352.a;
                        reentrantLock3.lock();
                        if (e352.d) {
                            e352.d = false;
                            int length = e352.b.length;
                            d35Arr = new d35[length];
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < length) {
                                if (e352.b[i4] > 0) {
                                    z = true;
                                } else {
                                    z = z2;
                                }
                                boolean[] zArr = e352.c;
                                if (z != zArr[i4]) {
                                    zArr[i4] = z;
                                    if (z) {
                                        d35 = d35.x;
                                    } else {
                                        d35 = d35.y;
                                    }
                                    z3 = true;
                                } else {
                                    d35 = d35.w;
                                }
                                d35Arr[i4] = d35;
                                i4++;
                                z2 = false;
                            }
                            break;
                        }
                        d35Arr = null;
                        reentrantLock3.unlock();
                        if (d35Arr != null) {
                            try {
                                if (d35Arr.length != 0) {
                                    jl7 jl7 = jl7.x;
                                    co7 co7 = new co7(d35Arr, do7, kl7, (f61) null);
                                    this.D = e352;
                                    this.C = reentrantLock;
                                    this.B = 2;
                                    if (kl7.a(jl7, co7, this) != p813) {
                                        e35 = e352;
                                        reentrantLock2 = reentrantLock;
                                        e352 = e35;
                                        reentrantLock = reentrantLock2;
                                    }
                                    return p813;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                e35 = e352;
                                reentrantLock2 = reentrantLock;
                                z2 = false;
                                try {
                                    e35.f = z2;
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    reentrantLock = reentrantLock2;
                                    reentrantLock.unlock();
                                    throw th;
                                }
                            }
                        }
                        e352.f = false;
                        reentrantLock.unlock();
                    } catch (Throwable th6) {
                        th = th6;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return vs72;
            case 3:
                p81 p814 = p81.w;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.C).a;
                    gv gvVar = new gv((String) this.D, (String) this.E, (f61) null, 13);
                    this.B = 1;
                    Object a = qe1.a(gvVar, this);
                    if (a == p814) {
                        return p814;
                    }
                    return a;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                UssdShortcutActivity ussdShortcutActivity = (UssdShortcutActivity) this.D;
                p81 p815 = p81.w;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    nz7 nz7 = ussdShortcutActivity.U;
                    if (nz7 != null) {
                        c6 b = nz7.b((az7) this.E);
                        this.B = 1;
                        obj3 = gr8.H(b, this);
                        break;
                    } else {
                        sg3.a0("ussdRepository");
                        throw null;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else if (i6 == 2) {
                    o85.q(obj);
                    str = (String) this.C;
                    obj2 = obj;
                    int i7 = ((zn6) obj2).f;
                    if (ussdShortcutActivity.W != null) {
                        rg5.b(ussdShortcutActivity, str, i7);
                        ussdShortcutActivity.finish();
                        return vs7.a;
                    }
                    sg3.a0("phoneActionManager");
                    throw null;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vy7 vy7 = (vy7) obj3;
                if (vy7 != null) {
                    str = vy7.c;
                } else {
                    str = null;
                }
                if (str != null) {
                    if (sg3.A(ussdShortcutActivity, "android.permission.CALL_PHONE")) {
                        vp6 vp6 = ussdShortcutActivity.V;
                        if (vp6 != null) {
                            c6 a2 = vp6.a();
                            this.C = str;
                            this.B = 2;
                            obj2 = gr8.H(a2, this);
                            break;
                        } else {
                            sg3.a0("settingsRepository");
                            throw null;
                        }
                    } else if (ussdShortcutActivity.W != null) {
                        rg5.e(ussdShortcutActivity, str);
                    } else {
                        sg3.a0("phoneActionManager");
                        throw null;
                    }
                }
                ussdShortcutActivity.finish();
                return vs7.a;
            case 5:
                p81 p816 = p81.w;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    jw6 jw6 = jw6.x;
                    this.B = 1;
                    if (((is2) this.C).C((String) this.D, jw6, (Object) null, this) == p816) {
                        return p816;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = b88.c;
                ((aq4) this.E).setValue(Boolean.FALSE);
                return vs7.a;
            case 6:
                d37 d37 = (d37) this.C;
                p81 p817 = p81.w;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    do {
                        value4 = d37.getValue();
                    } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    w78 w782 = (w78) ((is7) d37.getValue()).a;
                    v78 v78 = ((e88) this.D).b;
                    this.E = w782;
                    this.B = 1;
                    Object e = v78.e(this);
                    if (e == p817) {
                        return p817;
                    }
                    obj4 = e;
                    w78 = w782;
                } else if (i10 == 1) {
                    w78 = (w78) this.E;
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    obj4 = p25.b(w78, (o78) obj4);
                }
                Object obj5 = obj4;
                boolean z4 = obj5 instanceof m66;
                if (!z4) {
                    if (z4) {
                        obj5 = null;
                    }
                    if (obj5 != null) {
                        do {
                            value3 = d37.getValue();
                        } while (!d37.i(value3, is7.a((is7) value3, obj5, false, (hv2) null, 4)));
                    } else {
                        do {
                            value2 = d37.getValue();
                        } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                    }
                } else {
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj5)), 1)));
                }
                return vs7.a;
            case 7:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.E;
                VpnWidgetProvider vpnWidgetProvider = (VpnWidgetProvider) this.C;
                p81 p818 = p81.w;
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    v78 v782 = vpnWidgetProvider.c;
                    if (v782 != null) {
                        this.B = 1;
                        if (v782.h(this) == p818) {
                            return p818;
                        }
                    } else {
                        sg3.a0("vpnRepository");
                        throw null;
                    }
                } else if (i11 == 1) {
                    try {
                        o85.q(obj);
                        ((o66) obj).getClass();
                    } catch (Throwable th7) {
                        pendingResult.finish();
                        throw th7;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Context context = (Context) this.D;
                v78 v783 = vpnWidgetProvider.c;
                if (v783 != null) {
                    VpnWidgetProvider.a(vpnWidgetProvider, context, ((Boolean) v783.f.w.getValue()).booleanValue());
                    pendingResult.finish();
                    return vs7.a;
                }
                sg3.a0("vpnRepository");
                throw null;
            case 8:
                ay4 ay4 = (ay4) this.D;
                p81 p819 = p81.w;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    op5 op5 = (op5) this.C;
                    l8 l8Var = new l8(op5, 1);
                    ((n98) ay4.x).a((Context) this.E, new or(1), l8Var);
                    n17 n17 = new n17(6, (Object) ay4, (Object) l8Var);
                    this.B = 1;
                    if (w95.c(op5, n17, this) == p819) {
                        return p819;
                    }
                } else if (i12 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 9:
                be8 be8 = (be8) this.D;
                p81 p8110 = p81.w;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    di2 c = ((zy2) this.C).c(be8);
                    n40 n40 = new n40(10, (a55) this.E, be8);
                    this.B = 1;
                    if (c.a(n40, this) == p8110) {
                        return p8110;
                    }
                } else if (i13 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            default:
                t84 t84 = (t84) this.D;
                re8 re8 = (re8) this.C;
                be8 be82 = re8.a;
                Object obj6 = p81.w;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    Context context2 = re8.b;
                    hd8 hd8 = (hd8) this.E;
                    qd8 qd8 = re8.d;
                    this.B = 1;
                    String str2 = gd8.a;
                    Object obj7 = vs7.a;
                    if (be82.q && Build.VERSION.SDK_INT < 31) {
                        iy2 iy2 = qd8.d;
                        iy2.getClass();
                        Object e0 = ar7.e0(we.l(iy2), new ng(t84, be82, hd8, context2, (f61) null, 27), this);
                        if (e0 == obj6) {
                            obj7 = e0;
                            break;
                        }
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                } else if (i14 == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = se8.a;
                bc4.k().e(str3, "Starting work for " + be82.c);
                bj0 b2 = t84.b();
                this.B = 2;
                Object a3 = se8.a(b2, t84, this);
                if (a3 != obj6) {
                    return a3;
                }
                return obj6;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd7(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd7(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pd7(d37 d37, f61 f61, e88 e88) {
        super(2, f61);
        this.A = 6;
        this.C = d37;
        this.D = e88;
    }
}
