package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: oq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oq6 extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public oq6(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
