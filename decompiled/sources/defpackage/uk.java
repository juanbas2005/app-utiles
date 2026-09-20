package defpackage;

/* renamed from: uk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uk extends wx3 implements gs2 {
    public final /* synthetic */ n52 A;
    public final /* synthetic */ x82 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ fw0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ml4 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk(boolean z2, ml4 ml4, n52 n52, x82 x82, String str, fw0 fw0, int i, int i2, int i3) {
        super(2);
        this.x = i3;
        this.y = z2;
        this.z = ml4;
        this.A = n52;
        this.B = x82;
        this.C = str;
        this.D = fw0;
        this.E = i;
        this.F = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        int i2 = this.E;
        switch (i) {
            case b85.b:
                ((Number) obj2).intValue();
                int v = b85.v(i2 | 1);
                int i3 = this.F;
                boolean z2 = this.y;
                ml4 ml4 = this.z;
                n52 n52 = this.A;
                x82 x82 = this.B;
                String str = this.C;
                x82 x822 = x82;
                String str2 = str;
                ie1.c(z2, ml4, n52, x822, str2, this.D, (yt2) obj, v, i3);
                return vs7;
            default:
                ((Number) obj2).intValue();
                int v2 = b85.v(i2 | 1);
                int i4 = this.F;
                ie1.d(this.y, this.z, this.A, this.B, this.C, this.D, (yt2) obj, v2, i4);
                return vs7;
        }
    }
}
