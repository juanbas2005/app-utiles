package defpackage;

/* renamed from: ee2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ee2 {
    public final int a;
    public final int[] b;
    public final r66[] c;

    public ee2(int i, int i2, int i3, int i4, int[] iArr) {
        this.a = i;
        this.b = iArr;
        float f = (float) i4;
        this.c = new r66[]{new r66((float) i2, f), new r66((float) i3, f)};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ee2) && this.a == ((ee2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
