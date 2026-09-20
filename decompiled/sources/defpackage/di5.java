package defpackage;

/* renamed from: di5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class di5 extends h61 {
    public final /* synthetic */ ni5 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di5(ni5 ni5, h61 h61) {
        super(h61);
        this.A = ni5;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        Object h = this.A.h(0, false, this);
        if (h == p81.w) {
            return h;
        }
        return new o66(h);
    }
}
