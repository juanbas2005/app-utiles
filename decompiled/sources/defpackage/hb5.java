package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: hb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb5 extends w64 {
    public final /* synthetic */ ib5 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb5(ib5 ib5, Context context) {
        super(context);
        this.q = ib5;
    }

    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    public final void h(View view, gz5 gz5) {
        ib5 ib5 = this.q;
        int[] a = ib5.a(ib5.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (ceil > 0) {
            gz5.a = i;
            gz5.b = i2;
            gz5.c = ceil;
            gz5.e = this.j;
            gz5.f = true;
        }
    }
}
