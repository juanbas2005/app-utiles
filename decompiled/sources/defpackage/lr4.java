package defpackage;

import cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker;

/* renamed from: lr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lr4 extends h61 {
    public final /* synthetic */ NautaLogoutWorker A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lr4(NautaLogoutWorker nautaLogoutWorker, h61 h61) {
        super(h61);
        this.A = nautaLogoutWorker;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(this);
    }
}
