package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.CellInfo;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: n0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }

    public static qm0 v(TelephonyManager telephonyManager, pm0 pm0, SignalStrength signalStrength, List list, int i) {
        Object obj;
        String str;
        Object obj2;
        km0 km0;
        int i2;
        int i3;
        if ((i & 8) != 0) {
            signalStrength = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if (list == null) {
            try {
                list = telephonyManager.getAllCellInfo();
                if (list == null) {
                    list = a42.w;
                }
            } catch (Throwable th) {
                obj = new m66(th);
            }
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (networkOperatorName.length() == 0) {
            networkOperatorName = "Cubacel";
        }
        int dataNetworkType = telephonyManager.getDataNetworkType();
        pm0.getClass();
        if (dataNetworkType != 20) {
            switch (dataNetworkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case 16:
                    str = "2G";
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case h75.g:
                case 17:
                    str = "3G";
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    str = "4G LTE";
                    break;
                default:
                    str = "--";
                    break;
            }
        } else {
            str = "5G NR";
        }
        String str2 = str;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((CellInfo) obj2).isRegistered()) {
                }
            } else {
                obj2 = null;
            }
        }
        CellInfo cellInfo = (CellInfo) obj2;
        if (cellInfo != null) {
            km0 = pm0.a(pm0, cellInfo, signalStrength);
        } else {
            km0 = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((CellInfo) next).isRegistered()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            km0 a = pm0.a(pm0, (CellInfo) it2.next(), (SignalStrength) null);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        if (km0 != null) {
            i2 = km0.f;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        int i4 = i2;
        if (km0 != null) {
            i3 = km0.g;
        } else {
            i3 = 0;
        }
        obj = new qm0(networkOperatorName, str2, i4, i3, km0, arrayList2, true);
        Throwable a2 = o66.a(obj);
        if (a2 != null) {
            if (!(a2 instanceof SecurityException)) {
                obj = new qm0(127);
            }
        }
        return (qm0) obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((n0) o((f61) obj2, (op5) obj)).s(vs7);
            case 3:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                ((n0) o((f61) obj2, (rc3) obj)).s(vs7);
                return p81;
            case 6:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((n0) o((f61) obj2, (s83) obj)).s(vs7);
            case 8:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((n0) o((f61) obj2, (UserSession) obj)).s(vs7);
            case 10:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((n0) o((f61) obj2, (op5) obj)).s(vs7);
            case 12:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((n0) o((f61) obj2, (op5) obj)).s(vs7);
            case 14:
                return ((n0) o((f61) obj2, (op5) obj)).s(vs7);
            case h75.g:
                return ((n0) o((f61) obj2, (fi2) obj)).s(vs7);
            case 16:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 19:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 23:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 25:
                ((n0) o((f61) obj2, (o81) obj)).s(vs7);
                return p81;
            case 26:
                return ((n0) o((f61) obj2, (ue1) obj)).s(vs7);
            case 27:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((n0) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((n0) o((f61) obj2, (vj4) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                return new n0((ap4) this.C, (r23) obj2, f61, 0);
            case 1:
                return new n0((ap4) this.C, (s23) obj2, f61, 1);
            case 2:
                n0 n0Var = new n0((rv0) obj2, f61, 2);
                n0Var.C = obj;
                return n0Var;
            case 3:
                return new n0((vc) this.C, (dy1) obj2, f61, 3);
            case 4:
                return new n0((og) this.C, (qc3) obj2, f61, 4);
            case 5:
                n0 n0Var2 = new n0((mh) obj2, f61, 5);
                n0Var2.C = obj;
                return n0Var2;
            case 6:
                n0 n0Var3 = new n0((pl5) obj2, f61, 6);
                n0Var3.C = obj;
                return n0Var3;
            case 7:
                n0 n0Var4 = new n0((qt) obj2, f61, 7);
                n0Var4.C = obj;
                return n0Var4;
            case 8:
                return new n0((a) this.C, (String) obj2, f61, 8);
            case 9:
                n0 n0Var5 = new n0((a) obj2, f61, 9);
                n0Var5.C = obj;
                return n0Var5;
            case 10:
                return new n0((nz7) this.C, (c30) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                n0 n0Var6 = new n0((p50) obj2, f61, 11);
                n0Var6.C = obj;
                return n0Var6;
            case 12:
                return new n0((cc0) this.C, (g20) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                n0 n0Var7 = new n0((pm0) obj2, f61, 13);
                n0Var7.C = obj;
                return n0Var7;
            case 14:
                n0 n0Var8 = new n0((gn0) obj2, f61, 14);
                n0Var8.C = obj;
                return n0Var8;
            case h75.g:
                n0 n0Var9 = new n0((jn0) obj2, f61, 15);
                n0Var9.C = obj;
                return n0Var9;
            case 16:
                n0 n0Var10 = new n0((xk6) obj2, f61, 16);
                n0Var10.C = obj;
                return n0Var10;
            case 17:
                return new n0((mx0) obj2, f61, 17);
            case 18:
                return new n0((ox0) this.C, (Runnable) obj2, f61, 18);
            case 19:
                return new n0((gs2) this.C, (kl5) obj2, f61, 19);
            case 20:
                return new n0((gs2) this.C, (h06) obj2, f61, 20);
            case 21:
                return new n0((vp6) this.C, (e41) obj2, f61, 21);
            case 22:
                return new n0((e41) obj2, f61, 22);
            case 23:
                return new n0((ze7) this.C, (yb0) obj2, f61, 23);
            case 24:
                return new n0((uk5) this.C, (ze7) obj2, f61, 24);
            case 25:
                return new n0((el3) this.C, (uc1) obj2, f61, 25);
            case 26:
                n0 n0Var11 = new n0((List) obj2, f61, 26);
                n0Var11.C = obj;
                return n0Var11;
            case 27:
                return new n0((jf1) this.C, (vj4) obj2, f61, 27);
            case 28:
                return new n0((gs2) this.C, (de1) obj2, f61, 28);
            default:
                n0 n0Var12 = new n0((jf1) obj2, f61, 29);
                n0Var12.C = obj;
                return n0Var12;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: qt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v47, resolved type: cg7} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v14, types: [vb5] */
    /* JADX WARNING: type inference failed for: r4v20, types: [hn6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v76, types: [java.lang.Object, d06] */
    /* JADX WARNING: type inference failed for: r10v60 */
    /* JADX WARNING: type inference failed for: r10v61 */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f9, code lost:
        if (defpackage.w95.c(r14, r4, r0) == r2) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0543, code lost:
        if (defpackage.w95.c(r14, new defpackage.mm0((java.lang.Object) r17, r18, (java.lang.Object) r19, (java.lang.Object) r13, 0), r0) == r2) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r0 == r2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0782, code lost:
        if (r0 == r2) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08b2, code lost:
        if (defpackage.pd8.s(r3).a(new defpackage.dw2(2, r2), r0) == r1) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        if (defpackage.jf1.f(r12, r0) == r2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        if (r0 == r2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0175, code lost:
        if (r5 == r2) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019c, code lost:
        if (defpackage.t49.G(500, r0) == r2) goto L_0x019e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0190 A[Catch:{ all -> 0x0145 }] */
    public final Object s(Object obj) {
        boolean z;
        float f;
        o81 o81;
        pl5 pl5;
        Object obj2;
        wf6 wf6;
        Object obj3;
        String str;
        Object obj4;
        d06 d06;
        String str2;
        Object c;
        float f2 = 1.0f;
        ? r10 = 0;
        switch (this.A) {
            case b85.b:
                p81 p81 = p81.w;
                int i = this.B;
                if (i == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((ap4) this.C).b((r23) this.D, this) == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 1:
                p81 p812 = p81.w;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((ap4) this.C).b((s23) this.D, this) == p812) {
                        return p812;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 2:
                rv0 rv0 = (rv0) this.D;
                op5 op5 = (op5) this.C;
                p81 p813 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    op5.getClass();
                    Configuration configuration = rv0.getResources().getConfiguration();
                    configuration.getClass();
                    if ((configuration.uiMode & 48) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    op5.c(Boolean.valueOf(z));
                    l8 l8Var = new l8(op5, 0);
                    rv0.F.add(l8Var);
                    f5 f5Var = new f5(1, rv0, l8Var);
                    this.C = null;
                    this.B = 1;
                    if (w95.c(op5, f5Var, this) == p813) {
                        return p813;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 3:
                vc vcVar = (vc) this.C;
                p81 p814 = p81.w;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    long j = ((dy1) this.D).a;
                    if (vcVar.r1()) {
                        f2 = -1.0f;
                    }
                    long f3 = x38.f(f2, j);
                    if (vcVar.M == z75.w) {
                        f = x38.c(f3);
                    } else {
                        f = x38.b(f3);
                    }
                    this.B = 1;
                    if (vc.q1(vcVar, f, this) == p814) {
                        return p814;
                    }
                } else if (i4 == 1 || i4 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 4:
                Object obj5 = p81.w;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    tm3 tm3 = new tm3(19);
                    this.B = 1;
                    e81 e81 = this.x;
                    e81.getClass();
                    break;
                } else if (i5 == 1) {
                    o85.q(obj);
                    xp4 i6 = ((og) this.C).i();
                    if (i6 == null) {
                        return vs7.a;
                    }
                    lg lgVar = new lg(0, (qc3) this.D);
                    this.B = 2;
                    pr6.l((pr6) i6, lgVar, this);
                } else if (i5 != 2) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    o85.q(obj);
                    ta1.e();
                    return null;
                }
                return obj5;
            case 5:
                p81 p815 = p81.w;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    rc3 rc3 = (rc3) this.C;
                    mh mhVar = (mh) this.D;
                    this.C = rc3;
                    this.B = 1;
                    kk0 kk0 = new kk0(1, rc9.a0(this));
                    kk0.v();
                    rf7 rf7 = mhVar.x;
                    ck5 ck5 = rf7.a;
                    ck5.a();
                    rf7.b.set(new vf7(rf7, ck5));
                    kk0.x(new lh(1, rc3, mhVar));
                    if (kk0.t() == p815) {
                        return p815;
                    }
                } else if (i7 != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    rc3 rc32 = (rc3) this.C;
                    o85.q(obj);
                }
                ta1.e();
                return null;
            case 6:
                e81 e812 = this.x;
                p81 p816 = p81.w;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    o81 = (o81) this.C;
                } else if (i8 == 1) {
                    o81 = (o81) this.C;
                    o85.q(obj);
                    pl5 = (pl5) this.D;
                    int[] iArr = pl5.d0;
                    if (pl5.isAttachedToWindow()) {
                        int i9 = iArr[0];
                        int i10 = iArr[1];
                        pl5.I.getLocationOnScreen(iArr);
                        if (!(i9 == iArr[0] && i10 == iArr[1])) {
                            pl5.q();
                        }
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!gl0.X(o81)) {
                    ce ceVar = ce.D;
                    this.C = o81;
                    this.B = 1;
                    e812.getClass();
                    if (e812.a0(me6.D) == null) {
                        e812.getClass();
                        if (pd8.s(e812).a(ceVar, this) == p816) {
                            return p816;
                        }
                        pl5 = (pl5) this.D;
                        int[] iArr2 = pl5.d0;
                        if (pl5.isAttachedToWindow()) {
                        }
                        if (!gl0.X(o81)) {
                        }
                    }
                    ku4.a();
                    return null;
                }
                return vs7.a;
            case 7:
                qt qtVar = (qt) this.D;
                Object obj6 = p81.w;
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    s83 s83 = (s83) this.C;
                    jx5 jx5 = (jx5) qtVar.O.getValue();
                    r83 a = s83.a(s83);
                    a.d = new ji8(6, (Object) qtVar);
                    a.p = null;
                    a.q = null;
                    a.r = null;
                    po1 po1 = s83.z;
                    if (po1.a == null) {
                        a.n = new ns8(5, (Object) qtVar);
                        a.p = null;
                        a.q = null;
                        a.r = null;
                    }
                    if (po1.b == null) {
                        j51 j51 = qtVar.J;
                        qx5 qx5 = k18.b;
                        if (sg3.e(j51, i51.b) || sg3.e(j51, i51.d)) {
                            wf6 = wf6.x;
                        } else {
                            wf6 = wf6.w;
                        }
                        a.o = wf6;
                    }
                    if (po1.d != qm5.w) {
                        a.e = qm5.x;
                    }
                    s83 a2 = a.a();
                    this.C = qtVar;
                    this.B = 1;
                    jx5.getClass();
                    dn1 dn1 = aw1.a;
                    obj2 = ar7.e0(pe4.a.B, new k05(jx5, a2, (f61) null, 6), this);
                    break;
                } else if (i11 == 1) {
                    qtVar = this.C;
                    o85.q(obj);
                    obj2 = obj;
                    t83 t83 = (t83) obj2;
                    qtVar.getClass();
                    if (t83 instanceof f77) {
                        f77 f77 = (f77) t83;
                        return new lt(qtVar.k(f77.a), f77);
                    } else if (t83 instanceof s62) {
                        s62 s62 = (s62) t83;
                        Drawable drawable = s62.a;
                        if (drawable != null) {
                            r10 = qtVar.k(drawable);
                        }
                        obj6 = new jt(r10, s62);
                    } else {
                        h.c();
                        return null;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj6;
            case 8:
                Object obj7 = vs7.a;
                Object obj8 = p81.w;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    kg5 kg5 = ((a) rg3.t(((a) this.C).b)).j;
                    this.B = 1;
                    kg5 kg52 = (kg5) kg5.y;
                    Object e0 = ar7.e0((h81) kg52.y, new gv(kg52, (String) kg5.x, (String) this.D, (f61) null, 12), this);
                    if (e0 != obj8) {
                        e0 = obj7;
                    }
                    if (e0 != obj8) {
                        e0 = obj7;
                    }
                    if (e0 == obj8) {
                        return obj8;
                    }
                } else if (i12 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj7;
            case 9:
                UserSession userSession = (UserSession) this.C;
                p81 p817 = p81.w;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    ? obj9 = new Object();
                    this.C = null;
                    this.B = 1;
                    if (uu.c((a) this.D, userSession, obj9, this) == p817) {
                        return p817;
                    }
                } else if (i13 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 10:
                p81 p818 = p81.w;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    zy7 zy7 = ((nz7) this.C).a;
                    c6 c6Var = new c6(gr8.L(t49.E(zy7.a.a, false, new String[]{"ussd_codes"}, new ha7(25)), zy7.b), 27);
                    lg lgVar2 = new lg(1, (c30) this.D);
                    this.B = 1;
                    if (c6Var.a(lgVar2, this) == p818) {
                        return p818;
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                p81 p819 = p81.w;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    op5 op52 = (op5) this.C;
                    p50 p50 = (p50) this.D;
                    o50 o50 = new o50(p50, op52);
                    x21 x21 = p50.a;
                    x21.getClass();
                    synchronized (x21.c) {
                        try {
                            if (x21.d.add(o50)) {
                                if (x21.d.size() == 1) {
                                    x21.e = x21.a();
                                    bc4.k().e(y21.a, x21.getClass().getSimpleName() + ": initial state = " + x21.e);
                                    x21.c();
                                }
                                if (p50.e(x21.e)) {
                                    obj3 = new q31(p50.d());
                                } else {
                                    obj3 = p31.a;
                                }
                                op52.getClass();
                                op52.c(obj3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    f5 f5Var2 = new f5(6, (p50) this.D, o50);
                    this.B = 1;
                    if (w95.c(op52, f5Var2, this) == p819) {
                        return p819;
                    }
                } else if (i15 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 12:
                p81 p8110 = p81.w;
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (r16.t((cc0) this.C, (g20) this.D, this) == p8110) {
                        return p8110;
                    }
                } else if (i16 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                vs7 vs7 = vs7.a;
                pm0 pm0 = (pm0) this.D;
                op5 op53 = (op5) this.C;
                Object obj10 = p81.w;
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    Object systemService = pm0.a.getSystemService("phone");
                    systemService.getClass();
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    Context context = pm0.a;
                    if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        int i18 = Build.VERSION.SDK_INT;
                        if (i18 >= 29) {
                            str = "android.permission.ACCESS_FINE_LOCATION";
                        } else {
                            str = "android.permission.ACCESS_COARSE_LOCATION";
                        }
                        if (context.checkSelfPermission(str) == 0) {
                            op53.c(v(telephonyManager, pm0, (SignalStrength) null, (List) null, 24));
                            if (i18 < 31) {
                                HandlerThread handlerThread = new HandlerThread("CellInfoListener");
                                handlerThread.start();
                                Handler handler = new Handler(handlerThread.getLooper());
                                Object obj11 = new Object();
                                handler.post(new lm0(obj11, telephonyManager, op53, pm0, 0));
                                HandlerThread handlerThread2 = handlerThread;
                                Handler handler2 = handler;
                                this.C = null;
                                this.B = 2;
                                break;
                            } else {
                                om0 om0 = new om0(op53, telephonyManager, pm0);
                                try {
                                    telephonyManager.registerTelephonyCallback(Executors.newSingleThreadExecutor(), om0);
                                    f5 f5Var3 = new f5(12, telephonyManager, om0);
                                    this.C = null;
                                    this.B = 1;
                                    break;
                                } catch (SecurityException unused) {
                                    op53.c(new qm0(63));
                                    op53.y0((Throwable) null);
                                }
                            }
                            return obj10;
                        }
                    }
                    op53.c(new qm0(63));
                    op53.y0((Throwable) null);
                } else if (i17 == 1 || i17 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 14:
                op5 op54 = (op5) this.C;
                p81 p8111 = p81.w;
                int i19 = this.B;
                if (i19 == 0) {
                    o85.q(obj);
                    this.C = null;
                    this.B = 1;
                    if (((gn0) this.D).e(op54, this) == p8111) {
                        return p8111;
                    }
                } else if (i19 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case h75.g:
                fi2 fi2 = (fi2) this.C;
                p81 p8112 = p81.w;
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    this.C = null;
                    this.B = 1;
                    if (((jn0) this.D).i(fi2, this) == p8112) {
                        return p8112;
                    }
                } else if (i20 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 16:
                Object obj12 = vs7.a;
                o81 o812 = (o81) this.C;
                p81 p8113 = p81.w;
                int i21 = this.B;
                if (i21 == 0) {
                    o85.q(obj);
                    xk6 xk6 = (xk6) this.D;
                    this.C = null;
                    this.B = 1;
                    if (xk6.b(this, obj12) == p8113) {
                        return p8113;
                    }
                } else if (i21 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        obj4 = new m66(th2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj4 = obj12;
                if (obj4 instanceof m66) {
                    obj12 = new pn0(o66.a(obj4));
                }
                return new rn0(obj12);
            case 17:
                mx0 mx0 = (mx0) this.D;
                p81 p8114 = p81.w;
                int i22 = this.B;
                if (i22 == 0) {
                    o85.q(obj);
                    if (mx0.j()) {
                        ? obj13 = new Object();
                        gs2 gs2 = mx0.d;
                        ad0 ad0 = mx0.e;
                        ad0.getClass();
                        oi2 oi2 = new oi2(new fn0(ad0, true), new ca0((d06) obj13, (f61) null), 0);
                        this.C = obj13;
                        this.B = 1;
                        if (gs2.H(oi2, this) == p8114) {
                            return p8114;
                        }
                        d06 = obj13;
                    }
                    return vs7.a;
                } else if (i22 == 1) {
                    d06 = (d06) this.C;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!d06.w) {
                    h.s("You must collect the progress flow");
                    return null;
                }
                return vs7.a;
            case 18:
                Object obj14 = vs7.a;
                ox0 ox0 = (ox0) this.C;
                Object obj15 = p81.w;
                int i23 = this.B;
                if (i23 == 0) {
                    o85.q(obj);
                    i23 i232 = ox0.f;
                    this.B = 1;
                    Object b = i232.b(0.0f - i232.b, this);
                    if (b != obj15) {
                        b = obj14;
                    }
                    if (b == obj15) {
                        return obj15;
                    }
                } else if (i23 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((ed5) ox0.c.x).setValue(Boolean.FALSE);
                ((Runnable) this.D).run();
                return obj14;
            case 19:
                p81 p8115 = p81.w;
                int i24 = this.B;
                if (i24 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object H = ((gs2) this.C).H((kl5) this.D, this);
                    if (H == p8115) {
                        return p8115;
                    }
                    return H;
                } else if (i24 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 20:
                p81 p8116 = p81.w;
                int i25 = this.B;
                if (i25 == 0) {
                    o85.q(obj);
                    Object obj16 = ((h06) this.D).w;
                    this.B = 1;
                    Object H2 = ((gs2) this.C).H(obj16, this);
                    if (H2 == p8116) {
                        return p8116;
                    }
                    return H2;
                } else if (i25 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 21:
                p81 p8117 = p81.w;
                int i26 = this.B;
                if (i26 == 0) {
                    o85.q(obj);
                    c6 a3 = ((vp6) this.C).a();
                    lg lgVar3 = new lg(3, (e41) this.D);
                    this.B = 1;
                    if (a3.a(lgVar3, this) == p8117) {
                        return p8117;
                    }
                } else if (i26 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 22:
                vs7 vs72 = vs7.a;
                e41 e41 = (e41) this.D;
                p81 p8118 = p81.w;
                int i27 = this.B;
                if (i27 == 0) {
                    o85.q(obj);
                    String str3 = e41.f;
                    if (str3 != null) {
                        Pattern compile = Pattern.compile("\\+53|[^0-9]");
                        compile.getClass();
                        String replaceAll = compile.matcher(str3).replaceAll("");
                        replaceAll.getClass();
                        String j1 = d57.j1(replaceAll);
                        nz7 nz7 = e41.d;
                        String str4 = e41.e;
                        this.C = j1;
                        this.B = 1;
                        if (nz7.a(str4, j1, this) == p8118) {
                            return p8118;
                        }
                        str2 = j1;
                    }
                    return vs72;
                } else if (i27 == 1) {
                    str2 = (String) this.C;
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String y = b81.y("*99", str2);
                Context context2 = e41.b;
                Context context3 = e41.b;
                boolean A2 = sg3.A(context2, "android.permission.CALL_PHONE");
                rg5 rg5 = e41.c;
                if (A2) {
                    int i28 = e41.j;
                    rg5.getClass();
                    rg5.b(context3, y, i28);
                } else {
                    rg5.getClass();
                    rg5.e(context3, y);
                }
                return vs72;
            case 23:
                p81 p8119 = p81.w;
                int i29 = this.B;
                if (i29 == 0) {
                    o85.q(obj);
                    ze7 ze7 = (ze7) this.C;
                    v35 v35 = ze7.b;
                    long j2 = ze7.n().b;
                    int i30 = lg7.c;
                    int p = v35.p((int) (j2 >> 32));
                    u44 u44 = ze7.d;
                    if (u44 != null) {
                        r10 = u44.d();
                    }
                    r10.getClass();
                    bg7 bg7 = r10.a;
                    ly5 c2 = bg7.c(z65.p(p, 0, bg7.a.a.x.length()));
                    this.B = 1;
                    if (((yb0) this.D).a(c2, this) == p8119) {
                        return p8119;
                    }
                } else if (i29 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 24:
                p81 p8120 = p81.w;
                int i31 = this.B;
                if (i31 == 0) {
                    o85.q(obj);
                    o71 o71 = new o71((ze7) this.D, 1);
                    this.B = 1;
                    if (sb7.d((uk5) this.C, o71, this) == p8120) {
                        return p8120;
                    }
                } else if (i31 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 25:
                uc1 uc1 = (uc1) this.D;
                Object obj17 = p81.w;
                int i32 = this.B;
                if (i32 == 0) {
                    o85.q(obj);
                    el3 el3 = (el3) this.C;
                    if (el3 != null) {
                        this.B = 1;
                        el3.o((CancellationException) null);
                        Object j0 = el3.j0(this);
                        if (j0 != obj17) {
                            j0 = vs7.a;
                            break;
                        }
                    }
                } else if (i32 == 1) {
                    o85.q(obj);
                } else if (i32 == 2) {
                    o85.q(obj);
                    throw new RuntimeException();
                } else if (i32 == 3) {
                    o85.q(obj);
                    uc1.c.e(0.0f);
                    this.B = 4;
                } else if (i32 == 4) {
                    try {
                        o85.q(obj);
                        uc1.c.e(1.0f);
                        this.B = 3;
                        if (t49.G(500, this) == obj17) {
                            return obj17;
                        }
                        uc1.c.e(0.0f);
                        this.B = 4;
                        break;
                    } catch (Throwable th3) {
                        uc1.c.e(0.0f);
                        throw th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uc1.c.e(1.0f);
                if (!uc1.a) {
                    this.B = 2;
                    t49.t(this);
                    return obj17;
                }
                this.B = 3;
                if (t49.G(500, this) == obj17) {
                }
                uc1.c.e(0.0f);
                this.B = 4;
                break;
            case 26:
                p81 p8121 = p81.w;
                int i33 = this.B;
                if (i33 == 0) {
                    o85.q(obj);
                    List list = (List) this.D;
                    this.B = 1;
                    if (b96.e(list, (ue1) this.C, this) == p8121) {
                        return p8121;
                    }
                } else if (i33 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 27:
                vj4 vj4 = (vj4) this.D;
                jf1 jf1 = (jf1) this.C;
                Object obj18 = p81.w;
                int i34 = this.B;
                if (i34 != 0) {
                    if (i34 != 1) {
                        if (i34 == 2) {
                            o85.q(obj);
                            gs2 gs22 = vj4.a;
                            e81 e813 = vj4.d;
                            this.B = 3;
                            c = jf1.i().c(new v6((Object) jf1, (Object) e813, (Object) gs22, (f61) null, 2), this);
                            break;
                        } else if (i34 != 3) {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    o85.q(obj);
                    return obj;
                }
                o85.q(obj);
                y27 w = jf1.h.w();
                if (w instanceof de1) {
                    gs2 gs23 = vj4.a;
                    e81 e814 = vj4.d;
                    this.B = 1;
                    c = jf1.i().c(new v6((Object) jf1, (Object) e814, (Object) gs23, (f61) null, 2), this);
                    break;
                } else if ((w instanceof lw5) || (w instanceof ks7)) {
                    if (w == vj4.c) {
                        this.B = 2;
                        break;
                    } else {
                        throw ((lw5) w).b;
                    }
                } else if (w instanceof be2) {
                    throw ((be2) w).b;
                } else if (w instanceof qz4) {
                    h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                } else {
                    h.c();
                    return null;
                }
                return obj18;
                return c;
            case 28:
                p81 p8122 = p81.w;
                int i35 = this.B;
                if (i35 == 0) {
                    o85.q(obj);
                    Object obj19 = ((de1) this.D).b;
                    this.B = 1;
                    Object H3 = ((gs2) this.C).H(obj19, this);
                    if (H3 == p8122) {
                        return p8122;
                    }
                    return H3;
                } else if (i35 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                p81 p8123 = p81.w;
                int i36 = this.B;
                if (i36 == 0) {
                    o85.q(obj);
                    jf1 jf12 = (jf1) this.D;
                    this.B = 1;
                    if (jf1.d(jf12, (vj4) this.C, this) == p8123) {
                        return p8123;
                    }
                } else if (i36 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
    }
}
