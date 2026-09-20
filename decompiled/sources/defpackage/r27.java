package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import cu.lestebang.utiletecsa.R;

/* renamed from: r27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r27 extends LinearLayout {
    public ColorStateList A;
    public PorterDuff.Mode B;
    public int C;
    public ImageView.ScaleType D;
    public View.OnLongClickListener E;
    public boolean F;
    public final TextInputLayout w;
    public final gq x;
    public CharSequence y;
    public final CheckableImageButton z;

    public r27(TextInputLayout textInputLayout, cf4 cf4) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.z = checkableImageButton;
        CharSequence charSequence = null;
        gq gqVar = new gq(getContext(), (AttributeSet) null);
        this.x = gqVar;
        if (t49.R(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        t49.a0(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        t49.a0(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) cf4.y;
        if (typedArray.hasValue(70)) {
            this.A = t49.K(getContext(), cf4, 70);
        }
        if (typedArray.hasValue(71)) {
            this.B = ya5.n(typedArray.getInt(71, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(67)) {
            b(cf4.i(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.C) {
                this.C = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType A2 = t49.A(typedArray.getInt(69, -1));
                this.D = A2;
                checkableImageButton.setScaleType(A2);
            }
            gqVar.setVisibility(8);
            gqVar.setId(R.id.textinput_prefix_text);
            gqVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            gqVar.setAccessibilityLiveRegion(1);
            gqVar.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                gqVar.setTextColor(cf4.g(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.y = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            gqVar.setText(text2);
            e();
            addView(checkableImageButton);
            addView(gqVar);
            return;
        }
        h.q("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.z;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.x.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.A;
            PorterDuff.Mode mode = this.B;
            TextInputLayout textInputLayout = this.w;
            t49.p(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            t49.X(textInputLayout, checkableImageButton, this.A);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        t49.a0(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        t49.a0(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z2) {
        boolean z3;
        CheckableImageButton checkableImageButton = this.z;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z2) {
            if (!z2) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int i;
        EditText editText = this.w.A;
        if (editText != null) {
            if (this.z.getVisibility() == 0) {
                i = 0;
            } else {
                i = editText.getPaddingStart();
            }
            this.x.setPaddingRelative(i, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    public final void e() {
        int i;
        int i2 = 8;
        if (this.y == null || this.F) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.z.getVisibility() == 0 || i == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.x.setVisibility(i);
        this.w.s();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
