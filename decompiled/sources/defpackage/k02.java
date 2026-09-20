package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: k02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k02 implements View.OnTouchListener {
    public final /* synthetic */ n02 w;

    public /* synthetic */ k02(n02 n02) {
        this.w = n02;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long uptimeMillis = SystemClock.uptimeMillis();
            n02 n02 = this.w;
            long j = uptimeMillis - n02.o;
            if (j < 0 || j > 300) {
                n02.m = false;
            }
            n02.t();
            n02.m = true;
            n02.o = SystemClock.uptimeMillis();
        }
        return false;
    }
}
