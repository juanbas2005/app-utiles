package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhw6;", "Lr58;", "sms"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: hw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw6 extends r58 {
    public final nz7 b;
    public final rg5 c;
    public final Context d;
    public final d37 e;
    public final xw5 f;
    public int g;

    public hw6(nz7 nz7, rg5 rg5, vp6 vp6, Context context) {
        nz7.getClass();
        rg5.getClass();
        vp6.getClass();
        this.b = nz7;
        this.c = rg5;
        this.d = context;
        d37 a = e37.a(new is7(6, new zv6()));
        this.e = a;
        this.f = kl8.N(a, new is7(6, new zv6()), u58.a(this));
        ar7.H(u58.a(this), (e81) null, (r81) null, new k05(vp6, this, (f61) null, 19), 3);
        ar7.H(u58.a(this), (e81) null, (r81) null, new gw6(this, (f61) null, 0), 3);
    }

    public final void e(xv6 xv6) {
        String str = xv6.c;
        String str2 = xv6.b;
        if (sg3.e(str, "IMEI_DEVICE")) {
            String g2 = g();
            if (g2 != null) {
                f(str2, g2);
                return;
            }
            this.c.getClass();
            rg5.c(this.d, str2, "");
            return;
        }
        f(str2, xv6.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    public final void f(String str, String str2) {
        SmsManager smsManager;
        Integer num;
        SmsManager smsManager2;
        Object obj;
        Context context = this.d;
        boolean A = sg3.A(context, "android.permission.SEND_SMS");
        rg5 rg5 = this.c;
        if (A) {
            int i = this.g;
            rg5.getClass();
            str.getClass();
            str2.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                smsManager = (SmsManager) context.getSystemService(SmsManager.class);
            } else {
                smsManager = SmsManager.getDefault();
            }
            SmsManager smsManager3 = smsManager;
            SmsManager smsManager4 = null;
            if (i < 0) {
                num = null;
            } else {
                try {
                    Object systemService = context.getSystemService("telephony_subscription_service");
                    systemService.getClass();
                    SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = ((SubscriptionManager) systemService).getActiveSubscriptionInfoForSimSlotIndex(i);
                    if (activeSubscriptionInfoForSimSlotIndex != null) {
                        obj = Integer.valueOf(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId());
                    } else {
                        obj = null;
                    }
                } catch (Throwable th) {
                    obj = new m66(th);
                }
                if (obj instanceof m66) {
                    obj = null;
                }
                num = (Integer) obj;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT < 31) {
                    smsManager4 = SmsManager.getSmsManagerForSubscriptionId(intValue);
                } else if (smsManager3 != null) {
                    smsManager4 = smsManager3.createForSubscriptionId(intValue);
                }
                if (smsManager4 != null) {
                    smsManager2 = smsManager4;
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("cu.lestebang.utiletecsa.action.SMS_SENT").setPackage(context.getPackageName()), 201326592);
                    if (smsManager2 == null) {
                        smsManager2.sendTextMessage(str, (String) null, str2, broadcast, (PendingIntent) null);
                        return;
                    }
                    return;
                }
            }
            smsManager2 = smsManager3;
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent("cu.lestebang.utiletecsa.action.SMS_SENT").setPackage(context.getPackageName()), 201326592);
            if (smsManager2 == null) {
            }
        } else {
            rg5.getClass();
            rg5.c(context, str, str2);
        }
    }

    public final String g() {
        TelephonyManager telephonyManager;
        String str;
        Context context = this.d;
        if (sg3.A(context, "android.permission.READ_PHONE_STATE")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    telephonyManager = (TelephonyManager) systemService;
                } else {
                    telephonyManager = null;
                }
                if (telephonyManager != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        List<Number> E = sg3.E(0, 1);
                        ArrayList arrayList = new ArrayList();
                        for (Number intValue : E) {
                            String k = telephonyManager.getImei(intValue.intValue());
                            if (k != null) {
                                arrayList.add(k);
                            }
                        }
                        str = (String) dt0.y0(arrayList);
                        if (str == null) {
                            str = telephonyManager.getDeviceId();
                        }
                    } else {
                        str = telephonyManager.getDeviceId();
                    }
                    if (str != null) {
                        if (str.length() < 8) {
                            str = null;
                        }
                        if (str != null) {
                            return str.substring(0, 8);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
