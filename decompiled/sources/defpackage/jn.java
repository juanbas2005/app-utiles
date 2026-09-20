package defpackage;

import android.text.SegmentFinder;

/* renamed from: jn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jn extends SegmentFinder {
    public final /* synthetic */ k68 a;

    public jn(k68 k68) {
        this.a = k68;
    }

    public final int nextEndBoundary(int i) {
        return this.a.f(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.e(i);
    }
}
