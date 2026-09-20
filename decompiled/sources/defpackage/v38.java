package defpackage;

/* renamed from: v38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v38 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ w38 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v38(w38 w38, int i) {
        super(1);
        this.x = i;
        this.y = w38;
    }

    public final Object y(Object obj) {
        long j;
        int i = this.x;
        w38 w38 = this.y;
        switch (i) {
            case b85.b:
                gm7 gm7 = (gm7) obj;
                a52 a52 = a52.w;
                a52 a522 = a52.x;
                if (gm7.c(a52, a522)) {
                    nm7 nm7 = w38.L.a;
                    return i52.c;
                } else if (!gm7.c(a522, a52.y)) {
                    return i52.c;
                } else {
                    nm7 nm72 = w38.M.a;
                    return i52.c;
                }
            default:
                int ordinal = ((a52) obj).ordinal();
                if (ordinal == 0) {
                    nm7 nm73 = w38.L.a;
                    j = jt0.f;
                } else if (ordinal == 1) {
                    nm7 nm74 = w38.L.a;
                    nm7 nm75 = w38.M.a;
                    j = jt0.f;
                } else if (ordinal == 2) {
                    nm7 nm76 = w38.M.a;
                    j = w38.N.e;
                } else {
                    h.c();
                    return null;
                }
                return new jt0(j);
        }
    }
}
