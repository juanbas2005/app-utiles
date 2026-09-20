package defpackage;

/* renamed from: pw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pw4 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ pw4(ik2 ik2, boolean z2, sr2 sr2, sr2 sr22) {
        this.y = ik2;
        this.x = z2;
        this.z = sr2;
        this.A = sr22;
    }

    public final Object b() {
        int i = this.w;
        Object obj = this.A;
        Object obj2 = this.z;
        boolean z2 = this.x;
        Object obj3 = this.y;
        switch (i) {
            case b85.b:
                tg7 tg7 = (tg7) obj3;
                tg7 tg72 = (tg7) obj2;
                a37 a37 = (a37) obj;
                if (!z2 || ((Number) a37.getValue()).floatValue() >= 0.5f) {
                    return tg72;
                }
                return tg7;
            default:
                sr2 sr2 = (sr2) obj2;
                sr2 sr22 = (sr2) obj;
                ik2.a((ik2) obj3);
                if (z2) {
                    sr2.b();
                } else {
                    sr22.b();
                }
                return vs7.a;
        }
    }

    public /* synthetic */ pw4(boolean z2, tg7 tg7, tg7 tg72, a37 a37) {
        this.x = z2;
        this.y = tg7;
        this.z = tg72;
        this.A = a37;
    }
}
