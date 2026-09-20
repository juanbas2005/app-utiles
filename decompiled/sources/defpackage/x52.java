package defpackage;

/* renamed from: x52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x52 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ y52 x;

    public /* synthetic */ x52(y52 y52, int i) {
        this.w = i;
        this.x = y52;
    }

    public final Object y(Object obj) {
        int i = this.w;
        oz4 oz4 = oz4.B;
        y52 y52 = this.x;
        switch (i) {
            case b85.b:
                uq4 uq4 = (uq4) obj;
                if (uq4 != null) {
                    return y52.j(uq4, y52.i().b(uq4, oz4));
                }
                y52.h(8);
                throw null;
            default:
                uq4 uq42 = (uq4) obj;
                if (uq42 != null) {
                    return y52.j(uq42, y52.i().f(uq42, oz4));
                }
                y52.h(4);
                throw null;
        }
    }
}
