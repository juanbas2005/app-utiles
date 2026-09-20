package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: yg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yg6 implements zg6 {
    public final ScrollFeedbackProvider w;

    public yg6(NestedScrollView nestedScrollView) {
        this.w = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.w.onScrollLimit(i, i2, i3, z);
    }

    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.w.onScrollProgress(i, i2, i3, i4);
    }
}
