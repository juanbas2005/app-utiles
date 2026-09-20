package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: pp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pp2 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ qp2 x;

    public /* synthetic */ pp2(qp2 qp2, int i) {
        this.w = i;
        this.x = qp2;
    }

    public final void run() {
        int i = this.w;
        qp2 qp2 = this.x;
        switch (i) {
            case b85.b:
                ViewParent parent = qp2.z.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                qp2.a();
                View view = qp2.z;
                if (view.isEnabled() && !view.isLongClickable() && qp2.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    qp2.C = true;
                    return;
                }
                return;
        }
    }
}
