package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import cu.lestebang.utiletecsa.R;

/* renamed from: jr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jr0 extends q42 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final fr0 j = new fr0(0, this);
    public final gr0 k = new gr0(this, 0);
    public AnimatorSet l;
    public ValueAnimator m;

    public jr0(p42 p42) {
        super(p42);
        this.e = kl8.F(p42.getContext(), R.attr.motionDurationShort3, 100);
        this.f = kl8.F(p42.getContext(), R.attr.motionDurationShort3, 150);
        this.g = kl8.G(p42.getContext(), R.attr.motionEasingLinearInterpolator, jl.a);
        this.h = kl8.G(p42.getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.d);
    }

    public final void a() {
        if (this.b.L == null) {
            s(t());
        }
    }

    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final View.OnClickListener f() {
        return this.j;
    }

    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    public final void o(boolean z) {
        if (this.b.L != null) {
            s(z);
        }
    }

    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new hr0(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new hr0(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.l.addListener(new ir0(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new hr0(this, 0));
        this.m = ofFloat3;
        ofFloat3.addListener(new ir0(this, 1));
    }

    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new y0(9, this));
        }
    }

    public final void s(boolean z) {
        boolean z2;
        if (this.b.d() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        if ((editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0) {
            return true;
        }
        return false;
    }
}
