package defpackage;

import io.github.jan.supabase.exceptions.HttpRequestException;
import io.github.jan.supabase.exceptions.RestException;
import java.util.Set;

/* renamed from: h66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h66 {
    public static final h66 a = new Object();
    public static final Set b = qs.r1(new i53[]{i53.b, i53.g});
    public static final Set c = qs.r1(new Integer[]{503, 520});

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        r11 = r5;
        r5 = r3;
        r3 = r11;
        r12 = r0;
        r0 = r4;
        r4 = r7;
        r11 = r10;
        r7 = r1;
        r1 = r6;
        r10 = r8;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0130, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0131, code lost:
        r11 = r8;
        r8 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r1;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016d, code lost:
        if (defpackage.t49.G(r8, r3) == r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0194, code lost:
        if (c.contains(new java.lang.Integer(r6.w)) != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0196, code lost:
        r12 = r1;
        r13 = java.lang.Math.min(((long) java.lang.Math.pow(2.0d, (double) r0)) * 1000, 30000);
        r3.z = r11;
        r3.A = r10;
        r3.B = r8;
        r3.C = r7;
        r3.D = r6;
        r3.E = r5;
        r3.F = r4;
        r3.G = r12;
        r3.H = r0;
        r3.K = 3;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c0, code lost:
        if (defpackage.t49.G(r13, r3) == r9) goto L_0x01c2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0123 A[ExcHandler: HttpRequestException (r0v10 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:37:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    public final Object a(gm5 gm5, String str, im5 im5, f61 f61) {
        g66 g66;
        int i;
        p81 p81;
        gm5 gm52;
        String str2;
        im5 im52;
        aw awVar;
        int i2;
        int i3;
        int i4;
        g66 g662;
        im5 im53;
        int i5;
        Exception exc;
        int i6;
        String str3;
        aw awVar2;
        RestException restException;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        gm5 gm53;
        aw awVar3;
        int i12;
        gm5 gm54;
        String str4;
        im5 im54;
        int i13;
        gm5 gm55;
        im5 im55;
        int i14;
        int i15;
        int i16;
        int i17;
        Object g;
        Object a2;
        int i18;
        int i19;
        gm5 gm56 = gm5;
        im5 im56 = im5;
        f61 f612 = f61;
        if (f612 instanceof g66) {
            g66 = (g66) f612;
            int i20 = g66.K;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                g66.K = i20 - Integer.MIN_VALUE;
                Object obj = g66.I;
                i = g66.K;
                int i21 = 2;
                int i22 = 1;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    gm56.c.getClass();
                    i11 = 0;
                    if (!im56.h || !b.contains(im56.c)) {
                        i18 = 0;
                    } else {
                        i18 = 1;
                    }
                    if (i18 != 0) {
                        i19 = 3;
                    } else {
                        i19 = 0;
                    }
                    i10 = i18;
                    awVar2 = gm56.e;
                    i5 = 3;
                    str3 = str;
                    i6 = i19;
                    g662 = g66;
                    im53 = im56;
                    gm53 = gm56;
                } else if (i == 1) {
                    i17 = g66.H;
                    i16 = g66.G;
                    i15 = g66.F;
                    i14 = g66.E;
                    awVar = g66.C;
                    im55 = g66.B;
                    str2 = g66.A;
                    gm55 = g66.z;
                    o85.q(obj);
                    g66.z = gm55;
                    g66.A = str2;
                    g66.B = im55;
                    g66.C = awVar;
                    g66.D = null;
                    g66.E = i14;
                    g66.F = i15;
                    g66.G = i16;
                    g66.H = i17;
                    g66.K = i21;
                    g = j45.g((yl1) obj, gm55, g66);
                    if (g != p81) {
                        return p81;
                    }
                    return g;
                } else if (i == 2) {
                    i17 = g66.H;
                    i16 = g66.G;
                    i15 = g66.F;
                    i14 = g66.E;
                    awVar = g66.C;
                    im55 = g66.B;
                    str2 = g66.A;
                    gm55 = g66.z;
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (RestException e) {
                        int i23 = i14;
                        restException = e;
                        i9 = i17;
                        i8 = i16;
                        i7 = i15;
                        i2 = i23;
                    } catch (HttpRequestException e2) {
                        String str5 = str2;
                        i12 = i14;
                        str4 = str5;
                        gm5 gm57 = gm55;
                        awVar3 = awVar;
                        gm54 = gm57;
                        exc = e2;
                        i4 = i17;
                        i13 = i16;
                        i3 = i15;
                        im54 = im55;
                        if (i4 >= i13) {
                            long min = Math.min(((long) Math.pow(2.0d, (double) i4)) * 1000, 30000);
                            g66.z = gm54;
                            g66.A = str4;
                            g66.B = im54;
                            g66.C = awVar3;
                            g66.D = exc;
                            g66.E = i12;
                            g66.F = i3;
                            g66.G = i13;
                            g66.H = i4;
                            g66.K = 4;
                            p81 = p81;
                        } else {
                            throw exc;
                        }
                    }
                } else if (i == 3) {
                    i9 = g66.H;
                    int i24 = g66.G;
                    i7 = g66.F;
                    i2 = g66.E;
                    Exception exc2 = g66.D;
                    awVar = g66.C;
                    im52 = g66.B;
                    str2 = g66.A;
                    gm52 = g66.z;
                    o85.q(obj);
                    int i25 = i24;
                    Exception exc3 = exc2;
                    int i26 = i2;
                    g662 = g66;
                    im53 = im52;
                    i5 = i26;
                    int i27 = i25;
                    exc = exc3;
                    i6 = i27;
                    str3 = str2;
                    awVar2 = awVar;
                    i10 = i3;
                    if (i4 == i6) {
                    }
                } else if (i == 4) {
                    i4 = g66.H;
                    i13 = g66.G;
                    i3 = g66.F;
                    i12 = g66.E;
                    exc = g66.D;
                    awVar3 = g66.C;
                    im54 = g66.B;
                    str4 = g66.A;
                    gm54 = g66.z;
                    o85.q(obj);
                    im5 im57 = im54;
                    g662 = g66;
                    im53 = im57;
                    str3 = str4;
                    i5 = i12;
                    awVar2 = awVar3;
                    i6 = i13;
                    gm52 = gm54;
                    i10 = i3;
                    if (i4 == i6) {
                        i11 = i4 + 1;
                        gm53 = gm52;
                        i21 = 2;
                        i22 = 1;
                    } else {
                        exc.getClass();
                        throw exc;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k04 k04 = new k04(i11, i22, im53);
                g662.z = gm53;
                g662.A = str3;
                g662.B = im53;
                g662.C = awVar2;
                g662.D = null;
                g662.E = i5;
                g662.F = i10;
                g662.G = i6;
                g662.H = i11;
                g662.K = i22;
                a2 = awVar2.a(str3, k04, g662);
                if (a2 != p81) {
                    gm55 = gm53;
                    i17 = i11;
                    i16 = i6;
                    i14 = i5;
                    im55 = im53;
                    g66 = g662;
                    i15 = i10;
                    awVar = awVar2;
                    str2 = str3;
                    obj = a2;
                    g66.z = gm55;
                    g66.A = str2;
                    g66.B = im55;
                    g66.C = awVar;
                    g66.D = null;
                    g66.E = i14;
                    g66.F = i15;
                    g66.G = i16;
                    g66.H = i17;
                    g66.K = i21;
                    g = j45.g((yl1) obj, gm55, g66);
                    if (g != p81) {
                    }
                }
                return p81;
            }
        }
        g66 = new g66(this, f612);
        Object obj2 = g66.I;
        i = g66.K;
        int i212 = 2;
        int i222 = 1;
        p81 = p81.w;
        if (i != 0) {
        }
        try {
        } catch (RestException e3) {
            e = e3;
            int i28 = i5;
            im52 = im53;
            g66 g663 = g662;
            i2 = i28;
            gm52 = gm53;
            i8 = i6;
            restException = e;
            i9 = i11;
            i7 = i10;
            awVar = awVar2;
            str2 = str3;
            if (i9 < i8) {
            }
            throw restException;
        } catch (HttpRequestException e4) {
        }
        k04 k042 = new k04(i11, i222, im53);
        g662.z = gm53;
        g662.A = str3;
        g662.B = im53;
        g662.C = awVar2;
        g662.D = null;
        g662.E = i5;
        g662.F = i10;
        g662.G = i6;
        g662.H = i11;
        g662.K = i222;
        a2 = awVar2.a(str3, k042, g662);
        if (a2 != p81) {
        }
        return p81;
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof h66)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -105643338;
    }

    public final String toString() {
        return "RestRequestExecutor";
    }
}
