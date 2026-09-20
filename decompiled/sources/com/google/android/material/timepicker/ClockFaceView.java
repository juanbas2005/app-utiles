package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
class ClockFaceView extends tv5 implements gs0 {
    public final ClockHandView R;
    public final Rect S = new Rect();
    public final RectF T = new RectF();
    public final Rect U = new Rect();
    public final SparseArray V;
    public final c W;
    public final int[] a0;
    public final float[] b0;
    public final int c0;
    public final int d0;
    public final int e0;
    public final int f0;
    public final String[] g0;
    public float h0;
    public final ColorStateList i0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.V = sparseArray;
        this.b0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.d, R.attr.materialClockStyle, 2131887315);
        Resources resources = getResources();
        ColorStateList L = t49.L(context, obtainStyledAttributes, 1);
        this.i0 = L;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.R = clockHandView;
        this.c0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = L.getColorForState(new int[]{16842913}, L.getDefaultColor());
        this.a0 = new int[]{colorForState, colorForState, L.getDefaultColor()};
        clockHandView.y.add(this);
        int defaultColor = ag8.r(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList L2 = t49.L(context, obtainStyledAttributes, 0);
        setBackgroundColor(L2 != null ? L2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.W = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.g0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.g0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.g0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.g0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                e58.m(textView, this.W);
                textView.setTextColor(this.i0);
            }
        }
        ClockHandView clockHandView2 = this.R;
        if (clockHandView2.x && !z) {
            clockHandView2.I = 1;
        }
        clockHandView2.x = z;
        clockHandView2.invalidate();
        this.d0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.e0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void m() {
        w21 w21 = new w21();
        w21.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = this.P;
            if (intValue == 2) {
                i3 = Math.round(((float) i3) * 0.66f);
            }
            float f = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                Integer valueOf = Integer.valueOf(id2);
                HashMap hashMap2 = w21.c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id2), new r21());
                }
                s21 s21 = ((r21) hashMap2.get(Integer.valueOf(id2))).d;
                s21.y = R.id.circle_center;
                s21.z = i3;
                s21.A = f;
                f += 360.0f / ((float) list.size());
            }
        }
        w21.a(this);
        setConstraintSet((w21) null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.V;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z;
        RadialGradient radialGradient;
        RectF rectF2 = this.R.C;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.V;
            int size = sparseArray.size();
            rect = this.S;
            rectF = this.T;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.U;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.a0, this.b0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.g0.length, false, 1));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f0) / Math.max(Math.max(((float) this.d0) / ((float) displayMetrics.heightPixels), ((float) this.e0) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
