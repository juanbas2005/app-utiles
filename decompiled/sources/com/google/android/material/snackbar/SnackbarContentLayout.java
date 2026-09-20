package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SnackbarContentLayout extends LinearLayout {
    public TextView w;
    public Button x;
    public int y;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kl8.G(context, R.attr.motionEasingEmphasizedInterpolator, jl.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.w.getPaddingTop() == i2 && this.w.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.w;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.x;
    }

    public TextView getMessageView() {
        return this.w;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.w = (TextView) findViewById(R.id.snackbar_text);
        this.x = (Button) findViewById(R.id.snackbar_action);
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.w.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z = false;
            } else {
                z = true;
            }
            if (!z || this.y <= 0 || this.x.getMeasuredWidth() <= this.y) {
                if (!z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.y = i;
    }
}
