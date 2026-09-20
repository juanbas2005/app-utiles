package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.encoders.EncodingException;
import cu.lestebang.utiletecsa.widget.VpnToggleActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: c9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c9 implements r8, e77, ko1, xv0, g61, k55, y97, y45, i87 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ c9(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public void K(yb9 yb9) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 21:
                bb0.Y((Intent) obj);
                return;
            case 22:
                ((zc8) obj).b.d((Object) null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    public gm0 a(wr0 wr0) {
        OutputStream outputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        Throwable th3;
        InputStream inputStream;
        Throwable th4;
        wr0 wr02 = wr0;
        hm0 hm0 = (hm0) this.x;
        URL url = (URL) wr02.x;
        String r = dh4.r("CctTransportBackend");
        if (Log.isLoggable(r, 4)) {
            Log.i(r, String.format("Making request to: %s", new Object[]{url}));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(hm0.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) wr02.z;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            ji8 ji8 = hm0.a;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
            am3 am3 = (am3) ji8.x;
            HashMap hashMap = am3.a;
            HashMap hashMap2 = am3.b;
            kn3 kn3 = new kn3(bufferedWriter, hashMap, hashMap2, am3.c, am3.d);
            kn3.h((yy) wr02.y);
            kn3.j();
            kn3.b.flush();
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Integer valueOf = Integer.valueOf(responseCode);
            String r2 = dh4.r("CctTransportBackend");
            if (Log.isLoggable(r2, 4)) {
                Log.i(r2, String.format("Status Code: %d", new Object[]{valueOf}));
            }
            dh4.i("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            dh4.i("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new gm0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new gm0(responseCode, (URL) null, 0);
            }
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                    inputStream = new GZIPInputStream(inputStream2);
                } else {
                    inputStream = inputStream2;
                }
                gm0 gm0 = new gm0(responseCode, (URL) null, c10.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return gm0;
            } catch (Throwable th5) {
                th3.addSuppressed(th5);
            }
            throw th;
            throw th3;
            throw th2;
            throw th4;
        } catch (ConnectException | UnknownHostException e) {
            dh4.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new gm0(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            dh4.l("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new gm0(400, (URL) null, 0);
        } catch (Throwable th6) {
            th.addSuppressed(th6);
        }
    }

    public void b(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ((vr2) ((aq4) obj2).getValue()).y(obj);
                return;
            default:
                VpnToggleActivity vpnToggleActivity = (VpnToggleActivity) obj2;
                q8 q8Var = (q8) obj;
                int i2 = VpnToggleActivity.X;
                q8Var.getClass();
                if (q8Var.w == -1) {
                    ar7.H(t49.O(vpnToggleActivity), (e81) null, (r81) null, new c88(vpnToggleActivity, (f61) null, 0), 3);
                    return;
                } else {
                    vpnToggleActivity.finish();
                    return;
                }
        }
    }

    public Object c(yb9 yb9) {
        Object obj;
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 5:
                return (yb9) ((Callable) obj2).call();
            case 6:
                ((Runnable) obj2).run();
                return b35.l((Object) null);
            case 10:
                String str = (String) obj2;
                if (yb9.k()) {
                    String str2 = (String) yb9.i();
                    if (!TextUtils.isEmpty(str2) && str2.endsWith(str)) {
                        return str;
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(yb9.h());
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((kd6) obj2).getClass();
                Class<IOException> cls = IOException.class;
                synchronized (yb9.a) {
                    z65.m("Task is not yet complete", yb9.c);
                    if (!yb9.d) {
                        boolean isInstance = cls.isInstance(yb9.f);
                        Exception exc = yb9.f;
                        if (isInstance) {
                            throw cls.cast(exc);
                        } else if (exc == null) {
                            obj = yb9.e;
                        } else {
                            throw new RuntimeException(exc);
                        }
                    } else {
                        throw new CancellationException("Task is already canceled.");
                    }
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        rf2.i("INSTANCE_ID_RESET");
                        return null;
                    } else if (string2 != null) {
                        rf2.i(string2);
                        return null;
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        rf2.i("SERVICE_NOT_AVAILABLE");
                        return null;
                    }
                } else {
                    rf2.i("SERVICE_NOT_AVAILABLE");
                    return null;
                }
            default:
                ((CountDownLatch) obj2).countDown();
                return null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v20, types: [java.lang.Object, z00] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x058f A[Catch:{ Exception -> 0x05a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0318 A[EDGE_INSN: B:160:0x0318->B:70:0x0318 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0239 A[Catch:{ NameNotFoundException -> 0x061f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0244 A[Catch:{ NameNotFoundException -> 0x061f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x024f A[Catch:{ NameNotFoundException -> 0x061f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x032c A[LOOP:3: B:71:0x0326->B:73:0x032c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03c7  */
    public Object d(kd6 kd6) {
        String str;
        p91 p91;
        wr0 wr0;
        String str2;
        Throwable th;
        int i;
        Iterator it;
        pe2 pe2;
        String str3;
        long currentTimeMillis;
        String num;
        String str4;
        String str5;
        String str6;
        int v;
        String str7;
        int i2;
        int i3;
        Iterator it2;
        String sb;
        String str8;
        ? obj;
        yb9 yb9;
        p91 p912;
        Context context;
        boolean z;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        int v2;
        yb9 yb92;
        bo6 c;
        kd6 kd62 = kd6;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.x;
        int i4 = CrashlyticsRegistrar.d;
        long currentTimeMillis2 = System.currentTimeMillis();
        oe2 oe2 = (oe2) kd62.a(oe2.class);
        s75 Z = kd62.Z(q91.class);
        s75 Z2 = kd62.Z(ac.class);
        s75 Z3 = kd62.Z(of2.class);
        ExecutorService executorService = (ExecutorService) kd62.s(crashlyticsRegistrar.c);
        oe2.a();
        Context context2 = oe2.a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.6 for " + packageName, (Throwable) null);
        wr0 wr02 = new wr0((ExecutorService) kd62.s(crashlyticsRegistrar.a), (ExecutorService) kd62.s(crashlyticsRegistrar.b));
        md2 md2 = new md2(context2);
        ge1 ge1 = new ge1(oe2);
        f83 f83 = new f83(context2, packageName, (we2) kd62.a(we2.class), ge1);
        q91 q91 = new q91(Z);
        dc dcVar = new dc(Z2);
        h91 h91 = new h91(ge1, md2);
        zf2 zf2 = zf2.a;
        long j = currentTimeMillis2;
        nn6 nn6 = nn6.w;
        zf2 zf22 = zf2.a;
        q91 q912 = q91;
        xf2 a = zf2.a(nn6);
        oe2 oe22 = oe2;
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + nn6 + " already registered.");
        } else {
            a.b = h91;
            Log.d("FirebaseSessions", "Subscriber " + nn6 + " registered.");
            a.a.countDown();
        }
        f83 f832 = f83;
        Context context3 = context2;
        md2 md22 = md2;
        ge1 ge12 = ge1;
        Context context4 = context3;
        String str9 = "FirebaseCrashlytics";
        oe2 oe23 = oe22;
        f83 f833 = f832;
        p91 p913 = new p91(oe23, f833, q912, ge12, new cc(dcVar), new cc(dcVar), md22, h91, new ay4(6, Z3), wr02);
        wr0 wr03 = p913.o;
        oe23.a();
        String str10 = oe23.c.b;
        int v3 = su0.v(context4, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (v3 == 0) {
            v3 = su0.v(context4, "com.crashlytics.android.build_id", "string");
        }
        if (v3 != 0) {
            str = context4.getResources().getString(v3);
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        int v4 = su0.v(context4, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int v5 = su0.v(context4, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int v6 = su0.v(context4, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (v4 == 0 || v5 == 0 || v6 == 0) {
            p91 = p913;
            str2 = str10;
            wr0 = wr03;
            String format = String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(v4), Integer.valueOf(v5), Integer.valueOf(v6)});
            i = 3;
            if (Log.isLoggable(str9, 3)) {
                th = null;
                Log.d(str9, format, (Throwable) null);
                String y = b81.y("Mapping file ID is: ", str);
                if (Log.isLoggable(str9, i)) {
                    Log.d(str9, y, th);
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    id0 id0 = (id0) it.next();
                    String str11 = id0.a;
                    String str12 = id0.b;
                    String str13 = id0.c;
                    StringBuilder o = f21.o("Build id for ", str11, " on ", str12, ": ");
                    o.append(str13);
                    String sb2 = o.toString();
                    if (Log.isLoggable(str9, 3)) {
                        Log.d(str9, sb2, (Throwable) null);
                    }
                }
                jz0 jz0 = new jz0(16, (Object) context4);
                String packageName2 = context4.getPackageName();
                String d = f832.d();
                PackageInfo packageInfo = context4.getPackageManager().getPackageInfo(packageName2, 0);
                if (Build.VERSION.SDK_INT < 28) {
                    num = Long.toString(packageInfo.getLongVersionCode());
                } else {
                    num = Integer.toString(packageInfo.versionCode);
                }
                String str14 = num;
                str4 = packageInfo.versionName;
                if (str4 == null) {
                    str4 = "0.0";
                }
                String str15 = str4;
                wz0 wz0 = new wz0(str2, str, arrayList, d, packageName2, str14, str15, jz0);
                str5 = str2;
                String str16 = str14;
                String str17 = str15;
                String y2 = b81.y("Installer package name is: ", d);
                if (Log.isLoggable(str9, 2)) {
                    Log.v(str9, y2, (Throwable) null);
                }
                z53 z53 = new z53(0);
                String d2 = f832.d();
                n63 n63 = new n63(11);
                uy5 uy5 = new uy5(2, (Object) n63);
                ji8 ji8 = new ji8(md22);
                Locale locale = Locale.US;
                str6 = d2;
                al2 al2 = new al2(f21.h("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), z53);
                String str18 = Build.MANUFACTURER;
                String str19 = f83.h;
                String str20 = str9;
                wz0 wz02 = wz0;
                String l = pb4.l(str18.replaceAll(str19, ""), "/", Build.MODEL.replaceAll(str19, ""));
                String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str19, "");
                String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str19, "");
                v = su0.v(context4, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (v == 0) {
                    v = su0.v(context4, "com.crashlytics.android.build_id", "string");
                }
                if (v == 0) {
                    str7 = context4.getResources().getString(v);
                } else {
                    str7 = null;
                }
                String[] strArr = {str7, str5, str17, str16};
                ArrayList arrayList2 = new ArrayList();
                i2 = 0;
                while (true) {
                    i3 = 4;
                    if (i2 < 4) {
                        break;
                    }
                    String str21 = strArr[i2];
                    String str22 = str5;
                    if (str21 != null) {
                        arrayList2.add(str21.replace("-", "").toLowerCase(Locale.US));
                    }
                    i2++;
                    str5 = str22;
                }
                String str23 = str5;
                Collections.sort(arrayList2);
                StringBuilder sb3 = new StringBuilder();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb3.append((String) it2.next());
                }
                sb = sb3.toString();
                if (sb.length() <= 0) {
                    str8 = su0.N(sb);
                } else {
                    str8 = null;
                }
                if (str6 == null) {
                    i3 = 1;
                }
                obj = new Object();
                AtomicReference atomicReference = new AtomicReference();
                obj.h = atomicReference;
                obj.i = new AtomicReference(new xb7());
                obj.a = context4;
                obj.b = new wp6(str23, l, replaceAll, replaceAll2, f832, str8, str17, str16, f21.b(i3));
                obj.d = n63;
                obj.c = uy5;
                obj.e = ji8;
                obj.f = al2;
                obj.g = ge12;
                atomicReference.set(g22.p(n63));
                AtomicReference atomicReference2 = (AtomicReference) obj.i;
                AtomicReference atomicReference3 = (AtomicReference) obj.h;
                if (!((Context) obj.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((wp6) obj.b).f) || (c = obj.c(1)) == null) {
                    bo6 c2 = obj.c(3);
                    if (c2 != null) {
                        atomicReference3.set(c2);
                        ((xb7) atomicReference2.get()).d(c2);
                    }
                    ge1 ge13 = (ge1) obj.g;
                    yb9 yb93 = ((xb7) ge13.A).a;
                    synchronized (ge13.x) {
                        yb92 = ((xb7) ge13.z).a;
                    }
                    yb9 = rj1.C(yb93, yb92).l((ya1) wr02.x, new kg5(obj, false, wr02, 14));
                } else {
                    atomicReference3.set(c);
                    ((xb7) atomicReference2.get()).d(c);
                    yb9 = b35.l((Object) null);
                }
                yb9.d(executorService, new ta1(25));
                p912 = p91;
                md2 md23 = p912.i;
                context = p912.a;
                if (!(context == null || (resources = context.getResources()) == null)) {
                    v2 = su0.v(context, "com.crashlytics.RequireBuildId", "bool");
                    if (v2 <= 0) {
                        z = resources.getBoolean(v2);
                    } else {
                        int v7 = su0.v(context, "com.crashlytics.RequireBuildId", "string");
                        if (v7 > 0) {
                            z = Boolean.parseBoolean(context.getString(v7));
                        }
                    }
                    wz0 wz03 = wz02;
                    String str24 = (String) wz03.b;
                    if (!z) {
                        str3 = str20;
                        if (Log.isLoggable(str3, 2)) {
                            Log.v(str3, "Configured not to require a build ID.", (Throwable) null);
                        }
                    } else {
                        str3 = str20;
                        if (TextUtils.isEmpty(str24)) {
                            Log.e(str3, ".");
                            Log.e(str3, ".     |  | ");
                            Log.e(str3, ".     |  |");
                            Log.e(str3, ".     |  |");
                            Log.e(str3, ".   \\ |  | /");
                            Log.e(str3, ".    \\    /");
                            Log.e(str3, ".     \\  /");
                            Log.e(str3, ".      \\/");
                            Log.e(str3, ".");
                            Log.e(str3, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str3, ".");
                            Log.e(str3, ".      /\\");
                            Log.e(str3, ".     /  \\");
                            Log.e(str3, ".    /    \\");
                            Log.e(str3, ".   / |  | \\");
                            Log.e(str3, ".     |  |");
                            Log.e(str3, ".     |  |");
                            Log.e(str3, ".     |  |");
                            Log.e(str3, ".");
                            h.s("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            return null;
                        }
                    }
                    String str25 = new jg0().a;
                    p912.f = new jz0(6, "crash_marker", md23);
                    p912.e = new jz0(6, "initialization_marker", md23);
                    wr0 wr04 = wr0;
                    cw0 cw0 = new cw0(str25, md23, wr04);
                    qc3 qc3 = new qc3(md23);
                    hv2 hv2 = new hv2(new a27[]{new ts2(8)});
                    ay4 ay4 = p912.n;
                    ay4.getClass();
                    ((s75) ay4.x).a(new c9(15, new r91(cw0)));
                    z00 z00 = obj;
                    cw0 cw02 = cw0;
                    wz0 wz04 = wz03;
                    qc3 qc32 = qc3;
                    kd6 H = kd6.H(p912.a, p912.h, p912.i, wz04, qc32, cw02, hv2, z00, p912.c, p912.l, p912.o);
                    z00 z002 = z00;
                    Context context5 = p912.a;
                    f83 f834 = p912.h;
                    ge1 ge14 = p912.b;
                    md2 md24 = p912.i;
                    cw0 cw03 = cw02;
                    p912.g = new k91(context5, f834, ge14, md24, p912.f, wz04, cw03, qc32, H, p912.m, p912.k, p912.l, p912.o);
                    jz0 jz02 = p912.e;
                    md2 md25 = (md2) jz02.y;
                    md25.getClass();
                    exists = new File((File) md25.d, (String) jz02.x).exists();
                    Boolean.TRUE.equals((Boolean) ((ya1) wr04.x).w.submit(new oz0(1, p912)).get(3, TimeUnit.SECONDS));
                    k91 k91 = p912.g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    ((ya1) k91.e.x).a(new ga(12, (Object) k91, (Object) str25));
                    xa1 xa1 = new xa1(new wv2(10, k91), z002, defaultUncaughtExceptionHandler, k91.j);
                    k91.n = xa1;
                    Thread.setDefaultUncaughtExceptionHandler(xa1);
                    if (!exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                        if (Log.isLoggable(str3, 3)) {
                            Log.d(str3, "Successfully configured exception handler.", (Throwable) null);
                        }
                        ((ya1) wr04.x).a(new l91(p912, z002, 0));
                        pe2 = new pe2(0);
                        currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis > 16) {
                            String g = f21.g(currentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                            if (Log.isLoggable(str3, 3)) {
                                Log.d(str3, g, (Throwable) null);
                            }
                        }
                        return pe2;
                    }
                    if (Log.isLoggable(str3, 3)) {
                        Log.d(str3, "Crashlytics did not finish previous background initialization. Initializing synchronously.", (Throwable) null);
                    }
                    p912.b(z002);
                    pe2 = new pe2(0);
                    currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis > 16) {
                    }
                    return pe2;
                }
                z = true;
                wz0 wz032 = wz02;
                String str242 = (String) wz032.b;
                if (!z) {
                }
                String str252 = new jg0().a;
                p912.f = new jz0(6, "crash_marker", md23);
                p912.e = new jz0(6, "initialization_marker", md23);
                wr0 wr042 = wr0;
                cw0 cw04 = new cw0(str252, md23, wr042);
                qc3 qc33 = new qc3(md23);
                hv2 hv22 = new hv2(new a27[]{new ts2(8)});
                ay4 ay42 = p912.n;
                ay42.getClass();
                ((s75) ay42.x).a(new c9(15, new r91(cw04)));
                z00 z003 = obj;
                cw0 cw022 = cw04;
                wz0 wz042 = wz032;
                qc3 qc322 = qc33;
                kd6 H2 = kd6.H(p912.a, p912.h, p912.i, wz042, qc322, cw022, hv22, z003, p912.c, p912.l, p912.o);
                z00 z0022 = z003;
                Context context52 = p912.a;
                f83 f8342 = p912.h;
                ge1 ge142 = p912.b;
                md2 md242 = p912.i;
                cw0 cw032 = cw022;
                p912.g = new k91(context52, f8342, ge142, md242, p912.f, wz042, cw032, qc322, H2, p912.m, p912.k, p912.l, p912.o);
                jz0 jz022 = p912.e;
                md2 md252 = (md2) jz022.y;
                md252.getClass();
                exists = new File((File) md252.d, (String) jz022.x).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((ya1) wr042.x).w.submit(new oz0(1, p912)).get(3, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                k91 k912 = p912.g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                ((ya1) k912.e.x).a(new ga(12, (Object) k912, (Object) str252));
                xa1 xa12 = new xa1(new wv2(10, k912), z0022, defaultUncaughtExceptionHandler2, k912.j);
                k912.n = xa12;
                Thread.setDefaultUncaughtExceptionHandler(xa12);
                if (!exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                }
            }
        } else {
            String[] stringArray = context4.getResources().getStringArray(v4);
            String[] stringArray2 = context4.getResources().getStringArray(v5);
            String[] stringArray3 = context4.getResources().getStringArray(v6);
            str2 = str10;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i5 = 0;
                while (i5 < stringArray3.length) {
                    int i6 = i5;
                    arrayList.add(new id0(stringArray[i6], stringArray2[i6], stringArray3[i6]));
                    i5 = i6 + 1;
                    wr03 = wr03;
                    p913 = p913;
                }
                p91 = p913;
                wr0 = wr03;
            } else {
                p91 = p913;
                wr0 = wr03;
                String format2 = String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)});
                if (Log.isLoggable(str9, 3)) {
                    Log.d(str9, format2, (Throwable) null);
                }
            }
            i = 3;
        }
        th = null;
        String y3 = b81.y("Mapping file ID is: ", str);
        if (Log.isLoggable(str9, i)) {
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        jz0 jz03 = new jz0(16, (Object) context4);
        try {
            String packageName22 = context4.getPackageName();
            String d3 = f832.d();
            PackageInfo packageInfo2 = context4.getPackageManager().getPackageInfo(packageName22, 0);
            if (Build.VERSION.SDK_INT < 28) {
            }
            String str142 = num;
            str4 = packageInfo2.versionName;
            if (str4 == null) {
            }
            String str152 = str4;
            wz0 wz05 = new wz0(str2, str, arrayList, d3, packageName22, str142, str152, jz03);
            str5 = str2;
            String str162 = str142;
            String str172 = str152;
            String y22 = b81.y("Installer package name is: ", d3);
            if (Log.isLoggable(str9, 2)) {
            }
            z53 z532 = new z53(0);
            String d22 = f832.d();
            n63 n632 = new n63(11);
            uy5 uy52 = new uy5(2, (Object) n632);
            ji8 ji82 = new ji8(md22);
            Locale locale2 = Locale.US;
            str6 = d22;
            al2 al22 = new al2(f21.h("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), z532);
            String str182 = Build.MANUFACTURER;
            String str192 = f83.h;
            String str202 = str9;
            wz0 wz022 = wz05;
            String l2 = pb4.l(str182.replaceAll(str192, ""), "/", Build.MODEL.replaceAll(str192, ""));
            String replaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str192, "");
            String replaceAll22 = Build.VERSION.RELEASE.replaceAll(str192, "");
            v = su0.v(context4, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (v == 0) {
            }
            if (v == 0) {
            }
            String[] strArr2 = {str7, str5, str172, str162};
            ArrayList arrayList22 = new ArrayList();
            i2 = 0;
            while (true) {
                i3 = 4;
                if (i2 < 4) {
                }
                i2++;
                str5 = str22;
            }
            String str232 = str5;
            Collections.sort(arrayList22);
            StringBuilder sb32 = new StringBuilder();
            it2 = arrayList22.iterator();
            while (it2.hasNext()) {
            }
            sb = sb32.toString();
            if (sb.length() <= 0) {
            }
            if (str6 == null) {
            }
            obj = new Object();
            AtomicReference atomicReference4 = new AtomicReference();
            obj.h = atomicReference4;
            obj.i = new AtomicReference(new xb7());
            obj.a = context4;
            obj.b = new wp6(str232, l2, replaceAll3, replaceAll22, f832, str8, str172, str162, f21.b(i3));
            obj.d = n632;
            obj.c = uy52;
            obj.e = ji82;
            obj.f = al22;
            obj.g = ge12;
            atomicReference4.set(g22.p(n632));
            AtomicReference atomicReference22 = (AtomicReference) obj.i;
            AtomicReference atomicReference32 = (AtomicReference) obj.h;
            if (!((Context) obj.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((wp6) obj.b).f) || (c = obj.c(1)) == null) {
            }
            yb9.d(executorService, new ta1(25));
            p912 = p91;
            md2 md232 = p912.i;
            context = p912.a;
            v2 = su0.v(context, "com.crashlytics.RequireBuildId", "bool");
            if (v2 <= 0) {
            }
            wz0 wz0322 = wz022;
            String str2422 = (String) wz0322.b;
            if (!z) {
            }
            String str2522 = new jg0().a;
            try {
                p912.f = new jz0(6, "crash_marker", md232);
                p912.e = new jz0(6, "initialization_marker", md232);
                wr0 wr0422 = wr0;
                cw0 cw042 = new cw0(str2522, md232, wr0422);
                qc3 qc332 = new qc3(md232);
                hv2 hv222 = new hv2(new a27[]{new ts2(8)});
                ay4 ay422 = p912.n;
                ay422.getClass();
                ((s75) ay422.x).a(new c9(15, new r91(cw042)));
                z00 z0032 = obj;
                cw0 cw0222 = cw042;
                wz0 wz0422 = wz0322;
                qc3 qc3222 = qc332;
                kd6 H22 = kd6.H(p912.a, p912.h, p912.i, wz0422, qc3222, cw0222, hv222, z0032, p912.c, p912.l, p912.o);
                z00 z00222 = z0032;
                Context context522 = p912.a;
                f83 f83422 = p912.h;
                ge1 ge1422 = p912.b;
                md2 md2422 = p912.i;
                cw0 cw0322 = cw0222;
                p912.g = new k91(context522, f83422, ge1422, md2422, p912.f, wz0422, cw0322, qc3222, H22, p912.m, p912.k, p912.l, p912.o);
                jz0 jz0222 = p912.e;
                md2 md2522 = (md2) jz0222.y;
                md2522.getClass();
                exists = new File((File) md2522.d, (String) jz0222.x).exists();
                Boolean.TRUE.equals((Boolean) ((ya1) wr0422.x).w.submit(new oz0(1, p912)).get(3, TimeUnit.SECONDS));
                k91 k9122 = p912.g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler22 = Thread.getDefaultUncaughtExceptionHandler();
                ((ya1) k9122.e.x).a(new ga(12, (Object) k9122, (Object) str2522));
                xa1 xa122 = new xa1(new wv2(10, k9122), z00222, defaultUncaughtExceptionHandler22, k9122.j);
                k9122.n = xa122;
                Thread.setDefaultUncaughtExceptionHandler(xa122);
                if (!exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                }
            } catch (Exception e) {
                Log.e(str3, "Crashlytics was not started due to an exception during initialization", e);
                p912.g = null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            str3 = str9;
            Log.e(str3, "Error retrieving app package info.", e2);
            pe2 = null;
        }
    }

    public void e(nu5 nu5) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 3:
                q91 q91 = (q91) obj;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", (Throwable) null);
                }
                q91.b.set((q91) nu5.get());
                return;
            default:
                r91 r91 = (r91) obj;
                am6 am6 = ((b46) ((of2) nu5.get())).b("firebase").i;
                ((Set) am6.A).add(r91);
                yb9 b = ((qz0) am6.x).b();
                b.e((Executor) am6.z, new yz0(am6, b, r91, 5));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", (Throwable) null);
                    return;
                }
                return;
        }
    }

    public Object f() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 18:
                za6 za6 = (za6) ((z00) obj).i;
                SQLiteDatabase a = za6.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + za6.x.b()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                    a.endTransaction();
                }
            default:
                no7 no7 = (no7) obj;
                for (u10 Z : (Iterable) ((za6) no7.y).l(new ku4(22))) {
                    ((wr0) no7.z).Z(Z, 1, false);
                }
                return null;
        }
    }

    public void g(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 7:
                ((m0) obj2).y(obj);
                return;
            case 8:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$1((zb1) obj2, obj);
                return;
            default:
                ((qj) obj2).y(obj);
                return;
        }
    }

    public void h() {
        gs2 gs2 = (gs2) this.x;
        synchronized (nx6.c) {
            nx6.h = dt0.J0(nx6.h, gs2);
        }
    }

    public j87 i(u72 u72) {
        Context context = (Context) this.x;
        String str = (String) u72.d;
        qa qaVar = (qa) u72.e;
        qaVar.getClass();
        if (str != null && str.length() != 0) {
            return new nr2(context, str, qaVar, true, true);
        }
        h.q("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public boolean j(f96 f96, int i, Bundle bundle) {
        f96 f962;
        ap apVar = (ap) this.x;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((oc3) f96.x).c();
                Parcelable parcelable = (Parcelable) ((oc3) f96.x).f();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        oc3 oc3 = (oc3) f96.x;
        ClipData clipData = new ClipData(oc3.a(), new ClipData.Item(oc3.b()));
        if (i2 >= 31) {
            f962 = new f96(clipData, 2);
        } else {
            u41 u41 = new u41();
            u41.x = clipData;
            u41.y = 2;
            f962 = u41;
        }
        f962.f(oc3.d());
        f962.setExtras(bundle);
        if (e58.i(apVar, f962.build()) == null) {
            return true;
        }
        return false;
    }

    public yb9 q(Object obj) {
        sz0 sz0 = (sz0) obj;
        return b35.l((vz0) this.x);
    }
}
