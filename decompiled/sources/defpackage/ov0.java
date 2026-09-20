package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: ov0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ov0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long w = (SystemClock.uptimeMillis() + 10000);
    public Runnable x;
    public boolean y;
    public final /* synthetic */ rv0 z;

    public ov0(rv0 rv0) {
        this.z = rv0;
    }

    public final void a(View view) {
        if (!this.y) {
            this.y = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.x = runnable;
        View decorView = this.z.getWindow().getDecorView();
        decorView.getClass();
        if (!this.y) {
            decorView.postOnAnimation(new y0(10, this));
        } else if (sg3.e(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
            this.x = null;
            rr2 rr2 = (rr2) this.z.C.getValue();
            synchronized (rr2.a) {
                z2 = rr2.b;
            }
            if (z2) {
                this.y = false;
                this.z.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.w) {
            this.y = false;
            this.z.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.z.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
