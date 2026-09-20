package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import cu.lestebang.utiletecsa.R;

/* renamed from: lw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lw2 extends mw2 {
    public static final Object d = new Object();
    public static final lw2 e = new Object();
    public yf3 c;

    public static AlertDialog d(Activity activity, int i, lh8 lh8, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(ch8.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            str = resources.getString(R.string.common_google_play_services_install_button);
        } else if (i == 2) {
            str = resources.getString(R.string.common_google_play_services_update_button);
        } else if (i != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(R.string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, lh8);
        }
        String a = ch8.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", hl6.k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m62, android.app.DialogFragment] */
    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof eq2) {
                rq2 p = ((eq2) activity).p();
                c87 c87 = new c87();
                z65.l("Cannot display null dialog", alertDialog);
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                c87.J0 = alertDialog;
                if (onCancelListener != null) {
                    c87.K0 = onCancelListener;
                }
                c87.G0 = false;
                c87.H0 = true;
                p.getClass();
                q30 q30 = new q30(p);
                q30.o = true;
                q30.f(0, c87, str, 1);
                q30.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        z65.l("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.w = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.x = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new fh8(super.a(googleApiActivity, "d", i), googleApiActivity), googleApiActivity2);
        if (d2 != null) {
            g(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
        }
    }

    public final void e(Activity activity, r54 r54, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new ih8(super.a(activity, "d", i), r54), onCancelListener);
        if (d2 != null) {
            g(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [in8, c15, java.lang.Object] */
    public final void f(Context context, int i, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i2;
        Log.w("GoogleApiAvailability", pb4.i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new yg8(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                str = ch8.e(context, "common_google_play_services_resolution_required_title");
            } else {
                str = ch8.a(context, i);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i == 6 || i == 19) {
                str2 = ch8.d(context, "common_google_play_services_resolution_required_text", ch8.c(context));
            } else {
                str2 = ch8.b(context, i);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            z65.k(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            d15 d15 = new d15(context, (String) null);
            d15.p = true;
            d15.c(16, true);
            d15.e = d15.b(str);
            ? obj = new Object();
            obj.x = d15.b(str2);
            d15.e(obj);
            PackageManager packageManager = context.getPackageManager();
            if (sg3.n == null) {
                sg3.n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            int i3 = 17301642;
            if (sg3.n.booleanValue()) {
                int i4 = context.getApplicationInfo().icon;
                if (i4 != 0) {
                    i3 = i4;
                }
                d15.y.icon = i3;
                d15.k = 2;
                if (sg3.C(context)) {
                    d15.b.add(new z05(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    d15.g = pendingIntent;
                }
            } else {
                d15.y.icon = 17301642;
                String string = resources.getString(R.string.common_google_play_services_notification_ticker);
                d15.y.tickerText = d15.b(string);
                d15.y.when = System.currentTimeMillis();
                d15.g = pendingIntent;
                d15.f = d15.b(str2);
            }
            if (za5.w()) {
                if (za5.w()) {
                    synchronized (d) {
                    }
                    NotificationChannel B = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string2 = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (B == null) {
                        notificationManager.createNotificationChannel(rk0.C(string2));
                    } else if (!string2.contentEquals(B.getName())) {
                        B.setName(string2);
                        notificationManager.createNotificationChannel(B);
                    }
                    d15.w = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification a = d15.a();
            if (i == 1 || i == 2 || i == 3) {
                rw2.a.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
