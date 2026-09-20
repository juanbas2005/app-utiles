package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vl0 extends vy5 {
    public final Paint a;
    public final List b = Collections.unmodifiableList(new ArrayList());

    public vl0() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (it3 it3 : this.b) {
            it3.getClass();
            ThreadLocal threadLocal = yt0.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.e(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.b(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
