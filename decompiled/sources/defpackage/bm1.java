package defpackage;

/* renamed from: bm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bm1 implements gh4 {
    public final /* synthetic */ int w;
    public final gh4 x;
    public final Enum y;
    public final Enum z;

    public /* synthetic */ bm1(gh4 gh4, Enum enumR, Enum enumR2, int i) {
        this.w = i;
        this.x = gh4;
        this.y = enumR;
        this.z = enumR2;
    }

    public final Object B() {
        switch (this.w) {
            case b85.b:
                return this.x.B();
            case 1:
                return this.x.B();
            default:
                return this.x.B();
        }
    }

    public final int W(int i) {
        switch (this.w) {
            case b85.b:
                return this.x.W(i);
            case 1:
                return this.x.W(i);
            default:
                return this.x.W(i);
        }
    }

    public final int c(int i) {
        switch (this.w) {
            case b85.b:
                return this.x.c(i);
            case 1:
                return this.x.c(i);
            default:
                return this.x.c(i);
        }
    }

    public final int l(int i) {
        switch (this.w) {
            case b85.b:
                return this.x.l(i);
            case 1:
                return this.x.l(i);
            default:
                return this.x.l(i);
        }
    }

    public final int v(int i) {
        switch (this.w) {
            case b85.b:
                return this.x.v(i);
            case 1:
                return this.x.v(i);
            default:
                return this.x.v(i);
        }
    }

    public final eh5 y(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.w;
        Enum enumR = this.y;
        Enum enumR2 = this.z;
        gh4 gh4 = this.x;
        int i8 = 32767;
        switch (i7) {
            case b85.b:
                pg3 pg3 = (pg3) enumR2;
                lg3 lg3 = (lg3) enumR;
                lg3 lg32 = lg3.x;
                if (pg3 == pg3.w) {
                    if (lg3 == lg32) {
                        i2 = gh4.v(k31.g(j));
                    } else {
                        i2 = gh4.l(k31.g(j));
                    }
                    if (k31.c(j)) {
                        i8 = k31.g(j);
                    }
                    return new jg2(i2, i8, 0);
                }
                if (lg3 == lg32) {
                    i = gh4.c(k31.h(j));
                } else {
                    i = gh4.W(k31.h(j));
                }
                if (k31.d(j)) {
                    i8 = k31.h(j);
                }
                return new jg2(i8, i, 0);
            case 1:
                xh4 xh4 = (xh4) enumR2;
                wh4 wh4 = (wh4) enumR;
                wh4 wh42 = wh4.x;
                if (xh4 == xh4.w) {
                    if (wh4 == wh42) {
                        i4 = gh4.v(k31.g(j));
                    } else {
                        i4 = gh4.l(k31.g(j));
                    }
                    if (k31.c(j)) {
                        i8 = k31.g(j);
                    }
                    return new jg2(i4, i8, 1);
                }
                if (wh4 == wh42) {
                    i3 = gh4.c(k31.h(j));
                } else {
                    i3 = gh4.W(k31.h(j));
                }
                if (k31.d(j)) {
                    i8 = k31.h(j);
                }
                return new jg2(i8, i3, 1);
            default:
                b05 b05 = (b05) enumR2;
                a05 a05 = (a05) enumR;
                a05 a052 = a05.x;
                if (b05 == b05.w) {
                    if (a05 == a052) {
                        i6 = gh4.v(k31.g(j));
                    } else {
                        i6 = gh4.l(k31.g(j));
                    }
                    if (k31.c(j)) {
                        i8 = k31.g(j);
                    }
                    return new jg2(i6, i8, 2);
                }
                if (a05 == a052) {
                    i5 = gh4.c(k31.h(j));
                } else {
                    i5 = gh4.W(k31.h(j));
                }
                if (k31.d(j)) {
                    i8 = k31.h(j);
                }
                return new jg2(i8, i5, 2);
        }
    }
}
