package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import java.util.Locale;

/* renamed from: ch8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ch8 {
    public static final zt6 a = new zt6(0);
    public static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String c = c(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{c});
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{c});
            }
            if (i == 5) {
                return d(context, "common_google_play_services_invalid_account_text", c);
            }
            if (i == 7) {
                return d(context, "common_google_play_services_network_error_text", c);
            }
            if (i == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{c});
            }
            if (i == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", c);
            }
            switch (i) {
                case 16:
                    return d(context, "common_google_play_services_api_unavailable_text", c);
                case 17:
                    return d(context, "common_google_play_services_sign_in_failed_text", c);
                case 18:
                    return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{c});
                default:
                    return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{c});
            }
        } else if (sg3.C(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{c});
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = cf8.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        Resources resources;
        zt6 zt6 = a;
        synchronized (zt6) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(b)) {
                    zt6.clear();
                    b = locale;
                }
                String str2 = (String) zt6.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = rw2.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resources.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            StringBuilder sb2 = new StringBuilder(str.length() + 20);
                            sb2.append("Got empty resource: ");
                            sb2.append(str);
                            Log.w("GoogleApiAvailability", sb2.toString());
                        } else {
                            zt6.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
