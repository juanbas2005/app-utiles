package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: y44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y44 extends MetricAffectingSpan {
    public final float w;

    public y44(float f) {
        this.w = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.w);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.w);
    }
}
