package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
class ClockHandView extends View {
    public static final /* synthetic */ int J = 0;
    public final float A;
    public final Paint B;
    public final RectF C;
    public final int D;
    public float E;
    public boolean F;
    public double G;
    public int H;
    public int I;
    public final ValueAnimator w;
    public boolean x;
    public final ArrayList y = new ArrayList();
    public final int z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.w = valueAnimator;
        Paint paint = new Paint();
        this.B = paint;
        this.C = new RectF();
        this.I = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.e, R.attr.materialClockStyle, 2131887315);
        kl8.F(context, R.attr.motionDurationLong2, 200);
        kl8.G(context, R.attr.motionEasingEmphasizedInterpolator, jl.b);
        this.H = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.z = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.A = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new d(this));
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final void a(float f) {
        this.w.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.E = f2;
        this.G = Math.toRadians((double) (f2 - 90.0f));
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.I;
        int i2 = this.H;
        if (i == 2) {
            i2 = Math.round(((float) i2) * 0.66f);
        }
        float f3 = (float) width;
        float f4 = (float) i2;
        float cos = (((float) Math.cos(this.G)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.G))) + ((float) height);
        float f5 = (float) this.z;
        this.C.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((gs0) it.next());
            if (Math.abs(clockFaceView.h0 - f2) > 0.001f) {
                clockFaceView.h0 = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.I;
        int i2 = this.H;
        if (i == 2) {
            i2 = Math.round(((float) i2) * 0.66f);
        }
        float f = (float) width;
        float f2 = (float) i2;
        float f3 = (float) height;
        Paint paint = this.B;
        paint.setStrokeWidth(0.0f);
        int i3 = this.z;
        canvas.drawCircle((((float) Math.cos(this.G)) * f2) + f, (f2 * ((float) Math.sin(this.G))) + f3, (float) i3, paint);
        double sin = Math.sin(this.G);
        double d = (double) ((float) (i2 - i3));
        paint.setStrokeWidth((float) this.D);
        Canvas canvas2 = canvas;
        canvas2.drawLine(f, f3, (float) (width + ((int) (Math.cos(this.G) * d))), (float) (height + ((int) (d * sin))), paint);
        canvas2.drawCircle(f, f3, this.A, paint);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (!this.w.isRunning()) {
            a(this.E);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked == 0) {
            this.F = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.F;
            if (this.x) {
                if (((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.H) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics())) {
                    i = 2;
                } else {
                    i = 1;
                }
                this.I = i;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z6 = this.F;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y2 - ((float) (getHeight() / 2))), (double) (x2 - ((float) (getWidth() / 2)))));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = (float) i2;
        if (this.E != f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z4) {
            if (z4 || z3) {
                a(f);
            }
            this.F = z6 | z5;
            return true;
        }
        z5 = true;
        this.F = z6 | z5;
        return true;
    }
}
