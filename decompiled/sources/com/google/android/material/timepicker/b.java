package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView w;

    public b(ClockFaceView clockFaceView) {
        this.w = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.w;
        ClockHandView clockHandView = clockFaceView.R;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.z) - clockFaceView.c0;
            if (height != clockFaceView.P) {
                clockFaceView.P = height;
                clockFaceView.m();
                clockHandView.H = clockFaceView.P;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
