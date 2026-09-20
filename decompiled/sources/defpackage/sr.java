package defpackage;

/* renamed from: sr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sr implements vr {
    public final /* synthetic */ int w;

    public /* synthetic */ sr(int i) {
        this.w = i;
    }

    public final void s0(tp1 tp1, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.w) {
            case b85.b:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                return;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.w) {
            case b85.b:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
