package defpackage;

/* renamed from: s77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s77 {
    public final j77 a;
    public final h81 b;

    public s77(j77 j77, h81 h81) {
        j77.getClass();
        this.a = j77;
        this.b = h81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object a(String str, h61 h61) {
        r77 r77;
        int i;
        if (h61 instanceof r77) {
            r77 = (r77) h61;
            int i2 = r77.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r77.B = i2 - Integer.MIN_VALUE;
                Object obj = r77.z;
                i = r77.B;
                if (i != 0) {
                    o85.q(obj);
                    k05 k05 = new k05(this, str, (f61) null, 25);
                    r77.B = 1;
                    obj = ar7.e0(this.b, k05, r77);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        r77 = new r77(this, h61);
        Object obj2 = r77.z;
        i = r77.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }
}
