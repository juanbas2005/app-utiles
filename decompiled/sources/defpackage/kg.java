package defpackage;

import android.graphics.RectF;
import android.text.Layout;

/* renamed from: kg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kg implements Layout.TextInclusionStrategy {
    public final /* synthetic */ yg a;

    public /* synthetic */ kg(yg ygVar) {
        this.a = ygVar;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return ((Boolean) this.a.H(rectF, rectF2)).booleanValue();
    }
}
