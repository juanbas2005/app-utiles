package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: xd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xd7 {
    public final TextPaint a = new TextPaint(1);
    public final hp0 b = new hp0(1, this);
    public float c;
    public boolean d = true;
    public final WeakReference e = new WeakReference((Object) null);
    public sc7 f;

    public xd7(lp0 lp0) {
        this.e = new WeakReference(lp0);
    }

    public final float a(String str) {
        float f2;
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = textPaint.measureText(str, 0, str.length());
        }
        this.c = f2;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
