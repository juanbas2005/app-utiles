package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* renamed from: n84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n84 implements View.OnTouchListener {
    public static final int N = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public final int C;
    public final int D;
    public final float[] E;
    public final float[] F;
    public final float[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final e02 M;
    public final oy w;
    public final AccelerateInterpolator x = new AccelerateInterpolator();
    public final e02 y;
    public ge z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, oy] */
    public n84(e02 e02) {
        ? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1;
        obj.f = 0;
        this.w = obj;
        float[] fArr = {0.0f, 0.0f};
        this.A = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.B = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.E = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.F = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.G = fArr5;
        this.y = e02;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.C = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.D = N;
        obj.a = 500;
        obj.b = 500;
        this.M = e02;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        int i2;
        float f5;
        float b = b(this.A[i] * f2, 0.0f, this.B[i]);
        float c = c(f2 - f, b) - c(f, b);
        int i3 = (c > 0.0f ? 1 : (c == 0.0f ? 0 : -1));
        AccelerateInterpolator accelerateInterpolator = this.x;
        if (i3 < 0) {
            f5 = -accelerateInterpolator.getInterpolation(-c);
        } else if (c > 0.0f) {
            f5 = accelerateInterpolator.getInterpolation(c);
        } else {
            f4 = 0.0f;
            i2 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i2 != 0) {
                return 0.0f;
            }
            float f6 = this.E[i];
            float f7 = this.F[i];
            float f8 = this.G[i];
            float f9 = f6 * f3;
            if (i2 > 0) {
                return b(f4 * f9, f7, f8);
            }
            return -b((-f4) * f9, f7, f8);
        }
        f4 = b(f5, -1.0f, 1.0f);
        i2 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i2 != 0) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.C;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (!this.K || i != 1) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.I) {
            this.K = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        oy oyVar = this.w;
        int i2 = (int) (currentAnimationTimeMillis - oyVar.e);
        int i3 = oyVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        oyVar.i = i;
        oyVar.h = oyVar.a(currentAnimationTimeMillis);
        oyVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r7 = r7.M;
     */
    public final boolean e() {
        e02 e02;
        int count;
        oy oyVar = this.w;
        float f = oyVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(oyVar.c);
        if (!(abs == 0 || (count = e02.getCount()) == 0)) {
            int childCount = e02.getChildCount();
            int firstVisiblePosition = e02.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? abs >= 0 || (firstVisiblePosition <= 0 && e02.getChildAt(0).getTop() >= 0) : i >= count && e02.getChildAt(childCount - 1).getBottom() <= e02.getHeight()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L_0x007c;
     */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.J = true;
            this.H = false;
            e02 e02 = this.y;
            float a = a(motionEvent.getX(), (float) view.getWidth(), (float) e02.getWidth(), 0);
            float a2 = a(motionEvent.getY(), (float) view.getHeight(), (float) e02.getHeight(), 1);
            oy oyVar = this.w;
            oyVar.c = a;
            oyVar.d = a2;
            if (!this.K && e()) {
                if (this.z == null) {
                    this.z = new ge(2, (Object) this);
                }
                this.K = true;
                this.I = true;
                if (this.H || (i = this.D) <= 0) {
                    this.z.run();
                } else {
                    ge geVar = this.z;
                    long j = (long) i;
                    WeakHashMap weakHashMap = e58.a;
                    e02.postOnAnimationDelayed(geVar, j);
                }
                this.H = true;
            }
        }
        return false;
    }
}
