package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jn1 implements tu6 {
    public final OutputStream w;
    public final fy6 x;
    public final /* synthetic */ am6 y;

    public jn1(am6 am6) {
        this.y = am6;
        Socket socket = (Socket) am6.x;
        this.w = socket.getOutputStream();
        this.x = new fy6(socket);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0044 */
    public final void close() {
        int i;
        OutputStream outputStream = this.w;
        am6 am6 = this.y;
        fy6 fy6 = this.x;
        fy6.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) am6.y;
            Socket socket = (Socket) am6.x;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) == 0) {
                    int i3 = i2 | 1;
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
                if (i != 3) {
                    if (!socket.isClosed()) {
                        if (!socket.isOutputShutdown()) {
                            outputStream.flush();
                            socket.shutdownOutput();
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    public final void flush() {
        fy6 fy6 = this.x;
        fy6.h();
        try {
            this.w.flush();
            if (fy6.i()) {
                throw fy6.j((IOException) null);
            }
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

    public final void g0(long j, sc0 sc0) {
        t49.x(sc0.x, 0, j);
        while (j > 0) {
            fy6 fy6 = this.x;
            fy6.f();
            qi6 qi6 = sc0.w;
            qi6.getClass();
            int min = (int) Math.min(j, (long) (qi6.c - qi6.b));
            fy6.h();
            try {
                this.w.write(qi6.a, qi6.b, min);
                if (!fy6.i()) {
                    int i = qi6.b + min;
                    qi6.b = i;
                    long j2 = (long) min;
                    j -= j2;
                    sc0.x -= j2;
                    if (i == qi6.c) {
                        sc0.w = qi6.a();
                        ti6.a(qi6);
                    }
                } else {
                    throw fy6.j((IOException) null);
                }
            } catch (IOException e) {
                IOException iOException = e;
                if (fy6.i()) {
                    iOException = fy6.j(iOException);
                }
                throw iOException;
            } catch (Throwable th) {
                Throwable th2 = th;
                fy6.i();
                throw th2;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.y.x) + ')';
    }
}
