package defpackage;

/* renamed from: yk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yk4 {
    public static yk4 h;
    public final ey3 a;
    public final tg7 b;
    public final wp1 c;
    public final dl2 d;
    public final tg7 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public yk4(ey3 ey3, tg7 tg7, wp1 wp1, dl2 dl2) {
        this.a = ey3;
        this.b = tg7;
        this.c = wp1;
        this.d = dl2;
        this.e = aa5.k(tg7, ey3);
    }

    public final long a(long j, int i) {
        int i2 = i;
        float f2 = this.g;
        float f3 = this.f;
        int i3 = 0;
        int i4 = 1;
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            String str = zk4.a;
            tg7 tg7 = this.e;
            a42 a42 = a42.w;
            dl2 dl2 = this.d;
            wp1 wp1 = this.c;
            float b2 = new zg(new dh(str, tg7, a42, a42, dl2, wp1), 1, 1, m31.b(0, 0, 0, 0, 15)).b();
            i4 = 1;
            float b3 = new zg(new dh(zk4.b, this.e, a42, a42, this.d, wp1), 2, 1, m31.b(0, 0, 0, 0, 15)).b() - b2;
            this.g = b2;
            this.f = b3;
            float f4 = b2;
            f3 = b3;
            f2 = f4;
        }
        if (i2 != i4) {
            int round = Math.round((f3 * ((float) (i2 - 1))) + f2);
            if (round >= 0) {
                i3 = round;
            }
            int g2 = k31.g(j);
            if (i3 > g2) {
                i3 = g2;
            }
        } else {
            i3 = k31.i(j);
        }
        return m31.a(k31.j(j), k31.h(j), i3, k31.g(j));
    }
}
