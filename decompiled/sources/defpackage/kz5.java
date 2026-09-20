package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: kz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kz5 implements Runnable {
    public boolean A = false;
    public boolean B = false;
    public final /* synthetic */ RecyclerView C;
    public int w;
    public int x;
    public OverScroller y;
    public Interpolator z;

    public kz5(RecyclerView recyclerView) {
        this.C = recyclerView;
        oy5 oy5 = RecyclerView.U0;
        this.z = oy5;
        this.y = new OverScroller(recyclerView.getContext(), oy5);
    }

    public final void a() {
        if (this.A) {
            this.B = true;
            return;
        }
        RecyclerView recyclerView = this.C;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = e58.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        boolean z2;
        int i4;
        RecyclerView recyclerView = this.C;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i4 = recyclerView.getWidth();
            } else {
                i4 = recyclerView.getHeight();
            }
            if (!z2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) i4)) + 1.0f) * 300.0f), 2000);
        }
        int i5 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.U0;
        }
        if (this.z != interpolator) {
            this.z = interpolator;
            this.y = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.x = 0;
        this.w = 0;
        recyclerView.setScrollState(2);
        this.y.startScroll(0, 0, i, i2, i5);
        a();
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        RecyclerView recyclerView = this.C;
        int[] iArr = recyclerView.L0;
        if (recyclerView.H == null) {
            recyclerView.removeCallbacks(this);
            this.y.abortAnimation();
            return;
        }
        this.B = false;
        this.A = true;
        recyclerView.m();
        OverScroller overScroller = this.y;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            this.w = currX;
            this.x = currY;
            int i6 = currY - this.x;
            int[] iArr2 = recyclerView.L0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            int i7 = currX - this.w;
            if (recyclerView.r(i7, i6, 1, iArr2, (int[]) null)) {
                i2 = i7 - iArr[0];
                i = i6 - iArr[1];
            } else {
                i2 = i7;
                i = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i2, i);
            }
            if (recyclerView.G != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.X(i2, i, iArr);
                i4 = iArr[0];
                i3 = iArr[1];
                i2 -= i4;
                i -= i3;
                w64 w64 = recyclerView.H.e;
                if (w64 != null && !w64.d && w64.e) {
                    int b = recyclerView.z0.b();
                    if (b == 0) {
                        w64.i();
                    } else if (w64.a >= b) {
                        w64.a = b - 1;
                        w64.g(i4, i3);
                    } else {
                        w64.g(i4, i3);
                    }
                }
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (!recyclerView.J.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.L0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i4, i3, i2, i, (int[]) null, 1, iArr3);
            int i8 = i2 - iArr[0];
            int i9 = i - iArr[1];
            if (!(i4 == 0 && i3 == 0)) {
                recyclerView.t(i4, i3);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (overScroller.isFinished() || ((z2 || i8 != 0) && (z3 || i9 != 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            w64 w642 = recyclerView.H.e;
            if ((w642 == null || !w642.d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i8 < 0) {
                        i5 = -currVelocity;
                    } else if (i8 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.v();
                        if (recyclerView.d0.isFinished()) {
                            recyclerView.d0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.w();
                        if (recyclerView.f0.isFinished()) {
                            recyclerView.f0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.e0.isFinished()) {
                            recyclerView.e0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.g0.isFinished()) {
                            recyclerView.g0.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i5 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = e58.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                tt2 tt2 = recyclerView.y0;
                int[] iArr4 = (int[]) tt2.e;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                tt2.d = 0;
            } else {
                a();
                eu2 eu2 = recyclerView.x0;
                if (eu2 != null) {
                    eu2.a(recyclerView, i4, i3);
                }
            }
        }
        w64 w643 = recyclerView.H.e;
        if (w643 != null && w643.d) {
            w643.g(0, 0);
        }
        this.A = false;
        if (this.B) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = e58.a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.c0(1);
    }
}
