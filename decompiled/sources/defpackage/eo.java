package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: eo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class eo extends CheckBox implements aj7 {
    public final go w;
    public final ao x;
    public final cq y;
    public bp z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vi7.a(context);
        eh7.a(this, getContext());
        go goVar = new go(this);
        this.w = goVar;
        goVar.c(attributeSet, i);
        ao aoVar = new ao(this);
        this.x = aoVar;
        aoVar.d(attributeSet, i);
        cq cqVar = new cq(this);
        this.y = cqVar;
        cqVar.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private bp getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new bp(this);
        }
        return this.z;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        ao aoVar = this.x;
        if (aoVar != null) {
            aoVar.a();
        }
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.b();
        }
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

    public ColorStateList getSupportButtonTintList() {
        go goVar = this.w;
        if (goVar != null) {
            return goVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        go goVar = this.w;
        if (goVar == null) {
            return;
        }
        if (goVar.e) {
            goVar.e = false;
            return;
        }
        goVar.e = true;
        goVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.y;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((dh4) getEmojiTextViewHelper().b.x).p(inputFilterArr));
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        go goVar = this.w;
        if (goVar != null) {
            goVar.a = colorStateList;
            goVar.c = true;
            goVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        go goVar = this.w;
        if (goVar != null) {
            goVar.b = mode;
            goVar.d = true;
            goVar.a();
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

    public void setButtonDrawable(int i) {
        setButtonDrawable(rc9.N(getContext(), i));
    }
}
