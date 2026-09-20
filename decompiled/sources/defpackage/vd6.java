package defpackage;

/* renamed from: vd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vd6 extends h61 implements fi2 {
    public final e81 A;
    public final int B;
    public e81 C;
    public f61 D;
    public final fi2 z;

    public vd6(fi2 fi2, e81 e81) {
        super(zu0.y, x32.w);
        this.z = fi2;
        this.A = e81;
        this.B = ((Number) e81.G(new ud6(0), 0)).intValue();
    }

    public final q81 e() {
        f61 f61 = this.D;
        if (f61 instanceof q81) {
            return (q81) f61;
        }
        return null;
    }

    public final Object k(Object obj, f61 f61) {
        try {
            Object v = v(f61, obj);
            if (v == p81.w) {
                return v;
            }
            return vs7.a;
        } catch (Throwable th) {
            this.C = new kx1(f61.r(), th);
            throw th;
        }
    }

    public final StackTraceElement p() {
        return null;
    }

    public final e81 r() {
        e81 e81 = this.C;
        if (e81 == null) {
            return x32.w;
        }
        return e81;
    }

    public final Object s(Object obj) {
        Throwable a = o66.a(obj);
        if (a != null) {
            this.C = new kx1(r(), a);
        }
        f61 f61 = this.D;
        if (f61 != null) {
            f61.f(obj);
        }
        return p81.w;
    }

    public final Object v(f61 f61, Object obj) {
        e81 r = f61.r();
        r16.x(r);
        e81 e81 = this.C;
        if (e81 != r) {
            if (e81 instanceof kx1) {
                throw new IllegalStateException(e57.f0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((kx1) e81).x + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            } else if (((Number) r.G(new yg(29, this), 0)).intValue() == this.B) {
                this.C = r;
            } else {
                kj6.m("Flow invariant is violated:\n\t\tFlow was collected in ", this.A, ",\n\t\tbut emission happened in ", r, ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                return null;
            }
        }
        this.D = f61;
        hs2 hs2 = xd6.a;
        fi2 fi2 = this.z;
        fi2.getClass();
        Object u = hs2.u(fi2, obj, this);
        if (!sg3.e(u, p81.w)) {
            this.D = null;
        }
        return u;
    }
}
