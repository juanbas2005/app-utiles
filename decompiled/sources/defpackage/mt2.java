package defpackage;

/* renamed from: mt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface mt2 extends di2 {
    static /* synthetic */ di2 c(mt2 mt2, e81 e81, int i, vc0 vc0, int i2) {
        if ((i2 & 1) != 0) {
            e81 = x32.w;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            vc0 = vc0.w;
        }
        return mt2.b(e81, i, vc0);
    }

    di2 b(e81 e81, int i, vc0 vc0);
}
