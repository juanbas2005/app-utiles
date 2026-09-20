package defpackage;

/* renamed from: yi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi0 {
    public Object a;
    public bj0 b;
    public m56 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        bj0 bj0 = this.b;
        if (bj0 != null && bj0.x.j(obj)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        bj0 bj0 = this.b;
        if (bj0 != null && bj0.x.k(th)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        m56 m56;
        bj0 bj0 = this.b;
        if (bj0 != null) {
            aj0 aj0 = bj0.x;
            if (!aj0.isDone()) {
                aj0.k(new j1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (!this.d && (m56 = this.c) != null) {
            m56.j((Object) null);
        }
    }
}
