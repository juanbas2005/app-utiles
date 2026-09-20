package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: gl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gl2 extends MetricAffectingSpan {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ gl2(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }
}
