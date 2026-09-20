package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: zh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zh8 implements Runnable {
    public static final ig y = new ig("RevokeAccessOperation", new String[0]);
    public final String w;
    public final x37 x = new BasePendingResult((pg8) null);

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, x37] */
    public zh8(String str) {
        z65.h(str);
        this.w = str;
    }

    public final void run() {
        ig igVar = y;
        Status status = Status.C;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.w).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.A;
            } else {
                Log.e((String) igVar.c, ((String) igVar.d).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (igVar.b <= 3) {
                Log.d((String) igVar.c, ((String) igVar.d).concat(str));
            }
        } catch (IOException e) {
            Log.e((String) igVar.c, ((String) igVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e((String) igVar.c, ((String) igVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.x.e(status);
    }
}
