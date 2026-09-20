package defpackage;

/* renamed from: i32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i32 implements h32 {
    public final int w;
    public int x = -1;
    public int y = -1;

    public i32(int i) {
        this.w = i;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, tq7 tq7) {
        int i3 = this.w;
        if (i <= i3 && i3 < i2) {
            this.x = i;
            this.y = i2;
            return false;
        } else if (i2 <= i3) {
            return true;
        } else {
            return false;
        }
    }

    public final Object a() {
        return this;
    }
}
