package defpackage;

/* renamed from: h81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h81 extends c1 implements c81 {
    public static final g81 x = new g81(hz2.z, new f81(0));

    public h81() {
        super(hz2.z);
    }

    public abstract void D(e81 e81, Runnable runnable);

    public final e81 L(d81 d81) {
        d81.getClass();
        if (d81 instanceof g81) {
            g81 g81 = (g81) d81;
            d81 d812 = this.w;
            if (!(d812 == g81 || g81.x == d812) || ((c81) g81.w.y(this)) == null) {
                return this;
            }
        } else if (hz2.z != d81) {
            return this;
        }
        return x32.w;
    }

    public void V(e81 e81, Runnable runnable) {
        tv1.b(this, e81, runnable);
    }

    public final c81 a0(d81 d81) {
        c81 c81;
        d81.getClass();
        if (d81 instanceof g81) {
            g81 g81 = (g81) d81;
            d81 d812 = this.w;
            if ((d812 == g81 || g81.x == d812) && (c81 = (c81) g81.w.y(this)) != null) {
                return c81;
            }
        } else if (hz2.z == d81) {
            return this;
        }
        return null;
    }

    public boolean m0(e81 e81) {
        return !(this instanceof ns7);
    }

    public h81 n0(int i) {
        su0.g(i);
        return new f64(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + rj1.t(this);
    }
}
