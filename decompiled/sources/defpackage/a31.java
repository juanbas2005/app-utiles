package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: a31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a31 extends h61 {
    public final /* synthetic */ ConstraintTrackingWorker A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a31(ConstraintTrackingWorker constraintTrackingWorker, h61 h61) {
        super(h61);
        this.A = constraintTrackingWorker;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.f(this.A, (t84) null, (zy2) null, (be8) null, this);
    }
}
