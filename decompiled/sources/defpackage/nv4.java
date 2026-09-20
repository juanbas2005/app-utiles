package defpackage;

/* renamed from: nv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nv4 implements gs2 {
    public final /* synthetic */ ds2 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public /* synthetic */ nv4(x83 x83, long j, long j2, String str, String str2, sr2 sr2, int i) {
        this.x = x83;
        this.y = j;
        this.z = j2;
        this.C = str;
        this.D = str2;
        this.A = sr2;
        this.B = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.B;
        ds2 ds2 = this.A;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                pv4.e((ml4) obj5, (pq6) obj4, this.y, this.z, (aa8) obj3, (fw0) ds2, (yt2) obj, v);
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                long j = this.y;
                long j2 = j;
                za5.c((ml4) obj5, j2, this.z, (fw0) ds2, (gs2) obj4, (fw0) obj3, (yt2) obj, v2);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v3 = b85.v(i2 | 1);
                b88.a((x83) obj5, this.y, this.z, (String) obj4, (String) obj3, (sr2) ds2, (yt2) obj, v3);
                return vs7;
        }
    }

    public /* synthetic */ nv4(ml4 ml4, long j, long j2, fw0 fw0, gs2 gs2, fw0 fw02, int i) {
        this.x = ml4;
        this.y = j;
        this.z = j2;
        this.A = fw0;
        this.C = gs2;
        this.D = fw02;
        this.B = i;
    }

    public /* synthetic */ nv4(ml4 ml4, pq6 pq6, long j, long j2, aa8 aa8, fw0 fw0, int i) {
        this.x = ml4;
        this.C = pq6;
        this.y = j;
        this.z = j2;
        this.D = aa8;
        this.A = fw0;
        this.B = i;
    }
}
