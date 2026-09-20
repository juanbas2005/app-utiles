package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: qk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qk implements Drawable.Callback {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ qk(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void invalidateDrawable(Drawable drawable) {
        long j;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((tk) obj).invalidateSelf();
                return;
            default:
                drawable.getClass();
                nz1 nz1 = (nz1) obj;
                ed5 ed5 = nz1.B;
                ed5.setValue(Integer.valueOf(((Number) ed5.getValue()).intValue() + 1));
                Drawable drawable2 = nz1.A;
                nz3 nz3 = oz1.a;
                if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
                    j = 9205357640488583168L;
                } else {
                    j = fb5.a((float) drawable2.getIntrinsicWidth(), (float) drawable2.getIntrinsicHeight());
                }
                nz1.C.setValue(new wu6(j));
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.w) {
            case b85.b:
                ((tk) this.x).scheduleSelf(runnable, j);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) oz1.a.getValue()).postAtTime(runnable, j);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.w) {
            case b85.b:
                ((tk) this.x).unscheduleSelf(runnable);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) oz1.a.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
