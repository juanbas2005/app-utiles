package defpackage;

import android.text.TextPaint;

/* renamed from: zw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw2 extends h49 {
    public final CharSequence C;
    public final TextPaint D;

    public zw2(CharSequence charSequence, TextPaint textPaint) {
        this.C = charSequence;
        this.D = textPaint;
    }

    public final int H(int i) {
        CharSequence charSequence = this.C;
        return this.D.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    public final int J(int i) {
        CharSequence charSequence = this.C;
        return this.D.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
