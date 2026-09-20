package defpackage;

/* renamed from: k52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k52 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m52 y;
    public final /* synthetic */ long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k52(m52 m52, long j, int i) {
        super(1);
        this.x = i;
        this.y = m52;
        this.z = j;
    }

    public final Object y(Object obj) {
        vr2 vr2;
        vr2 vr22;
        long j;
        long j2;
        int ordinal;
        int i = this.x;
        long j3 = this.z;
        long j4 = 0;
        m52 m52 = this.y;
        switch (i) {
            case b85.b:
                int ordinal2 = ((a52) obj).ordinal();
                if (ordinal2 == 0) {
                    cn0 cn0 = m52.P.a.c;
                    if (!(cn0 == null || (vr2 = cn0.b) == null)) {
                        j3 = ((we3) vr2.y(new we3(j3))).a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        cn0 cn02 = m52.Q.a.c;
                        if (!(cn02 == null || (vr22 = cn02.b) == null)) {
                            j3 = ((we3) vr22.y(new we3(j3))).a;
                        }
                    } else {
                        h.c();
                        return null;
                    }
                }
                return new we3(j3);
            case 1:
                a52 a52 = (a52) obj;
                if (a52 == a52.y && m52.Q.a.b == null) {
                    j4 = m52.R.i;
                } else {
                    dv6 dv6 = m52.P.a.b;
                    if (dv6 != null) {
                        j = ((oe3) dv6.a.y(new we3(j3))).a;
                    } else {
                        j = 0;
                    }
                    dv6 dv62 = m52.Q.a.b;
                    if (dv62 != null) {
                        j2 = ((oe3) dv62.a.y(new we3(j3))).a;
                    } else {
                        j2 = 0;
                    }
                    int ordinal3 = a52.ordinal();
                    if (ordinal3 == 0) {
                        j4 = j;
                    } else if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            j4 = j2;
                        } else {
                            h.c();
                            return null;
                        }
                    }
                }
                return new oe3(j4);
            default:
                a52 a522 = (a52) obj;
                if (!(m52.V == null || m52.X0() == null || sg3.e(m52.V, m52.X0()) || (ordinal = a522.ordinal()) == 0 || ordinal == 1)) {
                    if (ordinal == 2) {
                        cn0 cn03 = m52.Q.a.c;
                        if (cn03 != null) {
                            vr2 vr23 = cn03.b;
                            long j5 = this.z;
                            long j6 = ((we3) vr23.y(new we3(j5))).a;
                            jb X0 = m52.X0();
                            X0.getClass();
                            ey3 ey3 = ey3.w;
                            long a = X0.a(j5, j6, ey3);
                            jb jbVar = m52.V;
                            jbVar.getClass();
                            j4 = oe3.b(a, jbVar.a(j5, j6, ey3));
                        }
                    } else {
                        h.c();
                        return null;
                    }
                }
                return new oe3(j4);
        }
    }
}
