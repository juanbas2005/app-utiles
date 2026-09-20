package defpackage;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: jz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jz1 extends CharacterStyle implements UpdateAppearance {
    public final iz1 w;

    public jz1(iz1 iz1) {
        this.w = iz1;
    }

    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            rd2 rd2 = rd2.a;
            iz1 iz1 = this.w;
            if (sg3.e(iz1, rd2)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (iz1 instanceof l57) {
                textPaint.setStyle(Paint.Style.STROKE);
                l57 l57 = (l57) iz1;
                textPaint.setStrokeWidth(l57.a);
                textPaint.setStrokeMiter(l57.b);
                int i = l57.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = l57.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect((PathEffect) null);
            } else {
                h.c();
            }
        }
    }
}
