package defpackage;

import java.io.EOFException;
import java.io.Flushable;

/* renamed from: tc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tc0 implements py6, AutoCloseable, Flushable {
    public pi6 w;
    public pi6 x;
    public long y;

    public final /* synthetic */ pi6 B(int i) {
        if (i < 1 || i > 8192) {
            h.j(pb4.i(i, "unexpected capacity (", "), should be in range [1, 8192]"));
            return null;
        }
        pi6 pi6 = this.x;
        if (pi6 == null) {
            pi6 b = ui6.b();
            this.w = b;
            this.x = b;
            return b;
        } else if (pi6.c + i <= 8192 && pi6.e) {
            return pi6;
        } else {
            pi6 b2 = ui6.b();
            pi6.d(b2);
            this.x = b2;
            return b2;
        }
    }

    public final void D(int i, byte[] bArr) {
        bArr.getClass();
        rj1.o((long) bArr.length, 0, (long) i);
        int i2 = 0;
        while (i2 < i) {
            pi6 B = B(1);
            byte[] bArr2 = B.a;
            int min = Math.min(i - i2, bArr2.length - B.c) + i2;
            qs.I0(B.c, i2, min, bArr, bArr2);
            B.c = (min - i2) + B.c;
            i2 = min;
        }
        this.y += (long) i;
    }

    public final void E(tc0 tc0, long j) {
        pi6 pi6;
        int i;
        if (tc0 != this) {
            rj1.p(tc0.y, j);
            while (j > 0) {
                pi6 pi62 = tc0.w;
                pi62.getClass();
                int i2 = 0;
                if (j < ((long) pi62.a())) {
                    pi6 pi63 = this.x;
                    if (pi63 != null && pi63.e) {
                        long j2 = ((long) pi63.c) + j;
                        i06 i06 = pi63.d;
                        if (i06 == null || i06.a <= 0) {
                            i = pi63.b;
                        } else {
                            i = 0;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            pi6 pi64 = tc0.w;
                            pi64.getClass();
                            pi64.f(pi63, (int) j);
                            tc0.y -= j;
                            this.y += j;
                            return;
                        }
                    }
                    pi6 pi65 = tc0.w;
                    pi65.getClass();
                    int i3 = (int) j;
                    if (i3 <= 0 || i3 > pi65.c - pi65.b) {
                        h.q("byteCount out of range");
                        return;
                    }
                    if (i3 >= 1024) {
                        pi6 = pi65.e();
                    } else {
                        pi6 = ui6.b();
                        byte[] bArr = pi65.a;
                        byte[] bArr2 = pi6.a;
                        int i4 = pi65.b;
                        qs.O0(bArr, bArr2, 0, i4, i4 + i3, 2);
                    }
                    pi6.c = pi6.b + i3;
                    pi65.b += i3;
                    pi6 pi66 = pi65.g;
                    if (pi66 != null) {
                        pi66.d(pi6);
                    } else {
                        pi6.f = pi65;
                        pi65.g = pi6;
                    }
                    tc0.w = pi6;
                }
                pi6 pi67 = tc0.w;
                pi67.getClass();
                long a = (long) pi67.a();
                pi6 c = pi67.c();
                tc0.w = c;
                if (c == null) {
                    tc0.x = null;
                }
                if (this.w == null) {
                    this.w = pi67;
                    this.x = pi67;
                } else {
                    pi6 pi68 = this.x;
                    pi68.getClass();
                    pi68.d(pi67);
                    pi6 pi69 = pi67.g;
                    if (pi69 != null) {
                        if (pi69.e) {
                            int i5 = pi67.c - pi67.b;
                            int i6 = 8192 - pi69.c;
                            pi69.getClass();
                            i06 i062 = pi69.d;
                            if (i062 == null || i062.a <= 0) {
                                pi6 pi610 = pi67.g;
                                pi610.getClass();
                                i2 = pi610.b;
                            }
                            if (i5 <= i6 + i2) {
                                pi6 pi611 = pi67.g;
                                pi611.getClass();
                                pi67.f(pi611, i5);
                                if (pi67.c() == null) {
                                    ui6.a(pi67);
                                    pi67 = pi611;
                                } else {
                                    h.s("Check failed.");
                                    return;
                                }
                            }
                        }
                        this.x = pi67;
                        if (pi67.g == null) {
                            this.w = pi67;
                        }
                    } else {
                        h.s("cannot compact");
                        return;
                    }
                }
                tc0.y -= a;
                this.y += a;
                j -= a;
            }
            return;
        }
        h.q("source == this");
    }

    public final void G(byte b) {
        pi6 B = B(1);
        byte[] bArr = B.a;
        int i = B.c;
        B.c = i + 1;
        bArr[i] = b;
        this.y++;
    }

    public final byte a(long j) {
        long j2 = 0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j >= this.y) {
            h.l(f21.k(hl6.q(j, "position (", ") is not within the range [0..size("), this.y, "))"));
            return 0;
        }
        pi6 pi6 = this.w;
        if (i == 0) {
            pi6.getClass();
            return pi6.b(0);
        }
        pi6.getClass();
        long j3 = this.y;
        if (j3 - j < j) {
            pi6 pi62 = this.x;
            while (pi62 != null && j3 > j) {
                j3 -= (long) (pi62.c - pi62.b);
                if (j3 <= j) {
                    break;
                }
                pi62 = pi62.g;
            }
            pi62.getClass();
            return pi62.b((int) (j - j3));
        }
        pi6 pi63 = this.w;
        while (pi63 != null) {
            long j4 = ((long) (pi63.c - pi63.b)) + j2;
            if (j4 > j) {
                break;
            }
            pi63 = pi63.f;
            j2 = j4;
        }
        pi63.getClass();
        return pi63.b((int) (j - j2));
    }

    public final boolean j(long j) {
        if (j < 0) {
            h.j(f21.g(j, "byteCount: ", " < 0"));
            return false;
        } else if (this.y >= j) {
            return true;
        } else {
            return false;
        }
    }

    public final int k(byte[] bArr, int i, int i2) {
        rj1.o((long) bArr.length, (long) i, (long) i2);
        pi6 pi6 = this.w;
        if (pi6 == null) {
            return -1;
        }
        int min = Math.min(i2 - i, pi6.a());
        int i3 = (i + min) - i;
        byte[] bArr2 = pi6.a;
        int i4 = pi6.b;
        qs.I0(i, i4, i4 + i3, bArr2, bArr);
        pi6.b += i3;
        this.y -= (long) min;
        if (pi6.a() == 0) {
            o();
        }
        return min;
    }

    public final void l(tc0 tc0, long j) {
        tc0.getClass();
        if (j >= 0) {
            long j2 = this.y;
            if (j2 >= j) {
                tc0.E(this, j);
            } else {
                tc0.E(this, j2);
                throw new EOFException(f21.k(hl6.q(j, "Buffer exhausted before writing ", " bytes. Only "), this.y, " bytes were written."));
            }
        } else {
            h.j(f21.g(j, "byteCount (", ") < 0"));
        }
    }

    public final void o() {
        pi6 pi6 = this.w;
        pi6.getClass();
        pi6 pi62 = pi6.f;
        this.w = pi62;
        if (pi62 == null) {
            this.x = null;
        } else {
            pi62.g = null;
        }
        pi6.f = null;
        ui6.a(pi6);
    }

    public final void p(long j) {
        if (j < 0) {
            h.j(f21.f(j, "byteCount: "));
        } else if (this.y < j) {
            long j2 = this.y;
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + j2 + ", required: " + j + ')');
        }
    }

    public final byte readByte() {
        pi6 pi6 = this.w;
        if (pi6 != null) {
            int a = pi6.a();
            if (a == 0) {
                o();
                return readByte();
            }
            byte[] bArr = pi6.a;
            int i = pi6.b;
            pi6.b = i + 1;
            byte b = bArr[i];
            this.y--;
            if (a == 1) {
                o();
            }
            return b;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.y + ", required: " + 1 + ')');
    }

    public final void skip(long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                pi6 pi6 = this.w;
                if (pi6 != null) {
                    int min = (int) Math.min(j2, (long) (pi6.c - pi6.b));
                    long j3 = (long) min;
                    this.y -= j3;
                    j2 -= j3;
                    int i = pi6.b + min;
                    pi6.b = i;
                    if (i == pi6.c) {
                        o();
                    }
                } else {
                    throw new EOFException(f21.g(j, "Buffer exhausted before skipping ", " bytes."));
                }
            }
            return;
        }
        h.j(f21.g(j, "byteCount (", ") < 0"));
    }

    public final String toString() {
        int i;
        long j = this.y;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int min = (int) Math.min(64, j);
        int i2 = min * 2;
        if (this.y > 64) {
            i = 1;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(i2 + i);
        pi6 pi6 = this.w;
        int i3 = 0;
        while (pi6 != null) {
            int i4 = 0;
            while (i3 < min && i4 < pi6.a()) {
                int i5 = i4 + 1;
                byte b = pi6.b(i4);
                i3++;
                char[] cArr = rj1.E;
                sb.append(cArr[(b >> 4) & 15]);
                sb.append(cArr[b & 15]);
                i4 = i5;
            }
            pi6 = pi6.f;
        }
        if (this.y > 64) {
            sb.append(8230);
        }
        return "Buffer(size=" + this.y + " hex=" + sb + ')';
    }

    public final long u(fw5 fw5) {
        fw5.getClass();
        long j = 0;
        while (true) {
            long y2 = fw5.y(this, 8192);
            if (y2 == -1) {
                return j;
            }
            j += y2;
        }
    }

    public final long v(tc0 tc0) {
        tc0.getClass();
        long j = this.y;
        if (j > 0) {
            tc0.E(this, j);
        }
        return j;
    }

    public final boolean x() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final long y(tc0 tc0, long j) {
        if (j >= 0) {
            long j2 = this.y;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            tc0.E(this, j);
            return j;
        }
        h.j(f21.g(j, "byteCount (", ") < 0"));
        return 0;
    }

    public final tc0 c() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }
}
