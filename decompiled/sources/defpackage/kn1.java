package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kn1 implements oy6 {
    public final InputStream w;
    public final fy6 x;
    public final /* synthetic */ am6 y;

    public kn1(am6 am6) {
        this.y = am6;
        Socket socket = (Socket) am6.x;
        this.w = socket.getInputStream();
        this.x = new fy6(socket);
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            fy6 fy6 = this.x;
            fy6.f();
            qi6 V = sc0.V(1);
            int min = (int) Math.min(j, (long) (8192 - V.c));
            try {
                fy6.h();
                int read = this.w.read(V.a, V.c, min);
                if (fy6.i()) {
                    throw fy6.j((IOException) null);
                } else if (read != -1) {
                    V.c += read;
                    long j2 = (long) read;
                    sc0.x += j2;
                    return j2;
                } else if (V.b != V.c) {
                    return -1;
                } else {
                    sc0.w = V.a();
                    ti6.a(V);
                    return -1;
                }
            } catch (IOException e) {
                e = e;
                if (fy6.i()) {
                    e = fy6.j(e);
                }
                throw e;
            } catch (AssertionError e2) {
                if (cg8.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            } catch (Throwable th) {
                fy6.i();
                throw th;
            }
        } else {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003f */
    public final void close() {
        int i;
        am6 am6 = this.y;
        fy6 fy6 = this.x;
        fy6.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) am6.y;
            Socket socket = (Socket) am6.x;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) == 0) {
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    fy6.i();
                    return;
                } else {
                    socket.shutdownInput();
                    this.w.close();
                }
                if (fy6.i()) {
                    throw fy6.j((IOException) null);
                }
                return;
            }
            fy6.i();
        } catch (IOException e) {
            e = e;
            if (fy6.i()) {
                e = fy6.j(e);
            }
            throw e;
        } finally {
            fy6.i();
        }
    }

    public final ri7 g() {
        return this.x;
    }

    public final String toString() {
        return "source(" + ((Socket) this.y.x) + ')';
    }
}
