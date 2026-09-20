package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class NavigationMenuItemView extends im2 implements sj4 {
    public static final int[] f0 = {16842912};
    public int R;
    public boolean S;
    public boolean T;
    public final boolean U = true;
    public final CheckedTextView V;
    public FrameLayout W;
    public yi4 a0;
    public ColorStateList b0;
    public boolean c0;
    public Drawable d0;
    public final qo0 e0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qo0 qo0 = new qo0(3, this);
        this.e0 = qo0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.V = checkedTextView;
        e58.m(checkedTextView, qo0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.W == null) {
                this.W = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.W.removeAllViews();
            this.W.addView(view);
        }
    }

    public final void c(yi4 yi4) {
        int i;
        StateListDrawable stateListDrawable;
        this.a0 = yi4;
        int i2 = yi4.a;
        if (i2 > 0) {
            setId(i2);
        }
        if (yi4.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(yi4.isCheckable());
        setChecked(yi4.isChecked());
        setEnabled(yi4.isEnabled());
        setTitle(yi4.e);
        setIcon(yi4.getIcon());
        setActionView(yi4.getActionView());
        setContentDescription(yi4.q);
        t35.C(this, yi4.r);
        yi4 yi42 = this.a0;
        CharSequence charSequence = yi42.e;
        CheckedTextView checkedTextView = this.V;
        if (charSequence == null && yi42.getIcon() == null && this.a0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                q64 q64 = (q64) frameLayout.getLayoutParams();
                q64.width = -1;
                this.W.setLayoutParams(q64);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.W;
        if (frameLayout2 != null) {
            q64 q642 = (q64) frameLayout2.getLayoutParams();
            q642.width = -2;
            this.W.setLayoutParams(q642);
        }
    }

    public yi4 getItemData() {
        return this.a0;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        yi4 yi4 = this.a0;
        if (yi4 != null && yi4.isCheckable() && this.a0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.T != z) {
            this.T = z;
            this.e0.h(this.V, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.V;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (!z || !this.U) {
            i = 0;
        } else {
            i = 1;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.c0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.b0);
            }
            int i = this.R;
            drawable.setBounds(0, 0, i, i);
        } else if (this.S) {
            if (this.d0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = x56.a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.d0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.R;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.d0;
        }
        this.V.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.V.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.R = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.b0 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
        yi4 yi4 = this.a0;
        if (yi4 != null) {
            setIcon(yi4.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.V.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.S = z;
    }

    public void setTextAppearance(int i) {
        this.V.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.V.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.V.setText(charSequence);
    }
}
