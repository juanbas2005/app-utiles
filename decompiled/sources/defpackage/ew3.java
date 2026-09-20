package defpackage;

/* renamed from: ew3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ew3 extends t16 {
    public final String A;
    public final nz3 B;
    public final sv3 w;
    public final yu3 x;
    public final int y;
    public final qr3 z;

    public ew3(sv3 sv3, yu3 yu3, int i, qr3 qr3, vp7 vp7) {
        sv3.getClass();
        yu3.getClass();
        vp7.getClass();
        this.w = sv3;
        this.x = yu3;
        this.y = i;
        this.z = qr3;
        String str = yu3.b;
        this.A = k57.u0(str, "<", false) ? null : str;
        this.B = rg3.y(i44.w, new p3(this, false, vp7, 18));
    }

    public final boolean C() {
        sv3 sv3 = this.w;
        if ((sv3 instanceof qw3) || (sv3.B() instanceof pr3) || r16.a0(sv3)) {
            yr3[] yr3Arr = su.a;
            yu3 yu3 = this.x;
            yu3.getClass();
            return su.A.C(su.a[54], yu3);
        }
        StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
        sb.append(sv3.B());
        rf2.n(sb, sv3.getName(), this.A);
        return false;
    }

    public final boolean D() {
        if (this.x.d != null) {
            return true;
        }
        return false;
    }

    public final p16 b() {
        return this.w;
    }

    public final boolean g() {
        yr3[] yr3Arr = su.a;
        yu3 yu3 = this.x;
        yu3.getClass();
        return su.A.C(su.a[54], yu3);
    }

    public final String getName() {
        return this.A;
    }

    public final int s() {
        return this.y;
    }

    public final qr3 u() {
        return this.z;
    }

    public final as3 y() {
        return (as3) this.B.getValue();
    }
}
