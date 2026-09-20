package defpackage;

/* renamed from: w76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w76 extends y1 {
    public final /* synthetic */ x76 A;
    public int y;
    public int z;

    public w76(x76 x76) {
        this.A = x76;
        this.y = x76.z;
        this.z = x76.y;
    }

    public final void a() {
        int i = this.y;
        if (i == 0) {
            this.w = 2;
            return;
        }
        x76 x76 = this.A;
        Object[] objArr = x76.w;
        int i2 = this.z;
        this.x = objArr[i2];
        this.w = 1;
        this.z = (i2 + 1) % x76.x;
        this.y = i - 1;
    }
}
