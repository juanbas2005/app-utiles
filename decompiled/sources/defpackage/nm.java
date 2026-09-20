package defpackage;

/* renamed from: nm  reason: default package */
public final class nm implements vr2 {
    public final /* synthetic */ int w;
    public final fv3 x;

    public /* synthetic */ nm(fv3 fv3, int i) {
        this.w = i;
        this.x = fv3;
    }

    public final Object y(Object obj) {
        int i = this.w;
        fv3 fv3 = this.x;
        switch (i) {
            case b85.b:
                sl4 sl4 = (sl4) obj;
                sl4.getClass();
                return sl4.g().h(fv3.v());
            default:
                uq4 uq4 = (uq4) obj;
                tl4 l = fv3.l();
                up2 up2 = n27.k;
                y34 y34 = l.k0(up2).C;
                if (y34 != null) {
                    vq0 e = y34.e(uq4, oz4.w);
                    if (e == null) {
                        rf2.v(up2.a(uq4), " is not found", "Built-in class ");
                        return null;
                    } else if (e instanceof ql4) {
                        return (ql4) e;
                    } else {
                        throw new AssertionError("Must be a class descriptor " + uq4 + ", but was " + e);
                    }
                } else {
                    fv3.a(11);
                    throw null;
                }
        }
    }
}
