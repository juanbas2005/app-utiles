package defpackage;

/* renamed from: sm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sm5 {
    public static final /* synthetic */ int a = 0;

    static {
        new hu5(new jk4(28));
    }

    public static final void a(fw0 fw0, yt2 yt2, int i) {
        boolean z;
        yt2.g0(442516910);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i & 1, z)) {
            yt2.e0(1766838549);
            yt2.r(false);
            yt2.e0(1767392772);
            fw0.H(yt2, 6);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new x30(fw0, i, 15);
        }
    }
}
