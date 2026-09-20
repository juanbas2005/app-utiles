package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: b21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b21 implements ey6 {
    public static final z11 a = new Object();
    public static final boolean b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z11] */
    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a21.class.getClassLoader());
            if (Conscrypt.isAvailable() && a21.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final boolean b() {
        return b;
    }

    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ej5 ej5 = ej5.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) s63.d(list).toArray(new String[0]));
        }
    }
}
