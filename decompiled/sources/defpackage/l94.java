package defpackage;

import java.util.List;

/* renamed from: l94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l94 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w;
    public final /* synthetic */ ml4 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public /* synthetic */ l94(ml4 ml4, long j, long j2, Object obj, Object obj2, int i, int i2) {
        this.w = i2;
        this.x = ml4;
        this.y = j;
        this.z = j2;
        this.B = obj;
        this.C = obj2;
        this.A = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.A;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (i) {
            case b85.b:
                ((Integer) obj2).intValue();
                int v = b85.v(i2 | 1);
                rj1.h(this.x, this.y, this.z, (pq6) obj4, (List) obj3, (yt2) obj, v);
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                ml4 ml4 = this.x;
                long j = this.y;
                long j2 = j;
                hv4.a(ml4, j2, this.z, (aa8) obj4, (fw0) obj3, (yt2) obj, v2);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v3 = b85.v(i2 | 1);
                ms6.a(this.x, this.y, this.z, (aa8) obj4, (gs2) obj3, (yt2) obj, v3);
                return vs7;
        }
    }
}
