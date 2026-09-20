package defpackage;

/* renamed from: ud5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ud5 extends a97 implements vr2 {
    public final /* synthetic */ vd5 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ vr2 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ud5(vd5 vd5, String str, vr2 vr2, f61 f61) {
        super(1, f61);
        this.A = vd5;
        this.B = str;
        this.C = vr2;
    }

    public final f61 l(f61 f61) {
        return new ud5(this.A, this.B, this.C, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        defpackage.dh4.f(r2, r1);
     */
    public final Object s(Object obj) {
        o85.q(obj);
        ab6 k0 = this.A.b.k0(this.B);
        Object y = this.C.y(k0);
        dh4.f(k0, (Throwable) null);
        return y;
    }

    public final Object y(Object obj) {
        return ((ud5) l((f61) obj)).s(vs7.a);
    }
}
