package defpackage;

/* renamed from: jn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jn0 extends gn0 {
    public final di2 z;

    public jn0(di2 di2, e81 e81, int i, vc0 vc0) {
        super(e81, i, vc0);
        this.z = di2;
    }

    public final Object a(fi2 fi2, f61 f61) {
        e81 e81;
        int i = this.x;
        p81 p81 = p81.w;
        if (i == -3) {
            e81 r = f61.r();
            Boolean bool = Boolean.FALSE;
            xw0 xw0 = new xw0(25);
            e81 e812 = this.w;
            if (!((Boolean) e812.G(xw0, bool)).booleanValue()) {
                e81 = r.X(e812);
            } else {
                e81 = su0.o(r, e812, false);
            }
            if (sg3.e(e81, r)) {
                Object i2 = i(fi2, f61);
                if (i2 == p81) {
                    return i2;
                }
            } else {
                hz2 hz2 = hz2.z;
                if (sg3.e(e81.a0(hz2), r.a0(hz2))) {
                    e81 r2 = f61.r();
                    if (!(fi2 instanceof zk6) && !(fi2 instanceof n05)) {
                        fi2 = new qc(fi2, r2);
                    }
                    Object V = ie1.V(e81, fi2, gh7.b(e81), new n0(this, (f61) null, 15), f61);
                    if (V == p81) {
                        return V;
                    }
                }
            }
            return vs7.a;
        }
        Object a = super.a(fi2, f61);
        if (a == p81) {
            return a;
        }
        return vs7.a;
    }

    public final Object e(op5 op5, f61 f61) {
        Object i = i(new zk6(op5), f61);
        if (i == p81.w) {
            return i;
        }
        return vs7.a;
    }

    public abstract Object i(fi2 fi2, f61 f61);

    public final String toString() {
        return this.z + " -> " + super.toString();
    }
}
