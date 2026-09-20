package defpackage;

import android.graphics.Color;

/* renamed from: ee4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ee4 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3 = i;
        yt2.g0(-1000958394);
        if (yt2.i(sr2)) {
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
            s87.a(yu6.c, (pq6) null, 0, 0, 0.0f, 0.0f, su0.J(-141907359, new ce4(0, sr2), yt2), yt2, 12582918, 126);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ce4(i, 16, sr2);
        }
    }
}
