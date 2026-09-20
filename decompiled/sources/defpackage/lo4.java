package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: lo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lo4 {
    public static final cg0 a;
    public static final cg0 b = new cg0(new byte[]{45, 45});

    static {
        byte[] R = z65.R("\r\n", mo0.a);
        a = new cg0(R, 0, R.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: io4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: io4} */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        if (r2 == r11) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a5, code lost:
        if (r5.c(r6) != r11) goto L_0x01a8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public static final Object a(cg0 cg0, y81 y81, af0 af0, c53 c53, long j, h61 h61) {
        io4 io4;
        int i;
        long j2;
        fg0 fg0;
        long j3;
        long j4;
        int i2;
        Object obj;
        y81 y812;
        cg0 cg02;
        long j5;
        long j6;
        Long l;
        long j7;
        fg0 fg02 = af0;
        long j8 = j;
        h61 h612 = h61;
        if (h612 instanceof io4) {
            io4 io42 = (io4) h612;
            int i3 = io42.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                io42.F = i3 - Integer.MIN_VALUE;
                io4 = io42;
                io4 io43 = io4;
                Object obj2 = io43.E;
                i = io43.F;
                int i4 = 3;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    un0 a2 = c53.a("Content-Length");
                    if (a2 != null) {
                        int i5 = ko0.a;
                        int length = a2.length();
                        j6 = 0;
                        if (length <= 19) {
                            int i6 = 0;
                            if (length == 19) {
                                int length2 = a2.length();
                                j7 = 0;
                                while (i6 < length2) {
                                    int i7 = i4;
                                    long charAt = ((long) a2.charAt(i6)) - 48;
                                    if (charAt < 0 || charAt > 9) {
                                        ko0.b(a2, i6);
                                        throw null;
                                    }
                                    j7 = (j7 << i7) + (j7 << 1) + charAt;
                                    if (j7 >= 0) {
                                        i6++;
                                        i4 = i7;
                                    } else {
                                        throw new NumberFormatException("Invalid number " + a2 + ": too large for Long type");
                                    }
                                }
                                i2 = i4;
                            } else {
                                i2 = 3;
                                long j9 = 0;
                                while (i6 < length) {
                                    long charAt2 = ((long) a2.charAt(i6)) - 48;
                                    if (charAt2 < 0 || charAt2 > 9) {
                                        ko0.b(a2, i6);
                                        throw null;
                                    }
                                    j9 = (j7 << 3) + (j7 << 1) + charAt2;
                                    i6++;
                                }
                            }
                            l = new Long(j7);
                        } else {
                            throw new NumberFormatException("Invalid number " + a2 + ": too large for Long type");
                        }
                    } else {
                        i2 = 3;
                        j6 = 0;
                        l = null;
                    }
                    if (l == null) {
                        io43.z = null;
                        io43.A = null;
                        io43.B = fg02;
                        io43.C = j8;
                        io43.F = 1;
                        obj2 = new ef0(y81, cg0, fg02, j8).d(true, io43);
                        if (obj2 != obj3) {
                            j5 = j8;
                        }
                    } else {
                        y812 = y81;
                        long longValue = l.longValue();
                        if (j6 > longValue || longValue > j8) {
                            rf2.i(f21.k(hl6.q(l.longValue(), "Multipart content length exceeds limit ", " > "), j8, "; limit is defined using 'formFieldLimit' argument"));
                            return null;
                        }
                        long longValue2 = l.longValue();
                        cg02 = cg0;
                        io43.z = cg02;
                        io43.A = y812;
                        io43.B = fg02;
                        io43.C = j8;
                        io43.F = 2;
                        obj = rc9.A(y812, fg02, longValue2, io43);
                    }
                    return obj3;
                } else if (i == 1) {
                    j5 = io43.C;
                    fg02 = io43.B;
                    o85.q(obj2);
                } else if (i == 2) {
                    long j10 = io43.C;
                    fg02 = io43.B;
                    y81 y813 = io43.A;
                    cg0 cg03 = io43.z;
                    o85.q(obj2);
                    i2 = 3;
                    long j11 = j10;
                    obj = obj2;
                    y812 = y813;
                    cg02 = cg03;
                    j8 = j11;
                    long longValue3 = ((Number) obj).longValue();
                    io43.z = null;
                    io43.A = null;
                    io43.B = fg02;
                    io43.C = j8;
                    io43.D = longValue3;
                    io43.F = i2;
                    obj2 = d(y812, cg02, io43);
                    if (obj2 != obj3) {
                        fg0 = fg02;
                        j3 = j8;
                        j4 = longValue3;
                        j2 = ((Number) obj2).longValue() + j4;
                        io43.z = null;
                        io43.A = null;
                        io43.B = null;
                        io43.C = j3;
                        io43.D = j2;
                        io43.F = 4;
                    }
                    return obj3;
                } else if (i == 3) {
                    j4 = io43.D;
                    j3 = io43.C;
                    fg0 = io43.B;
                    o85.q(obj2);
                    j2 = ((Number) obj2).longValue() + j4;
                    io43.z = null;
                    io43.A = null;
                    io43.B = null;
                    io43.C = j3;
                    io43.D = j2;
                    io43.F = 4;
                } else if (i == 4) {
                    j2 = io43.D;
                    o85.q(obj2);
                    return new Long(j2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg0 = fg02;
                j3 = j5;
                j2 = ((Number) obj2).longValue();
                io43.z = null;
                io43.A = null;
                io43.B = null;
                io43.C = j3;
                io43.D = j2;
                io43.F = 4;
            }
        }
        io4 = new h61(h612);
        io4 io432 = io4;
        Object obj22 = io432.E;
        i = io432.F;
        int i42 = 3;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        fg0 = fg02;
        j3 = j5;
        j2 = ((Number) obj22).longValue();
        io432.z = null;
        io432.A = null;
        io432.B = null;
        io432.C = j3;
        io432.D = j2;
        io432.F = 4;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[Catch:{ all -> 0x0029 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[Catch:{ all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public static final Object b(y81 y81, h61 h61) {
        jo4 jo4;
        int i;
        Throwable th;
        wn0 wn0;
        c53 c53;
        if (h61 instanceof jo4) {
            jo4 jo42 = (jo4) h61;
            int i2 = jo42.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jo42.B = i2 - Integer.MIN_VALUE;
                jo4 = jo42;
                Object obj = jo4.A;
                i = jo4.B;
                if (i != 0) {
                    o85.q(obj);
                    wn0 wn02 = new wn0();
                    try {
                        jo4.z = wn02;
                        jo4.B = 1;
                        Set set = l53.a;
                        dv5 dv5 = new dv5(5, (byte) 0);
                        dv5.b = 0;
                        dv5.c = 0;
                        Object c = l53.c(y81, wn02, dv5, jo4);
                        Object obj2 = p81.w;
                        if (c == obj2) {
                            return obj2;
                        }
                        wn0 wn03 = wn02;
                        obj = c;
                        wn0 = wn03;
                    } catch (Throwable th2) {
                        wn0 wn04 = wn02;
                        th = th2;
                        wn0 = wn04;
                        y25 y25 = wn0.w;
                        ArrayList arrayList = wn0.x;
                        if (arrayList != null) {
                            wn0.y = null;
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                y25.e0(arrayList.get(i3));
                            }
                        } else {
                            char[] cArr = wn0.y;
                            if (cArr != null) {
                                y25.e0(cArr);
                            }
                            wn0.y = null;
                        }
                        wn0.A = true;
                        wn0.x = null;
                        wn0.z = null;
                        wn0.C = 0;
                        wn0.B = 0;
                        throw th;
                    }
                } else if (i == 1) {
                    wn0 = jo4.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c53 = (c53) obj;
                if (c53 == null) {
                    return c53;
                }
                throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        jo4 = new h61(h61);
        Object obj3 = jo4.A;
        i = jo4.B;
        if (i != 0) {
        }
        c53 = (c53) obj3;
        if (c53 == null) {
        }
    }

    public static final void c(f06 f06, byte[] bArr, byte b2) {
        int i = f06.w;
        if (i < bArr.length) {
            f06.w = i + 1;
            bArr[i] = b2;
            return;
        }
        rf2.i("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object d(hf0 hf0, cg0 cg0, h61 h61) {
        ko4 ko4;
        Object obj;
        int i;
        long j;
        if (h61 instanceof ko4) {
            ko4 ko42 = (ko4) h61;
            int i2 = ko42.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ko42.B = i2 - Integer.MIN_VALUE;
                ko4 = ko42;
                obj = ko4.A;
                i = ko4.B;
                if (i != 0) {
                    o85.q(obj);
                    ko4.z = cg0;
                    ko4.B = 1;
                    obj = rc9.T0(hf0, cg0, ko4);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    cg0 = ko4.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) obj).booleanValue()) {
                    j = (long) cg0.w.length;
                } else {
                    j = 0;
                }
                return new Long(j);
            }
        }
        ko4 = new h61(h61);
        obj = ko4.A;
        i = ko4.B;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return new Long(j);
    }
}
