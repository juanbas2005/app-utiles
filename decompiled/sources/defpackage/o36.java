package defpackage;

/* renamed from: o36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o36 extends s93 {
    public static final Object[] E;
    public static final o36 F;
    public final transient int A;
    public final transient Object[] B;
    public final transient int C;
    public final transient int D;
    public final transient Object[] z;

    static {
        Object[] objArr = new Object[0];
        E = objArr;
        F = new o36(0, 0, 0, objArr, objArr);
    }

    public o36(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.z = objArr;
        this.A = i;
        this.B = objArr2;
        this.C = i2;
        this.D = i3;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.B;
            if (objArr.length != 0) {
                int J = rj1.J(obj.hashCode());
                while (true) {
                    int i = J & this.C;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    J = i + 1;
                }
            }
        }
        return false;
    }

    public final int f(Object[] objArr) {
        Object[] objArr2 = this.z;
        int i = this.D;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final Object[] g() {
        return this.z;
    }

    public final int hashCode() {
        return this.A;
    }

    public final int k() {
        return this.D;
    }

    public final int l() {
        return 0;
    }

    public final boolean n() {
        return false;
    }

    public final at7 o() {
        return d().listIterator(0);
    }

    public final int size() {
        return this.D;
    }

    public final q93 v() {
        return q93.p(this.D, this.z);
    }
}
