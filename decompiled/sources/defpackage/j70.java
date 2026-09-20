package defpackage;

/* renamed from: j70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j70 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ uk5 D;
    public final /* synthetic */ ek7 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j70(uk5 uk5, ek7 ek7, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = uk5;
        this.E = ek7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((j70) o(f61, o81)).s(vs7);
            default:
                return ((j70) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                j70 j70 = new j70(this.D, this.E, f61, 0);
                j70.C = obj;
                return j70;
            default:
                j70 j702 = new j70(this.D, this.E, f61, 1);
                j702.C = obj;
                return j702;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        ek7 ek7 = this.E;
        uk5 uk5 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    i70 i70 = new i70((o81) this.C, ek7, (f61) null);
                    this.B = 1;
                    if (fd1.s(uk5, i70, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    l70 l70 = new l70((o81) this.C, ek7, (f61) null);
                    this.B = 1;
                    if (((h97) uk5).V0(l70, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
