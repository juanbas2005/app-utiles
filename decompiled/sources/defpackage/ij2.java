package defpackage;

/* renamed from: ij2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ij2 extends a97 implements gs2 {
    public /* synthetic */ int A;

    public final Object H(Object obj, Object obj2) {
        return ((ij2) o((f61) obj2, Integer.valueOf(((Number) obj).intValue()))).s(vs7.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ij2, f61, a97] */
    public final f61 o(f61 f61, Object obj) {
        ? a97 = new a97(2, f61);
        a97.A = ((Number) obj).intValue();
        return a97;
    }

    public final Object s(Object obj) {
        boolean z;
        int i = this.A;
        o85.q(obj);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
