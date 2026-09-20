package defpackage;

/* renamed from: e18  reason: default package */
public final class e18 implements vr2 {
    public static final e18 x = new e18(0);
    public static final e18 y = new e18(1);
    public static final e18 z = new e18(2);
    public final /* synthetic */ int w;

    public /* synthetic */ e18(int i) {
        this.w = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (defpackage.tj3.j.containsKey(defpackage.rs1.f((defpackage.ql4) r2)) != false) goto L_0x0066;
     */
    public final Object y(Object obj) {
        boolean z2 = true;
        switch (this.w) {
            case b85.b:
                as3 as3 = (as3) obj;
                up2 up2 = g18.a;
                as3.getClass();
                return g18.s(as3);
            case 1:
                return obj.toString();
            case 2:
                return obj.toString();
            case 3:
                ((ax3) obj).getClass();
                return null;
            case 4:
                ((gq0) obj).getClass();
                return sy6.j;
            case 5:
                ri0 ri0 = (ri0) obj;
                if (ri0.u() == 1) {
                    vj1 r = ri0.r();
                    r.getClass();
                    String str = tj3.a;
                    break;
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 6:
                return ((gb4) obj).b.b();
            case 7:
                return (ri0) obj;
            case 8:
                return (ri0) obj;
            case 9:
                tt6 tt6 = (tt6) obj;
                tt6.getClass();
                String concat = "java/util/".concat("Spliterator");
                zj3 zj3 = zm5.b;
                tt6.c(concat, zj3, zj3);
                return vs7.a;
            default:
                up2 up22 = (up2) obj;
                if (up22 != null) {
                    return Boolean.valueOf(!up22.equals(m27.y));
                }
                h.q("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }

    public /* synthetic */ e18(int i, Object obj) {
        this.w = i;
    }
}
