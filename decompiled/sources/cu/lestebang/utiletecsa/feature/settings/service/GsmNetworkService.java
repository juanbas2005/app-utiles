package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;", "Landroid/app/Service;", "<init>", "()V", "bb0", "settings"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class GsmNetworkService extends Service implements nu2 {
    public static final d37 D = e37.a(Boolean.FALSE);
    public TelephonyCallback A;
    public wx2 B;
    public Boolean C;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public TelephonyManager z;

    public static final void b(GsmNetworkService gsmNetworkService, boolean z) {
        String string;
        PendingIntent pendingIntent;
        Boolean bool = gsmNetworkService.C;
        gsmNetworkService.C = Boolean.valueOf(z);
        sg3.W(gsmNetworkService, 202610, gsmNetworkService.c(Boolean.valueOf(z)));
        if (bool != null && !bool.equals(Boolean.valueOf(z))) {
            if (z) {
                string = gsmNetworkService.getString(R.string.gsm_alert_restored);
            } else {
                string = gsmNetworkService.getString(R.string.gsm_alert_lost);
            }
            string.getClass();
            d15 d15Var = new d15(gsmNetworkService, "GsmNetworkAlertChannel");
            d15Var.y.icon = gsmNetworkService.getApplicationInfo().icon;
            d15Var.e = d15.b(gsmNetworkService.getString(R.string.gsm_monitor_notification_title));
            d15Var.f = d15.b(string);
            Intent launchIntentForPackage = gsmNetworkService.getPackageManager().getLaunchIntentForPackage(gsmNetworkService.getPackageName());
            if (launchIntentForPackage != null) {
                pendingIntent = PendingIntent.getActivity(gsmNetworkService, 0, launchIntentForPackage, 201326592);
            } else {
                pendingIntent = null;
            }
            d15Var.g = pendingIntent;
            d15Var.k = 1;
            d15Var.c(16, true);
            Notification a = d15Var.a();
            a.getClass();
            sg3.W(gsmNetworkService, 202611, a);
        }
    }

    @Override // defpackage.nu2
    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } finally {
                }
            }
        }
        return this.w.a();
    }

    public final Notification c(Boolean bool) {
        String string;
        PendingIntent pendingIntent = null;
        if (sg3.e(bool, Boolean.TRUE)) {
            string = getString(R.string.gsm_status_available);
        } else if (sg3.e(bool, Boolean.FALSE)) {
            string = getString(R.string.gsm_status_unavailable);
        } else if (bool == null) {
            string = getString(R.string.gsm_status_checking);
        } else {
            h.c();
            return null;
        }
        string.getClass();
        d15 d15Var = new d15(this, "GsmNetworkStatusChannel");
        d15Var.y.icon = getApplicationInfo().icon;
        d15Var.e = d15.b(getString(R.string.gsm_monitor_notification_title));
        d15Var.f = d15.b(string);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        }
        d15Var.g = pendingIntent;
        d15Var.k = -1;
        d15Var.c(2, true);
        d15Var.c(8, true);
        d15Var.l = false;
        Notification a = d15Var.a();
        a.getClass();
        return a;
    }

    public final void d() {
        if (!this.y) {
            this.y = true;
            ((xx2) a()).getClass();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        d();
        sg3.p(this, "GsmNetworkStatusChannel", R.string.gsm_monitor_channel_name, R.string.gsm_monitor_channel_description, 2);
        sg3.p(this, "GsmNetworkAlertChannel", R.string.gsm_alert_channel_name, R.string.gsm_alert_channel_description, 4);
        Notification c = c(null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            startForeground(202610, c, 1073741824);
        } else {
            startForeground(202610, c);
        }
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(TelephonyManager.class);
        if (telephonyManager != null) {
            this.z = telephonyManager;
            if (i >= 31) {
                vx2 vx2Var = new vx2(this);
                this.A = vx2Var;
                telephonyManager.registerTelephonyCallback(ag8.v(this), vx2Var);
            } else {
                wx2 wx2Var = new wx2(this, 0);
                this.B = wx2Var;
                telephonyManager.listen(wx2Var, 1);
            }
        }
        Boolean bool = Boolean.TRUE;
        d37 d37Var = D;
        d37Var.getClass();
        d37Var.l(null, bool);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        Boolean bool = Boolean.FALSE;
        d37 d37Var = D;
        d37Var.getClass();
        d37Var.l(null, bool);
        if (Build.VERSION.SDK_INT >= 31) {
            TelephonyCallback telephonyCallback = this.A;
            if (telephonyCallback != null && (telephonyManager2 = this.z) != null) {
                telephonyManager2.unregisterTelephonyCallback(telephonyCallback);
            }
        } else {
            wx2 wx2Var = this.B;
            if (wx2Var != null && (telephonyManager = this.z) != null) {
                telephonyManager.listen(wx2Var, 0);
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
