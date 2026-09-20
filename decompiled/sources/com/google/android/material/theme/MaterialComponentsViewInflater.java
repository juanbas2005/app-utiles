package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MaterialComponentsViewInflater extends oq {
    public final zn a(Context context, AttributeSet attributeSet) {
        return new zf4(context, attributeSet);
    }

    public final bo b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final eo c(Context context, AttributeSet attributeSet) {
        return new ng4(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [android.widget.CompoundButton, gp, android.view.View, qg4] */
    public final gp d(Context context, AttributeSet attributeSet) {
        ? gpVar = new gp(rg3.F(context, attributeSet, R.attr.radioButtonStyle, 2131887248), attributeSet);
        Context context2 = gpVar.getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F = gw8.F(context2, attributeSet2, ov5.q, R.attr.radioButtonStyle, 2131887248, new int[0]);
        if (F.hasValue(0)) {
            gpVar.setButtonTintList(t49.L(context2, F, 0));
        }
        gpVar.B = F.getBoolean(1, false);
        F.recycle();
        return gpVar;
    }

    public final gq e(Context context, AttributeSet attributeSet) {
        gq gqVar = new gq(rg3.F(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = gqVar.getContext();
        if (gw8.J(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = ov5.u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g = yg4.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ov5.t);
                    int g2 = yg4.g(gqVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        gqVar.setLineHeight(g2);
                    }
                }
            }
        }
        return gqVar;
    }
}
