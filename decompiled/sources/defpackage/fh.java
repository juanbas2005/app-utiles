package defpackage;

import android.graphics.PathMeasure;

/* renamed from: fh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fh {
    public final PathMeasure a;

    public fh(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, eh ehVar) {
        if (ehVar != null) {
            this.a.getSegment(f, f2, ehVar.a, true);
            return;
        }
        kj6.n("Unable to obtain android.graphics.Path");
    }
}
