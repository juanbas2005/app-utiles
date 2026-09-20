package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: sd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sd7 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public sd7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
