package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* renamed from: ve2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ve2 implements we2 {
    public static final Object m = new Object();
    public final oe2 a;
    public final te2 b;
    public final hv2 c;
    public final i18 d;
    public final oz3 e;
    public final xv5 f;
    public final Object g;
    public final ExecutorService h;
    public final il6 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [xv5, java.lang.Object] */
    public ve2(oe2 oe2, nu5 nu5, ExecutorService executorService, il6 il6) {
        oe2.a();
        te2 te2 = new te2(oe2.a, nu5);
        hv2 hv2 = new hv2(oe2);
        if (tz2.x == null) {
            tz2.x = new tz2(11);
        }
        tz2 tz2 = tz2.x;
        if (i18.c == null) {
            i18.c = new i18(tz2);
        }
        i18 i18 = i18.c;
        oz3 oz3 = new oz3(new wv0(2, oe2));
        ? obj = new Object();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = oe2;
        this.b = te2;
        this.c = hv2;
        this.d = i18;
        this.e = oz3;
        this.f = obj;
        this.h = executorService;
        this.i = il6;
    }

    public final void a() {
        jz0 c2;
        g10 Y0;
        synchronized (m) {
            try {
                oe2 oe2 = this.a;
                oe2.a();
                c2 = jz0.c(oe2.a);
                Y0 = this.c.Y0();
                int i2 = Y0.b;
                boolean z = true;
                if (i2 != 2) {
                    if (i2 != 1) {
                        z = false;
                    }
                }
                if (z) {
                    String f2 = f(Y0);
                    hv2 hv2 = this.c;
                    f10 a2 = Y0.a();
                    a2.a = f2;
                    a2.b = 3;
                    Y0 = a2.a();
                    hv2.R0(Y0);
                }
                if (c2 != null) {
                    c2.T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i(Y0);
        this.i.execute(new ue2(this, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0160, code lost:
        r12.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0166, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:6:0x0055] */
    public final g10 b(g10 g10) {
        boolean z;
        t10 f2;
        t10 t10;
        g10 g102 = g10;
        te2 te2 = this.b;
        oe2 oe2 = this.a;
        oe2.a();
        String str = oe2.c.a;
        String str2 = g102.a;
        oe2 oe22 = this.a;
        oe22.a();
        String str3 = oe22.c.h;
        String str4 = g102.d;
        gm0 gm0 = te2.c;
        if (gm0.a()) {
            URL a2 = te2.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            int i2 = 0;
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c2 = te2.c(a2, str);
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c2.setDoOutput(true);
                    te2.h(c2);
                    int responseCode = c2.getResponseCode();
                    gm0.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        f2 = te2.f(c2);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        te2.b(c2, (String) null, str, str3);
                        int i3 = i2;
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) == 1) {
                                t10 = new t10(3, 0, (String) null);
                            } else {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) == 1) {
                                    t10 = new t10(2, 0, (String) null);
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            }
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i3 + 1;
                        } else {
                            throw new FirebaseException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        f2 = t10;
                    }
                    int B = b81.B(f2.c);
                    if (B == 0) {
                        String str5 = f2.a;
                        long j2 = f2.b;
                        this.d.a.getClass();
                        f10 a3 = g102.a();
                        a3.c = str5;
                        a3.e = j2;
                        a3.f = System.currentTimeMillis() / 1000;
                        a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                        return a3.a();
                    } else if (B == 1) {
                        f10 a4 = g102.a();
                        a4.g = "BAD CONFIG";
                        a4.b = 5;
                        return a4.a();
                    } else if (B == 2) {
                        synchronized (this) {
                            this.j = null;
                        }
                        f10 a5 = g102.a();
                        a5.b = 2;
                        return a5.a();
                    } else {
                        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                }
            }
            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final yb9 c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return b35.l(str);
        }
        xb7 xb7 = new xb7();
        qv2 qv2 = new qv2(xb7);
        synchronized (this.g) {
            this.l.add(qv2);
        }
        yb9 yb9 = xb7.a;
        this.h.execute(new ue2(this, 0));
        return yb9;
    }

    public final yb9 d() {
        e();
        xb7 xb7 = new xb7();
        lv2 lv2 = new lv2(this.d, xb7);
        synchronized (this.g) {
            this.l.add(lv2);
        }
        yb9 yb9 = xb7.a;
        this.h.execute(new ue2(this, 1));
        return yb9;
    }

    public final void e() {
        oe2 oe2 = this.a;
        oe2.a();
        z65.i(oe2.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oe2.a();
        z65.i(oe2.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oe2.a();
        z65.i(oe2.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        oe2.a();
        String str = oe2.c.b;
        Pattern pattern = i18.b;
        z65.e("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        oe2.a();
        z65.e("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i18.b.matcher(oe2.c.a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.b) != false) goto L_0x001e;
     */
    public final String f(g10 g10) {
        String string;
        oe2 oe2 = this.a;
        oe2.a();
        if (!oe2.b.equals("CHIME_ANDROID_SDK")) {
            oe2 oe22 = this.a;
            oe22.a();
        }
        if (g10.b == 1) {
            k83 k83 = (k83) this.e.get();
            synchronized (k83.a) {
                try {
                    synchronized (k83.a) {
                        string = k83.a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = k83.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f.getClass();
            return xv5.a();
        }
        this.f.getClass();
        return xv5.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0188, code lost:
        r15.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ IOException | AssertionError -> 0x018f, all -> 0x00c8 }, ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x018f, all -> 0x00c8 }]), Splitter:B:34:0x00ba] */
    public final g10 g(g10 g10) {
        int i2;
        HttpURLConnection c2;
        boolean z;
        w00 w00;
        g10 g102 = g10;
        String str = g102.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            k83 k83 = (k83) this.e.get();
            synchronized (k83.a) {
                try {
                    String[] strArr = k83.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        }
                        String str3 = strArr[i3];
                        String string = k83.a.getString("|T|" + k83.b + "|" + str3, (String) null);
                        if (string != null && !string.isEmpty()) {
                            break;
                        }
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        te2 te2 = this.b;
        oe2 oe2 = this.a;
        oe2.a();
        String str4 = oe2.c.a;
        String str5 = g102.a;
        oe2 oe22 = this.a;
        oe22.a();
        String str6 = oe22.c.h;
        oe2 oe23 = this.a;
        oe23.a();
        String str7 = oe23.c.b;
        gm0 gm0 = te2.c;
        if (gm0.a()) {
            URL a2 = te2.a("projects/" + str6 + "/installations");
            i2 = 0;
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                c2 = te2.c(a2, str4);
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    te2.g(c2, str5, str7);
                    int responseCode = c2.getResponseCode();
                    gm0.b(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        w00 = te2.e(c2);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        te2.b(c2, str7, str4, str6);
                        if (responseCode == 429) {
                            throw new FirebaseException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            w00 w002 = new w00((String) null, (String) null, (String) null, (t10) null, 2);
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            w00 = w002;
                        } else {
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        }
                    }
                    int B = b81.B(w00.e);
                    if (B == 0) {
                        String str8 = w00.b;
                        String str9 = w00.c;
                        this.d.a.getClass();
                        t10 t10 = w00.d;
                        String str10 = t10.a;
                        long j2 = t10.b;
                        f10 a3 = g102.a();
                        a3.a = str8;
                        a3.b = 4;
                        a3.c = str10;
                        a3.d = str9;
                        a3.e = j2;
                        a3.f = System.currentTimeMillis() / 1000;
                        a3.h = (byte) (((byte) (a3.h | 1)) | 2);
                        return a3.a();
                    } else if (B == 1) {
                        f10 a4 = g102.a();
                        a4.g = "BAD CONFIG";
                        a4.b = 5;
                        return a4.a();
                    } else {
                        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                }
            }
            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        c2.disconnect();
        TrafficStats.clearThreadStatsTag();
        i2++;
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((l37) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void i(g10 g10) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((l37) it.next()).b(g10)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }
}
