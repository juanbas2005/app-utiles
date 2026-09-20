package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: cb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cb3 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ za0 a;

    public cb3(za0 za0) {
        this.a = za0;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        za0 za0 = this.a;
        de deVar = (de) za0.d;
        if (!za0.c) {
            int i = za0.b;
            int i2 = 2;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > 0.0f) {
                        i2 = 1;
                    }
                    ((lk2) deVar.y.getFocusOwner()).h(i2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                if (f2 > 0.0f) {
                    i2 = 1;
                }
                ((lk2) deVar.y.getFocusOwner()).h(i2, false);
            }
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }
}
