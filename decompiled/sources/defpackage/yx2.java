package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: yx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx2 extends View {
    public yx2(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        m21 m21 = (m21) getLayoutParams();
        m21.a = i;
        setLayoutParams(m21);
    }

    public void setGuidelineEnd(int i) {
        m21 m21 = (m21) getLayoutParams();
        m21.b = i;
        setLayoutParams(m21);
    }

    public void setGuidelinePercent(float f) {
        m21 m21 = (m21) getLayoutParams();
        m21.c = f;
        setLayoutParams(m21);
    }

    public final void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }
}
