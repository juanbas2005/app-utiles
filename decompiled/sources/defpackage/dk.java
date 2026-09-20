package defpackage;

/* renamed from: dk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dk extends wx3 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eh5[] x;
    public final /* synthetic */ ek y;
    public final /* synthetic */ int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dk(eh5[] eh5Arr, ek ekVar, int i, int i2) {
        super(1);
        this.x = eh5Arr;
        this.y = ekVar;
        this.z = i;
        this.A = i2;
    }

    public final Object y(Object obj) {
        dh5 dh5 = (dh5) obj;
        for (eh5 eh5 : this.x) {
            if (eh5 != null) {
                long a = this.y.a.b.a((((long) eh5.w) << 32) | (((long) eh5.x) & 4294967295L), (((long) this.z) << 32) | (((long) this.A) & 4294967295L), ey3.w);
                dh5.g(eh5, (int) (a >> 32), (int) (a & 4294967295L), 0.0f);
            }
        }
        return vs7.a;
    }
}
