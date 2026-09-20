package defpackage;

/* renamed from: wo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wo2 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ se4 x;

    public /* synthetic */ wo2(se4 se4, int i) {
        this.w = i;
        this.x = se4;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        se4 se4 = this.x;
        switch (i) {
            case b85.b:
                se4.d0(b85.a());
                return vs7;
            case 1:
                se4.d0(b85.a());
                return vs7;
            case 2:
                se4.d0(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"});
                return vs7;
            default:
                se4.d0(new String[]{"*/*"});
                return vs7;
        }
    }
}
