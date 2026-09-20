package defpackage;

/* renamed from: qe3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qe3 extends je3 {
    public final int w;
    public final int x;
    public boolean y;
    public int z;

    public qe3(int i, int i2, int i3) {
        this.w = i3;
        this.x = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.y = z2;
        this.z = !z2 ? i2 : i;
    }

    public final boolean hasNext() {
        return this.y;
    }

    public final int nextInt() {
        int i = this.z;
        if (i != this.x) {
            this.z = this.w + i;
            return i;
        } else if (this.y) {
            this.y = false;
            return i;
        } else {
            rf2.c();
            return 0;
        }
    }
}
