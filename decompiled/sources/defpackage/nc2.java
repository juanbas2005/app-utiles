package defpackage;

/* renamed from: nc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc2 implements qa2 {
    public final int a() {
        return 3;
    }

    public final int b(pi0 pi0, pi0 pi02, ql4 ql4) {
        pi0.getClass();
        pi02.getClass();
        if (!(pi02 instanceof cr5) || !(pi0 instanceof cr5)) {
            return 3;
        }
        cr5 cr5 = (cr5) pi02;
        cr5 cr52 = (cr5) pi0;
        if (!sg3.e(cr5.getName(), cr52.getName())) {
            return 3;
        }
        if (rj1.A(cr5) && rj1.A(cr52)) {
            return 1;
        }
        if (rj1.A(cr5) || rj1.A(cr52)) {
            return 2;
        }
        return 3;
    }
}
