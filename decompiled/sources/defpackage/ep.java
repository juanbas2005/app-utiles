package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import cu.lestebang.utiletecsa.R;

/* renamed from: ep  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ep extends MultiAutoCompleteTextView {
    public static final int[] z = {16843126};
    public final ao w;
    public final cq x;
    public final qc3 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        vi7.a(context);
        eh7.a(this, getContext());
        cf4 w2 = cf4.w(getContext(), attributeSet, z, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) w2.y).hasValue(0)) {
            setDropDownBackgroundDrawable(w2.i(0));
        }
        w2.A();
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        cq cqVar = new cq(this);
        this.x = cqVar;
        cqVar.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        cqVar.b();
        qc3 qc3 = new qc3((EditText) this);
        this.y = qc3;
        qc3.E(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener B = qc3.B(keyListener);
            if (B != keyListener) {
                super.setKeyListener(B);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t49.T(editorInfo, onCreateInputConnection, this);
        return this.y.F(onCreateInputConnection, editorInfo);
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(rc9.N(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.y.L(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.y.B(keyListener));
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.g(context, i);
        }
    }
}
