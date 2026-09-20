package defpackage;

/* renamed from: ne6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ne6 implements v36 {
    public Object[] A;
    public cf4 B;
    public final hx4 C = new hx4(15, this);
    public lf6 w;
    public re6 x;
    public String y;
    public Object z;

    public ne6(lf6 lf6, re6 re6, String str, Object obj, Object[] objArr) {
        this.w = lf6;
        this.x = re6;
        this.y = str;
        this.z = obj;
        this.A = objArr;
    }

    public final void a() {
        cf4 cf4 = this.B;
        if (cf4 != null) {
            cf4.E();
        }
    }

    public final void b() {
        cf4 cf4 = this.B;
        if (cf4 != null) {
            cf4.E();
        }
    }

    public final void c() {
        d();
    }

    public final void d() {
        String str;
        re6 re6 = this.x;
        cf4 cf4 = this.B;
        if (cf4 != null) {
            ku4.w(cf4, ") is not null", "entry(");
        } else if (re6 != null) {
            hx4 hx4 = this.C;
            Object b = hx4.b();
            if (b == null || re6.c(b)) {
                this.B = re6.a(hx4, this.y);
                return;
            }
            if (b instanceof sx6) {
                sx6 sx6 = (sx6) b;
                if (sx6.a() == d63.G || sx6.a() == g22.K || sx6.a() == pe2.L) {
                    str = "MutableState containing " + sx6.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = u55.l(b);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
