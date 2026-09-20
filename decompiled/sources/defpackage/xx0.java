package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* renamed from: xx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xx0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ yx0 w;

    public xx0(yx0 yx0) {
        this.w = yx0;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.w.e(configuration);
    }

    public final void onLowMemory() {
        yx0 yx0 = this.w;
        yx0.g.a.clear();
        r56 r56 = yx0.h;
        synchronized (r56) {
            r56.a.c();
        }
    }

    public final void onTrimMemory(int i) {
        yx0 yx0 = this.w;
        yx0.g.a.clear();
        r56 r56 = yx0.h;
        synchronized (r56) {
            r56.a.c();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        this.w.t.c.setValue(Boolean.valueOf(z));
    }
}
