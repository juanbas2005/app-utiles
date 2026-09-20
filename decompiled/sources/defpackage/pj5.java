package defpackage;

import android.widget.Magnifier;

/* renamed from: pj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pj5 extends nj5 {
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        int i = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        Magnifier magnifier = this.a;
        if (i != 0) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
