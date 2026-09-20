package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class CheckableImageButton extends cp implements Checkable {
    public static final int[] C = {16842912};
    public boolean A = true;
    public boolean B = true;
    public boolean z;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        e58.m(this, new qo0(0, this));
    }

    public final boolean isChecked() {
        return this.z;
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.z) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), C);
        }
        return super.onCreateDrawableState(i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ro0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ro0 ro0 = (ro0) parcelable;
        super.onRestoreInstanceState(ro0.w);
        setChecked(ro0.y);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ro0, android.os.Parcelable, x] */
    public final Parcelable onSaveInstanceState() {
        ? xVar = new x(super.onSaveInstanceState());
        xVar.y = this.z;
        return xVar;
    }

    public void setCheckable(boolean z2) {
        if (this.A != z2) {
            this.A = z2;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z2) {
        if (this.A && this.z != z2) {
            this.z = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.B = z2;
    }

    public void setPressed(boolean z2) {
        if (this.B) {
            super.setPressed(z2);
        }
    }

    public final void toggle() {
        setChecked(!this.z);
    }
}
