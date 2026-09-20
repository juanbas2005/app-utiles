package defpackage;

import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* renamed from: vl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vl5 extends SocketFactory {
    public final /* synthetic */ ay4 a;

    public vl5(ay4 ay4) {
        this.a = ay4;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        str.getClass();
        inetAddress.getClass();
        Socket createSocket = createSocket();
        createSocket.bind(new InetSocketAddress(inetAddress, i2));
        createSocket.connect(new InetSocketAddress(str, i));
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        str.getClass();
        Socket createSocket = createSocket();
        createSocket.connect(new InetSocketAddress(str, i));
        return createSocket;
    }

    public final Socket createSocket() {
        Socket socket = new Socket();
        Network j = this.a.j();
        if (j != null) {
            try {
                j.bindSocket(socket);
            } catch (Throwable unused) {
            }
        }
        return socket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        inetAddress.getClass();
        Socket createSocket = createSocket();
        createSocket.connect(new InetSocketAddress(inetAddress, i));
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket createSocket = createSocket();
        createSocket.bind(new InetSocketAddress(inetAddress2, i2));
        createSocket.connect(new InetSocketAddress(inetAddress, i));
        return createSocket;
    }
}
