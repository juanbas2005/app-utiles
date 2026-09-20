package defpackage;

/* renamed from: qs7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs7 extends a97 implements is2 {
    public int A;
    public /* synthetic */ Throwable B;
    public /* synthetic */ long C;

    /* JADX WARNING: type inference failed for: r4v2, types: [qs7, a97] */
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        fi2 fi2 = (fi2) obj;
        long longValue = ((Number) obj3).longValue();
        ? a97 = new a97(4, (f61) obj4);
        a97.B = (Throwable) obj2;
        a97.C = longValue;
        return a97.s(vs7.a);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            Throwable th = this.B;
            long j = this.C;
            bc4.k().i(rs7.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, rs7.b);
            this.A = 1;
            Object G = t49.G(min, this);
            p81 p81 = p81.w;
            if (G == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return Boolean.TRUE;
    }
}
