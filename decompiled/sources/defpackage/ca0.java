package defpackage;

/* renamed from: ca0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ca0 extends a97 implements hs2 {
    public final /* synthetic */ int A = 0;
    public /* synthetic */ Object B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ca0(d06 d06, f61 f61) {
        super(3, f61);
        this.B = d06;
    }

    public final Object s(Object obj) {
        switch (this.A) {
            case b85.b:
                o85.q(obj);
                if (((y53) this.B).f.d(ea0.a) == null) {
                    return null;
                }
                ku4.a();
                return null;
            default:
                o85.q(obj);
                ((d06) this.B).w = true;
                return vs7.a;
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                j85 j85 = (j85) obj2;
                ca0 ca0 = new ca0(3, (f61) obj3);
                ca0.B = (y53) obj;
                ca0.s(vs7);
                return null;
            default:
                fi2 fi2 = (fi2) obj;
                Throwable th = (Throwable) obj2;
                new ca0((d06) this.B, (f61) obj3).s(vs7);
                return vs7;
        }
    }

    public /* synthetic */ ca0(int i, f61 f61) {
        super(i, f61);
    }
}
