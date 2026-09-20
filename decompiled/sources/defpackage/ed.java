package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: ed  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed implements ey6 {
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final boolean b() {
        ej5 ej5 = ej5.a;
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public final String c(SSLSocket sSLSocket) {
        try {
            String c = sSLSocket.getApplicationProtocol();
            if (c == null || c.equals("")) {
                return null;
            }
            return c;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ej5 ej5 = ej5.a;
            sSLParameters.setApplicationProtocols((String[]) s63.d(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
