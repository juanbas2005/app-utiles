package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: ej5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ej5 {
    public static volatile ej5 a;
    public static final Logger b = Logger.getLogger(d45.class.getName());

    static {
        ej5 ej5;
        try {
            for (Map.Entry entry : pg.b.entrySet()) {
                pg.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        ej5 ej52 = null;
        if (dd.e) {
            ej5 = new dd();
        } else {
            ej5 = null;
        }
        if (ej5 == null) {
            if (ih.e) {
                ej52 = new ih();
            }
            ej5 = ej52;
        }
        if (ej5 != null) {
            a = ej5;
            return;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public abstract x91 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(String str, int i, Throwable th);

    public void j(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
