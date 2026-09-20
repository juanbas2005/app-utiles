package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: ra3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ra3 {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public gq r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public gq y;
    public int z;

    public ra3(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = kl8.F(context, R.attr.motionDurationShort4, 217);
        this.b = kl8.F(context, R.attr.motionDurationMedium4, 167);
        this.c = kl8.F(context, R.attr.motionDurationShort4, 167);
        this.d = kl8.G(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, jl.d);
        LinearInterpolator linearInterpolator = jl.a;
        this.e = kl8.G(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = kl8.G(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(gq gqVar, int i2) {
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.k.setVisibility(0);
            this.k.addView(gqVar);
        } else {
            this.i.addView(gqVar, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean R = t49.R(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (R) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (R) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (R) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, gq gqVar, int i2, int i3, int i4) {
        boolean z3;
        float f2;
        long j2;
        TimeInterpolator timeInterpolator;
        if (gqVar != null && z2) {
            if (i2 == i4 || i2 == i3) {
                if (i4 == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gqVar, View.ALPHA, new float[]{f2});
                int i5 = this.c;
                if (z3) {
                    j2 = (long) this.b;
                } else {
                    j2 = (long) i5;
                }
                ofFloat.setDuration(j2);
                if (z3) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i2 == i4 && i3 != 0) {
                    ofFloat.setStartDelay((long) i5);
                }
                arrayList.add(ofFloat);
                if (i4 == i2 && i3 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gqVar, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
                    ofFloat2.setDuration((long) this.a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay((long) i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(gq gqVar, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.k) != null) {
                frameLayout.removeView(gqVar);
            } else {
                linearLayout.removeView(gqVar);
            }
            int i3 = this.j - 1;
            this.j = i3;
            LinearLayout linearLayout2 = this.i;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(gq gqVar, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled()) {
            return false;
        }
        if (this.o != this.n || gqVar == null || !TextUtils.equals(gqVar.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public final void i(int i2, int i3, boolean z2) {
        TextView e2;
        TextView e3;
        ra3 ra3 = this;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (i4 != i5) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ra3.l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ra3.d(arrayList, ra3.x, ra3.y, 2, i4, i5);
                int i6 = i3;
                ra3.d(arrayList, ra3.q, ra3.r, 1, i2, i6);
                int size = arrayList.size();
                long j2 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    Animator animator = (Animator) arrayList.get(i7);
                    j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                ofInt.setDuration(j2);
                arrayList.add(0, ofInt);
                animatorSet.playTogether(arrayList);
                pa3 pa3 = new pa3(this, i6, e(i2), i2, ra3.e(i6));
                ra3 = this;
                animatorSet.addListener(pa3);
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (e3 = ra3.e(i5)) == null)) {
                    e3.setVisibility(0);
                    e3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (e2 = e(i2)) == null)) {
                    e2.setVisibility(4);
                    if (i4 == 1) {
                        e2.setText((CharSequence) null);
                    }
                }
                ra3.n = i5;
            }
            TextInputLayout textInputLayout = ra3.h;
            textInputLayout.t();
            textInputLayout.w(z3, false);
            textInputLayout.z();
        }
    }
}
