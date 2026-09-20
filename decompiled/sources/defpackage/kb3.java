package defpackage;

/* renamed from: kb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kb3 extends a97 implements gs2 {
    public /* synthetic */ float A;

    public final Object H(Object obj, Object obj2) {
        return ((kb3) o((f61) obj2, Float.valueOf(((Number) obj).floatValue()))).s(vs7.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [f61, kb3, a97] */
    public final f61 o(f61 f61, Object obj) {
        ? a97 = new a97(2, f61);
        a97.A = ((Number) obj).floatValue();
        return a97;
    }

    public final Object s(Object obj) {
        boolean z;
        o85.q(obj);
        if (this.A > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
