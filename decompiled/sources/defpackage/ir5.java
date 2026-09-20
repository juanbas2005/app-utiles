package defpackage;

/* renamed from: ir5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ir5 extends ti0 implements yr3 {
    public final boolean C;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ir5(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, r8);
        boolean z;
        boolean z2 = false;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.C = (i & 2) == 2 ? true : z2;
    }

    public final eq3 N() {
        if (this.C) {
            return this;
        }
        return super.N();
    }

    /* renamed from: R */
    public final yr3 Q() {
        if (!this.C) {
            return (yr3) super.Q();
        }
        kj6.n("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ir5) {
            ir5 ir5 = (ir5) obj;
            if (!P().equals(ir5.P()) || !this.z.equals(ir5.z) || !this.A.equals(ir5.A) || !sg3.e(this.x, ir5.x)) {
                return false;
            }
            return true;
        } else if (obj instanceof yr3) {
            return obj.equals(N());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return this.A.hashCode() + hl6.h(P().hashCode() * 31, 31, this.z);
    }

    public final String toString() {
        eq3 N = N();
        if (N != this) {
            return N.toString();
        }
        return f21.l(new StringBuilder("property "), this.z, " (Kotlin reflection is not available)");
    }
}
