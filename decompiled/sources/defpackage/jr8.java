package defpackage;

/* renamed from: jr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jr8 implements gs2 {
    public final /* synthetic */ qt0 w;
    public final /* synthetic */ br7 x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ jr8(qt0 qt0, br7 br7, fw0 fw0) {
        this.w = qt0;
        this.x = br7;
        this.y = fw0;
    }

    public final /* synthetic */ Object H(Object obj, Object obj2) {
        boolean z;
        int intValue = ((Integer) obj2).intValue();
        int i = intValue & 1;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        yt2 yt2 = (yt2) obj;
        t37 t37 = lr8.a;
        if (yt2.V(i, z)) {
            ch4.c(this.w, (gr6) null, this.x, this.y, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
