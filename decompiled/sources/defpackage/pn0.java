package defpackage;

/* renamed from: pn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn0 extends qn0 {
    public final Throwable a;

    public pn0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pn0)) {
            return false;
        }
        if (sg3.e(this.a, ((pn0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
