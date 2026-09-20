package defpackage;

import android.content.Context;
import android.view.View;
import cu.lestebang.utiletecsa.R;

/* renamed from: a8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a8 extends ij4 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ d8 m;

    /* JADX WARNING: Illegal instructions before constructor call */
    public a8(d8 d8Var, Context context, i67 i67, View view) {
        super(context, r3, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = d8Var;
        i67 i672 = i67;
        if ((i672.A.x & 32) != 32) {
            View view2 = d8Var.E;
            this.e = view2 == null ? (View) d8Var.D : view2;
        }
        wv2 wv2 = d8Var.S;
        this.h = wv2;
        gj4 gj4 = this.i;
        if (gj4 != null) {
            gj4.f(wv2);
        }
    }

    public final void c() {
        int i = this.l;
        d8 d8Var = this.m;
        switch (i) {
            case b85.b /*0*/:
                d8Var.P = null;
                super.c();
                return;
            default:
                ti4 ti4 = d8Var.y;
                if (ti4 != null) {
                    ti4.c(true);
                }
                d8Var.O = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a8(d8 d8Var, Context context, ti4 ti4, View view) {
        super(context, ti4, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = d8Var;
        this.f = 8388613;
        wv2 wv2 = d8Var.S;
        this.h = wv2;
        gj4 gj4 = this.i;
        if (gj4 != null) {
            gj4.f(wv2);
        }
    }
}
