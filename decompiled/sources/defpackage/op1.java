package defpackage;

/* renamed from: op1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op1 implements h22 {
    public final int a;
    public final int b;

    public op1(int i, int i2) {
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
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = i22.x;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                }
                char b2 = i22.b((i5 - i4) - 1);
                char b3 = i22.b(i22.x - i4);
                if (!Character.isHighSurrogate(b2) || !Character.isLowSurrogate(b3)) {
                    i3 = i4;
                } else {
                    i3 += 2;
                }
                i2++;
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = i22.y;
            xs0 xs0 = (xs0) i22.B;
            if (i8 + i7 >= xs0.y()) {
                i6 = xs0.y() - i22.y;
                break;
            }
            char b4 = i22.b((i22.y + i7) - 1);
            char b5 = i22.b(i22.y + i7);
            if (!Character.isHighSurrogate(b4) || !Character.isLowSurrogate(b5)) {
                i6 = i7;
            } else {
                i6 += 2;
            }
            i++;
        }
        int i9 = i22.y;
        i22.a(i9, i6 + i9);
        int i10 = i22.x;
        i22.a(i10 - i3, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.op1) r5;
     */
    public final boolean equals(Object obj) {
        op1 op1;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof op1) && this.a == op1.a && this.b == op1.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return pb4.k("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
