package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: aa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aa0 extends InputStream {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public aa0(gx5 gx5, yk8 yk8) {
        this.w = 5;
        this.x = yk8;
    }

    public int available() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 1:
                return (int) Math.min(((sc0) obj).x, 2147483647L);
            case 2:
                return ((aa0) obj).available();
            case 3:
                zw5 zw5 = (zw5) obj;
                if (!zw5.y) {
                    return (int) Math.min(zw5.x.x, 2147483647L);
                }
                rf2.i("closed");
                return 0;
            default:
                return super.available();
        }
    }

    public void close() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b /*0*/:
                t49.w((hf0) obj);
                return;
            case 1:
                return;
            case 2:
                super.close();
                ((aa0) obj).close();
                return;
            case 3:
                ((zw5) obj).close();
                return;
            default:
                super.close();
                return;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.w;
        Object obj = this.x;
        switch (i3) {
            case b85.b /*0*/:
                bArr.getClass();
                hf0 hf0 = (hf0) obj;
                if (!hf0.h()) {
                    if (hf0.g().x()) {
                        ar7.T(new ot(hf0, (f61) null, 3));
                    }
                    tc0 g = hf0.g();
                    g.getClass();
                    int k = hf0.g().k(bArr, i, Math.min((int) g.y, i2) + i);
                    if (k >= 0) {
                        return k;
                    }
                    if (!hf0.h()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                bArr.getClass();
                return ((sc0) obj).read(bArr, i, i2);
            case 2:
                bArr.getClass();
                return ((aa0) obj).read(bArr, i, i2);
            case 3:
                bArr.getClass();
                zw5 zw5 = (zw5) obj;
                sc0 sc0 = zw5.x;
                if (!zw5.y) {
                    t49.x((long) bArr.length, (long) i, (long) i2);
                    if (sc0.x == 0 && zw5.w.Y(8192, sc0) == -1) {
                        return -1;
                    }
                    return sc0.read(bArr, i, i2);
                }
                rf2.i("closed");
                return 0;
            case 4:
                gx5 gx5 = (gx5) obj;
                try {
                    int inflate = ((Inflater) gx5.x).inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (((Inflater) gx5.x).getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ((Inflater) gx5.x).getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((yk8) obj).f(bArr, i, i2);
        }
    }

    public long skip(long j) {
        int i;
        switch (this.w) {
            case 5:
                if (j <= 0) {
                    return 0;
                }
                if (j > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) j;
                }
                ((yk8) this.x).g(i);
                return (long) i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 1:
                return ((sc0) obj) + ".inputStream()";
            case 3:
                return ((zw5) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.w) {
            case 3:
                outputStream.getClass();
                zw5 zw5 = (zw5) this.x;
                sc0 sc0 = zw5.x;
                if (!zw5.y) {
                    long j = 0;
                    while (true) {
                        if (sc0.x == 0 && zw5.w.Y(8192, sc0) == -1) {
                            return j;
                        }
                        long j2 = sc0.x;
                        j += j2;
                        t49.x(j2, 0, j2);
                        qi6 qi6 = sc0.w;
                        while (j2 > 0) {
                            qi6.getClass();
                            int min = (int) Math.min(j2, (long) (qi6.c - qi6.b));
                            outputStream.write(qi6.a, qi6.b, min);
                            int i = qi6.b + min;
                            qi6.b = i;
                            long j3 = (long) min;
                            sc0.x -= j3;
                            j2 -= j3;
                            if (i == qi6.c) {
                                qi6 a = qi6.a();
                                sc0.w = a;
                                ti6.a(qi6);
                                qi6 = a;
                            }
                        }
                    }
                } else {
                    rf2.i("closed");
                    return 0;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ aa0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    private final void a() {
    }

    public final int read() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b /*0*/:
                hf0 hf0 = (hf0) obj;
                if (hf0.h()) {
                    return -1;
                }
                if (hf0.g().x()) {
                    ar7.T(new ot(hf0, (f61) null, 3));
                }
                if (hf0.h()) {
                    return -1;
                }
                return hf0.g().readByte() & 255;
            case 1:
                sc0 sc0 = (sc0) obj;
                if (sc0.x > 0) {
                    return sc0.readByte() & 255;
                }
                return -1;
            case 2:
                return ((aa0) obj).read();
            case 3:
                zw5 zw5 = (zw5) obj;
                sc0 sc02 = zw5.x;
                if (zw5.y) {
                    rf2.i("closed");
                    return 0;
                } else if (sc02.x == 0 && zw5.w.Y(8192, sc02) == -1) {
                    return -1;
                } else {
                    return sc02.readByte() & 255;
                }
            case 4:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((yk8) obj).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
