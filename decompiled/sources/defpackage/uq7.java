package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* renamed from: uq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uq7 extends ReplacementSpan {
    public TextPaint A;
    public final Paint.FontMetricsInt w = new Paint.FontMetricsInt();
    public final tq7 x;
    public short y = -1;
    public float z = 1.0f;

    public uq7(tq7 tq7) {
        k75.i("rasterizer cannot be null", tq7);
        this.x = tq7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.text.TextPaint} */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.graphics.Paint] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint2 = this.A;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.A = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        TextPaint textPaint3 = textPaint;
        if (!(textPaint3 == null || textPaint3.bgColor == 0)) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, (float) i3, f + ((float) this.y), (float) i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        w22.a().getClass();
        float f2 = (float) i4;
        if (textPaint3 == null) {
            textPaint3 = paint2;
        }
        tq7 tq7 = this.x;
        am6 am6 = tq7.b;
        Typeface typeface = textPaint3.getTypeface();
        textPaint3.setTypeface((Typeface) am6.A);
        canvas.drawText((char[]) am6.y, tq7.a * 2, 2, f, f2, textPaint3);
        textPaint3.setTypeface(typeface);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.w;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        tq7 tq7 = this.x;
        ok4 b = tq7.b();
        int a = b.a(14);
        short s2 = 0;
        if (a != 0) {
            s = ((ByteBuffer) b.z).getShort(a + b.w);
        } else {
            s = 0;
        }
        this.z = abs / ((float) s);
        ok4 b2 = tq7.b();
        int a2 = b2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) b2.z).getShort(a2 + b2.w);
        }
        ok4 b3 = tq7.b();
        int a3 = b3.a(12);
        if (a3 != 0) {
            s2 = ((ByteBuffer) b3.z).getShort(a3 + b3.w);
        }
        short s3 = (short) ((int) (((float) s2) * this.z));
        this.y = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
