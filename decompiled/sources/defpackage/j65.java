package defpackage;

/* renamed from: j65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j65 extends vg2 {
    public static final j65 e = new j65(1, 2, 0);
    public static final j65 f = new j65(1, 1, 1);
    public static final j65 g = new j65(1, 2, 2);
    public static final j65 h = new j65(1, 1, 3);
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j65(int i, int i2, int i3) {
        super(i, i2, 2, (byte) 0);
        this.d = i3;
    }

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        switch (this.d) {
            case b85.b:
                Object b = ((sr2) tt2.f(0)).b();
                st2 st2 = (st2) tt2.f(1);
                int e2 = tt2.e(0);
                st2.getClass();
                jv6.X(jv6.c(st2), b);
                krVar.k(e2, b);
                krVar.c(b);
                return;
            case 1:
                st2 st22 = (st2) tt2.f(0);
                int e3 = tt2.e(0);
                krVar.i();
                st22.getClass();
                krVar.b(e3, jv6.E(jv6.c(st22)));
                return;
            case 2:
                Object f2 = tt2.f(0);
                st2 st23 = (st2) tt2.f(1);
                int e4 = tt2.e(0);
                if (f2 instanceof cu2) {
                    cu2 cu2 = (cu2) f2;
                    u36.e.b(cu2);
                    u36.d.a(cu2);
                }
                Object M = jv6.M(jv6.c(st23), e4, f2);
                if (M instanceof cu2) {
                    u36.e((cu2) M);
                    return;
                } else if (M instanceof yx5) {
                    ((yx5) M).c();
                    return;
                } else {
                    return;
                }
            default:
                Object f3 = tt2.f(0);
                int e5 = tt2.e(0);
                if (f3 instanceof cu2) {
                    cu2 cu22 = (cu2) f3;
                    u36.e.b(cu22);
                    u36.d.a(cu22);
                }
                Object M2 = jv6.M(jv6.t, e5, f3);
                if (M2 instanceof cu2) {
                    u36.e((cu2) M2);
                    return;
                } else if (M2 instanceof yx5) {
                    ((yx5) M2).c();
                    return;
                } else {
                    return;
                }
        }
    }

    public st2 f(tt2 tt2) {
        switch (this.d) {
            case b85.b:
                return (st2) tt2.f(1);
            case 1:
                return (st2) tt2.f(0);
            default:
                return super.f(tt2);
        }
    }
}
