package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: d33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d33 extends b33 {
    public long A = -1;
    public boolean B = true;
    public final /* synthetic */ h33 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d33(h33 h33, g73 g73) {
        super(h33, g73);
        g73.getClass();
        this.C = h33;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r14 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        defpackage.rd3.i(16);
        r1 = java.lang.Integer.toString(r5, 16);
        r1.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r0.B == false) goto L_0x00cb;
     */
    public final long Y(long j, sc0 sc0) {
        long j2;
        long j3 = j;
        h33 h33 = this.C;
        wr0 wr0 = h33.c;
        sc0.getClass();
        long j4 = 0;
        if (j3 < 0) {
            h.j(f21.f(j3, "byteCount < 0: "));
            return 0;
        } else if (!this.y) {
            if (this.B) {
                long j5 = this.A;
                if (j5 == 0 || j5 == -1) {
                    if (j5 != -1) {
                        ((zw5) wr0.y).H(Long.MAX_VALUE);
                    }
                    try {
                        zw5 zw5 = (zw5) wr0.y;
                        sc0 sc02 = zw5.x;
                        zw5.p(1);
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            j2 = j4;
                            if (!zw5.j((long) i2)) {
                                break;
                            }
                            byte u = sc02.u((long) i);
                            if ((u < 48 || u > 57) && (u < 97 || u > 102)) {
                                if (u < 65) {
                                    break;
                                } else if (u > 70) {
                                    break;
                                }
                            }
                            i = i2;
                            j4 = j2;
                        }
                        this.A = sc02.E();
                        String obj = d57.k1(((zw5) wr0.y).H(Long.MAX_VALUE)).toString();
                        if (this.A < j2 || (obj.length() > 0 && !k57.u0(obj, ";", false))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.A + obj + '\"');
                        } else if (this.A == j2) {
                            this.B = false;
                            a(h33.e.h());
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long Y = super.Y(Math.min(j3, this.A), sc0);
                if (Y != -1) {
                    this.A -= Y;
                    return Y;
                }
                h33.b.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(h33.f);
                throw protocolException;
            }
            return -1;
        } else {
            h.s("closed");
            return 0;
        }
    }

    public final void close() {
        boolean z;
        if (!this.y) {
            if (this.B) {
                TimeZone timeZone = fg8.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    z = fg8.g(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    this.C.b.e();
                    a(h33.f);
                }
            }
            this.y = true;
        }
    }
}
