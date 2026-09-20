package defpackage;

/* renamed from: mh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mh6 {
    public static final nf6 a = new nf6(11);
    public static final kh6 b = new Object();
    public static final kv1 c = new kv1(1);
    public static final qb5 d = new qb5(1);

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object a(zh6 zh6, long j, h61 h61) {
        lh6 lh6;
        int i;
        zh6 zh62;
        e06 e06;
        if (h61 instanceof lh6) {
            lh6 lh62 = (lh6) h61;
            int i2 = lh62.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lh62.C = i2 - Integer.MIN_VALUE;
                lh6 = lh62;
                Object obj = lh6.B;
                i = lh6.C;
                if (i != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    zh6 zh63 = zh6;
                    q0 q0Var = new q0((Object) zh63, j, (Object) obj2, (f61) null, 2);
                    lh6.z = zh63;
                    lh6.A = obj2;
                    lh6.C = 1;
                    Object g = zh63.g(hq4.w, q0Var, lh6);
                    p81 p81 = p81.w;
                    if (g == p81) {
                        return p81;
                    }
                    zh62 = zh63;
                    e06 = obj2;
                } else if (i == 1) {
                    e06 e062 = lh6.A;
                    zh6 zh64 = lh6.z;
                    o85.q(obj);
                    e06 = e062;
                    zh62 = zh64;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new l35(zh62.i(e06.w));
            }
        }
        lh6 = new h61(h61);
        Object obj3 = lh6.B;
        i = lh6.C;
        if (i != 0) {
        }
        return new l35(zh62.i(e06.w));
    }

    public static ml4 b(re7 re7, z75 z75, boolean z, boolean z2, ap4 ap4) {
        return new jh6(re7, z75, z, z2, ap4);
    }
}
