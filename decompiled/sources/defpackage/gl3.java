package defpackage;

/* renamed from: gl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gl3 extends lb4 implements mw1, aa3 {
    public ll3 C;

    public final void b() {
        q().n0(this);
    }

    public el3 getParent() {
        return q();
    }

    public final boolean l() {
        return true;
    }

    public final zz4 m() {
        return null;
    }

    public final ll3 q() {
        ll3 ll3 = this.C;
        if (ll3 != null) {
            return ll3;
        }
        sg3.a0("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    public final String toString() {
        return getClass().getSimpleName() + '@' + rj1.t(this) + "[job@" + rj1.t(q()) + ']';
    }
}
