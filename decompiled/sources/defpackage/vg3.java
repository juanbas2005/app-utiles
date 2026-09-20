package defpackage;

/* renamed from: vg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vg3 extends h61 {
    public final /* synthetic */ gs2 A;
    public final /* synthetic */ f61 B;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg3(f61 f61, e81 e81, gs2 gs2, f61 f612) {
        super(f61, e81);
        this.A = gs2;
        this.B = f612;
    }

    public final Object s(Object obj) {
        int i = this.z;
        if (i == 0) {
            this.z = 1;
            o85.q(obj);
            gs2 gs2 = this.A;
            gs2.getClass();
            mp7.Q(2, gs2);
            return gs2.H(this.B, this);
        } else if (i == 1) {
            this.z = 2;
            o85.q(obj);
            return obj;
        } else {
            h.s("This coroutine had already completed");
            return null;
        }
    }
}
