package defpackage;

/* renamed from: e52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e52 extends wx3 implements vr2 {
    public final /* synthetic */ tr6 A;
    public final /* synthetic */ int x;
    public final /* synthetic */ n52 y;
    public final /* synthetic */ x82 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e52(n52 n52, x82 x82, tr6 tr6, int i) {
        super(1);
        this.x = i;
        this.y = n52;
        this.z = x82;
        this.A = tr6;
    }

    public final Object y(Object obj) {
        int i = this.x;
        n52 n52 = this.y;
        tr6 tr6 = this.A;
        x82 x82 = this.z;
        float f = 1.0f;
        switch (i) {
            case b85.b:
                int ordinal = ((a52) obj).ordinal();
                if (ordinal == 0) {
                    gb2 gb2 = n52.a.a;
                    if (gb2 != null) {
                        f = gb2.a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        gb2 gb22 = x82.a.a;
                        f = gb22 != null ? gb22.a : tr6.f;
                    } else {
                        h.c();
                        return null;
                    }
                }
                return Float.valueOf(f);
            default:
                int ordinal2 = ((a52) obj).ordinal();
                if (ordinal2 == 0) {
                    xf6 xf6 = n52.a.d;
                    if (xf6 != null) {
                        f = xf6.a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        xf6 xf62 = x82.a.d;
                        f = xf62 != null ? xf62.a : tr6.g;
                    } else {
                        h.c();
                        return null;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
