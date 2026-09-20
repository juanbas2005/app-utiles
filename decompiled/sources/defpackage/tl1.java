package defpackage;

import android.text.TextPaint;

/* renamed from: tl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl1 {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public tl1() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
