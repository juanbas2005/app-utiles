package defpackage;

/* renamed from: d31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d31 implements di2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ qi2 x;

    public /* synthetic */ d31(qi2 qi2, int i) {
        this.w = i;
        this.x = qi2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    public final Object a(fi2 fi2, f61 f61) {
        wd4 wd4;
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        qi2 qi2 = this.x;
        p81 p81 = p81.w;
        switch (i2) {
            case b85.b:
                Object a = qi2.a(new b6(fi2, 5), f61);
                if (a == p81) {
                    return a;
                }
                return vs7;
            default:
                if (f61 instanceof wd4) {
                    wd4 = (wd4) f61;
                    int i3 = wd4.A;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wd4.A = i3 - Integer.MIN_VALUE;
                        Object obj = wd4.z;
                        i = wd4.A;
                        if (i != 0) {
                            o85.q(obj);
                            b6 b6Var = new b6(fi2, 10);
                            wd4.A = 1;
                            if (qi2.a(b6Var, wd4) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i == 1) {
                            o85.q(obj);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                wd4 = new wd4(this, f61);
                Object obj2 = wd4.z;
                i = wd4.A;
                if (i != 0) {
                }
        }
    }
}
