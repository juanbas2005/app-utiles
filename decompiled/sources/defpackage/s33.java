package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: s33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s33 implements Closeable {
    public static final Logger z;
    public final ed0 w;
    public final r33 x;
    public final y23 y;

    static {
        Logger logger = Logger.getLogger(i33.class.getName());
        logger.getClass();
        z = logger;
    }

    public s33(zw5 zw5) {
        zw5.getClass();
        this.w = zw5;
        r33 r33 = new r33(zw5);
        this.x = r33;
        this.y = new y23(r33);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0244, code lost:
        return false;
     */
    public final boolean a(boolean z2, p3 p3Var) {
        Object[] array;
        int i = 0;
        try {
            this.w.p(9);
            int m = dg8.m(this.w);
            if (m <= 16384) {
                byte readByte = this.w.readByte() & 255;
                byte readByte2 = this.w.readByte();
                byte b = readByte2 & 255;
                int readInt = this.w.readInt();
                int i2 = Integer.MAX_VALUE & readInt;
                if (readByte != 8) {
                    Logger logger = z;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(i33.b(true, i2, m, readByte, b));
                    }
                }
                if (!z2 || readByte == 4) {
                    k62 k62 = null;
                    switch (readByte) {
                        case b85.b:
                            k(p3Var, m, b, i2);
                            return true;
                        case 1:
                            o(p3Var, m, b, i2);
                            return true;
                        case 2:
                            if (m != 5) {
                                rf2.i(pb4.i(m, "TYPE_PRIORITY length: ", " != 5"));
                                return false;
                            } else if (i2 != 0) {
                                ed0 ed0 = this.w;
                                ed0.readInt();
                                ed0.readByte();
                                return true;
                            } else {
                                rf2.i("TYPE_PRIORITY streamId == 0");
                                return false;
                            }
                        case 3:
                            if (m != 4) {
                                rf2.i(pb4.i(m, "TYPE_RST_STREAM length: ", " != 4"));
                                return false;
                            } else if (i2 != 0) {
                                int readInt2 = this.w.readInt();
                                k62.x.getClass();
                                k62[] values = k62.values();
                                int length = values.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        k62 k622 = values[i3];
                                        if (k622.w == readInt2) {
                                            k62 = k622;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                if (k62 != null) {
                                    p33 p33 = (p33) p3Var.y;
                                    if (i2 == 0 || (readInt & 1) != 0) {
                                        w33 l = p33.l(i2);
                                        if (l != null) {
                                            synchronized (l) {
                                                try {
                                                    if (l.g() == null) {
                                                        l.H = k62;
                                                        l.notifyAll();
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return true;
                                        }
                                    } else {
                                        ac7.c(p33.E, p33.y + '[' + i2 + "] onReset", 0, new l33(p33, i2, (Object) k62, 1), 6);
                                        return true;
                                    }
                                } else {
                                    rf2.i(hl6.k(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                                    return false;
                                }
                            } else {
                                rf2.i("TYPE_RST_STREAM streamId == 0");
                                return false;
                            }
                            break;
                        case 4:
                            ed0 ed02 = this.w;
                            if (i2 != 0) {
                                rf2.i("TYPE_SETTINGS streamId != 0");
                                return false;
                            } else if ((readByte2 & 1) != 0) {
                                if (m != 0) {
                                    rf2.i("FRAME_SIZE_ERROR ack frame should be empty!");
                                    return false;
                                }
                            } else if (m % 6 == 0) {
                                ao6 ao6 = new ao6();
                                pe3 Q = z65.Q(z65.V(0, m), 6);
                                int i4 = Q.w;
                                int i5 = Q.x;
                                int i6 = Q.y;
                                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                                    while (true) {
                                        short readShort = ed02.readShort();
                                        byte[] bArr = dg8.a;
                                        short s = readShort & 65535;
                                        int readInt3 = ed02.readInt();
                                        if (s != 2) {
                                            if (s != 4) {
                                                if (s == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                    rf2.i(hl6.k(readInt3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                                    break;
                                                }
                                            } else if (readInt3 < 0) {
                                                rf2.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                return false;
                                            }
                                        } else if (!(readInt3 == 0 || readInt3 == 1)) {
                                            rf2.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                            return false;
                                        }
                                        ao6.b(s, readInt3);
                                        if (i4 != i5) {
                                            i4 += i6;
                                        }
                                    }
                                }
                                p33 p332 = (p33) p3Var.y;
                                ac7.c(p332.D, f21.l(new StringBuilder(), p332.y, " applyAndAckSettings"), 0, new f5(27, p3Var, ao6), 6);
                                return true;
                            } else {
                                rf2.i(hl6.k(m, "TYPE_SETTINGS length % 6 != 0: "));
                                return false;
                            }
                            break;
                        case 5:
                            u(p3Var, m, b, i2);
                            return true;
                        case 6:
                            if (m != 8) {
                                rf2.i(hl6.k(m, "TYPE_PING length != 8: "));
                                return false;
                            } else if (i2 == 0) {
                                int readInt4 = this.w.readInt();
                                int readInt5 = this.w.readInt();
                                if ((readByte2 & 1) != 0) {
                                    i = 1;
                                }
                                p33 p333 = (p33) p3Var.y;
                                if (i != 0) {
                                    synchronized (p333) {
                                        if (readInt4 == 1) {
                                            p333.H++;
                                        } else if (readInt4 == 2) {
                                            p333.J++;
                                        } else if (readInt4 == 3) {
                                            try {
                                                p333.notifyAll();
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                ac7.c(p333.D, f21.l(new StringBuilder(), ((p33) p3Var.y).y, " ping"), 0, new o33((p33) p3Var.y, readInt4, readInt5), 6);
                                return true;
                            } else {
                                rf2.i("TYPE_PING streamId != 0");
                                return false;
                            }
                        case 7:
                            if (m < 8) {
                                rf2.i(hl6.k(m, "TYPE_GOAWAY length < 8: "));
                                return false;
                            } else if (i2 == 0) {
                                int readInt6 = this.w.readInt();
                                int readInt7 = this.w.readInt();
                                int i7 = m - 8;
                                k62.x.getClass();
                                k62[] values2 = k62.values();
                                int length2 = values2.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length2) {
                                        k62 k623 = values2[i8];
                                        if (k623.w == readInt7) {
                                            k62 = k623;
                                        } else {
                                            i8++;
                                        }
                                    }
                                }
                                if (k62 != null) {
                                    dg0 dg0 = dg0.z;
                                    if (i7 > 0) {
                                        dg0 = this.w.q((long) i7);
                                    }
                                    dg0.getClass();
                                    dg0.d();
                                    p33 p334 = (p33) p3Var.y;
                                    synchronized (p334) {
                                        try {
                                            array = p334.x.values().toArray(new w33[0]);
                                            p334.B = true;
                                        } finally {
                                            Throwable th3 = th;
                                        }
                                    }
                                    w33[] w33Arr = (w33[]) array;
                                    int length3 = w33Arr.length;
                                    while (i < length3) {
                                        w33 w33 = w33Arr[i];
                                        if (w33.w > readInt6 && w33.i()) {
                                            k62 k624 = k62.C;
                                            synchronized (w33) {
                                                try {
                                                    if (w33.g() == null) {
                                                        w33.H = k624;
                                                        w33.notifyAll();
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            ((p33) p3Var.y).l(w33.w);
                                        }
                                        i++;
                                    }
                                    break;
                                } else {
                                    rf2.i(hl6.k(readInt7, "TYPE_GOAWAY unexpected error code: "));
                                    return false;
                                }
                            } else {
                                rf2.i("TYPE_GOAWAY streamId != 0");
                                return false;
                            }
                        case 8:
                            if (m == 4) {
                                try {
                                    long readInt8 = ((long) this.w.readInt()) & 2147483647L;
                                    int i9 = (readInt8 > 0 ? 1 : (readInt8 == 0 ? 0 : -1));
                                    if (i9 != 0) {
                                        Logger logger2 = z;
                                        if (logger2.isLoggable(Level.FINE)) {
                                            logger2.fine(i33.c(true, i2, m, readInt8));
                                        }
                                        p33 p335 = (p33) p3Var.y;
                                        if (i2 == 0) {
                                            synchronized (p335) {
                                                try {
                                                    p335.Q += readInt8;
                                                    p335.notifyAll();
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                            return true;
                                        }
                                        w33 k = p335.k(i2);
                                        if (k != null) {
                                            synchronized (k) {
                                                try {
                                                    k.A += readInt8;
                                                    if (i9 > 0) {
                                                        k.notifyAll();
                                                    }
                                                } catch (Throwable th6) {
                                                    throw th6;
                                                }
                                            }
                                            return true;
                                        }
                                    } else {
                                        throw new IOException("windowSizeIncrement was 0");
                                    }
                                } catch (Exception e) {
                                    Exception exc = e;
                                    z.fine(i33.b(true, i2, m, 8, b));
                                    throw exc;
                                }
                            } else {
                                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + m);
                            }
                            break;
                        default:
                            this.w.skip((long) m);
                            return true;
                    }
                    return true;
                }
                rf2.s("Expected a SETTINGS frame but was ", i33.a(readByte));
                return false;
            }
            rf2.i(hl6.k(m, "FRAME_SIZE_ERROR: "));
            return false;
        } catch (EOFException unused) {
        }
    }

    public final void close() {
        this.w.close();
    }

    /* JADX WARNING: type inference failed for: r4v16, types: [sc0, java.lang.Object] */
    public final void k(p3 p3Var, int i, int i2, int i3) {
        boolean z2;
        byte b;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        p3 p3Var2 = p3Var;
        int i4 = i2;
        int i5 = i3;
        if (i5 != 0) {
            boolean z7 = true;
            if ((i4 & 1) != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = false;
            }
            if ((i4 & 32) == 0) {
                if ((i4 & 8) != 0) {
                    byte readByte = this.w.readByte();
                    byte[] bArr = dg8.a;
                    b = readByte & 255;
                } else {
                    b = 0;
                }
                int R = gr8.R(i, i4, b);
                ed0 ed0 = this.w;
                ed0.getClass();
                p33 p33 = (p33) p3Var2.y;
                if (i5 == 0 || (i5 & 1) != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    ? obj = new Object();
                    long j = (long) R;
                    ed0.p(j);
                    ed0.Y(j, obj);
                    ac7.c(p33.E, p33.y + '[' + i5 + "] onData", 0, new k33(p33, i5, obj, R, z7), 6);
                } else {
                    w33 k = p33.k(i5);
                    if (k == null) {
                        ((p33) p3Var2.y).B(i5, k62.z);
                        long j2 = (long) R;
                        ((p33) p3Var2.y).u(j2);
                        ed0.skip(j2);
                    } else {
                        TimeZone timeZone = fg8.a;
                        u33 u33 = k.D;
                        long j3 = (long) R;
                        u33.getClass();
                        long j4 = j3;
                        while (true) {
                            int i6 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                            w33 w33 = u33.B;
                            if (i6 <= 0) {
                                TimeZone timeZone2 = fg8.a;
                                w33.x.u(j3);
                                u33.B.x.L.getClass();
                                break;
                            }
                            synchronized (w33) {
                                z4 = u33.x;
                                if (u33.z.x + j4 > u33.w) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            }
                            if (z5) {
                                ed0.skip(j4);
                                u33.B.f(k62.B);
                                break;
                            } else if (z4) {
                                ed0.skip(j4);
                                break;
                            } else {
                                long Y = ed0.Y(j4, u33.y);
                                if (Y != -1) {
                                    j4 -= Y;
                                    w33 w332 = u33.B;
                                    synchronized (w332) {
                                        try {
                                            if (u33.A) {
                                                u33.y.a();
                                            } else {
                                                sc0 sc0 = u33.z;
                                                if (sc0.x == 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                sc0.t(u33.y);
                                                if (z6) {
                                                    w332.notifyAll();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    throw new EOFException();
                                }
                            }
                        }
                        if (z7) {
                            k.k(bz2.x, true);
                        }
                    }
                }
                this.w.skip((long) b);
                return;
            }
            rf2.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        rf2.i("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List l(int i, int i2, int i3, int i4) {
        r33 r33 = this.x;
        r33.z = i;
        r33.A = i2;
        r33.x = i3;
        r33.y = i4;
        y23 y23 = this.y;
        zw5 zw5 = y23.d;
        while (!zw5.x()) {
            byte readByte = zw5.readByte();
            byte[] bArr = dg8.a;
            byte b = readByte & 255;
            if (b == 128) {
                rf2.i("index == 0");
                return null;
            } else if ((readByte & 128) == 128) {
                int f = y23.f(b, 127);
                int i5 = f - 1;
                if (i5 >= 0) {
                    vy2[] vy2Arr = a33.a;
                    if (i5 <= vy2Arr.length - 1) {
                        y23.a(vy2Arr[i5]);
                    }
                }
                int length = y23.f + 1 + (i5 - a33.a.length);
                if (length >= 0) {
                    vy2[] vy2Arr2 = y23.e;
                    if (length < vy2Arr2.length) {
                        vy2 vy2 = vy2Arr2[length];
                        vy2.getClass();
                        y23.a(vy2);
                    }
                }
                rf2.i(hl6.k(f, "Header index too large "));
                return null;
            } else if (b == 64) {
                vy2[] vy2Arr3 = a33.a;
                dg0 e = y23.e();
                a33.a(e);
                y23.d(new vy2(e, y23.e()));
            } else if ((readByte & 64) == 64) {
                y23.d(new vy2(y23.c(y23.f(b, 63) - 1), y23.e()));
            } else if ((readByte & 32) == 32) {
                int f2 = y23.f(b, 31);
                y23.a = f2;
                if (f2 < 0 || f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + y23.a);
                }
                int i6 = y23.h;
                if (f2 < i6) {
                    if (f2 == 0) {
                        qs.S0(0, y23.e.length, (Object) null, y23.e);
                        y23.f = y23.e.length - 1;
                        y23.g = 0;
                        y23.h = 0;
                    } else {
                        y23.b(i6 - f2);
                    }
                }
            } else if (b == 16 || b == 0) {
                vy2[] vy2Arr4 = a33.a;
                dg0 e2 = y23.e();
                a33.a(e2);
                y23.a(new vy2(e2, y23.e()));
            } else {
                y23.a(new vy2(y23.c(y23.f(b, 15) - 1), y23.e()));
            }
        }
        ArrayList arrayList = y23.b;
        List b1 = dt0.b1(arrayList);
        arrayList.clear();
        y23.c = 0;
        return b1;
    }

    public final void o(p3 p3Var, int i, int i2, int i3) {
        boolean z2;
        byte b;
        int i4;
        p33 p33;
        int i5 = i2;
        int i6 = i3;
        if (i6 != 0) {
            boolean z3 = false;
            boolean z4 = true;
            if ((i5 & 1) != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if ((i5 & 8) != 0) {
                byte readByte = this.w.readByte();
                byte[] bArr = dg8.a;
                b = readByte & 255;
            } else {
                b = 0;
            }
            if ((i5 & 32) != 0) {
                ed0 ed0 = this.w;
                ed0.readInt();
                ed0.readByte();
                byte[] bArr2 = dg8.a;
                i4 = i - 5;
            } else {
                i4 = i;
            }
            List l = l(gr8.R(i4, i5, b), b, i5, i6);
            p33 p332 = (p33) p3Var.y;
            if (i6 != 0 && (i6 & 1) == 0) {
                z3 = z2;
            }
            if (z3) {
                ac7.c(p332.E, p332.y + '[' + i6 + "] onHeaders", 0, new l33(p332, i6, l, z4), 6);
                return;
            }
            synchronized (p332) {
                try {
                    w33 k = p332.k(i6);
                    if (k != null) {
                        k.k(fg8.h(l), z4);
                    } else if (!p332.B) {
                        if (i6 > p332.z) {
                            if (i6 % 2 != p332.A % 2) {
                                p33 = p332;
                                try {
                                    w33 w33 = new w33(i6, p33, false, z4, fg8.h(l));
                                    p33.z = i6;
                                    p33.x.put(Integer.valueOf(i6), w33);
                                    ac7.c(p33.C.d(), p33.y + '[' + i6 + "] onStream", 0, new f5(26, p33, w33), 6);
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    throw th2;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    p33 = p332;
                    Throwable th22 = th;
                    throw th22;
                }
            }
        } else {
            rf2.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
    }

    public final void u(p3 p3Var, int i, int i2, int i3) {
        byte b;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.w.readByte();
                byte[] bArr = dg8.a;
                b = readByte & 255;
            } else {
                b = 0;
            }
            int readInt = this.w.readInt() & Integer.MAX_VALUE;
            List l = l(gr8.R(i - 4, i2, b), b, i2, i3);
            p33 p33 = (p33) p3Var.y;
            synchronized (p33) {
                try {
                    if (p33.U.contains(Integer.valueOf(readInt))) {
                        p33.B(readInt, k62.z);
                        return;
                    }
                    p33.U.add(Integer.valueOf(readInt));
                    ac7.c(p33.E, p33.y + '[' + readInt + "] onRequest", 0, new l33(p33, readInt, (Object) l, 0), 6);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            rf2.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
    }
}
