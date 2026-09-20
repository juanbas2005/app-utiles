package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: dq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dq2 extends mp7 implements z45, a68, w45, e9, if6, uq2 {
    public final eq2 L;
    public final eq2 M;
    public final Handler N;
    public final rq2 O = new rq2();
    public final /* synthetic */ eq2 P;

    public dq2(eq2 eq2) {
        this.P = eq2;
        Handler handler = new Handler();
        this.L = eq2;
        this.M = eq2;
        this.N = handler;
    }

    public final v45 b() {
        return this.P.b();
    }

    public final pv0 e() {
        return this.P.E;
    }

    public final z58 g() {
        return this.P.g();
    }

    public final View g0(int i) {
        return this.P.findViewById(i);
    }

    public final kg5 h() {
        return (kg5) this.P.z.y;
    }

    public final boolean h0() {
        Window window = this.P.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public final void i(v31 v31) {
        this.P.i(v31);
    }

    public final void j(v31 v31) {
        this.P.j(v31);
    }

    public final in8 k() {
        return this.P.S;
    }

    public final void a() {
    }
}
