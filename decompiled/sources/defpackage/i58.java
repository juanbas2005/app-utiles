package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: i58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i58 {
    public static final oy5 v = new oy5(1);
    public int a;
    public final int b;
    public int c = -1;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final t75 q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public final ge u = new ge(17, (Object) this);

    public i58(Context context, CoordinatorLayout coordinatorLayout, t75 t75) {
        if (t75 != null) {
            this.t = coordinatorLayout;
            this.q = t75;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
            return;
        }
        h.q("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.t;
        if (parent == coordinatorLayout) {
            this.r = view;
            this.c = i2;
            this.q.A(view, i2);
            n(1);
            return;
        }
        rf2.q(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    public final boolean c(View view, float f2, float f3) {
        boolean z;
        boolean z2;
        if (view != null) {
            t75 t75 = this.q;
            if (t75.t(view) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (t75.u() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = this.b;
            if (z && z2) {
                if ((f3 * f3) + (f2 * f2) > ((float) (i2 * i2))) {
                    return true;
                }
            } else if (!z ? !z2 || Math.abs(f3) <= ((float) i2) : Math.abs(f2) <= ((float) i2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void d(int i2) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i3 = this.k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.e[i2] = 0.0f;
                this.f[i2] = 0.0f;
                this.g[i2] = 0.0f;
                this.h[i2] = 0;
                this.i[i2] = 0;
                this.j[i2] = 0;
                this.k = (~i4) & i3;
            }
        }
    }

    public final int e(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    public final boolean f() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = e58.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = e58.a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.C(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.u);
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public final View g(int i2, int i3) {
        CoordinatorLayout coordinatorLayout = this.t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.p;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.r;
        int i8 = (int) this.n;
        int i9 = (int) this.m;
        int abs = Math.abs(i4);
        if (abs < i8) {
            i4 = 0;
        } else if (abs > i9) {
            if (i4 > 0) {
                i4 = i9;
            } else {
                i4 = -i9;
            }
        }
        int abs2 = Math.abs(i5);
        if (abs2 < i8) {
            i5 = 0;
        } else if (abs2 > i9) {
            if (i5 > 0) {
                i5 = i9;
            } else {
                i5 = -i9;
            }
        }
        int abs3 = Math.abs(i6);
        int abs4 = Math.abs(i7);
        int abs5 = Math.abs(i4);
        int abs6 = Math.abs(i5);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i4 != 0) {
            f2 = (float) abs5;
            f3 = (float) i10;
        } else {
            f2 = (float) abs3;
            f3 = (float) i11;
        }
        float f6 = f2 / f3;
        if (i5 != 0) {
            f4 = (float) abs6;
            f5 = (float) i10;
        } else {
            f4 = (float) abs4;
            f5 = (float) i11;
        }
        float f7 = f4 / f5;
        t75 t75 = this.q;
        overScroller.startScroll(left, top, i6, i7, (int) ((((float) e(i7, i5, t75.u())) * f7) + (((float) e(i6, i4, t75.t(view))) * f6)));
        n(2);
        return true;
    }

    public final boolean i(int i2) {
        if ((this.k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g2 = g((int) x, (int) y);
            l(x, y, pointerId);
            q(g2, pointerId);
            int i4 = this.h[pointerId];
        } else if (actionMasked != 1) {
            t75 t75 = this.q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.a == 1) {
                        this.s = true;
                        t75.D(this.r, 0.0f, 0.0f);
                        this.s = false;
                        if (this.a == 1) {
                            n(0);
                        }
                    }
                    a();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    l(x2, y2, pointerId2);
                    if (this.a == 0) {
                        q(g((int) x2, (int) y2), pointerId2);
                        int i5 = this.h[pointerId2];
                        return;
                    }
                    int i6 = (int) x2;
                    int i7 = (int) y2;
                    View view = this.r;
                    if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                        q(this.r, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.a == 1 && pointerId3 == this.c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i3 >= pointerCount) {
                                i2 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i3);
                            if (pointerId4 != this.c) {
                                View g3 = g((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                View view2 = this.r;
                                if (g3 == view2 && q(view2, pointerId4)) {
                                    i2 = this.c;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (i2 == -1) {
                            k();
                        }
                    }
                    d(pointerId3);
                }
            } else if (this.a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i3 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i3);
                    if (i(pointerId5)) {
                        float x3 = motionEvent.getX(i3);
                        float y3 = motionEvent.getY(i3);
                        float f2 = x3 - this.d[pointerId5];
                        float f3 = y3 - this.e[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i8 = this.h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i9 = this.h[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i10 = this.h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i11 = this.h[pointerId5];
                        if (this.a != 1) {
                            View g4 = g((int) x3, (int) y3);
                            if (c(g4, f2, f3) && q(g4, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                m(motionEvent);
            } else if (i(this.c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f;
                int i12 = this.c;
                int i13 = (int) (x4 - fArr[i12]);
                int i14 = (int) (y4 - this.g[i12]);
                int left = this.r.getLeft() + i13;
                int top = this.r.getTop() + i14;
                int left2 = this.r.getLeft();
                int top2 = this.r.getTop();
                if (i13 != 0) {
                    left = t75.g(this.r, left);
                    WeakHashMap weakHashMap = e58.a;
                    this.r.offsetLeftAndRight(left - left2);
                }
                if (i14 != 0) {
                    top = t75.h(this.r, top);
                    WeakHashMap weakHashMap2 = e58.a;
                    this.r.offsetTopAndBottom(top - top2);
                }
                if (!(i13 == 0 && i14 == 0)) {
                    t75.C(this.r, left, top);
                }
                m(motionEvent);
            }
        } else {
            if (this.a == 1) {
                k();
            }
            a();
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.l;
        float f2 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f3 = this.n;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity > 0.0f) {
                xVelocity = f2;
            } else {
                xVelocity = -f2;
            }
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.s = true;
        this.q.D(this.r, xVelocity, f2);
        this.s = false;
        if (this.a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i2) {
        float[] fArr = this.d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.e;
        this.g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.o;
        if (i5 < left + i7) {
            i3 = 1;
        }
        if (i6 < coordinatorLayout.getTop() + i7) {
            i3 |= 4;
        }
        if (i5 > coordinatorLayout.getRight() - i7) {
            i3 |= 2;
        }
        if (i6 > coordinatorLayout.getBottom() - i7) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void n(int i2) {
        this.t.removeCallbacks(this.u);
        if (this.a != i2) {
            this.a = i2;
            this.q.B(i2);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean o(int i2, int i3) {
        if (this.s) {
            return h(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        h.s("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r12 != r11) goto L_0x00d6;
     */
    public final boolean p(MotionEvent motionEvent) {
        boolean z;
        View g2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        int actionIndex = motionEvent2.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent2);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent2.getPointerId(actionIndex);
                            float x = motionEvent2.getX(actionIndex);
                            float y = motionEvent2.getY(actionIndex);
                            l(x, y, pointerId);
                            int i2 = this.a;
                            if (i2 == 0) {
                                int i3 = this.h[pointerId];
                            } else if (i2 == 2 && (g2 = g((int) x, (int) y)) == this.r) {
                                q(g2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent2.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.d == null || this.e == null)) {
                    int pointerCount = motionEvent2.getPointerCount();
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId2 = motionEvent2.getPointerId(i4);
                        if (i(pointerId2)) {
                            float x2 = motionEvent2.getX(i4);
                            float y2 = motionEvent2.getY(i4);
                            float f2 = x2 - this.d[pointerId2];
                            float f3 = y2 - this.e[pointerId2];
                            View g3 = g((int) x2, (int) y2);
                            if (g3 == null || !c(g3, f2, f3)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                int left = g3.getLeft();
                                t75 t75 = this.q;
                                int g4 = t75.g(g3, ((int) f2) + left);
                                int top = g3.getTop();
                                int h2 = t75.h(g3, ((int) f3) + top);
                                int t2 = t75.t(g3);
                                int u2 = t75.u();
                                if (t2 != 0) {
                                    if (t2 > 0) {
                                    }
                                }
                                if (u2 != 0) {
                                    if (u2 > 0 && h2 == top) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            Math.abs(f2);
                            Math.abs(f3);
                            int i5 = this.h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i6 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f3);
                            int i7 = this.h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i8 = this.h[pointerId2];
                            if (this.a != 1) {
                                if (z && q(g3, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent2.getX();
            float y3 = motionEvent2.getY();
            int pointerId3 = motionEvent2.getPointerId(0);
            l(x3, y3, pointerId3);
            View g5 = g((int) x3, (int) y3);
            if (g5 == this.r && this.a == 2) {
                q(g5, pointerId3);
            }
            int i9 = this.h[pointerId3];
        }
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final boolean q(View view, int i2) {
        if (view == this.r && this.c == i2) {
            return true;
        }
        if (view == null || !this.q.K(view, i2)) {
            return false;
        }
        this.c = i2;
        b(view, i2);
        return true;
    }
}
