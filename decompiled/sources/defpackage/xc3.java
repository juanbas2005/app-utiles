package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: xc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xc3 implements fw5 {
    public final InputStream w;

    public xc3(InputStream inputStream) {
        inputStream.getClass();
        this.w = inputStream;
    }

    public final void close() {
        this.w.close();
    }

    public final String toString() {
        return "RawSource(" + this.w + ')';
    }

    public final long y(tc0 tc0, long j) {
        int i;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 >= 0) {
            boolean z = true;
            boolean z2 = false;
            try {
                pi6 B = tc0.B(1);
                byte[] bArr = B.a;
                int i3 = B.c;
                long read = (long) this.w.read(bArr, i3, (int) Math.min(j, (long) (bArr.length - i3)));
                if (read == -1) {
                    i = 0;
                } else {
                    i = (int) read;
                }
                if (i == 1) {
                    B.c += i;
                    tc0.y += (long) i;
                    return read;
                }
                if (i >= 0) {
                    int length = bArr.length;
                    int i4 = B.c;
                    if (i <= length - i4) {
                        if (i != 0) {
                            B.c = i4 + i;
                            tc0.y += (long) i;
                            return read;
                        }
                        if (B.a() != 0) {
                            z = false;
                        }
                        if (z) {
                            pi6 pi6 = tc0.x;
                            pi6.getClass();
                            pi6 pi62 = pi6.g;
                            tc0.x = pi62;
                            if (pi62 == null) {
                                tc0.w = null;
                            } else {
                                pi62.f = null;
                            }
                            pi6.g = null;
                            ui6.a(pi6);
                        }
                        return read;
                    }
                }
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + (bArr.length - B.c)).toString());
            } catch (AssertionError e) {
                if (e.getCause() != null) {
                    String message = e.getMessage();
                    if (message != null) {
                        z2 = d57.x0(message, "getsockname failed", false);
                    }
                    if (z2) {
                        throw new IOException(e);
                    }
                }
                throw e;
            }
        } else {
            h.j(f21.g(j, "byteCount (", ") < 0"));
            return 0;
        }
    }
}
