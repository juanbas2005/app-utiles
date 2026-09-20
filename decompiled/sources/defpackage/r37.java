package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: r37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r37 {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public boolean k;
    public TextUtils.TruncateAt l = null;
    public c9 m;

    public r37(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i2;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        int i2 = this.f;
        TextPaint textPaint = this.b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.j);
        if (this.k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f2 = this.g;
        if (!(f2 == 0.0f && this.h == 1.0f)) {
            obtain.setLineSpacing(f2, this.h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        c9 c9Var = this.m;
        if (c9Var != null) {
            obtain.setBreakStrategy(((TextInputLayout) c9Var.x).Q.getBreakStrategy());
        }
        return obtain.build();
    }
}
