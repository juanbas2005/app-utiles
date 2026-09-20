package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: qp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qp2 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public pp2 A;
    public pp2 B;
    public boolean C;
    public int D;
    public final int[] E = new int[2];
    public final float w;
    public final int x;
    public final int y;
    public final View z;

    public qp2(View view) {
        this.z = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.w = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.x = tapTimeout;
        this.y = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        pp2 pp2 = this.B;
        View view = this.z;
        if (pp2 != null) {
            view.removeCallbacks(pp2);
        }
        pp2 pp22 = this.A;
        if (pp22 != null) {
            view.removeCallbacks(pp22);
        }
    }

    public abstract qs6 b();

    public abstract boolean c();

    public boolean d() {
        qs6 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r14 != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r4 != 3) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        e02 j;
        boolean z3;
        boolean z4 = this.C;
        View view2 = this.z;
        if (z4) {
            qs6 b = b();
            if (b != null && b.b() && (j = b.j()) != null && j.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.E;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                j.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
                boolean b2 = j.b(obtainNoHistory, this.D);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (b2) {
                }
            }
            if (d()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.D);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f = this.w;
                                float f2 = -f;
                                if (x2 < f2 || y2 < f2 || x2 >= ((float) (view2.getRight() - view2.getLeft())) + f || y2 >= ((float) (view2.getBottom() - view2.getTop())) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.D = motionEvent.getPointerId(0);
                    if (this.A == null) {
                        this.A = new pp2(this, 0);
                    }
                    view2.postDelayed(this.A, (long) this.x);
                    if (this.B == null) {
                        this.B = new pp2(this, 1);
                    }
                    view2.postDelayed(this.B, (long) this.y);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.C = z2;
        if (z2 || z4) {
            return true;
        }
        return false;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.C = false;
        this.D = -1;
        pp2 pp2 = this.A;
        if (pp2 != null) {
            this.z.removeCallbacks(pp2);
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
