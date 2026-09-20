package defpackage;

import java.nio.charset.Charset;

/* renamed from: nx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nx3 implements fi2 {
    public final /* synthetic */ zr3 A;
    public final /* synthetic */ Charset B;
    public int w;
    public final /* synthetic */ fg0 x;
    public final /* synthetic */ tl3 y;
    public final /* synthetic */ px3 z;

    public nx3(fg0 fg0, tl3 tl3, px3 px3, zr3 zr3, Charset charset) {
        this.x = fg0;
        this.y = tl3;
        this.z = px3;
        this.A = zr3;
        this.B = charset;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (defpackage.gr8.a0(r2, r8, r0) == r7) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r2.c(r0) != r7) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public final Object k(Object obj, f61 f61) {
        mx3 mx3;
        int i;
        fg0 fg0;
        p81 p81;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] R;
        if (f61 instanceof mx3) {
            mx3 = (mx3) f61;
            int i6 = mx3.A;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                mx3.A = i6 - Integer.MIN_VALUE;
                Object obj2 = mx3.z;
                i = mx3.A;
                fg0 = this.x;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    i5 = this.w;
                    this.w = i5 + 1;
                    if (i5 >= 0) {
                        i4 = 0;
                        if (i5 > 0) {
                            byte[] bArr = this.y.c;
                            mx3.C = obj;
                            mx3.D = i5;
                            mx3.E = 0;
                            mx3.A = 1;
                        }
                    } else {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                } else if (i == 1) {
                    int i7 = mx3.E;
                    i5 = mx3.D;
                    Object obj3 = mx3.C;
                    o85.q(obj2);
                    i4 = i7;
                    obj = obj3;
                } else if (i == 2) {
                    i3 = mx3.E;
                    i2 = mx3.D;
                    o85.q(obj2);
                    mx3.C = null;
                    mx3.D = i2;
                    mx3.E = i3;
                    mx3.A = 3;
                } else if (i == 3) {
                    o85.q(obj2);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                R = z65.R(this.z.a.d(this.A, obj), this.B);
                mx3.C = null;
                mx3.D = i5;
                mx3.E = i4;
                mx3.A = 2;
                if (gr8.a0(fg0, R, mx3) != p81) {
                    i3 = i4;
                    i2 = i5;
                    mx3.C = null;
                    mx3.D = i2;
                    mx3.E = i3;
                    mx3.A = 3;
                }
                return p81;
            }
        }
        mx3 = new mx3(this, f61);
        Object obj22 = mx3.z;
        i = mx3.A;
        fg0 = this.x;
        p81 = p81.w;
        if (i != 0) {
        }
        R = z65.R(this.z.a.d(this.A, obj), this.B);
        mx3.C = null;
        mx3.D = i5;
        mx3.E = i4;
        mx3.A = 2;
        if (gr8.a0(fg0, R, mx3) != p81) {
        }
        return p81;
    }
}
