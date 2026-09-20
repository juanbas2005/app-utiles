package defpackage;

import android.graphics.Paint;

/* renamed from: ze8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze8 {
    public static final ze8 a = new Object();

    public final long a(Paint paint) {
        int i = jt0.h;
        long a2 = paint.getColorLong();
        long j = 63 & a2;
        if (j < 16) {
            return a2;
        }
        return (a2 & -64) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(bb0.A0(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(gl0.i0(j));
    }
}
