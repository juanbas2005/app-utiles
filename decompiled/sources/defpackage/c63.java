package defpackage;

/* renamed from: c63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c63 extends a97 implements gs2 {
    public int A;
    public /* synthetic */ long B;

    public final Object H(Object obj, Object obj2) {
        return ((c63) o((f61) obj2, Long.valueOf(((Number) obj).longValue()))).s(vs7.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [f61, c63, a97] */
    public final f61 o(f61 f61, Object obj) {
        ? a97 = new a97(2, f61);
        a97.B = ((Number) obj).longValue();
        return a97;
    }

    public final Object s(Object obj) {
        long j = this.B;
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            this.B = j;
            this.A = 1;
            Object G = t49.G(j, this);
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
        return vs7.a;
    }
}
