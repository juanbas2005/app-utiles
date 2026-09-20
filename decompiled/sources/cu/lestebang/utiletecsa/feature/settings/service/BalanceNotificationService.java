package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;", "Landroid/app/Service;", "<init>", "()V", "gr8", "settings"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class BalanceNotificationService extends Service implements nu2 {
    public static final d37 E = e37.a(Boolean.FALSE);
    public nz7 A;
    public vp6 B;
    public rg5 C;
    public final ig0 D;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public k40 z;

    public BalanceNotificationService() {
        w77 d = b85.d();
        dn1 dn1Var = aw1.a;
        this.D = gl0.E(rc9.D0(d, pe4.a.B));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d6 -> B:25:0x00d9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService r11, defpackage.az7 r12, int r13, defpackage.h61 r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService.b(cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService, az7, int, h61):java.lang.Object");
    }

    public static final RemoteViews d(BalanceNotificationService balanceNotificationService, String str, String str2, String str3, String str4, Map map, int i) {
        RemoteViews remoteViews = new RemoteViews(balanceNotificationService.getPackageName(), i);
        if (d57.I0(str)) {
            str = "--";
        }
        remoteViews.setTextViewText(R.id.notification_saldo_value, str);
        if (d57.I0(str2)) {
            str2 = "--";
        }
        remoteViews.setTextViewText(R.id.notification_datos_value, str2);
        if (d57.I0(str3)) {
            str3 = "--";
        }
        remoteViews.setTextViewText(R.id.notification_sms_value, str3);
        if (d57.I0(str4)) {
            str4 = "--";
        }
        remoteViews.setTextViewText(R.id.notification_voz_value, str4);
        for (Map.Entry entry : map.entrySet()) {
            remoteViews.setOnClickPendingIntent(((Number) entry.getKey()).intValue(), (PendingIntent) entry.getValue());
        }
        return remoteViews;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [in8, java.lang.Object] */
    public final Notification c(String str, String str2, String str3, String str4, Map map) {
        PendingIntent pendingIntent;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        PendingIntent pendingIntent2 = pendingIntent;
        d15 d15Var = new d15(this, "BalanceNotificationChannel");
        d15Var.y.icon = getApplicationInfo().icon;
        d15Var.e(new Object());
        d15Var.u = d(this, str, str2, str3, str4, map, R.layout.notification_balance_collapsed);
        d15Var.v = d(this, str, str2, str3, str4, map, R.layout.notification_balance);
        d15Var.g = pendingIntent2;
        d15Var.k = -1;
        d15Var.c(2, true);
        d15Var.c(8, true);
        d15Var.l = false;
        Notification a = d15Var.a();
        a.getClass();
        return a;
    }

    public final void e() {
        if (!this.y) {
            this.y = true;
            vd1 vd1Var = ((sd1) ((j40) a())).a;
            this.z = (k40) vd1Var.s.get();
            this.A = (nz7) vd1Var.m.get();
            this.B = (vp6) vd1Var.x.get();
            this.C = (rg5) vd1Var.P.get();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        e();
        sg3.p(this, "BalanceNotificationChannel", R.string.balance_notification_channel_name, R.string.balance_notification_channel_description, 2);
        Notification c = c("--", "--", "--", "--", b42.w);
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(202609, c, 1073741824);
        } else {
            startForeground(202609, c);
        }
        ar7.H(this.D, null, null, new ot(this, null, 1), 3);
        Boolean bool = Boolean.TRUE;
        d37 d37Var = E;
        d37Var.getClass();
        d37Var.l(null, bool);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Boolean bool = Boolean.FALSE;
        d37 d37Var = E;
        d37Var.getClass();
        d37Var.l(null, bool);
        gl0.J(this.D, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
