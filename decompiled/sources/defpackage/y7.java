package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: y7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y7 extends qp2 {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ View G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.G = actionMenuItemView;
    }

    public final qs6 b() {
        a8 a8Var;
        int i = this.F;
        View view = this.G;
        switch (i) {
            case b85.b:
                z7 z7Var = ((ActionMenuItemView) view).I;
                if (z7Var == null || (a8Var = ((b8) z7Var).a.P) == null) {
                    return null;
                }
                return a8Var.a();
            default:
                a8 a8Var2 = ((c8) view).z.O;
                if (a8Var2 == null) {
                    return null;
                }
                return a8Var2.a();
        }
    }

    public final boolean c() {
        qs6 b;
        int i = this.F;
        View view = this.G;
        switch (i) {
            case b85.b:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                si4 si4 = actionMenuItemView.G;
                if (si4 == null || !si4.a(actionMenuItemView.D) || (b = b()) == null || !b.b()) {
                    return false;
                }
                return true;
            default:
                ((c8) view).z.l();
                return true;
        }
    }

    public boolean d() {
        switch (this.F) {
            case 1:
                d8 d8Var = ((c8) this.G).z;
                if (d8Var.Q != null) {
                    return false;
                }
                d8Var.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y7(c8 c8Var, c8 c8Var2) {
        super(c8Var2);
        this.G = c8Var;
    }
}
