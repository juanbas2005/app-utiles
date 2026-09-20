package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: eg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eg implements ComponentCallbacks2 {
    public final /* synthetic */ gg w;

    public eg(gg ggVar) {
        this.w = ggVar;
    }

    public final void onTrimMemory(int i) {
        if (i >= 40) {
            gg.d(this.w);
        }
    }

    public final void onLowMemory() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }
}
