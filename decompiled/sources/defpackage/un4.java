package defpackage;

/* renamed from: un4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class un4 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn4 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un4(xn4 xn4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = xn4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((un4) o(f61, o81)).s(vs7);
            default:
                return ((un4) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        xn4 xn4 = this.B;
        switch (i) {
            case b85.b:
                return new un4(xn4, f61, 0);
            default:
                return new un4(xn4, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        xn4 xn4 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                jr6 jr6 = (jr6) ((kr6) xn4.i.getValue());
                return new Integer(jr6.b.nativeGetCounterValue(jr6.c));
            default:
                o85.q(obj);
                jr6 jr62 = (jr6) ((kr6) xn4.i.getValue());
                return new Integer(jr62.b.nativeIncrementAndGetCounterValue(jr62.c));
        }
    }
}
