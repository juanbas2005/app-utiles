package defpackage;

/* renamed from: ax4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ax4 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ yw4 x;

    public /* synthetic */ ax4(yw4 yw4, int i) {
        this.w = i;
        this.x = yw4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        yt2 yt2;
        int i = this.w;
        vs7 vs7 = null;
        vs7 vs72 = vs7.a;
        yw4 yw4 = this.x;
        switch (i) {
            case b85.b /*0*/:
                yt2 yt22 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(1 & intValue, z)) {
                    fx4.a(yw4.c, (gs2) null, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs72;
            case 1:
                yt2 yt23 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(1 & intValue2, z2)) {
                    fx4.a(yw4.c, (gs2) null, yt23, 0);
                } else {
                    yt23.Y();
                }
                return vs72;
            default:
                yt2 yt24 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt24.V(1 & intValue3, z3)) {
                    gs2 gs2 = yw4.e;
                    if (gs2 == null) {
                        yt24.e0(371850134);
                        yt24.r(false);
                    } else {
                        yt24.e0(1536015819);
                        gs2.H(yt24, 0);
                        yt24.r(false);
                        vs7 = vs72;
                    }
                    if (vs7 == null) {
                        yt24.e0(1536016203);
                        yt2 yt25 = yt24;
                        yf7.b("", (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 6, 0, 262142);
                        yt2 = yt25;
                    } else {
                        yt2 = yt24;
                        yt2.e0(1536015521);
                    }
                    yt2.r(false);
                } else {
                    yt24.Y();
                }
                return vs72;
        }
    }
}
