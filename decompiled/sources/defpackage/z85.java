package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: z85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z85 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;
    public static ts2 c;

    public static final void a(hf7 hf7, vr2 vr2, ml4 ml4, boolean z, tg7 tg7, gs2 gs2, gs2 gs22, gs2 gs23, boolean z2, m78 m78, bt3 bt3, zs3 zs3, boolean z3, int i, int i2, pq6 pq6, yd7 yd7, yt2 yt2, int i3) {
        int i4;
        vr2 vr22;
        ml4 ml42;
        gs2 gs24;
        pq6 pq62;
        int i5;
        int i6;
        zs3 zs32;
        tg7 tg72;
        boolean z4;
        yt2 yt22;
        pq6 pq63;
        int i7;
        int i8;
        zs3 zs33;
        tg7 tg73;
        long j;
        boolean z5 = z2;
        yd7 yd72 = yd7;
        yt2 yt23 = yt2;
        int i9 = i3;
        yt23.g0(2057288437);
        hf7 hf72 = hf7;
        if ((i9 & 6) == 0) {
            i4 = (yt23.g(hf72) ? 4 : 2) | i9;
        } else {
            i4 = i9;
        }
        if ((i9 & 48) == 0) {
            vr22 = vr2;
            i4 |= yt23.i(vr22) ? 32 : 16;
        } else {
            vr22 = vr2;
        }
        char c2 = 128;
        if ((i9 & 384) == 0) {
            ml42 = ml4;
            i4 |= yt23.g(ml42) ? 256 : 128;
        } else {
            ml42 = ml4;
        }
        int i10 = i4 | 27648;
        if ((196608 & i9) == 0) {
            i10 = 93184 | i4;
        }
        if ((1572864 & i9) == 0) {
            i10 |= yt23.i(gs2) ? 1048576 : 524288;
        } else {
            gs2 gs25 = gs2;
        }
        if ((12582912 & i9) == 0) {
            gs24 = gs22;
            i10 |= yt23.i(gs24) ? 8388608 : 4194304;
        } else {
            gs24 = gs22;
        }
        int i11 = i10 | 905969664;
        m78 m782 = m78;
        char c3 = (yt23.h(z5) ? (char) 2048 : 1024) | 438 | (yt23.g(m782) ? (char) 16384 : 8192) | 0;
        if (yt23.g(yd72)) {
            c2 = 256;
        }
        boolean z6 = true;
        if (yt23.V(i11 & 1, ((i11 & 306783379) == 306783378 && (c3 & 9363) == 9362 && ((c2 | 22) & 147) == 146) ? false : true)) {
            yt23.a0();
            if ((i9 & 1) == 0 || yt23.C()) {
                tg73 = (tg7) yt23.k(yf7.a);
                zs33 = zs3.b;
                i8 = z3 ? 1 : Integer.MAX_VALUE;
                pq63 = hr6.a(bb0.s, yt23);
                i7 = 1;
            } else {
                yt23.Y();
                z6 = z;
                tg73 = tg7;
                zs33 = zs3;
                i8 = i;
                i7 = i2;
                pq63 = pq6;
            }
            yt23.s();
            yt23.e0(-502301594);
            Object Q = yt23.Q();
            if (Q == ay0.a) {
                Q = b81.e(yt23);
            }
            ap4 ap4 = (ap4) Q;
            yt23.r(false);
            yt23.e0(1369275503);
            long b2 = tg73.b();
            if (b2 == 16) {
                boolean booleanValue = ((Boolean) rc9.z(ap4, yt23, 0).getValue()).booleanValue();
                if (!z6) {
                    j = yd72.c;
                } else if (z5) {
                    j = yd72.d;
                } else if (booleanValue) {
                    j = yd72.a;
                } else {
                    j = yd72.b;
                }
                b2 = j;
            }
            long j2 = b2;
            yt23.r(false);
            ml4 ml43 = ml42;
            boolean z7 = z6;
            yt22 = yt2;
            t49.c(og7.a.a(yd72.k), su0.J(-2094276683, new u85(ml43, gs2, z5, yd72, hf72, vr22, z7, tg73.d(new tg7(j2, 0, (am2) null, 0, (l57) null, 0, 0, (dk5) null, (m64) null, 16777214)), bt3, zs33, z3, i8, i7, m782, ap4, gs24, gs23, pq63), yt22), yt22, 56);
            z4 = z7;
            i6 = i8;
            i5 = i7;
            pq62 = pq63;
            tg72 = tg73;
            zs32 = zs33;
        } else {
            yt22 = yt23;
            yt22.Y();
            z4 = z;
            tg72 = tg7;
            zs32 = zs3;
            i6 = i;
            i5 = i2;
            pq62 = pq6;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new v85(hf7, vr2, ml4, z4, tg72, gs2, gs22, gs23, z2, m78, bt3, zs32, z3, i6, i5, pq62, yd7, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0124  */
    public static final void b(String str, vr2 vr2, ml4 ml4, boolean z, boolean z2, tg7 tg7, gs2 gs2, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, boolean z3, m78 m78, bt3 bt3, zs3 zs3, boolean z4, int i, int i2, pq6 pq6, yd7 yd7, yt2 yt2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        gs2 gs26;
        int i10;
        gs2 gs27;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        yd7 yd72;
        pq6 pq62;
        int i27;
        int i28;
        boolean z7;
        zs3 zs32;
        bt3 bt32;
        m78 m782;
        boolean z8;
        gs2 gs28;
        gs2 gs29;
        gs2 gs210;
        gs2 gs211;
        gs2 gs212;
        tg7 tg72;
        boolean z9;
        boolean z10;
        yx5 v;
        pq6 pq63;
        gs2 gs213;
        gs2 gs214;
        gs2 gs215;
        gs2 gs216;
        m78 m783;
        boolean z11;
        zs3 zs33;
        bt3 bt33;
        boolean z12;
        boolean z13;
        yd7 yd73;
        boolean z14;
        gs2 gs217;
        int i29;
        tg7 tg73;
        long j;
        int i30;
        yt2 yt22 = yt2;
        int i31 = i3;
        int i32 = i4;
        int i33 = i5;
        int i34 = i6;
        yt22.g0(1901501544);
        String str2 = str;
        if ((i31 & 6) == 0) {
            i7 = (yt22.g(str2) ? 4 : 2) | i31;
        } else {
            i7 = i31;
        }
        vr2 vr22 = vr2;
        if ((i31 & 48) == 0) {
            i7 |= yt22.i(vr22) ? 32 : 16;
        }
        if ((i31 & 384) == 0) {
            i7 |= yt22.g(ml4) ? 256 : 128;
        } else {
            ml4 ml42 = ml4;
        }
        int i35 = i34 & 8;
        if (i35 != 0) {
            i7 |= 3072;
        } else if ((i31 & 3072) == 0) {
            z5 = z;
            i7 |= yt22.h(z5) ? 2048 : 1024;
            i8 = i34 & 16;
            int i36 = 8192;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i31 & 24576) == 0) {
                z6 = z2;
                i7 |= yt22.h(z6) ? 16384 : 8192;
                if ((i31 & 196608) == 0) {
                    i7 |= 65536;
                }
                i9 = i34 & 64;
                int i37 = 1048576;
                if (i9 != 0) {
                    i7 |= 1572864;
                    gs26 = gs2;
                } else {
                    gs26 = gs2;
                    if ((i31 & 1572864) == 0) {
                        i7 |= yt22.i(gs26) ? 1048576 : 524288;
                    }
                }
                i10 = i34 & 128;
                int i38 = 8388608;
                if (i10 != 0) {
                    i7 |= 12582912;
                    gs27 = gs22;
                } else {
                    gs27 = gs22;
                    if ((i31 & 12582912) == 0) {
                        i7 |= yt22.i(gs27) ? 8388608 : 4194304;
                    }
                }
                i11 = i34 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                    gs2 gs218 = gs23;
                } else {
                    int i39 = i31 & 100663296;
                    gs2 gs219 = gs23;
                    if (i39 == 0) {
                        i7 |= yt22.i(gs219) ? 67108864 : 33554432;
                    }
                }
                i12 = i34 & 512;
                int i40 = 268435456;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i13 = i12;
                    i7 |= yt22.i(gs24) ? 536870912 : 268435456;
                    int i41 = i32 | 54;
                    i14 = i34 & 4096;
                    if (i14 == 0) {
                        i15 = i14;
                        i16 = i32 | 438;
                    } else {
                        i15 = i14;
                        if ((i32 & 384) == 0) {
                            i41 |= yt22.i(gs25) ? 256 : 128;
                        } else {
                            gs2 gs220 = gs25;
                        }
                        i16 = i41;
                    }
                    i17 = i7;
                    i18 = i34 & 8192;
                    if (i18 == 0) {
                        i19 = i16 | 3072;
                    } else {
                        int i42 = i16;
                        if ((i32 & 3072) == 0) {
                            i19 = i42 | (yt22.h(z3) ? 2048 : 1024);
                        } else {
                            boolean z15 = z3;
                            i19 = i42;
                        }
                    }
                    int i43 = i18;
                    i20 = i34 & 16384;
                    if (i20 == 0) {
                        i21 = i19 | 24576;
                    } else {
                        i21 = i19;
                        if ((i32 & 24576) == 0) {
                            if (yt22.g(m78)) {
                                i36 = 16384;
                            }
                            i21 |= i36;
                            i22 = i34 & 32768;
                            if (i22 != 0) {
                                i21 |= 196608;
                                bt3 bt34 = bt3;
                            } else {
                                bt3 bt35 = bt3;
                                if ((i32 & 196608) == 0) {
                                    i21 |= yt22.g(bt35) ? 131072 : 65536;
                                }
                            }
                            i23 = i34 & 65536;
                            if (i23 != 0) {
                                i21 |= 1572864;
                                zs3 zs34 = zs3;
                            } else {
                                zs3 zs35 = zs3;
                                if ((i32 & 1572864) == 0) {
                                    if (!yt22.g(zs35)) {
                                        i37 = 524288;
                                    }
                                    i21 |= i37;
                                }
                            }
                            i24 = i34 & 131072;
                            if (i24 != 0) {
                                i21 |= 12582912;
                                boolean z16 = z4;
                            } else {
                                boolean z17 = z4;
                                if ((i32 & 12582912) == 0) {
                                    if (!yt22.h(z17)) {
                                        i38 = 4194304;
                                    }
                                    i21 |= i38;
                                }
                            }
                            if ((i32 & 100663296) == 0) {
                                i21 |= 33554432;
                            }
                            i25 = i34 & 524288;
                            if (i25 != 0) {
                                i21 |= 805306368;
                                int i44 = i2;
                            } else {
                                int i45 = i2;
                                if ((i32 & 805306368) == 0) {
                                    if (yt22.e(i45)) {
                                        i40 = 536870912;
                                    }
                                    i21 |= i40;
                                }
                            }
                            i26 = i33 | 6;
                            if ((i33 & 48) == 0) {
                                i26 |= ((i34 & 2097152) != 0 || !yt22.g(pq6)) ? 16 : 32;
                            } else {
                                pq6 pq64 = pq6;
                            }
                            if ((i33 & 384) == 0) {
                                if ((i34 & 4194304) != 0) {
                                    yd7 yd74 = yd7;
                                } else if (yt22.g(yd7)) {
                                    i30 = 256;
                                    i26 |= i30;
                                }
                                i30 = 128;
                                i26 |= i30;
                            } else {
                                yd7 yd75 = yd7;
                            }
                            int i46 = 1;
                            if (yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 306783379) == 306783378 || (i26 & 147) == 146)) {
                                yt22.a0();
                                if ((i3 & 1) == 0 || yt22.C()) {
                                    if (i35 != 0) {
                                        z5 = true;
                                    }
                                    if (i8 != 0) {
                                        z6 = false;
                                    }
                                    tg73 = (tg7) yt22.k(yf7.a);
                                    gs2 gs221 = null;
                                    if (i9 != 0) {
                                        gs26 = null;
                                    }
                                    if (i10 != 0) {
                                        gs27 = null;
                                    }
                                    gs2 gs222 = i11 != 0 ? null : gs23;
                                    gs2 gs223 = i13 != 0 ? null : gs24;
                                    if (i15 == 0) {
                                        gs221 = gs25;
                                    }
                                    boolean z18 = i43 != 0 ? false : z3;
                                    m78 m784 = i20 != 0 ? g22.M : m78;
                                    bt3 bt36 = i22 != 0 ? bt3.e : bt3;
                                    zs3 zs36 = i23 != 0 ? zs3.b : zs3;
                                    boolean z19 = i24 != 0 ? false : z4;
                                    int i47 = z19 ? 1 : Integer.MAX_VALUE;
                                    if (i25 == 0) {
                                        i46 = i2;
                                    }
                                    pq6 a2 = (i6 & 2097152) != 0 ? hr6.a(bb0.s, yt22) : pq6;
                                    tg7 tg74 = tg73;
                                    if ((i6 & 4194304) != 0) {
                                        gs213 = gs221;
                                        gs215 = gs222;
                                        pq63 = a2;
                                        m783 = m784;
                                        gs214 = gs223;
                                        gs216 = gs27;
                                        i29 = i47;
                                        yd73 = pe2.r(6, yt22);
                                        z12 = z6;
                                        gs217 = gs26;
                                        z14 = z18;
                                        z11 = z19;
                                        tg73 = tg74;
                                    } else {
                                        gs213 = gs221;
                                        gs215 = gs222;
                                        pq63 = a2;
                                        m783 = m784;
                                        gs214 = gs223;
                                        gs216 = gs27;
                                        i29 = i47;
                                        yd73 = yd7;
                                        z12 = z6;
                                        gs217 = gs26;
                                        z14 = z18;
                                        z11 = z19;
                                    }
                                    z13 = z5;
                                    zs33 = zs36;
                                    bt33 = bt36;
                                } else {
                                    yt22.Y();
                                    tg73 = tg7;
                                    gs215 = gs23;
                                    gs214 = gs24;
                                    gs213 = gs25;
                                    m783 = m78;
                                    bt33 = bt3;
                                    zs33 = zs3;
                                    z11 = z4;
                                    i29 = i;
                                    i46 = i2;
                                    pq63 = pq6;
                                    yd73 = yd7;
                                    z13 = z5;
                                    gs216 = gs27;
                                    z12 = z6;
                                    gs217 = gs26;
                                    z14 = z3;
                                }
                                yt22.s();
                                yt22.e0(1310000147);
                                Object Q = yt22.Q();
                                if (Q == ay0.a) {
                                    Q = b81.e(yt22);
                                }
                                ap4 ap4 = (ap4) Q;
                                boolean z20 = false;
                                yt22.r(false);
                                yt22.e0(1981926178);
                                long b2 = tg73.b();
                                if (b2 == 16) {
                                    boolean booleanValue = ((Boolean) rc9.z(ap4, yt22, 0).getValue()).booleanValue();
                                    if (!z13) {
                                        j = yd73.c;
                                    } else if (z14) {
                                        j = yd73.d;
                                    } else if (booleanValue) {
                                        j = yd73.a;
                                    } else {
                                        j = yd73.b;
                                    }
                                    b2 = j;
                                    z20 = false;
                                }
                                yt22.r(z20);
                                int i48 = i29;
                                t49.c(og7.a.a(yd73.k), su0.J(1874034984, new x85(ml4, gs217, z14, yd73, str2, vr22, z13, z12, tg73.d(new tg7(b2, 0, (am2) null, 0, (l57) null, 0, 0, (dk5) null, (m64) null, 16777214)), bt33, zs33, z11, i48, i46, m783, ap4, gs216, gs215, gs214, gs213, pq63), yt22), yt22, 56);
                                tg72 = tg73;
                                gs212 = gs217;
                                z8 = z14;
                                z10 = z13;
                                z9 = z12;
                                bt32 = bt33;
                                zs32 = zs33;
                                z7 = z11;
                                i28 = i48;
                                i27 = i46;
                                m782 = m783;
                                gs211 = gs216;
                                gs210 = gs215;
                                gs28 = gs213;
                                pq62 = pq63;
                                yd72 = yd73;
                                gs29 = gs214;
                            } else {
                                yt22.Y();
                                tg72 = tg7;
                                gs29 = gs24;
                                gs28 = gs25;
                                z8 = z3;
                                m782 = m78;
                                zs32 = zs3;
                                z7 = z4;
                                i28 = i;
                                i27 = i2;
                                pq62 = pq6;
                                yd72 = yd7;
                                z10 = z5;
                                z9 = z6;
                                gs212 = gs26;
                                gs211 = gs27;
                                gs210 = gs23;
                                bt32 = bt3;
                            }
                            v = yt22.v();
                            if (v != null) {
                                v.d = new y85(str, vr2, ml4, z10, z9, tg72, gs212, gs211, gs210, gs29, gs28, z8, m782, bt32, zs32, z7, i28, i27, pq62, yd72, i3, i4, i5, i6);
                                return;
                            }
                            return;
                        }
                    }
                    m78 m785 = m78;
                    i22 = i34 & 32768;
                    if (i22 != 0) {
                    }
                    i23 = i34 & 65536;
                    if (i23 != 0) {
                    }
                    i24 = i34 & 131072;
                    if (i24 != 0) {
                    }
                    if ((i32 & 100663296) == 0) {
                    }
                    i25 = i34 & 524288;
                    if (i25 != 0) {
                    }
                    i26 = i33 | 6;
                    if ((i33 & 48) == 0) {
                    }
                    if ((i33 & 384) == 0) {
                    }
                    int i462 = 1;
                    if (yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 306783379) == 306783378 || (i26 & 147) == 146)) {
                    }
                    v = yt22.v();
                    if (v != null) {
                    }
                }
                i13 = i12;
                gs2 gs224 = gs24;
                int i412 = i32 | 54;
                i14 = i34 & 4096;
                if (i14 == 0) {
                }
                i17 = i7;
                i18 = i34 & 8192;
                if (i18 == 0) {
                }
                int i432 = i18;
                i20 = i34 & 16384;
                if (i20 == 0) {
                }
                m78 m7852 = m78;
                i22 = i34 & 32768;
                if (i22 != 0) {
                }
                i23 = i34 & 65536;
                if (i23 != 0) {
                }
                i24 = i34 & 131072;
                if (i24 != 0) {
                }
                if ((i32 & 100663296) == 0) {
                }
                i25 = i34 & 524288;
                if (i25 != 0) {
                }
                i26 = i33 | 6;
                if ((i33 & 48) == 0) {
                }
                if ((i33 & 384) == 0) {
                }
                int i4622 = 1;
                if (yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 306783379) == 306783378 || (i26 & 147) == 146)) {
                }
                v = yt22.v();
                if (v != null) {
                }
            }
            z6 = z2;
            if ((i31 & 196608) == 0) {
            }
            i9 = i34 & 64;
            int i372 = 1048576;
            if (i9 != 0) {
            }
            i10 = i34 & 128;
            int i382 = 8388608;
            if (i10 != 0) {
            }
            i11 = i34 & 256;
            if (i11 != 0) {
            }
            i12 = i34 & 512;
            int i402 = 268435456;
            if (i12 != 0) {
            }
            i13 = i12;
            gs2 gs2242 = gs24;
            int i4122 = i32 | 54;
            i14 = i34 & 4096;
            if (i14 == 0) {
            }
            i17 = i7;
            i18 = i34 & 8192;
            if (i18 == 0) {
            }
            int i4322 = i18;
            i20 = i34 & 16384;
            if (i20 == 0) {
            }
            m78 m78522 = m78;
            i22 = i34 & 32768;
            if (i22 != 0) {
            }
            i23 = i34 & 65536;
            if (i23 != 0) {
            }
            i24 = i34 & 131072;
            if (i24 != 0) {
            }
            if ((i32 & 100663296) == 0) {
            }
            i25 = i34 & 524288;
            if (i25 != 0) {
            }
            i26 = i33 | 6;
            if ((i33 & 48) == 0) {
            }
            if ((i33 & 384) == 0) {
            }
            int i46222 = 1;
            if (yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 306783379) == 306783378 || (i26 & 147) == 146)) {
            }
            v = yt22.v();
            if (v != null) {
            }
        }
        z5 = z;
        i8 = i34 & 16;
        int i362 = 8192;
        if (i8 == 0) {
        }
        z6 = z2;
        if ((i31 & 196608) == 0) {
        }
        i9 = i34 & 64;
        int i3722 = 1048576;
        if (i9 != 0) {
        }
        i10 = i34 & 128;
        int i3822 = 8388608;
        if (i10 != 0) {
        }
        i11 = i34 & 256;
        if (i11 != 0) {
        }
        i12 = i34 & 512;
        int i4022 = 268435456;
        if (i12 != 0) {
        }
        i13 = i12;
        gs2 gs22422 = gs24;
        int i41222 = i32 | 54;
        i14 = i34 & 4096;
        if (i14 == 0) {
        }
        i17 = i7;
        i18 = i34 & 8192;
        if (i18 == 0) {
        }
        int i43222 = i18;
        i20 = i34 & 16384;
        if (i20 == 0) {
        }
        m78 m785222 = m78;
        i22 = i34 & 32768;
        if (i22 != 0) {
        }
        i23 = i34 & 65536;
        if (i23 != 0) {
        }
        i24 = i34 & 131072;
        if (i24 != 0) {
        }
        if ((i32 & 100663296) == 0) {
        }
        i25 = i34 & 524288;
        if (i25 != 0) {
        }
        i26 = i33 | 6;
        if ((i33 & 48) == 0) {
        }
        if ((i33 & 384) == 0) {
        }
        int i462222 = 1;
        if (yt22.V(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 306783379) == 306783378 || (i26 & 147) == 146)) {
        }
        v = yt22.v();
        if (v != null) {
        }
    }

    public static final ly5 c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ly5(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void d(wc7 wc7, Context context, boolean z, String str, long j) {
        wc7 wc72 = wc7;
        if (!lg7.c(j) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            Context context2 = context;
            List list = (List) b96.r.y(context2);
            if (!list.isEmpty()) {
                lp4 lp4 = wc72.a;
                lp4 lp42 = wc72.a;
                ld7 ld7 = ld7.b;
                lp4.a(ld7);
                int size = list.size();
                int i = 0;
                while (i < size) {
                    ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    lp42.a(new hd7(new ip5(i), resolveInfo.loadLabel(packageManager).toString(), 0, new jp5(context2, resolveInfo, z, str, j)));
                    i++;
                    context2 = context;
                }
                lp42.a(ld7);
            }
        }
    }

    public static float e(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < 0.0f) {
            return -f7;
        }
        return f7;
    }

    public static final zr3 g(Collection collection, z53 z53) {
        Iterable<Object> iterable = collection;
        ArrayList u0 = dt0.u0((Collection) iterable);
        ArrayList arrayList = new ArrayList(et0.e0(u0, 10));
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            arrayList.add(q(it.next(), z53));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((zr3) next).getDescriptor().a())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(et0.e0(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((zr3) it3.next()).getDescriptor().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        zr3 zr3 = (zr3) dt0.S0(arrayList2);
        if (zr3 == null) {
            zr3 = t47.a;
        }
        if (!zr3.getDescriptor().c() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
            for (Object obj : iterable) {
                if (obj == null) {
                    return hj8.x(zr3);
                }
            }
        }
        return zr3;
    }

    public static final id8 h(be8 be8) {
        be8.getClass();
        return new id8(be8.a, be8.t);
    }

    public static final float i(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int j(String str, Bundle bundle) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        i95.x(str);
        throw null;
    }

    public static final ViewParent k(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Bundle l(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        i95.x(str);
        throw null;
    }

    public static final ArrayList m(String str, Bundle bundle) {
        ArrayList arrayList;
        Class u = kl8.u(b26.a.b(Bundle.class));
        if (Build.VERSION.SDK_INT >= 34) {
            arrayList = y4.d(bundle, str, u);
        } else {
            arrayList = bundle.getParcelableArrayList(str);
        }
        if (arrayList != null) {
            return arrayList;
        }
        i95.x(str);
        throw null;
    }

    public static final int n(zf7 zf7, Layout layout, o9 o9Var, int i, RectF rectF, si6 si6, yg ygVar, boolean z) {
        boolean z2;
        gy3[] gy3Arr;
        pe3 pe3;
        float f;
        float f2;
        gy3[] gy3Arr2;
        int i2;
        int f3;
        float f4;
        float f5;
        int i3;
        int e;
        float f6;
        float f7;
        int i4;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float f8;
        float f9;
        float a2;
        zf7 zf72 = zf7;
        Layout layout2 = layout;
        o9 o9Var2 = o9Var;
        int i5 = i;
        RectF rectF2 = rectF;
        si6 si62 = si6;
        yg ygVar2 = ygVar;
        int lineTop = layout2.getLineTop(i5);
        int lineBottom = layout2.getLineBottom(i5);
        int lineStart = layout2.getLineStart(i5);
        int lineEnd = layout2.getLineEnd(i5);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout3 = zf72.f;
        int lineStart2 = layout3.getLineStart(i5);
        int f10 = zf72.f(i5);
        if (i6 < (f10 - lineStart2) * 2) {
            zb3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        i23 i23 = new i23(zf72);
        boolean z5 = false;
        if (layout3.getParagraphDirection(i5) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i7 = 0;
        while (lineStart2 < f10) {
            boolean isRtlCharAt = layout3.isRtlCharAt(lineStart2);
            if (z2 && !isRtlCharAt) {
                f8 = i23.a(lineStart2, z5, z5, true);
                f9 = i23.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (!z2 || !isRtlCharAt) {
                z4 = z2;
                if (isRtlCharAt) {
                    a2 = i23.a(lineStart2, false, false, true);
                    f8 = i23.a(lineStart2 + 1, true, true, true);
                } else {
                    f8 = i23.a(lineStart2, false, false, false);
                    a2 = i23.a(lineStart2 + 1, true, true, false);
                }
                f9 = a2;
            } else {
                z4 = z2;
                f9 = i23.a(lineStart2, false, false, false);
                f8 = i23.a(lineStart2 + 1, true, true, false);
            }
            fArr[i7] = f8;
            fArr[i7 + 1] = f9;
            i7 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout4 = (Layout) o9Var2.x;
        int lineStart3 = layout4.getLineStart(i5);
        int lineEnd2 = layout4.getLineEnd(i5);
        int A = o9Var2.A(lineStart3, false);
        int B = o9Var2.B(A);
        int i8 = lineStart3 - B;
        int i9 = lineEnd2 - B;
        Bidi j = o9Var2.j(A);
        if (j == null || (createLineBidi = j.createLineBidi(i8, i9)) == null) {
            gy3Arr = new gy3[]{new gy3(lineStart3, lineEnd2, layout4.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            gy3Arr = new gy3[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int runStart = createLineBidi.getRunStart(i10) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i10) + lineStart3;
                int i11 = runCount;
                if (createLineBidi.getRunLevel(i10) % 2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gy3Arr[i10] = new gy3(runStart, runLimit, z3);
                i10++;
                runCount = i11;
            }
        }
        if (z) {
            pe3 = new pe3(0, gy3Arr.length - 1, 1);
        } else {
            pe3 = new pe3(gy3Arr.length - 1, 0, -1);
        }
        int i12 = pe3.w;
        int i13 = pe3.x;
        int i14 = pe3.y;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            gy3 gy3 = gy3Arr[i12];
            boolean z6 = gy3.c;
            int i15 = gy3.a;
            int i16 = gy3.b;
            if (z6) {
                f = fArr[((i16 - 1) - lineStart) * 2];
            } else {
                f = fArr[(i15 - lineStart) * 2];
            }
            if (z6) {
                f2 = i(i15, lineStart, fArr);
            } else {
                f2 = i(i16 - 1, lineStart, fArr);
            }
            float f11 = rectF2.left;
            int i17 = i14;
            if (z) {
                if (f2 >= f11) {
                    float f12 = rectF2.right;
                    if (f <= f12) {
                        if ((z6 || f11 > f) && (!z6 || f12 < f2)) {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i4 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i4 + i19) / 2;
                                float f13 = fArr[(i20 - lineStart) * 2];
                                int i21 = i20;
                                if ((z6 || f13 <= rectF2.left) && (!z6 || f13 >= rectF2.right)) {
                                    i18 = i4;
                                    i19 = i21;
                                } else {
                                    i18 = i21;
                                }
                            }
                            if (z6) {
                                i3 = i4;
                            } else {
                                i3 = i19;
                            }
                        } else {
                            i3 = i15;
                        }
                        int f14 = si62.f(i3);
                        if (f14 != -1 && (e = si62.e(f14)) < i16) {
                            if (e >= i15) {
                                i15 = e;
                            }
                            if (f14 > i16) {
                                f14 = i16;
                            }
                            gy3Arr2 = gy3Arr;
                            RectF rectF3 = new RectF(0.0f, (float) lineTop, 0.0f, (float) lineBottom);
                            int i22 = f14;
                            while (true) {
                                if (z6) {
                                    f6 = fArr[((i22 - 1) - lineStart) * 2];
                                } else {
                                    f6 = fArr[(i15 - lineStart) * 2];
                                }
                                rectF3.left = f6;
                                if (z6) {
                                    f7 = i(i15, lineStart, fArr);
                                } else {
                                    f7 = i(i22 - 1, lineStart, fArr);
                                }
                                rectF3.right = f7;
                                if (((Boolean) ygVar2.H(rectF3, rectF2)).booleanValue()) {
                                    break;
                                }
                                i15 = si62.a(i15);
                                if (i15 == -1 || i15 >= i16) {
                                    break;
                                }
                                i22 = si62.f(i15);
                                if (i22 > i16) {
                                    i22 = i16;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                gy3Arr2 = gy3Arr;
                i15 = -1;
            } else {
                gy3Arr2 = gy3Arr;
                if (f2 >= f11) {
                    float f15 = rectF2.right;
                    if (f <= f15) {
                        if ((z6 || f15 < f2) && (!z6 || f11 > f)) {
                            int i24 = i16;
                            int i25 = i15;
                            while (i24 - i25 > 1) {
                                int i26 = (i24 + i25) / 2;
                                float f16 = fArr[(i26 - lineStart) * 2];
                                int i27 = i24;
                                if ((z6 || f16 <= rectF2.right) && (!z6 || f16 >= rectF2.left)) {
                                    i24 = i27;
                                    i25 = i26;
                                } else {
                                    i24 = i26;
                                }
                            }
                            int i28 = i24;
                            if (z6) {
                                i2 = i28;
                            } else {
                                i2 = i25;
                            }
                        } else {
                            i2 = i16 - 1;
                        }
                        int e2 = si62.e(i2 + 1);
                        if (e2 != -1 && (f3 = si62.f(e2)) > i15) {
                            if (e2 < i15) {
                                e2 = i15;
                            }
                            if (f3 <= i16) {
                                i16 = f3;
                            }
                            RectF rectF4 = new RectF(0.0f, (float) lineTop, 0.0f, (float) lineBottom);
                            int i29 = e2;
                            while (true) {
                                if (z6) {
                                    f4 = fArr[((i16 - 1) - lineStart) * 2];
                                } else {
                                    f4 = fArr[(i29 - lineStart) * 2];
                                }
                                rectF4.left = f4;
                                if (z6) {
                                    f5 = i(i29, lineStart, fArr);
                                } else {
                                    f5 = i(i16 - 1, lineStart, fArr);
                                }
                                rectF4.right = f5;
                                if (((Boolean) ygVar2.H(rectF4, rectF2)).booleanValue()) {
                                    break;
                                }
                                i16 = si62.b(i16);
                                if (i16 == -1 || i16 <= i15) {
                                    break;
                                }
                                i29 = si62.e(i16);
                                if (i29 < i15) {
                                    i29 = i15;
                                }
                            }
                        }
                    }
                }
                i16 = -1;
                i15 = i16;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            gy3Arr = gy3Arr2;
        }
    }

    public static final String o(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        i95.x(str);
        throw null;
    }

    public static final String[] p(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        i95.x(str);
        throw null;
    }

    public static final zr3 q(Object obj, z53 z53) {
        z53.getClass();
        if (obj == null) {
            return hj8.x(t47.a);
        }
        if (obj instanceof List) {
            return new cs(g((Collection) obj, z53), 0);
        }
        if (obj instanceof Object[]) {
            Object X0 = qs.X0((Object[]) obj);
            if (X0 != null) {
                return q(X0, z53);
            }
            return new cs(t47.a, 0);
        } else if (obj instanceof Set) {
            return new cs(g((Collection) obj, z53), 2);
        } else {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new ty2(g(map.keySet(), z53), g(map.values(), z53), 1);
            }
            Class<?> cls = obj.getClass();
            c26 c26 = b26.a;
            c26.b(cls);
            return i95.D(c26.b(obj.getClass()));
        }
    }

    public static int r(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int s(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                return r(b2, bArr[i]);
            }
            if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b2 > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << 16) ^ ((b3 << 8) ^ b2);
            }
            throw new AssertionError();
        } else if (b2 > -12) {
            return -1;
        } else {
            return b2;
        }
    }

    public static final boolean t(String str, Bundle bundle) {
        str.getClass();
        if (!bundle.containsKey(str) || bundle.get(str) != null) {
            return false;
        }
        return true;
    }

    public static int u(byte[] bArr, int i, int i2) {
        while (r8 < i2 && bArr[r8] >= 0) {
            i = r8 + 1;
        }
        if (r8 >= i2) {
            return 0;
        }
        while (r8 < i2) {
            int i3 = r8 + 1;
            byte b2 = bArr[r8];
            if (b2 >= 0) {
                r8 = i3;
            } else if (b2 < -32) {
                if (i3 >= i2) {
                    return b2;
                }
                if (b2 < -62) {
                    return -1;
                }
                r8 += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b2 < -16) {
                if (i3 >= i2 - 1) {
                    return s(bArr, i3, i2);
                }
                int i4 = r8 + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if (b2 == -32 && b3 < -96) {
                    return -1;
                }
                if (b2 == -19 && b3 >= -96) {
                    return -1;
                }
                r8 += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else if (i3 >= i2 - 2) {
                return s(bArr, i3, i2);
            } else {
                int i5 = r8 + 2;
                byte b4 = bArr[i3];
                if (b4 > -65) {
                    return -1;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = r8 + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                r8 += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final Object w(Set set, Enum enumR, Enum enumR2, Enum enumR3, boolean z) {
        Enum enumR4;
        if (z) {
            if (set.contains(enumR)) {
                enumR4 = enumR;
            } else if (set.contains(enumR2)) {
                enumR4 = enumR2;
            } else {
                enumR4 = null;
            }
            if (sg3.e(enumR4, enumR) && sg3.e(enumR3, enumR2)) {
                return null;
            }
            if (enumR3 == null) {
                return enumR4;
            }
            return enumR3;
        }
        if (enumR3 != null) {
            set = dt0.g1(wn6.p(set, enumR3));
        }
        return dt0.R0(set);
    }

    public static final zr3 x(z53 z53, fp7 fp7) {
        zr3 zr3;
        z53.getClass();
        fp7.getClass();
        gq3 gq3 = fp7.a;
        as3 as3 = fp7.b;
        if (as3 != null) {
            if (as3.I().isEmpty()) {
                zr3 = null;
            } else {
                zr3 = w95.k(z53, as3, false);
            }
            if (zr3 != null) {
                return zr3;
            }
        }
        gq3.getClass();
        zr3 D = i95.D(gq3);
        if (as3 == null || !as3.v()) {
            return D;
        }
        return hj8.x(D);
    }

    public abstract Object f();

    public abstract z85 v(String str, vr2 vr2);
}
