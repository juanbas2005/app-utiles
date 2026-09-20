package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wa0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug4 ug4 = ((BottomSheetBehavior) obj).i;
                if (ug4 != null) {
                    sg4 sg4 = ug4.x;
                    if (sg4.j != floatValue) {
                        sg4.j = floatValue;
                        ug4.B = true;
                        ug4.C = true;
                        ug4.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                wb2 wb2 = (wb2) obj;
                wb2.c.setAlpha(floatValue2);
                wb2.d.setAlpha(floatValue2);
                wb2.s.invalidate();
                return;
            default:
                ((TextInputLayout) obj).S0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
