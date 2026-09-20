package defpackage;

/* renamed from: xh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xh2 implements gs2 {
    public final /* synthetic */ long w;
    public final /* synthetic */ tg7 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ xh2(long j, tg7 tg7, float f, fw0 fw0) {
        this.w = j;
        this.x = tg7;
        this.y = f;
        this.z = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            a35.a(this.w, this.x, su0.J(-1767363041, new zh2(this.y, this.z), yt2), yt2, 384);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
