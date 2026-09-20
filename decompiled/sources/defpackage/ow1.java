package defpackage;

/* renamed from: ow1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ow1 extends wx3 implements sr2 {
    public final /* synthetic */ boolean x;
    public final /* synthetic */ kg5 y;
    public final /* synthetic */ String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow1(boolean z2, kg5 kg5, String str) {
        super(0);
        this.x = z2;
        this.y = kg5;
        this.z = str;
    }

    public final Object b() {
        if (this.x) {
            kg5 kg5 = this.y;
            String str = this.z;
            hf6 hf6 = (hf6) kg5.x;
            synchronized (hf6.c) {
                gf6 gf6 = (gf6) hf6.d.remove(str);
            }
        }
        return vs7.a;
    }
}
