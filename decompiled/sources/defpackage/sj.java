package defpackage;

/* renamed from: sj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sj extends a97 implements vr2 {
    public final /* synthetic */ uj A;
    public final /* synthetic */ Object B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj(uj ujVar, Object obj, f61 f61) {
        super(1, f61);
        this.A = ujVar;
        this.B = obj;
    }

    public final f61 l(f61 f61) {
        return new sj(this.A, this.B, f61);
    }

    public final Object s(Object obj) {
        o85.q(obj);
        uj ujVar = this.A;
        uj.b(ujVar);
        Object a = uj.a(ujVar, this.B);
        ujVar.c.x.setValue(a);
        ujVar.e.setValue(a);
        return vs7.a;
    }

    public final Object y(Object obj) {
        vs7 vs7 = vs7.a;
        ((sj) l((f61) obj)).s(vs7);
        return vs7;
    }
}
