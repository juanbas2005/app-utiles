package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: z11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z11 implements no1 {
    public final boolean a(SSLSocket sSLSocket) {
        if (!b21.b || !Conscrypt.isConscrypt(sSLSocket)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ey6, java.lang.Object] */
    public final ey6 g(SSLSocket sSLSocket) {
        return new Object();
    }
}
