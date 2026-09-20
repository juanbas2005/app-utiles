package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: b31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b31 extends h61 {
    public /* synthetic */ Object A;
    public final /* synthetic */ ConstraintTrackingWorker B;
    public int C;
    public t84 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b31(ConstraintTrackingWorker constraintTrackingWorker, h61 h61) {
        super(h61);
        this.B = constraintTrackingWorker;
    }

    public final Object s(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.g(this.B, this);
    }
}
