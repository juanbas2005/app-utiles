package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import cu.lestebang.utiletecsa.R;

/* renamed from: fo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fo extends CheckedTextView {
    public final go w = new go(this);
    public final ao x;
    public final cq y;
    public bp z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|10|11|(1:15)|16|(1:18)|19|(1:21)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0068 */
    public fo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        vi7.a(context);
        eh7.a(this, getContext());
        cq cqVar = new cq(this);
        this.y = cqVar;
        cqVar.f(attributeSet, R.attr.checkedTextViewStyle);
        cqVar.b();
        ao aoVar = new ao(this);
        this.x = aoVar;
        aoVar.d(attributeSet, R.attr.checkedTextViewStyle);
        Context context2 = getContext();
        int[] iArr = qv5.l;
        cf4 w2 = cf4.w(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) w2.y;
        AttributeSet attributeSet2 = attributeSet;
        e58.l(this, getContext(), iArr, attributeSet2, (TypedArray) w2.y, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                setCheckMarkDrawable(rc9.N(getContext(), resourceId2));
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(rc9.N(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(w2.g(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(sz1.b(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            w2.A();
            getEmojiTextViewHelper().a(attributeSet2, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            Throwable th2 = th;
            w2.A();
            throw th2;
        }
    }

    private bp getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new bp(this);
        }
        return this.z;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.b();
        }
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.a();
        }
        go goVar = this.w;
        if (goVar != null) {
            goVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return za5.D(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ao aoVar = this.x;
        if (aoVar != null) {
            return aoVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ao aoVar = this.x;
        if (aoVar != null) {
            return aoVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        go goVar = this.w;
        if (goVar != null) {
            return goVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        go goVar = this.w;
        if (goVar != null) {
            return goVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.y.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t49.T(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.f();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.g(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        go goVar = this.w;
        if (goVar == null) {
            return;
        }
        if (goVar.e) {
            goVar.e = false;
            return;
        }
        goVar.e = true;
        goVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.y;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.k(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        go goVar = this.w;
        if (goVar != null) {
            goVar.a = colorStateList;
            goVar.c = true;
            goVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        go goVar = this.w;
        if (goVar != null) {
            goVar.b = mode;
            goVar.d = true;
            goVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        cq cqVar = this.y;
        cqVar.k(colorStateList);
        cqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        cq cqVar = this.y;
        cqVar.l(mode);
        cqVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.g(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(rc9.N(getContext(), i));
    }
}
