package defpackage;

/* renamed from: rr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rr implements tr {
    public final /* synthetic */ int w;

    public /* synthetic */ rr(int i) {
        this.w = i;
    }

    public final String toString() {
        switch (this.w) {
            case b85.b:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }

    public final void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        int i2 = this.w;
        ey3 ey32 = ey3.w;
        int i3 = 0;
        switch (i2) {
            case b85.b:
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    iArr2[i4] = i5;
                    i5 += i6;
                    i3++;
                    i4++;
                }
                return;
            case 1:
                int i7 = 0;
                for (int i8 : iArr) {
                    i7 += i8;
                }
                int i9 = i - i7;
                int length2 = iArr.length;
                int i10 = 0;
                while (i3 < length2) {
                    int i11 = iArr[i3];
                    iArr2[i10] = i9;
                    i9 += i11;
                    i3++;
                    i10++;
                }
                return;
            case 2:
                if (ey3 == ey32) {
                    int i12 = 0;
                    for (int i13 : iArr) {
                        i12 += i13;
                    }
                    int i14 = i - i12;
                    int length3 = iArr.length;
                    int i15 = 0;
                    while (i3 < length3) {
                        int i16 = iArr[i3];
                        iArr2[i15] = i14;
                        i14 += i16;
                        i3++;
                        i15++;
                    }
                    return;
                }
                for (int length4 = iArr.length - 1; -1 < length4; length4--) {
                    int i17 = iArr[length4];
                    iArr2[length4] = i3;
                    i3 += i17;
                }
                return;
            default:
                if (ey3 == ey32) {
                    int length5 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i3 < length5) {
                        int i20 = iArr[i3];
                        iArr2[i18] = i19;
                        i19 += i20;
                        i3++;
                        i18++;
                    }
                    return;
                }
                int length6 = iArr.length;
                int i21 = 0;
                while (i3 < length6) {
                    i21 += iArr[i3];
                    i3++;
                }
                int i22 = i - i21;
                for (int length7 = iArr.length - 1; -1 < length7; length7--) {
                    int i23 = iArr[length7];
                    iArr2[length7] = i22;
                    i22 += i23;
                }
                return;
        }
    }
}
