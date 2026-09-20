package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: ul0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ul0 extends w64 {
    public final /* synthetic */ int q = 1;

    public /* synthetic */ ul0(Context context) {
        super(context);
    }

    public int b(View view, int i) {
        switch (this.q) {
            case b85.b:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    public int c(View view, int i) {
        switch (this.q) {
            case b85.b:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public PointF f(int i) {
        switch (this.q) {
            case b85.b:
                return null;
            default:
                return super.f(i);
        }
    }

    public ul0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
