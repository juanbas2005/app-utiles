package defpackage;

/* renamed from: p24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p24 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p24(Object obj, int i, q24 q24, fw0 fw0, int i2) {
        this.z = obj;
        this.x = i;
        this.A = q24;
        this.B = fw0;
        this.y = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(this.y | 1);
                ar7.d(this.z, this.x, (q24) obj4, (fw0) obj3, (yt2) obj, v);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v2 = b85.v(1);
                mp7.D((String) this.z, (String) obj4, this.x, this.y, (mv1) obj3, (yt2) obj, v2);
                return vs7;
        }
    }

    public /* synthetic */ p24(String str, String str2, int i, int i2, mv1 mv1, int i3) {
        this.z = str;
        this.A = str2;
        this.x = i;
        this.y = i2;
        this.B = mv1;
    }
}
