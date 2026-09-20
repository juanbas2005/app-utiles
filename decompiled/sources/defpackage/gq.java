package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: gq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class gq extends TextView {
    public boolean A;
    public ji8 B;
    public Future C;
    public final ao w;
    public final cq x;
    public final qc3 y;
    public bp z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vi7.a(context);
        this.A = false;
        this.B = null;
        eh7.a(this, getContext());
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, i);
        cq cqVar = new cq(this);
        this.x = cqVar;
        cqVar.f(attributeSet, i);
        cqVar.b();
        qc3 qc3 = new qc3(15, false);
        qc3.x = this;
        this.y = qc3;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private bp getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new bp(this);
        }
        return this.z;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.a();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (o68.c) {
            return super.getAutoSizeMaxTextSize();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            return Math.round(cqVar.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (o68.c) {
            return super.getAutoSizeMinTextSize();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            return Math.round(cqVar.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (o68.c) {
            return super.getAutoSizeStepGranularity();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            return Math.round(cqVar.i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (o68.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            return cqVar.i.f;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!o68.c) {
            cq cqVar = this.x;
            if (cqVar != null) {
                return cqVar.i.a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return za5.D(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public dq getSuperCaller() {
        if (this.B == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.B = new fq(this);
            } else if (i >= 28) {
                this.B = new eq(this);
            } else if (i >= 26) {
                this.B = new ji8(5, (Object) this);
            }
        }
        return this.B;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.x.e();
    }

    public CharSequence getText() {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    za5.r(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        qc3 qc3;
        if (Build.VERSION.SDK_INT >= 28 || (qc3 = this.y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) qc3.y;
        if (textClassifier == null) {
            return wp.a((TextView) qc3.x);
        }
        return textClassifier;
    }

    public tm5 getTextMetricsParamsCompat() {
        return za5.r(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.x.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            h49.P(editorInfo, getText());
        }
        t49.T(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        cq cqVar = this.x;
        if (cqVar != null && !o68.c) {
            cqVar.i.a();
        }
    }

    public void onMeasure(int i, int i2) {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    za5.r(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        cq cqVar = this.x;
        if (cqVar != null) {
            lq lqVar = cqVar.i;
            if (!o68.c && lqVar.f()) {
                lqVar.a();
            }
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (o68.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.h(i, i2, i3, i4);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (o68.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.i(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o68.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.j(i);
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

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = rc9.N(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = rc9.N(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = rc9.N(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = rc9.N(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = rc9.N(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = rc9.N(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = rc9.N(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = rc9.N(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(za5.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((dh4) getEmojiTextViewHelper().b.x).p(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i);
        } else {
            za5.z(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            za5.A(this, i);
        }
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().l(i, f);
        } else if (i2 >= 34) {
            l4.m(this, i, f);
        } else {
            za5.B(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(um5 um5) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        za5.r(this);
        throw null;
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        cq cqVar = this.x;
        cqVar.k(colorStateList);
        cqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        cq cqVar = this.x;
        cqVar.l(mode);
        cqVar.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        qc3 qc3;
        if (Build.VERSION.SDK_INT >= 28 || (qc3 = this.y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            qc3.y = textClassifier;
        }
    }

    public void setTextFuture(Future<um5> future) {
        this.C = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(tm5 tm5) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = tm5.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(tm5.a);
        setBreakStrategy(tm5.c);
        setHyphenationFrequency(tm5.d);
    }

    public final void setTextSize(int i, float f) {
        boolean z2 = o68.c;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            lq lqVar = cqVar.i;
            if (!z2 && !lqVar.f()) {
                lqVar.g(i, f);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.A) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                a35 a35 = mq7.a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    h.q("Context cannot be null");
                    return;
                }
            }
            this.A = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A = false;
            }
        }
    }

    public void setLineHeight(int i) {
        za5.B(this, i);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public gq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
