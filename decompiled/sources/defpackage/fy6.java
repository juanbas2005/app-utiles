package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: fy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fy6 extends vt {
    public final Socket n;

    public fy6(Socket socket) {
        this.n = socket;
    }

    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (Exception e) {
            Logger logger = cg8.a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, e);
        } catch (AssertionError e2) {
            if (cg8.a(e2)) {
                Logger logger2 = cg8.a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + socket, e2);
                return;
            }
            throw e2;
        }
    }
}
