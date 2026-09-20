package defpackage;

/* renamed from: t52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t52 extends ik5 {
    public final ql6 l = ql6.l;
    public final z97 m;

    public t52(String str, int i) {
        super(str, (av2) null, i);
        this.m = new z97(new s52(str, i, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ll6)) {
            return false;
        }
        ll6 ll6 = (ll6) obj;
        if (ll6.u() == ql6.l && this.a.equals(ll6.a()) && sg3.e(uq3.k(this), uq3.k(ll6))) {
            return true;
        }
        return false;
    }

    public final ll6 h(int i) {
        return ((ll6[]) this.m.getValue())[i];
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        e2 e2Var = new e2(this);
        int i2 = 1;
        while (e2Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) e2Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    public final String toString() {
        return dt0.E0(new ss(3, this), ", ", this.a.concat("("), ")", (vr2) null, 56);
    }

    public final n85 u() {
        return this.l;
    }
}
