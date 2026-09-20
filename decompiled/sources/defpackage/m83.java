package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* renamed from: m83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m83 implements Closeable {
    public final URL w;
    public volatile Future x;
    public yb9 y;

    public m83(URL url) {
        this.w = url;
    }

    public final Bitmap a() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.w;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] N = we.N(new tf0(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + N.length + " bytes from " + url);
                }
                if (N.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(N, 0, N.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    kj6.p("Failed to decode image: ", url);
                    return null;
                }
                rf2.i("Image exceeds max size of 1048576");
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            rf2.i("Content-Length exceeds max size of 1048576");
            return null;
        }
        throw th;
    }

    public final void close() {
        this.x.cancel(true);
    }
}
