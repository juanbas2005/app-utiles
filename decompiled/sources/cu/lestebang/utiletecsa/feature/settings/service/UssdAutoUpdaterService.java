package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Telephony;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;", "Landroid/app/Service;", "<init>", "()V", "k75", "settings"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class UssdAutoUpdaterService extends Service implements nu2 {
    public static final d37 T = e37.a(Boolean.FALSE);
    public k40 A;
    public h81 B;
    public ig0 C;
    public h27 E;
    public long F;
    public TelephonyManager G;
    public TelephonyCallback H;
    public wx2 I;
    public long J;
    public sy7 K;
    public long L;
    public ConnectivityManager M;
    public db3 N;
    public boolean O;
    public final IntentFilter P;
    public final py7 Q;
    public final IntentFilter R;
    public final py7 S;
    public volatile yl6 w;
    public dv7 z;
    public final Object x = new Object();
    public boolean y = false;
    public final qq4 D = new qq4();

    public UssdAutoUpdaterService() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
        this.P = intentFilter;
        this.Q = new py7(this, 0);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("cu.lestebang.utiletecsa.action.SMS_SENT");
        this.R = intentFilter2;
        this.S = new py7(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0079 -> B:24:0x0061). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009c -> B:24:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService r12, java.lang.String r13, cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r14, defpackage.h61 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.oy7
            if (r0 == 0) goto L13
            r0 = r15
            oy7 r0 = (defpackage.oy7) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            oy7 r0 = new oy7
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.C
            int r1 = r0.E
            r2 = 3
            r3 = 0
            r4 = 2131821594(0x7f11041a, float:1.9275936E38)
            r5 = 2
            r6 = 1
            p81 r7 = defpackage.p81.w
            if (r1 == 0) goto L4b
            if (r1 == r6) goto L3e
            if (r1 != r5) goto L37
            int r13 = r0.B
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r14 = r0.A
            java.lang.String r1 = r0.z
            defpackage.o85.q(r15)
            r15 = r14
            r14 = r1
            goto L61
        L37:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r12)
            r12 = 0
            return r12
        L3e:
            int r13 = r0.B
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r14 = r0.A
            java.lang.String r1 = r0.z
            defpackage.o85.q(r15)     // Catch: java.lang.Exception -> L48
            return r15
        L48:
            r15 = r14
            r14 = r1
            goto L78
        L4b:
            defpackage.o85.q(r15)
            java.lang.String r15 = "android.permission.CALL_PHONE"
            boolean r15 = defpackage.sg3.A(r12, r15)
            if (r15 != 0) goto L5e
            java.lang.String r12 = r12.getString(r4)
            r12.getClass()
            return r12
        L5e:
            r15 = r14
            r14 = r13
            r13 = r3
        L61:
            if (r13 >= r2) goto L9f
            int r1 = r15.getDefaultSimSlot()     // Catch: java.lang.Exception -> L78
            r0.z = r14     // Catch: java.lang.Exception -> L78
            r0.A = r15     // Catch: java.lang.Exception -> L78
            r0.B = r13     // Catch: java.lang.Exception -> L78
            r0.E = r6     // Catch: java.lang.Exception -> L78
            java.lang.Object r12 = r12.h(r1, r0, r14)     // Catch: java.lang.Exception -> L78
            if (r12 != r7) goto L76
            goto Lb0
        L76:
            r7 = r12
            goto Lb0
        L78:
            int r13 = r13 + r6
            if (r13 >= r2) goto L61
            r8 = 5000(0x1388, double:2.4703E-320)
            long r10 = (long) r13
            long r10 = r10 * r8
            hr2 r1 = defpackage.yh7.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r10)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r1.getClass()
            defpackage.hr2.A(r8)
            r0.z = r14
            r0.A = r15
            r0.B = r13
            r0.E = r5
            java.lang.Object r1 = defpackage.t49.G(r10, r0)
            if (r1 != r7) goto L61
            goto Lb0
        L9f:
            hr2 r13 = defpackage.yh7.a
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r13.getClass()
            defpackage.hr2.A(r14)
            java.lang.String r7 = r12.getString(r4)
            r7.getClass()
        Lb0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService.b(cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService, java.lang.String, cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences, h61):java.lang.Object");
    }

    public static final void c(UssdAutoUpdaterService ussdAutoUpdaterService) {
        if (System.currentTimeMillis() - ussdAutoUpdaterService.J > 600000) {
            return;
        }
        ussdAutoUpdaterService.J = 0L;
        String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_call);
        string.getClass();
        ussdAutoUpdaterService.i(string, new ha7(20));
    }

    public static final void d(UssdAutoUpdaterService ussdAutoUpdaterService, String str) {
        PendingIntent pendingIntent;
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
        d15 d15Var = new d15(ussdAutoUpdaterService, "UssdAutoUpdateChannel");
        d15Var.y.icon = ussdAutoUpdaterService.getApplicationInfo().icon;
        d15Var.e = d15.b(ussdAutoUpdaterService.getString(R.string.ussd_auto_update_title, format));
        d15Var.f = d15.b(str);
        Intent launchIntentForPackage = ussdAutoUpdaterService.getPackageManager().getLaunchIntentForPackage(ussdAutoUpdaterService.getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(ussdAutoUpdaterService, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        d15Var.g = pendingIntent;
        d15Var.k = 0;
        d15Var.c(16, true);
        Notification a = d15Var.a();
        a.getClass();
        sg3.W(ussdAutoUpdaterService, 202701, a);
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

    public final Notification e(String str) {
        PendingIntent pendingIntent;
        d15 d15Var = new d15(this, "UssdAutoStatusChannel");
        d15Var.y.icon = getApplicationInfo().icon;
        d15Var.e = d15.b(getString(R.string.ussd_auto_status_title));
        d15Var.f = d15.b(str);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
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

    public final k40 f() {
        k40 k40Var = this.A;
        if (k40Var != null) {
            return k40Var;
        }
        sg3.a0("balanceRepository");
        throw null;
    }

    public final void g() {
        if (!this.y) {
            this.y = true;
            vd1 vd1Var = ((sd1) ((ty7) a())).a;
            this.z = (dv7) vd1Var.l.get();
            this.A = (k40) vd1Var.s.get();
            cz7 cz7Var = (cz7) vd1Var.g.get();
            this.B = zv1.a();
        }
        super.onCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x015d, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0178, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0193, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ae, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c9, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e4, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f9, code lost:
        if (r2 == r15) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r19, defpackage.h61 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService.h(int, h61, java.lang.String):java.lang.Object");
    }

    public final void i(String str, vr2 vr2Var) {
        ig0 ig0Var = this.C;
        if (ig0Var != null) {
            ar7.H(ig0Var, null, null, new p6(this, str, vr2Var, (f61) null), 3);
        } else {
            sg3.a0("scope");
            throw null;
        }
    }

    public final void j(UserDataPreferences userDataPreferences, String str) {
        if (str == null) {
            int ussdAutoIntervalMinutes = userDataPreferences.getUssdAutoIntervalMinutes();
            if (ussdAutoIntervalMinutes < 30) {
                ussdAutoIntervalMinutes = 30;
            }
            str = getString(R.string.ussd_auto_status_idle, Integer.valueOf(ussdAutoIntervalMinutes));
            str.getClass();
        }
        sg3.W(this, 202700, e(str));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        TelephonyManager telephonyManager;
        g();
        w77 d = b85.d();
        h81 h81Var = this.B;
        if (h81Var != null) {
            this.C = gl0.E(rc9.D0(d, h81Var));
            sg3.p(this, "UssdAutoStatusChannel", R.string.ussd_auto_status_channel_name, R.string.ussd_auto_status_channel_description, 2);
            sg3.p(this, "UssdAutoUpdateChannel", R.string.ussd_auto_update_channel_name, R.string.ussd_auto_update_channel_description, 3);
            String string = getString(R.string.ussd_auto_status_starting);
            string.getClass();
            Notification e = e(string);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                startForeground(202700, e, 1073741824);
            } else {
                startForeground(202700, e);
            }
            ig0 ig0Var = this.C;
            if (ig0Var != null) {
                ar7.H(ig0Var, null, null, new gw6(this, null, 11), 3);
                if (sg3.A(this, "android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) getSystemService(TelephonyManager.class)) != null) {
                    this.G = telephonyManager;
                    if (i >= 31) {
                        ry7 ry7Var = new ry7(this);
                        this.H = ry7Var;
                        telephonyManager.registerTelephonyCallback(ag8.v(this), ry7Var);
                    } else {
                        wx2 wx2Var = new wx2(this, 1);
                        this.I = wx2Var;
                        telephonyManager.listen(wx2Var, 32);
                    }
                    IntentFilter intentFilter = this.P;
                    py7 py7Var = this.Q;
                    if (i >= 33) {
                        registerReceiver(py7Var, intentFilter, 4);
                    } else {
                        registerReceiver(py7Var, intentFilter);
                    }
                }
                if (sg3.A(this, "android.permission.READ_SMS")) {
                    sy7 sy7Var = new sy7(new Handler(Looper.getMainLooper()), this);
                    this.K = sy7Var;
                    getContentResolver().registerContentObserver(Telephony.Sms.CONTENT_URI, true, sy7Var);
                    IntentFilter intentFilter2 = this.R;
                    py7 py7Var2 = this.S;
                    if (i >= 33) {
                        registerReceiver(py7Var2, intentFilter2, 4);
                    } else {
                        registerReceiver(py7Var2, intentFilter2);
                    }
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
                if (connectivityManager != null) {
                    this.M = connectivityManager;
                    NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).build();
                    db3 db3Var = new db3(4, this);
                    this.N = db3Var;
                    try {
                        connectivityManager.registerNetworkCallback(build, db3Var);
                    } catch (Throwable unused) {
                    }
                }
                Boolean bool = Boolean.TRUE;
                d37 d37Var = T;
                d37Var.getClass();
                d37Var.l(null, bool);
                return;
            }
            sg3.a0("scope");
            throw null;
        }
        sg3.a0("ioDispatcher");
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        Boolean bool = Boolean.FALSE;
        d37 d37Var = T;
        d37Var.getClass();
        d37Var.l(null, bool);
        h27 h27Var = this.E;
        if (h27Var != null) {
            h27Var.o(null);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            TelephonyCallback telephonyCallback = this.H;
            if (telephonyCallback != null && (telephonyManager2 = this.G) != null) {
                telephonyManager2.unregisterTelephonyCallback(telephonyCallback);
            }
        } else {
            wx2 wx2Var = this.I;
            if (wx2Var != null && (telephonyManager = this.G) != null) {
                telephonyManager.listen(wx2Var, 0);
            }
        }
        try {
            unregisterReceiver(this.Q);
        } catch (Throwable unused) {
        }
        sy7 sy7Var = this.K;
        if (sy7Var != null) {
            getContentResolver().unregisterContentObserver(sy7Var);
        }
        this.K = null;
        try {
            unregisterReceiver(this.S);
        } catch (Throwable unused2) {
        }
        ConnectivityManager connectivityManager = this.M;
        if (connectivityManager != null) {
            db3 db3Var = this.N;
            if (db3Var != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(db3Var);
                } catch (Throwable unused3) {
                }
            }
            this.N = null;
        }
        ig0 ig0Var = this.C;
        if (ig0Var != null) {
            gl0.J(ig0Var, null);
            super.onDestroy();
            return;
        }
        sg3.a0("scope");
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
