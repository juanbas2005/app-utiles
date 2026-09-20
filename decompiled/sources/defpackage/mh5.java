package defpackage;

import cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker;

/* renamed from: mh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mh5 extends h61 {
    public final /* synthetic */ PlanExpiryWorker A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mh5(PlanExpiryWorker planExpiryWorker, h61 h61) {
        super(h61);
        this.A = planExpiryWorker;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(this);
    }
}
