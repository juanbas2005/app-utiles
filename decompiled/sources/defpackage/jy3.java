package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* renamed from: jy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy3 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public BoringLayout.Metrics f;
    public boolean g;
    public CharSequence h;

    public jy3(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metrics;
        if (!this.g) {
            TextDirectionHeuristic b2 = dg7.b(this.c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.b;
            if (i >= 33) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, b2, true, (BoringLayout.Metrics) null);
            } else if (!b2.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
            } else {
                metrics = null;
            }
            this.f = metrics;
            this.g = true;
        }
        return this.f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            CharSequence charSequence2 = this.a;
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence2;
                Class<CharacterStyle> cls = CharacterStyle.class;
                if (b85.l(spanned, cls)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), cls);
                    if (!(characterStyleArr == null || characterStyleArr.length == 0)) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence2);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence2 = spannableString;
                        }
                    }
                }
            }
            this.h = charSequence2;
            return charSequence2;
        }
        charSequence.getClass();
        return charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (defpackage.b85.l(r2, defpackage.y44.class) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r3.getLetterSpacing() == 0.0f) goto L_0x005d;
     */
    public final float c() {
        int i;
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics a2 = a();
        if (a2 != null) {
            i = a2.width;
        } else {
            i = -1;
        }
        float f2 = (float) i;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        TextPaint textPaint = this.b;
        if (i2 < 0) {
            f2 = (float) Math.ceil((double) Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f2 != 0.0f) {
            CharSequence charSequence = this.a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!b85.l(spanned, z44.class)) {
                }
                f2 += 0.5f;
            }
        }
        this.d = f2;
        return f2;
    }
}
