package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.FirebaseException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: a01  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a01 {
    public static final int[] s = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public boolean b = false;
    public int c;
    public boolean d;
    public boolean e;
    public HttpURLConnection f;
    public nz0 g;
    public final ScheduledExecutorService h;
    public final wz0 i;
    public final oe2 j;
    public final we2 k;
    public final qz0 l;
    public final Context m;
    public final String n;
    public final Random o;
    public final xb4 p;
    public final d01 q;
    public final Object r;

    public a01(oe2 oe2, we2 we2, wz0 wz0, qz0 qz0, Context context, String str, LinkedHashSet linkedHashSet, d01 d01, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.o = new Random();
        this.c = Math.max(8 - d01.c().a, 1);
        this.p = xb4.P;
        this.j = oe2;
        this.i = wz0;
        this.k = we2;
        this.l = qz0;
        this.m = context;
        this.n = str;
        this.q = d01;
        this.d = false;
        this.e = false;
        this.r = new Object();
    }

    public static boolean d(int i2) {
        if (i2 == 408 || i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
            return true;
        }
        return false;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.a.isEmpty() || this.b || this.d || this.e) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e3);
            }
        }
    }

    public final String c(String str) {
        String str2;
        oe2 oe2 = this.j;
        oe2.a();
        Matcher matcher = t.matcher(oe2.c.b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return pb4.m("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", str2, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    public final synchronized void e(long j2) {
        try {
            if (a()) {
                int i2 = this.c;
                if (i2 > 0) {
                    this.c = i2 - 1;
                    this.h.schedule(new ge(4, (Object) this), j2, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new FirebaseException("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void g() {
        for (zz0 a2 : this.a) {
            a2.a();
        }
    }

    public final synchronized void h() {
        this.p.getClass();
        e(Math.max(0, this.q.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0097  */
    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String str3;
        Matcher matcher;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        oe2 oe2 = this.j;
        oe2.a();
        cf2 cf2 = oe2.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", cf2.a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        String str4 = null;
        try {
            byte[] z = hj8.z(context, context.getPackageName());
            if (z == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                str3 = null;
                httpURLConnection.setRequestProperty("X-Android-Cert", str3);
                httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
                httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                HashMap hashMap = new HashMap();
                oe2.a();
                matcher = t.matcher(cf2.b);
                if (matcher.matches()) {
                    str4 = matcher.group(1);
                }
                hashMap.put("project", str4);
                hashMap.put("namespace", this.n);
                hashMap.put("lastKnownVersionNumber", Long.toString(((d01) this.i.g).a.getLong("last_template_version", 0)));
                oe2.a();
                hashMap.put("appId", cf2.b);
                hashMap.put("sdkVersion", "23.1.0");
                hashMap.put("appInstanceId", str);
                byte[] bytes = new JSONObject(hashMap).toString().getBytes("utf-8");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
            str3 = pd8.i(z);
            httpURLConnection.setRequestProperty("X-Android-Cert", str3);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            HashMap hashMap2 = new HashMap();
            oe2.a();
            matcher = t.matcher(cf2.b);
            if (matcher.matches()) {
            }
            hashMap2.put("project", str4);
            hashMap2.put("namespace", this.n);
            hashMap2.put("lastKnownVersionNumber", Long.toString(((d01) this.i.g).a.getLong("last_template_version", 0)));
            oe2.a();
            hashMap2.put("appId", cf2.b);
            hashMap2.put("sdkVersion", "23.1.0");
            hashMap2.put("appInstanceId", str);
            byte[] bytes2 = new JSONObject(hashMap2).toString().getBytes("utf-8");
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream2.write(bytes2);
            bufferedOutputStream2.flush();
            bufferedOutputStream2.close();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized nz0 j(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        try {
            httpURLConnection2 = httpURLConnection;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return new nz0(httpURLConnection2, this.i, this.l, this.a, new zz0(this), this.h, this.q);
    }

    public final void k(Date date) {
        d01 d01 = this.q;
        int i2 = d01.c().a + 1;
        int i3 = 8;
        if (i2 < 8) {
            i3 = i2;
        }
        int[] iArr = s;
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i3 - 1]);
        d01.e(i2, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }
}
