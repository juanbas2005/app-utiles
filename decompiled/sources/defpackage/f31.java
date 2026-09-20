package defpackage;

/* renamed from: f31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f31 {
    public static final String a = bc4.p("ConstraintTrkngWrkr");

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object a(zy2 zy2, be8 be8, h61 h61) {
        e31 e31;
        int i;
        if (h61 instanceof e31) {
            e31 e312 = (e31) h61;
            int i2 = e312.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e312.A = i2 - Integer.MIN_VALUE;
                e31 = e312;
                Object obj = e31.z;
                i = e31.A;
                if (i != 0) {
                    o85.q(obj);
                    d31 d31 = new d31(new qi2(zy2.c(be8), new f70(be8, (f61) null, 1), 2), 0);
                    e31.A = 1;
                    obj = gr8.H(d31, e31);
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
                return new Integer(((q31) obj).a);
            }
        }
        e31 = new h61(h61);
        Object obj2 = e31.z;
        i = e31.A;
        if (i != 0) {
        }
        return new Integer(((q31) obj2).a);
    }
}
