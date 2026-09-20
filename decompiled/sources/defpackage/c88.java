package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.VpnService;
import android.widget.Toast;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.widget.VpnToggleActivity;
import cu.lestebang.utiletecsa.widget.VpnWidgetProvider;

/* renamed from: c88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c88 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ VpnToggleActivity C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c88(VpnToggleActivity vpnToggleActivity, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = vpnToggleActivity;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((c88) o(f61, o81)).s(vs7);
            default:
                return ((c88) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        VpnToggleActivity vpnToggleActivity = this.C;
        switch (i) {
            case b85.b:
                return new c88(vpnToggleActivity, f61, 0);
            default:
                return new c88(vpnToggleActivity, f61, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111  */
    public final Object s(Object obj) {
        Intent prepare;
        Object obj2;
        int[] appWidgetIds;
        int i = this.A;
        p81 p81 = p81.w;
        VpnToggleActivity vpnToggleActivity = this.C;
        vs7 vs7 = vs7.a;
        Class<VpnWidgetProvider> cls = VpnWidgetProvider.class;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    v78 q = vpnToggleActivity.q();
                    this.B = 1;
                    if (q.c(this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int[] appWidgetIds2 = AppWidgetManager.getInstance(vpnToggleActivity).getAppWidgetIds(new ComponentName(vpnToggleActivity, cls));
                appWidgetIds2.getClass();
                if (appWidgetIds2.length != 0) {
                    Intent putExtra = new Intent(vpnToggleActivity, cls).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds2);
                    putExtra.getClass();
                    vpnToggleActivity.sendBroadcast(putExtra);
                }
                vpnToggleActivity.finish();
                return vs7;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    p7 p7Var = vpnToggleActivity.U;
                    if (p7Var != null) {
                        c6 d = p7Var.d();
                        this.B = 1;
                        obj = gr8.H(d, this);
                        if (obj == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("accountRepository");
                        throw null;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    if (!((Boolean) vpnToggleActivity.q().f.w.getValue()).booleanValue()) {
                        v78 q2 = vpnToggleActivity.q();
                        this.B = 3;
                        if (q2.d(this) == p81) {
                            return p81;
                        }
                        appWidgetIds = AppWidgetManager.getInstance(vpnToggleActivity).getAppWidgetIds(new ComponentName(vpnToggleActivity, cls));
                        appWidgetIds.getClass();
                        if (appWidgetIds.length != 0) {
                        }
                        vpnToggleActivity.finish();
                        return vs7;
                    }
                    if (vpnToggleActivity.q().h.w.getValue() == null) {
                        v78 q3 = vpnToggleActivity.q();
                        this.B = 4;
                        obj2 = q3.e(this);
                        if (obj2 == p81) {
                            return p81;
                        }
                        if (obj2 instanceof m66) {
                        }
                    }
                    prepare = VpnService.prepare(vpnToggleActivity);
                    if (prepare == null) {
                    }
                    return vs7;
                } else if (i3 == 3) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    appWidgetIds = AppWidgetManager.getInstance(vpnToggleActivity).getAppWidgetIds(new ComponentName(vpnToggleActivity, cls));
                    appWidgetIds.getClass();
                    if (appWidgetIds.length != 0) {
                        Intent putExtra2 = new Intent(vpnToggleActivity, cls).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", appWidgetIds);
                        putExtra2.getClass();
                        vpnToggleActivity.sendBroadcast(putExtra2);
                    }
                    vpnToggleActivity.finish();
                    return vs7;
                } else if (i3 == 4) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                    if (obj2 instanceof m66) {
                        int i4 = VpnToggleActivity.X;
                        Toast.makeText(vpnToggleActivity, R.string.widget_vpn_no_config, 0).show();
                        vpnToggleActivity.finish();
                        return vs7;
                    }
                    prepare = VpnService.prepare(vpnToggleActivity);
                    if (prepare == null) {
                        vpnToggleActivity.W.d0(prepare);
                    } else {
                        int i5 = VpnToggleActivity.X;
                        ar7.H(t49.O(vpnToggleActivity), (e81) null, (r81) null, new c88(vpnToggleActivity, (f61) null, 0), 3);
                    }
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((a54) obj).b()) {
                    int i6 = VpnToggleActivity.X;
                    Toast.makeText(vpnToggleActivity, R.string.widget_license_required, 0).show();
                    vpnToggleActivity.finish();
                    return vs7;
                }
                v78 q4 = vpnToggleActivity.q();
                this.B = 2;
                if (q4.h(this) == p81) {
                    return p81;
                }
                if (!((Boolean) vpnToggleActivity.q().f.w.getValue()).booleanValue()) {
                }
        }
    }
}
