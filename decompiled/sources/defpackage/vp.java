package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import cu.lestebang.utiletecsa.R;

/* renamed from: vp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vp extends Spinner {
    public static final int[] E = {16843505};
    public final boolean A;
    public final up B;
    public int C;
    public final Rect D = new Rect();
    public final ao w;
    public final Context x;
    public final lp y;
    public SpinnerAdapter z;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r7 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    public vp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        TypedArray typedArray;
        eh7.a(this, getContext());
        int[] iArr = qv5.u;
        cf4 w2 = cf4.w(context, attributeSet, iArr, R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) w2.y;
        this.w = new ao(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.x = new d61(context, resourceId);
        } else {
            this.x = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, E, R.attr.spinnerStyle, 0);
            try {
                if (typedArray.hasValue(0)) {
                    i = typedArray.getInt(0, 0);
                }
            } catch (Exception e) {
                e = e;
                try {
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                } catch (Throwable th) {
                    th = th;
                    typedArray3 = typedArray;
                    if (typedArray3 != null) {
                    }
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
                typedArray3.recycle();
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            op opVar = new op(this);
            this.B = opVar;
            opVar.y = typedArray2.getString(2);
        } else if (i == 1) {
            sp spVar = new sp(this, this.x, attributeSet);
            cf4 w3 = cf4.w(this.x, attributeSet, iArr, R.attr.spinnerStyle);
            this.C = ((TypedArray) w3.y).getLayoutDimension(3, -2);
            spVar.k(w3.i(1));
            spVar.Y = typedArray2.getString(2);
            w3.A();
            this.B = spVar;
            this.y = new lp(this, this, spVar);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        w2.A();
        this.A = true;
        SpinnerAdapter spinnerAdapter = this.z;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.z = null;
        }
        this.w.d(attributeSet, R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.D;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        up upVar = this.B;
        if (upVar != null) {
            return upVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        up upVar = this.B;
        if (upVar != null) {
            return upVar.p();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.B != null) {
            return this.C;
        }
        return super.getDropDownWidth();
    }

    public final up getInternalPopup() {
        return this.B;
    }

    public Drawable getPopupBackground() {
        up upVar = this.B;
        if (upVar != null) {
            return upVar.h();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.x;
    }

    public CharSequence getPrompt() {
        up upVar = this.B;
        if (upVar != null) {
            return upVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        ao aoVar = this.w;
        if (aoVar != null) {
            return aoVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ao aoVar = this.w;
        if (aoVar != null) {
            return aoVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        up upVar = this.B;
        if (upVar != null && upVar.b()) {
            upVar.dismiss();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.B != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        tp tpVar = (tp) parcelable;
        super.onRestoreInstanceState(tpVar.getSuperState());
        if (tpVar.w && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new mp(0, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, tp] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        up upVar = this.B;
        if (upVar == null || !upVar.b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        baseSavedState.w = z2;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lp lpVar = this.y;
        if (lpVar == null || !lpVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        up upVar = this.B;
        if (upVar == null) {
            return super.performClick();
        }
        if (upVar.b()) {
            return true;
        }
        upVar.o(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [pp, android.widget.ListAdapter, java.lang.Object] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A) {
            this.z = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        up upVar = this.B;
        if (upVar != null) {
            Context context = this.x;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                np.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            upVar.q(obj);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.f();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        up upVar = this.B;
        if (upVar != null) {
            upVar.n(i);
            upVar.e(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        up upVar = this.B;
        if (upVar != null) {
            upVar.m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.B != null) {
            this.C = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        up upVar = this.B;
        if (upVar != null) {
            upVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(rc9.N(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        up upVar = this.B;
        if (upVar != null) {
            upVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.k(mode);
        }
    }
}
