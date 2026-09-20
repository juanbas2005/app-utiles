package defpackage;

/* renamed from: dj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dj4 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dj4(d06 d06, d06 d062, ht4 ht4, boolean z2, as asVar) {
        this.y = d06;
        this.z = d062;
        this.A = ht4;
        this.x = z2;
        this.B = asVar;
    }

    public final Object y(Object obj) {
        float f;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.B;
        boolean z2 = this.x;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (i) {
            case b85.b:
                ed5 ed5 = ((dq4) obj5).y;
                sr2 sr2 = (sr2) obj4;
                a37 a37 = (a37) obj3;
                a37 a372 = (a37) obj2;
                l76 l76 = (l76) obj;
                float f2 = 0.8f;
                float f3 = 1.0f;
                if (!z2) {
                    f = ((Number) a37.getValue()).floatValue();
                } else if (((Boolean) ed5.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                l76.l(f);
                if (!z2) {
                    f2 = ((Number) a37.getValue()).floatValue();
                } else if (((Boolean) ed5.getValue()).booleanValue()) {
                    f2 = 1.0f;
                }
                l76.m(f2);
                if (!z2) {
                    f3 = ((Number) a372.getValue()).floatValue();
                } else if (!((Boolean) ed5.getValue()).booleanValue()) {
                    f3 = 0.0f;
                }
                l76.c(f3);
                l76.w(((ql7) sr2.b()).a);
                return vs7;
            default:
                zs4 zs4 = (zs4) obj;
                zs4.getClass();
                ((d06) obj5).w = true;
                ((d06) obj4).w = true;
                ((ht4) obj3).n(zs4, z2, (as) obj2);
                return vs7;
        }
    }

    public /* synthetic */ dj4(boolean z2, dq4 dq4, sr2 sr2, im7 im7, im7 im72) {
        this.x = z2;
        this.y = dq4;
        this.z = sr2;
        this.A = im7;
        this.B = im72;
    }
}
