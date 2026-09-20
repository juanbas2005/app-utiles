package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CallAlertReceiver extends BroadcastReceiver {
    public static volatile String e;
    public static volatile boolean f;
    public static volatile boolean g;
    public volatile boolean a = false;
    public final Object b = new Object();
    public vp6 c;
    public n78 d;

    public static final String a(CallAlertReceiver callAlertReceiver, Context context, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        th = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        obj = query.getString(query.getColumnIndexOrThrow("display_name"));
                    }
                    query.close();
                } catch (Throwable th) {
                    ed1.i(query, obj3);
                    throw obj3;
                } finally {
                    obj3 = th;
                }
            } else {
                obj = th;
            }
        } catch (Throwable th2) {
            obj = new m66(th2);
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public static final void b(CallAlertReceiver callAlertReceiver, Context context, String str, String str2, boolean z) {
        String str3;
        sg3.p(context, "CallAlertChannel", R.string.call_alert_channel_name, R.string.call_alert_channel_description, 4);
        WeakReference weakReference = CallAlertActivity.R;
        Intent putExtra = new Intent(context, CallAlertActivity.class).addFlags(268435456).putExtra("caller_number", str).putExtra("contact_name", str2).putExtra("is_revertida", z);
        putExtra.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 0, putExtra, 201326592);
        if (z) {
            str3 = context.getString(R.string.call_alert_title_revertida);
        } else {
            str3 = context.getString(R.string.call_alert_title_incoming);
        }
        str3.getClass();
        if (str2 != null) {
            str = pb4.l(str2, " • ", str);
        }
        d15 d15 = new d15(context, "CallAlertChannel");
        d15.y.icon = context.getApplicationInfo().icon;
        d15.e = d15.b(str3);
        d15.f = d15.b(str);
        d15.k = 1;
        d15.q = "call";
        d15.c(16, true);
        d15.g = activity;
        d15.h = activity;
        d15.c(128, true);
        Notification a2 = d15.a();
        a2.getClass();
        sg3.W(context, 202612, a2);
    }

    public final void c(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        vd1 vd1 = (vd1) ((ji0) b96.u(context));
                        this.c = (vp6) vd1.x.get();
                        this.d = (n78) vd1.r.get();
                        this.a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        CallAlertActivity callAlertActivity;
        c(context, intent);
        context.getClass();
        intent.getClass();
        if (sg3.e(intent.getAction(), "android.intent.action.PHONE_STATE")) {
            String stringExtra = intent.getStringExtra("state");
            if (sg3.e(stringExtra, TelephonyManager.EXTRA_STATE_RINGING)) {
                g = false;
                d37 d37 = fi0.d;
                Boolean bool = Boolean.TRUE;
                d37.getClass();
                d37.l((Object) null, bool);
                String stringExtra2 = intent.getStringExtra("incoming_number");
                if (stringExtra2 != null && !d57.I0(stringExtra2)) {
                    e = stringExtra2;
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                dn1 dn1 = aw1.a;
                ar7.H(gl0.E(cm1.y), (e81) null, (r81) null, new f7(stringExtra2, this, context, goAsync, (f61) null, 2), 3);
                return;
            }
            Context context2 = context;
            if (sg3.e(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                g = true;
                e = null;
                f = false;
                fi0 fi0 = fi0.a;
                fi0.b.post(new ka(2));
                WeakReference weakReference = CallAlertActivity.R;
                if (!(weakReference == null || (callAlertActivity = (CallAlertActivity) weakReference.get()) == null)) {
                    callAlertActivity.finish();
                }
                new l15(context2).a.cancel((String) null, 202612);
                return;
            }
            g = false;
            e = null;
            f = false;
            d37 d372 = fi0.d;
            Boolean bool2 = Boolean.FALSE;
            d372.getClass();
            d372.l((Object) null, bool2);
            new l15(context2).a.cancel((String) null, 202612);
        }
    }
}
