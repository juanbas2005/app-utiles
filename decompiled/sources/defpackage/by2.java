package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: by2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class by2 implements oy6 {
    public final CRC32 A = new CRC32();
    public byte w;
    public final zw5 x;
    public final Inflater y;
    public final mb3 z;

    public by2(ed0 ed0) {
        ed0.getClass();
        zw5 zw5 = new zw5(ed0);
        this.x = zw5;
        Inflater inflater = new Inflater(true);
        this.y = inflater;
        this.z = new mb3(zw5, inflater);
    }

    public static void a(int i, int i2, String str) {
        if (i2 != i) {
            String O0 = d57.O0(8, t49.e0(i2));
            String O02 = d57.O0(8, t49.e0(i));
            throw new IOException(str + ": actual 0x" + O0 + " != expected 0x" + O02);
        }
    }

    public final long Y(long j, sc0 sc0) {
        boolean z2;
        by2 by2 = this;
        long j2 = j;
        sc0 sc02 = sc0;
        sc02.getClass();
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i < 0) {
            h.j(f21.f(j2, "byteCount < 0: "));
            return 0;
        } else if (i == 0) {
            return 0;
        } else {
            byte b = by2.w;
            CRC32 crc32 = by2.A;
            zw5 zw5 = by2.x;
            if (b == 0) {
                zw5.p(10);
                sc0 sc03 = zw5.x;
                byte u = sc03.u(3);
                if (((u >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    by2.k(sc03, 0, 10);
                }
                a(8075, zw5.readShort(), "ID1ID2");
                zw5.skip(8);
                if (((u >> 2) & 1) == 1) {
                    zw5.p(2);
                    if (z2) {
                        k(sc03, 0, 2);
                    }
                    long G = (long) (sc03.G() & 65535);
                    zw5.p(G);
                    if (z2) {
                        k(sc03, 0, G);
                    }
                    zw5.skip(G);
                }
                if (((u >> 3) & 1) == 1) {
                    long C = zw5.C((byte) 0, 0, Long.MAX_VALUE);
                    if (C != -1) {
                        if (z2) {
                            k(sc03, 0, C + 1);
                        }
                        zw5.skip(C + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((u >> 4) & 1) == 1) {
                    long C2 = zw5.C((byte) 0, 0, Long.MAX_VALUE);
                    if (C2 != -1) {
                        if (z2) {
                            by2 = this;
                            by2.k(sc03, 0, C2 + 1);
                        } else {
                            by2 = this;
                        }
                        zw5.skip(C2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    by2 = this;
                }
                if (z2) {
                    a(zw5.o(), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                by2.w = 1;
            }
            if (by2.w == 1) {
                long j3 = sc02.x;
                long Y = by2.z.Y(j2, sc02);
                if (Y != -1) {
                    by2.k(sc02, j3, Y);
                    return Y;
                }
                by2.w = 2;
            }
            if (by2.w == 2) {
                a(zw5.k(), (int) crc32.getValue(), "CRC");
                a(zw5.k(), (int) by2.y.getBytesWritten(), "ISIZE");
                by2.w = 3;
                if (!zw5.x()) {
                    rf2.i("gzip finished without exhausting source");
                    return 0;
                }
            }
            return -1;
        }
    }

    public final void close() {
        this.z.close();
    }

    public final ri7 g() {
        return this.x.w.g();
    }

    public final void k(sc0 sc0, long j, long j2) {
        qi6 qi6 = sc0.w;
        qi6.getClass();
        while (true) {
            int i = qi6.c;
            int i2 = qi6.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            qi6 = qi6.f;
            qi6.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) qi6.b) + j);
            int min = (int) Math.min((long) (qi6.c - i3), j2);
            this.A.update(qi6.a, i3, min);
            j2 -= (long) min;
            qi6 = qi6.f;
            qi6.getClass();
            j = 0;
        }
    }
}
