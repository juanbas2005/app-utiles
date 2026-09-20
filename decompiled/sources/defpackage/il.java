package defpackage;

/* renamed from: il  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il implements a37 {
    public long A;
    public boolean B;
    public final lo7 w;
    public final ed5 x;
    public ol y;
    public long z;

    public il(lo7 lo7, Object obj, ol olVar, long j, long j2, boolean z2) {
        ol olVar2;
        this.w = lo7;
        this.x = u55.p(obj);
        if (olVar != null) {
            olVar2 = tf4.m(olVar);
        } else {
            olVar2 = (ol) lo7.a.y(obj);
            olVar2.d();
        }
        this.y = olVar2;
        this.z = j;
        this.A = j2;
        this.B = z2;
    }

    public final Object b() {
        return this.w.b.y(this.y);
    }

    public final Object getValue() {
        return this.x.getValue();
    }

    public final String toString() {
        Object value = this.x.getValue();
        Object b = b();
        boolean z2 = this.B;
        long j = this.z;
        long j2 = this.A;
        return "AnimationState(value=" + value + ", velocity=" + b + ", isRunning=" + z2 + ", lastFrameTimeNanos=" + j + ", finishedTimeNanos=" + j2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il(lo7 lo7, Object obj, ol olVar, int i) {
        this(lo7, obj, (i & 4) != 0 ? null : olVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
