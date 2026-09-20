package defpackage;

/* renamed from: ct2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ct2 extends ti0 implements qs2, zq3 {
    public final int C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) != 1 ? false : true);
        this.C = i;
    }

    public final eq3 O() {
        return b26.a.a(this);
    }

    public final eq3 Q() {
        return (zq3) super.Q();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ct2) {
            ct2 ct2 = (ct2) obj;
            if (!this.z.equals(ct2.z) || !this.A.equals(ct2.A) || !sg3.e(this.x, ct2.x) || !sg3.e(P(), ct2.P())) {
                return false;
            }
            return true;
        } else if (obj instanceof zq3) {
            return obj.equals(N());
        } else {
            return false;
        }
    }

    public final int g() {
        return this.C;
    }

    public final int hashCode() {
        int i;
        if (P() == null) {
            i = 0;
        } else {
            i = P().hashCode() * 31;
        }
        return this.A.hashCode() + hl6.h(i, 31, this.z);
    }

    public final boolean j() {
        return ((zq3) super.Q()).j();
    }

    public final boolean m() {
        return ((zq3) super.Q()).m();
    }

    public final boolean q() {
        return ((zq3) super.Q()).q();
    }

    public final String toString() {
        eq3 N = N();
        if (N != this) {
            return N.toString();
        }
        String str = this.z;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return f21.h("function ", str, " (Kotlin reflection is not available)");
    }

    public final boolean w() {
        return ((zq3) super.Q()).w();
    }

    public ct2(int i, Class cls, String str, String str2, int i2) {
        this(i, si0.w, cls, str, str2, i2, 0);
    }
}
