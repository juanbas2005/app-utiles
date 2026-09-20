package defpackage;

/* renamed from: ka0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ka0 extends e21 {
    public final /* synthetic */ int b = 1;

    public ka0(double d) {
        super(Double.valueOf(d));
    }

    public final vw3 a(sl4 sl4) {
        switch (this.b) {
            case b85.b:
                sl4.getClass();
                fv3 g = sl4.g();
                g.getClass();
                return g.t(ro5.BOOLEAN);
            case 1:
                sl4.getClass();
                fv3 g2 = sl4.g();
                g2.getClass();
                return g2.t(ro5.DOUBLE);
            default:
                sl4.getClass();
                fv3 g3 = sl4.g();
                g3.getClass();
                return g3.t(ro5.FLOAT);
        }
    }

    public String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ka0(Object obj) {
        super(obj);
    }

    public ka0(float f) {
        super(Float.valueOf(f));
    }
}
