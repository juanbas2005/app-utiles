package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cu.lestebang.utiletecsa.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* renamed from: mp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mp7 {
    public static final fw0 A = new fw0(2117113223, new sw0(16), false);
    public static final fw0 B = new fw0(-260877823, new sw0(17), false);
    public static final fw0 C = new fw0(-1975283592, new sw0(18), false);
    public static l76 D;
    public static final cc2 E;
    public static final cc2 F;
    public static final cc2 G;
    public static final cc2[] H;
    public static final /* synthetic */ int I = 0;
    public static x83 J;
    public static x83 K;
    public static final k23 w = new k23(0, (gs2) null);
    public static final k23 x = new k23(1, (gs2) null);
    public static final fw0 y = new fw0(838548912, new sw0(15), false);
    public static final fw0 z = new fw0(379053997, new tw0(18), false);

    static {
        cc2 cc2 = new cc2("commit_to_configuration_v2_api", -1, 1, true);
        E = cc2;
        cc2 cc22 = new cc2("get_serving_version_api", -1, 1, true);
        cc2 cc23 = new cc2("get_experiment_tokens_api", -1, 1, true);
        cc2 cc24 = new cc2("register_flag_update_listener_api", -1, 2, true);
        F = cc24;
        cc2 cc25 = new cc2("sync_after_api", -1, 1, true);
        cc2 cc26 = new cc2("sync_after_for_application_api", -1, 1, true);
        cc2 cc27 = new cc2("set_app_wide_properties_api", -1, 1, true);
        cc2 cc28 = new cc2("set_runtime_properties_api", -1, 1, true);
        cc2 cc29 = new cc2("get_storage_info_api", -1, 1, true);
        G = cc29;
        H = new cc2[]{cc2, cc22, cc23, cc24, cc25, cc26, cc27, cc28, cc29};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02a3, code lost:
        if (r9.e(1) == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x032f, code lost:
        if (r9.e(0) == false) goto L_0x0333;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x046e  */
    public static final void A(int i, int i2, xf xfVar, h80 h80, fw0 fw0, yt2 yt2, xb4 xb4, ml4 ml4, tx4 tx4, la5 la5, ob5 ob5, ax6 ax6, gx6 gx6, boolean z2) {
        int i3;
        char c;
        boolean z3;
        ob5 ob52;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean g;
        int i4;
        boolean z18;
        boolean z19;
        ur3 ur3;
        o81 o81;
        ob5 ob53;
        i24 i24;
        boolean z20;
        Object Q;
        boolean z21;
        boolean z22;
        Object Q2;
        boolean z23;
        Object Q3;
        ml4 ml42;
        boolean z24;
        ml4 ml43;
        boolean z25;
        boolean z26;
        char c2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i;
        int i16 = i2;
        h80 h802 = h80;
        yt2 yt22 = yt2;
        ml4 ml44 = ml4;
        tx4 tx42 = tx4;
        la5 la52 = la5;
        ob5 ob54 = ob5;
        ax6 ax62 = ax6;
        gx6 gx62 = gx6;
        boolean z27 = z2;
        g80 g80 = xb4.L;
        yt22.g0(-572816025);
        if ((i15 & 6) == 0) {
            if (yt22.g(ml44)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i15;
        } else {
            i3 = i15;
        }
        int i17 = 16;
        if ((i15 & 48) == 0) {
            if (yt22.g(ob54)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        int i18 = 128;
        if ((i15 & 384) == 0) {
            if (yt22.g(la52)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i3 |= i12;
        }
        int i19 = 1024;
        if ((i15 & 3072) == 0) {
            if (yt22.h(false)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        int i20 = 8192;
        if ((i15 & 24576) == 0) {
            if (yt22.e(1)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        int i21 = 65536;
        if ((i15 & 196608) == 0) {
            if (yt22.g(ax62)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i22 = 524288;
        if ((i15 & 1572864) == 0) {
            if (yt22.h(z27)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        xf xfVar2 = xfVar;
        if ((i15 & 12582912) == 0) {
            if (yt22.g(xfVar2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((i15 & 100663296) == 0) {
            if (yt22.e(0)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((i15 & 805306368) == 0) {
            if (yt22.d(0.0f)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        int i23 = i3;
        if ((i16 & 6) == 0) {
            if (yt2.g(xb4)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            c = c2 | i16;
        } else {
            c = i16;
        }
        if ((i16 & 48) == 0) {
            if (yt22.i(tx42)) {
                i17 = 32;
            }
            c |= i17;
        }
        if ((i16 & 384) == 0) {
            if (yt22.i((Object) null)) {
                i18 = 256;
            }
            c |= i18;
        }
        if ((i16 & 3072) == 0) {
            if (yt22.g(g80)) {
                i19 = 2048;
            }
            c |= i19;
        }
        if ((i16 & 24576) == 0) {
            if (yt22.g(h802)) {
                i20 = 16384;
            }
            c |= i20;
        }
        if ((i16 & 196608) == 0) {
            if (yt22.g(gx62)) {
                i21 = 131072;
            }
            c |= i21;
        }
        if ((i16 & 1572864) == 0) {
            if (yt22.i(fw0)) {
                i22 = 1048576;
            }
            c |= i22;
        } else {
            fw0 fw02 = fw0;
        }
        if ((i23 & 306783379) == 306783378 && (599187 & c) == 599186) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (yt22.V(i23 & 1, z3)) {
            boolean z28 = i23 & true;
            if (z28) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q4 = yt22.Q();
            Object obj = ay0.a;
            if (z4 || Q4 == obj) {
                Q4 = new m24(ob54, 0);
                yt22.o0(Q4);
            }
            sr2 sr2 = (sr2) Q4;
            int i25 = i23 >> 3;
            int i26 = i25 & 14;
            int i27 = c >> 15;
            int i28 = i27;
            int i29 = i26 | (i27 & 112) | (c & 896);
            int i30 = c;
            aq4 v = u55.v(fw0, yt2);
            int i31 = i29;
            aq4 v2 = u55.v((Object) null, yt22);
            if ((((i31 & 14) ^ 6) <= 4 || !yt22.g(ob54)) && (i31 & 6) != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean g2 = z5 | yt22.g(v) | yt22.g(v2) | yt22.g(sr2);
            Object Q5 = yt22.Q();
            if (g2 || Q5 == obj) {
                pe2 pe2 = pe2.L;
                Q5 = new xz3(0, 1, a37.class, u55.j(new qm3(2, (Object) u55.j(new g20(v, v2, sr2, 11), pe2), (Object) ob54), pe2), "value", "getValue()Ljava/lang/Object;");
                yt22.o0(Q5);
            }
            ur3 ur32 = (ur3) Q5;
            Object Q6 = yt22.Q();
            if (Q6 == obj) {
                Q6 = t49.D(yt22);
                yt22.o0(Q6);
            }
            o81 o812 = (o81) Q6;
            if (z28) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q7 = yt22.Q();
            if (z6 || Q7 == obj) {
                Q7 = new m24(ob54, 1);
                yt22.o0(Q7);
            }
            sr2 sr22 = (sr2) Q7;
            int i32 = i23 >> 9;
            int i33 = (i23 & 65520) | (i32 & 458752) | (i32 & 3670016) | ((i30 << 21) & 29360128);
            int i34 = i30 << 15;
            int i35 = i33 | (i34 & 234881024) | (i34 & 1879048192);
            if ((((i35 & 112) ^ 48) <= 32 || !yt22.g(ob54)) && (i35 & 48) != 32) {
                z7 = false;
            } else {
                z7 = true;
            }
            if ((((i35 & 896) ^ 384) <= 256 || !yt22.g(la52)) && (i35 & 384) != 256) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z29 = z8 | z7;
            if ((((i35 & 7168) ^ 3072) <= 2048 || !yt22.h(false)) && (i35 & 3072) != 2048) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean z30 = z29 | z9;
            if (((57344 & i35) ^ 24576) > 16384) {
            }
            if ((i35 & 24576) != 16384) {
                z10 = false;
                boolean z31 = z30 | z10;
                if ((((i35 & 234881024) ^ 100663296) <= 67108864 || !yt22.g(g80)) && (i35 & 100663296) != 67108864) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z32 = z11 | z31;
                if ((((i35 & 1879048192) ^ 805306368) <= 536870912 || !yt22.g(h802)) && (i35 & 805306368) != 536870912) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                boolean z33 = z32 | z12;
                if ((((i35 & 3670016) ^ 1572864) <= 1048576 || !yt22.d(0.0f)) && (i35 & 1572864) != 1048576) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                boolean z34 = z33 | z13;
                if ((((i35 & 29360128) ^ 12582912) <= 8388608 || !yt2.g(xb4)) && (i35 & 12582912) != 8388608) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                boolean z35 = z34 | z14;
                if ((((i28 & 14) ^ 6) <= 4 || !yt22.g(gx62)) && (i28 & 6) != 4) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                boolean g3 = z35 | z15 | yt22.g(sr22);
                if (((i35 & 458752) ^ 196608) <= 131072) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if ((i35 & 196608) != 131072) {
                    z16 = z17;
                    g = g3 | z16 | yt22.g(o812);
                    Object Q8 = yt22.Q();
                    if (!g || Q8 == obj) {
                        ur3 ur33 = ur32;
                        z18 = z28;
                        ur3 ur34 = ur33;
                        i4 = 4;
                        z19 = z17;
                        ob53 = ob5;
                        i24 = new cb5(ob53, la52, xb4, ur34, sr22, h802, gx62, o812);
                        o81 = o812;
                        ur3 = ur34;
                        yt22.o0(i24);
                    } else {
                        i24 = Q8;
                        o81 = o812;
                        i4 = 4;
                        ur3 = ur32;
                        z19 = z17;
                        z18 = z28;
                        ob53 = ob5;
                    }
                    i24 i242 = i24;
                    if (((i26 ^ 6) <= i4 || !yt22.g(ob53)) && (i25 & 6) != i4) {
                        z20 = z19;
                    } else {
                        z20 = true;
                    }
                    boolean h = yt22.h(z19) | z20;
                    Q = yt22.Q();
                    if (h || Q == obj) {
                        Q = new y24(ob53, z19);
                        yt22.o0(Q);
                    }
                    x24 x24 = (x24) Q;
                    if (z18) {
                        z21 = true;
                    } else {
                        z21 = z19;
                    }
                    if ((i23 & 458752) == 131072) {
                        z22 = true;
                    } else {
                        z22 = z19;
                    }
                    boolean z36 = z21 | z22;
                    Q2 = yt22.Q();
                    if (z36 || Q2 == obj) {
                        Q2 = new tb5(ax62, ob53);
                        yt22.o0(Q2);
                    }
                    tb5 tb5 = (tb5) Q2;
                    fc0 fc0 = (fc0) yt22.k(hc0.a);
                    ey3 ey3 = (ey3) yt22.k(xy0.n);
                    if (z18) {
                        z23 = true;
                    } else {
                        z23 = z19;
                    }
                    boolean g4 = z23 | yt22.g(fc0) | yt22.e(ey3.ordinal());
                    Q3 = yt22.Q();
                    if (g4 || Q3 == obj) {
                        Q3 = new ta5(ob53, fc0, ey3);
                        yt22.o0(Q3);
                    }
                    ta5 ta5 = (ta5) Q3;
                    jl4 jl4 = jl4.w;
                    z75 z75 = z75.x;
                    if (z2) {
                        yt22.e0(-853734429);
                        int i36 = i26 | ((i23 >> 21) & 112);
                        if ((((i36 & 14) ^ 6) <= i4 || !yt22.g(ob53)) && (i36 & 6) != i4) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        if ((((i36 & 112) ^ 48) <= 32 || !yt22.e(0)) && (i36 & 48) != 32) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        boolean z37 = z26 | z25;
                        Object Q9 = yt22.Q();
                        if (z37 || Q9 == obj) {
                            Q9 = new sa5(ob53);
                            yt22.o0(Q9);
                        }
                        ml42 = bb0.t0((sa5) Q9, ob53.v, z75);
                        z19 = false;
                        yt22.r(false);
                    } else {
                        yt22.e0(-853304645);
                        yt22.r(z19);
                        ml42 = jl4;
                    }
                    z24 = z2;
                    ml4 t = ed1.t(ml44.d(ob53.y).d(ob53.w), ur3, x24, z75, z24);
                    if (z24) {
                        ml43 = t.d(ck6.a(jl4, z19, new pu1(z19, (Object) ob53, (Object) o81, 1)));
                    } else {
                        ml43 = t.d(jl4);
                    }
                    ob52 = ob53;
                    tx42 = tx4;
                    b96.b(ur3, tf4.G(rc9.R0(ml43.d(ml42), ob53, z75, xfVar, z24, tb5, ob53.p, ta5).d(d97.a(jl4, ob52, new wf(3, ob52))), tx42), ob52.t, i242, yt22, 0);
                }
                z16 = true;
                g = g3 | z16 | yt22.g(o812);
                Object Q82 = yt22.Q();
                if (!g) {
                }
                ur3 ur332 = ur32;
                z18 = z28;
                ur3 ur342 = ur332;
                i4 = 4;
                z19 = z17;
                ob53 = ob5;
                i24 = new cb5(ob53, la52, xb4, ur342, sr22, h802, gx62, o812);
                o81 = o812;
                ur3 = ur342;
                yt22.o0(i24);
                i24 i2422 = i24;
                if (((i26 ^ 6) <= i4 || !yt22.g(ob53)) && (i25 & 6) != i4) {
                }
                boolean h2 = yt22.h(z19) | z20;
                Q = yt22.Q();
                Q = new y24(ob53, z19);
                yt22.o0(Q);
                x24 x242 = (x24) Q;
                if (z18) {
                }
                if ((i23 & 458752) == 131072) {
                }
                boolean z362 = z21 | z22;
                Q2 = yt22.Q();
                Q2 = new tb5(ax62, ob53);
                yt22.o0(Q2);
                tb5 tb52 = (tb5) Q2;
                fc0 fc02 = (fc0) yt22.k(hc0.a);
                ey3 ey32 = (ey3) yt22.k(xy0.n);
                if (z18) {
                }
                boolean g42 = z23 | yt22.g(fc02) | yt22.e(ey32.ordinal());
                Q3 = yt22.Q();
                Q3 = new ta5(ob53, fc02, ey32);
                yt22.o0(Q3);
                ta5 ta52 = (ta5) Q3;
                jl4 jl42 = jl4.w;
                z75 z752 = z75.x;
                if (z2) {
                }
                z24 = z2;
                ml4 t2 = ed1.t(ml44.d(ob53.y).d(ob53.w), ur3, x242, z752, z24);
                if (z24) {
                }
                ob52 = ob53;
                tx42 = tx4;
                b96.b(ur3, tf4.G(rc9.R0(ml43.d(ml42), ob53, z752, xfVar, z24, tb52, ob53.p, ta52).d(d97.a(jl42, ob52, new wf(3, ob52))), tx42), ob52.t, i2422, yt22, 0);
            }
            z10 = true;
            boolean z312 = z30 | z10;
            if ((((i35 & 234881024) ^ 100663296) <= 67108864 || !yt22.g(g80)) && (i35 & 100663296) != 67108864) {
            }
            boolean z322 = z11 | z312;
            if ((((i35 & 1879048192) ^ 805306368) <= 536870912 || !yt22.g(h802)) && (i35 & 805306368) != 536870912) {
            }
            boolean z332 = z322 | z12;
            if ((((i35 & 3670016) ^ 1572864) <= 1048576 || !yt22.d(0.0f)) && (i35 & 1572864) != 1048576) {
            }
            boolean z342 = z332 | z13;
            if ((((i35 & 29360128) ^ 12582912) <= 8388608 || !yt2.g(xb4)) && (i35 & 12582912) != 8388608) {
            }
            boolean z352 = z342 | z14;
            if ((((i28 & 14) ^ 6) <= 4 || !yt22.g(gx62)) && (i28 & 6) != 4) {
            }
            boolean g32 = z352 | z15 | yt22.g(sr22);
            if (((i35 & 458752) ^ 196608) <= 131072) {
            }
            if ((i35 & 196608) != 131072) {
            }
            z16 = true;
            g = g32 | z16 | yt22.g(o812);
            Object Q822 = yt22.Q();
            if (!g) {
            }
            ur3 ur3322 = ur32;
            z18 = z28;
            ur3 ur3422 = ur3322;
            i4 = 4;
            z19 = z17;
            ob53 = ob5;
            i24 = new cb5(ob53, la52, xb4, ur3422, sr22, h802, gx62, o812);
            o81 = o812;
            ur3 = ur3422;
            yt22.o0(i24);
            i24 i24222 = i24;
            if (((i26 ^ 6) <= i4 || !yt22.g(ob53)) && (i25 & 6) != i4) {
            }
            boolean h22 = yt22.h(z19) | z20;
            Q = yt22.Q();
            Q = new y24(ob53, z19);
            yt22.o0(Q);
            x24 x2422 = (x24) Q;
            if (z18) {
            }
            if ((i23 & 458752) == 131072) {
            }
            boolean z3622 = z21 | z22;
            Q2 = yt22.Q();
            Q2 = new tb5(ax62, ob53);
            yt22.o0(Q2);
            tb5 tb522 = (tb5) Q2;
            fc0 fc022 = (fc0) yt22.k(hc0.a);
            ey3 ey322 = (ey3) yt22.k(xy0.n);
            if (z18) {
            }
            boolean g422 = z23 | yt22.g(fc022) | yt22.e(ey322.ordinal());
            Q3 = yt22.Q();
            Q3 = new ta5(ob53, fc022, ey322);
            yt22.o0(Q3);
            ta5 ta522 = (ta5) Q3;
            jl4 jl422 = jl4.w;
            z75 z7522 = z75.x;
            if (z2) {
            }
            z24 = z2;
            ml4 t22 = ed1.t(ml44.d(ob53.y).d(ob53.w), ur3, x2422, z7522, z24);
            if (z24) {
            }
            ob52 = ob53;
            tx42 = tx4;
            b96.b(ur3, tf4.G(rc9.R0(ml43.d(ml42), ob53, z7522, xfVar, z24, tb522, ob53.p, ta522).d(d97.a(jl422, ob52, new wf(3, ob52))), tx42), ob52.t, i24222, yt22, 0);
        } else {
            ob52 = ob54;
            yt2.Y();
        }
        yx5 v3 = yt2.v();
        if (v3 != null) {
            la5 la53 = la5;
            boolean z38 = z2;
            ob5 ob55 = ob52;
            ml4 ml45 = ml44;
            ax6 ax63 = ax62;
            xf xfVar3 = xfVar;
            v3.d = new n24(ml45, ob55, la53, ax63, z38, xfVar3, xb4, tx42, h80, gx6, fw0, i, i2);
        }
    }

    public static final void B(int i, int i2, mv1 mv1, yt2 yt2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7 = i;
        int i8 = i2;
        mv1 mv12 = mv1;
        yt2 yt22 = yt2;
        yt22.g0(460217104);
        if (yt22.e(i7)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i3 | i4;
        if (yt22.e(i8)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        if (yt22.e(mv12.ordinal())) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i11 = i10 | i6;
        if ((i11 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i11 & 1, z2)) {
            if (i8 >= i7 || mv12 == mv1.y) {
                z3 = false;
            } else {
                z3 = true;
            }
            sd2 sd2 = yu6.a;
            h80 h80 = xb4.I;
            ea6 a = ca6.a(wr.g, h80, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E2);
            ck ckVar5 = ckVar;
            vy0 vy02 = vy0;
            ck ckVar6 = ckVar2;
            ce ceVar2 = ceVar;
            ck ckVar7 = ckVar3;
            ck ckVar8 = ckVar4;
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.payment_amount_label, yt22), (ml4) null, jt0.b(0.6f, su0.r(yt22).q), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).n, yt23, 0, 0, 131066);
            yt2 yt24 = yt23;
            ea6 a2 = ca6.a(wr.a, h80, yt24, 48);
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            jl4 jl4 = jl4.w;
            ml4 E3 = gw8.E(yt24, jl4);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar5, yt24, a2);
            g75.Q(ckVar6, yt24, m2);
            f21.s(hashCode2, yt24, ckVar7, yt24, ceVar2);
            g75.Q(ckVar8, yt24, E3);
            if (z3) {
                yt24.e0(-1910262608);
                String v = l55.v(R.string.payment_amount, new Object[]{Integer.valueOf(i)}, yt24);
                tg7 tg7 = su0.x(yt24).k;
                yt2 yt25 = yt24;
                yf7.b(v, new wc8(nb.a), jt0.b(0.5f, su0.r(yt24).q), 0, (am2) null, (ea7) null, 0, rd7.d, (hc7) null, 0, 0, false, 0, 0, tg7, yt25, 805306368, 0, 130552);
                yt24 = yt25;
                k75.a(yt24, yu6.p(jl4, 8.0f));
                yt24.r(false);
            } else {
                yt24.e0(-1909822470);
                yt24.r(false);
            }
            String v2 = l55.v(R.string.payment_amount, new Object[]{Integer.valueOf(i2)}, yt24);
            tg7 tg72 = su0.x(yt24).h;
            am2 am2 = am2.B;
            yt2 yt26 = yt24;
            yf7.b(v2, new wc8(nb.a), su0.r(yt24).a, 0, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg72, yt26, 1572864, 0, 131000);
            yt22 = yt26;
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new eq5(i, i2, mv1, i3);
        }
    }

    public static final void C(cf5 cf5, vr2 vr2, b54 b54, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        vr2 vr22;
        cf5 cf52;
        b54 b542 = b54;
        yt2 yt22 = yt2;
        yt22.g0(-534891992);
        if (yt22.e(cf5.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(b542)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            sd2 sd2 = yu6.a;
            au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.payment_info_title, yt22), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(ch4.b)).b.h, yt23, 0, 0, 131070);
            yt22 = yt23;
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 6.0f));
            cf52 = cf5;
            vr22 = vr2;
            t35.c(sd2, 0.0f, su0.J(-469977293, new gc5(17, (Object) cf52, (Object) vr22), yt22), yt22, 390);
            k75.a(yt22, yu6.d(jl4, 10.0f));
            int ordinal = cf52.ordinal();
            if (ordinal == 0) {
                yt22.e0(1288566731);
                String u = l55.u(R.string.payment_card_label, yt22);
                String u2 = l55.u(R.string.payment_card_value, yt22);
                int i6 = b542.a;
                D(u, u2, i6, i6 - ((b542.c * i6) / 100), b542.d, yt22, 0);
                m(pb4.j(jl4, 8.0f, yt22, R.string.payment_confirmation_label, yt22), l55.u(R.string.payment_confirmation_value, yt22), (Integer) null, (sr2) null, (gs2) null, yt22, 0, 28);
                yt22.r(false);
            } else if (ordinal == 1) {
                yt22.e0(1289254807);
                String u3 = l55.u(R.string.payment_saldo_phone_label, yt22);
                String u4 = l55.u(R.string.payment_saldo_value, yt22);
                int i7 = b542.b;
                D(u3, u4, i7, i7 - ((b542.c * i7) / 100), b542.d, yt22, 0);
                yt22.r(false);
            } else {
                yt22.e0(-1759550282);
                yt22.r(false);
                h.c();
                return;
            }
            yt22.r(true);
        } else {
            cf52 = cf5;
            vr22 = vr2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ou4(i, 4, cf52, vr22, b542);
        }
    }

    public static final void D(String str, String str2, int i, int i2, mv1 mv1, yt2 yt2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        mv1 mv12;
        int i9 = i;
        int i10 = i2;
        yt2 yt22 = yt2;
        yt22.g0(-1762867801);
        if (yt22.g(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i11 = i3 | i4;
        String str3 = str2;
        if (yt22.g(str3)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i12 = i11 | i5;
        if (yt22.e(i9)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i13 = i12 | i6;
        if (yt22.e(i10)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i14 = i13 | i7;
        if (yt22.e(mv1.ordinal())) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i15 = i14 | i8;
        if ((i15 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i15 & 1, z2)) {
            ml4 M = x91.M(b96.h(we.f(yu6.a, q96.a(16.0f)), jt0.b(0.35f, ((zg4) yt22.k(ch4.b)).a.r), gr8.h), 0.0f, 8.0f, 1);
            au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            mv12 = mv1;
            m(str, str3, (Integer) null, (sr2) null, su0.J(1707987427, new eq5(i9, i10, mv12), yt22), yt22, (i15 & 14) | 24576 | (i15 & 112), 12);
            yt22.r(true);
        } else {
            mv12 = mv1;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new p24(str, str2, i9, i10, mv12, i3);
        }
    }

    public static final void E(is2 is2, lq5 lq5, yt2 yt2, int i) {
        int i2;
        boolean z2;
        is2.getClass();
        yt2.g0(2004003433);
        if (yt2.g(is2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 16;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a = va4.a(yt2);
                if (a != null) {
                    lq5 = (lq5) n85.p(b26.a.b(lq5.class), a, b96.O(o85.l(a), yt2), o85.k(a), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i4 = i3 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(lq5.d, yt2).getValue(), is2, su0.J(-1864632120, new gc5(16, (Object) lq5, (Object) sg3.s((Context) yt2.k(ye.b))), yt2), yt2, ((i4 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dx4(is2, lq5, i, 5);
        }
    }

    public static final void F(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        yt2.g0(2064964257);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(fw0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            G(ml4, fw0, yt2, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vi(ml4, fw0, i, 0);
        }
    }

    public static final void G(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        yt2.g0(771959668);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i((Object) null)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(fw0)) {
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
        if (yt2.V(i2 & 1, z2)) {
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                ed5 ed5 = new ed5((Object) null, d63.G);
                yt2.o0(ed5);
                Q = ed5;
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = new wi(aq4, 0);
                yt2.o0(Q2);
            }
            t49.c(kd7.b.a(i0((sr2) Q2, yt2, 0)), su0.J(-291176396, new y30((Object) ml4, aq4, (Object) fw0, 5), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vi(ml4, fw0, i, 1);
        }
    }

    public static final void H(String str, if7 if7, if7 if72, if7 if73, vr2 vr2, vr2 vr22, vr2 vr23, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        if7 if74 = if7;
        if7 if75 = if72;
        if7 if76 = if73;
        sr2 sr24 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-789739692);
        if (yt22.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (yt22.g(if74)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (yt22.g(if75)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i14 = i13 | i4;
        if (yt22.g(if76)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (yt22.i(vr2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (yt22.i(vr22)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i17 = i16 | i7;
        if (yt22.i(vr23)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (yt22.i(sr24)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (yt22.i(sr22)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10;
        if (yt22.i(sr23)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i21 = i20 | i11;
        boolean z3 = false;
        if ((306783379 & i21) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i21 & 1, z2)) {
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            int i22 = i21;
            ml4 Z = t49.Z(x91.M(yu6.c, 32.0f, 0.0f, 2), t49.Y(yt22), true);
            au0 a = zt0.a(wr.e, xb4.L, yt22, 54);
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
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            x83 z4 = uq3.z();
            String u = l55.u(R.string.reset_password, yt22);
            jl4 jl4 = jl4.w;
            ml4 l = yu6.l(jl4, 64.0f);
            t37 t37 = ch4.b;
            ik2 ik22 = ik2;
            yt2 yt23 = yt22;
            ik2 ik23 = ik22;
            d83.a(z4, u, l, ((zg4) yt22.k(t37)).a.a, yt23, 384, 0);
            yt2 yt24 = yt23;
            yt2 yt25 = yt2;
            yf7.b(pb4.j(jl4, 16.0f, yt24, R.string.reset_password, yt24), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, ((zg4) yt24.k(t37)).b.d, yt25, 0, 0, 130046);
            yt2 yt26 = yt25;
            k75.a(yt26, yu6.d(jl4, 8.0f));
            yf7.b(l55.v(R.string.recovery_code_sent, new Object[]{str}, yt26), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt25, 0, 0, 261118);
            k75.a(yt25, yu6.d(jl4, 24.0f));
            String str2 = if74.a;
            String str3 = if74.b;
            bt3 bt3 = bt3.e;
            tf4.g(str2, vr2, ar7.B, ar7.C, (ml4) null, bt3.a(3), (gs2) null, str3, yt2, ((i22 >> 9) & 112) | 3456, 80);
            String str4 = if75.a;
            String str5 = if75.b;
            sd2 sd2 = yu6.a;
            yt2 yt27 = yt2;
            tf4.e(str4, vr22, ar7.D, ar7.E, sd2, str5, yt27, ((i22 >> 12) & 112) | 28032);
            tf4.e(if76.a, vr23, ar7.F, ar7.G, sd2, if76.b, yt27, ((i22 >> 15) & 112) | 28032);
            sd2 sd22 = sd2;
            yt2 yt28 = yt27;
            k75.a(yt28, yu6.d(jl4, 8.0f));
            boolean i23 = yt28.i(ik23);
            if ((i22 & 29360128) == 8388608) {
                z3 = true;
            }
            boolean z5 = i23 | z3;
            Object Q = yt28.Q();
            if (z5 || Q == ay0.a) {
                Q = new xp5(ik23, sr24, 2);
                yt28.o0(Q);
            }
            pv8.d((sr2) Q, ar7.H, sd22, false, yt28, 432, 24);
            yt22 = yt2;
            pv8.i(sr22, (ml4) null, false, ar7.I, yt22, ((i22 >> 24) & 14) | 3072, 6);
            pv8.i(sr23, (ml4) null, false, ar7.J, yt22, ((i22 >> 27) & 14) | 3072, 6);
            k75.a(yt22, yu6.d(jl4, 24.0f));
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new j17(str, if74, if75, if76, vr2, vr22, vr23, sr24, sr22, sr23, i);
        }
    }

    public static final void I(sr2 sr2, sr2 sr22, ml4 ml4, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        jl4 jl4;
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        sr23.getClass();
        sr24.getClass();
        yt22.g0(1203531241);
        if (yt22.i(sr23)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(sr24)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            s87.a(yu6.c, (pq6) null, 0, 0, 0.0f, 0.0f, su0.J(-757500434, new y30((Object) sg3.E(new yb5(Integer.valueOf(R.string.terms_s1_title), Integer.valueOf(R.string.terms_s1_body)), new yb5(Integer.valueOf(R.string.terms_s2_title), Integer.valueOf(R.string.terms_s2_body)), new yb5(Integer.valueOf(R.string.terms_s3_title), Integer.valueOf(R.string.terms_s3_body)), new yb5(Integer.valueOf(R.string.terms_s4_title), Integer.valueOf(R.string.terms_s4_body)), new yb5(Integer.valueOf(R.string.terms_s5_title), Integer.valueOf(R.string.terms_s5_body)), new yb5(Integer.valueOf(R.string.terms_s6_title), Integer.valueOf(R.string.terms_s6_body)), new yb5(Integer.valueOf(R.string.terms_s7_title), Integer.valueOf(R.string.terms_s7_body))), (Object) sr24, (Object) sr23, 3), yt22), yt22, 12582912, 126);
            jl4 = jl4.w;
        } else {
            yt2.Y();
            jl4 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ou4(i, 15, sr23, sr24, jl4);
        }
    }

    public static final void J(int i, String str, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5 = i;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(600840962);
        if (yt22.e(i5)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (yt22.g(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            sd2 sd2 = yu6.a;
            au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            ed1.b(p25.x(i5, yt22), str, we.f(sd2, q96.a(8.0f)), (jb) null, i51.c, 0.0f, yt22, 24584 | (i7 & 112), 104);
            k75.a(yt22, yu6.d(jl4.w, 4.0f));
            t37 t37 = ch4.b;
            yt2 yt23 = yt2;
            str2 = str;
            yf7.b(str2, (ml4) null, jt0.b(0.7f, ((zg4) yt22.k(t37)).a.q), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(t37)).b.n, yt23, (i7 >> 3) & 14, 0, 131066);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ob3(i, i2, str2);
        }
    }

    public static final void K(sr2 sr2, yt2 yt2, int i) {
        boolean z2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(1971594876);
        if ((i & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i & 1, z2)) {
            su0.a(sr22, su0.J(-3422524, new ce4(23, sr22), yt22), (ml4) null, (gs2) null, ar7.a0, ar7.b0, ar7.c0, (pq6) null, 0, 0, 0, 0, (wu1) null, yt2, 1794102, 16268);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ce4(i, 24, sr22);
        }
    }

    public static final void L(String str, if7 if7, vr2 vr2, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        sr2 sr24;
        boolean z3;
        if7 if72 = if7;
        sr2 sr25 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(701729057);
        if (yt22.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (yt22.g(if72)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (yt22.i(vr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (yt22.i(sr25)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (yt22.i(sr22)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (yt22.i(sr23)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        boolean z4 = false;
        if ((74899 & i13) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i13 & 1, z2)) {
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            ml4 Z = t49.Z(x91.M(yu6.c, 32.0f, 0.0f, 2), t49.Y(yt22), true);
            au0 a = zt0.a(wr.e, xb4.L, yt22, 54);
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
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            x83 x83 = pv8.z;
            if (x83 == null) {
                w83 w83 = new w83("Filled.MarkEmailRead", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i14 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 e = pb4.e(12.0f, 19.0f);
                e.e(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
                e.e(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f);
                be5 be5 = e;
                be5.m(6.0f);
                e.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                be5.f(4.0f);
                e.d(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                be5.n(12.0f);
                e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                be5.g(8.08f);
                e.d(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f);
                be5.c();
                be5.j(4.0f, 6.0f);
                be5.i(8.0f, 5.0f);
                be5.i(8.0f, -5.0f);
                be5.n(2.0f);
                be5.i(-8.0f, 5.0f);
                be5.h(4.0f, 8.0f);
                be5.m(6.0f);
                be5.c();
                be5.j(17.34f, 22.0f);
                be5.i(-3.54f, -3.54f);
                be5.i(1.41f, -1.41f);
                be5.i(2.12f, 2.12f);
                be5.i(4.24f, -4.24f);
                be5.h(23.0f, 16.34f);
                be5.h(17.34f, 22.0f);
                be5.c();
                w83.a(w83, be5.a, ky6, 14336);
                x83 = w83.b();
                pv8.z = x83;
            }
            ik2 ik22 = ik2;
            String u = l55.u(R.string.verify_email, yt22);
            jl4 jl4 = jl4.w;
            ml4 l = yu6.l(jl4, 64.0f);
            t37 t37 = ch4.b;
            x83 x832 = x83;
            ik2 ik23 = ik22;
            jl4 jl42 = jl4;
            yt2 yt23 = yt22;
            jl4 jl43 = jl42;
            d83.a(x832, u, l, ((zg4) yt22.k(t37)).a.a, yt23, 384, 0);
            yt2 yt24 = yt23;
            yt2 yt25 = yt2;
            jl4 jl44 = jl43;
            yf7.b(pb4.j(jl43, 16.0f, yt24, R.string.verify_email, yt24), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt24.k(t37)).b.d, yt25, 0, 0, 131070);
            yt2 yt26 = yt25;
            k75.a(yt26, yu6.d(jl44, 8.0f));
            yt2 yt27 = yt2;
            yf7.b(l55.v(R.string.verification_code_sent, new Object[]{str}, yt26), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt27, 0, 0, 261118);
            k75.a(yt27, yu6.d(jl44, 24.0f));
            String str2 = if72.a;
            String str3 = if72.b;
            bt3 bt3 = bt3.e;
            yt2 yt28 = yt2;
            tf4.g(str2, vr2, ar7.s, ar7.t, (ml4) null, bt3.a(3), (gs2) null, str3, yt28, ((i13 >> 3) & 112) | 3456, 80);
            yt2 yt29 = yt28;
            k75.a(yt29, yu6.d(jl44, 8.0f));
            sd2 sd2 = yu6.a;
            boolean i15 = yt29.i(ik23);
            if ((i13 & 7168) == 2048) {
                z4 = true;
            }
            boolean z5 = i15 | z4;
            Object Q = yt29.Q();
            if (z5 || Q == ay0.a) {
                sr24 = sr2;
                z3 = true;
                Q = new xp5(ik23, sr24, 1);
                yt29.o0(Q);
            } else {
                sr24 = sr2;
                z3 = true;
            }
            pv8.d((sr2) Q, ar7.u, sd2, false, yt29, 432, 24);
            yt22 = yt2;
            pv8.i(sr22, (ml4) null, false, ar7.v, yt22, ((i13 >> 12) & 14) | 3072, 6);
            pv8.i(sr23, (ml4) null, false, ar7.w, yt22, ((i13 >> 15) & 14) | 3072, 6);
            k75.a(yt22, yu6.d(jl44, 24.0f));
            yt22.r(z3);
        } else {
            sr24 = sr25;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new zp5(str, if7, vr2, sr24, sr22, sr23, i);
        }
    }

    public static final void M(j42 j42) {
        im3 im3;
        j42.getClass();
        if (j42 instanceof im3) {
            im3 = (im3) j42;
        } else {
            im3 = null;
        }
        if (im3 == null) {
            StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
            h.s(hl6.m(b26.a, j42.getClass(), sb));
        }
    }

    public static final bm3 N(ok1 ok1) {
        bm3 bm3;
        ok1.getClass();
        if (ok1 instanceof bm3) {
            bm3 = (bm3) ok1;
        } else {
            bm3 = null;
        }
        if (bm3 != null) {
            return bm3;
        }
        h.s(hl6.m(b26.a, ok1.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static Map O(Object obj) {
        if (!(obj instanceof ar3) || (obj instanceof er3)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                sg3.S(e, mp7.class.getName());
                throw e;
            }
        } else {
            l0("kotlin.collections.MutableMap", obj);
            throw null;
        }
    }

    public static Set P(Object obj) {
        if (!(obj instanceof ar3) || (obj instanceof lr3)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e) {
                sg3.S(e, mp7.class.getName());
                throw e;
            }
        } else {
            l0("kotlin.collections.MutableSet", obj);
            throw null;
        }
    }

    public static Object Q(int i, Object obj) {
        if (obj == null || a0(i, obj)) {
            return obj;
        }
        l0("kotlin.jvm.functions.Function" + i, obj);
        throw null;
    }

    public static final void R(WorkDatabase workDatabase, f01 f01, cd8 cd8) {
        int i;
        workDatabase.getClass();
        f01.getClass();
        ArrayList I2 = sg3.I(cd8);
        int i2 = 0;
        while (!I2.isEmpty()) {
            List<xd8> list = ((cd8) it0.k0(I2)).d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (xd8 xd8 : list) {
                    if (!xd8.b.j.i.isEmpty() && (i = i + 1) < 0) {
                        sg3.Y();
                        throw null;
                    }
                }
                continue;
            }
            i2 += i;
        }
        if (i2 != 0) {
            int intValue = ((Number) sg3.O(workDatabase.w().a, true, false, new rb8(6))).intValue();
            int i3 = f01.j;
            if (intValue + i2 > i3) {
                h.q(hl6.n(pb4.p("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i3, ";\nalready enqueued count: ", intValue, ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            }
        }
    }

    public static final Object S(f61 f61, fi2 fi2, sr2 sr2, hs2 hs2, di2[] di2Arr) {
        fu0 fu0 = new fu0((f61) null, fi2, sr2, hs2, di2Arr);
        sg6 sg6 = new sg6(f61, f61.r());
        Object t = o55.t(sg6, true, sg6, fu0);
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    public static final File T(Context context, String str) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static yk4 U(yk4 yk4, ey3 ey3, tg7 tg7, tp1 tp1, dl2 dl2) {
        if (yk4 != null && ey3 == yk4.a && aa5.k(tg7, ey3).equals(yk4.b) && tp1.b() == yk4.c.w && dl2 == yk4.d) {
            return yk4;
        }
        yk4 yk42 = yk4.h;
        if (yk42 != null && ey3 == yk42.a && aa5.k(tg7, ey3).equals(yk42.b) && tp1.b() == yk42.c.w && dl2 == yk42.d) {
            return yk42;
        }
        yk4 yk43 = new yk4(ey3, aa5.k(tg7, ey3), new wp1(tp1.b(), tp1.Y()), dl2);
        yk4.h = yk43;
        return yk43;
    }

    public static final x83 V() {
        x83 x83 = J;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.CallReceived", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(19.3f, 4.71f);
        e.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.h(7.0f, 15.59f);
        e.m(10.0f);
        e.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.l(-1.0f, 0.45f, -1.0f, 1.0f);
        e.n(8.0f);
        e.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.g(8.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.l(-0.45f, -1.0f, -1.0f, -1.0f);
        e.f(8.41f);
        e.h(19.3f, 6.11f);
        e.e(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b = w83.b();
        J = b;
        return b;
    }

    public static cv4 W(qt0 qt0) {
        qt0 qt02 = qt0;
        cv4 cv4 = qt02.g0;
        if (cv4 != null) {
            return cv4;
        }
        long d = st0.d(qt02, r16.f);
        long d2 = st0.d(qt02, r16.j);
        long d3 = st0.d(qt02, r16.g);
        rt0 rt0 = r16.k;
        long d4 = st0.d(qt02, rt0);
        rt0 rt02 = r16.l;
        long j = d;
        cv4 cv42 = new cv4(j, d2, d3, d4, st0.d(qt02, rt02), jt0.b(0.38f, st0.d(qt02, rt0)), jt0.b(0.38f, st0.d(qt02, rt02)));
        qt02.g0 = cv42;
        return cv42;
    }

    public static final ml4 X(ml4 ml4, vr2 vr2) {
        return ml4.d(new v90(vr2));
    }

    public static ml4 Y(ml4 ml4, float f, float f2, float f3, float f4, float f5, pq6 pq6, boolean z2, int i) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        m23 m23;
        boolean z3;
        int i2 = i;
        if ((i2 & 1) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f3;
        }
        if ((i2 & 32) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f4;
        }
        if ((i2 & 256) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f5;
        }
        long j = ql7.b;
        if ((i2 & 2048) != 0) {
            m23 = gr8.h;
        } else {
            m23 = pq6;
        }
        if ((i2 & 4096) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        long j2 = gx2.a;
        return ml4.d(new dx2(f6, f7, f8, f9, f10, j, m23, z3, j2, j2, zx3.a));
    }

    public static String Z(no0 no0, lj3 lj3) {
        if (!no0.b(lj3)) {
            return no0.a();
        }
        return null;
    }

    public static boolean a0(int i, Object obj) {
        int i2;
        if (obj instanceof ds2) {
            if (obj instanceof qs2) {
                i2 = ((qs2) obj).g();
            } else if (obj instanceof sr2) {
                i2 = 0;
            } else if (obj instanceof vr2) {
                i2 = 1;
            } else if (obj instanceof gs2) {
                i2 = 2;
            } else if (obj instanceof hs2) {
                i2 = 3;
            } else if (obj instanceof is2) {
                i2 = 4;
            } else if (obj instanceof js2) {
                i2 = 5;
            } else if (obj instanceof ks2) {
                i2 = 6;
            } else if (obj instanceof ls2) {
                i2 = 7;
            } else if (obj instanceof ms2) {
                i2 = 8;
            } else if (obj instanceof ns2) {
                i2 = 9;
            } else if (obj instanceof tr2) {
                i2 = 10;
            } else if (obj instanceof ur2) {
                i2 = 11;
            } else {
                boolean z2 = obj instanceof kt2;
                if (z2) {
                    i2 = 12;
                } else if (obj instanceof wr2) {
                    i2 = 13;
                } else if (obj instanceof xr2) {
                    i2 = 14;
                } else if (obj instanceof yr2) {
                    i2 = 15;
                } else if (obj instanceof zr2) {
                    i2 = 16;
                } else if (obj instanceof as2) {
                    i2 = 17;
                } else if (obj instanceof bs2) {
                    i2 = 18;
                } else if (obj instanceof cs2) {
                    i2 = 19;
                } else if (obj instanceof es2) {
                    i2 = 20;
                } else if (obj instanceof fs2) {
                    i2 = 21;
                } else if (z2) {
                    i2 = 22;
                } else {
                    i2 = -1;
                }
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b0(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof ar3) || (obj instanceof dr3)) {
            return true;
        }
        return false;
    }

    public static final void c(u5 u5Var, a54 a54, b54 b54, Integer num, if7 if7, if7 if72, vr2 vr2, vr2 vr22, vr2 vr23, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        u5 u5Var2 = u5Var;
        Integer num2 = num;
        yt2 yt22 = yt2;
        yt22.g0(-2065887361);
        if (yt22.i(u5Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        int i14 = 16;
        if (yt22.i(a54)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i13 | i3;
        if (yt22.i(b54)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i16 = i15 | i4;
        if (yt22.g(num2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i17 = i16 | i5;
        if (yt22.g(if7)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i18 = i17 | i6;
        if (yt22.g(if72)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i19 = i18 | i7;
        if (yt22.i(vr2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i20 = i19 | i8;
        if (yt22.i(vr22)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i21 = i20 | i9;
        if (yt22.i(vr23)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i22 = i21 | i10;
        if (yt22.i(sr2)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i23 = i22 | i11;
        if (yt22.i(sr22)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        if (yt22.i(sr23)) {
            i14 = 32;
        }
        int i24 = i12 | i14;
        if ((306783379 & i23) == 306783378 && (i24 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt22.V(i23 & 1, z2)) {
            ml4 Z = t49.Z(x91.M(yu6.c, 16.0f, 0.0f, 2), t49.Y(yt22), true);
            au0 a = zt0.a(wr.c, xb4.L, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, Z);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i25 = i23;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 32.0f));
            String str = u5Var2.d;
            String str2 = u5Var2.e;
            if (str.length() == 0) {
                str = null;
            }
            wn6.a(str, l55.u(R.string.profile_picture, yt22), we.f(yu6.l(jl4, 96.0f), q96.a), p25.x(R.drawable.ic_avatar, yt22), p25.x(R.drawable.ic_avatar, yt22), yt22);
            k75.a(yt22, yu6.d(jl4, 16.0f));
            String str3 = u5Var2.b;
            t37 t37 = ch4.b;
            String str4 = str2;
            t37 t372 = t37;
            yt2 yt23 = yt2;
            yf7.b(str3, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(t37)).b.e, yt23, 0, 0, 131070);
            yt2 yt24 = yt23;
            yf7.b(u5Var2.c, (ml4) null, jt0.b(0.6f, ((zg4) yt24.k(t372)).a.q), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt24.k(t372)).b.k, yt23, 0, 0, 131066);
            yt2 yt25 = yt23;
            if (!d57.I0(str4)) {
                yt25.e0(-977283726);
                k75.a(yt25, yu6.d(jl4, 16.0f));
                s(str4, num2, yt25, (i25 >> 6) & 112);
                yt25.r(false);
            } else {
                yt25.e0(-977073267);
                yt25.r(false);
            }
            k75.a(yt25, yu6.d(jl4, 24.0f));
            int i26 = i25 >> 6;
            yt2 yt26 = yt25;
            w(a54, b54, if7, if72, vr2, vr22, vr23, sr2, sr22, yt26, ((i25 >> 3) & 126) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128) | ((i24 << 24) & 234881024));
            yt22 = yt26;
            k75.a(yt22, yu6.d(jl4, 24.0f));
            pv8.h(sr23, yu6.a, false, (la5) null, ar7.K, yt22, ((i24 >> 3) & 14) | 24624, 12);
            k75.a(yt22, yu6.d(jl4, 16.0f));
            WeakHashMap weakHashMap = ib8.w;
            k75.a(yt22, fd1.b0(n63.h(yt22).l));
            k75.a(yt22, yu6.d(jl4, 60.0f));
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new lh1(u5Var2, a54, b54, num2, if7, if72, vr2, vr22, vr23, sr2, sr22, sr23, i);
        }
    }

    public static final ArrayList c0(List list, List list2, float f) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(new jt0(uq3.F(((jt0) list.get(Math.min(i, list.size() - 1))).a, ((jt0) list2.get(Math.min(i, list2.size() - 1))).a, f)));
        }
        return arrayList;
    }

    public static final void d(wp5 wp5, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, vr2 vr26, sr2 sr2, sr2 sr22, sr2 sr23, sr2 sr24, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        wp5 wp52;
        sr2 sr25;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        sd2 sd2;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        wp5 wp53 = wp5;
        vr2 vr27 = vr2;
        sr2 sr26 = sr2;
        sr2 sr27 = sr22;
        yt2 yt22 = yt2;
        int i16 = i;
        yt22.g0(1418532058);
        if ((i16 & 6) == 0) {
            if (yt22.g(wp53)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i2 = i15 | i16;
        } else {
            i2 = i16;
        }
        if ((i16 & 48) == 0) {
            if (yt22.i(vr27)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i2 |= i14;
        }
        if ((i16 & 384) == 0) {
            if (yt22.i(vr22)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i2 |= i13;
        } else {
            vr2 vr28 = vr22;
        }
        if ((i16 & 3072) == 0) {
            if (yt22.i(vr23)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i2 |= i12;
        } else {
            vr2 vr29 = vr23;
        }
        if ((i16 & 24576) == 0) {
            if (yt22.i(vr24)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i2 |= i11;
        } else {
            vr2 vr210 = vr24;
        }
        if ((196608 & i16) == 0) {
            if (yt22.i(vr25)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i2 |= i10;
        } else {
            vr2 vr211 = vr25;
        }
        if ((1572864 & i16) == 0) {
            if (yt22.i(vr26)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i2 |= i9;
        } else {
            vr2 vr212 = vr26;
        }
        if ((12582912 & i16) == 0) {
            if (yt22.i(sr26)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i2 |= i8;
        }
        if ((100663296 & i16) == 0) {
            if (yt22.i(sr27)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i2 |= i7;
        }
        if ((805306368 & i16) == 0) {
            if (yt22.i(sr23)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i2 |= i6;
        } else {
            sr2 sr28 = sr23;
        }
        if (yt22.i(sr24)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        if ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt22.V(i2 & 1, z2)) {
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            if (wp53.d == rv.w) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i17 = i2;
            ml4 Z = t49.Z(x91.M(yu6.c, 32.0f, 0.0f, 2), t49.Y(yt22), true);
            g80 g80 = xb4.L;
            pe2 pe2 = wr.e;
            au0 a = zt0.a(pe2, g80, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, Z);
            ux0.d.getClass();
            pe2 pe22 = pe2;
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            vy0 vy02 = vy0;
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E2);
            if (z3) {
                i4 = R.string.sign_in;
            } else {
                i4 = R.string.create_account;
            }
            vy0 vy03 = vy02;
            ik2 ik22 = ik2;
            yt2 yt23 = yt2;
            ck ckVar5 = ckVar4;
            ck ckVar6 = ckVar3;
            ce ceVar2 = ceVar;
            yf7.b(l55.u(i4, yt22), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(ch4.b)).b.d, yt23, 0, 0, 131070);
            yt2 yt24 = yt23;
            sd2 sd22 = yu6.a;
            ea6 a2 = ca6.a(pe22, xb4.I, yt24, 54);
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E3 = gw8.E(yt24, sd22);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy03);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a2);
            g75.Q(ckVar2, yt24, m2);
            f21.s(hashCode2, yt24, ckVar6, yt24, ceVar2);
            g75.Q(ckVar5, yt24, E3);
            if (z3) {
                i5 = R.string.do_not_have_an_account;
            } else {
                i5 = R.string.already_have_an_account;
            }
            sd2 sd23 = sd22;
            String u = l55.u(i5, yt24);
            sd2 sd24 = sd23;
            yt2 yt25 = yt2;
            yf7.b(u, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 0, 0, 262142);
            yt2 yt26 = yt25;
            if ((i17 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h = yt26.h(z3) | z4;
            Object Q = yt26.Q();
            Object obj = ay0.a;
            if (h || Q == obj) {
                Q = new to0(3, vr27, z3);
                yt26.o0(Q);
            }
            pv8.i((sr2) Q, (ml4) null, false, su0.J(1007774927, new yp5(z3, 0), yt26), yt26, 3072, 6);
            yt26.r(true);
            jl4 jl4 = jl4.w;
            k75.a(yt26, yu6.d(jl4, 24.0f));
            if (!z3) {
                yt26.e0(1176093198);
                wp52 = wp5;
                if7 if7 = wp52.e;
                yt2 yt27 = yt2;
                tf4.g(if7.a, vr22, ar7.f, ar7.g, (ml4) null, (bt3) null, (gs2) null, if7.b, yt27, ((i17 >> 3) & 112) | 3456, 112);
                yt27.r(false);
            } else {
                wp52 = wp5;
                yt26.e0(1176568242);
                yt26.r(false);
            }
            if7 if72 = wp52.f;
            String str = if72.a;
            String str2 = if72.b;
            bt3 bt3 = bt3.e;
            tf4.g(str, vr23, ar7.h, ar7.i, (ml4) null, bt3.a(6), (gs2) null, str2, yt2, ((i17 >> 6) & 112) | 3456, 80);
            if7 if73 = wp52.g;
            yt2 yt28 = yt2;
            sd2 sd25 = sd24;
            tf4.e(if73.a, vr24, ar7.j, ar7.k, sd25, if73.b, yt28, ((i17 >> 9) & 112) | 28032);
            sd2 sd26 = sd25;
            yt2 yt29 = yt28;
            if (!z3) {
                yt29.e0(1177694751);
                if7 if74 = wp52.h;
                sd2 sd27 = sd26;
                yt2 yt210 = yt2;
                tf4.e(if74.a, vr25, ar7.l, ar7.m, sd27, if74.b, yt210, ((i17 >> 12) & 112) | 28032);
                sd2 = sd27;
                k75.a(yt210, yu6.d(jl4, 8.0f));
                if7 if75 = wp52.i;
                yt2 yt211 = yt2;
                tf4.g(if75.a, vr26, ar7.n, ar7.o, (ml4) null, (bt3) null, (gs2) null, if75.b, yt211, ((i17 >> 15) & 112) | 3456, 112);
                yt29 = yt211;
                yt29.r(false);
            } else {
                sd2 = sd26;
                yt29.e0(1178881586);
                yt29.r(false);
            }
            if (z3) {
                yt29.e0(1178915283);
                pv8.i(sr24, new f23(xb4.M), false, ar7.p, yt29, (i3 & 14) | 3072, 4);
                z5 = false;
                yt29.r(false);
            } else {
                z5 = false;
                yt29.e0(1179252594);
                yt29.r(false);
            }
            k75.a(yt29, yu6.d(jl4, 8.0f));
            ik2 ik23 = ik22;
            boolean i18 = yt29.i(ik23) | yt29.h(z3);
            if ((i17 & 29360128) == 8388608) {
                z6 = true;
            } else {
                z6 = z5;
            }
            boolean z7 = i18 | z6;
            if ((i17 & 234881024) == 67108864) {
                z5 = true;
            }
            boolean z8 = z5 | z7;
            Object Q2 = yt29.Q();
            if (z8 || Q2 == obj) {
                sr25 = sr2;
                sr27 = sr22;
                Q2 = new pw4(ik23, z3, sr25, sr27);
                yt29.o0(Q2);
            } else {
                sr25 = sr2;
                sr27 = sr22;
            }
            sd2 sd28 = sd2;
            pv8.d((sr2) Q2, su0.J(-1695497208, new os4(z3, 1), yt29), sd28, false, yt29, 432, 24);
            hj8.d(x91.M(jl4, 0.0f, 16.0f, 1), yt29, 48);
            yt2 yt212 = yt2;
            pv8.g(sr23, ar7.q, yu6.d(x91.M(sd28, 0.0f, 8.0f, 1), 56.0f), false, ar7.r, yt212, ((i17 >> 27) & 14) | 25008, 8);
            yt22 = yt212;
            k75.a(yt22, yu6.d(jl4, 24.0f));
            yt22.r(true);
        } else {
            wp52 = wp53;
            sr25 = sr26;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new mh1(wp52, vr27, vr22, vr23, vr24, vr25, vr26, sr25, sr27, sr23, sr24, i);
        }
    }

    public static final ArrayList d0(List list, List list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(Float.valueOf(we.E(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
        }
        return arrayList;
    }

    public static final long e0(long j, long j2, float f) {
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & -9223372034707292160L) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & -9223372034707292160L) == 0) {
            return t35.x(j, j2, f);
        }
        if (f < 0.5f) {
            return j;
        }
        return j2;
    }

    public static final void f(ml4 ml4, long j, long j2, hs2 hs2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        long j3;
        long j4;
        float f;
        pq6 pq6;
        long j5 = j;
        hs2 hs22 = hs2;
        yt2 yt22 = yt2;
        yt22.g0(1428256508);
        int i3 = i | 6;
        if (yt22.f(j5)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i3 | i2 | 128;
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i4 & 1, z2)) {
            yt22.a0();
            int i5 = i & 1;
            ml4 ml42 = jl4.w;
            if (i5 == 0 || yt22.C()) {
                j4 = st0.b(j5, yt22);
                ml4 = ml42;
            } else {
                yt22.Y();
                j4 = j2;
            }
            yt22.s();
            if (hs22 != null) {
                f = ar7.c;
            } else {
                f = ar7.e;
            }
            if (hs22 != null) {
                yt22.e0(-1051024814);
                pq6 = hr6.a(ar7.b, yt22);
                yt22.r(false);
            } else {
                yt22.e0(-1050967433);
                pq6 = hr6.a(ar7.d, yt22);
                yt22.r(false);
            }
            ml4 h = b96.h(yu6.a(ml4, f, f), j5, pq6);
            if (hs22 != null) {
                ml42 = x91.M(ml42, 4.0f, 0.0f, 2);
            }
            ml4 d = h.d(ml42);
            ea6 a = ca6.a(wr.e, xb4.I, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            if (hs22 != null) {
                yt22.e0(1345815094);
                a35.a(j4, dr7.a(ar7.a, yt22), su0.J(541712501, new on(hs22, 1), yt22), yt22, 384);
                yt22.r(false);
            } else {
                yt22.e0(1346141834);
                yt22.r(false);
            }
            yt22.r(true);
            j3 = j4;
        } else {
            yt22.Y();
            j3 = j2;
        }
        ml4 ml43 = ml4;
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new f40(ml43, j5, j3, hs22, i);
        }
    }

    public static final fu6 f0(vw3 vw3) {
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof zg2) {
            return ((zg2) n0).x;
        }
        if (n0 instanceof fu6) {
            return (fu6) n0;
        }
        h.c();
        return null;
    }

    public static final ui i0(sr2 sr2, yt2 yt2, int i) {
        View view = (View) yt2.k(ye.f);
        boolean g = yt2.g(view);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (g || Q == d63) {
            Q = new ui(view, (vr2) null, sr2);
            yt2.o0(Q);
        }
        ui uiVar = (ui) Q;
        boolean i2 = yt2.i(uiVar);
        Object Q2 = yt2.Q();
        if (i2 || Q2 == d63) {
            Q2 = new oi(uiVar, 3);
            yt2.o0(Q2);
        }
        t49.e(uiVar, (vr2) Q2, yt2);
        return uiVar;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [ar7, kv3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [ar7, java.lang.Object] */
    public static ar7 j0(Metadata metadata) {
        boolean z2;
        String str;
        rk4 rk4;
        if (metadata.mv().length != 0) {
            int[] mv = metadata.mv();
            if ((metadata.xi() & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rk4 rk42 = new rk4(mv, z2);
            boolean a = rk42.a(1, 1, 0);
            if (!a) {
                if (a) {
                    StringBuilder sb = new StringBuilder("while maximum supported version is ");
                    if (rk42.f) {
                        rk4 = rk4.g;
                    } else {
                        rk4 = rk4.h;
                    }
                    sb.append(rk4);
                    sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                    str = sb.toString();
                } else {
                    str = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
                }
                ta1.i("Provided Metadata instance has version ", rk42, ", ", str);
                return null;
            }
            try {
                int k = metadata.k();
                if (k == 1) {
                    return new iv3(metadata);
                }
                if (k == 2) {
                    return new jv3(metadata);
                }
                if (k == 3) {
                    return new mv3(metadata);
                }
                if (k == 4) {
                    String[] d1 = metadata.d1();
                    d1.getClass();
                    List asList = Arrays.asList(d1);
                    asList.getClass();
                    new so3(metadata.mv());
                    metadata.xi();
                    ? obj = new Object();
                    obj.F0 = asList;
                    return obj;
                } else if (k == 5) {
                    return new lv3(metadata);
                } else {
                    ? obj2 = new Object();
                    new so3(metadata.mv());
                    metadata.xi();
                    return obj2;
                }
            } catch (Throwable th) {
                th = th;
                if (!(th instanceof IllegalArgumentException) && !(th instanceof VirtualMachineError) && !(th instanceof ThreadDeath)) {
                    th = new IllegalArgumentException("Exception occurred when reading Kotlin metadata", th);
                }
                throw th;
            }
        } else {
            h.q("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
    }

    public static final boolean k0(vw3 vw3) {
        qp7 qp7;
        vq0 u = vw3.L().u();
        if (u != null) {
            if (dc3.a(u) && dc3.b(u) && !ts1.g((ql4) u).equals(n27.h)) {
                return true;
            }
            vq0 u2 = vw3.L().u();
            if (u2 != null && (u2 instanceof ql4) && (((ql4) u2).v0() instanceof kn4) && !iq7.e(vw3)) {
                return true;
            }
        }
        vq0 u3 = vw3.L().u();
        if (u3 instanceof qp7) {
            qp7 = (qp7) u3;
        } else {
            qp7 = null;
        }
        if (qp7 != null && k0(jb5.p(qp7))) {
            return true;
        }
        return false;
    }

    public static final void l(fw0 fw0, ml4 ml4, fw0 fw02, yt2 yt2, int i) {
        boolean z2;
        fw0 fw03 = fw0;
        fw0 fw04 = fw02;
        yt2 yt22 = yt2;
        yt22.g0(-1693825945);
        int i2 = i | 48;
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = pf.f;
                yt22.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
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
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, lh4);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E2);
            ml4 w0 = rc9.w0(jl4, "anchor");
            lh4 d = mb0.d(xb4.C, false);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E3 = gw8.E(yt22, w0);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E3);
            qb0 qb0 = qb0.a;
            fw04.u(qb0, yt22, 54);
            yt22.r(true);
            ml4 w02 = rc9.w0(jl4, "badge");
            lh4 d2 = mb0.d(xb4.y, false);
            ml4 = jl4;
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E4 = gw8.E(yt22, w02);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d2);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E4);
            fw03.u(qb0, yt22, 54);
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        ml4 ml42 = ml4;
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new y30(fw03, ml42, fw04, i);
        }
    }

    public static void l0(String str, Object obj) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(pb4.l(str2, " cannot be cast to ", str));
        sg3.S(classCastException, mp7.class.getName());
        throw classCastException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03c5  */
    public static final void m(String str, String str2, Integer num, sr2 sr2, gs2 gs2, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        Integer num2;
        int i5;
        sr2 sr22;
        int i6;
        gs2 gs22;
        boolean z2;
        gs2 gs23;
        sr2 sr23;
        Integer num3;
        yx5 v;
        Integer num4;
        sr2 sr24;
        gs2 gs24;
        d63 d63;
        boolean z3;
        boolean z4;
        boolean z5;
        sr2 sr25;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(158211267);
        if (yt22.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i3 | i10;
        if (yt22.g(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        int i13 = i2 & 4;
        if (i13 != 0) {
            i5 = i12 | 384;
            num2 = num;
        } else {
            num2 = num;
            if (yt22.g(num2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 = i12 | i9;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i6 = i5 | 3072;
            sr22 = sr2;
        } else {
            sr22 = sr2;
            if (yt22.i(sr22)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 = i5 | i8;
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i6 |= 24576;
        } else if ((i10 & 24576) == 0) {
            gs22 = gs2;
            if (yt22.i(gs22)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
            if ((i6 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!yt22.V(i6 & 1, z2)) {
                if (i13 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i14 != 0) {
                    sr24 = null;
                } else {
                    sr24 = sr22;
                }
                if (i15 != 0) {
                    gs24 = null;
                } else {
                    gs24 = gs22;
                }
                cs0 cs0 = (cs0) yt22.k(xy0.e);
                String u = l55.u(R.string.copied, yt22);
                sd2 sd2 = yu6.a;
                h80 h80 = xb4.I;
                rr rrVar = wr.a;
                ea6 a = ca6.a(rrVar, h80, yt22, 48);
                Context context = (Context) yt22.k(ye.b);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E2 = gw8.E(yt22, sd2);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                ck ckVar = tx0.f;
                g75.Q(ckVar, yt22, a);
                ck ckVar2 = tx0.e;
                g75.Q(ckVar2, yt22, m);
                Integer valueOf = Integer.valueOf(hashCode);
                ck ckVar3 = tx0.g;
                g75.Q(ckVar3, yt22, valueOf);
                ce ceVar = tx0.h;
                g75.O(yt22, ceVar);
                cs0 cs02 = cs0;
                ck ckVar4 = tx0.d;
                g75.Q(ckVar4, yt22, E2);
                ml4 O = x91.O(new lz3(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
                h80 h802 = h80;
                rr rrVar2 = rrVar;
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E3 = gw8.E(yt22, O);
                yt22.i0();
                h80 h803 = h802;
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, a2);
                g75.Q(ckVar2, yt22, m2);
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                jl4 jl4 = jl4.w;
                if (gs24 != null) {
                    yt22.e0(1917577028);
                    gs24.H(yt22, Integer.valueOf((i6 >> 12) & 14));
                    k75.a(yt22, yu6.d(jl4, 6.0f));
                    yt22.r(false);
                } else {
                    yt22.e0(1917670245);
                    yt22.r(false);
                }
                ea6 a3 = ca6.a(rrVar2, h803, yt22, 48);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E4 = gw8.E(yt22, jl4);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, a3);
                g75.Q(ckVar2, yt22, m3);
                f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E4);
                int i16 = i6;
                gs2 gs25 = gs24;
                Context context2 = context;
                cs0 cs03 = cs02;
                yt2 yt23 = yt2;
                jl4 jl42 = jl4;
                vy0 vy02 = vy0;
                ce ceVar2 = ceVar;
                ck ckVar5 = ckVar3;
                ck ckVar6 = ckVar4;
                String str3 = u;
                ck ckVar7 = ckVar2;
                ck ckVar8 = ckVar;
                String str4 = str;
                yf7.b(str4, (ml4) null, jt0.b(0.6f, su0.r(yt22).q), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).n, yt23, i6 & 14, 0, 131066);
                yt2 yt24 = yt23;
                d63 d632 = ay0.a;
                if (num4 != null) {
                    yt24.e0(-778736797);
                    jl4 jl43 = jl42;
                    k75.a(yt24, x91.M(jl43, 4.0f, 0.0f, 2));
                    String v2 = l55.v(R.string.invitation_count_badge, new Object[]{num4}, yt24);
                    ml4 h = b96.h(we.f(yu6.l(jl43, 22.0f), q96.a), su0.r(yt24).a, gr8.h);
                    boolean g = yt24.g(v2);
                    Object Q = yt24.Q();
                    if (g || Q == d632) {
                        Q = new cb(v2, 20);
                        yt24.o0(Q);
                    }
                    ml4 a4 = ck6.a(h, false, (vr2) Q);
                    lh4 d = mb0.d(xb4.C, false);
                    int hashCode4 = Long.hashCode(yt24.T);
                    vf5 m4 = yt24.m();
                    ml4 E5 = gw8.E(yt24, a4);
                    yt24.i0();
                    if (yt24.S) {
                        yt24.l(vy02);
                    } else {
                        yt24.r0();
                    }
                    g75.Q(ckVar8, yt24, d);
                    g75.Q(ckVar7, yt24, m4);
                    f21.s(hashCode4, yt24, ckVar5, yt24, ceVar2);
                    g75.Q(ckVar6, yt24, E5);
                    d63 = d632;
                    yt2 yt25 = yt2;
                    yf7.b(String.valueOf(num4.intValue()), (ml4) null, su0.r(yt24).b, 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt24).o, yt25, 1572864, 0, 131002);
                    yt24 = yt25;
                    z4 = true;
                    yt24.r(true);
                    z3 = false;
                    yt24.r(false);
                } else {
                    d63 = d632;
                    z4 = true;
                    z3 = false;
                    yt24.e0(-777846911);
                    yt24.r(false);
                }
                yt24.r(z4);
                boolean z6 = z3;
                yt2 yt26 = yt2;
                yf7.b(str2, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt24).h, yt26, (i16 >> 3) & 14, 0, 131070);
                yt2 yt27 = yt26;
                yt27.r(true);
                cs0 cs04 = cs03;
                boolean i17 = yt27.i(cs04);
                if ((i16 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Context context3 = context2;
                String str5 = str3;
                boolean i18 = i17 | z5 | yt27.i(context3) | yt27.g(str5);
                Object Q2 = yt27.Q();
                if (i18 || Q2 == d63) {
                    mm0 mm0 = new mm0((Object) cs04, (Object) str2, (Object) context3, (Object) str5, 6);
                    yt27.o0(mm0);
                    Q2 = mm0;
                }
                yt22 = yt2;
                hj8.e((sr2) Q2, (ml4) null, false, (a83) null, (pq6) null, ar7.d0, yt22, 1572864, 62);
                if (sr24 != null) {
                    yt22.e0(1413022734);
                    sr25 = sr24;
                    hj8.e(sr25, (ml4) null, false, (a83) null, (pq6) null, ar7.e0, yt22, ((i16 >> 9) & 14) | 1572864, 62);
                    yt22.r(false);
                } else {
                    sr25 = sr24;
                    yt22.e0(1413250491);
                    yt22.r(false);
                }
                yt22.r(true);
                sr23 = sr25;
                num3 = num4;
                gs23 = gs25;
            } else {
                yt22.Y();
                num3 = num2;
                sr23 = sr22;
                gs23 = gs22;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new rl0(str, str2, num3, sr23, gs23, i, i2, 1);
                return;
            }
            return;
        }
        gs22 = gs2;
        if ((i6 & 9363) == 9362) {
        }
        if (!yt22.V(i6 & 1, z2)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final GetCredentialException m0(CharSequence charSequence, String str) {
        String str2;
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (!k57.u0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new GetCredentialCustomException(charSequence, str);
        }
        int i = GetPublicKeyCredentialException.x;
        if (charSequence != null) {
            str2 = charSequence.toString();
        } else {
            str2 = null;
        }
        try {
            if (k57.u0(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                int i2 = GetPublicKeyCredentialDomException.y;
                return pv8.u(str, str2);
            }
            throw new Exception();
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static final void n(ru4 ru4, is2 is2, ku1 ku1, yt2 yt2, int i) {
        int i2;
        boolean z2;
        ku1 ku12;
        ku1 ku13;
        int i3;
        d63 d63;
        yt2 yt22 = yt2;
        is2.getClass();
        yt22.g0(-861727008);
        ru4 ru42 = ru4;
        if (yt22.i(ru42)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 128;
        if ((i4 & 131) != 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i4 & 1, z2)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                a68 a = va4.a(yt22);
                if (a != null) {
                    i3 = i4 & -897;
                    ku13 = (ku1) n85.p(b26.a.b(ku1.class), a, b96.O(o85.l(a), yt22), o85.k(a), yt22);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt22.Y();
                i3 = i4 & -897;
                ku13 = ku1;
            }
            yt22.s();
            aq4 n = hj8.n(ku13.g, yt22);
            int i5 = i3;
            String str = ku13.e;
            aq4 aq4 = n;
            String str2 = ku13.d;
            String str3 = (String) aq4.getValue();
            boolean i6 = yt22.i(ku13);
            Object Q = yt22.Q();
            d63 d632 = ay0.a;
            if (i6 || Q == d632) {
                d63 = d632;
                o0 o0Var = new o0(1, ku13, ku1.class, "appendDigit", "appendDigit(Ljava/lang/String;)V", 0, 0, 5);
                yt22.o0(o0Var);
                Q = o0Var;
            } else {
                d63 = d632;
            }
            vr2 vr2 = (vr2) ((zq3) Q);
            boolean i7 = yt22.i(ku13);
            Object Q2 = yt22.Q();
            if (i7 || Q2 == d63) {
                yd ydVar = new yd(0, ku13, ku1.class, "deleteLastDigit", "deleteLastDigit()V", 0, 0, 7);
                yt22.o0(ydVar);
                Q2 = ydVar;
            }
            sr2 sr2 = (sr2) ((zq3) Q2);
            boolean i8 = yt22.i(ku13);
            Object Q3 = yt22.Q();
            if (i8 || Q3 == d63) {
                yd ydVar2 = new yd(0, ku13, ku1.class, "call", "call()V", 0, 0, 8);
                yt22.o0(ydVar2);
                Q3 = ydVar2;
            }
            sr2 sr22 = sr2;
            o(str, str2, str3, ru42, vr2, sr22, (sr2) ((zq3) Q3), yt22, (i5 << 9) & 7168);
            ku12 = ku13;
        } else {
            yt2.Y();
            ku12 = ku1;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 13, ru4, is2, ku12);
        }
    }

    public static final fu6 n0(vw3 vw3) {
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof zg2) {
            return ((zg2) n0).y;
        }
        if (n0 instanceof fu6) {
            return (fu6) n0;
        }
        h.c();
        return null;
    }

    public static final void o(String str, String str2, String str3, ru4 ru4, vr2 vr2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        boolean z2;
        i80 i80;
        jl4 jl4;
        float f;
        String str4;
        long k;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        vr2 vr22 = vr2;
        sr2 sr23 = sr22;
        yt2 yt22 = yt2;
        int i11 = i;
        m23 m23 = gr8.h;
        h80 h80 = xb4.I;
        i80 i802 = xb4.C;
        yt22.g0(-479475764);
        if ((i11 & 6) == 0) {
            if (yt22.g(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            String str5 = str;
            i2 = i11;
        }
        if ((i11 & 48) == 0) {
            if (yt22.g(str2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        } else {
            String str6 = str2;
        }
        if ((i11 & 384) == 0) {
            if (yt22.g(str3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        } else {
            String str7 = str3;
        }
        if ((i11 & 3072) == 0) {
            if (yt22.i(ru4)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        } else {
            ru4 ru42 = ru4;
        }
        if ((i11 & 24576) == 0) {
            if (yt22.i(vr22)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i11) == 0) {
            if (yt22.i(sr2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        } else {
            sr2 sr24 = sr2;
        }
        if ((i11 & 1572864) == 0) {
            if (yt22.i(sr23)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        int i12 = i2;
        if ((i12 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i12 & 1, z2)) {
            ml4 h = b96.h(yu6.c, z08.c(), m23);
            WeakHashMap weakHashMap = ib8.w;
            ml4 T = x91.T(h, new e64(n63.h(yt22).l, h75.h));
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            au0 a = zt0.a(srVar, g80, yt22, 0);
            sr srVar2 = srVar;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, T);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E2);
            sd2 sd2 = yu6.a;
            ml4 L = x91.L(sd2, 4.0f, 4.0f);
            ea6 a2 = ca6.a(wr.a, h80, yt22, 48);
            sd2 sd22 = sd2;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E3 = gw8.E(yt22, L);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a2);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E3);
            ck ckVar5 = ckVar3;
            m23 m232 = m23;
            h80 h802 = h80;
            g80 g802 = g80;
            ce ceVar2 = ceVar;
            ck ckVar6 = ckVar2;
            sr srVar3 = srVar2;
            ck ckVar7 = ckVar4;
            vy0 vy02 = vy0;
            hj8.e(ru4, (ml4) null, false, (a83) null, (pq6) null, fd1.a, yt22, ((i12 >> 9) & 14) | 1572864, 62);
            long k2 = z08.k();
            long k3 = ya5.k(20);
            am2 am2 = am2.B;
            yt2 yt23 = yt2;
            yf7.b(str, (ml4) null, k2, k3, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i12 & 14) | 1597440, 0, 262058);
            am2 am22 = am2;
            yt2 yt24 = yt23;
            yt24.r(true);
            ml4 d = sd22.d(new lz3(1.0f, true));
            lh4 d2 = mb0.d(i802, false);
            int hashCode3 = Long.hashCode(yt24.T);
            vf5 m3 = yt24.m();
            ml4 E4 = gw8.E(yt24, d);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, d2);
            g75.Q(ckVar6, yt24, m3);
            f21.s(hashCode3, yt24, ckVar5, yt24, ceVar2);
            g75.Q(ckVar7, yt24, E4);
            au0 a3 = zt0.a(srVar3, xb4.L, yt24, 48);
            int hashCode4 = Long.hashCode(yt24.T);
            vf5 m4 = yt24.m();
            jl4 jl42 = jl4.w;
            ml4 E5 = gw8.E(yt24, jl42);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a3);
            g75.Q(ckVar6, yt24, m4);
            f21.s(hashCode4, yt24, ckVar5, yt24, ceVar2);
            g75.Q(ckVar7, yt24, E5);
            if (str2.length() > 0) {
                yt24.e0(-932875531);
                jl4 = jl42;
                yt2 yt25 = yt2;
                i80 = i802;
                f = 1.0f;
                yf7.b(str2, (ml4) null, z08.a(), ya5.k(16), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, ((i12 >> 3) & 14) | 1597440, 0, 262058);
                yt24 = yt25;
                k75.a(yt24, yu6.d(jl4, 4.0f));
                yt24.r(false);
            } else {
                i80 = i802;
                f = 1.0f;
                jl4 = jl42;
                yt24.e0(-932580504);
                yt24.r(false);
            }
            if (str3.length() == 0) {
                str4 = "·  ·  ·";
            } else {
                str4 = str3;
            }
            if (str3.length() == 0) {
                k = z08.e();
            } else {
                k = z08.k();
            }
            long j = k;
            if (str3.length() > 10) {
                i3 = 26;
            } else {
                i3 = 36;
            }
            yt2 yt26 = yt24;
            yf7.b(str4, (ml4) null, j, ya5.k(i3), am22, (ea7) null, ya5.k(2), (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt26, 102236160, 0, 261802);
            yt2 yt27 = yt26;
            yt27.r(true);
            yt27.r(true);
            int i13 = 2;
            ml4 M = x91.M(jl4, 24.0f, 0.0f, 2);
            float f2 = 8.0f;
            au0 a4 = zt0.a(new ur(8.0f, true, new h(2)), g802, yt27, 6);
            int hashCode5 = Long.hashCode(yt27.T);
            vf5 m5 = yt27.m();
            ml4 E6 = gw8.E(yt27, M);
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy02);
            } else {
                yt27.r0();
            }
            g75.Q(ckVar, yt27, a4);
            g75.Q(ckVar6, yt27, m5);
            f21.s(hashCode5, yt27, ckVar5, yt27, ceVar2);
            g75.Q(ckVar7, yt27, E6);
            yt27.e0(-1066367643);
            Iterator it = sg3.E(sg3.E("1", "2", "3"), sg3.E("4", "5", "6"), sg3.E("7", "8", "9"), sg3.E("*", "0", "#")).iterator();
            while (true) {
                String str8 = null;
                int i14 = 15;
                float f3 = 60.0f;
                if (!it.hasNext()) {
                    break;
                }
                List<String> list = (List) it.next();
                sd2 sd23 = yu6.a;
                ea6 a5 = ca6.a(new ur(f2, true, new h(i13)), xb4.H, yt27, 6);
                int hashCode6 = Long.hashCode(yt27.T);
                vf5 m6 = yt27.m();
                ml4 E7 = gw8.E(yt27, sd23);
                ux0.d.getClass();
                vy0 vy03 = tx0.b;
                yt27.i0();
                if (yt27.S) {
                    yt27.l(vy03);
                } else {
                    yt27.r0();
                }
                g75.Q(tx0.f, yt27, a5);
                g75.Q(tx0.e, yt27, m6);
                g75.Q(tx0.g, yt27, Integer.valueOf(hashCode6));
                g75.O(yt27, tx0.h);
                g75.Q(tx0.d, yt27, E7);
                yt27.e0(-676854374);
                for (String str9 : list) {
                    m23 m233 = m232;
                    ml4 h2 = b96.h(we.f(yu6.d(new lz3(f, true), f3), q96.a), z08.f(), m233);
                    if ((i12 & 57344) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean g = z3 | yt27.g(str9);
                    Object Q = yt27.Q();
                    if (g || Q == ay0.a) {
                        Q = new r20(vr2, str9, 1);
                        yt27.o0(Q);
                    } else {
                        vr2 vr23 = vr2;
                    }
                    ml4 u = h49.u(h2, false, str8, (sr2) Q, i14);
                    i80 i803 = i80;
                    lh4 d3 = mb0.d(i803, false);
                    int hashCode7 = Long.hashCode(yt27.T);
                    vf5 m7 = yt27.m();
                    ml4 E8 = gw8.E(yt27, u);
                    ux0.d.getClass();
                    vy0 vy04 = tx0.b;
                    yt27.i0();
                    if (yt27.S) {
                        yt27.l(vy04);
                    } else {
                        yt27.r0();
                    }
                    g75.Q(tx0.f, yt27, d3);
                    g75.Q(tx0.e, yt27, m7);
                    g75.Q(tx0.g, yt27, Integer.valueOf(hashCode7));
                    g75.O(yt27, tx0.h);
                    g75.Q(tx0.d, yt27, E8);
                    yt2 yt28 = yt2;
                    yf7.b(str9, (ml4) null, z08.k(), ya5.k(22), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt28, 1597440, 0, 262058);
                    yt27 = yt28;
                    yt27.r(true);
                    f2 = 8.0f;
                    m232 = m233;
                    i80 = i803;
                    i13 = 2;
                    str8 = null;
                    i14 = 15;
                    f3 = 60.0f;
                }
                int i15 = i13;
                float f4 = f2;
                i80 i804 = i80;
                m23 m234 = m232;
                yt27.r(false);
                yt27.r(true);
            }
            i80 i805 = i80;
            m23 m235 = m232;
            yt27.r(false);
            sd2 sd24 = yu6.a;
            ea6 a6 = ca6.a(new ur(f2, true, new h(i13)), h802, yt27, 54);
            int hashCode8 = Long.hashCode(yt27.T);
            vf5 m8 = yt27.m();
            ml4 E9 = gw8.E(yt27, sd24);
            ux0.d.getClass();
            vy0 vy05 = tx0.b;
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy05);
            } else {
                yt27.r0();
            }
            ck ckVar8 = tx0.f;
            g75.Q(ckVar8, yt27, a6);
            ck ckVar9 = tx0.e;
            g75.Q(ckVar9, yt27, m8);
            Integer valueOf2 = Integer.valueOf(hashCode8);
            ck ckVar10 = tx0.g;
            g75.Q(ckVar10, yt27, valueOf2);
            ce ceVar3 = tx0.h;
            g75.O(yt27, ceVar3);
            ck ckVar11 = tx0.d;
            g75.Q(ckVar11, yt27, E9);
            ga6 ga6 = ga6.a;
            k75.a(yt27, ga6.b(jl4, f, true));
            ml4 u2 = h49.u(b96.h(we.f(yu6.d(ga6.b(jl4, f, true), 60.0f), q96.a), z08.a(), m235), false, (String) null, sr22, 15);
            lh4 d4 = mb0.d(i805, false);
            ml4 ml4 = u2;
            int hashCode9 = Long.hashCode(yt27.T);
            vf5 m9 = yt27.m();
            ml4 E10 = gw8.E(yt27, ml4);
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy05);
            } else {
                yt27.r0();
            }
            g75.Q(ckVar8, yt27, d4);
            g75.Q(ckVar9, yt27, m9);
            f21.s(hashCode9, yt27, ckVar10, yt27, ceVar3);
            g75.Q(ckVar11, yt27, E10);
            vy0 vy06 = vy05;
            x83 G2 = r16.G();
            int i16 = jt0.h;
            ck ckVar12 = ckVar11;
            ck ckVar13 = ckVar8;
            yt2 yt29 = yt2;
            d83.a(G2, (String) null, yu6.l(jl4, 26.0f), jt0.c, yt29, 3504, 0);
            yt22 = yt29;
            yt22.r(true);
            ml4 b = ga6.b(jl4, 1.0f, true);
            lh4 d5 = mb0.d(i805, false);
            int hashCode10 = Long.hashCode(yt22.T);
            vf5 m10 = yt22.m();
            ml4 E11 = gw8.E(yt22, b);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy06);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar13, yt22, d5);
            g75.Q(ckVar9, yt22, m10);
            f21.s(hashCode10, yt22, ckVar10, yt22, ceVar3);
            g75.Q(ckVar12, yt22, E11);
            hj8.e(sr2, (ml4) null, false, (a83) null, (pq6) null, fd1.b, yt22, ((i12 >> 15) & 14) | 1572864, 62);
            yt22.r(true);
            yt22.r(true);
            yt22.r(true);
            k75.a(yt22, yu6.d(jl4, 24.0f));
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new iu1(str, str2, str3, ru4, vr2, sr2, sr22, i, 0);
        }
    }

    public static final be8 o0(List list, be8 be8) {
        be8 be82;
        be8 be83 = be8;
        list.getClass();
        be83.getClass();
        boolean a = be83.e.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean a2 = be83.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean a3 = be83.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (a || !a2 || !a3) {
            be82 = be8;
        } else {
            String str = be83.c;
            be1 be1 = new be1(0);
            ce1 ce1 = be83.e;
            ce1.getClass();
            be1.a(ce1.a);
            LinkedHashMap linkedHashMap = be1.a;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            ce1 ce12 = new ce1(linkedHashMap);
            r16.g0(ce12);
            be82 = be8.b(be83, (String) null, (kd8) null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", ce12, 0, 0, 0, 0, 0, 0, 33554411);
        }
        if (Build.VERSION.SDK_INT <= 25) {
            j31 j31 = be82.j;
            String str2 = be82.c;
            Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
            if (!sg3.e(str2, cls.getName()) && (j31.e || j31.f)) {
                be1 be12 = new be1(0);
                ce1 ce13 = be82.e;
                ce13.getClass();
                be12.a(ce13.a);
                LinkedHashMap linkedHashMap2 = be12.a;
                linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                ce1 ce14 = new ce1(linkedHashMap2);
                r16.g0(ce14);
                return be8.b(be82, (String) null, (kd8) null, cls.getName(), ce14, 0, 0, 0, 0, 0, 0, 33554411);
            }
        }
        return be82;
    }

    public static final void p(b54 b54, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        b54 b542;
        int i4;
        String l;
        vy0 vy0;
        b54 b543 = b54;
        yt2 yt22 = yt2;
        yt22.g0(-695051820);
        if (yt22.i(b543)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            int ordinal = b543.d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    l = hl6.l(yt22, 2070103268, R.string.license_discount_manual, yt22, false);
                } else if (ordinal == 2) {
                    l = hl6.l(yt22, 2070105990, R.string.license_discount_referral, yt22, false);
                } else if (ordinal == 3) {
                    yt22.e0(2070108763);
                    l = l55.v(R.string.license_discount_coupon, new Object[]{b543.e}, yt22);
                    yt22.r(false);
                } else {
                    yt22.e0(2070101523);
                    yt22.r(false);
                    h.c();
                    return;
                }
                String str = l;
                o96 a = q96.a(16.0f);
                ml4 f = we.f(yu6.a, a);
                long j = su0.r(yt22).c;
                m23 m23 = gr8.h;
                ml4 L = x91.L(b96.h(f, j, m23).d(new ta0(1.0f, new ky6(jt0.b(0.3f, su0.r(yt22).a)), a)), 12.0f, 10.0f);
                ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E2 = gw8.E(yt22, L);
                ux0.d.getClass();
                vy0 vy02 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy02);
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
                g75.Q(ckVar4, yt22, E2);
                jl4 jl4 = jl4.w;
                ml4 l2 = yu6.l(jl4, 40.0f);
                String str2 = str;
                o96 o96 = q96.a;
                vy0 vy03 = vy02;
                ml4 h = b96.h(we.f(l2, o96), su0.r(yt22).a, m23);
                lh4 d = mb0.d(xb4.C, false);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E3 = gw8.E(yt22, h);
                yt22.i0();
                if (yt22.S) {
                    vy0 = vy03;
                    yt22.l(vy0);
                } else {
                    vy0 = vy03;
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d);
                g75.Q(ckVar2, yt22, m2);
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                x83 p = h03.p();
                jl4 jl42 = jl4;
                m23 m232 = m23;
                ck ckVar5 = ckVar4;
                o96 o962 = o96;
                ce ceVar2 = ceVar;
                ck ckVar6 = ckVar3;
                long j2 = su0.r(yt22).b;
                ck ckVar7 = ckVar;
                ck ckVar8 = ckVar2;
                d83.a(p, (String) null, yu6.l(jl4, 22.0f), j2, yt22, 432, 0);
                yt22.r(true);
                k75.a(yt22, yu6.p(jl42, 12.0f));
                lz3 lz3 = new lz3(1.0f, true);
                au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E4 = gw8.E(yt22, lz3);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar7, yt22, a3);
                g75.Q(ckVar8, yt22, m3);
                f21.s(hashCode3, yt22, ckVar6, yt22, ceVar2);
                g75.Q(ckVar5, yt22, E4);
                String str3 = str2;
                jl4 jl43 = jl42;
                i4 = 1;
                yt2 yt23 = yt2;
                ce ceVar3 = ceVar2;
                ck ckVar9 = ckVar5;
                ck ckVar10 = ckVar7;
                ck ckVar11 = ckVar8;
                ck ckVar12 = ckVar6;
                vy0 vy04 = vy0;
                yf7.b(str3, (ml4) null, su0.r(yt22).d, 0, am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).i, yt23, 1572864, 0, 131002);
                yt2 yt24 = yt23;
                yf7.b(l55.u(R.string.license_discount_note, yt24), (ml4) null, jt0.b(0.75f, su0.r(yt24).d), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt24).l, yt23, 0, 0, 131066);
                yt2 yt25 = yt23;
                yt25.r(true);
                jl4 jl44 = jl43;
                k75.a(yt25, yu6.p(jl44, 8.0f));
                ml4 L2 = x91.L(b96.h(we.f(jl44, o962), su0.r(yt25).a, m232), 12.0f, 6.0f);
                lh4 d2 = mb0.d(xb4.y, false);
                int hashCode4 = Long.hashCode(yt25.T);
                vf5 m4 = yt25.m();
                ml4 E5 = gw8.E(yt25, L2);
                yt25.i0();
                if (yt25.S) {
                    yt25.l(vy04);
                } else {
                    yt25.r0();
                }
                g75.Q(ckVar10, yt25, d2);
                g75.Q(ckVar11, yt25, m4);
                f21.s(hashCode4, yt25, ckVar12, yt25, ceVar3);
                g75.Q(ckVar9, yt25, E5);
                yt2 yt26 = yt2;
                yf7.b(l55.v(R.string.license_discount_badge, new Object[]{Integer.valueOf(b54.c)}, yt25), (ml4) null, su0.r(yt25).b, 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt25).h, yt26, 1572864, 0, 131002);
                yt22 = yt26;
                yt22.r(true);
                yt22.r(true);
                b542 = b54;
                i3 = i;
            } else {
                yt22.e0(-251005880);
                yt22.r(false);
                yx5 v = yt22.v();
                if (v != null) {
                    v.d = new dq5(b54, i, 0);
                    return;
                }
                return;
            }
        } else {
            i3 = i;
            b542 = b543;
            i4 = 1;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new dq5(b542, i3, i4);
        }
    }

    public static final long q(float f, boolean z2, boolean z3) {
        long j;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long j2 = 0;
        if (z2) {
            j = 1;
        } else {
            j = 0;
        }
        if (z3) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void r(if7 if7, vr2 vr2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        if7 if72 = if7;
        sr2 sr23 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(1853503057);
        if (yt22.g(if72)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (yt22.i(vr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (yt22.i(sr23)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (yt22.i(sr22)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i9 & 1, z2)) {
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            ml4 Z = t49.Z(x91.M(yu6.c, 32.0f, 0.0f, 2), t49.Y(yt22), true);
            au0 a = zt0.a(wr.e, xb4.L, yt22, 54);
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
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            ik2 ik22 = ik2;
            x83 z4 = uq3.z();
            String u = l55.u(R.string.reset_password, yt22);
            jl4 jl4 = jl4.w;
            ml4 l = yu6.l(jl4, 64.0f);
            t37 t37 = ch4.b;
            jl4 jl42 = jl4;
            ml4 ml4 = l;
            yt2 yt23 = yt2;
            d83.a(z4, u, ml4, ((zg4) yt22.k(t37)).a.a, yt23, 384, 0);
            yt2 yt24 = yt23;
            yt2 yt25 = yt2;
            jl4 jl43 = jl42;
            yf7.b(pb4.j(jl42, 16.0f, yt24, R.string.reset_password, yt24), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, ((zg4) yt24.k(t37)).b.d, yt25, 0, 0, 130046);
            yt2 yt26 = yt25;
            int i10 = i9;
            yt2 yt27 = yt2;
            yf7.b(pb4.j(jl43, 8.0f, yt26, R.string.reset_password_message, yt26), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt27, 0, 0, 261118);
            k75.a(yt27, yu6.d(jl43, 24.0f));
            String str = if72.a;
            String str2 = if72.b;
            bt3 bt3 = bt3.e;
            yt2 yt28 = yt2;
            tf4.g(str, vr2, ar7.x, ar7.y, (ml4) null, bt3.a(6), (gs2) null, str2, yt28, (i10 & 112) | 3456, 80);
            yt2 yt29 = yt28;
            k75.a(yt29, yu6.d(jl43, 8.0f));
            sd2 sd2 = yu6.a;
            boolean i11 = yt29.i(ik22);
            int i12 = i10;
            if ((i12 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = i11 | z3;
            Object Q = yt29.Q();
            if (z5 || Q == ay0.a) {
                Q = new xp5(ik22, sr2, 0);
                yt29.o0(Q);
            } else {
                sr2 sr24 = sr2;
            }
            pv8.d((sr2) Q, ar7.z, sd2, false, yt29, 432, 24);
            yt22 = yt2;
            pv8.i(sr22, (ml4) null, false, ar7.A, yt22, ((i12 >> 9) & 14) | 3072, 6);
            k75.a(yt22, yu6.d(jl43, 24.0f));
            yt22.r(true);
        } else {
            sr2 sr25 = sr23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60((Object) if72, (Object) vr2, (Object) sr2, (ds2) sr22, i, 9);
        }
    }

    public static final void s(String str, Integer num, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        yt2.g0(1458782746);
        if ((i & 6) == 0) {
            if (yt2.g(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(num)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            we.b(yu6.a, (pq6) null, (pl0) null, (ql0) null, su0.J(-1032299252, new uo2(str, (Object) num, (Object) (Context) yt2.k(ye.b), (Object) l55.v(R.string.share_invitation_message, new Object[]{str}, yt2), 6), yt2), yt2, 196614, 30);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) str, (Object) num, i, 14);
        }
    }

    public static final void t(vr2 vr2, ml4 ml4, k98 k98, fw0 fw0, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        ml4 ml42;
        fw0 fw02;
        jl4 jl4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        vr22.getClass();
        yt22.g0(825213488);
        if (yt22.i(vr22)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        k98 k982 = k98;
        if (yt22.g(k982)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            yt22.a0();
            int i6 = i & 1;
            jl4 jl42 = jl4.w;
            if (i6 == 0 || yt22.C()) {
                jl4 = jl42;
            } else {
                yt22.Y();
                jl4 = ml4;
            }
            yt22.s();
            String a = zw4.a(k982);
            long y2 = dh4.y();
            long x2 = dh4.x(yt22);
            long y3 = dh4.y();
            long x3 = dh4.x(yt22);
            String str = a;
            long j9 = jt0.f;
            long j10 = jt0.g;
            cv4 W = W(((zg4) yt22.k(ch4.b)).a);
            if (y2 == 16) {
                y2 = W.a;
            }
            long j11 = y2;
            if (y3 != 16) {
                j = y3;
            } else {
                j = W.b;
            }
            if (j9 != 16) {
                j2 = j9;
            } else {
                j2 = W.c;
            }
            if (x2 != 16) {
                j3 = x2;
            } else {
                j3 = W.d;
            }
            if (x3 != 16) {
                j4 = x3;
            } else {
                j4 = W.e;
            }
            int i7 = (j10 > 16 ? 1 : (j10 == 16 ? 0 : -1));
            if (i7 != 0) {
                j5 = j10;
            } else {
                j5 = W.f;
            }
            if (i7 != 0) {
                j6 = j10;
            } else {
                j6 = W.g;
            }
            int i8 = i5;
            ml4 ml43 = jl4;
            String str2 = str;
            jl4 jl43 = jl42;
            rw4 h = kl8.h(dh4.y(), dh4.y(), j9, dh4.x(yt22), dh4.x(yt22), 0, 0, yt2, 96);
            long j12 = j9;
            int i9 = iv4.a;
            yt22 = yt2;
            cf4 cf4 = new cf4(new cv4(j11, j, j2, j3, j4, j5, j6), h, iv4.a(0, dh4.y(), dh4.x(yt2), dh4.y(), dh4.x(yt2), yt22, 195), 5);
            boolean equals = str2.equals("NavigationBar");
            Object obj = ay0.a;
            if (equals) {
                yt22.e0(-455804951);
                Object Q = yt22.Q();
                if (Q == obj) {
                    Q = new ArrayList();
                    yt22.o0(Q);
                }
                List list = (List) Q;
                list.clear();
                boolean i10 = yt22.i(list);
                Object Q2 = yt22.Q();
                if (i10 || Q2 == obj) {
                    Q2 = new qw4(0, list);
                    yt22.o0(Q2);
                }
                vr22.y(new cl3((kx4) null, (cf4) null, (vr2) Q2, 3));
                sd2 sd2 = yu6.c;
                ml4 ml44 = ml43;
                ml4 d = ml44.d(sd2);
                lh4 d2 = mb0.d(xb4.y, false);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E2 = gw8.E(yt22, d);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                ck ckVar = tx0.f;
                g75.Q(ckVar, yt22, d2);
                ck ckVar2 = tx0.e;
                g75.Q(ckVar2, yt22, m);
                Integer valueOf = Integer.valueOf(hashCode);
                ck ckVar3 = tx0.g;
                g75.Q(ckVar3, yt22, valueOf);
                ce ceVar = tx0.h;
                g75.O(yt22, ceVar);
                ck ckVar4 = tx0.d;
                g75.Q(ckVar4, yt22, E2);
                f08 f08 = ed1.M;
                ml4 C2 = ed1.C(sd2, f08);
                au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E3 = gw8.E(yt22, C2);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, a2);
                g75.Q(ckVar2, yt22, m2);
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                fw0 fw03 = fw0;
                f21.r(6, fw03, yt22, true);
                u(ed1.C(qb0.a.a(jl43, xb4.F), f08), su0.J(298212955, new pz5(1, list), yt22), yt22, 48);
                yt22.r(true);
                yt22.r(false);
                fw02 = fw03;
                ml42 = ml44;
            } else {
                fw0 fw04 = fw0;
                ml4 ml45 = ml43;
                yt22.e0(-454311154);
                if (d18.b()) {
                    j7 = j12;
                } else {
                    j7 = jt0.b(0.5f, jt0.c);
                }
                if (d18.b()) {
                    j8 = jt0.b(0.06f, jt0.c);
                } else {
                    j8 = jt0.b(0.5f, jt0.c);
                }
                fw02 = fw04;
                boolean z3 = true;
                xw4 B2 = gr8.B(j8, dh4.x(yt22), j12, yt22, 805502976, 455);
                boolean i11 = yt22.i(cf4);
                if ((i8 & 14) != 4) {
                    z3 = false;
                }
                boolean z4 = i11 | z3;
                Object Q3 = yt22.Q();
                if (z4 || Q3 == obj) {
                    Q3 = new w34(9, cf4, vr22);
                    yt22.o0(Q3);
                }
                ml4 ml46 = ml45;
                fx4.e((vr2) Q3, ml46, str2, B2, j7, 0, (ix4) null, su0.J(1513704284, new x30(fw02, 8), yt22), yt22, 12582960);
                ml42 = ml46;
                yt22.r(false);
            }
        } else {
            fw02 = fw0;
            yt22.Y();
            ml42 = ml4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60(vr22, ml42, k98, fw02, i);
        }
    }

    public static final void u(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        long j;
        ml4 ml42 = ml4;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.g0(2131200502);
        if (yt22.g(ml42)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i4 & 1, z2)) {
            ml4 O = x91.O(yu6.t(ml42), 0.0f, 0.0f, 0.0f, dl3.b, 7);
            o96 o96 = dl3.a;
            if (d18.a()) {
                j = za5.k(uq3.d(4279381056L));
            } else if (d18.b()) {
                j = uq3.d(4279381056L);
            } else {
                j = jt0.c;
            }
            s87.a(O, o96, j, jt0.b(0.55f, ((zg4) yt22.k(ch4.b)).a.s), 3.0f, 8.0f, su0.J(-1168635781, new x30(fw02, 9), yt22), yt22, 12804144, 64);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ya(ml42, fw02, i3, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [gs2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final void v(fa6 fa6, boolean z2, f5 f5Var, fw0 fw0, ml4 ml4, gs2 r21, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z3;
        fw0 fw02;
        long j;
        long j2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4 = z2;
        f5 f5Var2 = f5Var;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i8 = i;
        fa6.getClass();
        yt22.g0(-24073494);
        if ((i8 & 48) == 0) {
            if (yt22.h(z4)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        if ((i8 & 384) == 0) {
            if (yt22.i(f5Var2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        fw0 fw03 = fw0;
        if ((i8 & 3072) == 0) {
            if (yt22.i(fw03)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i8 & 24576) == 0) {
            if (yt22.g(ml42)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i8) == 0) {
            i2 |= 65536;
        }
        gs2 gs22 = gs2;
        if ((1572864 & i8) == 0) {
            if (yt22.i(gs22)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599185 & i2) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i2 & 1, z3)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                fw02 = fw03;
            } else {
                yt22.Y();
                fw02 = r21;
            }
            yt22.s();
            if (z4) {
                yt22.e0(86373521);
                if (d18.b()) {
                    j = jt0.c;
                } else {
                    j = uq3.d(4279381056L);
                }
                yt22.r(false);
            } else {
                yt22.e0(86449750);
                j = jt0.b(0.55f, ((zg4) yt22.k(ch4.b)).a.s);
                yt22.r(false);
            }
            float f2 = dl3.d;
            ml4 f3 = we.f(yu6.d(ml42, f2), q96.a(f2 / 2.0f));
            if (z4) {
                yt22.e0(-1659767878);
                if (d18.b()) {
                    j2 = jt0.b(0.14f, jt0.c);
                } else {
                    j2 = jt0.b(0.12f, uq3.d(4279381056L));
                }
                yt22.r(false);
            } else {
                yt22.e0(-1659766987);
                yt22.r(false);
                j2 = jt0.f;
            }
            ml4 u = h49.u(b96.h(f3, j2, gr8.h), false, (String) null, f5Var2, 15);
            if (z4) {
                f = 16.0f;
            } else {
                f = 12.0f;
            }
            ml4 M = x91.M(u, f, 0.0f, 2);
            lh4 d = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
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
            g75.Q(tx0.d, yt22, E2);
            t49.c(b81.g(j, j41.a), su0.J(-1820364240, new ai0(z4, (Object) fw02, (Object) fw03, (Object) gs22, 9), yt22), yt22, 56);
            yt22.r(true);
        } else {
            yt22.Y();
            fw02 = r21;
        }
        yx5 v = yt22.v();
        if (v != null) {
            fw0 fw04 = fw02;
            v.d = new sl0(fa6, z2, f5Var2, fw0, ml42, fw04, gs2, i, 4);
        }
    }

    public static final void w(a54 a54, b54 b54, if7 if7, if7 if72, vr2 vr2, vr2 vr22, vr2 vr23, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        b54 b542;
        sr2 sr23;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        if7 if73 = if7;
        if7 if74 = if72;
        yt2 yt22 = yt2;
        int i12 = i;
        yt22.g0(559004712);
        a54 a542 = a54;
        if ((i12 & 6) == 0) {
            if (yt22.i(a542)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        if ((i12 & 48) == 0) {
            b542 = b54;
            if (yt22.i(b542)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        } else {
            b542 = b54;
        }
        if ((i12 & 384) == 0) {
            if ((i12 & 512) == 0) {
                z4 = yt22.g(if73);
            } else {
                z4 = yt22.i(if73);
            }
            if (z4) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i12 & 3072) == 0) {
            if ((i12 & 4096) == 0) {
                z3 = yt22.g(if74);
            } else {
                z3 = yt22.i(if74);
            }
            if (z3) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        vr2 vr24 = vr2;
        if ((i12 & 24576) == 0) {
            if (yt22.i(vr24)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        vr2 vr25 = vr22;
        if ((196608 & i12) == 0) {
            if (yt22.i(vr25)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        vr2 vr26 = vr23;
        if ((1572864 & i12) == 0) {
            if (yt22.i(vr26)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        sr2 sr24 = sr2;
        if ((12582912 & i12) == 0) {
            if (yt22.i(sr24)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i12) == 0) {
            sr23 = sr22;
            if (yt22.i(sr23)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            sr23 = sr22;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            we.b(yu6.a, (pq6) null, (pl0) null, (ql0) null, su0.J(-592865290, new aq5(a542, b542, sr23, if73, vr24, vr25, if74, vr26, sr24), yt22), yt22, 196614, 30);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new pu4(a54, b54, if7, if72, vr2, vr22, vr23, sr2, sr22, i12);
        }
    }

    public static final void x(byte[] bArr, boolean z2, boolean z3, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        jl4 jl4;
        float f;
        boolean z4;
        float f2;
        long j;
        float f3;
        ck ckVar;
        ce ceVar;
        ck ckVar2;
        int i2;
        ck ckVar3;
        float f4;
        byte[] bArr2 = bArr;
        boolean z5 = z2;
        boolean z6 = z3;
        yt2 yt22 = yt2;
        yt22.g0(1117131151);
        int i3 = i | (yt22.i(bArr2) ? 4 : 2) | (yt22.h(z5) ? 32 : 16) | (yt22.h(z6) ? 256 : 128) | (yt22.i(sr2) ? 2048 : 1024);
        if (yt22.V(i3 & 1, (i3 & 9363) != 9362)) {
            sd2 sd2 = yu6.a;
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            au0 a = zt0.a(srVar, g80, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar4 = tx0.f;
            g75.Q(ckVar4, yt22, a);
            ck ckVar5 = tx0.e;
            g75.Q(ckVar5, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar6 = tx0.g;
            g75.Q(ckVar6, yt22, valueOf);
            ce ceVar2 = tx0.h;
            g75.O(yt22, ceVar2);
            vy0 vy02 = vy0;
            ck ckVar7 = tx0.d;
            g75.Q(ckVar7, yt22, E2);
            sd2 sd22 = sd2;
            int i4 = i3;
            sr srVar2 = srVar;
            ce ceVar3 = ceVar2;
            ck ckVar8 = ckVar6;
            vy0 vy03 = vy02;
            ck ckVar9 = ckVar7;
            ck ckVar10 = ckVar4;
            ck ckVar11 = ckVar5;
            g80 g802 = g80;
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.license_proof, yt22), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt22).i, yt23, 0, 0, 131070);
            yt2 yt24 = yt23;
            jl4 jl42 = jl4.w;
            k75.a(yt24, yu6.d(jl42, 4.0f));
            if (bArr == null) {
                yt24.e0(1845784940);
                pv8.g(sr2, su0.J(1912582746, new os4(z5, 2), yt24), sd22, !z5, ar7.T, yt24, ((i4 >> 9) & 14) | 25008, 0);
                yt24.r(false);
                z4 = true;
                f = 0.6f;
                bArr2 = bArr;
                jl4 = jl42;
                f2 = 8.0f;
            } else {
                yt24.e0(1846615213);
                ml4 K2 = x91.K(b96.h(we.f(sd22, q96.a(12.0f)), jt0.b(0.35f, su0.r(yt24).r), gr8.h), 8.0f);
                ea6 a2 = ca6.a(wr.a, xb4.I, yt24, 48);
                int hashCode2 = Long.hashCode(yt24.T);
                vf5 m2 = yt24.m();
                ml4 E3 = gw8.E(yt24, K2);
                yt24.i0();
                if (yt24.S) {
                    yt24.l(vy03);
                } else {
                    yt24.r0();
                }
                g75.Q(ckVar10, yt24, a2);
                ck ckVar12 = ckVar11;
                g75.Q(ckVar12, yt24, m2);
                ck ckVar13 = ckVar8;
                ce ceVar4 = ceVar3;
                f21.s(hashCode2, yt24, ckVar13, yt24, ceVar4);
                ck ckVar14 = ckVar9;
                g75.Q(ckVar14, yt24, E3);
                int i5 = i4 & 14;
                byte[] bArr3 = bArr;
                boolean i6 = yt24.i(bArr3);
                Object Q = yt24.Q();
                if (i6 || Q == ay0.a) {
                    f3 = 8.0f;
                    Q = new dn2(bArr3, (f61) null, 1);
                    yt24.o0(Q);
                } else {
                    f3 = 8.0f;
                }
                hg hgVar = (hg) u55.r(bArr3, (gs2) Q, yt24, ((i5 << 3) & 112) | 6).getValue();
                if (hgVar != null) {
                    yt24.e0(988711473);
                    ed1.c(hgVar, we.f(yu6.l(jl42, 56.0f), q96.a(f3)), yt24, 24624);
                    yt24.r(false);
                    i2 = 0;
                    ckVar3 = ckVar12;
                    ckVar = ckVar14;
                    ckVar2 = ckVar13;
                    ceVar = ceVar4;
                    bArr2 = bArr3;
                } else {
                    yt24.e0(989053899);
                    x83 x83 = x91.r;
                    if (x83 != null) {
                        f4 = 56.0f;
                    } else {
                        w83 w83 = new w83("Filled.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i7 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 be5 = new be5();
                        be5.j(21.0f, 19.0f);
                        be5.m(5.0f);
                        be5 be52 = be5;
                        be52.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        be5.f(5.0f);
                        be52.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        be5.n(14.0f);
                        be52.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        be5.g(14.0f);
                        be52.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        be5.c();
                        be5.j(8.5f, 13.5f);
                        be5.i(2.5f, 3.01f);
                        be5.h(14.5f, 12.0f);
                        be5.i(4.5f, 6.0f);
                        be5.f(5.0f);
                        be5.i(3.5f, -4.5f);
                        be5.c();
                        w83.a(w83, be5.a, ky6, 14336);
                        x83 = w83.b();
                        x91.r = x83;
                        f4 = 56.0f;
                    }
                    ckVar = ckVar14;
                    ckVar3 = ckVar12;
                    ceVar = ceVar4;
                    ckVar2 = ckVar13;
                    ml4 l = yu6.l(jl42, f4);
                    bArr2 = bArr;
                    d83.a(x83, (String) null, l, 0, yt24, 432, 8);
                    i2 = 0;
                    yt24.r(false);
                }
                k75.a(yt24, yu6.p(jl42, 12.0f));
                lz3 lz3 = new lz3(1.0f, true);
                au0 a3 = zt0.a(srVar2, g802, yt24, i2);
                int hashCode3 = Long.hashCode(yt24.T);
                vf5 m3 = yt24.m();
                ml4 E4 = gw8.E(yt24, lz3);
                yt24.i0();
                if (yt24.S) {
                    yt24.l(vy03);
                } else {
                    yt24.r0();
                }
                g75.Q(ckVar10, yt24, a3);
                g75.Q(ckVar3, yt24, m3);
                f21.s(hashCode3, yt24, ckVar2, yt24, ceVar);
                g75.Q(ckVar, yt24, E4);
                f = 0.6f;
                f2 = f3;
                yt2 yt25 = yt2;
                jl4 = jl42;
                z4 = true;
                yf7.b(l55.u(R.string.license_proof_attached, yt24), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt24).i, yt25, 0, 0, 131070);
                yf7.b((bArr2.length / 1024) + " KB", (ml4) null, jt0.b(0.6f, su0.r(yt2).q), 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, su0.x(yt2).l, yt25, 0, 0, 131066);
                yt25.r(true);
                yt2 yt26 = yt2;
                pv8.i(sr22, (ml4) null, false, ar7.U, yt26, 3078, 6);
                yt24 = yt26;
                yt24.r(true);
                yt24.r(false);
            }
            String u = l55.u(z3 ? R.string.license_proof_error : R.string.license_proof_hint, yt24);
            tg7 tg7 = su0.x(yt24).l;
            if (z3) {
                yt24.e0(1848719710);
                j = su0.r(yt24).w;
                yt24.r(false);
            } else {
                yt24.e0(1848788871);
                j = jt0.b(f, su0.r(yt24).q);
                yt24.r(false);
            }
            yt2 yt27 = yt2;
            yf7.b(u, (ml4) null, j, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg7, yt27, 0, 0, 131066);
            yt22 = yt27;
            k75.a(yt22, yu6.d(jl4, f2));
            yt22.r(z4);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new jh1(bArr2, z2, z3, sr2, sr22, i);
        }
    }

    public static final void y(a54 a54, yt2 yt2, int i) {
        int i2;
        boolean z2;
        eo7 eo7;
        a54 a542 = a54;
        yt2 yt22 = yt2;
        yt22.g0(-942723696);
        if (yt22.i(a542)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            int ordinal = a542.a.ordinal();
            if (ordinal == 0) {
                yt22.e0(280632711);
                eo7 = new eo7(pv8.I(), l55.u(R.string.license_status_none, yt22), new jt0(jt0.b(0.6f, ((zg4) yt22.k(ch4.b)).a.q)));
                yt22.r(false);
            } else if (ordinal == 1) {
                yt22.e0(280639670);
                x83 x83 = kl8.w;
                if (x83 == null) {
                    w83 w83 = new w83("Filled.HourglassTop", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                    int i4 = e38.a;
                    ky6 ky6 = new ky6(jt0.b);
                    be5 f = pb4.f(6.0f, 2.0f, 0.01f, 6.0f);
                    f.h(10.0f, 12.0f);
                    f.i(-3.99f, 4.01f);
                    f.h(6.0f, 22.0f);
                    f.g(12.0f);
                    f.n(-6.0f);
                    f.i(-4.0f, -4.0f);
                    f.i(4.0f, -3.99f);
                    f.m(2.0f);
                    f.f(6.0f);
                    f.c();
                    f.j(16.0f, 16.5f);
                    f.m(20.0f);
                    f.f(8.0f);
                    f.n(-3.5f);
                    f.i(4.0f, -4.0f);
                    f.h(16.0f, 16.5f);
                    f.c();
                    w83.a(w83, f.a, ky6, 14336);
                    x83 = w83.b();
                    kl8.w = x83;
                }
                eo7 = new eo7(x83, l55.u(R.string.license_status_pending, yt22), new jt0(((zg4) yt22.k(ch4.b)).a.j));
                yt22.r(false);
            } else if (ordinal == 2) {
                yt22.e0(280646339);
                if (a542.c()) {
                    yt22.e0(110117543);
                    eo7 = new eo7(pv8.I(), l55.u(R.string.license_status_expired, yt22), new jt0(((zg4) yt22.k(ch4.b)).a.w));
                    yt22.r(false);
                } else {
                    yt22.e0(110324871);
                    x83 x832 = ar7.C0;
                    if (x832 == null) {
                        w83 w832 = new w83("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i5 = e38.a;
                        ky6 ky62 = new ky6(jt0.b);
                        be5 e = pb4.e(12.0f, 2.0f);
                        e.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        be5 be5 = e;
                        be5.l(4.48f, 10.0f, 10.0f, 10.0f);
                        be5.l(10.0f, -4.48f, 10.0f, -10.0f);
                        be5.k(17.52f, 2.0f, 12.0f, 2.0f);
                        be5.c();
                        be5.j(10.0f, 17.0f);
                        be5.i(-5.0f, -5.0f);
                        be5.i(1.41f, -1.41f);
                        be5.h(10.0f, 14.17f);
                        be5.i(7.59f, -7.59f);
                        be5.h(19.0f, 8.0f);
                        be5.i(-9.0f, 9.0f);
                        be5.c();
                        w83.a(w832, be5.a, ky62, 14336);
                        x832 = w832.b();
                        ar7.C0 = x832;
                    }
                    eo7 = new eo7(x832, l55.u(R.string.license_status_active, yt22), new jt0(((zg4) yt22.k(ch4.b)).a.a));
                    yt22.r(false);
                }
                yt22.r(false);
            } else if (ordinal == 3) {
                yt22.e0(280661140);
                eo7 = new eo7(pv8.I(), l55.u(R.string.license_status_rejected, yt22), new jt0(((zg4) yt22.k(ch4.b)).a.w));
                yt22.r(false);
            } else if (ordinal == 4) {
                yt22.e0(280667507);
                eo7 = new eo7(pv8.I(), l55.u(R.string.license_status_expired, yt22), new jt0(((zg4) yt22.k(ch4.b)).a.w));
                yt22.r(false);
            } else {
                yt22.e0(280632111);
                yt22.r(false);
                h.c();
                return;
            }
            x83 x833 = (x83) eo7.w;
            String str = (String) eo7.x;
            long j = ((jt0) eo7.y).a;
            ea6 a = ca6.a(wr.a, xb4.I, yt22, 48);
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
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            long j2 = j;
            d83.a(x833, (String) null, (ml4) null, j2, yt22, 48, 4);
            k75.a(yt22, x91.M(jl4, 4.0f, 0.0f, 2));
            yt2 yt23 = yt2;
            yf7.b(str, (ml4) null, j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt22.k(ch4.b)).b.h, yt23, 0, 0, 131066);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i, 23, a54);
        }
    }

    public static final void z(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(556660181);
        if (yt22.i(sr22)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            su0.a(sr22, su0.J(1621162525, new ce4(25, sr22), yt22), (ml4) null, (gs2) null, ar7.W, ar7.X, ar7.Y, (pq6) null, 0, 0, 0, 0, (wu1) null, yt2, (i3 & 14) | 1794096, 16268);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ce4(i, 26, sr22);
        }
    }

    public abstract View g0(int i);

    public abstract boolean h0();
}
