package defpackage;

/* renamed from: ei7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface ei7 {
    void A(Integer num);

    Integer B();

    Integer C();

    void E(Integer num);

    void a(uj1 uj1) {
        Integer num;
        if (uj1 != null) {
            num = Integer.valueOf(uj1.a(9));
        } else {
            num = null;
        }
        f(num);
    }

    ub b();

    void e(Integer num);

    void f(Integer num);

    Integer h();

    void k(Integer num);

    uj1 n() {
        Integer o = o();
        if (o != null) {
            return new uj1(o.intValue(), 9);
        }
        return null;
    }

    Integer o();

    Integer q();

    void t(ub ubVar);
}
