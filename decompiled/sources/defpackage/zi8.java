package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import cu.lestebang.utiletecsa.R;

/* renamed from: zi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zi8 implements gs2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ zi8(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i;
        String str;
        int i2 = this.w;
        boolean z2 = true;
        vs7 vs7 = vs7.a;
        Object obj3 = this.x;
        switch (i2) {
            case b85.b:
                int intValue = ((Integer) obj2).intValue();
                uj8 uj8 = (uj8) obj3;
                yt2 yt2 = (yt2) obj;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    sd2 sd2 = yu6.c;
                    ea6 a = ca6.a(wr.a, xb4.H, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, sd2);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt2, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt2, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt2, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt2, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt2, E);
                    float f = 0.4f;
                    if (((double) 0.4f) <= 0.0d) {
                        wb3.a("invalid weight; must be greater than zero");
                    }
                    if (0.4f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    lz3 lz3 = new lz3(f, true);
                    g80 g80 = xb4.K;
                    sr srVar = wr.c;
                    au0 a2 = zt0.a(srVar, g80, yt2, 0);
                    int hashCode2 = Long.hashCode(yt2.T);
                    vf5 m2 = yt2.m();
                    ml4 E2 = gw8.E(yt2, lz3);
                    yt2.i0();
                    vs7 vs72 = vs7;
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a2);
                    g75.Q(ckVar2, yt2, m2);
                    f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
                    g75.Q(ckVar4, yt2, E2);
                    uj8.c.a(0, yt2);
                    yt2.r(true);
                    float f2 = 0.6f;
                    if (((double) 0.6f) <= 0.0d) {
                        wb3.a("invalid weight; must be greater than zero");
                    }
                    if (0.6f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    lz3 lz32 = new lz3(f2, true);
                    au0 a3 = zt0.a(srVar, g80, yt2, 0);
                    int hashCode3 = Long.hashCode(yt2.T);
                    vf5 m3 = yt2.m();
                    ml4 E3 = gw8.E(yt2, lz32);
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a3);
                    g75.Q(ckVar2, yt2, m3);
                    f21.s(hashCode3, yt2, ckVar3, yt2, ceVar);
                    g75.Q(ckVar4, yt2, E3);
                    uj8.d.a(0, yt2);
                    yt2.r(true);
                    yt2.r(true);
                    return vs72;
                }
                vs7 vs73 = vs7;
                yt2.Y();
                return vs73;
            case 1:
                int i3 = ((bk2) obj).a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Integer b = fk2.b(i3);
                if (b != null) {
                    int intValue2 = b.intValue();
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = gn.a.a(intValue2, booleanValue);
                    } else {
                        i = SoundEffectConstants.getContantForFocusDirection(intValue2);
                    }
                    ((je) obj3).playSoundEffect(i);
                }
                return vs7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                int i4 = intValue3 & 1;
                if ((intValue3 & 3) == 2) {
                    z2 = false;
                }
                yt2 yt22 = (yt2) obj;
                if (yt22.V(i4, z2)) {
                    jb9 jb9 = (jb9) obj3;
                    if (jb9 == null || (str = jb9.w) == null) {
                        str = "";
                    }
                    yf7.b(str, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262142);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                int i5 = intValue4 & 1;
                if ((intValue4 & 3) == 2) {
                    z2 = false;
                }
                yt2 yt23 = (yt2) obj;
                if (yt23.V(i5, z2)) {
                    String str2 = (String) obj3;
                    if (str2 == null) {
                        str2 = hl6.l(yt23, -1410886352, R.string.oss_license_title, yt23, false);
                    } else {
                        yt23.e0(-1410886631);
                        yt23.r(false);
                    }
                    yf7.b(str2, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 0, 0, 262142);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
