package defpackage;

/* renamed from: c83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c83 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ ml4 y;
    public final /* synthetic */ long z;

    public /* synthetic */ c83(Object obj, String str, ml4 ml4, long j, int i, int i2, int i3) {
        this.w = i3;
        this.C = obj;
        this.x = str;
        this.y = ml4;
        this.z = j;
        this.A = i;
        this.B = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.A;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                d83.a((x83) obj3, this.x, this.y, this.z, (yt2) obj, v, this.B);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                d83.b((vb5) obj3, this.x, this.y, this.z, (yt2) obj, v2, this.B);
                return vs7;
        }
    }
}
