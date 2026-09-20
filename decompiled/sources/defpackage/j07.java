package defpackage;

import android.view.ViewConfiguration;

/* renamed from: j07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j07 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final tj1 a(yt2 yt2) {
        tp1 tp1 = (tp1) yt2.k(xy0.h);
        boolean d = yt2.d(tp1.b());
        Object Q = yt2.Q();
        if (d || Q == ay0.a) {
            Q = new tj1(new br4(tp1));
            yt2.o0(Q);
        }
        return (tj1) Q;
    }
}
