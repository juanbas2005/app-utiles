package defpackage;

/* renamed from: lz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lz4 implements kz4 {
    public final s3 c = s3.x;
    public final h95 d = new h95(h95.d);

    public final boolean a(vw3 vw3, vw3 vw32) {
        vw3.getClass();
        vw32.getClass();
        return td0.v(t49.C(false, (hz2) null, this.c, 6), vw3.n0(), vw32.n0());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean b(vw3 vw3, vw3 vw32) {
        vw3.getClass();
        vw32.getClass();
        Boolean bool = null;
        uo7 C = t49.C(true, (hz2) null, this.c, 6);
        eq7 eq7 = C.c;
        du7 n0 = vw3.n0();
        du7 n02 = vw32.n0();
        if (n0 == n02) {
            return true;
        }
        gs2 O = eq7.O();
        if (O != null) {
            bool = O.H(n0, n02);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return td0.x.r(C, eq7, n0, n02);
    }
}
