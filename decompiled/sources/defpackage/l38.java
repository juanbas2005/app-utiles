package defpackage;

import java.util.List;

/* renamed from: l38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l38 extends h38 {
    public final float A;
    public final kc0 B;
    public final float C;
    public final float D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final String w;
    public final List x;
    public final int y;
    public final kc0 z;

    public l38(String str, List list, int i, kc0 kc0, float f, kc0 kc02, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.w = str;
        this.x = list;
        this.y = i;
        this.z = kc0;
        this.A = f;
        this.B = kc02;
        this.C = f2;
        this.D = f3;
        this.E = i2;
        this.F = i3;
        this.G = f4;
        this.H = f5;
        this.I = f6;
        this.J = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l38.class == obj.getClass()) {
            l38 l38 = (l38) obj;
            if (sg3.e(this.w, l38.w) && sg3.e(this.z, l38.z) && this.A == l38.A && sg3.e(this.B, l38.B) && this.C == l38.C && this.D == l38.D && this.E == l38.E && this.F == l38.F && this.G == l38.G && this.H == l38.H && this.I == l38.I && this.J == l38.J && this.y == l38.y && sg3.e(this.x, l38.x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int j = hl6.j(this.x, this.w.hashCode() * 31, 31);
        int i2 = 0;
        kc0 kc0 = this.z;
        if (kc0 != null) {
            i = kc0.hashCode();
        } else {
            i = 0;
        }
        int d = f21.d(this.A, (j + i) * 31, 31);
        kc0 kc02 = this.B;
        if (kc02 != null) {
            i2 = kc02.hashCode();
        }
        return Integer.hashCode(this.y) + f21.d(this.J, f21.d(this.I, f21.d(this.H, f21.d(this.G, f21.e(this.F, f21.e(this.E, f21.d(this.D, f21.d(this.C, (d + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
