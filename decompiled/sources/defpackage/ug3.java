package defpackage;

/* renamed from: ug3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ug3 extends k66 {
    public int x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ f61 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug3(f61 f61, f61 f612, gs2 gs2) {
        super(f61);
        this.y = gs2;
        this.z = f612;
    }

    public final Object s(Object obj) {
        int i = this.x;
        if (i == 0) {
            this.x = 1;
            o85.q(obj);
            gs2 gs2 = this.y;
            gs2.getClass();
            mp7.Q(2, gs2);
            return gs2.H(this.z, this);
        } else if (i == 1) {
            this.x = 2;
            o85.q(obj);
            return obj;
        } else {
            h.s("This coroutine had already completed");
            return null;
        }
    }
}
