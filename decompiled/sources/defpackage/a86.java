package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* renamed from: a86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a86 extends View {
    public static final int[] B = {16842919, 16842910};
    public static final int[] C = new int[0];
    public zh A;
    public ht7 w;
    public Boolean x;
    public Long y;
    public y0 z;

    private final void setRippleState(boolean z2) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        y0 y0Var = this.z;
        if (y0Var != null) {
            removeCallbacks(y0Var);
            y0Var.run();
        }
        Long l = this.y;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (z2 || j2 >= 5) {
            if (z2) {
                iArr = B;
            } else {
                iArr = C;
            }
            ht7 ht7 = this.w;
            if (ht7 != null) {
                ht7.setState(iArr);
            }
        } else {
            y0 y0Var2 = new y0(21, this);
            this.z = y0Var2;
            postDelayed(y0Var2, 50);
        }
        this.y = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$1(a86 a86) {
        ht7 ht7 = a86.w;
        if (ht7 != null) {
            ht7.setState(C);
        }
        a86.z = null;
    }

    public final void b(eo5 eo5, boolean z2, long j, int i, long j2, float f, zh zhVar) {
        if (this.w == null || !Boolean.valueOf(z2).equals(this.x)) {
            ht7 ht7 = new ht7(z2);
            setBackground(ht7);
            this.w = ht7;
            this.x = Boolean.valueOf(z2);
        }
        ht7 ht72 = this.w;
        ht72.getClass();
        this.A = zhVar;
        long j3 = j2;
        long j4 = j;
        e(j4, i, j3, f);
        if (z2) {
            ht72.setHotspot(Float.intBitsToFloat((int) (eo5.a >> 32)), Float.intBitsToFloat((int) (eo5.a & 4294967295L)));
        } else {
            ht72.setHotspot((float) ht72.getBounds().centerX(), (float) ht72.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.A = null;
        y0 y0Var = this.z;
        if (y0Var != null) {
            removeCallbacks(y0Var);
            y0 y0Var2 = this.z;
            y0Var2.getClass();
            y0Var2.run();
        } else {
            ht7 ht7 = this.w;
            if (ht7 != null) {
                ht7.setState(C);
            }
        }
        ht7 ht72 = this.w;
        if (ht72 != null) {
            ht72.setVisible(false, false);
            unscheduleDrawable(ht72);
        }
    }

    public final void d() {
        setRippleState(false);
    }

    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j, int i, long j2, float f) {
        boolean z2;
        ht7 ht7 = this.w;
        if (ht7 != null) {
            if (ht7.getRadius() != i) {
                ht7.setRadius(i);
            }
            if (Build.VERSION.SDK_INT < 28) {
                f *= 2.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            long b = jt0.b(f, j2);
            jt0 jt0 = ht7.x;
            if (jt0 == null) {
                z2 = false;
            } else {
                z2 = jt0.c(jt0.a, b);
            }
            if (!z2) {
                ht7.x = new jt0(b);
                ht7.setColor(ColorStateList.valueOf(uq3.M(b)));
            }
            Rect rect = new Rect(0, 0, dh4.C(Float.intBitsToFloat((int) (j >> 32))), dh4.C(Float.intBitsToFloat((int) (j & 4294967295L))));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            ht7.setBounds(rect);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        zh zhVar = this.A;
        if (zhVar != null) {
            zhVar.b();
        }
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void refreshDrawableState() {
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
