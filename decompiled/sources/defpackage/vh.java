package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* renamed from: vh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vh {
    public static final yy0 a = new yy0((sr2) xe.F);
    public static final yy0 b = new yy0((sr2) xe.E);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    public static final void a(sl5 sl5, sr2 sr2, tl5 tl5, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        sr2 sr22;
        tl5 tl52;
        boolean z;
        sr2 sr23;
        yx5 v;
        sr2 sr24;
        boolean z2;
        int i4;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ey3 ey3;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sl5 sl52 = sl5;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(-1772091631);
        if ((i10 & 6) == 0) {
            if (yt22.g(sl52)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i10 & 48) == 0) {
            sr22 = sr2;
            if (yt22.i(sr22)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
            if ((i10 & 384) != 0) {
                tl52 = tl5;
                if (yt22.g(tl52)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
            } else {
                tl52 = tl5;
            }
            fw0 fw02 = fw0;
            if ((i10 & 3072) == 0) {
                if (yt22.i(fw02)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i3 & 1, z)) {
                if (i11 != 0) {
                    sr24 = null;
                } else {
                    sr24 = sr22;
                }
                View view = (View) yt22.k(ye.f);
                tp1 tp1 = (tp1) yt22.k(xy0.h);
                String str2 = (String) yt22.k(a);
                ey3 ey32 = (ey3) yt22.k(xy0.n);
                wt2 E = kl8.E(yt22);
                aq4 v2 = u55.v(fw0, yt2);
                Object[] objArr = new Object[0];
                Object Q = yt22.Q();
                d63 d63 = ay0.a;
                if (Q == d63) {
                    Q = xe.G;
                    yt22.o0(Q);
                }
                UUID uuid = (UUID) u55.s(objArr, (sr2) Q, yt22, 48);
                boolean booleanValue = ((Boolean) yt22.k(b)).booleanValue();
                Object Q2 = yt22.Q();
                if (Q2 == d63) {
                    tl5 tl53 = tl52;
                    View view2 = view;
                    tl5 tl54 = tl53;
                    tp1 tp12 = tp1;
                    wt2 wt2 = E;
                    str = str2;
                    i4 = i3;
                    z2 = true;
                    sl5 sl53 = sl52;
                    pl5 pl5 = new pl5(sr24, tl54, str, view2, tp12, sl53, uuid, booleanValue);
                    sl52 = sl53;
                    pl5.o(wt2, new fw0(-297523940, new uh(pl5, v2, 1), true));
                    yt22.o0(pl5);
                    Q2 = pl5;
                } else {
                    i4 = i3;
                    str = str2;
                    z2 = true;
                }
                pl5 pl52 = (pl5) Q2;
                boolean i12 = yt22.i(pl52);
                int i13 = i4 & 112;
                if (i13 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z8 = i12 | z3;
                int i14 = i4 & 896;
                if (i14 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                boolean g = z8 | z4 | yt22.g(str) | yt22.e(ey32.ordinal());
                Object Q3 = yt22.Q();
                if (g || Q3 == d63) {
                    oh ohVar = new oh(pl52, sr24, tl5, str, ey32);
                    yt22.o0(ohVar);
                    Q3 = ohVar;
                }
                t49.e(pl52, (vr2) Q3, yt22);
                boolean i15 = yt22.i(pl52);
                if (i13 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z9 = i15 | z5;
                if (i14 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                boolean g2 = z9 | z6 | yt22.g(str) | yt22.e(ey32.ordinal());
                Object Q4 = yt22.Q();
                if (g2 || Q4 == d63) {
                    ph phVar = new ph(pl52, sr24, tl5, str, ey32);
                    ey3 = ey32;
                    yt22.o0(phVar);
                    Q4 = phVar;
                } else {
                    ey3 = ey32;
                }
                t49.l((sr2) Q4, yt22);
                boolean i16 = yt22.i(pl52);
                if ((i4 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                boolean z10 = i16 | z7;
                Object Q5 = yt22.Q();
                if (z10 || Q5 == d63) {
                    Q5 = new lh(2, pl52, sl52);
                    yt22.o0(Q5);
                }
                t49.e(sl52, (vr2) Q5, yt22);
                boolean i17 = yt22.i(pl52);
                Object Q6 = yt22.Q();
                if (i17 || Q6 == d63) {
                    Q6 = new n0(pl52, (f61) null, 6);
                    yt22.o0(Q6);
                }
                t49.h((gs2) Q6, yt22, pl52);
                boolean i18 = yt22.i(pl52);
                Object Q7 = yt22.Q();
                if (i18 || Q7 == d63) {
                    i5 = 0;
                    Q7 = new rh(pl52, 0);
                    yt22.o0(Q7);
                } else {
                    i5 = 0;
                }
                ml4 I = h49.I(jl4.w, (vr2) Q7);
                boolean i19 = yt22.i(pl52) | yt22.e(ey3.ordinal());
                Object Q8 = yt22.Q();
                if (i19 || Q8 == d63) {
                    Q8 = new sh(i5, pl52, ey3);
                    yt22.o0(Q8);
                }
                lh4 lh4 = (lh4) Q8;
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E2 = gw8.E(yt22, I);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, lh4);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E2);
                yt22.r(z2);
                sr23 = sr24;
            } else {
                yt22.Y();
                sr23 = sr22;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new th(sl52, sr23, tl5, fw0, i10, i2);
                return;
            }
            return;
        }
        sr22 = sr2;
        if ((i10 & 384) != 0) {
        }
        fw0 fw022 = fw0;
        if ((i10 & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (!yt22.V(i3 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
