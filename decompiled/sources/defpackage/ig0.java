package defpackage;

import java.io.IOException;

/* renamed from: ig0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig0 implements o81 {
    public final /* synthetic */ int w = 1;
    public final e81 x;

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, f06] */
    public ig0(e81 e81, hf0 hf0, String str, Long l) {
        char c;
        char c2;
        String str2 = str;
        e81.getClass();
        hf0.getClass();
        this.x = e81;
        cg0 cg0 = lo4.a;
        q51 q51 = o51.a;
        if (d57.Z0(str2, "multipart/", true)) {
            int length = str2.length();
            int i = 0;
            boolean z = false;
            int i2 = 0;
            while (true) {
                c = 3;
                if (i >= length) {
                    i = -1;
                    break;
                }
                char charAt = str2.charAt(i);
                if (z) {
                    if (!z) {
                        if (!z) {
                            if (!z) {
                                if (!z) {
                                }
                            } else if (charAt != '\"') {
                                if (charAt == '\\') {
                                    z = true;
                                }
                            }
                        } else if (charAt != '\"') {
                            if (charAt != ',') {
                                i = charAt != ';' ? i + 1 : i;
                            }
                        }
                        z = true;
                    } else {
                        if (charAt == '=') {
                            z = true;
                        } else {
                            if (charAt != ';') {
                                if (charAt != ',') {
                                    if (charAt != ' ') {
                                        if (i2 == 0 && d57.Y0(str2, "boundary=", i, true)) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i2 = 0;
                        }
                    }
                    z = false;
                } else if (charAt != ';') {
                }
                z = true;
                i2 = 0;
            }
            if (i != -1) {
                int i3 = i + 9;
                byte[] bArr = new byte[74];
                ? obj = new Object();
                lo4.c(obj, bArr, (byte) 13);
                lo4.c(obj, bArr, (byte) 10);
                lo4.c(obj, bArr, (byte) 45);
                lo4.c(obj, bArr, (byte) 45);
                int length2 = str2.length();
                char c3 = 0;
                while (i3 < length2) {
                    char charAt2 = str2.charAt(i3);
                    char c4 = charAt2 & 65535;
                    if (c4 <= 127) {
                        if (c3 != 0) {
                            if (c3 == 1) {
                                if (charAt2 != ' ' && charAt2 != ',') {
                                    c2 = ';';
                                    if (charAt2 == ';') {
                                        break;
                                    }
                                    lo4.c(obj, bArr, (byte) c4);
                                } else {
                                    break;
                                }
                            } else {
                                if (c3 == 2) {
                                    if (charAt2 == '\"') {
                                        break;
                                    } else if (charAt2 != '\\') {
                                        lo4.c(obj, bArr, (byte) c4);
                                    } else {
                                        c3 = c;
                                    }
                                } else if (c3 == c) {
                                    lo4.c(obj, bArr, (byte) c4);
                                    c3 = 2;
                                }
                                c2 = ';';
                            }
                        } else {
                            c2 = ';';
                            if (charAt2 == ' ') {
                                continue;
                            } else if (charAt2 != '\"') {
                                if (charAt2 == ',' || charAt2 == ';') {
                                    break;
                                }
                                lo4.c(obj, bArr, (byte) c4);
                                c3 = 1;
                            } else {
                                c3 = 2;
                            }
                        }
                        i3++;
                        char c5 = c2;
                        c = 3;
                    } else {
                        rd3.i(16);
                        String num = Integer.toString(c4, 16);
                        num.getClass();
                        throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + num + " - should be 7bit character");
                    }
                }
                int i4 = obj.w;
                if (i4 != 4) {
                    byte[] P0 = qs.P0(bArr, 0, i4);
                    ho4 ho4 = new ho4(hf0, new cg0(P0, 0, P0.length), l, (f61) null);
                    op5 op5 = new op5(su0.I(this, x32.w), rj1.c(0, 4, vc0.w));
                    op5.x0(r81.w, op5, ho4);
                    return;
                }
                rf2.i("Empty multipart boundary is not allowed");
                throw null;
            }
            rf2.i("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw null;
        }
        throw new IOException("Failed to parse multipart: Content-Type should be multipart/* but it is " + str2);
    }

    public final e81 k() {
        switch (this.w) {
            case b85.b:
                return this.x;
            default:
                return this.x;
        }
    }

    public String toString() {
        switch (this.w) {
            case 1:
                return "CoroutineScope(coroutineContext=" + this.x + ')';
            default:
                return super.toString();
        }
    }

    public ig0(e81 e81) {
        this.x = e81;
    }
}
