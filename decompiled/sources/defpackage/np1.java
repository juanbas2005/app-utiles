package defpackage;

/* renamed from: np1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class np1 implements h22 {
    public final int a;
    public final int b;

    public np1(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            zb3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    public final void a(i22 i22) {
        int i = i22.y;
        xs0 xs0 = (xs0) i22.B;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = xs0.y();
        }
        i22.a(i22.y, Math.min(i3, xs0.y()));
        int i4 = i22.x;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        i22.a(Math.max(0, i6), i22.x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.np1) r5;
     */
    public final boolean equals(Object obj) {
        np1 np1;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof np1) && this.a == np1.a && this.b == np1.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return pb4.k("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
