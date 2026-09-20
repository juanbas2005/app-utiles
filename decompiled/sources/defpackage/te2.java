package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.FirebaseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: te2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class te2 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final nu5 b;
    public final gm0 c = new gm0();

    public te2(Context context, nu5 nu5) {
        this.a = context;
        this.b = nu5;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new FirebaseException(e2.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0041 */
    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String str4;
        BufferedReader bufferedReader;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str5 = null;
        if (errorStream != null) {
            bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append(10);
                }
                str5 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", new Object[]{Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb});
            } catch (IOException ) {
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            Log.w("Firebase-Installations", str5);
            if (TextUtils.isEmpty(str)) {
                str4 = "";
            } else {
                str4 = b81.y(", ", str);
            }
            Log.w("Firebase-Installations", pb4.m("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, str4));
        }
    }

    public static long d(String str) {
        z65.e("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static w00 e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b2 = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        t10 t10 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        j = d(jsonReader.nextString());
                        b2 = (byte) (b2 | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b2 == 1) {
                    t10 = new t10(0, j, str);
                    jsonReader.endObject();
                } else {
                    h.s("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new w00(str2, str3, str4, t10, 1);
    }

    public static t10 f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b2 = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = d(jsonReader.nextString());
                b2 = (byte) (b2 | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b2 == 1) {
            return new t10(1, j, str);
        }
        h.s("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            rf2.i("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final HttpURLConnection c(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            iz2 iz2 = (iz2) this.b.get();
            if (iz2 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) b35.b(((wl1) iz2).a()));
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String str2 = null;
            try {
                byte[] z = hj8.z(context, context.getPackageName());
                if (z == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    str2 = pd8.i(z);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e4);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
