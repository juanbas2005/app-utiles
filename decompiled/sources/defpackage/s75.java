package defpackage;

/* renamed from: s75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s75 implements nu5 {
    public static final ku4 c = new ku4(4);
    public static final aw0 d = new aw0(8);
    public ko1 a;
    public volatile nu5 b;

    public s75(ku4 ku4, nu5 nu5) {
        this.a = ku4;
        this.b = nu5;
    }

    public final void a(ko1 ko1) {
        nu5 nu5;
        nu5 nu52;
        nu5 nu53 = this.b;
        aw0 aw0 = d;
        if (nu53 != aw0) {
            ko1.e(nu53);
            return;
        }
        synchronized (this) {
            nu5 = this.b;
            if (nu5 != aw0) {
                nu52 = nu5;
            } else {
                this.a = new yv0(11, (Object) this.a, (Object) ko1);
                nu52 = null;
            }
        }
        if (nu52 != null) {
            ko1.e(nu5);
        }
    }

    public final Object get() {
        return this.b.get();
    }
}
