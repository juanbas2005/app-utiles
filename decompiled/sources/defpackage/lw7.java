package defpackage;

/* renamed from: lw7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lw7 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ dy7 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lw7(dy7 dy7, int i, int i2, int i3, String str, String str2, f61 f61) {
        super(2, f61);
        this.B = dy7;
        this.C = i;
        this.D = i2;
        this.E = i3;
        this.F = str;
        this.G = str2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((lw7) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new lw7(this.B, this.C, this.D, this.E, this.F, this.G, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            qe1 qe1 = this.B.a;
            kw7 kw7 = new kw7(this.C, this.D, this.E, this.F, this.G, (f61) null);
            this.A = 1;
            Object a = qe1.a(kw7, this);
            p81 p81 = p81.w;
            if (a == p81) {
                return p81;
            }
            return a;
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
