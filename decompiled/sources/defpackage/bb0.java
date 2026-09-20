package defpackage;

import android.app.role.RoleManager;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import cu.lestebang.utiletecsa.feature.settings.service.GsmNetworkService;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.DispatchException;

/* renamed from: bb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bb0 implements ok1, gy0 {
    public static final rt0 A;
    public static final rt0 B;
    public static final rt0 C;
    public static final rt0 D;
    public static final rt0 E;
    public static final rt0 F;
    public static final rt0 G;
    public static final rt0 H;
    public static final rt0 I;
    public static final rt0 J;
    public static final rt0 K;
    public static final rt0 L;
    public static final rt0 M;
    public static final rt0 N;
    public static final rt0 O;
    public static final rt0 P;
    public static final rt0 Q;
    public static final rt0 R;
    public static final rt0 S = rt0.F;
    public static final rt0 T;
    public static final rt0 U;
    public static final Object V = new Object();
    public static i88 W;
    public static x83 X;
    public static x83 Y;
    public static final /* synthetic */ int Z = 0;
    public static final f61[] a = new f61[0];
    public static final /* synthetic */ int a0 = 0;
    public static final fw0 b = new fw0(-1482415044, new nw0(8), false);
    public static final fw0 c = new fw0(-343928839, new nw0(12), false);
    public static final fw0 d = new fw0(-785531138, new nw0(13), false);
    public static final fw0 e = new fw0(-1220036736, new nw0(14), false);
    public static final fw0 f = new fw0(-1635176123, new vw0(11), false);
    public static final fw0 g = new fw0(-724160685, new vw0(12), false);
    public static final fw0 h = new fw0(1353625994, new vw0(13), false);
    public static final fw0 i = new fw0(-1734313962, new vw0(8), false);
    public static final fw0 j = new fw0(-432829208, new nw0(9), false);
    public static final fw0 k = new fw0(-617865535, new vw0(9), false);
    public static final fw0 l = new fw0(1947530138, new nw0(10), false);
    public static final fw0 m = new fw0(629954657, new vw0(10), false);
    public static final fw0 n = new fw0(124924634, new nw0(11), false);
    public static final fw0 o = new fw0(165467290, new xw0(19), false);
    public static final vq6 p = vq6.z;
    public static final float q = 56.0f;
    public static final rt0 r;
    public static final vq6 s = vq6.x;
    public static final rt0 t;
    public static final rt0 u;
    public static final rt0 v;
    public static final rt0 w;
    public static final rt0 x;
    public static final rt0 y;
    public static final rt0 z;

    static {
        new fw0(192734006, new xw0(20), false);
        rt0 rt0 = rt0.H;
        r = rt0;
        rt0 rt02 = rt0.D;
        t = rt02;
        u = rt02;
        v = rt02;
        w = rt02;
        x = rt02;
        y = rt02;
        rt0 rt03 = rt0.w;
        z = rt03;
        A = rt02;
        B = rt03;
        rt0 rt04 = rt0.E;
        C = rt04;
        D = rt03;
        E = rt03;
        F = rt03;
        G = rt02;
        H = rt0;
        I = rt04;
        J = rt0;
        K = rt04;
        L = rt04;
        M = rt02;
        N = rt04;
        O = rt04;
        P = rt04;
        Q = rt04;
        R = rt04;
        T = rt04;
        U = rt04;
    }

    public static final BlendMode A0(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        if (i2 == 28) {
            return BlendMode.LUMINOSITY;
        }
        return BlendMode.SRC_OVER;
    }

    public static final as0 B0(vl vlVar) {
        List list;
        long j2;
        byte b2;
        vl vlVar2 = vlVar;
        List list2 = vlVar2.y;
        List list3 = a42.w;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = vlVar2.x;
        if (!list.isEmpty()) {
            SpannableString spannableString = new SpannableString(str);
            f96 f96 = new f96(20, false);
            f96.x = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i2 = 0;
            while (i2 < size) {
                ul ulVar = (ul) list2.get(i2);
                yy6 yy6 = (yy6) ulVar.a;
                int i3 = ulVar.b;
                int i4 = ulVar.c;
                ((Parcel) f96.x).recycle();
                f96.x = Parcel.obtain();
                kf7 kf7 = yy6.a;
                long j3 = yy6.l;
                long j4 = yy6.h;
                int i5 = i4;
                long j5 = yy6.b;
                List list4 = list2;
                int i6 = size;
                long b3 = kf7.b();
                SpannableString spannableString2 = spannableString;
                int i7 = i2;
                long j6 = jt0.g;
                if (!jt0.c(b3, j6)) {
                    f96.u((byte) 1);
                    j2 = j6;
                    ((Parcel) f96.x).writeLong(yy6.a.b());
                } else {
                    j2 = j6;
                }
                long j7 = wg7.c;
                byte b4 = 2;
                if (!wg7.a(j5, j7)) {
                    f96.u((byte) 2);
                    f96.w(j5);
                }
                am2 am2 = yy6.c;
                if (am2 != null) {
                    f96.u((byte) 3);
                    ((Parcel) f96.x).writeInt(am2.w);
                }
                yl2 yl2 = yy6.d;
                if (yl2 != null) {
                    int i8 = yl2.a;
                    f96.u((byte) 4);
                    if (i8 != 0 && i8 == 1) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    f96.u(b2);
                }
                zl2 zl2 = yy6.e;
                if (zl2 != null) {
                    int i9 = zl2.a;
                    f96.u((byte) 5);
                    if (i9 != 0) {
                        if (i9 == 65535) {
                            b4 = 1;
                        } else if (i9 != 1) {
                            if (i9 == 2) {
                                b4 = 3;
                            }
                        }
                        f96.u(b4);
                    }
                    b4 = 0;
                    f96.u(b4);
                }
                String str2 = yy6.g;
                if (str2 != null) {
                    f96.u((byte) 6);
                    ((Parcel) f96.x).writeString(str2);
                }
                if (!wg7.a(j4, j7)) {
                    f96.u((byte) 7);
                    f96.w(j4);
                }
                h60 h60 = yy6.i;
                if (h60 != null) {
                    float f2 = h60.a;
                    f96.u((byte) 8);
                    f96.v(f2);
                }
                lf7 lf7 = yy6.j;
                if (lf7 != null) {
                    f96.u((byte) 9);
                    f96.v(lf7.a);
                    f96.v(lf7.b);
                }
                if (!jt0.c(j3, j2)) {
                    f96.u((byte) 10);
                    ((Parcel) f96.x).writeLong(j3);
                }
                rd7 rd7 = yy6.m;
                if (rd7 != null) {
                    f96.u((byte) 11);
                    ((Parcel) f96.x).writeInt(rd7.a);
                }
                lq6 lq6 = yy6.n;
                if (lq6 != null) {
                    f96.u((byte) 12);
                    ((Parcel) f96.x).writeLong(lq6.a);
                    long j8 = lq6.b;
                    f96.v(Float.intBitsToFloat((int) (j8 >> 32)));
                    f96.v(Float.intBitsToFloat((int) (j8 & 4294967295L)));
                    f96.v(lq6.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) f96.x).marshall(), 0)), i3, i5, 33);
                i2 = i7 + 1;
                spannableString = spannableString2;
                list2 = list4;
                size = i6;
            }
            str = spannableString;
        }
        return new as0(ClipData.newPlainText("plain text", str));
    }

    public static final PorterDuff.Mode C0(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i2 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final int D0(float f2, float[] fArr, int i2) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return Float.isNaN(f3) ^ true ? 1 : 0;
    }

    public static final void F(String str, boolean z2, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        yt2 yt22 = yt2;
        yt22.g0(1457938221);
        String str2 = str;
        if (yt22.g(str2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (yt22.h(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt22.i(vr2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i8 & 1, z3)) {
            sd2 sd2 = yu6.a;
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            t37 t37 = ch4.b;
            tg7 tg7 = ((zg4) yt22.k(t37)).b.l;
            long j2 = ((zg4) yt22.k(t37)).a.s;
            int i9 = i8;
            yt2 yt23 = yt2;
            yf7.b(str2, new lz3(1.0f, true), j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg7, yt23, i9 & 14, 0, 131064);
            yt22 = yt23;
            k75.a(yt22, yu6.p(jl4.w, 8.0f));
            p97.a(z2, vr2, (ml4) null, false, (n97) null, yt22, (i9 >> 3) & 126, 124);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new qs4(str, z2, vr2, i2, 1);
        }
    }

    public static final void G(String str, az7 az7, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        vr2 vr22;
        az7 az72;
        sr srVar;
        ck ckVar;
        ce ceVar;
        ck ckVar2;
        ck ckVar3;
        g80 g80;
        int i6;
        ck ckVar4;
        vy0 vy0;
        jl4 jl4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i7;
        String str2 = str;
        vr2 vr23 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(1555840059);
        if ((i2 & 6) == 0) {
            if (yt22.g(str2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if (yt22.e(az7.ordinal())) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i3 | i4;
        if (yt22.i(vr23)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i9 & 1, z2)) {
            g80 g802 = xb4.K;
            sr srVar2 = wr.c;
            au0 a2 = zt0.a(srVar2, g802, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            jl4 jl42 = jl4.w;
            ml4 E2 = gw8.E(yt22, jl42);
            ux0.d.getClass();
            vy0 vy02 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy02);
            } else {
                yt22.r0();
            }
            ck ckVar5 = tx0.f;
            g75.Q(ckVar5, yt22, a2);
            ck ckVar6 = tx0.e;
            g75.Q(ckVar6, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar7 = tx0.g;
            g75.Q(ckVar7, yt22, valueOf);
            ce ceVar2 = tx0.h;
            g75.O(yt22, ceVar2);
            g80 g803 = g802;
            ck ckVar8 = tx0.d;
            g75.Q(ckVar8, yt22, E2);
            if (str2 != null) {
                yt22.e0(-1457627309);
                t37 t37 = ch4.b;
                tg7 tg7 = ((zg4) yt22.k(t37)).b.l;
                long j2 = ((zg4) yt22.k(t37)).a.s;
                vy0 = vy02;
                ckVar4 = ckVar5;
                jl4 = jl42;
                yt2 yt23 = yt2;
                i6 = i9;
                ckVar3 = ckVar6;
                ceVar = ceVar2;
                ckVar2 = ckVar7;
                ckVar = ckVar8;
                g80 = g803;
                srVar = srVar2;
                yf7.b(str2, x91.O(jl42, 0.0f, 8.0f, 0.0f, 0.0f, 13), j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg7, yt23, (i9 & 14) | 48, 0, 131064);
                yt22 = yt23;
                z3 = false;
                yt22.r(false);
            } else {
                i6 = i9;
                ckVar = ckVar8;
                srVar = srVar2;
                ckVar3 = ckVar6;
                ceVar = ceVar2;
                ckVar2 = ckVar7;
                jl4 = jl42;
                vy0 = vy02;
                ckVar4 = ckVar5;
                g80 = g803;
                z3 = false;
                yt22.e0(-1457392515);
                yt22.r(false);
            }
            ml4 o2 = j45.o(jl4);
            au0 a3 = zt0.a(srVar, g80, yt22, z3 ? 1 : 0);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E3 = gw8.E(yt22, o2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar4, yt22, a3);
            g75.Q(ckVar3, yt22, m3);
            f21.s(hashCode2, yt22, ckVar2, yt22, ceVar);
            g75.Q(ckVar, yt22, E3);
            String u2 = l55.u(R.string.saldo_chip_ussd_regular, yt22);
            az72 = az7;
            if (az72 == az7.CONSULTAR_SALDO) {
                z4 = true;
            } else {
                z4 = z3;
            }
            int i10 = i6 & 896;
            if (i10 == 256) {
                z5 = true;
            } else {
                z5 = z3;
            }
            Object Q2 = yt22.Q();
            d63 d63 = ay0.a;
            if (z5 || Q2 == d63) {
                vr22 = vr2;
                Q2 = new zg1(21, vr22);
                yt22.o0(Q2);
            } else {
                vr22 = vr2;
            }
            K(u2, z4, (sr2) Q2, yt22, z3);
            String u3 = l55.u(R.string.saldo_chip_ussd_corp, yt22);
            if (az72 == az7.CONSULTAR_SALDO_CORP) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i10 == 256) {
                z7 = true;
            } else {
                z7 = z3;
            }
            Object Q3 = yt22.Q();
            if (z7 || Q3 == d63) {
                Q3 = new zg1(22, vr22);
                yt22.o0(Q3);
            }
            K(u3, z6, (sr2) Q3, yt22, z3);
            String u4 = l55.u(R.string.saldo_chip_ussd_tfa, yt22);
            if (az72 == az7.CONSULTAR_SALDO_TFA) {
                z8 = true;
            } else {
                z8 = z3;
            }
            if (i10 == 256) {
                z9 = true;
            } else {
                z9 = z3;
            }
            Object Q4 = yt22.Q();
            if (z9 || Q4 == d63) {
                Q4 = new zg1(23, vr22);
                yt22.o0(Q4);
            }
            K(u4, z8, (sr2) Q4, yt22, z3);
            yt22.r(true);
            yt22.r(true);
        } else {
            az72 = az7;
            vr22 = vr23;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new bi(i2, 18, (Object) str, (Object) az72, (Object) vr22);
        }
    }

    public static final void H(int i2, sr2 sr2, sr2 sr22, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, vr2 vr26, vr2 vr27, vr2 vr28, vr2 vr29, vr2 vr210, vr2 vr211, vr2 vr212, vr2 vr213, vr2 vr214, vr2 vr215, vr2 vr216, vr2 vr217, vr2 vr218, vr2 vr219, vr2 vr220, vr2 vr221, vr2 vr222, vr2 vr223, vr2 vr224, vr2 vr225, gs2 gs2, yt2 yt2, zn6 zn6, boolean z2, boolean z3) {
        int i3;
        boolean z4;
        vr2 vr226;
        boolean z5;
        boolean z6;
        int i4 = i2;
        sr2 sr23 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-1335888283);
        if ((i4 & 6) == 0) {
            i3 = (yt2.i(zn6) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            z4 = z2;
            i3 |= yt22.h(z4) ? 32 : 16;
        } else {
            z4 = z2;
        }
        if ((i4 & 384) == 0) {
            i3 |= yt22.i(sr23) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            vr226 = vr2;
            i3 |= yt22.i(vr226) ? 2048 : 1024;
        } else {
            vr226 = vr2;
        }
        char c2 = 16384;
        if ((i4 & 24576) == 0) {
            i3 |= yt22.i(vr22) ? 16384 : 8192;
        } else {
            vr2 vr227 = vr22;
        }
        char c3 = 0;
        vr2 vr228 = vr23;
        if ((i4 & 196608) == 0) {
            i3 |= yt22.i(vr228) ? 131072 : 65536;
        }
        char c4 = 0;
        vr2 vr229 = vr24;
        if ((i4 & 1572864) == 0) {
            i3 |= yt22.i(vr229) ? 1048576 : 524288;
        }
        char c5 = 0;
        vr2 vr230 = vr25;
        if ((i4 & 12582912) == 0) {
            i3 |= yt22.i(vr230) ? 8388608 : 4194304;
        }
        char c6 = 0;
        vr2 vr231 = vr26;
        if ((i4 & 100663296) == 0) {
            i3 |= yt22.i(vr231) ? 67108864 : 33554432;
        }
        char c7 = 0;
        vr2 vr232 = vr27;
        if ((i4 & 805306368) == 0) {
            i3 |= yt22.i(vr232) ? 536870912 : 268435456;
        }
        vr2 vr233 = vr28;
        vr2 vr234 = vr29;
        vr2 vr235 = vr210;
        vr2 vr236 = vr211;
        vr2 vr237 = vr212;
        char c8 = (yt22.i(vr233) ? (char) 4 : 2) | (yt22.i(vr234) ? ' ' : 16) | (yt22.i(vr235) ? (char) 256 : 128) | (yt22.i(vr236) ? (char) 2048 : 1024) | (yt22.i(vr237) ? (char) 16384 : 8192) | (yt22.i(vr213) ? (char) 0 : 0) | (yt22.i(vr214) ? (char) 0 : 0) | (yt22.i(vr215) ? (char) 0 : 0) | (yt22.i(gs2) ? (char) 0 : 0) | (yt22.i(vr216) ? (char) 0 : 0);
        char c9 = (yt22.i(vr217) ? (char) 4 : 2) | (yt22.i(vr218) ? ' ' : 16) | (yt22.i(vr219) ? (char) 256 : 128) | (yt22.i(vr220) ? (char) 2048 : 1024);
        if (!yt22.i(vr221)) {
            c2 = 8192;
        }
        char c10 = c9 | c2;
        if (yt22.i(vr222)) {
            c3 = 0;
        }
        char c11 = c10 | c3;
        if (yt22.i(vr223)) {
            c4 = 0;
        }
        char c12 = c11 | c4;
        if (yt22.i(vr224)) {
            c5 = 0;
        }
        char c13 = c12 | c5;
        if (yt22.i(vr225)) {
            c6 = 0;
        }
        char c14 = c13 | c6;
        if (yt22.i(sr22)) {
            c7 = 0;
        }
        boolean z7 = false;
        if (yt22.V(i3 & 1, ((i3 & 306783379) == 306783378 && (c8 & 9363) == 9362 && ((c14 | c7) & 9363) == 9362) ? false : true)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                qt0 qt0 = ch7.a;
                z6 = Build.VERSION.SDK_INT >= 31;
            } else {
                yt22.Y();
                z6 = z3;
            }
            yt22.s();
            if ((i3 & 896) == 256) {
                z7 = true;
            }
            Object Q2 = yt22.Q();
            if (z7 || Q2 == ay0.a) {
                Q2 = new gi0(10, sr23);
                yt22.o0(Q2);
            }
            vr2 vr238 = vr235;
            vr2 vr239 = vr232;
            vr2 vr240 = vr229;
            boolean z8 = z4;
            boolean z9 = z6;
            h03.c((sr2) Q2, new wu1(false, false, false, false, 231), su0.J(500225340, new fo6(zn6, sr2, z8, z9, vr226, vr22, vr23, vr240, vr230, vr231, vr239, vr233, vr234, vr238, vr236, vr237, vr213, vr214, vr215, gs2, vr216, vr217, vr218, vr219, vr220, vr221, vr222, vr223, vr224, vr225, sr22), yt22), yt22, 432);
            z5 = z9;
        } else {
            yt22.Y();
            z5 = z3;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new go6(i2, sr2, sr22, vr2, vr22, vr23, vr24, vr25, vr26, vr27, vr28, vr29, vr210, vr211, vr212, vr213, vr214, vr215, vr216, vr217, vr218, vr219, vr220, vr221, vr222, vr223, vr224, vr225, gs2, zn6, z2, z5);
        }
    }

    public static final void I(sr2 sr2, is2 is2, fq6 fq6, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z2;
        sr2.getClass();
        is2.getClass();
        yt2.g0(-1020360025);
        if (yt2.i(sr2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.g(is2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 128;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i6 & 1, z2)) {
            yt2.a0();
            if ((i2 & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    fq6 = (fq6) n85.p(b26.a.b(fq6.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i7 = i6 & -897;
            yt2.s();
            sg3.c((is7) hj8.n(fq6.d, yt2).getValue(), is2, su0.J(1144156940, new d13(sr2, fq6, hj8.n(fq6.e, yt2), 7), yt2), yt2, (i7 & 112) | 384);
        } else {
            yt2.Y();
        }
        fq6 fq62 = fq6;
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ou4(i2, 11, sr2, is2, fq62);
        }
    }

    public static final void J(String str, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(-488383235);
        if (yt22.g(str2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i4 & 1, z2)) {
            yf7.b(str2, x91.O(jl4.w, 0.0f, 16.0f, 0.0f, 8.0f, 5), 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(ch4.b)).b.h, yt2, (i4 & 14) | 48, 0, 131068);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new q20(i2, 14, str2);
        }
    }

    public static final void K(String str, boolean z2, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4 = z2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-409921150);
        String str2 = str;
        if (yt22.g(str2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (yt22.h(z4)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt22.i(sr22)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i8 & 1, z3)) {
            ml4 K2 = x91.K(su0.M(yu6.a, z4, new s86(3), sr22), 12.0f);
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, K2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            u55.a(z4, (sr2) null, (ml4) null, false, (uv5) null, yt22, ((i8 >> 3) & 14) | 48, 60);
            k75.a(yt22, yu6.p(jl4.w, 8.0f));
            yf7.b(str2, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, i8 & 14, 0, 262142);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new h13(str, z2, sr22, i2, 1);
        }
    }

    public static final void L(int i2, sr2 sr2, sr2 sr22, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, vr2 vr26, vr2 vr27, vr2 vr28, vr2 vr29, vr2 vr210, vr2 vr211, vr2 vr212, vr2 vr213, vr2 vr214, vr2 vr215, vr2 vr216, vr2 vr217, vr2 vr218, vr2 vr219, vr2 vr220, vr2 vr221, vr2 vr222, vr2 vr223, vr2 vr224, vr2 vr225, gs2 gs2, yt2 yt2, zn6 zn6, boolean z2, boolean z3) {
        vr2 vr226;
        vr2 vr227;
        vr2 vr228;
        vr2 vr229;
        zn6 zn62;
        gs2 gs22;
        vr2 vr230;
        aq4 aq4;
        String str;
        int i3;
        g80 g80;
        jl4 jl4;
        sr srVar;
        char c2;
        boolean z4;
        int i4;
        char c3;
        vr2 vr231;
        vr2 vr232 = vr22;
        vr2 vr233 = vr23;
        vr2 vr234 = vr26;
        vr2 vr235 = vr27;
        vr2 vr236 = vr28;
        vr2 vr237 = vr29;
        vr2 vr238 = vr210;
        vr2 vr239 = vr212;
        vr2 vr240 = vr213;
        vr2 vr241 = vr214;
        vr2 vr242 = vr217;
        vr2 vr243 = vr218;
        gs2 gs23 = gs2;
        yt2 yt22 = yt2;
        boolean z5 = z2;
        yt22.g0(1893959195);
        int i5 = 16;
        int i6 = 128;
        int i7 = 65536;
        int i8 = 524288;
        int i9 = 4194304;
        int i10 = 33554432;
        int i11 = 268435456;
        int i12 = i2 | (yt2.i(zn6) ? 32 : 16) | (yt22.h(z5) ? 256 : 128) | (yt22.i(vr232) ? 131072 : 65536) | (yt22.i(vr233) ? 1048576 : 524288) | (yt22.i(vr24) ? 8388608 : 4194304) | (yt22.i(vr25) ? 67108864 : 33554432) | (yt22.i(vr234) ? 536870912 : 268435456);
        int i13 = 1024;
        int i14 = 8192;
        char c4 = (yt22.i(vr235) ? (char) 4 : 2) | (yt22.i(vr236) ? ' ' : 16) | (yt22.i(vr237) ? (char) 256 : 128) | (yt22.i(vr238) ? (char) 2048 : 1024) | (yt22.i(vr211) ? (char) 16384 : 8192) | (yt22.i(vr239) ? (char) 0 : 0) | (yt22.i(vr240) ? (char) 0 : 0) | (yt22.i(vr241) ? (char) 0 : 0) | (yt22.i(gs23) ? (char) 0 : 0);
        int i15 = yt22.i(vr216) ? 4 : 2;
        if (yt22.i(vr242)) {
            i5 = 32;
        }
        int i16 = i15 | i5;
        if (yt22.i(vr243)) {
            i6 = 256;
        }
        int i17 = i16 | i6;
        if (yt22.i(vr219)) {
            i13 = 2048;
        }
        int i18 = i17 | i13;
        if (yt22.i(vr220)) {
            i14 = 16384;
        }
        int i19 = i18 | i14;
        if (yt22.i(vr221)) {
            i7 = 131072;
        }
        int i20 = i19 | i7;
        if (yt22.i(vr222)) {
            i8 = 1048576;
        }
        int i21 = i20 | i8;
        if (yt22.i(vr223)) {
            i9 = 8388608;
        }
        int i22 = i21 | i9;
        if (yt22.i(vr224)) {
            i10 = 67108864;
        }
        int i23 = i22 | i10;
        if (yt22.i(vr225)) {
            i11 = 536870912;
        }
        int i24 = i23 | i11;
        if (yt22.V(i12 & 1, ((i12 & 306774163) == 306774162 && (9363 & c4) == 9362 && (306783379 & i24) == 306783378) ? false : true)) {
            zn6 zn63 = zn6;
            xx3 xx3 = zn63.d;
            boolean z6 = zn63.l;
            xx3 xx32 = xx3;
            boolean z7 = zn63.r;
            boolean z8 = zn63.q;
            char c5 = c4;
            ae1 ae1 = zn63.c;
            boolean e2 = yt22.e(xx32.ordinal());
            Object Q2 = yt22.Q();
            boolean z9 = z6;
            Object obj = ay0.a;
            if (e2 || Q2 == obj) {
                Iterator it = xx3.a().iterator();
                int i25 = 0;
                while (true) {
                    e2 e2Var = (e2) it;
                    if (!e2Var.hasNext()) {
                        i25 = -1;
                        break;
                    }
                    Iterator it2 = it;
                    if (((xx3) e2Var.next()) == zn63.d) {
                        break;
                    }
                    i25++;
                    vr2 vr244 = vr28;
                    it = it2;
                }
                Q2 = o55.m(i25);
                yt22.o0(Q2);
            }
            bd5 bd5 = (bd5) Q2;
            J(l55.u(R.string.language, yt22), yt22, 0);
            jl4 jl42 = jl4.w;
            boolean z10 = z7;
            ml4 c6 = yu6.c(jl42);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(kl8.r(yt22));
            vf5 A2 = yt22.A();
            ml4 E2 = gw8.E(yt22, c6);
            ux0.d.getClass();
            boolean z11 = z8;
            vy0 b2 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b2);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, d2);
            g75.Q(tx0.f(), yt22, A2);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E2);
            ArrayList n0 = n0();
            int M2 = M(bd5);
            boolean g2 = yt22.g(bd5) | ((i12 & 3670016) == 1048576);
            Object Q3 = yt22.Q();
            if (g2 || Q3 == obj) {
                Q3 = new w34(26, vr233, bd5);
                yt22.o0(Q3);
            }
            i35.a(n0, M2, (vr2) Q3, (ml4) null, yt22, 0);
            yt22.t();
            J(l55.u(R.string.ussd_refresh_mode_title, yt22), yt22, 0);
            ml4 c7 = yu6.c(jl42);
            h80 h80 = xb4.I;
            rr rrVar = wr.a;
            ea6 a2 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode2 = Long.hashCode(kl8.r(yt22));
            vf5 A3 = yt22.A();
            ml4 E3 = gw8.E(yt22, c7);
            vy0 b3 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b3);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a2);
            g75.Q(tx0.f(), yt22, A3);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode2));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E3);
            String u2 = l55.u(R.string.ussd_refresh_mode_description, yt22);
            tg7 a3 = su0.x(yt22).a();
            long b4 = su0.r(yt22).b();
            ga6 ga6 = ga6.a;
            yf7.b(u2, ga6.b(jl42, 1.0f, true), b4, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, a3, yt22, 0, 0, 131064);
            k75.a(yt22, yu6.p(jl42, 8.0f));
            p97.a(zn63.d(), vr24, (ml4) null, false, (n97) null, yt22, (i12 >> 18) & 112, 124);
            yt22.t();
            ml4 c8 = yu6.c(jl42);
            ea6 a4 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode3 = Long.hashCode(kl8.r(yt22));
            vf5 A4 = yt22.A();
            ml4 E4 = gw8.E(yt22, c8);
            vy0 b5 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b5);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a4);
            g75.Q(tx0.f(), yt22, A4);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode3));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E4);
            yf7.b(l55.u(R.string.voice_ussd_description, yt22), ga6.b(jl42, 1.0f, true), su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131064);
            k75.a(yt22, yu6.p(jl42, 8.0f));
            p97.a(zn63.e(), vr216, (ml4) null, false, (n97) null, yt22, (i24 << 3) & 112, 124);
            yt22.t();
            J(l55.u(R.string.etecsa_banner_title, yt22), yt22, 0);
            ml4 c9 = yu6.c(jl42);
            ea6 a5 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode4 = Long.hashCode(kl8.r(yt22));
            vf5 A5 = yt22.A();
            ml4 E5 = gw8.E(yt22, c9);
            int i26 = hashCode4;
            vy0 b6 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b6);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a5);
            g75.Q(tx0.f(), yt22, A5);
            g75.Q(tx0.c(), yt22, Integer.valueOf(i26));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E5);
            yf7.b(l55.u(R.string.etecsa_banner_description, yt22), ga6.b(jl42, 1.0f, true), su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131064);
            k75.a(yt22, yu6.p(jl42, 8.0f));
            p97.a(zn63.c(), vr25, (ml4) null, false, (n97) null, yt22, (i12 >> 21) & 112, 124);
            yt22.t();
            Context context = (Context) yt22.k(ye.b);
            s8 s8Var = new s8(3);
            int i27 = i12 & 1879048192;
            boolean z12 = i27 == 536870912;
            Object Q4 = yt22.Q();
            if (z12 || Q4 == obj) {
                Q4 = new vz1(3, vr234);
                yt22.o0(Q4);
            }
            se4 N2 = tf4.N(s8Var, (vr2) Q4, yt22, 0);
            J(l55.u(R.string.plan_expiry_title, yt22), yt22, 0);
            ml4 c10 = yu6.c(jl42);
            ea6 a6 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode5 = Long.hashCode(kl8.r(yt22));
            vf5 A6 = yt22.A();
            ml4 E6 = gw8.E(yt22, c10);
            int i28 = i24;
            vy0 b7 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b7);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a6);
            g75.Q(tx0.f(), yt22, A6);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode5));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E6);
            ml4 a7 = ga6.b(jl42, 1.0f, true);
            g80 g802 = xb4.K;
            sr srVar2 = wr.c;
            au0 a8 = zt0.a(srVar2, g802, yt22, 0);
            int hashCode6 = Long.hashCode(kl8.r(yt22));
            vf5 A7 = yt22.A();
            ml4 E7 = gw8.E(yt22, a7);
            g80 g803 = g802;
            vy0 b8 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b8);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a8);
            g75.Q(tx0.f(), yt22, A7);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode6));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E7);
            yf7.b(l55.u(R.string.plan_expiry_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            if (!z2) {
                yt22.e0(-1189029699);
                yf7.b(l55.u(R.string.license_required, yt22), (ml4) null, su0.r(yt22).c(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).o, yt22, 0, 0, 131066);
                yt22.u();
            } else {
                yt22.e0(-1188803430);
                yt22.u();
            }
            yt22.t();
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean z13 = z2 || zn63.j;
            boolean z14 = zn63.j;
            boolean i29 = yt22.i(context) | yt22.i(N2) | (i27 == 536870912);
            Object Q5 = yt22.Q();
            if (i29 || Q5 == obj) {
                Q5 = new g5((Object) context, (Object) N2, vr234, 26);
                yt22.o0(Q5);
            }
            p97.a(z14, (vr2) Q5, (ml4) null, z13, (n97) null, yt22, 0, 108);
            yt22.t();
            String u3 = l55.u(R.string.app_lock_unavailable, yt22);
            J(l55.u(R.string.app_lock_title, yt22), yt22, 0);
            ml4 c11 = yu6.c(jl42);
            ea6 a9 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode7 = Long.hashCode(kl8.r(yt22));
            vf5 A8 = yt22.A();
            ml4 E8 = gw8.E(yt22, c11);
            vy0 b9 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b9);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a9);
            g75.Q(tx0.f(), yt22, A8);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode7));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E8);
            yf7.b(l55.u(R.string.app_lock_description, yt22), ga6.b(jl42, 1.0f, true), su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131064);
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean a10 = zn63.a();
            boolean i30 = yt22.i(context) | yt22.g(u3) | ((c5 & 14) == 4);
            Object Q6 = yt22.Q();
            if (i30 || Q6 == obj) {
                Q6 = new g5((Object) context, (Object) u3, vr27, 27);
                yt22.o0(Q6);
            } else {
                vr2 vr245 = vr27;
            }
            p97.a(a10, (vr2) Q6, (ml4) null, false, (n97) null, yt22, 0, 124);
            yt22.t();
            d37 d37 = SpeedOverlayService.K;
            aq4 n2 = hj8.n(i95.w(), yt22);
            J(l55.u(R.string.speed_overlay_title, yt22), yt22, 0);
            ml4 c12 = yu6.c(jl42);
            ea6 a11 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode8 = Long.hashCode(kl8.r(yt22));
            vf5 A9 = yt22.A();
            ml4 E9 = gw8.E(yt22, c12);
            vy0 b10 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b10);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a11);
            g75.Q(tx0.f(), yt22, A9);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode8));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E9);
            ml4 a12 = ga6.b(jl42, 1.0f, true);
            g80 g804 = g803;
            au0 a13 = zt0.a(srVar2, g804, yt22, 0);
            int hashCode9 = Long.hashCode(kl8.r(yt22));
            vf5 A10 = yt22.A();
            ml4 E10 = gw8.E(yt22, a12);
            vy0 b11 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b11);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a13);
            g75.Q(tx0.f(), yt22, A10);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode9));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E10);
            yf7.b(l55.u(R.string.speed_overlay_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            if (!z2) {
                yt22.e0(584323327);
                yf7.b(l55.u(R.string.license_required, yt22), (ml4) null, su0.r(yt22).c(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).o, yt22, 0, 0, 131066);
                yt22.u();
            } else {
                yt22.e0(584549596);
                yt22.u();
            }
            yt22.t();
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean z15 = z2 || ((Boolean) n2.getValue()).booleanValue();
            boolean booleanValue = ((Boolean) n2.getValue()).booleanValue();
            boolean i31 = yt22.i(context) | yt22.g(n2);
            Object Q7 = yt22.Q();
            if (i31 || Q7 == obj) {
                Q7 = new w34(27, context, n2);
                yt22.o0(Q7);
            }
            p97.a(booleanValue, (vr2) Q7, (ml4) null, z15, (n97) null, yt22, 0, 108);
            yt22.t();
            ml4 c13 = yu6.c(jl42);
            ea6 a14 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode10 = Long.hashCode(kl8.r(yt22));
            vf5 A11 = yt22.A();
            ml4 E11 = gw8.E(yt22, c13);
            vy0 b12 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b12);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a14);
            g75.Q(tx0.f(), yt22, A11);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode10));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E11);
            ml4 a15 = ga6.b(jl42, 1.0f, true);
            au0 a16 = zt0.a(srVar2, g804, yt22, 0);
            int hashCode11 = Long.hashCode(kl8.r(yt22));
            vf5 A12 = yt22.A();
            ml4 E12 = gw8.E(yt22, a15);
            vy0 b13 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b13);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a16);
            g75.Q(tx0.f(), yt22, A12);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode11));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E12);
            yf7.b(l55.u(R.string.speed_overlay_auto_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            yt22.t();
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean z16 = z2 || zn63.w;
            boolean z17 = zn63.w;
            int i32 = i28;
            boolean i33 = ((i32 & 896) == 256) | yt22.i(context);
            Object Q8 = yt22.Q();
            if (i33 || Q8 == obj) {
                Q8 = new w34(28, vr218, context);
                yt22.o0(Q8);
            } else {
                vr2 vr246 = vr218;
            }
            p97.a(z17, (vr2) Q8, (ml4) null, z16, (n97) null, yt22, 0, 108);
            yt22.t();
            d37 d372 = BalanceNotificationService.E;
            aq4 n3 = hj8.n(gr8.O(), yt22);
            s8 s8Var2 = new s8(3);
            boolean i34 = yt22.i(context);
            Object Q9 = yt22.Q();
            if (i34 || Q9 == obj) {
                Q9 = new ju4(context, 3);
                yt22.o0(Q9);
            }
            se4 N3 = tf4.N(s8Var2, (vr2) Q9, yt22, 0);
            J(l55.u(R.string.balance_notification_title, yt22), yt22, 0);
            ml4 c14 = yu6.c(jl42);
            aq4 aq42 = n3;
            ea6 a17 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode12 = Long.hashCode(kl8.r(yt22));
            vf5 A13 = yt22.A();
            ml4 E13 = gw8.E(yt22, c14);
            vy0 b14 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b14);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a17);
            g75.Q(tx0.f(), yt22, A13);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode12));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E13);
            ml4 a18 = ga6.b(jl42, 1.0f, true);
            au0 a19 = zt0.a(srVar2, g804, yt22, 0);
            int hashCode13 = Long.hashCode(kl8.r(yt22));
            vf5 A14 = yt22.A();
            ml4 E14 = gw8.E(yt22, a18);
            vy0 b15 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b15);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a19);
            g75.Q(tx0.f(), yt22, A14);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode13));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E14);
            yf7.b(l55.u(R.string.balance_notification_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            if (!z2) {
                yt22.e0(-1937285983);
                yf7.b(l55.u(R.string.license_required, yt22), (ml4) null, su0.r(yt22).c(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).o, yt22, 0, 0, 131066);
                yt22.u();
            } else {
                yt22.e0(-1937059714);
                yt22.u();
            }
            yt22.t();
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean z18 = z2 || ((Boolean) aq42.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) aq42.getValue()).booleanValue();
            boolean i35 = yt22.i(context) | yt22.i(N3);
            Object Q10 = yt22.Q();
            if (i35 || Q10 == obj) {
                Q10 = new io6(context, N3, 1);
                yt22.o0(Q10);
            }
            p97.a(booleanValue2, (vr2) Q10, (ml4) null, z18, (n97) null, yt22, 0, 108);
            yt22.t();
            d37 d373 = UssdAutoUpdaterService.T;
            aq4 n4 = hj8.n(k75.l(), yt22);
            s8 s8Var3 = new s8(2);
            int i36 = i32 & 7168;
            boolean z19 = i36 == 2048;
            Object Q11 = yt22.Q();
            if (z19 || Q11 == obj) {
                vr230 = vr219;
                Q11 = new vz1(4, vr230);
                yt22.o0(Q11);
            } else {
                vr230 = vr219;
            }
            se4 N4 = tf4.N(s8Var3, (vr2) Q11, yt22, 0);
            Object Q12 = yt22.Q();
            if (Q12 == obj) {
                n74 m2 = sg3.m();
                m2.add("android.permission.CALL_PHONE");
                m2.add("android.permission.READ_PHONE_STATE");
                m2.add("android.permission.READ_SMS");
                m2.add("android.permission.PROCESS_OUTGOING_CALLS");
                aq4 = n4;
                if (Build.VERSION.SDK_INT >= 33) {
                    m2.add("android.permission.POST_NOTIFICATIONS");
                }
                Q12 = sg3.i(m2);
                yt22.o0(Q12);
            } else {
                aq4 = n4;
            }
            List list = (List) Q12;
            J(l55.u(R.string.ussd_auto_title, yt22), yt22, 0);
            ml4 c15 = yu6.c(jl42);
            String str2 = "android.permission.READ_PHONE_STATE";
            ea6 a20 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode14 = Long.hashCode(kl8.r(yt22));
            vf5 A15 = yt22.A();
            ml4 E15 = gw8.E(yt22, c15);
            h80 h802 = h80;
            vy0 b16 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b16);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a20);
            g75.Q(tx0.f(), yt22, A15);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode14));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E15);
            ml4 a21 = ga6.b(jl42, 1.0f, true);
            au0 a22 = zt0.a(srVar2, g804, yt22, 0);
            int hashCode15 = Long.hashCode(kl8.r(yt22));
            vf5 A16 = yt22.A();
            ml4 E16 = gw8.E(yt22, a21);
            int i37 = hashCode15;
            vy0 b17 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b17);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a22);
            g75.Q(tx0.f(), yt22, A16);
            g75.Q(tx0.c(), yt22, Integer.valueOf(i37));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E16);
            yf7.b(l55.u(R.string.ussd_auto_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(1096960606);
                str = l55.u(R.string.ussd_auto_status_running, yt22);
                yt22.u();
            } else {
                yt22.e0(1097062782);
                str = l55.u(R.string.ussd_auto_status_stopped, yt22);
                yt22.u();
            }
            yf7.b(l55.v(R.string.ussd_auto_running_status, new Object[]{str}, yt22), (ml4) null, su0.r(yt22).c(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).o, yt22, 0, 0, 131066);
            yt22.t();
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean booleanValue3 = ((Boolean) aq4.getValue()).booleanValue();
            boolean i38 = (i36 == 2048) | yt22.i(list) | yt22.i(context) | yt22.i(N4);
            Object Q13 = yt22.Q();
            if (i38 || Q13 == obj) {
                Q13 = new qj(vr230, list, N4, context);
                yt22.o0(Q13);
            }
            p97.a(booleanValue3, (vr2) Q13, (ml4) null, false, (n97) null, yt22, 0, 124);
            yt22.t();
            zn6 zn64 = zn6;
            zn62 = zn64;
            ie1.d(((Boolean) aq4.getValue()).booleanValue(), (ml4) null, (n52) null, (x82) null, (String) null, su0.J(33555523, new ho6(zn64, vr220, vr221, vr222, vr223, vr225, vr224), yt22), yt22, 1572870, 30);
            d37 d374 = GsmNetworkService.D;
            aq4 n5 = hj8.n(r0(), yt22);
            s8 s8Var4 = new s8(2);
            boolean i39 = yt22.i(context);
            Object Q14 = yt22.Q();
            if (i39 || Q14 == obj) {
                Q14 = new ju4(context, 2);
                yt22.o0(Q14);
            }
            se4 N5 = tf4.N(s8Var4, (vr2) Q14, yt22, 0);
            J(l55.u(R.string.gsm_monitor_title, yt22), yt22, 0);
            ml4 c16 = yu6.c(jl42);
            ea6 a23 = ca6.a(rrVar, h802, yt22, 48);
            int hashCode16 = Long.hashCode(kl8.r(yt22));
            vf5 A17 = yt22.A();
            ml4 E17 = gw8.E(yt22, c16);
            vy0 b18 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b18);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a23);
            g75.Q(tx0.f(), yt22, A17);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode16));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E17);
            yf7.b(l55.u(R.string.gsm_monitor_description, yt22), ga6.b(jl42, 1.0f, true), su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131064);
            k75.a(yt22, yu6.p(jl42, 8.0f));
            boolean N6 = N(n5);
            boolean i40 = yt22.i(context) | yt22.i(N5);
            Object Q15 = yt22.Q();
            if (i40 || Q15 == obj) {
                Q15 = new io6(context, N5, 0);
                yt22.o0(Q15);
            }
            p97.a(N6, (vr2) Q15, (ml4) null, false, (n97) null, yt22, 0, 124);
            yt22.t();
            J(l55.u(R.string.call_alert_title, yt22), yt22, 0);
            yf7.b(l55.u(R.string.call_alert_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            Object Q16 = yt22.Q();
            if (Q16 == obj) {
                Q16 = u55.p((Object) null);
                yt22.o0(Q16);
            }
            aq4 aq43 = (aq4) Q16;
            s8 s8Var5 = new s8(2);
            Object Q17 = yt22.Q();
            if (Q17 == obj) {
                Q17 = new t46(aq43, 3);
                yt22.o0(Q17);
            }
            se4 N7 = tf4.N(s8Var5, (vr2) Q17, yt22, 48);
            boolean i41 = yt22.i(context) | yt22.i(N7);
            Object Q18 = yt22.Q();
            if (i41 || Q18 == obj) {
                Q18 = new jo6(context, N7, aq43, 0);
                yt22.o0(Q18);
            }
            gs2 gs24 = (gs2) Q18;
            String u4 = l55.u(R.string.call_alert_all, yt22);
            boolean g3 = yt22.g(gs24) | ((c5 & 0) == 0);
            Object Q19 = yt22.Q();
            if (g3 || Q19 == obj) {
                i3 = 0;
                Q19 = new ko6(gs24, vr213, 0);
                yt22.o0(Q19);
            } else {
                vr2 vr247 = vr213;
                i3 = 0;
            }
            boolean z20 = z11;
            F(u4, z20, (vr2) Q19, yt22, i3);
            String u5 = l55.u(R.string.call_alert_revertida, yt22);
            boolean g4 = yt22.g(gs24) | ((c5 & 0) == 0);
            Object Q20 = yt22.Q();
            if (g4 || Q20 == obj) {
                Q20 = new ko6(gs24, vr214, 1);
                yt22.o0(Q20);
            } else {
                vr2 vr248 = vr214;
            }
            boolean z21 = z10;
            F(u5, z21, (vr2) Q20, yt22, 0);
            ie1.d(z20 || z21, (ml4) null, (n52) null, (x82) null, (String) null, su0.J(-800475028, new gc5(1, (Object) zn62, (Object) vr217), yt22), yt22, 1572870, 30);
            J(l55.u(R.string.call_block_title, yt22), yt22, 0);
            yf7.b(l55.u(R.string.call_block_description, yt22), (ml4) null, su0.r(yt22).b(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).a(), yt22, 0, 0, 131066);
            int i42 = Build.VERSION.SDK_INT;
            if (i42 >= 29) {
                yt22.e0(-23690976);
                Object Q21 = yt22.Q();
                if (Q21 == obj) {
                    Q21 = u55.p((Object) null);
                    yt22.o0(Q21);
                }
                aq4 aq44 = (aq4) Q21;
                s8 s8Var6 = new s8(4);
                Object Q22 = yt22.Q();
                if (Q22 == obj) {
                    Q22 = new t46(aq44, 4);
                    yt22.o0(Q22);
                }
                se4 N8 = tf4.N(s8Var6, (vr2) Q22, yt22, 48);
                boolean i43 = yt22.i(context) | yt22.i(N8);
                Object Q23 = yt22.Q();
                if (i43 || Q23 == obj) {
                    Q23 = new jo6(context, N8, aq44, 1);
                    yt22.o0(Q23);
                }
                gs2 gs25 = (gs2) Q23;
                Object Q24 = yt22.Q();
                if (Q24 == obj) {
                    Q24 = u55.p((Object) null);
                    yt22.o0(Q24);
                }
                aq4 aq45 = (aq4) Q24;
                aq4 aq46 = aq44;
                s8 s8Var7 = new s8(3);
                Object Q25 = yt22.Q();
                if (Q25 == obj) {
                    Q25 = new t46(aq45, 5);
                    yt22.o0(Q25);
                }
                se4 N9 = tf4.N(s8Var7, (vr2) Q25, yt22, 48);
                String u6 = l55.u(R.string.call_block_anonymous, yt22);
                aq4 aq47 = aq45;
                boolean g5 = ((c5 & 'p') == ' ') | yt22.g(gs25);
                Object Q26 = yt22.Q();
                if (g5 || Q26 == obj) {
                    Q26 = new ko6(gs25, vr28, 2);
                    yt22.o0(Q26);
                } else {
                    vr2 vr249 = vr28;
                }
                F(u6, z9, (vr2) Q26, yt22, 0);
                String u7 = l55.u(R.string.call_block_revertida, yt22);
                boolean z22 = zn62.m;
                char c17 = c5;
                jl4 = jl42;
                boolean g6 = yt22.g(gs25) | ((c17 & 896) == 256);
                Object Q27 = yt22.Q();
                if (g6 || Q27 == obj) {
                    vr229 = vr29;
                    Q27 = new ko6(gs25, vr229, 3);
                    yt22.o0(Q27);
                } else {
                    vr229 = vr29;
                }
                F(u7, z22, (vr2) Q27, yt22, 0);
                String u8 = l55.u(R.string.call_block_fijo, yt22);
                boolean z23 = zn62.n;
                boolean g7 = yt22.g(gs25) | ((c17 & 7168) == 2048);
                Object Q28 = yt22.Q();
                if (g7 || Q28 == obj) {
                    vr228 = vr210;
                    c3 = c17;
                    Q28 = new ko6(gs25, vr228, 4);
                    yt22.o0(Q28);
                } else {
                    vr228 = vr210;
                    c3 = c17;
                }
                F(u8, z23, (vr2) Q28, yt22, 0);
                String u9 = l55.u(R.string.call_block_unknown, yt22);
                boolean z24 = zn62.o;
                Context context2 = context;
                boolean i44 = ((c3 & 57344) == 16384) | yt22.i(context) | yt22.i(N9) | yt22.i(N8);
                Object Q29 = yt22.Q();
                if (i44 || Q29 == obj) {
                    Q29 = new na0(vr211, context2, N9, N8, aq47, aq46, 3);
                    context = context2;
                    yt22.o0(Q29);
                } else {
                    context = context2;
                }
                F(u9, z24, (vr2) Q29, yt22, 0);
                String u10 = l55.u(R.string.call_block_all, yt22);
                boolean z25 = zn62.p;
                boolean g8 = yt22.g(gs25) | ((c3 & 0) == 0);
                Object Q30 = yt22.Q();
                if (g8 || Q30 == obj) {
                    vr231 = vr212;
                    Q30 = new ko6(gs25, vr231, 5);
                    yt22.o0(Q30);
                } else {
                    vr231 = vr212;
                }
                F(u10, z25, (vr2) Q30, yt22, 0);
                yt22.u();
                g80 = g804;
                vr226 = vr231;
                srVar = srVar2;
                c2 = c3;
            } else {
                vr2 vr250 = vr28;
                vr229 = vr29;
                vr2 vr251 = vr212;
                c2 = c5;
                boolean z26 = z9;
                jl4 = jl42;
                vr228 = vr210;
                if (i42 >= 28) {
                    yt22.e0(-20041253);
                    Object Q31 = yt22.Q();
                    if (Q31 == obj) {
                        Q31 = u55.p((Object) null);
                        yt22.o0(Q31);
                    }
                    aq4 aq48 = (aq4) Q31;
                    s8 s8Var8 = new s8(2);
                    Object Q32 = yt22.Q();
                    if (Q32 == obj) {
                        Q32 = new t46(aq48, 6);
                        yt22.o0(Q32);
                    }
                    se4 N10 = tf4.N(s8Var8, (vr2) Q32, yt22, 48);
                    Object Q33 = yt22.Q();
                    String[] strArr = Q33;
                    if (Q33 == obj) {
                        String[] strArr2 = {str2, "android.permission.READ_CALL_LOG", "android.permission.ANSWER_PHONE_CALLS"};
                        yt22.o0(strArr2);
                        strArr = strArr2;
                    }
                    String[] strArr3 = (String[]) strArr;
                    boolean i45 = yt22.i(strArr3) | yt22.i(context) | yt22.i(N10);
                    Object Q34 = yt22.Q();
                    if (i45 || Q34 == obj) {
                        Q34 = new q60(strArr3, N10, context, aq48);
                        yt22.o0(Q34);
                    }
                    gs2 gs26 = (gs2) Q34;
                    aq4 aq49 = aq48;
                    Object Q35 = yt22.Q();
                    if (Q35 == obj) {
                        Q35 = u55.p((Object) null);
                        yt22.o0(Q35);
                    }
                    aq4 aq410 = (aq4) Q35;
                    g80 = g804;
                    srVar = srVar2;
                    s8 s8Var9 = new s8(3);
                    Object Q36 = yt22.Q();
                    if (Q36 == obj) {
                        Q36 = new t46(aq410, 7);
                        yt22.o0(Q36);
                    }
                    se4 N11 = tf4.N(s8Var9, (vr2) Q36, yt22, 48);
                    String u11 = l55.u(R.string.call_block_anonymous, yt22);
                    aq4 aq411 = aq410;
                    boolean g9 = yt22.g(gs26) | ((c2 & 'p') == ' ');
                    Object Q37 = yt22.Q();
                    if (g9 || Q37 == obj) {
                        Q37 = new ko6(gs26, vr250, 6);
                        yt22.o0(Q37);
                    }
                    F(u11, z26, (vr2) Q37, yt22, 0);
                    String u12 = l55.u(R.string.call_block_revertida, yt22);
                    boolean z27 = zn62.m;
                    boolean g10 = ((c2 & 896) == 256) | yt22.g(gs26);
                    Object Q38 = yt22.Q();
                    if (g10 || Q38 == obj) {
                        Q38 = new ko6(gs26, vr229, 7);
                        yt22.o0(Q38);
                    }
                    F(u12, z27, (vr2) Q38, yt22, 0);
                    String u13 = l55.u(R.string.call_block_fijo, yt22);
                    boolean z28 = zn62.n;
                    boolean g11 = yt22.g(gs26) | ((c2 & 7168) == 2048);
                    Object Q39 = yt22.Q();
                    if (g11 || Q39 == obj) {
                        Q39 = new ko6(gs26, vr228, 8);
                        yt22.o0(Q39);
                    }
                    F(u13, z28, (vr2) Q39, yt22, 0);
                    String u14 = l55.u(R.string.call_block_unknown, yt22);
                    boolean z29 = zn62.o;
                    boolean i46 = yt22.i(context) | yt22.i(N11) | yt22.i(strArr3) | yt22.i(N10) | ((c2 & 57344) == 16384);
                    Object Q40 = yt22.Q();
                    if (i46 || Q40 == obj) {
                        Q40 = new zf1(vr211, context, N11, strArr3, N10, aq411, aq49);
                        yt22.o0(Q40);
                    }
                    F(u14, z29, (vr2) Q40, yt22, 0);
                    String u15 = l55.u(R.string.call_block_all, yt22);
                    boolean z30 = zn62.p;
                    boolean g12 = yt22.g(gs26) | ((c2 & 0) == 0);
                    Object Q41 = yt22.Q();
                    if (g12 || Q41 == obj) {
                        vr226 = vr212;
                        Q41 = new ko6(gs26, vr226, 9);
                        yt22.o0(Q41);
                    } else {
                        vr226 = vr212;
                    }
                    F(u15, z30, (vr2) Q41, yt22, 0);
                    yt22.u();
                } else {
                    g80 = g804;
                    vr226 = vr251;
                    srVar = srVar2;
                    yt22.e0(-16594332);
                    yf7.b(l55.u(R.string.call_block_unavailable, yt22), (ml4) null, su0.r(yt22).c(), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).o, yt22, 0, 0, 131066);
                    yt22.u();
                }
            }
            Object Q42 = yt22.Q();
            if (Q42 == obj) {
                Q42 = Boolean.valueOf(sg3.B(context));
                yt22.o0(Q42);
            }
            boolean booleanValue4 = ((Boolean) Q42).booleanValue();
            J(l55.u(R.string.saldo_chip_section_title, yt22), yt22, 0);
            if (booleanValue4) {
                yt22.e0(-15079238);
                String u16 = l55.u(R.string.saldo_chip_ussd_label_line_1, yt22);
                az7 az7 = zn62.s;
                char c18 = c2 & 0;
                boolean z31 = c18 == 0;
                Object Q43 = yt22.Q();
                if (z31 || Q43 == obj) {
                    gs22 = gs2;
                    i4 = 0;
                    Q43 = new lo6(0, gs22);
                    yt22.o0(Q43);
                } else {
                    gs22 = gs2;
                    i4 = 0;
                }
                G(u16, az7, (vr2) Q43, yt22, i4);
                String u17 = l55.u(R.string.saldo_chip_ussd_label_line_2, yt22);
                az7 b19 = zn62.b();
                boolean z32 = c18 == 0;
                Object Q44 = yt22.Q();
                if (z32 || Q44 == obj) {
                    z4 = true;
                    Q44 = new lo6(1, gs22);
                    yt22.o0(Q44);
                } else {
                    z4 = true;
                }
                G(u17, b19, (vr2) Q44, yt22, 0);
                yt22.u();
            } else {
                gs22 = gs2;
                z4 = true;
                yt22.e0(-14655778);
                az7 az72 = zn62.s;
                boolean z33 = (c2 & 0) == 0;
                Object Q45 = yt22.Q();
                if (z33 || Q45 == obj) {
                    Q45 = new lo6(2, gs22);
                    yt22.o0(Q45);
                }
                G((String) null, az72, (vr2) Q45, yt22, 6);
                yt22.u();
            }
            J(l55.u(R.string.dark_mode_preference, yt22), yt22, 0);
            ml4 o2 = j45.o(jl4);
            au0 a24 = zt0.a(srVar, g80, yt22, 0);
            int hashCode17 = Long.hashCode(kl8.r(yt22));
            vf5 A18 = yt22.A();
            ml4 E18 = gw8.E(yt22, o2);
            vy0 b20 = tx0.b();
            yt22.i0();
            if (yt22.E()) {
                yt22.l(b20);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.d(), yt22, a24);
            g75.Q(tx0.f(), yt22, A18);
            g75.Q(tx0.c(), yt22, Integer.valueOf(hashCode17));
            g75.O(yt22, tx0.a());
            g75.Q(tx0.e(), yt22, E18);
            String u18 = l55.u(R.string.dark_mode_config_system_default, yt22);
            ae1 ae12 = ae1;
            boolean z34 = ae12 == ae1.w ? z4 : false;
            int i47 = i12 & 458752;
            boolean z35 = i47 == 131072 ? z4 : false;
            Object Q46 = yt22.Q();
            if (z35 || Q46 == obj) {
                vr227 = vr22;
                Q46 = new zg1(24, vr227);
                yt22.o0(Q46);
            } else {
                vr227 = vr22;
            }
            K(u18, z34, (sr2) Q46, yt22, 0);
            String u19 = l55.u(R.string.dark_mode_config_light, yt22);
            boolean z36 = ae12 == ae1.x ? z4 : false;
            boolean z37 = i47 == 131072 ? z4 : false;
            Object Q47 = yt22.Q();
            if (z37 || Q47 == obj) {
                Q47 = new zg1(25, vr227);
                yt22.o0(Q47);
            }
            K(u19, z36, (sr2) Q47, yt22, 0);
            String u20 = l55.u(R.string.dark_mode_config_dark, yt22);
            boolean z38 = ae12 == ae1.y ? z4 : false;
            boolean z39 = i47 == 131072 ? z4 : false;
            Object Q48 = yt22.Q();
            if (z39 || Q48 == obj) {
                Q48 = new zg1(26, vr227);
                yt22.o0(Q48);
            }
            K(u20, z38, (sr2) Q48, yt22, 0);
            String u21 = l55.u(R.string.dark_mode_config_amoled, yt22);
            boolean z40 = ae12 == ae1.z ? z4 : false;
            if (i47 != 131072) {
                z4 = false;
            }
            Object Q49 = yt22.Q();
            if (z4 || Q49 == obj) {
                Q49 = new zg1(27, vr227);
                yt22.o0(Q49);
            }
            K(u21, z40, (sr2) Q49, yt22, 0);
            yt22.t();
        } else {
            vr228 = vr210;
            vr226 = vr212;
            gs22 = gs2;
            zn62 = zn6;
            vr229 = vr237;
            vr227 = vr22;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.e(new fo6(i2, sr2, sr22, vr2, vr227, vr23, vr24, vr25, vr26, vr27, vr28, vr229, vr228, vr211, vr226, vr213, vr214, vr215, vr216, vr217, vr218, vr219, vr220, vr221, vr222, vr223, vr224, vr225, gs22, zn62, z2, z3));
        }
    }

    public static final int M(bd5 bd5) {
        return bd5.d();
    }

    public static final boolean N(aq4 aq4) {
        return ((Boolean) aq4.getValue()).booleanValue();
    }

    public static final void O(Context context, se4 se4, se4 se42, aq4 aq4, aq4 aq42, vr2 vr2, boolean z2) {
        RoleManager c2 = nd.c(context.getSystemService(nd.g()));
        if (!z2) {
            vr2.y(Boolean.FALSE);
        } else if (!sg3.A(context, "android.permission.READ_CONTACTS")) {
            se4 se43 = se4;
            aq4 aq43 = aq4;
            aq43.setValue(new zo2(vr2, context, se43, se42, aq43, aq42));
            se43.d0("android.permission.READ_CONTACTS");
        } else {
            se4 se44 = se42;
            aq4 aq44 = aq42;
            vr2 vr22 = vr2;
            if (c2 != null && c2.isRoleHeld("android.app.role.CALL_SCREENING")) {
                vr22.y(Boolean.TRUE);
            } else if (c2 != null) {
                aq44.setValue(new zg1(18, vr22));
                Intent e2 = c2.createRequestRoleIntent("android.app.role.CALL_SCREENING");
                e2.getClass();
                se44.d0(e2);
            }
        }
    }

    public static final void P(Context context, se4 se4, String[] strArr, se4 se42, aq4 aq4, aq4 aq42, vr2 vr2, boolean z2) {
        if (!z2) {
            vr2.y(Boolean.FALSE);
        } else if (!sg3.A(context, "android.permission.READ_CONTACTS")) {
            aq4.setValue(new mo6(vr2, context, se4, strArr, se42, aq4, aq42));
            se4.d0("android.permission.READ_CONTACTS");
        } else {
            for (String A2 : strArr) {
                if (!sg3.A(context, A2)) {
                    aq42.setValue(new f17(1, vr2));
                    se42.d0(strArr);
                    return;
                }
            }
            vr2.y(Boolean.TRUE);
        }
    }

    public static final void Q(String str, jy7 jy7, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        yt2.g0(-1429535015);
        if (yt2.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (yt2.e(jy7.ordinal())) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt2.i(vr2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i8 & 1, z2)) {
            Object Q2 = yt2.Q();
            Object obj = ay0.a;
            if (Q2 == obj) {
                Q2 = u55.p(Boolean.FALSE);
                yt2.o0(Q2);
            }
            aq4 aq4 = (aq4) Q2;
            boolean booleanValue = ((Boolean) aq4.getValue()).booleanValue();
            Object Q3 = yt2.Q();
            if (Q3 == obj) {
                Q3 = new t46(aq4, 2);
                yt2.o0(Q3);
            }
            fd1.g(booleanValue, (vr2) Q3, (ml4) null, su0.J(335438339, new uo2((Object) jy7, (Object) str, (Object) aq4, (Object) vr2, 3), yt2), yt2, 3120);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ou4(i2, 10, str, jy7, vr2);
        }
    }

    public static final void R(String str, String str2, vr2 vr2, boolean z2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        bt3 bt3;
        String str3 = str;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-1661626131);
        if (yt22.g(str3)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        String str4 = str2;
        if (yt22.g(str4)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt22.i(vr22)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        boolean z4 = false;
        if ((i8 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i8 & 1, z3)) {
            Object Q2 = yt22.Q();
            d63 d63 = ay0.a;
            if (Q2 == d63) {
                Q2 = u55.p(str4);
                yt22.o0(Q2);
            }
            aq4 aq4 = (aq4) Q2;
            String str5 = (String) aq4.getValue();
            if (z2) {
                bt3 = new bt3(3, 0, 123);
            } else {
                bt3 = new bt3(4, 0, 123);
            }
            ml4 M2 = x91.M(yu6.a, 0.0f, 4.0f, 1);
            if ((i8 & 896) == 256) {
                z4 = true;
            }
            Object Q3 = yt22.Q();
            if (z4 || Q3 == d63) {
                Q3 = new no2(vr22, aq4, 5);
                yt22.o0(Q3);
            }
            vr2 vr23 = (vr2) Q3;
            z85.b(str5, vr23, M2, false, false, (tg7) null, su0.J(897076743, new q20(str3, 15), yt22), (gs2) null, (gs2) null, (gs2) null, (gs2) null, false, (m78) null, bt3, (zs3) null, true, 0, 0, (pq6) null, (yd7) null, yt22, 1573248, 12582912, 0, 8224696);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ai0(str3, str2, vr22, z2, i2);
        }
    }

    public static final ExecutorService S(boolean z2) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new b11(z2));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static void T(Context context) {
        if (W == null) {
            i88 i88 = new i88(context);
            W = i88;
            synchronized (i88.a) {
                i88.g = true;
            }
        }
    }

    public static final void U(int i2, int i3) {
        if (i2 != i3) {
            h.q(pb4.k("Class declares ", i2, " type parameters, but ", i3, " were provided."));
        }
    }

    public static final void V(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            h.l(b81.l(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void W(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            h.l(b81.l(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void X(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            ku4.d(i4, pb4.p("fromIndex: ", i2, ", toIndex: ", i3, ", size: "));
        } else if (i2 > i3) {
            h.q(b81.l(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void Y(Intent intent) {
        synchronized (V) {
            try {
                if (W != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    W.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long[] Z(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static final void a0(int i2, int i3) {
        if (i2 > i3) {
            h.l(pb4.k("toIndex (", i2, ") is greater than size (", i3, ")."));
        }
    }

    public static final c2 b0(vq3 vq3, List list, boolean z2, List list2) {
        vq3.getClass();
        list.getClass();
        list2.getClass();
        return d0(vq3, list, z2, list2, (gq3) null);
    }

    public static /* synthetic */ c2 c0(vq3 vq3, List list, boolean z2, int i2) {
        int i3 = i2 & 1;
        a42 a42 = a42.w;
        if (i3 != 0) {
            list = a42;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return b0(vq3, list, z2, a42);
    }

    public static final c2 d0(vq3 vq3, List list, boolean z2, List list2, gq3 gq3) {
        gq3 gq32;
        vq0 vq0;
        vw3 vw3;
        int i2;
        p27 p27;
        vq3.getClass();
        list.getClass();
        list2.getClass();
        List list3 = null;
        if (oa7.a) {
            if (vq3 instanceof oq3) {
                vq0 = ((oq3) vq3).c0();
                if (gq3 != null) {
                    vp2 f2 = rs1.f(vq0);
                    String str = tj3.a;
                    up2 i3 = tj3.i(f2);
                    if (i3 != null) {
                        vq0 = ts1.e(vq0).j(i3);
                    } else {
                        rf2.q(vq0, " is not a read-only collection", "Given class ");
                        return null;
                    }
                }
            } else if (vq3 instanceof ds3) {
                ds3 ds3 = (ds3) vq3;
                qp7 qp7 = ds3.A;
                if (qp7 != null) {
                    vq0 = qp7;
                } else {
                    ta1.l("Descriptor-less type parameter: ", ds3);
                    return null;
                }
            } else {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(vq3);
                Class<?> cls = vq3.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new Error(sb.toString());
            }
            U(vq0.n().getParameters().size(), list.size());
            wo7 n2 = vq0.n();
            n2.getClass();
            List parameters = n2.getParameters();
            parameters.getClass();
            ro7.x.getClass();
            ro7 ro7 = ro7.y;
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            int i4 = 0;
            for (Object next : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    gs3 gs3 = (gs3) next;
                    ds1 ds1 = (ds1) gs3.b;
                    if (ds1 != null) {
                        vw3 = ds1.x;
                    } else {
                        vw3 = null;
                    }
                    ks3 ks3 = gs3.a;
                    if (ks3 == null) {
                        i2 = -1;
                    } else {
                        i2 = cq3.a[ks3.ordinal()];
                    }
                    if (i2 == -1) {
                        Object obj = parameters.get(i4);
                        obj.getClass();
                        p27 = new p27((qp7) obj);
                    } else if (i2 == 1) {
                        vw3.getClass();
                        p27 = new p27(vw3, k28.y);
                    } else if (i2 == 2) {
                        vw3.getClass();
                        p27 = new p27(vw3, k28.z);
                    } else if (i2 == 3) {
                        vw3.getClass();
                        p27 = new p27(vw3, k28.A);
                    } else {
                        h.c();
                        return null;
                    }
                    arrayList.add(p27);
                    i4 = i5;
                } else {
                    sg3.Z();
                    throw null;
                }
            }
            return new ds1(kl8.I(ro7, n2, arrayList, z2), (sr2) null, false);
        }
        boolean z3 = z2;
        if (vq3 instanceof gq3) {
            gq32 = (gq3) vq3;
        } else {
            gq32 = null;
        }
        if (gq32 != null) {
            list3 = gl0.I(gq32);
        }
        if (list3 == null) {
            list3 = a42.w;
        }
        U(list3.size(), list.size());
        return new cu6(vq3, list, z3, list2, (as3) null, false, false, false, gq3, (sr2) null);
    }

    public static float f0(float f2, float f3, float f4, float f5) {
        double d2 = (double) (f2 - f4);
        double d3 = (double) (f3 - f5);
        return (float) Math.sqrt((d3 * d3) + (d2 * d2));
    }

    public static float g0(int i2, int i3, int i4, int i5) {
        double d2 = (double) (i2 - i4);
        double d3 = (double) (i3 - i5);
        return (float) Math.sqrt((d3 * d3) + (d2 * d2));
    }

    public static final sr2 h0(sr2 sr2, yt2 yt2) {
        t54 t54 = (t54) yt2.k(ha4.a);
        boolean i2 = yt2.i(t54) | yt2.g(sr2);
        Object Q2 = yt2.Q();
        if (i2 || Q2 == ay0.a) {
            Q2 = new f5(t54, sr2);
            yt2.o0(Q2);
        }
        return (sr2) Q2;
    }

    public static final vk2 i0(vk2 vk2) {
        vk2 g2 = ((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g();
        if (g2 == null || !g2.J) {
            return null;
        }
        return g2;
    }

    public static final ly5 j0(vk2 vk2) {
        xz4 xz4;
        if (vk2.J && (xz4 = vk2.D) != null) {
            dy3 I2 = t49.I(xz4);
            if (!I2.n()) {
                I2 = null;
            }
            if (I2 != null) {
                return vk2.Y0(I2);
            }
        }
        return ly5.e;
    }

    public static final vk2 k0(vk2 vk2) {
        vk2 vk22;
        boolean z2 = vk2.w.J;
        if (z2) {
            if (!z2) {
                yb3.b("visitChildren called on an unattached node");
            }
            eq4 eq4 = new eq4(new ll4[16]);
            ll4 ll4 = vk2.w;
            ll4 ll42 = ll4.B;
            if (ll42 == null) {
                rc9.h(eq4, ll4);
            } else {
                eq4.b(ll42);
            }
            loop0:
            while (true) {
                int i2 = eq4.y;
                if (i2 == 0) {
                    break;
                }
                ll4 ll43 = (ll4) eq4.l(i2 - 1);
                if ((ll43.z & 1024) == 0) {
                    rc9.h(eq4, ll43);
                } else {
                    while (true) {
                        if (ll43 == null) {
                            continue;
                            break;
                        } else if ((ll43.y & 1024) != 0) {
                            eq4 eq42 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof vk2) {
                                    vk22 = (vk2) ll43;
                                    if (vk22.w.J) {
                                        int ordinal = vk22.a1().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return vk22;
                                        }
                                        if (ordinal != 3) {
                                            h.c();
                                            return null;
                                        }
                                    }
                                } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                    int i3 = 0;
                                    for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                        if ((ll44.y & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                ll43 = ll44;
                                            } else {
                                                if (eq42 == null) {
                                                    eq42 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq42.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq42.b(ll44);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq42);
                            }
                            continue;
                        } else {
                            ll43 = ll43.B;
                        }
                    }
                }
            }
            return vk22;
        }
        return null;
    }

    public static final x83 l0() {
        x83 x83 = X;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.CellTower", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        long j2 = jt0.b;
        ky6 ky6 = new ky6(j2);
        be5 f2 = pb4.f(7.9f, 14.1f, 0.09f, -0.09f);
        f2.e(0.27f, -0.27f, 0.32f, -0.71f, 0.08f, -1.01f);
        f2.d(7.36f, 12.09f, 7.0f, 11.01f, 7.0f, 10.0f);
        f2.e(0.0f, -1.08f, 0.35f, -2.16f, 1.04f, -3.01f);
        f2.e(0.25f, -0.3f, 0.21f, -0.75f, -0.07f, -1.02f);
        f2.h(7.9f, 5.9f);
        f2.d(7.56f, 5.56f, 7.0f, 5.6f, 6.7f, 5.98f);
        f2.d(5.79f, 7.16f, 5.3f, 8.58f, 5.3f, 10.0f);
        f2.e(0.0f, 1.42f, 0.49f, 2.84f, 1.4f, 4.02f);
        f2.d(7.0f, 14.4f, 7.56f, 14.44f, 7.9f, 14.1f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        ky6 ky62 = new ky6(j2);
        be5 f3 = pb4.f(18.51f, 3.49f, -0.08f, 0.08f);
        f3.e(-0.3f, 0.3f, -0.29f, 0.76f, -0.03f, 1.08f);
        f3.e(1.26f, 1.53f, 1.9f, 3.48f, 1.9f, 5.35f);
        f3.e(0.0f, 1.87f, -0.63f, 3.81f, -1.9f, 5.35f);
        f3.e(-0.28f, 0.33f, -0.23f, 0.83f, 0.08f, 1.14f);
        f3.n(0.0f);
        f3.e(0.35f, 0.35f, 0.93f, 0.31f, 1.24f, -0.07f);
        f3.d(21.29f, 14.54f, 22.0f, 12.31f, 22.0f, 10.0f);
        f3.e(0.0f, -2.32f, -0.79f, -4.55f, -2.31f, -6.43f);
        f3.d(19.39f, 3.2f, 18.84f, 3.16f, 18.51f, 3.49f);
        f3.c();
        w83.a(w83, f3.a, ky62, 14336);
        ky6 ky63 = new ky6(j2);
        be5 f4 = b81.f(5.57f, 3.57f, 5.49f, 3.49f);
        f4.d(5.16f, 3.16f, 4.61f, 3.2f, 4.31f, 3.57f);
        f4.d(2.79f, 5.45f, 2.0f, 7.68f, 2.0f, 10.0f);
        f4.e(0.0f, 2.32f, 0.79f, 4.55f, 2.31f, 6.43f);
        f4.e(0.3f, 0.37f, 0.85f, 0.42f, 1.18f, 0.08f);
        f4.i(0.08f, -0.08f);
        f4.e(0.3f, -0.3f, 0.29f, -0.76f, 0.03f, -1.08f);
        f4.d(4.33f, 13.81f, 3.7f, 11.87f, 3.7f, 10.0f);
        f4.e(0.0f, -1.87f, 0.63f, -3.81f, 1.9f, -5.35f);
        f4.d(5.86f, 4.33f, 5.87f, 3.87f, 5.57f, 3.57f);
        f4.c();
        w83.a(w83, f4.a, ky63, 14336);
        ky6 ky64 = new ky6(j2);
        be5 e2 = pb4.e(16.07f, 14.07f);
        e2.e(0.36f, 0.36f, 0.95f, 0.32f, 1.26f, -0.09f);
        e2.e(0.9f, -1.18f, 1.37f, -2.58f, 1.37f, -3.98f);
        e2.e(-0.08f, -1.41f, -0.51f, -2.83f, -1.4f, -4.01f);
        e2.e(-0.29f, -0.39f, -0.86f, -0.43f, -1.2f, -0.09f);
        e2.i(-0.08f, 0.08f);
        e2.e(-0.27f, 0.27f, -0.32f, 0.71f, -0.08f, 1.01f);
        e2.d(16.64f, 7.91f, 17.0f, 8.99f, 17.0f, 10.0f);
        e2.e(0.0f, 1.07f, -0.34f, 2.13f, -1.01f, 2.98f);
        e2.d(15.73f, 13.3f, 15.77f, 13.77f, 16.07f, 14.07f);
        e2.h(16.07f, 14.07f);
        e2.c();
        w83.a(w83, e2.a, ky64, 14336);
        ky6 ky65 = new ky6(j2);
        be5 e3 = pb4.e(14.5f, 10.0f);
        e3.e(0.0f, -1.6f, -1.51f, -2.85f, -3.18f, -2.41f);
        e3.e(-0.8f, 0.21f, -1.46f, 0.85f, -1.7f, 1.65f);
        e3.e(-0.32f, 1.06f, 0.06f, 2.04f, 0.76f, 2.64f);
        e3.i(-2.96f, 8.87f);
        e3.d(7.21f, 21.37f, 7.67f, 22.0f, 8.32f, 22.0f);
        e3.g(0.0f);
        e3.e(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.65f);
        e3.h(9.67f, 20.0f);
        e3.g(4.67f);
        e3.i(0.45f, 1.35f);
        e3.e(0.13f, 0.39f, 0.49f, 0.65f, 0.9f, 0.65f);
        e3.g(0.0f);
        e3.e(0.65f, 0.0f, 1.1f, -0.63f, 0.9f, -1.25f);
        e3.i(-2.96f, -8.87f);
        e3.d(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        b81.v(e3, 10.33f, 18.0f, 12.0f, 13.0f);
        e3.i(1.67f, 5.0f);
        e3.f(10.33f);
        e3.c();
        w83.a(w83, e3.a, ky65, 14336);
        x83 b2 = w83.b();
        X = b2;
        return b2;
    }

    public static final x83 m0() {
        x83 x83 = Y;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(6.0f, 19.0f);
        e2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e2.g(8.0f);
        e2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e2.m(9.0f);
        e2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e2.f(8.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.n(10.0f);
        e2.c();
        e2.j(18.0f, 4.0f);
        e2.g(-2.5f);
        e2.i(-0.71f, -0.71f);
        e2.e(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
        e2.f(9.91f);
        e2.e(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        e2.h(8.5f, 4.0f);
        e2.f(6.0f);
        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e2.l(0.45f, 1.0f, 1.0f, 1.0f);
        e2.g(12.0f);
        e2.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e2.l(-0.45f, -1.0f, -1.0f, -1.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        Y = b2;
        return b2;
    }

    public static final ArrayList n0() {
        ej7 ej7;
        w52 w52 = xx3.A;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            int ordinal = ((xx3) e2Var.next()).ordinal();
            if (ordinal == 0) {
                x83 x83 = gw8.r;
                if (x83 == null) {
                    w83 w83 = new w83("Filled.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                    int i2 = e38.a;
                    ky6 ky6 = new ky6(jt0.b);
                    be5 e2 = pb4.e(11.99f, 2.0f);
                    e2.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    e2.l(4.47f, 10.0f, 9.99f, 10.0f);
                    e2.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    e2.k(17.52f, 2.0f, 11.99f, 2.0f);
                    e2.c();
                    e2.j(18.92f, 8.0f);
                    e2.g(-2.95f);
                    e2.e(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                    e2.e(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                    e2.c();
                    e2.j(12.0f, 4.04f);
                    e2.e(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                    e2.g(-3.82f);
                    e2.e(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                    e2.c();
                    e2.j(4.26f, 14.0f);
                    e2.d(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                    e2.l(0.1f, -1.36f, 0.26f, -2.0f);
                    e2.g(3.38f);
                    e2.e(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                    e2.e(0.0f, 0.68f, 0.06f, 1.34f, 0.14f, 2.0f);
                    e2.h(4.26f, 14.0f);
                    e2.c();
                    e2.j(5.08f, 16.0f);
                    e2.g(2.95f);
                    e2.e(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                    e2.e(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                    b81.v(e2, 8.03f, 8.0f, 5.08f, 8.0f);
                    e2.e(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                    e2.d(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                    e2.c();
                    e2.j(12.0f, 19.96f);
                    e2.e(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                    e2.g(3.82f);
                    e2.e(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                    b81.v(e2, 14.34f, 14.0f, 9.66f, 14.0f);
                    e2.e(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                    e2.e(0.0f, -0.68f, 0.07f, -1.35f, 0.16f, -2.0f);
                    e2.g(4.68f);
                    e2.e(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                    e2.e(0.0f, 0.68f, -0.07f, 1.34f, -0.16f, 2.0f);
                    e2.c();
                    e2.j(14.59f, 19.56f);
                    e2.e(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                    e2.g(2.95f);
                    e2.e(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                    e2.c();
                    e2.j(16.36f, 14.0f);
                    e2.e(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                    e2.e(0.0f, -0.68f, -0.06f, -1.34f, -0.14f, -2.0f);
                    e2.g(3.38f);
                    e2.e(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                    e2.l(-0.1f, 1.36f, -0.26f, 2.0f);
                    e2.g(-3.38f);
                    e2.c();
                    w83.a(w83, e2.a, ky6, 14336);
                    x83 = w83.b();
                    gw8.r = x83;
                }
                ej7 = new ej7(R.string.en, x83);
            } else if (ordinal == 1) {
                x83 x832 = z65.b;
                if (x832 == null) {
                    w83 w832 = new w83("Filled.Translate", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                    int i3 = e38.a;
                    ky6 ky62 = new ky6(jt0.b);
                    be5 f2 = pb4.f(12.87f, 15.07f, -2.54f, -2.51f);
                    f2.i(0.03f, -0.03f);
                    f2.e(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
                    f2.h(17.0f, 6.0f);
                    f2.h(17.0f, 4.0f);
                    f2.g(-7.0f);
                    f2.h(10.0f, 2.0f);
                    f2.h(8.0f, 2.0f);
                    f2.n(2.0f);
                    f2.h(1.0f, 4.0f);
                    f2.n(1.99f);
                    f2.g(11.17f);
                    f2.d(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
                    f2.d(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
                    f2.g(-2.0f);
                    f2.e(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
                    f2.i(-5.09f, 5.02f);
                    f2.h(4.0f, 19.0f);
                    f2.i(5.0f, -5.0f);
                    f2.i(3.11f, 3.11f);
                    f2.i(0.76f, -2.04f);
                    f2.c();
                    f2.j(18.5f, 10.0f);
                    f2.g(-2.0f);
                    f2.h(12.0f, 22.0f);
                    f2.g(2.0f);
                    f2.i(1.12f, -3.0f);
                    f2.g(4.75f);
                    f2.h(21.0f, 22.0f);
                    f2.g(2.0f);
                    f2.i(-4.5f, -12.0f);
                    f2.c();
                    f2.j(15.88f, 17.0f);
                    f2.i(1.62f, -4.33f);
                    f2.h(19.12f, 17.0f);
                    f2.g(-3.24f);
                    f2.c();
                    w83.a(w832, f2.a, ky62, 14336);
                    x832 = w832.b();
                    z65.b = x832;
                }
                ej7 = new ej7(R.string.es, x832);
            } else {
                h.c();
                return null;
            }
            arrayList.add(ej7);
        }
        return arrayList;
    }

    public static final Object o0(gh4 gh4) {
        iy3 iy3;
        Object B2 = gh4.B();
        if (B2 instanceof iy3) {
            iy3 = (iy3) B2;
        } else {
            iy3 = null;
        }
        if (iy3 != null) {
            return iy3.K;
        }
        return null;
    }

    public static final void p0(e81 e81, RuntimeException runtimeException) {
        if (runtimeException instanceof DispatchException) {
            runtimeException = ((DispatchException) runtimeException).w;
        }
        try {
            i81 i81 = (i81) e81.a0(d63.z);
            if (i81 != null) {
                i81.B(e81, runtimeException);
            } else {
                we.w(e81, runtimeException);
            }
        } catch (Throwable th) {
            if (runtimeException != th) {
                RuntimeException runtimeException2 = new RuntimeException("Exception while trying to handle coroutine exception", th);
                su0.b(runtimeException2, runtimeException);
                runtimeException = runtimeException2;
            }
            we.w(e81, runtimeException);
        }
    }

    public static final boolean q0(vk2 vk2) {
        uy3 uy3;
        xz4 xz4;
        uy3 uy32;
        xz4 xz42 = vk2.D;
        if (xz42 == null || (uy3 = xz42.O) == null || !uy3.K() || (xz4 = vk2.D) == null || (uy32 = xz4.O) == null || !uy32.J()) {
            return false;
        }
        return true;
    }

    public static d37 r0() {
        return GsmNetworkService.D;
    }

    public static final String s0(jy7 jy7, yt2 yt2) {
        int i2;
        int ordinal = jy7.ordinal();
        if (ordinal == 0) {
            i2 = R.string.ussd_auto_query_voice;
        } else if (ordinal == 1) {
            i2 = R.string.ussd_auto_query_sms;
        } else if (ordinal == 2) {
            i2 = R.string.ussd_auto_query_data;
        } else if (ordinal == 3) {
            i2 = R.string.ussd_auto_query_saldo;
        } else {
            h.c();
            return null;
        }
        return l55.u(i2, yt2);
    }

    public static final ml4 t0(c24 c24, ji8 ji8, z75 z75) {
        return new y14(c24, ji8, z75);
    }

    public static final int u0(int i2, String str) {
        char charAt = str.charAt(i2);
        return (charAt << 7) + str.charAt(i2 + 1);
    }

    public static final byte[] v0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static int w0(float f2) {
        float f3;
        if (f2 < 0.0f) {
            f3 = -0.5f;
        } else {
            f3 = 0.5f;
        }
        return (int) (f2 + f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return r4;
     */
    public static ComponentName x0(Context context, Intent intent) {
        synchronized (V) {
            try {
                T(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    W.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final int y0(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static int z0(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public byte A() {
        Object e0 = e0();
        e0.getClass();
        return ((Byte) e0).byteValue();
    }

    public short B() {
        Object e0 = e0();
        e0.getClass();
        return ((Short) e0).shortValue();
    }

    public float C() {
        Object e0 = e0();
        e0.getClass();
        return ((Float) e0).floatValue();
    }

    public long D(ll6 ll6, int i2) {
        ll6.getClass();
        return v();
    }

    public double E() {
        Object e0 = e0();
        e0.getClass();
        return ((Double) e0).doubleValue();
    }

    public void b(ll6 ll6) {
        ll6.getClass();
    }

    public gy0 c(ll6 ll6) {
        ll6.getClass();
        return this;
    }

    public ok1 d(lo5 lo5, int i2) {
        lo5.getClass();
        return q(lo5.h(i2));
    }

    public boolean e() {
        Object e0 = e0();
        e0.getClass();
        return ((Boolean) e0).booleanValue();
    }

    public Object e0() {
        throw new IllegalArgumentException(b26.a.b(getClass()) + " can't retrieve untyped values");
    }

    public char f() {
        Object e0 = e0();
        e0.getClass();
        return ((Character) e0).charValue();
    }

    public double i(lo5 lo5, int i2) {
        lo5.getClass();
        return E();
    }

    public char j(lo5 lo5, int i2) {
        lo5.getClass();
        return f();
    }

    public float k(lo5 lo5, int i2) {
        lo5.getClass();
        return C();
    }

    public byte m(lo5 lo5, int i2) {
        lo5.getClass();
        return A();
    }

    public String n(ll6 ll6, int i2) {
        ll6.getClass();
        return t();
    }

    public int o() {
        Object e0 = e0();
        e0.getClass();
        return ((Integer) e0).intValue();
    }

    public short p(lo5 lo5, int i2) {
        lo5.getClass();
        return B();
    }

    public ok1 q(ll6 ll6) {
        ll6.getClass();
        return this;
    }

    public Object r(ll6 ll6, int i2, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        return g(zr3);
    }

    public int s(ll6 ll6, int i2) {
        ll6.getClass();
        return o();
    }

    public String t() {
        Object e0 = e0();
        e0.getClass();
        return (String) e0;
    }

    public int u(ll6 ll6) {
        ll6.getClass();
        Object e0 = e0();
        e0.getClass();
        return ((Integer) e0).intValue();
    }

    public long v() {
        Object e0 = e0();
        e0.getClass();
        return ((Long) e0).longValue();
    }

    public boolean w() {
        return true;
    }

    public Object x(ll6 ll6, int i2, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        if (zr3.getDescriptor().c() || w()) {
            return g(zr3);
        }
        return null;
    }

    public boolean z(ll6 ll6, int i2) {
        ll6.getClass();
        return e();
    }
}
