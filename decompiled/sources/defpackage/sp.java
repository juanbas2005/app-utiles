package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import cu.lestebang.utiletecsa.R;

/* renamed from: sp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sp extends h84 implements up {
    public CharSequence Y;
    public pp Z;
    public final Rect a0 = new Rect();
    public int b0;
    public final /* synthetic */ vp c0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp(vp vpVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.c0 = vpVar;
        this.K = vpVar;
        this.U = true;
        this.V.setFocusable(true);
        this.L = new qp(0, this);
    }

    public final CharSequence f() {
        return this.Y;
    }

    public final void i(CharSequence charSequence) {
        this.Y = charSequence;
    }

    public final void n(int i) {
        this.b0 = i;
    }

    public final void o(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        fp fpVar = this.V;
        boolean isShowing = fpVar.isShowing();
        s();
        fpVar.setInputMethodMode(2);
        g();
        e02 e02 = this.y;
        e02.setChoiceMode(1);
        e02.setTextDirection(i);
        e02.setTextAlignment(i2);
        vp vpVar = this.c0;
        int selectedItemPosition = vpVar.getSelectedItemPosition();
        e02 e022 = this.y;
        if (fpVar.isShowing() && e022 != null) {
            e022.setListSelectionHidden(false);
            e022.setSelection(selectedItemPosition);
            if (e022.getChoiceMode() != 0) {
                e022.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = vpVar.getViewTreeObserver()) != null) {
            mp mpVar = new mp(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(mpVar);
            fpVar.setOnDismissListener(new rp(this, mpVar));
        }
    }

    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.Z = (pp) listAdapter;
    }

    public final void s() {
        int i;
        int i2;
        fp fpVar = this.V;
        Drawable background = fpVar.getBackground();
        vp vpVar = this.c0;
        Rect rect = vpVar.D;
        if (background != null) {
            background.getPadding(rect);
            boolean z = o68.a;
            if (vpVar.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = vpVar.getPaddingLeft();
        int paddingRight = vpVar.getPaddingRight();
        int width = vpVar.getWidth();
        int i3 = vpVar.C;
        if (i3 == -2) {
            int a = vpVar.a(this.Z, fpVar.getBackground());
            int i4 = (vpVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        boolean z2 = o68.a;
        if (vpVar.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.A) - this.b0) + i;
        } else {
            i2 = paddingLeft + this.b0 + i;
        }
        this.B = i2;
    }
}
