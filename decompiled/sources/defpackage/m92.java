package defpackage;

/* renamed from: m92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m92 implements sr2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m92(vr2 vr2, aq4 aq4, boolean z2) {
        this.y = aq4;
        this.z = vr2;
        this.x = z2;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.z;
        Object obj2 = this.y;
        boolean z2 = this.x;
        switch (i) {
            case b85.b:
                ((aq4) obj2).setValue(new Object());
                ((vr2) obj).y(Boolean.valueOf(!z2));
                return vs7;
            case 1:
                sr2 sr2 = (sr2) obj;
                aq4 aq4 = (aq4) obj2;
                if (z2) {
                    aq4.setValue(Boolean.valueOf(!((Boolean) aq4.getValue()).booleanValue()));
                } else {
                    aq4.setValue(Boolean.FALSE);
                    sr2.b();
                }
                return vs7;
            default:
                xz1 xz1 = (xz1) obj2;
                o81 o81 = (o81) obj;
                if (z2 && ((Boolean) xz1.a.y(yz1.w)).booleanValue()) {
                    ar7.H(o81, (e81) null, (r81) null, new mk3(xz1, (f61) null, 6), 3);
                }
                return vs7;
        }
    }

    public /* synthetic */ m92(boolean z2, xz1 xz1, o81 o81) {
        this.x = z2;
        this.y = xz1;
        this.z = o81;
    }

    public /* synthetic */ m92(boolean z2, sr2 sr2, aq4 aq4) {
        this.x = z2;
        this.z = sr2;
        this.y = aq4;
    }
}
