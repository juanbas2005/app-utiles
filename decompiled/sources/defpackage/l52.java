package defpackage;

/* renamed from: l52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l52 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m52 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l52(m52 m52, int i) {
        super(1);
        this.x = i;
        this.y = m52;
    }

    public final Object y(Object obj) {
        je2 je2;
        je2 je22;
        int i = this.x;
        a52 a52 = a52.y;
        a52 a522 = a52.x;
        a52 a523 = a52.w;
        m52 m52 = this.y;
        switch (i) {
            case b85.b:
                gm7 gm7 = (gm7) obj;
                boolean c = gm7.c(a523, a522);
                Object obj2 = null;
                if (c) {
                    cn0 cn0 = m52.P.a.c;
                    if (cn0 != null) {
                        obj2 = cn0.c;
                    }
                } else if (gm7.c(a522, a52)) {
                    cn0 cn02 = m52.Q.a.c;
                    if (cn02 != null) {
                        obj2 = cn02.c;
                    }
                } else {
                    obj2 = i52.e;
                }
                if (obj2 == null) {
                    return i52.e;
                }
                return obj2;
            default:
                gm7 gm72 = (gm7) obj;
                if (gm72.c(a523, a522)) {
                    dv6 dv6 = m52.P.a.b;
                    if (dv6 == null || (je22 = dv6.b) == null) {
                        return i52.d;
                    }
                    return je22;
                } else if (!gm72.c(a522, a52)) {
                    return i52.d;
                } else {
                    dv6 dv62 = m52.Q.a.b;
                    if (dv62 == null || (je2 = dv62.b) == null) {
                        return i52.d;
                    }
                    return je2;
                }
        }
    }
}
