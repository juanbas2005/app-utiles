package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: i64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i64 implements LineHeightSpan {
    public final float w;

    public i64(float f) {
        this.w = f;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.w));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) i5))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
