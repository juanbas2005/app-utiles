package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm5 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler w = new Handler(Looper.getMainLooper());
    public final AtomicReference x;
    public final tq y;
    public final tq z;

    public lm5(View view, tq tqVar, tq tqVar2) {
        this.x = new AtomicReference(view);
        this.y = tqVar;
        this.z = tqVar2;
    }

    public final boolean onPreDraw() {
        View view = (View) this.x.getAndSet((Object) null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        tq tqVar = this.y;
        Handler handler = this.w;
        handler.post(tqVar);
        handler.postAtFrontOfQueue(this.z);
        return true;
    }
}
