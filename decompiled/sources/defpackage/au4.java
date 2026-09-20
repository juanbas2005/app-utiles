package defpackage;

/* renamed from: au4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class au4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ mm7 x;

    public /* synthetic */ au4(mm7 mm7, int i) {
        this.w = i;
        this.x = mm7;
    }

    public final Object b() {
        int i = this.w;
        boolean z = true;
        mm7 mm7 = this.x;
        switch (i) {
            case b85.b /*0*/:
                if (mm7.h.d() == Long.MIN_VALUE) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (sg3.e(mm7.d.getValue(), mm7.a.H0()) && mm7.h.d() == Long.MIN_VALUE && !((Boolean) mm7.i.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(mm7.b());
        }
    }
}
