package defpackage;

import java.util.List;

/* renamed from: dw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dw0 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dw0(int i, gs2 gs2, fw0 fw0, gs2 gs22, gs2 gs23, aa8 aa8, gs2 gs24, int i2) {
        this.w = 8;
        this.x = i;
        this.z = gs2;
        this.y = fw0;
        this.A = gs22;
        this.B = gs23;
        this.C = aa8;
        this.D = gs24;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        int i2 = this.x;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        vs7 vs7 = vs7.a;
        Object obj7 = this.D;
        Object obj8 = this.y;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2) | 1;
                Object obj9 = this.z;
                Object obj10 = this.A;
                ((fw0) obj8).f(obj9, (Boolean) obj7, obj10, this.B, this.C, (yt2) obj, v);
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                r16.o((en2) obj8, (List) obj6, (am5) obj5, (sr2) obj4, (vr2) obj3, (sr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 2:
                ((Integer) obj2).intValue();
                t13.c((o03) obj8, (vr2) obj6, (vr2) obj5, (sr2) obj4, (vr2) obj3, (sr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                hv4.c((fw0) obj8, (fw0) obj6, (fw0) obj5, (gs2) obj4, (sr2) obj3, (sr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                fx4.b((String) obj6, (ml4) obj5, (xw4) obj4, (vr) obj3, (gs2) obj7, (fw0) obj8, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                fx4.f((fw0) obj8, (String) obj6, (ix4) obj5, (gs2) obj4, (ib) obj3, (fw0) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 6:
                ((Integer) obj2).getClass();
                fd1.l((fc5) obj8, (ru4) obj6, (vr2) obj5, (vr2) obj4, (sr2) obj3, (vr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 7:
                gs2 gs2 = (gs2) obj6;
                fw0 fw0 = (fw0) obj8;
                gs2 gs22 = (gs2) obj5;
                gs2 gs23 = (gs2) obj4;
                gq4 gq4 = (gq4) obj3;
                gs2 gs24 = (gs2) obj7;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    aa5.d(this.x, gs2, fw0, gs22, gs23, gq4, gs24, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 8:
                ((Integer) obj2).getClass();
                aa5.d(this.x, (gs2) obj6, (fw0) obj8, (gs2) obj5, (gs2) obj4, (aa8) obj3, (gs2) obj7, (yt2) obj, b85.v(1));
                return vs7;
            case 9:
                ((Integer) obj2).intValue();
                q17.c((e17) obj8, (vr2) obj6, (vr2) obj5, (gs2) obj4, (vr2) obj3, (vr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 10:
                ((Integer) obj2).getClass();
                tf4.e((String) obj6, (vr2) obj5, (fw0) obj8, (fw0) obj4, (ml4) obj3, (String) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            default:
                ((Integer) obj2).getClass();
                b88.d((w78) obj8, (ru4) obj6, (sr2) obj5, (sr2) obj4, (sr2) obj3, (sr2) obj7, (yt2) obj, b85.v(i2 | 1));
                return vs7;
        }
    }

    public /* synthetic */ dw0(int i, gs2 gs2, fw0 fw0, gs2 gs22, gs2 gs23, gq4 gq4, gs2 gs24) {
        this.w = 7;
        this.x = i;
        this.z = gs2;
        this.y = fw0;
        this.A = gs22;
        this.B = gs23;
        this.C = gq4;
        this.D = gs24;
    }

    public /* synthetic */ dw0(fw0 fw0, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.w = 0;
        this.y = fw0;
        this.z = obj;
        this.D = bool;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.x = i;
    }

    public /* synthetic */ dw0(Object obj, Object obj2, Object obj3, ds2 ds2, Object obj4, ds2 ds22, int i, int i2) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = ds2;
        this.C = obj4;
        this.D = ds22;
        this.x = i;
    }

    public /* synthetic */ dw0(String str, vr2 vr2, fw0 fw0, fw0 fw02, ml4 ml4, String str2, int i) {
        this.w = 10;
        this.z = str;
        this.A = vr2;
        this.y = fw0;
        this.B = fw02;
        this.C = ml4;
        this.D = str2;
        this.x = i;
    }

    public /* synthetic */ dw0(String str, ml4 ml4, xw4 xw4, vr vrVar, gs2 gs2, fw0 fw0, int i) {
        this.w = 4;
        this.z = str;
        this.A = ml4;
        this.B = xw4;
        this.C = vrVar;
        this.D = gs2;
        this.y = fw0;
        this.x = i;
    }
}
