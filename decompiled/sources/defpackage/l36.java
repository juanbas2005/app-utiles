package defpackage;

/* renamed from: l36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l36 extends s93 {
    public final transient m36 A;
    public final transient n36 z;

    public l36(n36 n36, m36 m36) {
        this.z = n36;
        this.A = m36;
    }

    public final boolean contains(Object obj) {
        if (this.z.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final q93 d() {
        return this.A;
    }

    public final int f(Object[] objArr) {
        return this.A.f(objArr);
    }

    public final boolean n() {
        return true;
    }

    public final at7 o() {
        return this.A.listIterator(0);
    }

    public final int size() {
        return this.z.z;
    }
}
