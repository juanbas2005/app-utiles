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
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;", "Landroid/app/Service;", "<init>", "()V", "k75", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UssdAutoUpdaterService extends Service implements nu2 {
    public static final d37 T = e37.a(Boolean.FALSE);
    public k40 A;
    public h81 B;
    public ig0 C;
    public final qq4 D = new qq4();
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
    public final Object x = new Object();
    public boolean y = false;
    public dv7 z;

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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[SYNTHETIC, Splitter:B:25:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public static final Object b(UssdAutoUpdaterService ussdAutoUpdaterService, String str, UserDataPreferences userDataPreferences, h61 h61) {
        oy7 oy7;
        int i;
        UserDataPreferences userDataPreferences2;
        String str2;
        int i2;
        if (h61 instanceof oy7) {
            oy7 = (oy7) h61;
            int i3 = oy7.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oy7.E = i3 - Integer.MIN_VALUE;
                Object obj = oy7.C;
                i = oy7.E;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (!sg3.A(ussdAutoUpdaterService, "android.permission.CALL_PHONE")) {
                        String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_read_failed);
                        string.getClass();
                        return string;
                    }
                    userDataPreferences2 = userDataPreferences;
                    str2 = str;
                    i2 = 0;
                } else if (i == 1) {
                    i2 = oy7.B;
                    UserDataPreferences userDataPreferences3 = oy7.A;
                    String str3 = oy7.z;
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (Exception unused) {
                        userDataPreferences2 = userDataPreferences3;
                        str2 = str3;
                        i2++;
                        if (i2 < 3) {
                            long j = ((long) i2) * 5000;
                            yh7.a.getClass();
                            hr2.A(new Long(j));
                            oy7.z = str2;
                            oy7.A = userDataPreferences2;
                            oy7.B = i2;
                            oy7.E = 2;
                            if (t49.G(j, oy7) == p81) {
                                return p81;
                            }
                        }
                        if (i2 >= 3) {
                        }
                    }
                } else if (i == 2) {
                    i2 = oy7.B;
                    UserDataPreferences userDataPreferences4 = oy7.A;
                    String str4 = oy7.z;
                    o85.q(obj);
                    userDataPreferences2 = userDataPreferences4;
                    str2 = str4;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (i2 >= 3) {
                    try {
                    } catch (Exception unused2) {
                        i2++;
                        if (i2 < 3) {
                        }
                        if (i2 >= 3) {
                        }
                    }
                    int defaultSimSlot = userDataPreferences2.getDefaultSimSlot();
                    oy7.z = str2;
                    oy7.A = userDataPreferences2;
                    oy7.B = i2;
                    oy7.E = 1;
                    Object h = ussdAutoUpdaterService.h(defaultSimSlot, oy7, str2);
                    if (h == p81) {
                        return p81;
                    }
                    return h;
                }
                yh7.a.getClass();
                hr2.A(new Object[0]);
                String string2 = ussdAutoUpdaterService.getString(R.string.ussd_auto_read_failed);
                string2.getClass();
                return string2;
            }
        }
        oy7 = new oy7(ussdAutoUpdaterService, h61);
        Object obj2 = oy7.C;
        i = oy7.E;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        if (i2 >= 3) {
        }
    }

    public static final void c(UssdAutoUpdaterService ussdAutoUpdaterService) {
        if (System.currentTimeMillis() - ussdAutoUpdaterService.J <= 600000) {
            ussdAutoUpdaterService.J = 0;
            String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_call);
            string.getClass();
            ussdAutoUpdaterService.i(string, new ha7(20));
        }
    }

    public static final void d(UssdAutoUpdaterService ussdAutoUpdaterService, String str) {
        PendingIntent pendingIntent;
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
        d15 d15 = new d15(ussdAutoUpdaterService, "UssdAutoUpdateChannel");
        d15.y.icon = ussdAutoUpdaterService.getApplicationInfo().icon;
        d15.e = d15.b(ussdAutoUpdaterService.getString(R.string.ussd_auto_update_title, new Object[]{format}));
        d15.f = d15.b(str);
        Intent launchIntentForPackage = ussdAutoUpdaterService.getPackageManager().getLaunchIntentForPackage(ussdAutoUpdaterService.getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(ussdAutoUpdaterService, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        d15.g = pendingIntent;
        d15.k = 0;
        d15.c(16, true);
        Notification a = d15.a();
        a.getClass();
        sg3.W(ussdAutoUpdaterService, 202701, a);
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

    public final Notification e(String str) {
        PendingIntent pendingIntent;
        d15 d15 = new d15(this, "UssdAutoStatusChannel");
        d15.y.icon = getApplicationInfo().icon;
        d15.e = d15.b(getString(R.string.ussd_auto_status_title));
        d15.f = d15.b(str);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        d15.g = pendingIntent;
        d15.k = -1;
        d15.c(2, true);
        d15.c(8, true);
        d15.l = false;
        Notification a = d15.a();
        a.getClass();
        return a;
    }

    public final k40 f() {
        k40 k40 = this.A;
        if (k40 != null) {
            return k40;
        }
        sg3.a0("balanceRepository");
        throw null;
    }

    public final void g() {
        if (!this.y) {
            this.y = true;
            vd1 vd1 = ((sd1) ((ty7) a())).a;
            this.z = (dv7) vd1.l.get();
            this.A = (k40) vd1.s.get();
            cz7 cz7 = (cz7) vd1.g.get();
            this.B = zv1.a();
        }
        super.onCreate();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x044c, code lost:
        r5[r11] = r2;
        r2 = ((defpackage.c50) r0.f()).b(defpackage.vz7.a, "voz", "00:00:00");
        r4.z = null;
        r4.A = r8;
        r4.B = r7;
        r4.C = r8;
        r4.D = r3;
        r4.E = r1;
        r4.F = 1;
        r4.I = 18;
        r2 = defpackage.gr8.H(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0474, code lost:
        if (r2 != r15) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0477, code lost:
        r5 = r3;
        r3 = r7;
        r7 = 1;
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x047c, code lost:
        r6[r7] = r2;
        r0 = ((defpackage.c50) r0.f()).c();
        r4.z = null;
        r4.A = r8;
        r4.B = r3;
        r4.C = r8;
        r4.D = r5;
        r4.E = r1;
        r4.F = 2;
        r4.I = 19;
        r2 = defpackage.gr8.H(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x04a0, code lost:
        if (r2 != r15) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04a2, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04a3, code lost:
        r0 = r1;
        r11 = 2;
        r1 = r8;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04a7, code lost:
        r1[r11] = r2;
        r0 = r3.getString(r0, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04b0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x015d, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0178, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0193, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01ae, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01c9, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e4, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f9, code lost:
        if (r2 == r15) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0238, code lost:
        r8[r11] = r2;
        r0 = ((defpackage.c50) r0.f()).b(defpackage.uz7.a, "vozDias", "--");
        r4.z = null;
        r4.A = r5;
        r4.B = r3;
        r4.C = r5;
        r4.D = r6;
        r4.E = r1;
        r4.F = 1;
        r4.I = 9;
        r2 = defpackage.gr8.H(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0260, code lost:
        if (r2 != r15) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0264, code lost:
        r0 = r1;
        r1 = r5;
        r4 = r1;
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0268, code lost:
        r1[r15] = r2;
        r0 = r3.getString(r0, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0271, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ab, code lost:
        r8[r11] = r2;
        r0 = ((defpackage.c50) r0.f()).b(defpackage.tz7.a, "smsDias", "--");
        r4.z = null;
        r4.A = r5;
        r4.B = r3;
        r4.C = r5;
        r4.D = r6;
        r4.E = r1;
        r4.F = 1;
        r4.I = 11;
        r2 = defpackage.gr8.H(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02d3, code lost:
        if (r2 != r15) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d7, code lost:
        r0 = r1;
        r1 = r5;
        r4 = r1;
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02db, code lost:
        r1[r15] = r2;
        r0 = r3.getString(r0, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02e4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0321, code lost:
        r8[r11] = r3;
        r0 = ((defpackage.c50) r0.f()).b(defpackage.xz7.a, "datosDias", "--");
        r4.z = null;
        r4.A = r2;
        r4.B = r6;
        r4.C = r2;
        r4.D = r5;
        r4.E = r1;
        r4.F = 1;
        r4.I = 13;
        r0 = defpackage.gr8.H(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0349, code lost:
        if (r0 != r15) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x034d, code lost:
        r4 = r2;
        r3 = r6;
        r15 = 1;
        r2 = r0;
        r0 = r1;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0353, code lost:
        r1[r15] = r2;
        r0 = r3.getString(r0, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x035c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0393, code lost:
        r2[r11] = r3;
        r0 = r0.getString(r1, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x039c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03d3, code lost:
        r2[r11] = r3;
        r0 = r0.getString(r1, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0413, code lost:
        r2[r11] = r3;
        r0 = r0.getString(r1, r4);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x041c, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    public final Object h(int i, h61 h61, String str) {
        qy7 qy7;
        int i2;
        UssdAutoUpdaterService ussdAutoUpdaterService;
        Object[] objArr;
        int i3;
        UssdAutoUpdaterService ussdAutoUpdaterService2;
        Object[] objArr2;
        int i4;
        Object[] objArr3;
        Object obj;
        Object[] objArr4;
        int i5;
        Object[] objArr5;
        Object obj2;
        Object[] objArr6;
        int i6;
        Object[] objArr7;
        Object obj3;
        Object[] objArr8;
        int i7;
        Object[] objArr9;
        UssdAutoUpdaterService ussdAutoUpdaterService3;
        int i8;
        Object obj4;
        Object[] objArr10;
        int i9;
        UssdAutoUpdaterService ussdAutoUpdaterService4;
        Object[] objArr11;
        int i10;
        Object[] objArr12;
        int i11;
        UssdAutoUpdaterService ussdAutoUpdaterService5;
        Object[] objArr13;
        int i12;
        Object[] objArr14;
        int i13;
        Object obj5;
        UssdAutoUpdaterService ussdAutoUpdaterService6 = this;
        int i14 = i;
        h61 h612 = h61;
        String str2 = str;
        if (h612 instanceof qy7) {
            qy7 = (qy7) h612;
            int i15 = qy7.I;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                qy7.I = i15 - Integer.MIN_VALUE;
                Object obj6 = qy7.G;
                i2 = qy7.I;
                int i16 = 0;
                p81 p81 = p81.w;
                switch (i2) {
                    case b85.b:
                        o85.q(obj6);
                        if (!d57.x0(str2, "*869", false)) {
                            if (!d57.x0(str2, "*767", false)) {
                                if (!d57.x0(str2, "*328", false)) {
                                    if (!d57.x0(str2, "*266", false)) {
                                        if (!d57.x0(str2, "*732", false)) {
                                            if (!d57.x0(str2, "*264", false)) {
                                                k40 f = ussdAutoUpdaterService6.f();
                                                qy7.z = str2;
                                                qy7.D = i14;
                                                qy7.I = 7;
                                                obj5 = ((c50) f).i(qy7);
                                                break;
                                            } else {
                                                k40 f2 = ussdAutoUpdaterService6.f();
                                                qy7.z = str2;
                                                qy7.D = i14;
                                                qy7.I = 6;
                                                obj5 = ((c50) f2).e(qy7);
                                                break;
                                            }
                                        } else {
                                            k40 f3 = ussdAutoUpdaterService6.f();
                                            qy7.z = str2;
                                            qy7.D = i14;
                                            qy7.I = 5;
                                            obj5 = ((c50) f3).h(qy7);
                                            break;
                                        }
                                    } else {
                                        k40 f4 = ussdAutoUpdaterService6.f();
                                        qy7.z = str2;
                                        qy7.D = i14;
                                        qy7.I = 4;
                                        obj5 = ((c50) f4).f(qy7);
                                        break;
                                    }
                                } else {
                                    k40 f5 = ussdAutoUpdaterService6.f();
                                    qy7.z = str2;
                                    qy7.D = i14;
                                    qy7.I = 3;
                                    obj5 = ((c50) f5).g(qy7);
                                    break;
                                }
                            } else {
                                k40 f6 = ussdAutoUpdaterService6.f();
                                qy7.z = str2;
                                qy7.D = i14;
                                qy7.I = 2;
                                obj5 = ((c50) f6).j(qy7);
                                break;
                            }
                        } else {
                            k40 f7 = ussdAutoUpdaterService6.f();
                            qy7.z = str2;
                            qy7.D = i14;
                            qy7.I = 1;
                            obj5 = ((c50) f7).m(qy7);
                            break;
                        }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i14 = qy7.D;
                        str2 = qy7.z;
                        o85.q(obj6);
                        obj5 = ((o66) obj6).w;
                        o85.q(obj5);
                        if (!d57.x0(str2, "*869", false)) {
                            if (!d57.x0(str2, "*767", false)) {
                                if (!d57.x0(str2, "*328", false)) {
                                    if (!d57.x0(str2, "*266", false)) {
                                        if (!d57.x0(str2, "*732", false)) {
                                            if (!d57.x0(str2, "*264", false)) {
                                                objArr2 = new Object[3];
                                                di2 d = ((c50) ussdAutoUpdaterService6.f()).d();
                                                qy7.z = null;
                                                qy7.A = objArr2;
                                                qy7.B = ussdAutoUpdaterService6;
                                                qy7.C = objArr2;
                                                qy7.D = i14;
                                                qy7.E = R.string.ussd_auto_result_saldo;
                                                qy7.F = 0;
                                                qy7.I = 17;
                                                obj6 = gr8.H(d, qy7);
                                                if (obj6 != p81) {
                                                    i4 = i14;
                                                    i3 = R.string.ussd_auto_result_saldo;
                                                    ussdAutoUpdaterService2 = ussdAutoUpdaterService6;
                                                    objArr = objArr2;
                                                    break;
                                                }
                                            } else {
                                                objArr4 = new Object[1];
                                                di2 b = ((c50) ussdAutoUpdaterService6.f()).b(sz7.a, "amigoStatus", "--");
                                                qy7.z = null;
                                                qy7.A = objArr4;
                                                qy7.B = ussdAutoUpdaterService6;
                                                qy7.C = objArr4;
                                                qy7.D = i14;
                                                i5 = R.string.ussd_auto_result_amigo;
                                                qy7.E = R.string.ussd_auto_result_amigo;
                                                qy7.F = 0;
                                                qy7.I = 16;
                                                obj = gr8.H(b, qy7);
                                                if (obj != p81) {
                                                    objArr3 = objArr4;
                                                    break;
                                                }
                                            }
                                        } else {
                                            objArr6 = new Object[1];
                                            di2 b2 = ((c50) ussdAutoUpdaterService6.f()).b(wz7.a, "fechaNacional", "--");
                                            qy7.z = null;
                                            qy7.A = objArr6;
                                            qy7.B = ussdAutoUpdaterService6;
                                            qy7.C = objArr6;
                                            qy7.D = i14;
                                            i6 = R.string.ussd_auto_result_nacional;
                                            qy7.E = R.string.ussd_auto_result_nacional;
                                            qy7.F = 0;
                                            qy7.I = 15;
                                            obj2 = gr8.H(b2, qy7);
                                            if (obj2 != p81) {
                                                objArr5 = objArr6;
                                                break;
                                            }
                                        }
                                    } else {
                                        objArr8 = new Object[1];
                                        di2 b3 = ((c50) ussdAutoUpdaterService6.f()).b(rz7.a, "bonoDatosCu", "");
                                        qy7.z = null;
                                        qy7.A = objArr8;
                                        qy7.B = ussdAutoUpdaterService6;
                                        qy7.C = objArr8;
                                        qy7.D = i14;
                                        i7 = R.string.ussd_auto_result_bono;
                                        qy7.E = R.string.ussd_auto_result_bono;
                                        qy7.F = 0;
                                        qy7.I = 14;
                                        obj3 = gr8.H(b3, qy7);
                                        if (obj3 != p81) {
                                            objArr7 = objArr8;
                                            break;
                                        }
                                    }
                                } else {
                                    objArr10 = new Object[2];
                                    di2 b4 = ((c50) ussdAutoUpdaterService6.f()).b(xz7.a, "datos", "");
                                    qy7.z = null;
                                    qy7.A = objArr10;
                                    qy7.B = ussdAutoUpdaterService6;
                                    qy7.C = objArr10;
                                    qy7.D = i14;
                                    qy7.E = R.string.ussd_auto_result_datos;
                                    qy7.F = 0;
                                    qy7.I = 12;
                                    obj4 = gr8.H(b4, qy7);
                                    if (obj4 != p81) {
                                        i8 = i14;
                                        i9 = R.string.ussd_auto_result_datos;
                                        ussdAutoUpdaterService3 = ussdAutoUpdaterService6;
                                        objArr9 = objArr10;
                                        break;
                                    }
                                }
                            } else {
                                objArr12 = new Object[2];
                                di2 b5 = ((c50) ussdAutoUpdaterService6.f()).b(tz7.a, "sms", "--");
                                qy7.z = null;
                                qy7.A = objArr12;
                                qy7.B = ussdAutoUpdaterService6;
                                qy7.C = objArr12;
                                qy7.D = i14;
                                qy7.E = R.string.ussd_auto_result_sms;
                                qy7.F = 0;
                                qy7.I = 10;
                                obj6 = gr8.H(b5, qy7);
                                if (obj6 != p81) {
                                    i10 = i14;
                                    i11 = R.string.ussd_auto_result_sms;
                                    objArr11 = objArr12;
                                    ussdAutoUpdaterService4 = ussdAutoUpdaterService6;
                                    break;
                                }
                            }
                        } else {
                            objArr14 = new Object[2];
                            di2 b6 = ((c50) ussdAutoUpdaterService6.f()).b(uz7.a, "voz", "--");
                            qy7.z = null;
                            qy7.A = objArr14;
                            qy7.B = ussdAutoUpdaterService6;
                            qy7.C = objArr14;
                            qy7.D = i14;
                            qy7.E = R.string.ussd_auto_result_voz;
                            qy7.F = 0;
                            qy7.I = 8;
                            obj6 = gr8.H(b6, qy7);
                            if (obj6 != p81) {
                                i12 = i14;
                                i13 = R.string.ussd_auto_result_voz;
                                objArr13 = objArr14;
                                ussdAutoUpdaterService5 = ussdAutoUpdaterService6;
                                break;
                            }
                        }
                        break;
                    case 8:
                        i16 = qy7.F;
                        i13 = qy7.E;
                        int i17 = qy7.D;
                        Object[] objArr15 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService7 = qy7.B;
                        Object[] objArr16 = qy7.A;
                        o85.q(obj6);
                        UssdAutoUpdaterService ussdAutoUpdaterService8 = ussdAutoUpdaterService7;
                        i12 = i17;
                        ussdAutoUpdaterService5 = ussdAutoUpdaterService8;
                        Object[] objArr17 = objArr16;
                        objArr13 = objArr15;
                        objArr14 = objArr17;
                        break;
                    case 9:
                        int i18 = qy7.F;
                        int i19 = qy7.E;
                        Object[] objArr18 = qy7.C;
                        ussdAutoUpdaterService5 = qy7.B;
                        Object[] objArr19 = qy7.A;
                        o85.q(obj6);
                        break;
                    case 10:
                        i16 = qy7.F;
                        i11 = qy7.E;
                        int i20 = qy7.D;
                        Object[] objArr20 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService9 = qy7.B;
                        Object[] objArr21 = qy7.A;
                        o85.q(obj6);
                        UssdAutoUpdaterService ussdAutoUpdaterService10 = ussdAutoUpdaterService9;
                        i10 = i20;
                        ussdAutoUpdaterService4 = ussdAutoUpdaterService10;
                        Object[] objArr22 = objArr21;
                        objArr11 = objArr20;
                        objArr12 = objArr22;
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        int i21 = qy7.F;
                        int i22 = qy7.E;
                        Object[] objArr23 = qy7.C;
                        ussdAutoUpdaterService4 = qy7.B;
                        Object[] objArr24 = qy7.A;
                        o85.q(obj6);
                        break;
                    case 12:
                        i16 = qy7.F;
                        i9 = qy7.E;
                        int i23 = qy7.D;
                        Object[] objArr25 = qy7.C;
                        ussdAutoUpdaterService3 = qy7.B;
                        Object[] objArr26 = qy7.A;
                        o85.q(obj6);
                        int i24 = i23;
                        obj4 = obj6;
                        objArr10 = objArr26;
                        objArr9 = objArr25;
                        i8 = i24;
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        int i25 = qy7.F;
                        int i26 = qy7.E;
                        Object[] objArr27 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService11 = qy7.B;
                        Object[] objArr28 = qy7.A;
                        o85.q(obj6);
                        break;
                    case 14:
                        i16 = qy7.F;
                        int i27 = qy7.E;
                        Object[] objArr29 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService12 = qy7.B;
                        objArr7 = qy7.A;
                        o85.q(obj6);
                        Object[] objArr30 = objArr29;
                        i7 = i27;
                        ussdAutoUpdaterService6 = ussdAutoUpdaterService12;
                        obj3 = obj6;
                        objArr8 = objArr30;
                        break;
                    case h75.g /*15*/:
                        i16 = qy7.F;
                        int i28 = qy7.E;
                        Object[] objArr31 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService13 = qy7.B;
                        objArr5 = qy7.A;
                        o85.q(obj6);
                        Object[] objArr32 = objArr31;
                        i6 = i28;
                        ussdAutoUpdaterService6 = ussdAutoUpdaterService13;
                        obj2 = obj6;
                        objArr6 = objArr32;
                        break;
                    case 16:
                        i16 = qy7.F;
                        int i29 = qy7.E;
                        Object[] objArr33 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService14 = qy7.B;
                        objArr3 = qy7.A;
                        o85.q(obj6);
                        Object[] objArr34 = objArr33;
                        i5 = i29;
                        ussdAutoUpdaterService6 = ussdAutoUpdaterService14;
                        obj = obj6;
                        objArr4 = objArr34;
                        break;
                    case 17:
                        i16 = qy7.F;
                        i3 = qy7.E;
                        i4 = qy7.D;
                        objArr2 = qy7.C;
                        ussdAutoUpdaterService2 = qy7.B;
                        objArr = qy7.A;
                        o85.q(obj6);
                        break;
                    case 18:
                        int i30 = qy7.F;
                        int i31 = qy7.E;
                        int i32 = qy7.D;
                        Object[] objArr35 = qy7.C;
                        UssdAutoUpdaterService ussdAutoUpdaterService15 = qy7.B;
                        objArr = qy7.A;
                        o85.q(obj6);
                        UssdAutoUpdaterService ussdAutoUpdaterService16 = ussdAutoUpdaterService15;
                        int i33 = i30;
                        i3 = i31;
                        ussdAutoUpdaterService = ussdAutoUpdaterService16;
                        break;
                    case 19:
                        int i34 = qy7.F;
                        int i35 = qy7.E;
                        Object[] objArr36 = qy7.C;
                        ussdAutoUpdaterService = qy7.B;
                        Object[] objArr37 = qy7.A;
                        o85.q(obj6);
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        qy7 = new qy7(ussdAutoUpdaterService6, h612);
        Object obj62 = qy7.G;
        i2 = qy7.I;
        int i162 = 0;
        p81 p812 = p81.w;
        switch (i2) {
            case b85.b:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                break;
            case 12:
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                break;
            case 14:
                break;
            case h75.g /*15*/:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
    }

    public final void i(String str, vr2 vr2) {
        ig0 ig0 = this.C;
        if (ig0 != null) {
            ar7.H(ig0, (e81) null, (r81) null, new p6(this, str, vr2, (f61) null), 3);
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
            str = getString(R.string.ussd_auto_status_idle, new Object[]{Integer.valueOf(ussdAutoIntervalMinutes)});
            str.getClass();
        }
        sg3.W(this, 202700, e(str));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        TelephonyManager telephonyManager;
        g();
        w77 d = b85.d();
        h81 h81 = this.B;
        if (h81 != null) {
            this.C = gl0.E(rc9.D0(d, h81));
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
            ig0 ig0 = this.C;
            if (ig0 != null) {
                ar7.H(ig0, (e81) null, (r81) null, new gw6(this, (f61) null, 11), 3);
                if (sg3.A(this, "android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) getSystemService(TelephonyManager.class)) != null) {
                    this.G = telephonyManager;
                    if (i >= 31) {
                        ry7 ry7 = new ry7(this);
                        this.H = ry7;
                        telephonyManager.registerTelephonyCallback(ag8.v(this), ry7);
                    } else {
                        wx2 wx2 = new wx2(this, 1);
                        this.I = wx2;
                        telephonyManager.listen(wx2, 32);
                    }
                    IntentFilter intentFilter = this.P;
                    py7 py7 = this.Q;
                    if (i >= 33) {
                        registerReceiver(py7, intentFilter, 4);
                    } else {
                        registerReceiver(py7, intentFilter);
                    }
                }
                if (sg3.A(this, "android.permission.READ_SMS")) {
                    sy7 sy7 = new sy7(new Handler(Looper.getMainLooper()), this);
                    this.K = sy7;
                    getContentResolver().registerContentObserver(Telephony.Sms.CONTENT_URI, true, sy7);
                    IntentFilter intentFilter2 = this.R;
                    py7 py72 = this.S;
                    if (i >= 33) {
                        registerReceiver(py72, intentFilter2, 4);
                    } else {
                        registerReceiver(py72, intentFilter2);
                    }
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
                if (connectivityManager != null) {
                    this.M = connectivityManager;
                    NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).build();
                    db3 db3 = new db3(4, this);
                    this.N = db3;
                    try {
                        connectivityManager.registerNetworkCallback(build, db3);
                    } catch (Throwable unused) {
                    }
                }
                Boolean bool = Boolean.TRUE;
                d37 d37 = T;
                d37.getClass();
                d37.l((Object) null, bool);
                return;
            }
            sg3.a0("scope");
            throw null;
        }
        sg3.a0("ioDispatcher");
        throw null;
    }

    public final void onDestroy() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        Boolean bool = Boolean.FALSE;
        d37 d37 = T;
        d37.getClass();
        d37.l((Object) null, bool);
        h27 h27 = this.E;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            TelephonyCallback telephonyCallback = this.H;
            if (!(telephonyCallback == null || (telephonyManager2 = this.G) == null)) {
                telephonyManager2.unregisterTelephonyCallback(telephonyCallback);
            }
        } else {
            wx2 wx2 = this.I;
            if (!(wx2 == null || (telephonyManager = this.G) == null)) {
                telephonyManager.listen(wx2, 0);
            }
        }
        try {
            unregisterReceiver(this.Q);
        } catch (Throwable unused) {
        }
        sy7 sy7 = this.K;
        if (sy7 != null) {
            getContentResolver().unregisterContentObserver(sy7);
        }
        this.K = null;
        try {
            unregisterReceiver(this.S);
        } catch (Throwable unused2) {
        }
        ConnectivityManager connectivityManager = this.M;
        if (connectivityManager != null) {
            db3 db3 = this.N;
            if (db3 != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(db3);
                } catch (Throwable unused3) {
                }
            }
            this.N = null;
        }
        ig0 ig0 = this.C;
        if (ig0 != null) {
            gl0.J(ig0, (CancellationException) null);
            super.onDestroy();
            return;
        }
        sg3.a0("scope");
        throw null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
