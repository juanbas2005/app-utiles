package defpackage;

/* renamed from: tg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tg3 extends k66 {
    public int x;
    public final /* synthetic */ o0 y;

    /* JADX WARNING: Illegal instructions before constructor call */
    public tg3(o0 o0Var) {
        super(r0);
        zu0 zu0 = gr8.c;
        this.y = o0Var;
    }

    public final Object s(Object obj) {
        int i = this.x;
        if (i == 0) {
            this.x = 1;
            o85.q(obj);
            o0 o0Var = this.y;
            mp7.Q(1, o0Var);
            return o0Var.y(this);
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
