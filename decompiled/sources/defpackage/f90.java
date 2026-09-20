package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: f90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class f90 extends r58 {
    public Executor b;
    public x91 c;
    public qc3 d;
    public qc3 e;
    public f96 f;
    public e90 g;
    public String h;
    public int i = 0;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public bp4 p;
    public bp4 q;
    public bp4 r;
    public bp4 s;
    public bp4 t;
    public boolean u = true;
    public bp4 v;
    public bp4 w;
    public bp4 x;

    public static void h(bp4 bp4, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bp4.i(obj);
        } else {
            bp4.g(obj);
        }
    }

    public final int e() {
        if (this.d != null) {
            return 33023;
        }
        return 0;
    }

    public final void f(o80 o80) {
        if (this.q == null) {
            this.q = new bp4();
        }
        h(this.q, o80);
    }

    public final void g(boolean z) {
        if (this.t == null) {
            this.t = new bp4();
        }
        h(this.t, Boolean.valueOf(z));
    }
}
