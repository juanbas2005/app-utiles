package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: bo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class bo extends Button {
    public final ao w;
    public final cq x;
    public bp y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vi7.a(context);
        eh7.a(this, getContext());
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, i);
        cq cqVar = new cq(this);
        this.x = cqVar;
        cqVar.f(attributeSet, i);
        cqVar.b();
        getEmojiTextViewHelper().a(attributeSet, i);
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        cq cqVar = this.x;
        if (cqVar != null && !o68.c) {
            cqVar.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        cq cqVar = this.x;
        if (cqVar != null) {
            lq lqVar = cqVar.i;
            if (!o68.c && lqVar.f()) {
                lqVar.a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(za5.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((dh4) getEmojiTextViewHelper().b.x).p(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.a.setAllCaps(z);
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

    public final void setTextSize(int i, float f) {
        boolean z = o68.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            lq lqVar = cqVar.i;
            if (!z && !lqVar.f()) {
                lqVar.g(i, f);
            }
        }
    }
}
