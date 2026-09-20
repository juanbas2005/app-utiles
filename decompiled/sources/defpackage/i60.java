package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: i60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i60 extends MetricAffectingSpan {
    public final /* synthetic */ int w;
    public final float x;

    public /* synthetic */ i60(int i, float f) {
        this.w = i;
        this.x = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i = this.w;
        float f = this.x;
        switch (i) {
            case b85.b:
                textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * f)));
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                return;
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.w;
        float f = this.x;
        switch (i) {
            case b85.b:
                textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * f)));
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                return;
        }
    }
}
