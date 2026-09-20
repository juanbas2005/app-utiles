package defpackage;

/* renamed from: kp6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp6 extends h61 {
    public final /* synthetic */ vp6 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp6(vp6 vp6, h61 h61) {
        super(h61);
        this.A = vp6;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        Object s = this.A.s(false, this);
        if (s == p81.w) {
            return s;
        }
        return new o66(s);
    }
}
