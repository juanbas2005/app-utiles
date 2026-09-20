package defpackage;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;

/* renamed from: px3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class px3 {
    public final pl3 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public px3(pl3 pl3) {
        pl3.getClass();
        this.a = pl3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        if (defpackage.gr8.a0(r1, r0, r6) != r10) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    public static final Object a(px3 px3, di2 di2, zr3 zr3, Charset charset, fg0 fg0, h61 h61) {
        ox3 ox3;
        ox3 ox32;
        int i;
        p81 p81;
        tl3 tl3;
        di2 di22;
        Charset charset2;
        zr3 zr32;
        tl3 tl32;
        nx3 nx3;
        Charset charset3 = charset;
        fg0 fg02 = fg0;
        h61 h612 = h61;
        px3.getClass();
        if (h612 instanceof ox3) {
            ox3 = (ox3) h612;
            int i2 = ox3.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox3.G = i2 - Integer.MIN_VALUE;
                ox32 = ox3;
                Object obj = ox32.E;
                i = ox32.G;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    LinkedHashMap linkedHashMap = px3.b;
                    Object obj2 = linkedHashMap.get(charset3);
                    if (obj2 == null) {
                        obj2 = new tl3(charset3);
                        linkedHashMap.put(charset3, obj2);
                    }
                    tl32 = (tl3) obj2;
                    byte[] bArr = tl32.a;
                    ox32.z = di2;
                    ox32.A = zr3;
                    ox32.B = charset3;
                    ox32.C = fg02;
                    ox32.D = tl32;
                    ox32.G = 1;
                    if (gr8.a0(fg02, bArr, ox32) != p81) {
                        di22 = di2;
                        zr32 = zr3;
                        charset2 = charset3;
                    }
                    return p81;
                } else if (i == 1) {
                    tl3 tl33 = ox32.D;
                    fg02 = ox32.C;
                    Charset charset4 = ox32.B;
                    di22 = ox32.z;
                    o85.q(obj);
                    charset2 = charset4;
                    zr32 = ox32.A;
                    tl32 = tl33;
                } else if (i == 2) {
                    tl3 = ox32.D;
                    fg02 = ox32.C;
                    o85.q(obj);
                    byte[] bArr2 = tl3.b;
                    ox32.z = null;
                    ox32.A = null;
                    ox32.B = null;
                    ox32.C = null;
                    ox32.D = null;
                    ox32.G = 3;
                } else if (i == 3) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nx3 = new nx3(fg02, tl32, px3, zr32, charset2);
                ox32.z = null;
                ox32.A = null;
                ox32.B = null;
                ox32.C = fg02;
                ox32.D = tl32;
                ox32.G = 2;
                if (di22.a(nx3, ox32) != p81) {
                    tl3 = tl32;
                    byte[] bArr22 = tl3.b;
                    ox32.z = null;
                    ox32.A = null;
                    ox32.B = null;
                    ox32.C = null;
                    ox32.D = null;
                    ox32.G = 3;
                }
                return p81;
            }
        }
        ox3 = new ox3(px3, h612);
        ox32 = ox3;
        Object obj3 = ox32.E;
        i = ox32.G;
        p81 = p81.w;
        if (i != 0) {
        }
        nx3 = new nx3(fg02, tl32, px3, zr32, charset2);
        ox32.z = null;
        ox32.A = null;
        ox32.B = null;
        ox32.C = fg02;
        ox32.D = tl32;
        ox32.G = 2;
        if (di22.a(nx3, ox32) != p81) {
        }
        return p81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(Charset charset, fp7 fp7, hf0 hf0, h61 h61) {
        lx3 lx3;
        int i;
        if (h61 instanceof lx3) {
            lx3 = (lx3) h61;
            int i2 = lx3.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lx3.B = i2 - Integer.MIN_VALUE;
                Object obj = lx3.z;
                i = lx3.B;
                if (i != 0) {
                    o85.q(obj);
                    if (sg3.e(charset, mo0.a)) {
                        if (sg3.e(fp7.a, b26.a.b(al6.class))) {
                            pl3 pl3 = this.a;
                            lx3.B = 1;
                            dn1 dn1 = aw1.a;
                            Object e0 = ar7.e0(cm1.y, new gv(hf0, fp7, pl3, (f61) null, 4), lx3);
                            p81 p81 = p81.w;
                            if (e0 == p81) {
                                return p81;
                            }
                            return e0;
                        }
                    }
                    return null;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        String message = th2.getMessage();
                        throw new Exception("Illegal input: " + message, th2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        lx3 = new lx3(this, h61);
        Object obj2 = lx3.z;
        i = lx3.B;
        if (i != 0) {
        }
    }
}
