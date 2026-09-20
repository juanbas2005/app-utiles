package defpackage;

/* renamed from: j9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j9 implements nu2 {
    public final rv0 w;
    public final rv0 x;
    public volatile rd1 y;
    public final Object z = new Object();

    public j9(rv0 rv0) {
        this.w = rv0;
        this.x = rv0;
    }

    public final Object a() {
        if (this.y == null) {
            synchronized (this.z) {
                try {
                    if (this.y == null) {
                        rv0 rv0 = this.w;
                        f9 f9Var = new f9(0, this.x);
                        z58 g = rv0.g();
                        ib1 k = o85.k(rv0);
                        k.getClass();
                        no7 no7 = new no7(g, f9Var, k);
                        gq3 b = b26.a.b(h9.class);
                        String l = b.l();
                        if (l != null) {
                            this.y = ((h9) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l))).b;
                        } else {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.y;
    }
}
