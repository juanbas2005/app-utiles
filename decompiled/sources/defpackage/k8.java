package defpackage;

import android.app.Application;

/* renamed from: k8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k8 implements nu2 {
    public v70 A;
    public volatile pd1 w;
    public final Object x = new Object();
    public final rv0 y;
    public final j9 z;

    public k8(rv0 rv0) {
        this.y = rv0;
        this.z = new j9(rv0);
    }

    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w;
    }

    public final pd1 b() {
        String str;
        rv0 rv0 = this.y;
        if (!(rv0.getApplication() instanceof nu2)) {
            if (Application.class.equals(rv0.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + rv0.getApplication().getClass();
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
        }
        rd1 rd1 = (rd1) ((j8) ag8.q(this.z, j8.class));
        return new pd1(rd1.a, rd1.b);
    }

    public final void c() {
        j9 j9Var = this.z;
        rv0 rv0 = j9Var.w;
        f9 f9Var = new f9(0, j9Var.x);
        z58 g = rv0.g();
        ib1 k = o85.k(rv0);
        k.getClass();
        no7 no7 = new no7(g, f9Var, k);
        gq3 b = b26.a.b(h9.class);
        String l = b.l();
        if (l != null) {
            v70 v70 = ((h9) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l))).c;
            this.A = v70;
            if (((to4) v70.y) == null) {
                to4 d = this.y.d();
                if (v70.x) {
                    v70.y = d;
                } else {
                    h.s("setExtras should only be called for an Activity that extends ComponentActivity");
                }
            }
        } else {
            h.q("Local and anonymous classes can not be ViewModels");
        }
    }
}
