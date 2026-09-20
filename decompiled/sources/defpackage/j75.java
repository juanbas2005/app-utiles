package defpackage;

import java.util.Arrays;

/* renamed from: j75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j75 extends k75 {
    public vg2[] g = new vg2[16];
    public int h;
    public int[] i = new int[16];
    public int j;
    public Object[] k = new Object[16];
    public int l;

    public final void p() {
        this.h = 0;
        this.j = 0;
        Arrays.fill(this.k, 0, this.l, (Object) null);
        this.l = 0;
    }

    public final void q(kr krVar, jv6 jv6, u36 u36, f75 f75) {
        if (this.h != 0) {
            tt2 tt2 = new tt2(this);
            j75 j75 = (j75) tt2.e;
            while (true) {
                vg2 vg2 = j75.g[tt2.b];
                st2 f = vg2.f(tt2);
                kr krVar2 = krVar;
                jv6 jv62 = jv6;
                u36 u362 = u36;
                f75 f752 = f75;
                try {
                    vg2.d(tt2, krVar2, jv62, u362, f752);
                    int i2 = tt2.b;
                    int i3 = j75.h;
                    if (i2 < i3) {
                        vg2 vg22 = j75.g[i2];
                        tt2.c += vg22.b;
                        tt2.d += vg22.c;
                        int i4 = i2 + 1;
                        tt2.b = i4;
                        if (i4 >= i3) {
                            break;
                        }
                        krVar = krVar2;
                        jv6 = jv62;
                        u36 = u362;
                        f75 = f752;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (f752 != null) {
                        tf4.S(th2, new g20(f, jv62, f752, 15));
                    }
                    throw th2;
                }
            }
        }
        p();
    }

    public final boolean r() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    public final void s(vg2 vg2) {
        int i2;
        int i3;
        int i4 = this.h;
        vg2[] vg2Arr = this.g;
        int i5 = 1024;
        if (i4 == vg2Arr.length) {
            if (i4 > 1024) {
                i3 = 1024;
            } else {
                i3 = i4;
            }
            vg2[] vg2Arr2 = new vg2[(i3 + i4)];
            System.arraycopy(vg2Arr, 0, vg2Arr2, 0, i4);
            this.g = vg2Arr2;
        }
        int i6 = this.j;
        int i7 = vg2.b;
        int i8 = vg2.c;
        int i9 = i6 + i7;
        int[] iArr = this.i;
        int length = iArr.length;
        if (i9 > length) {
            if (length > 1024) {
                i2 = 1024;
            } else {
                i2 = length;
            }
            int i10 = i2 + length;
            if (i10 >= i9) {
                i9 = i10;
            }
            int[] iArr2 = new int[i9];
            qs.J0(0, 0, length, iArr, iArr2);
            this.i = iArr2;
        }
        int i11 = this.l + i8;
        Object[] objArr = this.k;
        int length2 = objArr.length;
        if (i11 > length2) {
            if (length2 <= 1024) {
                i5 = length2;
            }
            int i12 = i5 + length2;
            if (i12 >= i11) {
                i11 = i12;
            }
            Object[] objArr2 = new Object[i11];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.k = objArr2;
        }
        vg2[] vg2Arr3 = this.g;
        int i13 = this.h;
        this.h = i13 + 1;
        vg2Arr3[i13] = vg2;
        this.j += vg2.b;
        this.l += i8;
    }
}
