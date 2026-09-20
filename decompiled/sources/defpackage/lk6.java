package defpackage;

/* renamed from: lk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lk6 extends wx3 implements gs2 {
    public static final lk6 A = new lk6(2, 2);
    public static final lk6 y = new lk6(2, 0);
    public static final lk6 z = new lk6(2, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk6(int i, int i2) {
        super(i);
        this.x = i2;
    }

    public final Object H(Object obj, Object obj2) {
        String str;
        ds2 ds2;
        switch (this.x) {
            case b85.b:
                h4 h4Var = (h4) obj;
                h4 h4Var2 = (h4) obj2;
                if (h4Var == null || (str = h4Var.a) == null) {
                    str = h4Var2.a;
                }
                if (h4Var == null || (ds2 = h4Var.b) == null) {
                    ds2 = h4Var2.b;
                }
                return new h4(str, ds2);
            case 1:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                fk6 fk6 = (fk6) obj2;
                Object valueOf = Float.valueOf(0.0f);
                ak6 ak6 = ((fk6) obj).d;
                nk6 nk6 = jk6.u;
                Object g = ak6.w.g(nk6);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = fk6.d.w.g(nk6);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
