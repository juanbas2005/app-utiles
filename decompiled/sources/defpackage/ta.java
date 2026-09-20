package defpackage;

/* renamed from: ta  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ta implements gs2 {
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ ey3 y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ ta(float f, float f2, ey3 ey3, fw0 fw0) {
        this.w = f;
        this.x = f2;
        this.y = ey3;
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
            h49.g((ml4) null, new ur(this.w, true, new h(2)), new ur(this.x, true, new h(2)), (h80) null, 0, 0, su0.J(879927511, new gc5(2, (Object) this.y, (Object) this.z), yt2), yt2, 1572864, 57);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
