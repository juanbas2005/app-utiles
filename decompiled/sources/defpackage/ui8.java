package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* renamed from: ui8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ui8 extends Thread {
    public final /* synthetic */ HashMap w;

    public ui8(HashMap hashMap) {
        this.w = hashMap;
    }

    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.w;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(uri);
                Log.w("HttpUrlPinger", sb.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 32);
            sb2.append("Error while parsing ping URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IOException e2) {
            e = e2;
            String message2 = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 27);
            sb3.append("Error while pinging URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e);
        } catch (RuntimeException e3) {
            e = e3;
            String message22 = e.getMessage();
            StringBuilder sb32 = new StringBuilder(String.valueOf(message22).length() + String.valueOf(uri).length() + 27);
            sb32.append("Error while pinging URL: ");
            sb32.append(uri);
            sb32.append(". ");
            sb32.append(message22);
            Log.w("HttpUrlPinger", sb32.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
