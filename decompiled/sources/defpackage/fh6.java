package defpackage;

/* renamed from: fh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fh6 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gh6 x;

    public /* synthetic */ fh6(gh6 gh6, int i) {
        this.w = i;
        this.x = gh6;
    }

    public final Object b() {
        int i = this.w;
        boolean z = false;
        gh6 gh6 = this.x;
        switch (i) {
            case b85.b:
                if (gh6.a.d() < gh6.f.d()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (gh6.a.d() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
