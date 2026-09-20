package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: wb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wb2 extends vy5 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final ge B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q = 0;
    public int r = 0;
    public final RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];
    public final ValueAnimator z;

    public wb2(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        this.A = 0;
        ge geVar = new ge(7, (Object) this);
        this.B = geVar;
        ub2 ub2 = new ub2(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new vb2(this));
        ofFloat.addUpdateListener(new wa0(1, this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.J;
                xy5 xy5 = recyclerView2.H;
                if (xy5 != null) {
                    xy5.c("Cannot remove item decoration during a scroll  or layout");
                }
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.s;
                recyclerView3.K.remove(this);
                if (recyclerView3.L == this) {
                    recyclerView3.L = null;
                }
                ArrayList arrayList2 = this.s.B0;
                if (arrayList2 != null) {
                    arrayList2.remove(ub2);
                }
                this.s.removeCallbacks(geVar);
            }
            this.s = recyclerView;
            recyclerView.g(this);
            this.s.K.add(this);
            this.s.h(ub2);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
            int i8 = i3 + i7;
            if (i8 >= i6 || i8 < 0) {
                return 0;
            }
            return i7;
        }
        return 0;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i2 != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            f(0);
        } else if (this.A != 0) {
            if (this.t) {
                int i3 = this.q;
                int i4 = this.e;
                int i5 = i3 - i4;
                int i6 = this.l;
                int i7 = this.k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f;
                int i10 = this.r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i10);
                WeakHashMap weakHashMap = e58.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i4, (float) i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i4), (float) (-i8));
                } else {
                    canvas.translate((float) i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i5), (float) (-i8));
                }
            }
            if (this.u) {
                int i11 = this.r;
                int i12 = this.i;
                int i13 = i11 - i12;
                int i14 = this.o;
                int i15 = this.n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.q;
                int i18 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, (float) i13);
                drawable2.draw(canvas);
                canvas.translate((float) i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i16), (float) (-i13));
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 < ((float) (this.r - this.i))) {
            return false;
        }
        int i2 = this.o;
        int i3 = this.n;
        if (f2 < ((float) (i2 - (i3 / 2))) || f2 > ((float) ((i3 / 2) + i2))) {
            return false;
        }
        return true;
    }

    public final boolean d(float f2, float f3) {
        WeakHashMap weakHashMap = e58.a;
        int layoutDirection = this.s.getLayoutDirection();
        int i2 = this.e;
        if (layoutDirection == 1) {
            if (f2 > ((float) i2)) {
                return false;
            }
        } else if (f2 < ((float) (this.q - i2))) {
            return false;
        }
        int i3 = this.l;
        int i4 = this.k / 2;
        if (f3 < ((float) (i3 - i4)) || f3 > ((float) (i4 + i3))) {
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        RecyclerView recyclerView = this.s;
        ge geVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i2 == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(geVar);
        }
        if (i2 == 0) {
            recyclerView.invalidate();
        } else {
            g();
        }
        if (this.v == 2 && i2 != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(geVar);
            recyclerView.postDelayed(geVar, 1200);
        } else if (i2 == 1) {
            recyclerView.removeCallbacks(geVar);
            recyclerView.postDelayed(geVar, 1500);
        }
        this.v = i2;
    }

    public final void g() {
        int i2 = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i2 != 0) {
            if (i2 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
