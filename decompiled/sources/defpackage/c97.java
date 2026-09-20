package defpackage;

/* renamed from: c97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c97 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kg5 B;
    public final /* synthetic */ String C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c97(kg5 kg5, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = kg5;
        this.C = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((c97) o(f61, o81)).s(vs7);
            default:
                ((c97) o(f61, o81)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        String str = this.C;
        kg5 kg5 = this.B;
        switch (i) {
            case b85.b:
                return new c97(kg5, str, f61, 0);
            default:
                return new c97(kg5, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = this.C;
        kg5 kg5 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                return ((ay4) kg5.x).g(str);
            default:
                o85.q(obj);
                ((ay4) kg5.x).u(str);
                return vs7.a;
        }
    }
}
