package defpackage;

import java.util.Map;

/* renamed from: pu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pu4 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ ds2 F;
    public final /* synthetic */ ds2 G;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ vr2 z;

    public /* synthetic */ pu4(a54 a54, b54 b54, if7 if7, if7 if72, vr2 vr2, vr2 vr22, vr2 vr23, sr2 sr2, sr2 sr22, int i) {
        this.B = a54;
        this.C = b54;
        this.D = if7;
        this.E = if72;
        this.x = vr2;
        this.y = vr22;
        this.z = vr23;
        this.F = sr2;
        this.G = sr22;
        this.A = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.A;
        ds2 ds2 = this.G;
        ds2 ds22 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                vr2 vr2 = this.x;
                vr2 vr22 = this.y;
                vr2 vr23 = vr2;
                vr2 vr24 = vr22;
                sg3.a((iu4) obj6, (gq3) obj5, (jb) obj4, (Map) obj3, vr23, vr24, this.z, (vr2) ds22, (vr2) ds2, (yt2) obj, v);
                return vs7;
            default:
                ((Integer) obj2).intValue();
                int v2 = b85.v(i2 | 1);
                mp7.w((a54) obj6, (b54) obj5, (if7) obj4, (if7) obj3, this.x, this.y, this.z, (sr2) ds22, (sr2) ds2, (yt2) obj, v2);
                return vs7;
        }
    }

    public /* synthetic */ pu4(iu4 iu4, gq3 gq3, jb jbVar, Map map, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, int i) {
        this.B = iu4;
        this.C = gq3;
        this.D = jbVar;
        this.E = map;
        this.x = vr2;
        this.y = vr22;
        this.z = vr23;
        this.F = vr24;
        this.G = vr25;
        this.A = i;
    }
}
