package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ActionMenuItemView extends gq implements sj4, View.OnClickListener, e8 {
    public yi4 D;
    public CharSequence E;
    public Drawable F;
    public si4 G;
    public y7 H;
    public z7 I;
    public boolean J = g();
    public boolean K;
    public final int L;
    public int M;
    public final int N;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.c, 0, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.N = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.M = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean b() {
        if (TextUtils.isEmpty(getText()) || this.D.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final void c(yi4 yi4) {
        int i;
        this.D = yi4;
        setIcon(yi4.getIcon());
        setTitle(yi4.getTitleCondensed());
        setId(yi4.a);
        if (yi4.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(yi4.isEnabled());
        if (yi4.hasSubMenu() && this.H == null) {
            this.H = new y7(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480) {
            return true;
        }
        if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public yi4 getItemData() {
        return this.D;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.E);
        if (this.F != null && ((this.D.y & 4) != 4 || (!this.J && !this.K))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.E;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.D.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.D.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.D.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.D.e;
            }
            t35.C(this, charSequence3);
            return;
        }
        t35.C(this, charSequence5);
    }

    public final void onClick(View view) {
        si4 si4 = this.G;
        if (si4 != null) {
            si4.a(this.D);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.J = g();
        h();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.M) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.L;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (isEmpty && this.F != null) {
            super.setPadding((getMeasuredWidth() - this.F.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y7 y7Var;
        if (!this.D.hasSubMenu() || (y7Var = this.H) == null || !y7Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.K != z) {
            this.K = z;
            yi4 yi4 = this.D;
            if (yi4 != null) {
                ti4 ti4 = yi4.n;
                ti4.k = true;
                ti4.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.N;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(si4 si4) {
        this.G = si4;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.M = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(z7 z7Var) {
        this.I = z7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
