package defpackage;

/* renamed from: gv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gv4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ tp1 x;
    public final /* synthetic */ bd5 y;

    public /* synthetic */ gv4(tp1 tp1, bd5 bd5, int i) {
        this.w = i;
        this.x = tp1;
        this.y = bd5;
    }

    public final Object b() {
        int i = this.w;
        bd5 bd5 = this.y;
        tp1 tp1 = this.x;
        switch (i) {
            case b85.b:
                return new l35((((long) Float.floatToRawIntBits(((float) (bd5.d() - tp1.r0(56.0f))) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(tp1.e0(hv4.f)))));
            case 1:
                return new l35((((long) Float.floatToRawIntBits(((float) (bd5.d() - tp1.r0(56.0f))) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(tp1.e0(12.0f)))));
            default:
                return new l35((((long) Float.floatToRawIntBits(((float) (bd5.d() - tp1.r0(56.0f))) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(tp1.e0(12.0f)))));
        }
    }
}
