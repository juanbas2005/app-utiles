package defpackage;

/* renamed from: wk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wk extends wx3 implements hs2 {
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ mm7 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk(vr2 vr2, mm7 mm7) {
        super(3);
        this.x = vr2;
        this.y = mm7;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        long j;
        oh4 oh4 = (oh4) obj;
        eh5 y2 = ((gh4) obj2).y(((k31) obj3).a);
        if (oh4.a0()) {
            if (!((Boolean) this.x.y(this.y.d.getValue())).booleanValue()) {
                j = 0;
                return oh4.d0((int) (j >> 32), (int) (4294967295L & j), b42.w, new wd(y2, 2));
            }
        }
        j = (((long) y2.w) << 32) | (((long) y2.x) & 4294967295L);
        return oh4.d0((int) (j >> 32), (int) (4294967295L & j), b42.w, new wd(y2, 2));
    }
}
