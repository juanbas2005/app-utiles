package defpackage;

/* renamed from: se0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface se0 extends ue0 {
    void a(Throwable th) {
        Object obj;
        f61 d = d();
        if (th != null) {
            obj = new m66(th);
        } else {
            ue0.a.getClass();
            obj = vs7.a;
        }
        d.f(obj);
    }

    void b() {
        f61 d = d();
        ue0.a.getClass();
        d.f(vs7.a);
    }

    Throwable c();

    f61 d();
}
