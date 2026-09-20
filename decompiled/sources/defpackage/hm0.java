package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: hm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hm0 implements bn7 {
    public final ji8 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d = b(hg0.c);
    public final es0 e;
    public final es0 f;
    public final int g;

    public hm0(Context context, es0 es0, es0 es02) {
        am3 am3 = new am3();
        nw nwVar = nw.a;
        am3.a(o70.class, nwVar);
        am3.a(yy.class, nwVar);
        uw uwVar = uw.a;
        am3.a(vb4.class, uwVar);
        am3.a(b10.class, uwVar);
        ow owVar = ow.a;
        am3.a(tr0.class, owVar);
        am3.a(zy.class, owVar);
        mw mwVar = mw.a;
        am3.a(rd.class, mwVar);
        am3.a(wy.class, mwVar);
        tw twVar = tw.a;
        am3.a(rb4.class, twVar);
        am3.a(a10.class, twVar);
        pw pwVar = pw.a;
        am3.a(cv0.class, pwVar);
        am3.a(az.class, pwVar);
        sw swVar = sw.a;
        am3.a(sa2.class, swVar);
        am3.a(t00.class, swVar);
        rw rwVar = rw.a;
        am3.a(ra2.class, rwVar);
        am3.a(s00.class, rwVar);
        vw vwVar = vw.a;
        am3.a(iy4.class, vwVar);
        am3.a(d10.class, vwVar);
        qw qwVar = qw.a;
        am3.a(b92.class, qwVar);
        am3.a(r00.class, qwVar);
        am3.d = true;
        this.a = new ji8(27, (Object) am3);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = es02;
        this.f = es0;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(b81.y("Invalid url: ", str), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        if (((defpackage.gy4) defpackage.gy4.w.get(r0)) != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110  */
    public final p00 a(p00 p00) {
        int i;
        int i2;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        o00 c2 = p00.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c2.i;
        if (hashMap2 != null) {
            hashMap2.put("sdk-version", String.valueOf(i3));
            c2.b("model", Build.MODEL);
            c2.b("hardware", Build.HARDWARE);
            c2.b("device", Build.DEVICE);
            c2.b("product", Build.PRODUCT);
            c2.b("os-uild", Build.ID);
            c2.b("manufacturer", Build.MANUFACTURER);
            c2.b("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
            HashMap hashMap3 = (HashMap) c2.i;
            if (hashMap3 != null) {
                hashMap3.put("tz-offset", String.valueOf(offset));
                int i4 = -1;
                if (activeNetworkInfo == null) {
                    SparseArray sparseArray = hy4.w;
                    i = -1;
                } else {
                    i = activeNetworkInfo.getType();
                }
                HashMap hashMap4 = (HashMap) c2.i;
                if (hashMap4 != null) {
                    hashMap4.put("net-type", String.valueOf(i));
                    if (activeNetworkInfo == null) {
                        SparseArray sparseArray2 = gy4.w;
                    } else {
                        i2 = activeNetworkInfo.getSubtype();
                        if (i2 == -1) {
                            SparseArray sparseArray3 = gy4.w;
                            i2 = 100;
                        }
                        hashMap = (HashMap) c2.i;
                        if (hashMap == null) {
                            hashMap.put("mobile-subtype", String.valueOf(i2));
                            c2.b("country", Locale.getDefault().getCountry());
                            c2.b("locale", Locale.getDefault().getLanguage());
                            Context context = this.c;
                            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                            if (simOperator == null) {
                                simOperator = "";
                            }
                            c2.b("mcc_mnc", simOperator);
                            try {
                                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e2) {
                                dh4.l("CctTransportBackend", "Unable to find version code for package", e2);
                            }
                            c2.b("application_build", Integer.toString(i4));
                            return c2.c();
                        }
                        h.s("Property \"autoMetadata\" has not been set");
                        return null;
                    }
                    i2 = 0;
                    hashMap = (HashMap) c2.i;
                    if (hashMap == null) {
                    }
                } else {
                    h.s("Property \"autoMetadata\" has not been set");
                    return null;
                }
            } else {
                h.s("Property \"autoMetadata\" has not been set");
                return null;
            }
        } else {
            h.s("Property \"autoMetadata\" has not been set");
            return null;
        }
    }
}
