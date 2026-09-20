package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: mq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq extends ToggleButton {
    public final ao w;
    public final cq x;
    public bp y;

    public mq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        eh7.a(this, getContext());
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, 16842827);
        cq cqVar = new cq(this);
        this.x = cqVar;
        cqVar.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private bp getEmojiTextViewHelper() {
        if (this.y == null) {
            this.y = new bp(this);
        }
        return this.y;
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

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((dh4) getEmojiTextViewHelper().b.x).p(inputFilterArr));
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
}
