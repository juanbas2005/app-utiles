package defpackage;

/* renamed from: uv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uv4 implements gs2 {
    public final /* synthetic */ sr2 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ sr2 C;
    public final /* synthetic */ sr2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int w;
    public final /* synthetic */ bw4 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sr2 z;

    public /* synthetic */ uv4(bw4 bw4, boolean z2, sr2 sr2, sr2 sr22, boolean z3, sr2 sr23, sr2 sr24, int i, int i2) {
        this.w = i2;
        this.x = bw4;
        this.y = z2;
        this.z = sr2;
        this.A = sr22;
        this.B = z3;
        this.C = sr23;
        this.D = sr24;
        this.E = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.E;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                bw4 bw4 = this.x;
                boolean z2 = this.y;
                sr2 sr2 = this.z;
                sr2 sr22 = this.A;
                boolean z3 = this.B;
                sr2 sr23 = this.C;
                sr2 sr24 = sr22;
                boolean z4 = z3;
                sr2 sr25 = sr23;
                pd8.d(bw4, z2, sr2, sr24, z4, sr25, this.D, (yt2) obj, v);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                pd8.d(this.x, this.y, this.z, this.A, this.B, this.C, this.D, (yt2) obj, v2);
                return vs7;
        }
    }
}
