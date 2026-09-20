package defpackage;

import java.util.Set;

/* renamed from: q65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q65 extends vg2 {
    public static final q65 d = new vg2(0, 1, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        yx5 yx5 = (yx5) tt2.f(0);
        Set set = u36.a;
        if (set != null) {
            af5 af5 = new af5(set);
            tp4 tp4 = u36.i;
            if (tp4 == null) {
                long[] jArr = bg6.a;
                tp4 = new tp4();
                u36.i = tp4;
            }
            tp4.m(yx5, af5);
            u36.e.b(new cu2(af5, -1));
        }
    }
}
