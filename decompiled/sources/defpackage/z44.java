package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: z44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z44 extends MetricAffectingSpan {
    public final float w;

    public z44(float f) {
        this.w = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX != 0.0f) {
            textPaint.setLetterSpacing(this.w / textScaleX);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX != 0.0f) {
            textPaint.setLetterSpacing(this.w / textScaleX);
        }
    }
}
