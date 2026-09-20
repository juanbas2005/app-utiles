package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import cu.lestebang.utiletecsa.R;

/* renamed from: tv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tv5 extends ConstraintLayout {
    public final y0 O = new y0(20, this);
    public int P;
    public final ug4 Q;

    public tv5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ug4 ug4 = new ug4();
        this.Q = ug4;
        q36 q36 = new q36(0.5f);
        qq6 f = ug4.x.a.f();
        f.e = q36;
        f.f = q36;
        f.g = q36;
        f.h = q36;
        ug4.setShapeAppearanceModel(f.a());
        this.Q.n(ColorStateList.valueOf(-1));
        setBackground(this.Q);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.w, R.attr.materialClockStyle, 0);
        this.P = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            y0 y0Var = this.O;
            handler.removeCallbacks(y0Var);
            handler.post(y0Var);
        }
    }

    public abstract void m();

    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            y0 y0Var = this.O;
            handler.removeCallbacks(y0Var);
            handler.post(y0Var);
        }
    }

    public final void setBackgroundColor(int i) {
        this.Q.n(ColorStateList.valueOf(i));
    }
}
