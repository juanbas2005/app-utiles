package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: t13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t13 {
    public static final List a = sg3.E("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic");
    public static final o96 b = q96.a(18.0f);
    public static final tg7 c = new tg7(0, 0, (am2) null, 0, (l57) null, 0, 0, new dk5(), new m64(j64.b, 17, 0), 15204351);

    public static final void A(int i, yt2 yt2) {
        boolean z;
        yt2 yt22;
        yt2.g0(-937411239);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i & 1, z)) {
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new nf1(23);
                yt2.o0(Q);
            }
            yt22 = yt2;
            eb.d((sr2) Q, (ml4) null, new wu1(4), rj1.u, yt22, 3462, 2);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new uz1(i, 2);
        }
    }

    public static final void B(sr2 sr2, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        boolean z;
        sr2 sr22;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        yt2.g0(149781886);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            if (yt2.i(sr2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            i3 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt2.i(fw0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            if (i8 != 0) {
                sr2 = null;
            }
            sr2 sr23 = sr2;
            if (sr23 != null) {
                yt2.e0(-318731584);
                we.a(sr23, yu6.a, false, b, rc9.w(z08.f(), yt2, 24576), F(), su0.J(-325241842, new ge0(fw0, 1), yt2), yt2, (i3 & 14) | 100666416);
                sr22 = sr23;
                yt2.r(false);
            } else {
                sr22 = sr23;
                yt2.e0(-318452801);
                we.b(yu6.a, b, rc9.w(z08.f(), yt2, 24576), F(), su0.J(-1081314156, new ge0(fw0, 2), yt2), yt2, 196662, 16);
                yt2.r(false);
            }
            sr2 = sr22;
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new q03(sr2, fw0, i, i7);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: m78} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: m78} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: m78} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: kj6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void C(String str, vr2 vr2, String str2, ml4 ml4, boolean z, boolean z2, m78 m78, gs2 gs2, yt2 yt2, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        m78 m782;
        int i5;
        gs2 gs22;
        int i6;
        int i7;
        boolean z4;
        gs2 gs23;
        m78 m783;
        boolean z5;
        yx5 v;
        boolean z6;
        m78 m784;
        gs2 gs24;
        m78 m785;
        bt3 bt3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str3 = str2;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i13 = i;
        int i14 = i2;
        yt22.g0(1193215631);
        if (yt22.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i3 | i13;
        if ((i13 & 48) == 0) {
            if (yt22.i(vr2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i15 |= i12;
        } else {
            vr2 vr22 = vr2;
        }
        if ((i13 & 384) == 0) {
            if (yt22.g(str3)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i15 |= i11;
        }
        if ((i13 & 3072) == 0) {
            if (yt22.g(ml42)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i15 |= i10;
        }
        int i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            z3 = z;
            if (yt22.h(z3)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i15 |= i9;
            i4 = i14 & 64;
            if (i4 == 0) {
                i15 |= 1572864;
            } else if ((1572864 & i13) == 0) {
                m782 = m78;
                if (yt22.g(m782)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i15 |= i8;
                i5 = i14 & 128;
                if (i5 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    gs22 = gs2;
                    if (yt22.i(gs22)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i15 |= i6;
                    i7 = i15;
                    if ((i7 & 4793491) == 4793490) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!yt22.V(i7 & 1, z4)) {
                        if (i16 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i4 != 0) {
                            m784 = g22.M;
                        } else {
                            m784 = m782;
                        }
                        if (i5 != 0) {
                            gs24 = null;
                        } else {
                            gs24 = gs22;
                        }
                        o96 a2 = q96.a(13.0f);
                        if (z6) {
                            m785 = new Object();
                        } else {
                            m785 = m784;
                        }
                        if (z6 && z2) {
                            bt3 = new bt3(8, 0, 123);
                        } else if (z6) {
                            bt3 = new bt3(7, 0, 121);
                        } else if (z2) {
                            bt3 = new bt3(3, 0, 123);
                        } else {
                            bt3 = bt3.e;
                        }
                        bt3 bt32 = bt3;
                        m78 m786 = m785;
                        gs2 gs25 = gs24;
                        String str4 = str;
                        vr2 vr23 = vr2;
                        bt3 bt33 = bt32;
                        z85.b(str4, vr23, yu6.d(ml42, 56.0f), false, false, (tg7) null, (gs2) null, su0.J(1831823478, new q20(str3, 6), yt22), (gs2) null, gs25, (gs2) null, false, m786, bt33, (zs3) null, true, 0, 0, a2, pe2.t(0, 0, z08.g(), z08.g(), 0, z08.a(), z08.h(), 0, 0, yt22, 2147477455), yt22, (i7 & 14) | 12582912 | (i7 & 112) | ((i7 << 6) & 1879048192), 12582912, 0, 1916280);
                        gs23 = gs25;
                        z5 = z6;
                        m783 = m784;
                    } else {
                        yt2.Y();
                        z5 = z3;
                        m783 = m782;
                        gs23 = gs22;
                    }
                    v = yt2.v();
                    if (v == null) {
                        v.d = new t03(str, vr2, str3, ml42, z5, z2, m783, gs23, i13, i14);
                        return;
                    }
                    return;
                }
                gs22 = gs2;
                i7 = i15;
                if ((i7 & 4793491) == 4793490) {
                }
                if (!yt22.V(i7 & 1, z4)) {
                }
                v = yt2.v();
                if (v == null) {
                }
            }
            m782 = m78;
            i5 = i14 & 128;
            if (i5 != 0) {
            }
            gs22 = gs2;
            i7 = i15;
            if ((i7 & 4793491) == 4793490) {
            }
            if (!yt22.V(i7 & 1, z4)) {
            }
            v = yt2.v();
            if (v == null) {
            }
        }
        z3 = z;
        i4 = i14 & 64;
        if (i4 == 0) {
        }
        m782 = m78;
        i5 = i14 & 128;
        if (i5 != 0) {
        }
        gs22 = gs2;
        i7 = i15;
        if ((i7 & 4793491) == 4793490) {
        }
        if (!yt22.V(i7 & 1, z4)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final Calendar D(String str) {
        Integer v0 = k57.v0(d57.k1(str).toString());
        if (v0 == null) {
            return null;
        }
        int intValue = v0.intValue();
        Calendar instance = Calendar.getInstance();
        instance.add(6, intValue);
        return instance;
    }

    public static final String E(String str) {
        Integer v0 = k57.v0(d57.k1(str).toString());
        if (v0 == null) {
            return str;
        }
        int intValue = v0.intValue();
        Calendar instance = Calendar.getInstance();
        instance.add(6, intValue);
        String format = new SimpleDateFormat("d MMM", Locale.getDefault()).format(instance.getTime());
        format.getClass();
        return d57.l1(format, '.');
    }

    public static final ql0 F() {
        return rc9.x(62, 2.0f);
    }

    public static final Calendar G(String str, Calendar calendar) {
        Integer v0;
        List W0 = d57.W0(d57.k1(str).toString(), new String[]{" "}, 6);
        if (W0.size() != 2 || (v0 = k57.v0((String) W0.get(0))) == null) {
            return null;
        }
        int intValue = v0.intValue();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = ((String) W0.get(1)).toLowerCase(locale);
        lowerCase.getClass();
        int indexOf = a.indexOf(lowerCase);
        if (indexOf < 0) {
            return null;
        }
        int i = calendar.get(1);
        if (indexOf < calendar.get(2) || (indexOf == calendar.get(2) && intValue < calendar.get(5))) {
            i++;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, indexOf);
        instance.set(5, intValue);
        return instance;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, x83 x83, long j, long j2, hl7 hl7, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        hl7 hl72;
        int i8;
        int i9;
        sr2 sr24;
        int i10;
        boolean z;
        sr2 sr25;
        yx5 v;
        sr2 sr26;
        int i11;
        int i12;
        sr2 sr27 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-734441101);
        if (yt22.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i | i3;
        String str3 = str2;
        if (yt22.g(str3)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        x83 x832 = x83;
        if (yt22.g(x832)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        long j3 = j;
        if (yt22.f(j3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        long j4 = j2;
        if (yt22.f(j4)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if ((i & 196608) == 0) {
            hl72 = hl7;
            if (yt22.g(hl72)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i17 |= i12;
        } else {
            hl72 = hl7;
        }
        if (yt22.i(sr27)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (yt22.i(sr22)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        int i20 = i2 & 256;
        if (i20 != 0) {
            i19 |= 100663296;
        } else if ((i & 100663296) == 0) {
            sr24 = sr23;
            if (yt22.i(sr24)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i19 |= i11;
            i10 = i19;
            if ((38347923 & i19) == 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i10 & 1, z)) {
                if (i20 != 0) {
                    sr26 = null;
                } else {
                    sr26 = sr24;
                }
                B(sr27, su0.J(-1384698075, new k13(x832, j3, j4, hl72, sr22, sr26, str, str3), yt22), yt22, ((i10 >> 18) & 14) | 48, 0);
                sr25 = sr26;
            } else {
                yt22.Y();
                sr25 = sr24;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new l13(str, str2, x83, j, j2, hl7, sr27, sr22, sr25, i, i2);
                return;
            }
            return;
        }
        sr24 = sr23;
        i10 = i19;
        if ((38347923 & i19) == 38347922) {
        }
        if (!yt22.V(i10 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final void b(List list, sr2 sr2, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        List list2 = list;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(776579905);
        if (yt22.g(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(vr22)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            sr2 sr22 = sr2;
            su0.a(sr22, rj1.q, (ml4) null, su0.J(451306891, new ce4(11, sr22), yt22), (gs2) null, rj1.s, su0.J(-998191218, new z03(list2, vr22), yt22), (pq6) null, 0, 0, 0, 0, (wu1) null, yt22, 1772598, 16276);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 18, list2, sr2, vr22);
        }
    }

    public static final void c(o03 o03, vr2 vr2, vr2 vr22, sr2 sr2, vr2 vr23, sr2 sr22, yt2 yt2, int i) {
        int i2;
        String str;
        String l;
        String u;
        String str2;
        boolean z;
        String str3;
        String l2;
        long j;
        boolean z2;
        o03 o032 = o03;
        vr2 vr24 = vr2;
        vr2 vr25 = vr22;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.g0(-712790915);
        if ((i3 & 6) == 0) {
            i2 = (yt22.g(o032) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 48) == 0) {
            i2 |= yt22.i(vr24) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i2 |= yt22.i(vr25) ? 256 : 128;
        }
        sr2 sr23 = sr22;
        if ((196608 & i3) == 0) {
            i2 |= yt22.i(sr23) ? 131072 : 65536;
        }
        int i4 = i2;
        if (yt22.V(i4 & 1, (65683 & i4) != 65682)) {
            String str4 = o032.a;
            String str5 = o032.a;
            String str6 = o032.m;
            String str7 = o032.i;
            String str8 = o032.d;
            g40 g40 = o032.I;
            String str9 = o032.B;
            String str10 = o032.o;
            String str11 = o032.k;
            if (str4.length() > 0) {
                yt22.e0(-2092259151);
                l = l55.v(R.string.vence_date, new Object[]{o032.g}, yt22);
                yt22.r(false);
                str = str5;
            } else {
                str = str5;
                l = hl6.l(yt22, -2092256955, R.string.available_label, yt22, false);
            }
            String str12 = l;
            int ordinal = g40.ordinal();
            String str13 = "";
            String str14 = str12;
            if (ordinal == 0) {
                String str15 = str7;
                yt22.e0(-435142319);
                u = l55.u(R.string.bonus_label, yt22);
                if (str15.length() > 0) {
                    str2 = "∞";
                } else if (str11.length() > 0 && str10.length() > 0) {
                    str2 = "$" + str10 + " · " + str11;
                } else if (str11.length() > 0) {
                    if (str6.length() > 0) {
                        str13 = f21.h(" + ", str6, " LTE");
                    }
                    str2 = b81.n(str11, str13);
                } else if (str10.length() > 0) {
                    str2 = b81.y("$", str10);
                } else {
                    str2 = o032.b;
                }
                if (str15.length() > 0) {
                    yt22.e0(-2092226887);
                    l2 = l55.v(R.string.vence_date, new Object[]{o032.j}, yt22);
                    z = false;
                    yt22.r(false);
                } else {
                    z = false;
                    if (str11.length() > 0) {
                        yt22.e0(-2092223369);
                        l2 = l55.v(R.string.vence_date, new Object[]{o032.l}, yt22);
                        yt22.r(false);
                    } else if (str10.length() > 0) {
                        yt22.e0(-2092220012);
                        l2 = l55.v(R.string.vence_date, new Object[]{o032.p}, yt22);
                        yt22.r(false);
                    } else {
                        l2 = hl6.l(yt22, -2092217467, R.string.available_label, yt22, false);
                    }
                }
                yt22.r(z);
            } else if (ordinal == 1) {
                yt22.e0(-434130169);
                u = l55.u(R.string.data_label, yt22);
                String str16 = o032.c;
                if (str8.length() > 0) {
                    str13 = f21.h(" + ", str8, " LTE");
                }
                str2 = b81.n(str16, str13);
                str3 = l55.v(R.string.vence_date, new Object[]{E(o032.s)}, yt22);
                yt22.r(false);
            } else if (ordinal == 2) {
                yt22.e0(-433814961);
                u = l55.u(R.string.sms_label, yt22);
                str2 = o032.A;
                if (str9.length() <= 0 || sg3.e(str9, "--")) {
                    z2 = false;
                    str3 = hl6.l(yt22, -433534659, R.string.available_label, yt22, false);
                } else {
                    yt22.e0(-433637982);
                    str3 = l55.v(R.string.vence_date, new Object[]{E(str9)}, yt22);
                    z2 = false;
                    yt22.r(false);
                }
                yt22.r(z2);
            } else if (ordinal == 3) {
                yt22.e0(-433420238);
                u = l55.u(R.string.voice_label, yt22);
                str2 = o032.e;
                str3 = l55.v(R.string.vence_date, new Object[]{E(o032.z)}, yt22);
                yt22.r(false);
            } else {
                yt22.e0(-2092247818);
                yt22.r(false);
                h.c();
                return;
            }
            String str17 = str2;
            String str18 = str3;
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p(Boolean.FALSE);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == obj) {
                Q2 = u55.p(Boolean.FALSE);
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == obj) {
                Q3 = u55.p(Boolean.FALSE);
                yt22.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(-432305788);
                boolean z3 = o032.H;
                Object Q4 = yt22.Q();
                if (Q4 == obj) {
                    Q4 = new vo2(aq4, 6);
                    yt22.o0(Q4);
                }
                z(z3, vr24, (sr2) Q4, yt22, (i4 & 112) | 384);
                yt22.r(false);
            } else {
                yt22.e0(-432120315);
                yt22.r(false);
            }
            if (((Boolean) aq42.getValue()).booleanValue()) {
                yt22.e0(-432078558);
                boolean z4 = (i4 & 896) == 256;
                Object Q5 = yt22.Q();
                if (z4 || Q5 == obj) {
                    Q5 = new no2(vr25, aq42, 3);
                    yt22.o0(Q5);
                }
                vr2 vr26 = (vr2) Q5;
                Object Q6 = yt22.Q();
                if (Q6 == obj) {
                    Q6 = new vo2(aq42, 7);
                    yt22.o0(Q6);
                }
                e(g40, vr26, (sr2) Q6, yt22, 384);
                yt22.r(false);
            } else {
                yt22.e0(-431798907);
                yt22.r(false);
            }
            if (((Boolean) aq43.getValue()).booleanValue()) {
                yt22.e0(-431759041);
                Object Q7 = yt22.Q();
                if (Q7 == obj) {
                    Q7 = new vo2(aq43, 8);
                    yt22.o0(Q7);
                }
                i(o032, (sr2) Q7, yt22, (i4 & 14) | 48);
                yt22.r(false);
            } else {
                yt22.e0(-431630267);
                yt22.r(false);
            }
            if (str.length() > 9 || str17.length() > 9) {
                j = ya5.k(20);
            } else if (str.length() > 7 || str17.length() > 7) {
                j = ya5.k(24);
            } else {
                j = ya5.k(28);
            }
            ml4 K = x91.K(b96.g(we.f(yu6.a, q96.a(22.0f)), b18.a), 10.0f);
            lh4 d = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, K);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            String str19 = u;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, d);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            int i5 = i4;
            jl4 jl4 = jl4.w;
            ml4 K2 = x91.K(jl4, 8.0f);
            aq4 aq44 = aq4;
            g80 g80 = xb4.K;
            long j2 = j;
            sr srVar = wr.c;
            au0 a2 = zt0.a(srVar, g80, yt22, 0);
            Object obj2 = obj;
            aq4 aq45 = aq42;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, K2);
            yt22.i0();
            aq4 aq46 = aq43;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a2);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            ea6 a3 = ca6.a(wr.a, xb4.H, yt22, 0);
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E3 = gw8.E(yt22, jl4);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E3);
            String u2 = l55.u(R.string.balance_label, yt22);
            String str20 = o032.a;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            vy0 vy02 = vy0;
            ck ckVar5 = ckVar4;
            aq4 aq47 = aq44;
            aq4 aq48 = aq45;
            aq4 aq49 = aq46;
            Object obj3 = obj2;
            yt2 yt23 = yt2;
            ck ckVar6 = ckVar2;
            long j3 = j2;
            ce ceVar2 = ceVar;
            ck ckVar7 = ckVar3;
            long j4 = j3;
            d(u2, str20, str14, new lz3(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j4, 0, yt23, 0, 32);
            yt2 yt24 = yt23;
            g80 g802 = xb4.L;
            ml4 p = yu6.p(jl4, 15.0f);
            au0 a4 = zt0.a(srVar, g802, yt24, 48);
            int hashCode4 = Long.hashCode(yt24.T);
            vf5 m4 = yt24.m();
            ml4 E4 = gw8.E(yt24, p);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a4);
            g75.Q(ckVar6, yt24, m4);
            ck ckVar8 = ckVar7;
            f21.s(hashCode4, yt24, ckVar8, yt24, ceVar2);
            g75.Q(ckVar5, yt24, E4);
            ml4 d2 = yu6.d(yu6.p(jl4, 1.0f), 55.0f);
            int i6 = jt0.h;
            long j5 = jt0.c;
            mb0.a(b96.h(d2, jt0.b(0.25f, j5), gr8.h), yt24, 6);
            yt24.r(true);
            g80 g803 = g802;
            float f = 1.0f;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            g80 g804 = g803;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            long j6 = j5;
            yt2 yt25 = yt2;
            ck ckVar9 = ckVar8;
            g80 g805 = g804;
            d(str19, str17, str18, new lz3(f, true), j4, 10, yt25, 196608, 0);
            yt2 yt26 = yt25;
            yt26.r(true);
            int i7 = i5;
            ck ckVar10 = ckVar5;
            ck ckVar11 = ckVar6;
            ce ceVar3 = ceVar2;
            jl4 jl42 = jl4;
            yt2 yt27 = yt2;
            yf7.b(l55.v(R.string.national_balance, new Object[]{o03.h}, yt26), (ml4) null, jt0.b(0.82f, j6), ya5.k(12), am2.B, (ea7) null, ya5.j(1.2d), (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 102261120, 0, 261802);
            yt22 = yt27;
            yt22.r(true);
            ml4 d3 = qb0.a.a(jl42, xb4.A).d(yu6.b);
            au0 a5 = zt0.a(wr.g, g805, yt22, 54);
            int hashCode5 = Long.hashCode(yt22.T);
            vf5 m5 = yt22.m();
            ml4 E5 = gw8.E(yt22, d3);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy02);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a5);
            g75.Q(ckVar11, yt22, m5);
            f21.s(hashCode5, yt22, ckVar9, yt22, ceVar3);
            g75.Q(ckVar10, yt22, E5);
            Object Q8 = yt22.Q();
            Object obj4 = obj3;
            if (Q8 == obj4) {
                Q8 = new vo2(aq47, 9);
                yt22.o0(Q8);
            }
            hj8.e((sr2) Q8, yu6.l(jl42, 24.0f), false, (a83) null, (pq6) null, rj1.b, yt22, 1572918, 60);
            k75.a(yt22, yu6.d(jl42, 5.0f));
            Object Q9 = yt22.Q();
            if (Q9 == obj4) {
                Q9 = new vo2(aq48, 10);
                yt22.o0(Q9);
            }
            hj8.e((sr2) Q9, yu6.l(jl42, 24.0f), false, (a83) null, (pq6) null, rj1.c, yt22, 1572918, 60);
            k75.a(yt22, yu6.d(jl42, 5.0f));
            Object Q10 = yt22.Q();
            if (Q10 == obj4) {
                Q10 = new vo2(aq49, 11);
                yt22.o0(Q10);
            }
            hj8.e((sr2) Q10, yu6.l(jl42, 24.0f), false, (a83) null, (pq6) null, rj1.d, yt22, 1572918, 60);
            k75.a(yt22, yu6.d(jl42, 5.0f));
            hj8.e(sr22, yu6.l(jl42, 24.0f), false, (a83) null, (pq6) null, rj1.e, yt22, ((i7 >> 15) & 14) | 1572912, 60);
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0((Object) o03, (Object) vr2, (Object) vr22, (ds2) sr2, (Object) vr23, (ds2) sr22, i, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void d(String str, String str2, String str3, ml4 ml4, long j, int i, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        yx5 v;
        int i13;
        yt2 yt22 = yt2;
        yt22.g0(1682037513);
        if (yt22.g(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i14 = i2 | i4;
        if (yt22.g(str2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i15 = i14 | i5;
        if (yt22.g(str3)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i16 = i15 | i6;
        if (yt22.g(ml4)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i17 = i16 | i7;
        if (yt22.f(j)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i18 = i17 | i8;
        int i19 = i3 & 32;
        if (i19 != 0) {
            i18 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i9 = i;
            if (yt22.e(i9)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i18 |= i10;
            i11 = i18;
            if ((i11 & 74899) == 74898) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i11 & 1, z)) {
                if (i19 != 0) {
                    i13 = 0;
                } else {
                    i13 = i9;
                }
                ml4 O = x91.O(ml4, 0.0f, 0.0f, (float) i13, 0.0f, 11);
                au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, O);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, a2);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                long j2 = jt0.c;
                long b2 = jt0.b(0.82f, j2);
                long k = ya5.k(12);
                am2 am2 = am2.B;
                yt2 yt23 = yt22;
                yf7.b(str, (ml4) null, b2, k, am2, (ea7) null, ya5.j(1.2d), (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i11 & 14) | 102261120, 0, 261802);
                yt2 yt24 = yt2;
                long j3 = j2;
                yf7.b(str2, (ml4) null, j3, j, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 1, 0, (tg7) null, yt24, ((i11 >> 3) & 14) | 1573248 | (i11 & 57344), 24576, 245674);
                yf7.b(str3, (ml4) null, jt0.b(0.8f, j3), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, ((i11 >> 6) & 14) | 24960, 0, 262122);
                yt22 = yt24;
                yt22.r(true);
                i12 = i13;
            } else {
                yt22.Y();
                i12 = i9;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new o13(str, str2, str3, ml4, j, i12, i2, i3);
                return;
            }
            return;
        }
        i9 = i;
        i11 = i18;
        if ((i11 & 74899) == 74898) {
        }
        if (!yt22.V(i11 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final void e(g40 g40, vr2 vr2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-305589074);
        if (yt22.e(g40.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(vr22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            sr2 sr22 = sr2;
            su0.a(sr22, su0.J(818306294, new ce4(14, sr22), yt22), (ml4) null, (gs2) null, rj1.g, rj1.h, su0.J(139791163, new p13(0, (Object) vr22, (Object) g40), yt22), (pq6) null, 0, 0, 0, 0, (wu1) null, yt22, 1794102, 16268);
        } else {
            g40 g402 = g40;
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 20, g40, vr22, sr2);
        }
    }

    public static final void f(int i, sr2 sr2, gs2 gs2, yt2 yt2) {
        int i2;
        boolean z;
        boolean z2;
        int i3 = i;
        sr2 sr22 = sr2;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        yt22.g0(-1190885607);
        if (yt22.i(gs22)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = u55.p("");
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = u55.p("");
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            if (((String) aq4.getValue()).length() == 4 && ((String) aq42.getValue()).length() == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            aq4 aq43 = aq4;
            aq4 aq44 = aq42;
            su0.a(sr22, su0.J(90035153, new ai0((Object) gs22, z2, (Object) aq43, (Object) aq44, 2), yt22), (ml4) null, su0.J(378854543, new ce4(10, sr22), yt22), (gs2) null, rj1.p, su0.J(812083628, new o20(aq43, aq44, 1), yt22), (pq6) null, 0, 0, 0, 0, (wu1) null, yt2, 1772598, 16276);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p20(sr22, gs2, i3);
        }
    }

    public static final void g(String str, String str2, x83 x83, long j, long j2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        yt2 yt22 = yt2;
        yt22.g0(1540833740);
        if (yt22.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (yt22.g(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        x83 x832 = x83;
        if (yt22.g(x832)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        long j3 = j;
        if (yt22.f(j3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (yt22.f(j2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i11 & 1, z)) {
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int i12 = i11;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ce ceVar2 = ceVar;
            ck ckVar5 = ckVar3;
            ck ckVar6 = ckVar2;
            q(x832, j3, j2, 0, yt22, (i12 >> 6) & 1022, 8);
            k75.a(yt22, yu6.p(jl4, 15.0f));
            au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, jl4);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar6, yt22, m2);
            f21.s(hashCode2, yt22, ckVar5, yt22, ceVar2);
            g75.Q(ckVar4, yt22, E2);
            yt2 yt23 = yt2;
            String str3 = str;
            yf7.b(str3, (ml4) null, z08.k(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i12 & 14) | 1597440, 0, 262058);
            String str4 = str2;
            yf7.b(str4, (ml4) null, z08.e(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, ((i12 >> 3) & 14) | 24576, 0, 262122);
            yt22 = yt23;
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new s03(str, str2, x83, j, j2, i);
        }
    }

    public static final void h(long j, boolean z, yd ydVar, yd ydVar2, sr2 sr2, ml4 ml4, yt2 yt2, int i) {
        int i2;
        aq4 aq4;
        boolean z2;
        boolean z3;
        int i3;
        long j2 = j;
        boolean z4 = z;
        yd ydVar3 = ydVar;
        yd ydVar4 = ydVar2;
        sr2 sr22 = sr2;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(90413319);
        if ((i4 & 6) == 0) {
            i2 = (yt22.f(j2) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 48) == 0) {
            i2 |= yt22.h(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i2 |= yt22.i(ydVar3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i2 |= yt22.i(ydVar4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i2 |= yt22.i(sr22) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i2 |= yt22.g(ml42) ? 131072 : 65536;
        }
        if (yt22.V(i2 & 1, (74899 & i2) != 74898)) {
            Context context = (Context) yt22.k(ye.b);
            hj hjVar = (hj) yt22.k(xy0.t);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p(Boolean.FALSE);
                yt22.o0(Q);
            }
            aq4 aq42 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == obj) {
                Q2 = u55.p(new l35(0));
                yt22.o0(Q2);
            }
            aq4 aq43 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == obj) {
                Q3 = u55.p(new we3(0));
                yt22.o0(Q3);
            }
            aq4 aq44 = (aq4) Q3;
            x83 x83 = mp7.K;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.LteMobiledata", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i5 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 be5 = new be5();
                be5.j(6.0f, 14.0f);
                be5.g(2.0f);
                be5 be52 = be5;
                be52.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be5 be53 = be52;
                be53.n(0.0f);
                be52.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                be53.f(5.0f);
                be52.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                be53.m(9.0f);
                be52.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                be53.g(0.0f);
                be52.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be53.m(14.0f);
                be53.c();
                be53.j(10.0f, 10.0f);
                be53.g(1.0f);
                be53.n(5.0f);
                be52.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be53.g(0.0f);
                be52.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be53.n(-5.0f);
                be53.g(1.0f);
                be52.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be53.n(0.0f);
                be52.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be53.g(-4.0f);
                be52.d(9.45f, 8.0f, 9.0f, 8.45f, 9.0f, 9.0f);
                be53.n(0.0f);
                be52.d(9.0f, 9.55f, 9.45f, 10.0f, 10.0f, 10.0f);
                b81.v(be53, 21.0f, 9.0f, 21.0f, 9.0f);
                be52.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be53.g(-3.0f);
                be52.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                be53.n(6.0f);
                be52.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be53.g(3.0f);
                be52.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be53.n(0.0f);
                be52.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be53.g(-2.0f);
                be53.n(-1.0f);
                be53.g(2.0f);
                be52.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be53.n(0.0f);
                be52.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be53.g(-2.0f);
                be53.n(-1.0f);
                be53.g(2.0f);
                be52.d(20.55f, 10.0f, 21.0f, 9.55f, 21.0f, 9.0f);
                be53.c();
                w83.a(w83, be53.a, ky6, 14336);
                x83 = w83.b();
                mp7.K = x83;
            }
            yt2 yt23 = yt2;
            String u = l55.u(R.string.fab_lte, yt23);
            boolean i6 = yt23.i(context);
            Object Q4 = yt23.Q();
            if (i6 || Q4 == obj) {
                Q4 = new n20(context, 9);
                yt23.o0(Q4);
            }
            ta2 ta2 = new ta2(x83, u, (sr2) Q4);
            x83 x832 = ub5.b;
            if (x832 == null) {
                w83 w832 = new w83("Rounded.VpnLock", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i7 = e38.a;
                ky6 ky62 = new ky6(jt0.b);
                be5 e = pb4.e(19.92f, 11.0f);
                e.e(0.44f, 3.63f, -1.52f, 5.85f, -2.02f, 6.39f);
                e.d(17.64f, 16.58f, 16.9f, 16.0f, 16.0f, 16.0f);
                be5 be54 = e;
                be54.g(-1.0f);
                be54.n(-3.0f);
                e.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be54.f(8.0f);
                be54.n(-2.0f);
                be54.g(2.0f);
                e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be54.m(7.0f);
                be54.g(2.0f);
                e.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                be54.m(2.46f);
                e.d(14.05f, 2.16f, 13.05f, 2.0f, 12.0f, 2.0f);
                e.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                be54.l(4.48f, 10.0f, 10.0f, 10.0f);
                e.e(5.73f, 0.0f, 10.51f, -4.86f, 9.95f, -11.0f);
                be54.f(19.92f);
                be54.c();
                be54.j(11.0f, 19.93f);
                e.d(7.05f, 19.44f, 4.0f, 16.08f, 4.0f, 12.0f);
                e.e(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
                be54.h(9.0f, 15.0f);
                be54.n(1.0f);
                e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                be54.m(19.93f);
                be54.c();
                be54.j(22.0f, 4.0f);
                be54.m(3.11f);
                e.e(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
                e.d(19.08f, 0.82f, 18.0f, 1.79f, 18.0f, 3.0f);
                be54.n(1.0f);
                e.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                be54.n(3.0f);
                e.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be54.g(4.0f);
                e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be54.m(5.0f);
                e.d(23.0f, 4.45f, 22.55f, 4.0f, 22.0f, 4.0f);
                be54.c();
                be54.j(21.0f, 4.0f);
                be54.g(-2.0f);
                be54.m(3.0f);
                e.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                be54.l(1.0f, 0.45f, 1.0f, 1.0f);
                be54.m(4.0f);
                be54.c();
                w83.a(w832, be54.a, ky62, 14336);
                x832 = w832.b();
                ub5.b = x832;
            }
            String u2 = l55.u(R.string.fab_vpn, yt23);
            boolean z5 = (i2 & 896) == 256;
            Object Q5 = yt23.Q();
            if (z5 || Q5 == obj) {
                Q5 = new zh(18, (Object) ydVar);
                yt23.o0(Q5);
            } else {
                yd ydVar5 = ydVar;
            }
            ta2 ta22 = new ta2(x832, u2, (sr2) Q5);
            x83 x833 = g75.c;
            if (x833 != null) {
                aq4 = aq42;
            } else {
                w83 w833 = new w83("Rounded.TravelExplore", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i8 = e38.a;
                aq4 = aq42;
                ky6 ky63 = new ky6(jt0.b);
                be5 e2 = pb4.e(19.3f, 16.9f);
                e2.e(0.58f, -1.01f, 0.95f, -2.23f, 0.51f, -3.65f);
                e2.e(-0.53f, -1.72f, -2.04f, -3.05f, -3.84f, -3.22f);
                e2.e(-2.87f, -0.28f, -5.23f, 2.07f, -4.95f, 4.95f);
                e2.e(0.18f, 1.79f, 1.5f, 3.31f, 3.22f, 3.84f);
                e2.e(1.43f, 0.44f, 2.64f, 0.07f, 3.65f, -0.51f);
                be5 be55 = e2;
                be55.i(2.5f, 2.5f);
                e2.e(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
                be55.i(0.0f, 0.0f);
                e2.e(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
                be55.h(19.3f, 16.9f);
                be55.c();
                be55.j(15.5f, 17.0f);
                e2.e(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
                be55.l(1.1f, -2.5f, 2.5f, -2.5f);
                be55.l(2.5f, 1.1f, 2.5f, 2.5f);
                be55.k(16.9f, 17.0f, 15.5f, 17.0f);
                be55.c();
                be55.j(12.0f, 20.0f);
                be55.n(2.0f);
                e2.d(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
                e2.d(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
                e2.e(4.84f, 0.0f, 8.87f, 3.44f, 9.8f, 8.0f);
                be55.g(-2.07f);
                e2.e(-0.64f, -2.46f, -2.4f, -4.47f, -4.73f, -5.41f);
                be55.m(5.0f);
                e2.e(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                be55.g(-2.0f);
                be55.n(2.0f);
                e2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                be55.f(8.0f);
                be55.n(2.0f);
                be55.g(2.0f);
                be55.n(3.0f);
                be55.f(9.0f);
                be55.i(-4.79f, -4.79f);
                e2.d(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f);
                e2.d(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f);
                be55.c();
                w83.a(w833, be55.a, ky63, 14336);
                x833 = w833.b();
                g75.c = x833;
            }
            String u3 = l55.u(R.string.fab_pamarillas, yt23);
            boolean z6 = (i2 & 7168) == 2048;
            Object Q6 = yt23.Q();
            if (z6 || Q6 == obj) {
                Q6 = new zh(19, (Object) ydVar4);
                yt23.o0(Q6);
            }
            ta2 ta23 = new ta2(x833, u3, (sr2) Q6);
            x83 J = pv8.J();
            String u4 = l55.u(R.string.fab_nauta_web, yt23);
            boolean i9 = yt23.i(hjVar);
            Object Q7 = yt23.Q();
            if (i9 || Q7 == obj) {
                Q7 = new g13(hjVar, 0);
                yt23.o0(Q7);
            }
            ta2 ta24 = new ta2(J, u4, (sr2) Q7);
            x83 h = i35.h();
            String u5 = l55.u(R.string.fab_tienda_web, yt23);
            boolean i10 = yt23.i(hjVar);
            Object Q8 = yt23.Q();
            if (i10 || Q8 == obj) {
                z2 = true;
                Q8 = new g13(hjVar, 1);
                yt23.o0(Q8);
            } else {
                z2 = true;
            }
            List E = sg3.E(ta2, ta22, ta23, ta24, new ta2(h, u5, (sr2) Q8));
            g80 g80 = xb4.M;
            ml4 K = x91.K(ml42, 16.0f);
            Object Q9 = yt23.Q();
            if (Q9 == obj) {
                Q9 = new xi(aq43, 17);
                yt23.o0(Q9);
            }
            ml4 G = gw8.G(K, (vr2) Q9);
            Object Q10 = yt23.Q();
            if (Q10 == obj) {
                Q10 = new xi(aq44, 18);
                yt23.o0(Q10);
            }
            ml4 W = t49.W(G, (vr2) Q10);
            au0 a2 = zt0.a(wr.c, g80, yt23, 48);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E2 = gw8.E(yt23, W);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, a2);
            g75.Q(tx0.e, yt23, m);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E2);
            if (!((Boolean) aq4.getValue()).booleanValue() || !z) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = i2;
                z3 = z2;
            }
            Object obj2 = obj;
            aq4 aq45 = aq4;
            boolean z7 = false;
            ie1.d(z3, (ml4) null, i52.e((je2) null, 3).a(i52.d((je2) null, 13)), i52.f((je2) null, 3).a(i52.i((je2) null, 13)), (String) null, su0.J(-1991825927, new gc5(11, (Object) E, (Object) aq4), yt23), yt23, 1600518, 18);
            long a3 = z08.a();
            long j3 = jt0.c;
            aq4 aq46 = aq43;
            j2 = j;
            we3 we3 = new we3(j2);
            int i11 = i3;
            boolean z8 = (i3 & 14) == 4;
            Object Q11 = yt23.Q();
            if (z8 || Q11 == obj2) {
                Q11 = new s13(j2, aq44, aq46);
                yt23.o0(Q11);
            }
            ml4 a4 = d97.a(jl4.w, we3, (PointerInputEventHandler) Q11);
            boolean z9 = (i11 & 112) == 32;
            if ((i11 & 57344) == 16384) {
                z7 = true;
            }
            boolean z10 = z9 | z7;
            Object Q12 = yt23.Q();
            if (z10 || Q12 == obj2) {
                z4 = z;
                sr22 = sr2;
                Q12 = new m92(z4, sr22, aq45);
                yt23.o0(Q12);
            } else {
                z4 = z;
                sr22 = sr2;
            }
            yt2 yt24 = yt2;
            ag8.c((sr2) Q12, a4, (pq6) null, a3, j3, (sh2) null, su0.J(1326359823, new ns4(aq45, 6), yt23), yt24, 12607488, 100);
            yt22 = yt24;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new f13(j2, z4, ydVar, ydVar4, sr22, ml42, i);
        }
    }

    public static final void i(o03 o03, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        Object obj;
        String str;
        String str2;
        Calendar G;
        int i4;
        int i5;
        o03 o032 = o03;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-2022458023);
        if ((i & 6) == 0) {
            if (yt22.g(o032)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt22.i(sr22)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            String u = l55.u(R.string.chip_balance, yt22);
            String u2 = l55.u(R.string.chip_bonus, yt22);
            String u3 = l55.u(R.string.plan_data, yt22);
            String u4 = l55.u(R.string.plan_sms, yt22);
            String u5 = l55.u(R.string.plan_voice, yt22);
            String u6 = l55.u(R.string.chip_mobile_recharge, yt22);
            Object Q = yt22.Q();
            Object obj2 = ay0.a;
            if (Q == obj2) {
                Q = Calendar.getInstance();
                yt22.o0(Q);
            }
            Calendar calendar = (Calendar) Q;
            int i6 = calendar.get(1);
            int i7 = calendar.get(2);
            int i8 = calendar.get(5);
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q2 = yt22.Q();
            int i9 = i2;
            if (z2 || Q2 == obj2) {
                n74 m = sg3.m();
                Calendar G2 = G(o032.g, calendar);
                if (G2 != null) {
                    obj = obj2;
                    i3 = i6;
                    m.add(new c92(u, G2, uq3.d(4293874512L)));
                } else {
                    obj = obj2;
                    i3 = i6;
                }
                Integer num = null;
                if (o032.i.length() > 0) {
                    str = o032.j;
                } else if (o032.k.length() > 0) {
                    str = o032.l;
                } else if (o032.o.length() > 0) {
                    str = o032.p;
                } else {
                    str = null;
                }
                if (!(str == null || (G = G(str, calendar)) == null)) {
                    int i10 = z08.d;
                    m.add(new c92(u2, G, z08.l(uq3.d(4281684093L), uq3.d(4286553289L))));
                }
                if (o032.r.length() > 0) {
                    str2 = o032.s;
                } else {
                    str2 = o032.v;
                }
                Calendar D = D(str2);
                if (D != null) {
                    m.add(new c92(u3, D, z08.d()));
                }
                Calendar D2 = D(o032.B);
                if (D2 != null) {
                    int i11 = z08.d;
                    m.add(new c92(u4, D2, z08.l(uq3.d(4294950656L), uq3.d(4294961979L))));
                }
                Calendar D3 = D(o032.z);
                if (D3 != null) {
                    int i12 = z08.d;
                    m.add(new c92(u5, D3, z08.l(uq3.d(4293467747L), uq3.d(4294198070L))));
                }
                Calendar G3 = G(o032.h, calendar);
                if (G3 != null) {
                    Object clone = calendar.clone();
                    clone.getClass();
                    Calendar calendar2 = (Calendar) clone;
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    Object clone2 = G3.clone();
                    clone2.getClass();
                    Calendar calendar3 = (Calendar) clone2;
                    calendar3.set(11, 0);
                    calendar3.set(12, 0);
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                    num = Integer.valueOf((int) ((calendar3.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000));
                }
                if (num != null) {
                    int intValue = num.intValue();
                    Calendar instance = Calendar.getInstance();
                    instance.add(6, intValue);
                    int i13 = z08.d;
                    m.add(new c92(u6, instance, z08.l(uq3.d(4283215696L), uq3.d(4278228616L))));
                }
                Q2 = dt0.U0(sg3.i(m), new a91(15));
                yt22 = yt2;
                yt22.o0(Q2);
            } else {
                obj = obj2;
                i3 = i6;
            }
            List list = (List) Q2;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                c92 c92 = (c92) next;
                int i14 = i3;
                if (c92.b.get(1) == i14) {
                    if (c92.b.get(2) == i7) {
                        arrayList.add(next);
                    }
                }
                i3 = i14;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                Integer valueOf = Integer.valueOf(((c92) next2).b.get(5));
                Object obj3 = linkedHashMap.get(valueOf);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(valueOf, obj3);
                }
                ((List) obj3).add(next2);
            }
            Object clone3 = calendar.clone();
            clone3.getClass();
            Calendar calendar4 = (Calendar) clone3;
            calendar4.set(5, 1);
            int i15 = calendar4.get(7) - 1;
            int actualMaximum = calendar4.getActualMaximum(5);
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList2.add(0);
            }
            ArrayList M0 = dt0.M0(arrayList2, dt0.b1(new pe3(1, actualMaximum, 1)));
            Object Q3 = yt22.Q();
            Object obj4 = obj;
            if (Q3 == obj4) {
                String format = new SimpleDateFormat("MMMM yyyy", Locale.getDefault()).format(calendar.getTime());
                format.getClass();
                int length = format.length();
                String str3 = format;
                if (length > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = format.charAt(0);
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String valueOf2 = String.valueOf(charAt);
                    valueOf2.getClass();
                    String upperCase = valueOf2.toUpperCase(locale);
                    upperCase.getClass();
                    sb.append(upperCase);
                    sb.append(format.substring(1));
                    str3 = sb.toString();
                }
                yt22.o0(str3);
                Q3 = str3;
            }
            String str4 = (String) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj4) {
                Q4 = new SimpleDateFormat("d MMM", Locale.getDefault());
                yt22.o0(Q4);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) Q4;
            if (d18.b()) {
                int i17 = jt0.h;
            } else {
                z08.a();
            }
            sr2 sr23 = sr2;
            fw0 J = su0.J(1905868705, new ce4(12, sr23), yt22);
            fw0 fw0 = rj1.j;
            fw0 J2 = su0.J(1593907621, new q20(str4, 8), yt22);
            fw0 J3 = su0.J(1515917350, new m13(M0, i8, linkedHashMap, list, simpleDateFormat), yt22);
            sr2 sr24 = sr23;
            fw0 fw02 = J3;
            sr22 = sr24;
            su0.a(sr22, J, (ml4) null, (gs2) null, fw0, J2, fw02, (pq6) null, 0, 0, 0, 0, (wu1) null, yt2, ((i9 >> 3) & 14) | 1794096, 16268);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) o032, (Object) sr22, i, 7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void j(int i, boolean z, List list, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        List list2;
        yx5 v;
        v03 v03;
        long j;
        long j2;
        am2 am2;
        int i7 = i;
        boolean z3 = z;
        List list3 = list;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        m23 m23 = gr8.h;
        yt22.g0(-2066715198);
        if (yt22.e(i7)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (yt22.h(z3)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (yt22.g(list3)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (yt22.g(ml42)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if ((i11 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!yt22.V(i11 & 1, z2)) {
            list2 = list3;
            yt22.Y();
            v = yt22.v();
            if (v == null) {
            }
        } else if (i7 == 0) {
            yt22.e0(-1156130717);
            k75.a(yt22, yu6.d(ml42, 42.0f));
            yt22.r(false);
            v = yt22.v();
            if (v != null) {
                v03 = new v03(i7, z3, list3, ml42, i2, 0);
            } else {
                return;
            }
        } else {
            ml4 ml43 = ml42;
            yt22.e0(-1156072096);
            yt22.r(false);
            if (d18.b()) {
                j = jt0.c;
            } else {
                j = z08.a();
            }
            if (d18.b()) {
                j2 = uq3.d(4279966491L);
            } else {
                j2 = jt0.c;
            }
            ml4 d = yu6.d(ml43, 42.0f);
            au0 a2 = zt0.a(wr.c, xb4.L, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            jl4 jl4 = jl4.w;
            ml4 f = we.f(yu6.l(jl4, 30.0f), q96.a);
            if (!z) {
                if (!list.isEmpty()) {
                    j = jt0.b(0.35f, ((c92) dt0.w0(list)).c);
                } else {
                    j = jt0.f;
                }
            }
            ml4 h = b96.h(f, j, m23);
            lh4 d2 = mb0.d(xb4.C, false);
            ce ceVar2 = ceVar;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, h);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d2);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar2);
            g75.Q(ckVar4, yt22, E2);
            String valueOf2 = String.valueOf(i);
            if (!z) {
                if (!list.isEmpty()) {
                    j2 = ((c92) dt0.w0(list)).c;
                } else {
                    j2 = z08.k();
                }
            }
            long j3 = j2;
            long k = ya5.k(13);
            if (z || !list.isEmpty()) {
                am2 = am2.B;
            } else {
                am2 = am2.y;
            }
            yt2 yt23 = yt2;
            jl4 jl42 = jl4;
            m23 m232 = m23;
            ce ceVar3 = ceVar2;
            ck ckVar5 = ckVar;
            ck ckVar6 = ckVar4;
            ck ckVar7 = ckVar3;
            vy0 vy02 = vy0;
            ck ckVar8 = ckVar2;
            yf7.b(valueOf2, (ml4) null, j3, k, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24576, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
            if (list.size() > 1) {
                yt22.e0(465994123);
                jl4 jl43 = jl42;
                k75.a(yt22, yu6.d(jl43, 2.0f));
                ea6 a3 = ca6.a(new ur(2.0f, true, new h(2)), xb4.H, yt22, 6);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E3 = gw8.E(yt22, jl43);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy02);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar5, yt22, a3);
                g75.Q(ckVar8, yt22, m3);
                f21.s(hashCode3, yt22, ckVar7, yt22, ceVar3);
                g75.Q(ckVar6, yt22, E3);
                yt22.e0(-814966674);
                list2 = list;
                for (c92 c92 : dt0.V0(4, list2)) {
                    mb0.a(b96.h(we.f(yu6.l(jl43, 4.0f), q96.a), c92.c, m232), yt22, 0);
                }
                yt22.r(false);
                yt22.r(true);
                yt22.r(false);
            } else {
                list2 = list;
                yt22.e0(466404470);
                yt22.r(false);
            }
            yt22.r(true);
            v = yt22.v();
            if (v == null) {
                v03 = new v03(i, z, list2, ml4, i2, 1);
            } else {
                return;
            }
        }
        v.d = v03;
    }

    public static final void k(long j, String str, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        long j2 = j;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(-601406811);
        if (yt22.f(j2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.g(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            mb0.a(b96.h(we.f(yu6.l(jl4, 9.0f), q96.a), j2, gr8.h), yt22, 0);
            k75.a(yt22, yu6.p(jl4, 8.0f));
            yt2 yt23 = yt2;
            yf7.b(str2, (ml4) null, z08.k(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, ((i5 >> 3) & 14) | 24576, 0, 262122);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ef(i, j, str2);
        }
    }

    public static final void l(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        ml4 ml4;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.g0(94093077);
        if (yt22.i(sr22)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 l = yu6.l(jl4, 38.0f);
            o96 o96 = q96.a;
            lf5 lf5 = new lf5(28.0f);
            ml4 h = b96.h(we.f(l, new o96(lf5, lf5, lf5, lf5)), z08.a(), gr8.h);
            if (sr22 != null) {
                ml4 = h49.u(jl4, false, (String) null, sr22, 15);
            } else {
                ml4 = jl4;
            }
            ml4 d = h.d(ml4);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            x83 x83 = b85.a;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.PriceCheck", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i5 = e38.a;
                long j = jt0.b;
                ky6 ky6 = new ky6(j);
                be5 be5 = new be5();
                be5.j(11.0f, 13.0f);
                be5.m(9.0f);
                be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be5.f(6.0f);
                be5.m(6.0f);
                be5.g(4.0f);
                be5.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                be5.l(-0.45f, -1.0f, -1.0f, -1.0f);
                be5.f(8.5f);
                be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be5.l(-1.0f, 0.45f, -1.0f, 1.0f);
                be5.f(5.0f);
                be5.d(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
                be5.n(4.0f);
                be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be5.g(4.0f);
                be5.n(2.0f);
                be5.f(5.0f);
                be5.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                be5.l(0.45f, 1.0f, 1.0f, 1.0f);
                be5.g(1.5f);
                be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be5.l(1.0f, -0.45f, 1.0f, -1.0f);
                be5.f(10.0f);
                be5.d(10.55f, 14.0f, 11.0f, 13.55f, 11.0f, 13.0f);
                be5.c();
                w83.a(w83, be5.a, ky6, 14336);
                ky6 ky62 = new ky6(j);
                be5 f = pb4.f(18.88f, 13.22f, -4.95f, 4.95f);
                f.i(-2.12f, -2.12f);
                f.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f.i(0.0f, 0.0f);
                f.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                f.i(2.83f, 2.83f);
                f.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f.i(5.66f, -5.66f);
                f.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                f.n(0.0f);
                f.d(19.9f, 12.83f, 19.27f, 12.83f, 18.88f, 13.22f);
                f.c();
                w83.a(w83, f.a, ky62, 14336);
                x83 = w83.b();
                b85.a = x83;
            }
            d83.a(x83, (String) null, yu6.l(jl4, 22.0f), jt0.c, yt22, 3504, 0);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ce4(i3, 13, sr22);
        }
    }

    public static final void m(x83 x83, boolean z, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long j;
        ml4 ml4;
        long b2;
        boolean z3 = z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-1510984962);
        if (yt22.g(x83)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.h(z3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(sr22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            jl4 jl4 = jl4.w;
            ml4 f = we.f(yu6.l(jl4, 50.0f), q96.a(13.0f));
            if (z3) {
                j = z08.a();
            } else {
                int i8 = z08.d;
                j = z08.l(uq3.d(4292668147L), uq3.d(4279646802L));
            }
            ml4 h = b96.h(f, j, gr8.h);
            if (z3) {
                ml4 = h49.u(jl4, false, (String) null, sr22, 15);
            } else {
                ml4 = jl4;
            }
            ml4 d = h.d(ml4);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (z3) {
                b2 = jt0.c;
            } else {
                b2 = z08.b();
            }
            d83.a(x83, (String) null, yu6.l(jl4, 24.0f), b2, yt22, (i7 & 14) | 432, 0);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new j92(i, 1, x83, sr22, z3);
        }
    }

    public static final void n(vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        bd5 bd5;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int i3;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-1625847791);
        if ((i & 6) == 0) {
            if (yt22.i(vr22)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = new bd5(-1);
                yt22.o0(Q);
            }
            bd5 bd52 = (bd5) Q;
            String u = l55.u(R.string.chip_balance, yt22);
            x83 x83 = pd8.A;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.AccountBalanceWallet", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i4 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 f = b81.f(10.0f, 16.0f, 10.0f, 8.0f);
                f.e(0.0f, -1.1f, 0.89f, -2.0f, 2.0f, -2.0f);
                be5 be5 = f;
                be5.g(9.0f);
                be5.h(21.0f, 5.0f);
                f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                be5.h(5.0f, 3.0f);
                f.e(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                be5.n(14.0f);
                f.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                be5.g(14.0f);
                f.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                be5.n(-1.0f);
                be5.g(-9.0f);
                f.e(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                be5.c();
                be5.j(13.0f, 8.0f);
                f.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                be5.n(6.0f);
                f.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be5.g(9.0f);
                be5.h(22.0f, 8.0f);
                be5.g(-9.0f);
                be5.c();
                be5.j(16.0f, 13.5f);
                f.e(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                be5.l(0.67f, -1.5f, 1.5f, -1.5f);
                be5.l(1.5f, 0.67f, 1.5f, 1.5f);
                be5.l(-0.67f, 1.5f, -1.5f, 1.5f);
                be5.c();
                w83 w832 = w83;
                w83.a(w832, be5.a, ky6, 14336);
                x83 = w832.b();
                pd8.A = x83;
            }
            yb5 yb5 = new yb5(u, x83);
            String u2 = l55.u(R.string.chip_bonus, yt22);
            x83 x832 = su0.m;
            float f2 = 20.0f;
            if (x832 == null) {
                w83 w833 = new w83("Rounded.CardGiftcard", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i5 = e38.a;
                ky6 ky62 = new ky6(jt0.b);
                be5 be52 = new be5();
                be52.j(20.0f, 6.0f);
                be52.g(-2.18f);
                be5 be53 = be52;
                be53.e(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f);
                be53.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                be53.e(-1.05f, 0.0f, -1.96f, 0.54f, -2.5f, 1.35f);
                be52.i(-0.5f, 0.67f);
                be52.i(-0.5f, -0.68f);
                be53.d(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f);
                be53.d(7.34f, 2.0f, 6.0f, 3.34f, 6.0f, 5.0f);
                be53.e(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
                be52.h(4.0f, 6.0f);
                be53.e(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                be52.h(2.0f, 19.0f);
                be53.e(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                be52.g(16.0f);
                be53.e(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                be52.h(22.0f, 8.0f);
                be53.e(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                be52.c();
                be52.j(15.0f, 4.0f);
                be53.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be52.l(-0.45f, 1.0f, -1.0f, 1.0f);
                be52.l(-1.0f, -0.45f, -1.0f, -1.0f);
                be52.l(0.45f, -1.0f, 1.0f, -1.0f);
                be52.c();
                be52.j(9.0f, 4.0f);
                be53.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be52.l(-0.45f, 1.0f, -1.0f, 1.0f);
                be52.l(-1.0f, -0.45f, -1.0f, -1.0f);
                be52.l(0.45f, -1.0f, 1.0f, -1.0f);
                b81.v(be52, 20.0f, 19.0f, 4.0f, 19.0f);
                be52.n(-2.0f);
                be52.g(16.0f);
                be52.n(2.0f);
                be52.c();
                be52.j(20.0f, 14.0f);
                be52.h(4.0f, 14.0f);
                be52.h(4.0f, 9.0f);
                be53.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                be52.g(4.08f);
                be52.h(7.6f, 10.02f);
                be53.e(-0.33f, 0.45f, -0.23f, 1.08f, 0.22f, 1.4f);
                be53.e(0.44f, 0.32f, 1.07f, 0.22f, 1.39f, -0.22f);
                be52.h(12.0f, 7.4f);
                be52.i(2.79f, 3.8f);
                be53.e(0.32f, 0.44f, 0.95f, 0.54f, 1.39f, 0.22f);
                be53.e(0.45f, -0.32f, 0.55f, -0.95f, 0.22f, -1.4f);
                be52.h(14.92f, 8.0f);
                be52.h(19.0f, 8.0f);
                be53.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be52.n(5.0f);
                be52.c();
                w83.a(w833, be52.a, ky62, 14336);
                x832 = w833.b();
                su0.m = x832;
            }
            List E = sg3.E(yb5, new yb5(u2, x832), new yb5(l55.u(R.string.chip_mobile_recharge, yt22), i35.h()));
            boolean z5 = false;
            ml4 Z = t49.Z(x91.O(jl4.w, 0.0f, 16.0f, 0.0f, 0.0f, 13), t49.Y(yt22), false);
            ea6 a2 = ca6.a(new ur(5.0f, true, new h(2)), xb4.H, yt22, 6);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, Z);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            yt22.e0(-969451570);
            int i6 = 0;
            for (Object next : E) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    yb5 yb52 = (yb5) next;
                    String str = (String) yb52.w;
                    x83 x833 = (x83) yb52.x;
                    if (i6 == bd52.d()) {
                        z3 = true;
                    } else {
                        z3 = z5;
                    }
                    boolean e = yt22.e(i6);
                    if ((i2 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = z5;
                    }
                    boolean z6 = e | z4;
                    Object Q2 = yt22.Q();
                    if (z6 || Q2 == obj) {
                        Q2 = new s52(vr22, i6, bd52, 1);
                        yt22.o0(Q2);
                    }
                    fw0 J = su0.J(1055480037, new q20(str, 7), yt22);
                    fw0 J2 = su0.J(72367720, new yg(11, x833), yt22);
                    o96 a3 = q96.a(f2);
                    float f3 = ud2.a;
                    long a4 = z08.a();
                    long j9 = jt0.c;
                    long f4 = z08.f();
                    Object obj2 = obj;
                    long l = z08.l(uq3.d(4281879390L), uq3.d(4290365912L));
                    sr2 sr2 = (sr2) Q2;
                    long l2 = z08.l(uq3.d(4281879390L), uq3.d(4290365912L));
                    long j10 = jt0.g;
                    cj6 b2 = ud2.b(((zg4) yt22.k(ch4.b)).a);
                    if (f4 != 16) {
                        j = f4;
                        bd5 = bd52;
                    } else {
                        bd5 = bd52;
                        j = b2.a;
                    }
                    if (l == 16) {
                        l = b2.b;
                    }
                    long j11 = l;
                    int i8 = (l2 > 16 ? 1 : (l2 == 16 ? 0 : -1));
                    if (i8 != 0) {
                        j2 = l2;
                    } else {
                        j2 = b2.c;
                    }
                    if (i8 == 0) {
                        l2 = b2.d;
                    }
                    long j12 = l2;
                    int i9 = (j10 > 16 ? 1 : (j10 == 16 ? 0 : -1));
                    if (i9 != 0) {
                        j3 = j10;
                    } else {
                        j3 = b2.e;
                    }
                    if (i9 != 0) {
                        j4 = j10;
                    } else {
                        j4 = b2.f;
                    }
                    if (i9 != 0) {
                        j5 = j10;
                    } else {
                        j5 = b2.g;
                    }
                    if (i9 != 0) {
                        j6 = j10;
                    } else {
                        j6 = b2.h;
                    }
                    if (a4 == 16) {
                        a4 = b2.i;
                    }
                    long j13 = a4;
                    if (i9 != 0) {
                        j7 = j10;
                    } else {
                        j7 = b2.j;
                    }
                    int i10 = (j9 > 16 ? 1 : (j9 == 16 ? 0 : -1));
                    if (i10 != 0) {
                        j8 = j9;
                    } else {
                        j8 = b2.k;
                    }
                    if (i10 == 0) {
                        j9 = b2.l;
                    }
                    long j14 = j9;
                    if (i9 == 0) {
                        j10 = b2.m;
                    }
                    cj6 cj6 = new cj6(j, j11, j2, j12, j3, j4, j5, j6, j13, j7, j8, j14, j10);
                    boolean z7 = z3;
                    ua0 a5 = ud2.a(z7, z08.l(uq3.d(4292076012L), uq3.d(4281090902L)), jt0.f, yt22, 240);
                    yt22 = yt2;
                    sp0.b(z7, sr2, J, (ml4) null, false, J2, a3, cj6, (dj6) null, a5, (tr) null, (la5) null, yt22, 196992, 14936);
                    z5 = false;
                    i6 = i7;
                    bd52 = bd5;
                    f2 = 20.0f;
                    obj = obj2;
                    vr22 = vr2;
                } else {
                    sg3.Z();
                    throw null;
                }
            }
            z2 = z5;
            yt22.r(z2);
            yt22.r(true);
        } else {
            z2 = false;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new b13(i, z2 ? 1 : 0, vr2);
        }
    }

    public static final void o(yg ygVar, yd ydVar, yd ydVar2, is2 is2, c23 c23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        c23 c232;
        yt2 yt22;
        c23 c233;
        int i6;
        int i7;
        boolean z2;
        is2 is22 = is2;
        yt2 yt23 = yt2;
        is22.getClass();
        yt23.g0(1040116282);
        if (yt23.i(ygVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        yd ydVar3 = ydVar;
        if (yt23.i(ydVar3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (yt23.i(ydVar2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (yt23.g(is22)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5 | 8192;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt23.V(i11 & 1, z)) {
            yt23.a0();
            if ((i & 1) == 0 || yt23.C()) {
                a68 a2 = va4.a(yt23);
                if (a2 != null) {
                    c233 = (c23) n85.p(b26.a.b(c23.class), a2, b96.O(o85.l(a2), yt23), o85.k(a2), yt23);
                    i6 = i11 & -57345;
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt23.Y();
                i6 = i11 & -57345;
                c233 = c23;
            }
            yt23.s();
            Context context = (Context) yt23.k(ye.b);
            Object[] objArr = new Object[0];
            Object Q = yt23.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new nf1(22);
                yt23.o0(Q);
            }
            aq4 aq4 = (aq4) u55.s(objArr, (sr2) Q, yt23, 48);
            Object Q2 = yt23.Q();
            if (Q2 == d63) {
                Q2 = u55.p((Object) null);
                yt23.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt23.Q();
            if (Q3 == d63) {
                Q3 = u55.p((Object) null);
                yt23.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            s8 s8Var = new s8(7);
            Object Q4 = yt23.Q();
            if (Q4 == d63) {
                Q4 = new xi(aq43, 15);
                yt23.o0(Q4);
            }
            se4 N = tf4.N(s8Var, (vr2) Q4, yt23, 48);
            s8 s8Var2 = new s8(6);
            boolean i12 = yt23.i(c233) | yt23.g(aq4);
            Object Q5 = yt23.Q();
            if (i12 || Q5 == d63) {
                i7 = 0;
                Q5 = new a13(c233, aq4, 0);
                yt23.o0(Q5);
            } else {
                i7 = 0;
            }
            se4 N2 = tf4.N(s8Var2, (vr2) Q5, yt23, i7);
            s8 s8Var3 = new s8(6);
            boolean i13 = yt23.i(c233);
            Object Q6 = yt23.Q();
            if (i13 || Q6 == d63) {
                Q6 = new a13(c233, aq42, 1);
                yt23.o0(Q6);
            }
            se4 N3 = tf4.N(s8Var3, (vr2) Q6, yt23, 0);
            s8 s8Var4 = new s8(false, 3);
            boolean i14 = yt23.i(c233);
            Object Q7 = yt23.Q();
            if (i14 || Q7 == d63) {
                Q7 = new gg0(29, (Object) c233);
                yt23.o0(Q7);
            }
            se4 N4 = tf4.N(s8Var4, (vr2) Q7, yt23, 0);
            aq4 n = hj8.n(c233.k, yt23);
            Object Q8 = yt23.Q();
            if (Q8 == d63) {
                Q8 = t49.D(yt23);
                yt23.o0(Q8);
            }
            o81 o81 = (o81) Q8;
            se4 se4 = N4;
            Object Q9 = yt23.Q();
            if (Q9 == d63) {
                Q9 = u55.p(Boolean.FALSE);
                yt23.o0(Q9);
            }
            aq4 aq44 = (aq4) Q9;
            String u = l55.u(R.string.license_required, yt23);
            c23 c234 = c233;
            String u2 = l55.u(R.string.ussd_data_updated, yt23);
            boolean i15 = yt23.i(o81);
            String str = u2;
            int i16 = i6;
            if ((i6 & 7168) != 2048) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean g = i15 | z2 | yt23.g(u);
            Object Q10 = yt23.Q();
            if (g || Q10 == d63) {
                Q10 = new bp2(o81, is22, u, 1);
                yt23.o0(Q10);
            }
            is7 is7 = (is7) n.getValue();
            aq4 aq45 = aq43;
            aq4 aq46 = aq44;
            c23 c235 = c234;
            sr2 sr2 = (sr2) Q10;
            se4 se42 = N3;
            j13 j13 = new j13(c235, context, se4, ygVar, ydVar3, ydVar2, aq4, N2, N, se42, n, o81, is22, str, sr2, aq45, aq42, aq46);
            yt22 = yt2;
            sg3.c(is7, is22, su0.J(-1687648889, j13, yt22), yt22, ((i16 >> 6) & 112) | 392);
            if (((Boolean) aq46.getValue()).booleanValue()) {
                yt22.e0(-2079487003);
                A(0, yt22);
                yt22.r(false);
            } else {
                yt22.e0(-2079453368);
                yt22.r(false);
            }
            c232 = c235;
        } else {
            yt22 = yt23;
            yt22.Y();
            c232 = c23;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new tg1(ygVar, ydVar, ydVar2, is22, c232, i);
        }
    }

    public static final void p(o03 o03, vr2 vr2, yg ygVar, yd ydVar, yd ydVar2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, hs2 hs2, gs2 gs2, vr2 vr26, sr2 sr2, sr2 sr22, vr2 vr27, vr2 vr28, vr2 vr29, vr2 vr210, vr2 vr211, sr2 sr23, vr2 vr212, sr2 sr24, sr2 sr25, vr2 vr213, yt2 yt2, int i) {
        int i2;
        o03 o032;
        int i3;
        o03 o033 = o03;
        vr2 vr214 = vr2;
        vr2 vr215 = vr27;
        vr2 vr216 = vr28;
        vr2 vr217 = vr213;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(2124019887);
        if ((i4 & 6) == 0) {
            i2 = (yt22.g(o033) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 48) == 0) {
            i2 |= yt22.i(vr214) ? 32 : 16;
        }
        yg ygVar2 = ygVar;
        if ((i4 & 384) == 0) {
            i2 |= yt22.i(ygVar2) ? 256 : 128;
        }
        int i5 = 1024;
        if ((i4 & 3072) == 0) {
            i2 |= yt22.i(ydVar) ? 2048 : 1024;
        } else {
            yd ydVar3 = ydVar;
        }
        int i6 = 8192;
        if ((i4 & 24576) == 0) {
            i2 |= yt22.i(ydVar2) ? 16384 : 8192;
        } else {
            yd ydVar4 = ydVar2;
        }
        int i7 = 65536;
        vr2 vr218 = vr22;
        if ((i4 & 196608) == 0) {
            i2 |= yt22.i(vr218) ? 131072 : 65536;
        }
        int i8 = 524288;
        vr2 vr219 = vr23;
        if ((i4 & 1572864) == 0) {
            i2 |= yt22.i(vr219) ? 1048576 : 524288;
        }
        int i9 = 4194304;
        vr2 vr220 = vr24;
        if ((i4 & 12582912) == 0) {
            i2 |= yt22.i(vr220) ? 8388608 : 4194304;
        }
        int i10 = 33554432;
        vr2 vr221 = vr25;
        if ((i4 & 100663296) == 0) {
            i2 |= yt22.i(vr221) ? 67108864 : 33554432;
        }
        int i11 = 268435456;
        hs2 hs22 = hs2;
        if ((i4 & 805306368) == 0) {
            i2 |= yt22.i(hs22) ? 536870912 : 268435456;
        }
        int i12 = i2;
        int i13 = (yt22.i(gs2) ? 4 : 2) | (yt22.i(vr26) ? 32 : 16) | (yt22.i(sr2) ? 256 : 128) | (yt22.i(sr22) ? 2048 : 1024);
        if (yt22.i(vr215)) {
            i6 = 16384;
        }
        int i14 = i13 | i6;
        if (yt22.i(vr216)) {
            i7 = 131072;
        }
        int i15 = i14 | i7;
        if (yt22.i(vr29)) {
            i8 = 1048576;
        }
        int i16 = i15 | i8;
        if (yt22.i(vr210)) {
            i9 = 8388608;
        }
        int i17 = i16 | i9;
        if (yt22.i(vr211)) {
            i10 = 67108864;
        }
        int i18 = i17 | i10;
        if (yt22.i(sr23)) {
            i11 = 536870912;
        }
        int i19 = i18 | i11;
        int i20 = (yt22.i(vr212) ? 4 : 2) | (yt22.i(sr24) ? 32 : 16) | (yt22.i(sr25) ? 256 : 128);
        if (yt22.i(vr217)) {
            i5 = 2048;
        }
        int i21 = i20 | i5;
        if (yt22.V(i12 & 1, ((i12 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i21 & 1171) == 1170) ? false : true)) {
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p(Boolean.FALSE);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(-1075532475);
                List list = o033.D;
                Object Q2 = yt22.Q();
                if (Q2 == obj) {
                    Q2 = new vo2(aq4, 4);
                    yt22.o0(Q2);
                }
                sr2 sr26 = (sr2) Q2;
                boolean z = (i19 & 458752) == 131072;
                Object Q3 = yt22.Q();
                if (z || Q3 == obj) {
                    Q3 = new no2(vr216, aq4, 2);
                    yt22.o0(Q3);
                }
                b(list, sr26, (vr2) Q3, yt22, 48);
                yt22.r(false);
            } else {
                yt22.e0(-1075242253);
                yt22.r(false);
            }
            Object Q4 = yt22.Q();
            if (Q4 == obj) {
                Q4 = u55.p(new we3(0));
                yt22.o0(Q4);
            }
            aq4 aq42 = (aq4) Q4;
            sd2 sd2 = yu6.c;
            Object Q5 = yt22.Q();
            if (Q5 == obj) {
                Q5 = new xi(aq42, 16);
                yt22.o0(Q5);
            }
            ml4 W = t49.W(sd2, (vr2) Q5);
            aq4 aq43 = aq4;
            lh4 d = mb0.d(xb4.y, false);
            Object obj2 = obj;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, W);
            ux0.d.getClass();
            int i22 = hashCode;
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, d);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(i22);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 O = x91.O(x91.M(t49.Z(sd2, t49.Y(yt22), true), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            aq4 aq44 = aq42;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, O);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a2);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 8.0f));
            int i23 = i19 >> 18;
            int i24 = (i12 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168);
            int i25 = i21 << 12;
            int i26 = i24 | (i25 & 57344) | (i25 & 458752);
            o03 o034 = o03;
            aq4 aq45 = aq43;
            Object obj3 = obj2;
            c(o034, vr210, vr211, sr23, vr212, sr24, yt22, i26);
            o03 o035 = o034;
            int i27 = i12 >> 3;
            n(vr214, yt22, i27 & 14);
            boolean z2 = o035.K;
            Set set = o035.M;
            if (z2) {
                yt22.e0(-1508182881);
                s(o035.J, yt22, 0);
                yt22.r(false);
            } else {
                yt22.e0(-1508106001);
                yt22.r(false);
            }
            String u = l55.u(R.string.call_title, yt22);
            String u2 = l55.u(R.string.asterisco_99_title, yt22);
            String u3 = l55.u(R.string.anonymous_call_title, yt22);
            String u4 = l55.u(R.string.section_calls, yt22);
            boolean contains = set.contains("CALLS");
            int i28 = i21 & 7168;
            boolean z3 = i28 == 2048;
            Object Q6 = yt22.Q();
            if (z3 || Q6 == obj3) {
                i3 = 57344;
                Q6 = new zg1(8, vr217);
                yt22.o0(Q6);
            } else {
                i3 = 57344;
            }
            u(u4, contains, (sr2) Q6, yt22, 0);
            int i29 = i21;
            int i30 = i27;
            aq4 aq46 = aq44;
            int i31 = i28;
            Set set2 = set;
            ie1.d(!set.contains("CALLS"), (ml4) null, (n52) null, (x82) null, (String) null, su0.J(1910645083, new uk1(u, vr22, ygVar, u2, u3, aq45), yt22), yt22, 1572870, 30);
            yt2 yt23 = yt22;
            String u5 = l55.u(R.string.section_recharge_transfer, yt23);
            boolean contains2 = set2.contains("RECHARGE");
            boolean z4 = i31 == 2048;
            Object Q7 = yt23.Q();
            if (z4 || Q7 == obj3) {
                Q7 = new zg1(9, vr217);
                yt23.o0(Q7);
            }
            u(u5, contains2, (sr2) Q7, yt23, 0);
            yt2 yt24 = yt2;
            o03 o036 = o035;
            jl4 jl42 = jl4;
            Object obj4 = obj3;
            o032 = o036;
            yt2 yt25 = yt24;
            ie1.d(!set2.contains("RECHARGE"), (ml4) null, (n52) null, (x82) null, (String) null, su0.J(-758569212, new x03(vr25, hs2, gs2, vr26, o036, vr29, vr23, vr24, sr2, sr22), yt24), yt25, 1572870, 30);
            String u6 = l55.u(R.string.section_my_plans, yt25);
            boolean contains3 = set2.contains("PLANS");
            boolean z5 = i31 == 2048;
            Object Q8 = yt25.Q();
            if (z5 || Q8 == obj4) {
                Q8 = new zg1(10, vr217);
                yt25.o0(Q8);
            }
            u(u6, contains3, (sr2) Q8, yt25, 0);
            vr215 = vr27;
            ie1.d(!set2.contains("PLANS"), (ml4) null, (n52) null, (x82) null, (String) null, su0.J(-765658909, new gc5(10, (Object) o032, (Object) vr215), yt25), yt25, 1572870, 30);
            jl4 jl43 = jl42;
            k75.a(yt25, yu6.d(jl43, 60.0f));
            yt25.r(true);
            yt2 yt26 = yt25;
            h(((we3) aq46.getValue()).a, o032.L, ydVar, ydVar2, sr25, x91.O(qb0.a.a(jl43, xb4.G), 0.0f, 0.0f, 0.0f, 50.0f, 7), yt26, (i30 & 8064) | ((i29 << 6) & i3));
            yt22 = yt26;
            yt22.r(true);
        } else {
            o032 = o033;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new y03(o032, vr2, ygVar, ydVar, ydVar2, vr22, vr23, vr24, vr25, hs2, gs2, vr26, sr2, sr22, vr215, vr28, vr29, vr210, vr211, sr23, vr212, sr24, sr25, vr217, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void q(x83 x83, long j, long j2, int i, yt2 yt2, int i2, int i3) {
        int i4;
        x83 x832;
        int i5;
        boolean z;
        yx5 v;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j3 = j;
        yt2 yt22 = yt2;
        int i11 = i2;
        yt22.g0(1942103391);
        if ((i11 & 6) == 0) {
            x832 = x83;
            if (yt22.g(x832)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i11;
        } else {
            x832 = x83;
            i4 = i11;
        }
        if ((i11 & 48) == 0) {
            if (yt22.f(j3)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        long j4 = j2;
        if ((i11 & 384) == 0) {
            if (yt22.f(j4)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i5 = i;
            if (yt22.e(i5)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
            if ((i4 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i4 & 1, z)) {
                if (i12 != 0) {
                    i6 = 46;
                } else {
                    i6 = i5;
                }
                jl4 jl4 = jl4.w;
                ml4 h = b96.h(we.f(yu6.l(jl4, (float) i6), q96.a(14.0f)), j3, gr8.h);
                lh4 d = mb0.d(xb4.C, false);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, h);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, d);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                d83.a(x832, (String) null, yu6.l(jl4, 24.0f), j4, yt22, (i4 & 14) | 432 | ((i4 << 3) & 7168), 0);
                yt22.r(true);
                i5 = i6;
            } else {
                yt22.Y();
            }
            v = yt22.v();
            if (v == null) {
                v.d = new q13(x83, j3, j2, i5, i2, i3);
                return;
            }
            return;
        }
        i5 = i;
        if ((i4 & 1171) == 1170) {
        }
        if (!yt22.V(i4 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final void r(o03 o03, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        o03 o032 = o03;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(697598414);
        if (yt22.g(o032)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(vr22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            String u = l55.u(R.string.plan_no_sms, yt22);
            String u2 = l55.u(R.string.days_suffix, yt22);
            String u3 = l55.u(R.string.plan_active, yt22);
            String u4 = l55.u(R.string.plan_not_active, yt22);
            String str8 = o032.r;
            String str9 = o032.z;
            String str10 = o032.B;
            String str11 = o032.A;
            String str12 = o032.C;
            String str13 = o032.x;
            String str14 = o032.u;
            String str15 = u;
            String str16 = o032.t;
            if (str8.length() > 0) {
                str3 = u3;
                str2 = u4;
                str = str8;
            } else {
                if (str16.length() > 0) {
                    StringBuilder o = b81.o(str16);
                    if (str14.length() > 0) {
                        str3 = u3;
                        str2 = u4;
                        o.append(" + " + str14 + " LTE");
                    } else {
                        str3 = u3;
                        str2 = u4;
                    }
                    str13 = o.toString();
                } else {
                    str3 = u3;
                    str2 = u4;
                    if (str13.length() <= 0) {
                        str = "--";
                    }
                }
                str = str13;
            }
            StringBuilder sb = new StringBuilder();
            if (str8.length() > 0) {
                str4 = o032.s;
            } else {
                str4 = o032.v;
            }
            if (str4.length() > 0 && !str4.equals("--")) {
                sb.append(str4 + " " + u2);
            }
            String sb2 = sb.toString();
            if (sg3.e(str12, "--")) {
                str5 = "--";
            } else if (d57.x0(str12, "no tiene", false)) {
                str5 = str2;
            } else {
                str5 = str3;
            }
            String u5 = l55.u(R.string.plan_data, yt22);
            x83 h = w95.h();
            int i6 = z08.d;
            oh5 oh5 = new oh5(u5, h, z08.l(uq3.d(4292667899L), uq3.d(4279644750L)), z08.d(), az7.CONSULTAR_DATOS, str, sb2);
            String u6 = l55.u(R.string.plan_sms, yt22);
            x83 o2 = dh4.o();
            String str17 = str9;
            long l = z08.l(uq3.d(4292667634L), uq3.d(4279513151L));
            long l2 = z08.l(uq3.d(4282219166L), uq3.d(4285510102L));
            if (!sg3.e(str11, "--")) {
                str6 = b81.n(str11, " SMS");
            } else {
                str6 = str15;
            }
            String str18 = "";
            if (!sg3.e(str10, "--")) {
                str7 = pb4.l(str10, " ", u2);
            } else {
                str7 = str18;
            }
            oh5 oh52 = new oh5(u6, o2, l, l2, az7.CONSULTAR_SMS, str6, str7);
            String u7 = l55.u(R.string.plan_voice, yt22);
            x83 R = r16.R();
            long l3 = z08.l(uq3.d(4292994295L), uq3.d(4280625997L));
            long l4 = z08.l(uq3.d(4284181447L), uq3.d(4288127976L));
            String str19 = o032.y;
            if (!sg3.e(str17, "--")) {
                str18 = pb4.l(str17, " ", u2);
            }
            List E = sg3.E(oh5, oh52, new oh5(u7, R, l3, l4, az7.CONSULTAR_MINUTOS, str19, str18), new oh5(l55.u(R.string.plan_friend, yt22), rc9.O(), z08.l(uq3.d(4292731888L), uq3.d(4280101440L)), z08.l(uq3.d(4281684093L), uq3.d(4286553289L)), az7.PLAN_AMIGO, str5, "Plan"));
            float f = 10.0f;
            int i7 = 6;
            au0 a2 = zt0.a(new ur(10.0f, true, new h(2)), xb4.K, yt22, 6);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E2 = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            yt22.e0(1394312259);
            Iterator it = dt0.p0(2, E).iterator();
            while (it.hasNext()) {
                List<oh5> list = (List) it.next();
                ea6 a3 = ca6.a(new ur(f, true, new h(2)), xb4.H, yt22, i7);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E3 = gw8.E(yt22, jl4);
                ux0.d.getClass();
                vy0 vy02 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy02);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, a3);
                g75.Q(tx0.e, yt22, m2);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode2));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E3);
                yt22.e0(-1901122298);
                for (oh5 oh53 : list) {
                    pl0 w = rc9.w(z08.f(), yt22, 24576);
                    ql0 F = F();
                    lz3 lz3 = new lz3(1.0f, true);
                    if ((i5 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean g = z2 | yt22.g(oh53);
                    Object Q = yt22.Q();
                    if (g || Q == ay0.a) {
                        Q = new f5(24, vr22, oh53);
                        yt22.o0(Q);
                    }
                    we.a((sr2) Q, lz3, false, b, w, F, su0.J(1483131909, new xa7(4, (Object) oh53), yt22), yt22, 100666368);
                }
                yt22.r(false);
                yt22.r(true);
                f = 10.0f;
                i7 = 6;
            }
            yt22.r(false);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new p13(o032, vr22, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void s(List list, yt2 yt2, int i) {
        int i2;
        boolean z;
        yx5 v;
        c13 c13;
        boolean z2;
        boolean z3;
        int i3 = i;
        yt2.g0(-1001398430);
        if (yt2.g(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!yt2.V(i4 & 1, z)) {
            yt2.Y();
            v = yt2.v();
            if (v == null) {
            }
        } else if (list.isEmpty()) {
            v = yt2.v();
            if (v != null) {
                c13 = new c13(list, i, 0);
            } else {
                return;
            }
        } else {
            int i5 = i4 & 14;
            if (i5 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (z2 || Q == d63) {
                Q = new tm1(2, list);
                yt2.o0(Q);
            }
            um1 b2 = rb5.b(0, (sr2) Q, yt2, 0, 3);
            hj hjVar = (hj) yt2.k(xy0.t);
            if (list.size() > 1) {
                yt2.e0(182445643);
                boolean g = yt2.g(b2);
                if (i5 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z4 = z3 | g;
                Object Q2 = yt2.Q();
                if (z4 || Q2 == d63) {
                    Q2 = new ju1(b2, list, (f61) null, 8);
                    yt2.o0(Q2);
                }
                t49.h((gs2) Q2, yt2, list);
                yt2.r(false);
            } else {
                yt2.e0(182650336);
                yt2.r(false);
            }
            au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt2, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, a2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            k75.a(yt2, yu6.d(jl4, 12.0f));
            o96 a3 = q96.a(18.0f);
            pl0 w = rc9.w(z08.f(), yt2, 24576);
            ql0 x = rc9.x(62, 2.0f);
            o96 o96 = a3;
            we.b(yu6.d(jl4, 130.0f), o96, w, x, su0.J(-1631802550, new d13(b2, list, hjVar, 0), yt2), yt2, 196614, 16);
            yt2.r(true);
            v = yt2.v();
            if (v == null) {
                c13 = new c13(list, i, 1);
            } else {
                return;
            }
        }
        v.d = c13;
    }

    public static final void t(vr2 vr2, vr2 vr22, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(-467833344);
        if (yt2.i(vr2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(vr22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = u55.p("");
                yt2.o0(Q);
            }
            B((sr2) null, su0.J(-1343245646, new y30((Object) vr22, (Object) vr2, (aq4) Q, 19), yt2), yt2, 48, 1);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(vr2, vr22, i, 18);
        }
    }

    public static final void u(String str, boolean z, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        float f;
        boolean z3 = z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(714855095);
        String str2 = str;
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.h(z3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(sr22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            h80 h80 = xb4.I;
            ml4 N = x91.N(h49.u(we.f(yu6.a, q96.a(8.0f)), false, (String) null, sr22, 15), 4.0f, 12.0f, 4.0f, 10.0f);
            ea6 a2 = ca6.a(wr.a, h80, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, N);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            int i8 = z08.d;
            String str3 = str2;
            yf7.b(str3, new lz3(1.0f, true), z08.l(uq3.d(4286945452L), uq3.d(4286485416L)), ya5.k(12), am2.B, (ea7) null, ya5.k(1), (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, (i7 & 14) | 102260736, 0, 261800);
            if (z3) {
                f = -90.0f;
            } else {
                f = 0.0f;
            }
            yt2 yt23 = yt2;
            d83.a(gl0.V(), (String) null, ub5.r(yu6.l(jl4.w, 18.0f), ((Number) vj.b(f, (hl) null, "sectionArrow", yt2, 3072, 22).getValue()).floatValue()), z08.l(uq3.d(4286945452L), uq3.d(4286485416L)), yt23, 48, 0);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new h13(str, z3, sr22, i, 0);
        }
    }

    public static final void v(x83 x83, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        ml4 ml4;
        yt2 yt22 = yt2;
        int i4 = i;
        yt2.g0(-301864014);
        if (yt2.g(x83)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i4;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 h = b96.h(we.f(yu6.l(jl4, 32.0f), q96.a), z08.c(), gr8.h);
            if (sr2 != null) {
                ml4 = h49.u(jl4, false, (String) null, sr2, 15);
            } else {
                ml4 = jl4;
            }
            ml4 d = h.d(ml4);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt22.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            d83.a(x83, (String) null, yu6.l(jl4, 20.0f), z08.l(uq3.d(4283393144L), uq3.d(4289050825L)), yt22, (i6 & 14) | 432, 0);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new u03(x83, sr2, i4, 2);
        }
    }

    public static final void w(x83 x83, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        ml4 ml4;
        int i4 = i;
        yt2.g0(-44224842);
        if (yt2.g(x83)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i4;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 f = we.f(yu6.l(jl4, 36.0f), q96.a);
            int i7 = z08.d;
            ml4 h = b96.h(f, z08.l(uq3.d(4292668147L), uq3.d(4279646802L)), gr8.h);
            if (sr2 != null) {
                ml4 = h49.u(jl4, false, (String) null, sr2, 15);
            } else {
                ml4 = jl4;
            }
            ml4 d = h.d(ml4);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            d83.a(x83, (String) null, yu6.l(jl4, 18.0f), z08.b(), yt2, (i6 & 14) | 432, 0);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new u03(x83, sr2, i, 1);
        }
    }

    public static final void x(x83 x83, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        ml4 ml4;
        yt2 yt22 = yt2;
        int i4 = i;
        yt2.g0(-1153626734);
        if (yt2.g(x83)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i4;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 f = we.f(yu6.l(jl4, 50.0f), q96.a(13.0f));
            int i7 = z08.d;
            ml4 h = b96.h(f, z08.l(uq3.d(4292668147L), uq3.d(4279646802L)), gr8.h);
            if (sr2 != null) {
                ml4 = h49.u(jl4, false, (String) null, sr2, 15);
            } else {
                ml4 = jl4;
            }
            ml4 d = h.d(ml4);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt22.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            d83.a(x83, (String) null, yu6.l(jl4, 24.0f), z08.b(), yt22, (i6 & 14) | 432, 0);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new u03(x83, sr2, i4, 0);
        }
    }

    public static final void y(vr2 vr2, hs2 hs2, gs2 gs2, vr2 vr22, String str, List list, String str2, vr2 vr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        int i10;
        boolean z4;
        gs2 gs22 = gs2;
        String str3 = str;
        yt2 yt22 = yt2;
        yt22.g0(-30158526);
        vr2 vr24 = vr2;
        if (yt22.i(vr24)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        hs2 hs22 = hs2;
        if (yt22.i(hs22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (yt22.i(gs22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i13 = i12 | i4;
        vr2 vr25 = vr22;
        if (yt22.i(vr25)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (yt22.g(str3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        List list2 = list;
        if (yt22.g(list2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (yt22.g(str2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        vr2 vr26 = vr23;
        if (yt22.i(vr26)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if ((4793491 & i18) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i18 & 1, z)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = u55.p("");
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = u55.p("");
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == d63) {
                Q3 = u55.p("");
                yt22.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == d63) {
                Q4 = u55.p(Boolean.FALSE);
                yt22.o0(Q4);
            }
            aq4 aq44 = (aq4) Q4;
            aq4 aq45 = aq43;
            if ((i18 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q5 = yt22.Q();
            if (z2 || Q5 == d63) {
                Q5 = new tc1(str3, aq42, (f61) null, 3);
                yt22.o0(Q5);
            }
            t49.h((gs2) Q5, yt22, str3);
            if (((String) aq4.getValue()).length() == 8 && ((String) aq42.getValue()).length() == 4 && ((String) aq45.getValue()).length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (((Boolean) aq44.getValue()).booleanValue()) {
                yt22.e0(-803594027);
                Object Q6 = yt22.Q();
                if (Q6 == d63) {
                    Q6 = new vo2(aq44, 5);
                    yt22.o0(Q6);
                }
                sr2 sr2 = (sr2) Q6;
                if ((i18 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object Q7 = yt22.Q();
                if (z4 || Q7 == d63) {
                    i10 = 1;
                    Q7 = new w20(gs22, aq44, 1);
                    yt22.o0(Q7);
                } else {
                    i10 = 1;
                }
                f(6, sr2, (gs2) Q7, yt22);
                yt22.r(false);
            } else {
                i10 = 1;
                yt22.e0(-803368192);
                yt22.r(false);
            }
            B((sr2) null, su0.J(334146640, new e13(str2, list2, vr26, vr24, aq4, z3, hs22, aq42, vr25, aq44, aq45), yt22), yt22, 48, i10);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new xf1(vr2, hs2, gs22, vr22, str3, list, str2, vr23, i);
        }
    }

    public static final void z(boolean z, vr2 vr2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3 = z;
        vr2 vr22 = vr2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i6 = i;
        yt22.g0(-654616113);
        if ((i6 & 6) == 0) {
            if (yt22.h(z3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.i(vr22)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 384) == 0) {
            if (yt22.i(sr22)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            su0.a(sr22, su0.J(497433735, new ce4(15, sr22), yt22), (ml4) null, (gs2) null, rj1.l, rj1.m, su0.J(1600176674, new wi5(1, vr22, z3), yt22), (pq6) null, 0, 0, 0, 0, (wu1) null, yt22, ((i2 >> 6) & 14) | 1794096, 16268);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ii(i6, 1, vr22, sr2, z3);
        }
    }
}
