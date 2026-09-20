package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c extends k4 {
    public final /* synthetic */ ClockFaceView z;

    public c(ClockFaceView clockFaceView) {
        this.z = clockFaceView;
    }

    public final void d(View view, c5 c5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        this.w.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.z.V.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c5Var.b(w4.e);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        ClockFaceView clockFaceView = this.z;
        ClockHandView clockHandView = clockFaceView.R;
        Rect rect = clockFaceView.S;
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(rect);
        float centerX = (float) rect.centerX();
        float centerY = (float) rect.centerY();
        long j = uptimeMillis;
        clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, centerX, centerY, 0));
        clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, centerX, centerY, 0));
        return true;
    }
}
