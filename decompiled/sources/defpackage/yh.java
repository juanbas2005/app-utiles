package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: yh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yh implements un5, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long D;
    public final xh A = new Object();
    public boolean B;
    public long C;
    public final View w;
    public final PriorityQueue x = new PriorityQueue(11, new wh(0));
    public boolean y;
    public final Choreographer z = Choreographer.getInstance();

    /* JADX WARNING: type inference failed for: r0v2, types: [xh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0 >= 30.0f) goto L_0x0042;
     */
    public yh(View view) {
        float f;
        this.w = view;
        if (D == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            D = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.B = true;
        }
    }

    public final void a(tn5 tn5) {
        this.x.add(new wo5(1, tn5));
        if (!this.y) {
            this.y = true;
            this.w.post(this);
        }
    }

    public final boolean b() {
        xh xhVar = this.A;
        long a = xhVar.a();
        ag8.L(a, "compose:lazy:prefetch:available_time_nanos");
        boolean z2 = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.x;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((wo5) peek).b.c(xhVar)) {
                priorityQueue.poll();
                z2 = false;
            }
            xhVar.a = false;
        }
        return z2;
    }

    public final void doFrame(long j) {
        if (this.B) {
            this.C = j;
            this.w.post(this);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        this.B = true;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.B = false;
        this.w.removeCallbacks(this);
        this.z.removeFrameCallback(this);
    }

    public final void run() {
        boolean z2;
        PriorityQueue priorityQueue = this.x;
        if (!priorityQueue.isEmpty() && this.y && this.B) {
            View view = this.w;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * D) + nanos) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xh xhVar = this.A;
                xhVar.a = z2;
                xhVar.b = Math.max(this.C, nanos) + D;
                boolean z3 = false;
                while (!priorityQueue.isEmpty() && !z3) {
                    if (xhVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z3 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z3 = b();
                    }
                }
                if (z3) {
                    this.z.postFrameCallback(this);
                } else {
                    this.y = false;
                }
                ag8.L(0, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.y = false;
    }
}
