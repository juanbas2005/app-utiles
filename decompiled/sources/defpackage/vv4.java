package defpackage;

import java.util.List;

/* renamed from: vv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vv4 implements sr2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ sr2 B;
    public final /* synthetic */ sr2 C;
    public final /* synthetic */ bw4 D;
    public final /* synthetic */ fx0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ sr2 z;

    public /* synthetic */ vv4(fx0 fx0, boolean z2, sr2 sr2, sr2 sr22, boolean z3, sr2 sr23, sr2 sr24, bw4 bw4) {
        this.w = fx0;
        this.x = z2;
        this.y = sr2;
        this.z = sr22;
        this.A = z3;
        this.B = sr23;
        this.C = sr24;
        this.D = bw4;
    }

    public final Object b() {
        aw4 aw4;
        aw4 aw42;
        fx0 fx0 = this.w;
        boolean z2 = fx0.f;
        boolean z3 = this.x;
        if (z2 != z3) {
            fx0.f = z3;
            rv4 rv4 = fx0.g;
            if (!(rv4 == null || (aw42 = rv4.d) == null)) {
                aw42.b();
            }
        }
        fx0.i = this.y;
        fx0.i(this.A);
        fx0.j = this.B;
        fx0.k = this.C;
        bw4 bw4 = this.D;
        yv4 yv4 = (yv4) bw4.c.getValue();
        List list = (List) bw4.b.getValue();
        List list2 = (List) bw4.d.getValue();
        yv4.getClass();
        list.getClass();
        list2.getClass();
        fx0.a = yv4;
        fx0.b = list;
        fx0.c = list2;
        rv4 rv42 = fx0.g;
        if (!(rv42 == null || (aw4 = rv42.d) == null)) {
            aw4.d(fx0);
        }
        return vs7.a;
    }
}
