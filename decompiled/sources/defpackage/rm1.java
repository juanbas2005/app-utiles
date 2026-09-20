package defpackage;

/* renamed from: rm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rm1 {
    public static final rm1 a = new Object();

    public final void a(gx4 gx4, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2 yt22 = yt2;
        int i3 = i;
        yt2.g0(-878188166);
        if (yt2.g(gx4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i4 & 1, z)) {
            s87.a(gx4.b, (pq6) null, gx4.e, gx4.f, 0.0f, 0.0f, su0.J(-1665712683, new qm1(gx4, 0), yt2), yt22, 12582912, 114);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(this, gx4, i3, 11);
        }
    }
}
