package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: x33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x33 implements Closeable {
    public static final Logger B = Logger.getLogger(i33.class.getName());
    public final z23 A;
    public final dd0 w;
    public final sc0 x;
    public int y = 16384;
    public boolean z;

    /* JADX WARNING: type inference failed for: r2v1, types: [sc0, java.lang.Object] */
    public x33(yw5 yw5) {
        yw5.getClass();
        this.w = yw5;
        ? obj = new Object();
        this.x = obj;
        this.A = new z23(obj);
    }

    public final void B(int i, k62 k62) {
        synchronized (this) {
            if (this.z) {
                throw new IOException("closed");
            } else if (k62.w != -1) {
                l(i, 4, 3, 0);
                this.w.writeInt(k62.w);
                this.w.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public final void D(long j, int i) {
        synchronized (this) {
            try {
                if (this.z) {
                    throw new IOException("closed");
                } else if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                } else {
                    Logger logger = B;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(i33.c(false, i, 4, j));
                    }
                    l(i, 4, 8, 0);
                    this.w.writeInt((int) j);
                    this.w.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(ao6 ao6) {
        int i;
        ao6.getClass();
        synchronized (this) {
            try {
                if (!this.z) {
                    int i2 = this.y;
                    int i3 = ao6.a;
                    if ((i3 & 32) != 0) {
                        i2 = ao6.b[5];
                    }
                    this.y = i2;
                    int i4 = -1;
                    if ((i3 & 2) != 0) {
                        i = ao6.b[1];
                    } else {
                        i = -1;
                    }
                    if (i != -1) {
                        z23 z23 = this.A;
                        if ((i3 & 2) != 0) {
                            i4 = ao6.b[1];
                        }
                        z23.getClass();
                        int min = Math.min(i4, 16384);
                        int i5 = z23.d;
                        if (i5 != min) {
                            if (min < i5) {
                                z23.b = Math.min(z23.b, min);
                            }
                            z23.c = true;
                            z23.d = min;
                            int i6 = z23.h;
                            if (min < i6) {
                                if (min == 0) {
                                    vy2[] vy2Arr = z23.e;
                                    qs.S0(0, vy2Arr.length, (Object) null, vy2Arr);
                                    z23.f = z23.e.length - 1;
                                    z23.g = 0;
                                    z23.h = 0;
                                } else {
                                    z23.a(i6 - min);
                                }
                            }
                        }
                    }
                    l(0, 0, 4, 1);
                    this.w.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close() {
        synchronized (this) {
            this.z = true;
            this.w.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (!this.z) {
                this.w.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void k(boolean z2, int i, sc0 sc0, int i2) {
        synchronized (this) {
            if (!this.z) {
                l(i, i2, 0, z2 ? 1 : 0);
                if (i2 > 0) {
                    dd0 dd0 = this.w;
                    sc0.getClass();
                    dd0.g0((long) i2, sc0);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void l(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = B;
            if (logger.isLoggable(level)) {
                logger.fine(i33.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.y) {
            int i5 = this.y;
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i5 + ": " + i2).toString());
        } else if ((Integer.MIN_VALUE & i) == 0) {
            byte[] bArr = dg8.a;
            dd0 dd0 = this.w;
            dd0.getClass();
            dd0.writeByte((i2 >>> 16) & 255);
            dd0.writeByte((i2 >>> 8) & 255);
            dd0.writeByte(i2 & 255);
            dd0.writeByte(i3 & 255);
            dd0.writeByte(i4 & 255);
            dd0.writeInt(i & Integer.MAX_VALUE);
        } else {
            h.j(hl6.k(i, "reserved bit set: "));
        }
    }

    public final void o(int i, k62 k62, byte[] bArr) {
        synchronized (this) {
            if (this.z) {
                throw new IOException("closed");
            } else if (k62.w != -1) {
                l(0, bArr.length + 8, 7, 0);
                this.w.writeInt(i);
                this.w.writeInt(k62.w);
                if (bArr.length != 0) {
                    this.w.write(bArr);
                }
                this.w.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        }
    }

    public final void u(boolean z2, int i, ArrayList arrayList) {
        int i2;
        int i3;
        synchronized (this) {
            if (!this.z) {
                this.A.d(arrayList);
                long j = this.x.x;
                long min = Math.min((long) this.y, j);
                int i4 = (j > min ? 1 : (j == min ? 0 : -1));
                if (i4 == 0) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                if (z2) {
                    i2 |= 1;
                }
                l(i, (int) min, 1, i2);
                this.w.g0(min, this.x);
                if (i4 > 0) {
                    long j2 = j - min;
                    while (j2 > 0) {
                        long min2 = Math.min((long) this.y, j2);
                        j2 -= min2;
                        int i5 = (int) min2;
                        if (j2 == 0) {
                            i3 = 4;
                        } else {
                            i3 = 0;
                        }
                        l(i, i5, 9, i3);
                        this.w.g0(min2, this.x);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void v(int i, int i2, boolean z2) {
        synchronized (this) {
            if (!this.z) {
                l(0, 8, 6, z2 ? 1 : 0);
                this.w.writeInt(i);
                this.w.writeInt(i2);
                this.w.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }
}
