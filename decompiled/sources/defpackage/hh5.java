package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: hh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hh5 extends ReplacementSpan {
    public Paint.FontMetricsInt w;
    public int x;
    public int y;
    public boolean z;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.w;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        sg3.a0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.z) {
            zb3.b("PlaceholderSpan is not laid out yet.");
        }
        return this.y;
    }

    public final int c() {
        if (!this.z) {
            zb3.b("PlaceholderSpan is not laid out yet.");
        }
        return this.x;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.z = true;
        paint.getTextSize();
        this.w = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            zb3.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.x = (int) ((float) Math.ceil(0.0d));
        this.y = (int) ((float) Math.ceil(0.0d));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
