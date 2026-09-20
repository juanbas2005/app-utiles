package defpackage;

import java.util.Map;

/* renamed from: ta5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ta5 implements fc0 {
    public final ob5 b;
    public final fc0 c;
    public final ey3 d;

    public ta5(ob5 ob5, fc0 fc0, ey3 ey3) {
        this.b = ob5;
        this.c = fc0;
        this.d = ey3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r11 + r12) > r13) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r11 <= 1.0f) goto L_0x0012;
     */
    public final float a(float f, float f2, float f3) {
        int i;
        int p;
        int i2;
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = l78.a;
        }
        z = true;
        int i3 = (Math.abs(a) > 0.0f ? 1 : (Math.abs(a) == 0.0f ? 0 : -1));
        ey3 ey3 = ey3.x;
        z75 z75 = z75.x;
        ey3 ey32 = this.d;
        ob5 ob5 = this.b;
        if (i3 != 0 && z) {
            if (ey32 == ey3 && ob5.m().e == z75) {
                i2 = ob5.p() + (-ob5.f);
            } else {
                i2 = ob5.f;
            }
            float f5 = ((float) i2) * -1.0f;
            while (a > 0.0f && f5 < a) {
                f5 += (float) ob5.p();
            }
            while (a < 0.0f && f5 > a) {
                f5 -= (float) ob5.p();
            }
            return f5;
        }
        int i4 = ob5.f;
        ed5 ed5 = ob5.E;
        if (((double) Math.abs(i4)) < 1.0E-6d) {
            return 0.0f;
        }
        if (ey32 == ey3 && ob5.m().e == z75) {
            i = ob5.p() + (-ob5.f);
        } else {
            i = ob5.f;
        }
        float f6 = ((float) i) * -1.0f;
        if (ey32 == ey3 && ob5.m().e == z75) {
            if (!((Boolean) ed5.getValue()).booleanValue()) {
                p = ob5.p();
            }
            return z65.o(f6, -f3, f3);
        }
        if (((Boolean) ed5.getValue()).booleanValue()) {
            p = ob5.p();
        }
        return z65.o(f6, -f3, f3);
        f6 += (float) p;
        return z65.o(f6, -f3, f3);
    }
}
