package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.telecom.PhoneAccountHandle;
import android.widget.RemoteViews;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;", "Landroid/app/Service;", "<init>", "()V", "gr8", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
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
        dn1 dn1 = aw1.a;
        this.D = gl0.E(rc9.D0(d, pe4.a.B));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object b(BalanceNotificationService balanceNotificationService, az7 az7, int i, h61 h61) {
        h40 h40;
        int i2;
        int i3;
        int i4;
        Collection collection;
        Iterator it;
        int i5;
        int i6;
        vy7 vy7;
        yb5 yb5;
        int i7;
        String str;
        Intent intent;
        if (h61 instanceof h40) {
            h40 = (h40) h61;
            int i8 = h40.H;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                h40.H = i8 - Integer.MIN_VALUE;
                Object obj = h40.F;
                i2 = h40.H;
                if (i2 != 0) {
                    o85.q(obj);
                    ArrayList arrayList = new ArrayList();
                    i6 = 0;
                    it = sf4.V(new yb5(new Integer(R.id.notification_saldo_column), az7), new yb5(new Integer(R.id.notification_datos_column), az7.CONSULTAR_DATOS), new yb5(new Integer(R.id.notification_sms_column), az7.CONSULTAR_SMS), new yb5(new Integer(R.id.notification_voz_column), az7.CONSULTAR_MINUTOS)).entrySet().iterator();
                    i7 = i;
                    collection = arrayList;
                } else if (i2 == 1) {
                    i4 = h40.E;
                    i3 = h40.D;
                    i6 = h40.C;
                    i5 = h40.B;
                    it = h40.A;
                    collection = h40.z;
                    o85.q(obj);
                    vy7 = (vy7) obj;
                    if (vy7 == null || (str = vy7.c) == null) {
                        yb5 = null;
                        if (yb5 != null) {
                            collection.add(yb5);
                        }
                        i7 = i5;
                    } else {
                        Integer num = new Integer(i4);
                        int i9 = i3 + 1;
                        if (balanceNotificationService.C != null) {
                            Uri parse = Uri.parse("tel:".concat(k57.s0(str, "#", "%23")));
                            if (!sg3.A(balanceNotificationService, "android.permission.CALL_PHONE")) {
                                intent = new Intent("android.intent.action.DIAL", parse).addFlags(268435456);
                                intent.getClass();
                            } else {
                                intent = new Intent("android.intent.action.CALL", parse).addFlags(268435456);
                                intent.getClass();
                                PhoneAccountHandle f = rg5.f(balanceNotificationService, i5);
                                if (f != null) {
                                    intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", f);
                                }
                            }
                            yb5 = new yb5(num, PendingIntent.getActivity(balanceNotificationService, i9, intent, 201326592));
                            if (yb5 != null) {
                            }
                            i7 = i5;
                        }
                        sg3.a0("phoneActionManager");
                        throw null;
                    }
                    yb5 = null;
                    if (yb5 != null) {
                    }
                    i7 = i5;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = i6;
                if (it.hasNext()) {
                    Object next = it.next();
                    i6 = i3 + 1;
                    if (i3 >= 0) {
                        Map.Entry entry = (Map.Entry) next;
                        int intValue = ((Number) entry.getKey()).intValue();
                        az7 az72 = (az7) entry.getValue();
                        nz7 nz7 = balanceNotificationService.A;
                        if (nz7 != null) {
                            c6 b = nz7.b(az72);
                            h40.z = collection;
                            h40.A = it;
                            h40.B = i7;
                            h40.C = i6;
                            h40.D = i3;
                            h40.E = intValue;
                            h40.H = 1;
                            obj = gr8.H(b, h40);
                            p81 p81 = p81.w;
                            if (obj == p81) {
                                return p81;
                            }
                            int i10 = intValue;
                            i5 = i7;
                            i4 = i10;
                            vy7 = (vy7) obj;
                            if (vy7 == null || (str = vy7.c) == null) {
                            }
                            yb5 = null;
                            if (yb5 != null) {
                            }
                            i7 = i5;
                            i3 = i6;
                            if (it.hasNext()) {
                            }
                            return p81;
                        }
                        sg3.a0("ussdRepository");
                        throw null;
                    }
                    sg3.Z();
                    throw null;
                }
                return sf4.a0((List) collection);
            }
        }
        h40 = new h40(balanceNotificationService, h61);
        Object obj2 = h40.F;
        i2 = h40.H;
        if (i2 != 0) {
        }
        i3 = i6;
        if (it.hasNext()) {
        }
        return sf4.a0((List) collection);
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

    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w.a();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [in8, java.lang.Object] */
    public final Notification c(String str, String str2, String str3, String str4, Map map) {
        PendingIntent pendingIntent;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        PendingIntent pendingIntent2 = pendingIntent;
        d15 d15 = new d15(this, "BalanceNotificationChannel");
        d15.y.icon = getApplicationInfo().icon;
        d15.e(new Object());
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Map map2 = map;
        d15.u = d(this, str5, str6, str7, str8, map2, R.layout.notification_balance_collapsed);
        d15.v = d(this, str5, str6, str7, str8, map2, R.layout.notification_balance);
        d15.g = pendingIntent2;
        d15.k = -1;
        d15.c(2, true);
        d15.c(8, true);
        d15.l = false;
        Notification a = d15.a();
        a.getClass();
        return a;
    }

    public final void e() {
        if (!this.y) {
            this.y = true;
            vd1 vd1 = ((sd1) ((j40) a())).a;
            this.z = (k40) vd1.s.get();
            this.A = (nz7) vd1.m.get();
            this.B = (vp6) vd1.x.get();
            this.C = (rg5) vd1.P.get();
        }
        super.onCreate();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        e();
        sg3.p(this, "BalanceNotificationChannel", R.string.balance_notification_channel_name, R.string.balance_notification_channel_description, 2);
        Notification c = c("--", "--", "--", "--", b42.w);
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(202609, c, 1073741824);
        } else {
            startForeground(202609, c);
        }
        ar7.H(this.D, (e81) null, (r81) null, new ot(this, (f61) null, 1), 3);
        Boolean bool = Boolean.TRUE;
        d37 d37 = E;
        d37.getClass();
        d37.l((Object) null, bool);
    }

    public final void onDestroy() {
        Boolean bool = Boolean.FALSE;
        d37 d37 = E;
        d37.getClass();
        d37.l((Object) null, bool);
        gl0.J(this.D, (CancellationException) null);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
