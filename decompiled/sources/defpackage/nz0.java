package defpackage;

import android.os.Handler;
import android.util.Log;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz0 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public nz0(xj0 xj0, nk1 nk1, Handler handler) {
        this.a = false;
        this.h = new Object();
        this.i = new yx(1, this);
        this.j = new wv2(12, this);
        w95.l();
        this.b = xj0;
        this.e = nk1;
        this.f = handler;
    }

    public void a(long j2, int i2) {
        if (i2 == 0) {
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        ((ScheduledExecutorService) this.g).schedule(new mz0(this, i2, j2), (long) ((Random) this.h).nextInt(4), TimeUnit.SECONDS);
    }

    public void b(InputStream inputStream) {
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = str.concat(readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (str.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.");
                            ((zz0) this.f).a();
                            break;
                        }
                        synchronized (this) {
                            isEmpty = ((LinkedHashSet) this.b).isEmpty();
                        }
                        if (isEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j2 = ((d01) ((wz0) this.d).g).a.getLong("last_template_version", 0);
                            long j3 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j3 > j2) {
                                a(j3, 3);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        str = "";
                    } catch (JSONException e2) {
                        new FirebaseException("Unable to parse config update message.", e2.getCause());
                        d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.c;
        if (httpURLConnection != null) {
            InputStream inputStream = null;
            try {
                inputStream = httpURLConnection.getInputStream();
                b(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
                    }
                }
            } catch (IOException e3) {
                if (!this.a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e3);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e4);
                    }
                }
                throw th;
            }
        }
    }

    public synchronized void d() {
        for (zz0 a2 : (LinkedHashSet) this.b) {
            a2.a();
        }
    }

    public synchronized void e(int i2) {
        ((xb4) this.i).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i2) * 1000));
        d01 d01 = (d01) this.j;
        synchronized (d01.d) {
            d01.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public nz0(HttpURLConnection httpURLConnection, wz0 wz0, qz0 qz0, LinkedHashSet linkedHashSet, zz0 zz0, ScheduledExecutorService scheduledExecutorService, d01 d01) {
        this.c = httpURLConnection;
        this.d = wz0;
        this.e = qz0;
        this.b = linkedHashSet;
        this.f = zz0;
        this.g = scheduledExecutorService;
        this.h = new Random();
        this.a = false;
        this.j = d01;
        this.i = xb4.P;
    }
}
