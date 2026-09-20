package defpackage;

/* renamed from: fa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fa extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ yg5 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ hs2 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa(hs2 hs2, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.E = hs2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r11 == r4) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r11 == r4) goto L_0x008e;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        hs2 hs2 = this.E;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                yg5 yg5 = this.C;
                Object obj2 = this.D;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    if (obj2 instanceof j85) {
                        Object obj3 = yg5.w;
                        this.C = yg5;
                        this.D = null;
                        this.B = 1;
                        obj = hs2.u(obj3, obj2, this);
                        break;
                    } else {
                        return vs7;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j85 j85 = (j85) obj;
                if (j85 == null) {
                    return vs7;
                }
                this.C = null;
                this.D = null;
                this.B = 2;
                if (yg5.d(this, j85) != p81) {
                    return vs7;
                }
                return p81;
            default:
                yg5 yg52 = this.C;
                Object obj4 = this.D;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    Object obj5 = yg52.w;
                    this.C = yg52;
                    this.D = null;
                    this.B = 1;
                    obj = hs2.u(obj5, obj4, this);
                    break;
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j85 j852 = (j85) obj;
                if (j852 == null) {
                    return vs7;
                }
                this.C = null;
                this.D = null;
                this.B = 2;
                if (yg52.d(this, j852) != p81) {
                    return vs7;
                }
                return p81;
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        hs2 hs2 = this.E;
        yg5 yg5 = (yg5) obj;
        f61 f61 = (f61) obj3;
        switch (i) {
            case b85.b:
                fa faVar = new fa(hs2, f61, 0);
                faVar.C = yg5;
                faVar.D = obj2;
                return faVar.s(vs7);
            default:
                fa faVar2 = new fa(hs2, f61, 1);
                faVar2.C = yg5;
                faVar2.D = obj2;
                return faVar2.s(vs7);
        }
    }
}
