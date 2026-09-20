package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: w34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class w34 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ w34(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public final Object y(Object obj) {
        long j;
        eu4 eu4;
        in8 k;
        in8 k2;
        long j2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        float f = 1.0f;
        int i = 0;
        switch (this.w) {
            case b85.b:
                return new x34((re6) this.x, (Map) obj, (oe6) this.y);
            case 1:
                dh5 dh5 = (dh5) obj;
                ArrayList n = t49.n((List) this.x, ((l74) this.y).a);
                if (n != null) {
                    int size = n.size();
                    while (i < size) {
                        yb5 yb5 = (yb5) n.get(i);
                        eh5 eh5 = (eh5) yb5.w;
                        sr2 sr2 = (sr2) yb5.x;
                        if (sr2 != null) {
                            j = ((oe3) sr2.b()).a;
                        } else {
                            j = 0;
                        }
                        dh5.j(dh5, eh5, j);
                        i++;
                    }
                }
                return vs7.a;
            case 2:
                ((bo4) this.x).y.add(new yn4(obj, (xk6) this.y));
                return vs7.a;
            case 3:
                op5 op5 = (op5) this.y;
                vs7 vs7 = vs7.a;
                if (sg3.e((String) obj, ((File) this.x).getName())) {
                    Object c = op5.B.c(vs7);
                    if (!(c instanceof qn0)) {
                        vs7 vs72 = (vs7) c;
                    } else {
                        Object obj2 = ((rn0) ar7.U(x32.w, new n0(op5, (f61) null, 16))).a;
                    }
                }
                return vs7;
            case 4:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ((fr4) this.x).b.v(ua6, (gr4) this.y);
                return vs7.a;
            case 5:
                ((Boolean) obj).getClass();
                ((vs4) this.x).f();
                ((aq4) this.y).setValue(Boolean.TRUE);
                return vs7.a;
            case 6:
                qt4 qt4 = (qt4) this.x;
                ht4 ht4 = ((iu4) this.y).b;
                xu4 xu4 = (xu4) obj;
                xu4.getClass();
                dv5 dv5 = xu4.a;
                dv5.b = 0;
                dv5.c = 0;
                if (qt4 instanceof eu4) {
                    int i2 = qt4.A;
                    Iterator it = ie1.I(qt4).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qt4 qt42 = (qt4) it.next();
                            qt4 f2 = ht4.f();
                            if (f2 != null) {
                                eu4 = f2.y;
                            } else {
                                eu4 = null;
                            }
                            if (sg3.e(qt42, eu4)) {
                            }
                        } else {
                            int i3 = eu4.C;
                            xu4.d = ((qt4) cl6.U(cl6.S(new ot4(5), ht4.g()))).x.a;
                            xu4.e = true;
                        }
                    }
                }
                return vs7.a;
            case 7:
                kw1 kw1 = (kw1) obj;
                return new m30(4, (a37) this.x, (hx0) this.y);
            case 8:
                iu4 iu4 = (iu4) this.x;
                t54 t54 = (t54) this.y;
                kw1 kw12 = (kw1) obj;
                iu4.getClass();
                t54.getClass();
                ht4 ht42 = iu4.b;
                h5 h5Var = ht42.r;
                if (!t54.equals(ht42.n)) {
                    t54 t542 = ht42.n;
                    if (!(t542 == null || (k = t542.k()) == null)) {
                        k.M0(h5Var);
                    }
                    ht42.n = t54;
                    t54.k().x0(h5Var);
                }
                return new qh(2);
            case 9:
                kx4 kx4 = (kx4) obj;
                kx4.getClass();
                ((vr2) this.y).y(new cl3(kx4, (cf4) this.x, (vr2) null, 4));
                return vs7.a;
            case 10:
                ((h27) this.x).o((CancellationException) null);
                ((op5) this.y).c((r31) obj);
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                w35 w35 = (w35) this.x;
                eh5 eh52 = (eh5) this.y;
                dh5 dh52 = (dh5) obj;
                if (w35.L) {
                    dh5.k(dh52, eh52, dh52.r0(0.0f), dh52.r0(w35.K));
                } else {
                    dh52.g(eh52, dh52.r0(0.0f), dh52.r0(w35.K), 0.0f);
                }
                return vs7.a;
            case 12:
                z35 z35 = (z35) this.x;
                eh5 eh53 = (eh5) this.y;
                dh5 dh53 = (dh5) obj;
                long j3 = ((oe3) z35.K.y(dh53)).a;
                if (z35.L) {
                    dh5.l(dh53, eh53, (int) (j3 >> 32), (int) (j3 & 4294967295L), (vr2) null, 12);
                } else {
                    dh5.n(dh53, eh53, (int) (j3 >> 32), (int) (j3 & 4294967295L), (vr2) null, 12);
                }
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                ka5 ka5 = (ka5) this.x;
                eh5 eh54 = (eh5) this.y;
                dh5 dh54 = (dh5) obj;
                boolean z = ka5.O;
                float f3 = ka5.K;
                if (z) {
                    dh5.k(dh54, eh54, dh54.r0(f3), dh54.r0(ka5.L));
                } else {
                    dh54.g(eh54, dh54.r0(f3), dh54.r0(ka5.L), 0.0f);
                }
                return vs7.a;
            case 14:
                ((gs2) this.x).H(Integer.valueOf(((tn5) obj).a), Integer.valueOf(((cf4) this.y).q().b));
                return vs7.a;
            case h75.g:
                dh5 dh55 = (dh5) obj;
                xl xlVar = new xl(2, (ArrayList) this.y);
                dh55.w = true;
                xlVar.y(dh55);
                dh55.w = false;
                ((aq4) this.x).getValue();
                return vs7.a;
            case 16:
                h34 h34 = (h34) obj;
                h34.getClass();
                List list = ((fc5) this.x).c;
                h34.P(list.size(), (vr2) null, new y20(6, list), new fw0(802480018, new hc5(list, (vr2) this.y, 0), true));
                return vs7.a;
            case 17:
                h30 h30 = (h30) this.x;
                mx0 mx0 = (mx0) this.y;
                kw1 kw13 = (kw1) obj;
                h30.a(mx0);
                return new m30(6, h30, mx0);
            case 18:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ((en5) this.x).b.v(ua62, (dn5) this.y);
                return vs7.a;
            case 19:
                up4 up4 = (up4) this.y;
                ((py0) this.x).B(obj);
                if (up4 != null) {
                    up4.a(obj);
                }
                return vs7.a;
            case 20:
                gy5 gy5 = (gy5) this.x;
                Throwable th = (Throwable) this.y;
                Throwable th2 = (Throwable) obj;
                synchronized (gy5.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                su0.b(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    gy5.e = th;
                    d37 d37 = gy5.u;
                    dy5 dy5 = dy5.w;
                    d37.getClass();
                    d37.l((Object) null, dy5);
                }
                return vs7.a;
            case 21:
                t54 t543 = (t54) this.x;
                cx0 cx0 = (cx0) this.y;
                kw1 kw14 = (kw1) obj;
                h5 h5Var2 = new h5(2, cx0);
                if (!(t543 == null || (k2 = t543.k()) == null)) {
                    k2.x0(h5Var2);
                }
                if (t543 == null) {
                    j54 j54 = j54.ON_RESUME;
                    cx0.getClass();
                    cx0.x = j54.a();
                    cx0.a();
                }
                return new i5(t543, (q54) h5Var2, (Object) cx0, 4);
            case 22:
                ((gq4) this.x).a.setValue(new y72((aa8) this.y, (aa8) obj));
                return vs7.a;
            case 23:
                String str = (String) this.x;
                sr2 sr22 = (sr2) this.y;
                ok6 ok6 = (ok6) obj;
                yr3[] yr3Arr = mk6.a;
                nk6 nk6 = jk6.u;
                yr3 yr3 = mk6.a[11];
                ok6.f(nk6, Float.valueOf(1.0f));
                if (str != null) {
                    mk6.c(ok6, str);
                }
                ok6.f(zj6.b, new h4((String) null, new gi0(9, sr22)));
                return vs7.a;
            case 24:
                xh6 xh6 = (xh6) this.x;
                zh6 zh6 = (zh6) this.y;
                by1 by1 = (by1) obj;
                if (by1.b) {
                    f = -1.0f;
                }
                long j4 = by1.a;
                if (zh6.d == z75.x) {
                    j2 = l35.a(j4, 0.0f, 1);
                } else {
                    j2 = l35.a(j4, 0.0f, 2);
                }
                xh6.a(l35.f(f, j2), 1);
                return vs7.a;
            case 25:
                List list2 = (List) this.x;
                h34 h342 = (h34) obj;
                h342.getClass();
                h342.P(list2.size(), (vr2) null, new y20(10, list2), new fw0(802480018, new hc5(list2, (vr2) this.y, 1), true));
                return vs7.a;
            case 26:
                int intValue = ((Integer) obj).intValue();
                ((bd5) this.y).e(intValue);
                ((vr2) this.x).y(xx3.A.get(intValue));
                return vs7.a;
            case 27:
                Context context = (Context) this.x;
                ((Boolean) obj).getClass();
                Intent intent = new Intent(context, SpeedOverlayService.class);
                if (((Boolean) ((aq4) this.y).getValue()).booleanValue()) {
                    context.stopService(intent);
                } else if (Settings.canDrawOverlays(context)) {
                    ag8.H(context, intent);
                } else {
                    context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
                }
                return vs7.a;
            case 28:
                Context context2 = (Context) this.y;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((vr2) this.x).y(bool);
                if (booleanValue) {
                    if (Settings.canDrawOverlays(context2)) {
                        context2.getClass();
                        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(ConnectivityManager.class);
                        if (!(connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)))) {
                            i = 1;
                        }
                        Intent intent2 = new Intent(context2, SpeedOverlayService.class);
                        if (i != 0 && Settings.canDrawOverlays(context2)) {
                            try {
                                ag8.H(context2, intent2);
                            } catch (Exception e) {
                                Exception exc = e;
                                if (Build.VERSION.SDK_INT < 31 || !exc.getClass().getName().equals("android.app.ForegroundServiceStartNotAllowedException")) {
                                    throw exc;
                                }
                            }
                        } else if (i == 0) {
                            context2.stopService(intent2);
                        }
                    } else {
                        context2.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context2.getPackageName())).addFlags(268435456));
                    }
                }
                return vs7.a;
            default:
                String str2 = (String) this.x;
                vr2 vr2 = (vr2) this.y;
                ((ys3) obj).getClass();
                if (str2.length() >= 8) {
                    vr2.y(str2);
                }
                return vs7.a;
        }
    }
}
