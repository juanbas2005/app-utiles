package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;

/* renamed from: mw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class mw2 {
    public static final int a = 12451000;
    public static final mw2 b = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [mw2, java.lang.Object] */
    static {
        int i = rw2.e;
    }

    public Intent a(Context context, String str, int i) {
        if (i == 1 || i == 2) {
            if (context == null || !sg3.C(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(cf8.a(context).c(0, context.getPackageName()).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0258 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0259 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0100 A[SYNTHETIC, Splitter:B:62:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127 A[Catch:{ NameNotFoundException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012b A[Catch:{ NameNotFoundException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014d  */
    public int b(Context context, int i) {
        boolean z;
        boolean z2;
        String packageName;
        int i2;
        PackageInfo packageInfo;
        int i3;
        PackageInfo packageInfo2;
        int i4;
        int i5;
        boolean z3;
        int i6 = rw2.e;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z4 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !rw2.d.get()) {
            synchronized (rg3.k) {
                try {
                    if (!rg3.l) {
                        rg3.l = true;
                        Bundle bundle = cf8.a(context).b(128, context.getPackageName()).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            rg3.m = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            int i7 = rg3.m;
            if (i7 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (i7 != 12451000) {
                int i8 = a;
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 104 + String.valueOf(i7).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i8);
                sb.append(" but found ");
                sb.append(i7);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!sg3.C(context)) {
            if (sg3.p == null) {
                if (za5.w()) {
                    z3 = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
                } else {
                    z3 = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
                }
                sg3.p = Boolean.valueOf(z3);
            }
            if (!sg3.p.booleanValue()) {
                z = true;
                if (i < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z65.f(z2);
                packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i2 = 9;
                if (!z) {
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            i5 = 134225984;
                        } else {
                            i5 = 8256;
                        }
                        packageInfo = packageManager.getPackageInfo("com.android.vending", i5);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                if (Build.VERSION.SDK_INT < 28) {
                    i3 = 134217792;
                } else {
                    i3 = 64;
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", i3);
                uw2.a(context);
                if (uw2.d(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z) {
                        z65.k(packageInfo);
                        if (!uw2.d(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i9 = packageInfo2.versionCode;
                        int i10 = -1;
                        if (i9 == -1) {
                            i4 = -1;
                        } else {
                            i4 = i9 / 1000;
                        }
                        if (i != -1) {
                            i10 = i / 1000;
                        }
                        if (i4 < i10) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i9).length());
                            sb2.append("Google Play services out of date for ");
                            sb2.append(packageName);
                            sb2.append(".  Requires ");
                            sb2.append(i);
                            sb2.append(" but found ");
                            sb2.append(i9);
                            Log.w("GooglePlayServicesUtil", sb2.toString());
                            i2 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    i2 = 1;
                                    if (i2 != 18) {
                                    }
                                    if (!z4) {
                                    }
                                }
                            }
                            i2 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                }
                if (i2 != 18) {
                    if (i2 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                        break;
                                    }
                                } else {
                                    z4 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    z4 = false;
                }
                if (!z4) {
                    return 18;
                }
                return i2;
            }
        }
        z = false;
        if (i < 0) {
        }
        z65.f(z2);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i2 = 9;
        if (!z) {
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
            }
            packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", i3);
            uw2.a(context);
            if (uw2.d(packageInfo2, true)) {
            }
        } catch (PackageManager.NameNotFoundException unused4) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            i2 = 1;
            if (i2 != 18) {
            }
            if (!z4) {
            }
        }
        if (i2 != 18) {
        }
        if (!z4) {
        }
    }
}
