package defpackage;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: tl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tl0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ CarouselLayoutManager a;

    public /* synthetic */ tl0(CarouselLayoutManager carouselLayoutManager) {
        this.a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            view.post(new y0(8, this.a));
        }
    }
}
