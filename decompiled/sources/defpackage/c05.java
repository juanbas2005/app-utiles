package defpackage;

/* renamed from: c05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class c05 {
    public final eq4 a = new eq4(new rz4[16]);
    public final lp4 b = new lp4(10);

    public boolean a(vc4 vc4, dy3 dy3, hv2 hv2, boolean z) {
        eq4 eq4 = this.a;
        Object[] objArr = eq4.w;
        int i = eq4.y;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (((rz4) objArr[i2]).a(vc4, dy3, hv2, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public void b(hv2 hv2) {
        eq4 eq4 = this.a;
        int i = eq4.y;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((rz4) eq4.w[i]).d.x == 0) {
                eq4.l(i);
            }
        }
    }
}
