package defpackage;

/* renamed from: l28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l28 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m28 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l28(m28 m28, int i) {
        super(1);
        this.x = i;
        this.y = m28;
    }

    public final Object y(Object obj) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        m28 m28 = this.y;
        switch (i) {
            case b85.b:
                u18 u18 = (u18) obj;
                m28.d = true;
                m28.f.b();
                return vs7;
            default:
                hz1 hz1 = (hz1) obj;
                sx2 sx2 = m28.b;
                float f = m28.k;
                float f2 = m28.l;
                wr0 j0 = hz1.j0();
                long L = j0.L();
                j0.D().h();
                try {
                    ((ji8) j0.x).E(f, f2, 0);
                    sx2.a(hz1);
                    return vs7;
                } finally {
                    b81.u(j0, L);
                }
        }
    }
}
