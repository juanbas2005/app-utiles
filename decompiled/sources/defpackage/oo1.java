package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: oo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oo1 implements ey6 {
    public final no1 a;
    public ey6 b;

    public oo1(no1 no1) {
        this.a = no1;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    public final boolean b() {
        return true;
    }

    public final String c(SSLSocket sSLSocket) {
        ey6 e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        ey6 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized ey6 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b;
    }
}
