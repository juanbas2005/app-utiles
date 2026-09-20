package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wc2 implements oy6 {
    public final go3 w;
    public long x;
    public boolean y;

    public wc2(go3 go3, long j) {
        this.w = go3;
        this.x = j;
    }

    public final long Y(long j, sc0 sc0) {
        long j2;
        long j3;
        int i;
        long j4 = j;
        sc0 sc02 = sc0;
        sc02.getClass();
        if (!this.y) {
            go3 go3 = this.w;
            long j5 = this.x;
            if (j4 >= 0) {
                long j6 = j4 + j5;
                long j7 = j5;
                while (true) {
                    if (j7 >= j6) {
                        j2 = -1;
                        break;
                    }
                    qi6 V = sc02.V(1);
                    byte[] bArr = V.a;
                    int i2 = V.c;
                    j2 = -1;
                    int min = (int) Math.min(j6 - j7, (long) (8192 - i2));
                    synchronized (go3) {
                        bArr.getClass();
                        go3.z.seek(j7);
                        i = 0;
                        while (true) {
                            if (i >= min) {
                                break;
                            }
                            int read = go3.z.read(bArr, i2, min - i);
                            if (read != -1) {
                                i += read;
                            } else if (i == 0) {
                                i = -1;
                            }
                        }
                    }
                    if (i == -1) {
                        if (V.b == V.c) {
                            sc02.w = V.a();
                            ti6.a(V);
                        }
                        if (j5 == j7) {
                            j3 = -1;
                        }
                    } else {
                        V.c += i;
                        long j8 = (long) i;
                        j7 += j8;
                        sc02.x += j8;
                    }
                }
                j3 = j7 - j5;
                if (j3 != j2) {
                    this.x += j3;
                }
                return j3;
            }
            h.j(f21.f(j4, "byteCount < 0: "));
            return 0;
        }
        h.s("closed");
        return 0;
    }

    public final void close() {
        go3 go3 = this.w;
        if (!this.y) {
            this.y = true;
            ReentrantLock reentrantLock = go3.y;
            reentrantLock.lock();
            try {
                int i = go3.x - 1;
                go3.x = i;
                if (i != 0 || !go3.w) {
                    reentrantLock.unlock();
                    return;
                }
                synchronized (go3) {
                    go3.z.close();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final ri7 g() {
        return ri7.d;
    }
}
