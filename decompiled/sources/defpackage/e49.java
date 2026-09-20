package defpackage;

/* renamed from: e49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e49 implements Runnable {
    public final /* synthetic */ v49 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ h39 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ e49(v49 v49, h39 h39, long j, boolean z2, int i) {
        this.w = i;
        this.x = h39;
        this.y = j;
        this.z = z2;
        this.A = v49;
    }

    public final void run() {
        int i = this.w;
        long j = this.y;
        boolean z2 = this.z;
        h39 h39 = this.x;
        v49 v49 = this.A;
        switch (i) {
            case b85.b:
                v49.C1(h39);
                v49.s1(h39, j, z2);
                return;
            default:
                v49.C1(h39);
                v49.s1(h39, j, z2);
                return;
        }
    }
}
