package defpackage;

import io.ktor.http.Url;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: a73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a73 {
    public static final cc4 a = fc4.b("io.ktor.client.plugins.HttpTimeout");
    public static final wr0 b;

    static {
        z63 z63 = z63.D;
        vd2 vd2 = new vd2(19);
        z63.getClass();
        b = new wr0("HttpTimeout", (sr2) z63, (vr2) vd2);
    }

    public static final SocketTimeoutException a(md2 md2, IOException iOException) {
        Object obj;
        md2.getClass();
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append((Url) md2.b);
        sb.append(", socket_timeout=");
        y63 y63 = (y63) md2.b();
        if (y63 == null || (obj = y63.c) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(sb.toString());
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
