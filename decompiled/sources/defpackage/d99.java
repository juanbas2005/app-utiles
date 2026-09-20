package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: d99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d99 extends y29 {
    public static final String[] E = {"firebase_", "google_", "ga_"};
    public static final String[] F = {"_err"};
    public int A;
    public uh4 B;
    public Boolean C;
    public Integer D = null;
    public SecureRandom y;
    public final AtomicLong z = new AtomicLong(0);

    public d99(y19 y19) {
        super(y19);
    }

    public static final boolean A1(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    public static boolean D1(String str, String[] strArr) {
        z65.k(strArr);
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean E1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("*") || Arrays.asList(str.split(",")).contains(str2)) {
            return true;
        }
        return false;
    }

    public static boolean G1(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    public static byte[] L1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList W1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xn8 xn8 = (xn8) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", xn8.w);
            bundle.putString("origin", xn8.x);
            bundle.putLong("creation_timestamp", xn8.z);
            bundle.putString("name", xn8.y.x);
            Object f = xn8.y.f();
            z65.k(f);
            p25.H(bundle, f);
            bundle.putBoolean("active", xn8.A);
            String str = xn8.B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zr8 zr8 = xn8.C;
            if (zr8 != null) {
                bundle.putString("timed_out_event_name", zr8.w);
                ur8 ur8 = zr8.x;
                if (ur8 != null) {
                    bundle.putBundle("timed_out_event_params", ur8.l());
                }
            }
            bundle.putLong("trigger_timeout", xn8.D);
            zr8 zr82 = xn8.E;
            if (zr82 != null) {
                bundle.putString("triggered_event_name", zr82.w);
                ur8 ur82 = zr82.x;
                if (ur82 != null) {
                    bundle.putBundle("triggered_event_params", ur82.l());
                }
            }
            bundle.putLong("triggered_timestamp", xn8.y.y);
            bundle.putLong("time_to_live", xn8.F);
            zr8 zr83 = xn8.G;
            if (zr83 != null) {
                bundle.putString("expired_event_name", zr83.w);
                ur8 ur83 = zr83.x;
                if (ur83 != null) {
                    bundle.putBundle("expired_event_params", ur83.l());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean X1(Context context) {
        z65.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void Y1(f59 f59, Bundle bundle, boolean z2) {
        if (!(bundle == null || f59 == null)) {
            if (!bundle.containsKey("_sc") || z2) {
                String str = f59.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = f59.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", f59.c);
                return;
            }
            z2 = false;
        }
        if (bundle != null && f59 == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean c2(String str) {
        z65.h(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public static boolean e2(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String j1(int i, String str, boolean z2) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z2) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean o2(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    public static void u1(c99 c99, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        A1(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        c99.f(str, "_err", bundle);
    }

    public static MessageDigest v1() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long w1(byte[] bArr) {
        z65.k(bArr);
        int length = bArr.length;
        if (length > 0) {
            int i = length - 1;
            int i2 = 0;
            long j = 0;
            while (i >= 0 && i >= bArr.length - 8) {
                j += (((long) bArr[i]) & 255) << i2;
                i2 += 8;
                i--;
            }
            return j;
        }
        throw new IllegalStateException();
    }

    public static boolean x1(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                if (serviceInfo == null || !serviceInfo.enabled) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final Object B1(int i, Object obj, boolean z2, boolean z3) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return j1(i, obj.toString(), z2);
            }
            if (!z3) {
                return null;
            }
            if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle I1 = I1((Bundle) parcelable);
                    if (!I1.isEmpty()) {
                        arrayList.add(I1);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int C1(String str) {
        y19 y19 = (y19) this.w;
        if ("_ldl".equals(str)) {
            y19.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            y19.getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            y19.getClass();
            return 100;
        } else {
            y19.getClass();
            return 36;
        }
    }

    public final boolean F1(String str) {
        b1();
        y19 y19 = (y19) this.w;
        if (cf8.a(y19.w).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.I.b("Permission not granted", str);
        return false;
    }

    public final boolean H1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((y19) this.w).z.g1("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle I1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object l1 = l1(next, bundle.get(next));
                if (l1 == null) {
                    y19 y19 = (y19) this.w;
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.G.b("Param value can't be null", y19.F.b(next));
                } else {
                    t1(bundle2, next, l1);
                }
            }
        }
        return bundle2;
    }

    public final zr8 J1(String str, Bundle bundle, String str2, long j, long j2, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (j2(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle m1 = m1(str, bundle2, Collections.singletonList("_o"), true);
            if (z2) {
                m1 = I1(m1);
            }
            z65.k(m1);
            return new zr8(str, new ur8(m1), str2, j, j2);
        }
        y19 y19 = (y19) this.w;
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.B.b("Invalid conditional property event name", y19.F.c(str));
        ku4.v();
        return null;
    }

    public final boolean K1(Context context, String str) {
        Signature[] signatureArr;
        y19 y19 = (y19) this.w;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c = cf8.a(context).c(64, str);
            if (c == null || (signatureArr = c.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Package name not found", e2);
            return true;
        }
    }

    public final boolean M1(int i) {
        Boolean bool = ((y19) this.w).j().A;
        if (N1() >= i / 1000) {
            return true;
        }
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final int N1() {
        if (this.D == null) {
            mw2 mw2 = mw2.b;
            Context context = ((y19) this.w).w;
            mw2.getClass();
            int i = rw2.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.D = Integer.valueOf(i2 / 1000);
        }
        return this.D.intValue();
    }

    public final void O1(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void P1(String str, ju8 ju8) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning string value to wrapper", e);
        }
    }

    public final void Q1(ju8 ju8, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning long value to wrapper", e);
        }
    }

    public final void R1(ju8 ju8, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning int value to wrapper", e);
        }
    }

    public final void S1(ju8 ju8, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning byte array to wrapper", e);
        }
    }

    public final void T1(ju8 ju8, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z2);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U1(ju8 ju8, Bundle bundle) {
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning bundle value to wrapper", e);
        }
    }

    public final void V1(ju8 ju8, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ju8.z(bundle);
        } catch (RemoteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error returning bundle list to wrapper", e);
        }
    }

    public final String Z1() {
        byte[] bArr = new byte[16];
        b2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final long a2() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.z;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((y19) this.w).G.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.A + 1;
                this.A = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        AtomicLong atomicLong2 = this.z;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1, 1);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom b2() {
        b1();
        if (this.y == null) {
            this.y = new SecureRandom();
        }
        return this.y;
    }

    public final boolean d1() {
        return true;
    }

    public final Bundle d2(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        y19 y19;
        Uri uri2 = uri;
        y19 y192 = (y19) this.w;
        if (uri2 != null) {
            try {
                if (uri2.isHierarchical()) {
                    str9 = uri2.getQueryParameter("utm_campaign");
                    str8 = uri2.getQueryParameter("utm_source");
                    str7 = uri2.getQueryParameter("utm_medium");
                    str6 = uri2.getQueryParameter("gclid");
                    str5 = uri2.getQueryParameter("gbraid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    str = uri2.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str9 = null;
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(str9)) {
                        y19 = y192;
                        bundle.putString("campaign", str9);
                    } else {
                        y19 = y192;
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("source", str8);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("medium", str7);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("gclid", str6);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gbraid", str5);
                    }
                    String queryParameter = uri2.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri2.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri2.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("content", queryParameter3);
                    }
                    String queryParameter4 = uri2.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri2.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri2.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("campaign_id", str4);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("dclid", str3);
                    }
                    String queryParameter7 = uri2.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri2.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri2.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("srsltid", str2);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("sfmc_id", str);
                    }
                    for (String next : uri2.getQueryParameterNames()) {
                        if (next.startsWith("gad_")) {
                            String queryParameter10 = uri2.getQueryParameter(next);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(next, queryParameter10);
                            }
                        }
                    }
                    y19 y193 = y19;
                    if (y193.z.n1((String) null, by8.a1)) {
                        String uri3 = new Uri.Builder().scheme(uri2.getScheme()).authority(uri2.getAuthority()).path(uri2.getPath()).build().toString();
                        y193.z.getClass();
                        int max = Math.max(500, 256);
                        if (uri3.length() > max) {
                            uri3 = j1(max - 3, uri3, true);
                        }
                        if (!TextUtils.isEmpty(uri3)) {
                            bundle.putString("deep_link_url", uri3);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                pz8 pz8 = y192.B;
                y19.g(pz8);
                pz8.E.b("Install referrer url isn't a hierarchical URI", e);
                return null;
            }
        }
        return null;
    }

    public final boolean f2(String str, String str2) {
        y19 y19 = (y19) this.w;
        if (str2 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.D.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.D.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.D.c(str, str2, "Name must start with a letter. Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    pz8 pz84 = y19.B;
                    y19.g(pz84);
                    pz84.D.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean g1(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) <= i) {
            return true;
        }
        pz8 pz8 = ((y19) this.w).B;
        y19.g(pz8);
        pz8.G.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
        return false;
    }

    public final boolean g2(String str, String str2) {
        y19 y19 = (y19) this.w;
        if (str2 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.D.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.D.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    pz8 pz83 = y19.B;
                    y19.g(pz83);
                    pz83.D.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    pz8 pz84 = y19.B;
                    y19.g(pz84);
                    pz84.D.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
            }
            return true;
        }
    }

    public final void h1(String str, String str2, Bundle bundle, List list, boolean z2) {
        int i;
        int i2;
        int i3;
        String str3;
        String str4 = str;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            y19 y19 = (y19) this.w;
            tp8 tp8 = y19.z;
            pz8 pz8 = y19.B;
            fz8 fz8 = y19.F;
            d99 d99 = ((y19) tp8.w).E;
            y19.e(d99);
            if (true != d99.M1(231100000)) {
                i = 0;
            } else {
                i = 35;
            }
            Iterator it = new TreeSet(bundle2.keySet()).iterator();
            int i4 = 0;
            boolean z3 = false;
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (list2 == null || !list2.contains(str5)) {
                    if (!z2) {
                        i2 = m2(str5);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = n2(str5);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str3 = str5;
                    } else {
                        str3 = null;
                    }
                    q1(bundle2, i2, str5, str3);
                    bundle2.remove(str5);
                } else {
                    if (o2(bundle2.get(str5))) {
                        y19.g(pz8);
                        pz8.G.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str4, str2, str5);
                        i3 = 22;
                    } else {
                        String str6 = str2;
                        i3 = k1(str4, str5, bundle2.get(str5), bundle2, list2, z2, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str5)) {
                        q1(bundle2, i3, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (c2(str5) && !D1(str5, b96.x)) {
                        i4++;
                        if (!M1(231100000)) {
                            y19.g(pz8);
                            pz8.D.c(fz8.a(str4), fz8.e(bundle2), "Item array not supported on client's version of Google Play Services (Android Only)");
                            A1(23, bundle2);
                            bundle2.remove(str5);
                        } else if (i4 > i) {
                            if (!z3) {
                                y19.g(pz8);
                                mz8 mz8 = pz8.D;
                                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i);
                                sb.append(" item-scoped custom params");
                                mz8.c(fz8.a(str4), fz8.e(bundle2), sb.toString());
                            }
                            A1(28, bundle2);
                            bundle2.remove(str5);
                            list2 = list;
                            z3 = true;
                        }
                    }
                }
                list2 = list;
            }
        }
    }

    public final boolean h2(String str, String[] strArr, String[] strArr2, String str2) {
        y19 y19 = (y19) this.w;
        if (str2 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.D.b("Name is required and can't be null. Type", str);
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(E[i])) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.D.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !D1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && D1(str2, strArr2)) {
            return true;
        }
        pz8 pz83 = y19.B;
        y19.g(pz83);
        pz83.D.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean i1(String str) {
        y19 y19 = (y19) this.w;
        if (!TextUtils.isEmpty(str)) {
            z65.k(str);
            if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
                return true;
            }
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.D.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", pz8.k1(str));
            return false;
        }
        pz8 pz82 = y19.B;
        y19.g(pz82);
        pz82.D.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean i2(int i, String str, String str2) {
        y19 y19 = (y19) this.w;
        if (str2 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.D.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.D.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public final int j2(String str) {
        String[] strArr;
        if (!g2("event", str)) {
            return 2;
        }
        String[] strArr2 = r16.T;
        if (((y19) this.w).z.n1((String) null, by8.f1)) {
            strArr = r16.V;
        } else {
            strArr = r16.U;
        }
        if (!h2("event", strArr2, strArr, str)) {
            return 13;
        }
        if (!i2(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    public final int k1(String str, String str2, Object obj, Bundle bundle, List list, boolean z2, boolean z3) {
        int i;
        int i2;
        Object obj2;
        int i3;
        Bundle bundle2 = bundle;
        y19 y19 = (y19) this.w;
        b1();
        int i4 = 0;
        if (o2(obj)) {
            if (!z3) {
                return 21;
            }
            if (!D1(str2, b96.w)) {
                return 20;
            }
            r69 j = y19.j();
            j.b1();
            j.d1();
            if (j.j1()) {
                d99 d99 = ((y19) j.w).E;
                y19.e(d99);
                if (d99.N1() < 200900) {
                    return 25;
                }
            }
            boolean z4 = obj instanceof Parcelable[];
            if (z4) {
                i3 = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                i3 = ((ArrayList) obj).size();
            }
            if (i3 > 200) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.G.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(i3));
                i = 17;
                if (z4) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle2.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle2.putParcelableArrayList(str2, new ArrayList(arrayList.subList(0, 200)));
                    }
                }
                i2 = 500;
                if (G1(str) || G1(str2)) {
                    y19.z.getClass();
                    i2 = Math.max(500, 256);
                } else {
                    y19.z.getClass();
                }
                if (!g1("param", str2, i2, obj)) {
                    if (!z3) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        h1(str, str2, (Bundle) obj, list, z2);
                        return i;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i4 < length) {
                            Parcelable parcelable = parcelableArr2[i4];
                            if (!(parcelable instanceof Bundle)) {
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.G.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            h1(str, str2, (Bundle) parcelable, list, z2);
                            i4++;
                        }
                    } else if (!(obj instanceof ArrayList)) {
                        return 4;
                    } else {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            if (!(obj3 instanceof Bundle)) {
                                pz8 pz83 = y19.B;
                                y19.g(pz83);
                                mz8 mz8 = pz83.G;
                                if (obj3 != null) {
                                    obj2 = obj3.getClass();
                                } else {
                                    obj2 = "null";
                                }
                                mz8.c(obj2, str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            h1(str, str2, (Bundle) obj3, list, z2);
                            i4++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        i2 = 500;
        if (G1(str) || G1(str2)) {
        }
        if (!g1("param", str2, i2, obj)) {
        }
        return i;
    }

    public final boolean k2(String str) {
        if (((y19) this.w).z.n1((String) null, by8.f1)) {
            return D1(str, r16.X);
        }
        return D1(str, r16.W);
    }

    public final Object l1(String str, Object obj) {
        y19 y19 = (y19) this.w;
        int i = 500;
        if ("_ev".equals(str)) {
            y19.z.getClass();
            return B1(Math.max(500, 256), obj, true, true);
        }
        if (G1(str)) {
            y19.z.getClass();
            i = Math.max(500, 256);
        } else {
            y19.z.getClass();
        }
        return B1(i, obj, false, true);
    }

    public final int l2(String str) {
        if (!g2("user property", str)) {
            return 6;
        }
        if (!h2("user property", ar7.y0, (String[]) null, str)) {
            return 15;
        }
        ((y19) this.w).getClass();
        if (!i2(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Bundle m1(String str, Bundle bundle, List list, boolean z2) {
        int i;
        int i2;
        String str2;
        String str3;
        String str4 = str;
        Bundle bundle2 = bundle;
        List list2 = list;
        boolean D1 = D1(str4, r16.Z);
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle2);
        y19 y19 = (y19) this.w;
        tp8 tp8 = y19.z;
        fz8 fz8 = y19.F;
        d99 d99 = ((y19) tp8.w).E;
        y19.e(d99);
        if (d99.M1(201500000)) {
            i = 100;
        } else {
            i = 25;
        }
        int i3 = i;
        Iterator it = new TreeSet(bundle2.keySet()).iterator();
        int i4 = 0;
        boolean z3 = false;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list2 == null || !list2.contains(str5)) {
                if (!z2) {
                    i2 = m2(str5);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = n2(str5);
                }
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                if (i2 == 3) {
                    str3 = str5;
                } else {
                    str3 = null;
                }
                q1(bundle3, i2, str5, str3);
                bundle3.remove(str5);
            } else {
                int k1 = k1(str4, str5, bundle2.get(str5), bundle3, list2, z2, D1);
                if (k1 == 17) {
                    q1(bundle3, 17, str5, Boolean.FALSE);
                } else if (k1 != 0 && !"_ev".equals(str5)) {
                    if (k1 == 21) {
                        str2 = str4;
                    } else {
                        str2 = str5;
                    }
                    q1(bundle3, k1, str2, bundle2.get(str5));
                    bundle3.remove(str5);
                }
                if (c2(str5)) {
                    i4++;
                    if (i4 > i3) {
                        if (!z3) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i3);
                            sb.append(" params");
                            String sb2 = sb.toString();
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.D.c(fz8.a(str4), fz8.e(bundle2), sb2);
                        }
                        A1(5, bundle3);
                        bundle3.remove(str5);
                        z3 = true;
                    }
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle3;
    }

    public final int m2(String str) {
        if (!f2("event param", str)) {
            return 3;
        }
        if (!h2("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((y19) this.w).getClass();
        if (!i2(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final void n1(rz8 rz8, int i) {
        Bundle bundle = rz8.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (c2(str) && (i2 = i2 + 1) > i) {
                if (!z2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    y19 y19 = (y19) this.w;
                    pz8 pz8 = y19.B;
                    fz8 fz8 = y19.F;
                    y19.g(pz8);
                    pz8.D.c(fz8.a(rz8.a), fz8.e(bundle), sb2);
                    A1(5, bundle);
                }
                bundle.remove(str);
                z2 = true;
            }
        }
    }

    public final int n2(String str) {
        if (!g2("event param", str)) {
            return 3;
        }
        if (!h2("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((y19) this.w).getClass();
        if (!i2(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final void o1(Parcelable[] parcelableArr, int i) {
        z65.k(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (c2(str) && !D1(str, b96.x) && (i2 = i2 + 1) > i) {
                    if (!z2) {
                        y19 y19 = (y19) this.w;
                        pz8 pz8 = y19.B;
                        fz8 fz8 = y19.F;
                        y19.g(pz8);
                        mz8 mz8 = pz8.D;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        mz8.c(fz8.b(str), fz8.e(bundle), sb.toString());
                    }
                    A1(28, bundle);
                    bundle.remove(str);
                    z2 = true;
                }
            }
        }
    }

    public final void p1(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    d99 d99 = ((y19) this.w).E;
                    y19.e(d99);
                    d99.t1(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void q1(Bundle bundle, int i, String str, Object obj) {
        if (A1(i, bundle)) {
            ((y19) this.w).getClass();
            bundle.putString("_ev", j1(40, str, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    public final int r1(String str, Object obj) {
        boolean z2;
        if ("_ldl".equals(str)) {
            z2 = g1("user property referrer", str, C1(str), obj);
        } else {
            z2 = g1("user property", str, C1(str), obj);
        }
        if (z2) {
            return 0;
        }
        return 7;
    }

    public final Object s1(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return B1(C1(str), obj, true, false);
        }
        return B1(C1(str), obj, false, false);
    }

    public final void t1(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                y19 y19 = (y19) this.w;
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.G.c(y19.F.b(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final uh4 y1() {
        int i;
        int i2;
        vh4 vh4;
        int i3;
        if (this.B == null) {
            Context context = ((y19) this.w).w;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i4 = Build.VERSION.SDK_INT;
            l9 l9Var = l9.a;
            int i5 = 0;
            if (i4 >= 33) {
                i = l9Var.a();
            } else {
                i = 0;
            }
            sb.append(i);
            Log.d("MeasurementManager", sb.toString());
            if (i4 >= 33) {
                i2 = l9Var.a();
            } else {
                i2 = 0;
            }
            uh4 uh4 = null;
            if (i2 >= 5) {
                Object systemService = context.getSystemService(ky2.q());
                systemService.getClass();
                vh4 = new vh4(ky2.e(systemService));
            } else {
                k9 k9Var = k9.a;
                if (i4 == 31 || i4 == 32) {
                    i3 = k9Var.a();
                } else {
                    i3 = 0;
                }
                if (i3 >= 9) {
                    try {
                        MeasurementManager d = MeasurementManager.get(context);
                        d.getClass();
                        vh4 = new vh4(d);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 == 31 || i6 == 32) {
                            i5 = k9Var.a();
                        }
                        sb2.append(i5);
                        Log.d("MeasurementManager", sb2.toString());
                    }
                }
                vh4 = null;
            }
            if (vh4 != null) {
                uh4 = new uh4(vh4);
            }
            this.B = uh4;
        }
        return this.B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf A[RETURN] */
    public final long z1() {
        long j;
        Integer num;
        int i;
        b1();
        y19 y19 = (y19) this.w;
        vy8 l = y19.l();
        pz8 pz8 = y19.B;
        Integer num2 = null;
        if (!E1((String) by8.q0.a((Object) null), l.i1())) {
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            if (i2 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                i = 0;
            } else {
                i = SdkExtensions.getExtensionVersion(1000000);
            }
            if (i < ((Integer) by8.k0.a((Object) null)).intValue()) {
                j = 16;
            } else {
                j = 0;
            }
        }
        if (!F1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.C == null) {
                uh4 y1 = y1();
                if (y1 != null) {
                    try {
                        num = (Integer) y1.b().get(10000, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    z2 = true;
                                }
                            } catch (CancellationException e) {
                                e = e;
                                num2 = num;
                                y19.g(pz8);
                                pz8.E.b("Measurement manager api exception", e);
                                this.C = Boolean.FALSE;
                                num = num2;
                                y19.g(pz8);
                                pz8.J.b("Measurement manager api status result", num);
                                z2 = this.C.booleanValue();
                                if (!z2) {
                                }
                                if (j != 0) {
                                }
                            } catch (ExecutionException e2) {
                                e = e2;
                                num2 = num;
                                y19.g(pz8);
                                pz8.E.b("Measurement manager api exception", e);
                                this.C = Boolean.FALSE;
                                num = num2;
                                y19.g(pz8);
                                pz8.J.b("Measurement manager api status result", num);
                                z2 = this.C.booleanValue();
                                if (!z2) {
                                }
                                if (j != 0) {
                                }
                            } catch (InterruptedException e3) {
                                e = e3;
                                num2 = num;
                                y19.g(pz8);
                                pz8.E.b("Measurement manager api exception", e);
                                this.C = Boolean.FALSE;
                                num = num2;
                                y19.g(pz8);
                                pz8.J.b("Measurement manager api status result", num);
                                z2 = this.C.booleanValue();
                                if (!z2) {
                                }
                                if (j != 0) {
                                }
                            } catch (TimeoutException e4) {
                                e = e4;
                                num2 = num;
                                y19.g(pz8);
                                pz8.E.b("Measurement manager api exception", e);
                                this.C = Boolean.FALSE;
                                num = num2;
                                y19.g(pz8);
                                pz8.J.b("Measurement manager api status result", num);
                                z2 = this.C.booleanValue();
                                if (!z2) {
                                }
                                if (j != 0) {
                                }
                            }
                        }
                        this.C = Boolean.valueOf(z2);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e5) {
                        e = e5;
                        y19.g(pz8);
                        pz8.E.b("Measurement manager api exception", e);
                        this.C = Boolean.FALSE;
                        num = num2;
                        y19.g(pz8);
                        pz8.J.b("Measurement manager api status result", num);
                        z2 = this.C.booleanValue();
                        if (!z2) {
                        }
                        if (j != 0) {
                        }
                    }
                    y19.g(pz8);
                    pz8.J.b("Measurement manager api status result", num);
                }
                if (!z2) {
                    j = 64;
                }
            }
            z2 = this.C.booleanValue();
            if (!z2) {
            }
        }
        if (j != 0) {
            return 1;
        }
        return j;
    }
}
