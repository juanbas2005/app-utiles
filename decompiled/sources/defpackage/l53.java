package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: l53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l53 {
    public static final Set a = qs.r1(new Character[]{'/', '?', '#', '@'});

    static {
        List list = h64.b;
        ie1.s(sg3.E("HTTP/1.0", "HTTP/1.1"), new j5(10), new vw0(1));
    }

    public static final void a(wn0 wn0, char c) {
        throw new IllegalStateException("Character with code " + (c & 255) + " is not allowed in header names, \n" + wn0);
    }

    public static final int b(wn0 wn0, dv5 dv5) {
        int i = dv5.b;
        int i2 = dv5.c;
        while (i < i2) {
            char charAt = wn0.charAt(i);
            if (charAt == ':' && i != dv5.b) {
                dv5.b = i + 1;
                return i;
            } else if (sg3.k(charAt, 32) <= 0 || d57.y0("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i3 = dv5.b;
                if (charAt == ':') {
                    throw new IllegalStateException("Empty header names are not allowed as per RFC7230.");
                } else if (i == i3) {
                    throw new IllegalStateException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                } else {
                    a(wn0, charAt);
                    throw null;
                }
            } else {
                i++;
            }
        }
        CharSequence subSequence = wn0.subSequence(dv5.b, dv5.c);
        throw new IllegalStateException("No colon in HTTP header in " + subSequence.toString() + " in builder: \n" + wn0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b7, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object c(hf0 hf0, wn0 wn0, dv5 dv5, h61 h61) {
        k53 k53;
        Object obj;
        int i;
        c53 c53;
        k53 k532;
        wn0 wn02;
        hf0 hf02;
        p81 p81;
        if (h61 instanceof k53) {
            k53 k533 = (k53) h61;
            int i2 = k533.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k533.E = i2 - Integer.MIN_VALUE;
                k53 = k533;
                obj = k53.D;
                i = k53.E;
                if (i != 0) {
                    o85.q(obj);
                    hf02 = hf0;
                    wn02 = wn0;
                    c53 = new c53(wn0);
                    k532 = k53;
                } else if (i == 1) {
                    c53 = k53.C;
                    dv5 dv52 = k53.B;
                    wn0 wn03 = k53.A;
                    hf0 hf03 = k53.z;
                    o85.q(obj);
                    wn02 = wn03;
                    k532 = k53;
                    hf02 = hf03;
                    dv5 = dv52;
                    if (((Number) obj).longValue() == -1) {
                        c53.d();
                    } else {
                        int i3 = wn02.C;
                        dv5.c = i3;
                        int i4 = dv5.b;
                        int i5 = i3 - i4;
                        if (i5 != 0) {
                            if (i5 < 8192) {
                                int b = b(wn02, dv5);
                                int i6 = dv5.c;
                                int i7 = dv5.b;
                                while (i7 < i6) {
                                    char charAt = wn02.charAt(i7);
                                    if (!rd3.C(charAt) && charAt != 9) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (i7 >= i6) {
                                    dv5.b = i6;
                                } else {
                                    int i8 = i7;
                                    int i9 = i8;
                                    while (true) {
                                        if (i8 >= i6) {
                                            dv5.b = i7;
                                            dv5.c = i9 + 1;
                                            break;
                                        }
                                        char charAt2 = wn02.charAt(i8);
                                        if (charAt2 != 9) {
                                            if (charAt2 == 10 || charAt2 == 13) {
                                                a(wn02, charAt2);
                                            } else if (charAt2 != ' ') {
                                                i9 = i8;
                                            }
                                        }
                                        i8++;
                                    }
                                }
                                int i10 = dv5.b;
                                int i11 = dv5.c;
                                dv5.b = i6;
                                c53.c(i4, b, i10, i11);
                            }
                            throw new IllegalStateException("Header line length limit exceeded");
                        }
                        un0 a2 = c53.a("Host");
                        if (a2 != null) {
                            d(a2);
                        }
                        return c53;
                    }
                    c53.d();
                    return null;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k532.z = hf02;
                k532.A = wn02;
                k532.B = dv5;
                k532.C = c53;
                k532.E = 1;
                obj = rc9.b0(hf02, wn02, 8192, false, true, k532);
                p81 = p81.w;
                if (obj == p81) {
                    return p81;
                }
                if (((Number) obj).longValue() == -1) {
                }
                c53.d();
                return null;
            }
        }
        k53 = new h61(h61);
        obj = k53.D;
        i = k53.E;
        if (i != 0) {
        }
        try {
            k532.z = hf02;
            k532.A = wn02;
            k532.B = dv5;
            k532.C = c53;
            k532.E = 1;
            obj = rc9.b0(hf02, wn02, 8192, false, true, k532);
            p81 = p81.w;
            if (obj == p81) {
            }
            if (((Number) obj).longValue() == -1) {
            }
            c53.d();
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            c53.d();
            throw th2;
        }
    }

    public static final void d(un0 un0) {
        if (!d57.A0(un0, ":")) {
            int i = 0;
            while (i < un0.length()) {
                Character valueOf = Character.valueOf(un0.charAt(i));
                Set set = a;
                if (!set.contains(valueOf)) {
                    i++;
                } else {
                    throw new IllegalStateException("Host cannot contain any of the following symbols: " + set);
                }
            }
            return;
        }
        throw new IllegalStateException("Host header with ':' should contains port: " + un0);
    }
}
