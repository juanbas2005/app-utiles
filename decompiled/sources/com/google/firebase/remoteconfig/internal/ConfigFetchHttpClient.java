package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        String str4;
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.d = str4;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) {
        long j;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.b);
            Context context = this.a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            hashMap.put("languageCode", locale.toLanguageTag());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i >= 28) {
                        j = bn.e(packageInfo);
                    } else {
                        j = (long) packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "23.1.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (!map2.isEmpty()) {
                hashMap.put("customSignals", new JSONObject(map2));
                Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
            }
            if (l != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseException("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            String str = this.d;
            String str2 = this.e;
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + str + "/namespaces/" + str2 + ":fetch").openConnection();
        } catch (IOException e2) {
            throw new FirebaseException(e2.getMessage());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0160 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00da A[Catch:{ IOException | JSONException -> 0x01a5, all -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d A[Catch:{ JSONException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142 A[Catch:{ JSONException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145 A[Catch:{ JSONException -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155 A[SYNTHETIC, Splitter:B:65:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a9 A[SYNTHETIC, Splitter:B:85:0x01a9] */
    public vz0 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        String str5;
        JSONArray jSONArray2;
        boolean z;
        httpURLConnection.setDoOutput(true);
        long j = this.f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] z2 = hj8.z(context, context.getPackageName());
            if (z2 == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                str4 = null;
                httpURLConnection.setRequestProperty("X-Android-Cert", str4);
                httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
                httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry next : map2.entrySet()) {
                    httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                try {
                    d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String headerField = httpURLConnection.getHeaderField("ETag");
                        JSONObject c2 = c(httpURLConnection);
                        httpURLConnection.disconnect();
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (IOException unused) {
                        }
                        rz0 d2 = sz0.d();
                        d2.b = date;
                        try {
                            jSONObject = c2.getJSONObject("entries");
                        } catch (JSONException unused2) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                d2.a = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jSONArray = c2.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused4) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                d2.c = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused5) {
                            }
                        }
                        try {
                            jSONObject2 = c2.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused6) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            d2.d = new JSONObject(jSONObject2.toString());
                        }
                        try {
                            if (!c2.has("templateVersion")) {
                                str5 = c2.getString("templateVersion");
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                d2.e = Long.parseLong(str5);
                            }
                            try {
                                jSONArray2 = c2.getJSONArray("rolloutMetadata");
                            } catch (JSONException unused7) {
                                jSONArray2 = null;
                            }
                            if (jSONArray2 != null) {
                                d2.f = new JSONArray(jSONArray2.toString());
                            }
                            sz0 sz0 = new sz0(d2.a, d2.b, d2.c, d2.d, d2.e, d2.f);
                            try {
                                z = !c2.get("state").equals("NO_CHANGE");
                            } catch (JSONException unused8) {
                                z = true;
                            }
                            if (!z) {
                                return new vz0(1, sz0, (String) null);
                            }
                            return new vz0(0, sz0, headerField);
                        } catch (JSONException e2) {
                            throw new FirebaseException("Fetch failed: fetch response could not be parsed.", e2);
                        }
                    } else {
                        throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                    }
                } catch (IOException | JSONException e3) {
                    throw new FirebaseException("The client had an error while calling the backend!", e3);
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused9) {
                    }
                    throw th;
                }
            } else {
                str4 = pd8.i(z2);
                httpURLConnection.setRequestProperty("X-Android-Cert", str4);
                httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
                httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                while (r0.hasNext()) {
                }
                d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e4);
        }
    }
}
